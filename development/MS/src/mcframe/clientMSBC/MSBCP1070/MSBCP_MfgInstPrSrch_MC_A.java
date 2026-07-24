package mcframe.clientMSBC.MSBCP1070;

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
import mcframe.clientMSBC.MSBCP1070.MSBCP_MfgInstPrSrch_MC.MS_MSBCL1070_Srch01Caller;

/**
 * 画面"MSBCP_MfgInstPrSrch"パネルクラスです。<p>
 *
 * 製造指図進捗状況の一覧照会画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_MfgInstPrSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP1070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [DispUnit1]ブロック関連のField定義
	public MCPanel DispUnit1Panel = null;
	public MCTitledBorder DispUnit1TitledBorder = null;
	// [DispUnit1]ブロックの項目のField定義
	// [DispUnit2]ブロック関連のField定義
	public MCPanel DispUnit2Panel = null;
	public MCTitledBorder DispUnit2TitledBorder = null;
	// [DispUnit2]ブロックの項目のField定義
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
	// [UnschdActSrchCnd]ブロック関連のField定義
	public MCPanel UnschdActSrchCndPanel = null;
	public MCTitledBorder UnschdActSrchCndTitledBorder = null;
	// [UnschdActSrchCnd]ブロックの項目のField定義
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
	 * HDR,Header,HDR;OPER,Operation,OPER;YIELD,Output,YIELD HDR,ヘッダ,HDR;OPER,工程,OPER;YIELD,出来高,YIELD.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit1_Group = null;
	public MCRadioButton Cnd_disp_unit1_HDR = null;
	public MCRadioButton Cnd_disp_unit1_OPER = null;
	public MCRadioButton Cnd_disp_unit1_YIELD = null;
	/**
	 * INST,Order,INST;ACT,Result,ACT INST,指図,INST;ACT,実績,ACT.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit2_Group = null;
	public MCRadioButton Cnd_disp_unit2_INST = null;
	public MCRadioButton Cnd_disp_unit2_ACT = null;
	/**
	 * Save order 指図保存.<p>
	 *
	 */
	public MCCheckBox Cnd_tmp_sts_sav_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_tmp_sts_ord_flg = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_tmp_sts_stt_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_tmp_sts_cmpl_flg = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCCheckBox Cnd_not_unschd_act_flg = null;
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public MCCheckBox Cnd_unschd_act_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_st_schd_dt_p_PPanel;
	public MCDateField Cnd_st_schd_dt_fr;	// [Cnd]の[st_schd_dt_p.ymd_fr]を[Cnd_st_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_schd_hm_fr;	// [Cnd]の[st_schd_dt_p.hm_fr]を[Cnd_st_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_st_schd_dt_to;	// [Cnd]の[st_schd_dt_p.ymd_to]を[Cnd_st_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_st_schd_hm_to;	// [Cnd]の[st_schd_dt_p.hm_to]を[Cnd_st_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_end_schd_dt_p_PPanel;
	public MCDateField Cnd_end_schd_dt_fr;	// [Cnd]の[end_schd_dt_p.ymd_fr]を[Cnd_end_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_schd_hm_fr;	// [Cnd]の[end_schd_dt_p.hm_fr]を[Cnd_end_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_end_schd_dt_to;	// [Cnd]の[end_schd_dt_p.ymd_to]を[Cnd_end_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_schd_hm_to;	// [Cnd]の[end_schd_dt_p.hm_to]を[Cnd_end_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_st_act_dt_p_PPanel;
	public MCDateField Cnd_st_act_dt_fr;	// [Cnd]の[st_act_dt_p.ymd_fr]を[Cnd_st_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_act_hm_fr;	// [Cnd]の[st_act_dt_p.hm_fr]を[Cnd_st_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_st_act_dt_to;	// [Cnd]の[st_act_dt_p.ymd_to]を[Cnd_st_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_st_act_hm_to;	// [Cnd]の[st_act_dt_p.hm_to]を[Cnd_st_act_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_end_act_dt_p_PPanel;
	public MCDateField Cnd_end_act_dt_fr;	// [Cnd]の[end_act_dt_p.ymd_fr]を[Cnd_end_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_act_hm_fr;	// [Cnd]の[end_act_dt_p.hm_fr]を[Cnd_end_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_end_act_dt_to;	// [Cnd]の[end_act_dt_p.ymd_to]を[Cnd_end_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_act_hm_to;	// [Cnd]の[end_act_dt_p.hm_to]を[Cnd_end_act_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_yield_schd_dt_p_PPanel;
	public MCDateField Cnd_yield_schd_dt_fr;	// [Cnd]の[yield_schd_dt_p.ymd_fr]を[Cnd_yield_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_yield_schd_hm_fr;	// [Cnd]の[yield_schd_dt_p.hm_fr]を[Cnd_yield_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_yield_schd_dt_to;	// [Cnd]の[yield_schd_dt_p.ymd_to]を[Cnd_yield_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_yield_schd_hm_to;	// [Cnd]の[yield_schd_dt_p.hm_to]を[Cnd_yield_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_yield_act_dt_p_PPanel;
	public MCDateField Cnd_yield_act_dt_fr;	// [Cnd]の[yield_act_dt_p.ymd_fr]を[Cnd_yield_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_yield_act_hm_fr;	// [Cnd]の[yield_act_dt_p.hm_fr]を[Cnd_yield_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_yield_act_dt_to;	// [Cnd]の[yield_act_dt_p.ymd_to]を[Cnd_yield_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_yield_act_hm_to;	// [Cnd]の[yield_act_dt_p.hm_to]を[Cnd_yield_act_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_rqst_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_rqst_dlv_rqst_dt_fr;	// [Cnd]の[rqst_dlv_rqst_dt_p.ymd_fr]を[Cnd_rqst_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_hm_fr;	// [Cnd]の[rqst_dlv_rqst_dt_p.hm_fr]を[Cnd_rqst_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_dt_to;	// [Cnd]の[rqst_dlv_rqst_dt_p.ymd_to]を[Cnd_rqst_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_hm_to;	// [Cnd]の[rqst_dlv_rqst_dt_p.hm_to]を[Cnd_rqst_dlv_rqst_hm_to]としてエイリアス定義。
	public MCLabel Cnd_inst_dt_fr_Label = null;
	/**
	 * Order date FROM 指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_inst_dt_fr = null;
	public MCLabel Cnd_inst_dt_to_Label = null;
	/**
	 * Order date TO 指図日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_inst_dt_to = null;
	public MCLabel Cnd_aprv_dt_fr_Label = null;
	/**
	 * Approval date FROM 承認日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_dt_fr = null;
	public MCLabel Cnd_aprv_dt_to_Label = null;
	/**
	 * Approval date TO 承認日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_aprv_dt_to = null;
	public MCLabel Cnd_st_ac_dt_fr_Label = null;
	/**
	 * Start recording date FROM 着手計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_st_ac_dt_fr = null;
	public MCLabel Cnd_st_ac_dt_to_Label = null;
	/**
	 * Start recording date TO 着手計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_st_ac_dt_to = null;
	public MCLabel Cnd_end_ac_dt_fr_Label = null;
	/**
	 * End recording date FROM 終了計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_end_ac_dt_fr = null;
	public MCLabel Cnd_end_ac_dt_to_Label = null;
	/**
	 * End recording date TO 終了計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_end_ac_dt_to = null;
	public MCLabel Cnd_yield_ac_dt_fr_Label = null;
	/**
	 * Output recording date FROM 出来高計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_yield_ac_dt_fr = null;
	public MCLabel Cnd_yield_ac_dt_to_Label = null;
	/**
	 * Output recording date TO 出来高計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_yield_ac_dt_to = null;
	public MCLabel Cnd_upd_ts_fr_Label = null;
	/**
	 * Update date and time FROM 更新日時ＦＲＯＭ.<p>
	 *
	 */
	public MCTimestampField Cnd_upd_ts_fr = null;
	public MCLabel Cnd_upd_ts_to_Label = null;
	/**
	 * Update date and time TO 更新日時ＴＯ.<p>
	 *
	 */
	public MCTimestampField Cnd_upd_ts_to = null;
	public MCLabel Cnd_pr_rate_fr_Label = null;
	/**
	 * Progress rate (Equal or more) 進捗率（以上）.<p>
	 *
	 */
	public MCNumberField Cnd_pr_rate_fr = null;
	public MCLabel Cnd_pr_rate_to_Label = null;
	/**
	 * Progress rate (Equal or less) 進捗率（以下）.<p>
	 *
	 */
	public MCNumberField Cnd_pr_rate_to = null;
	public MCLabel Cnd_mfg_mtd_typ_Label = null;
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_mtd_typ = null;
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_mtd_typ_nm = null;
	public MCLabel Cnd_mfg_loc_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_site_nm = null;
	public MCLabel Cnd_mfg_loc_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_wg_nm = null;
	public MCLabel Cnd_mfg_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_grp_nm = null;
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
	public MCLabel Cnd_mfg_str_ln_cd_Label = null;
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_str_ln_nm = null;
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
	public MCLabel Cnd_strg_str_ln_cd_Label = null;
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_str_ln_cd = null;
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_strg_str_ln_nm = null;
	public MCLabel Cnd_oper_loc_cd_Label = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_oper_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCTextField Cnd_oper_loc_nm = null;
	public MCLabel Cnd_oper_str_ln_cd_Label = null;
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_str_ln_cd = null;
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_oper_str_ln_nm = null;
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
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public MCCheckBox Cnd_abort_flg = null;
	/**
	 * Only mfg. order including output recording operation 出来高計上工程含む製造指図のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_yield_oper_flg = null;
	public MCLabel Cnd_mfg_aprv_sts_typ_Label = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_aprv_sts_typ_nm = null;
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
	public MCTextComboBox Cnd_sublot_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_inst_usr_cd_Label = null;
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_inst_usr_cd = null;
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public MCTextField Cnd_inst_usr_nm = null;
	public MCLabel Cnd_inst_dpt_cd_Label = null;
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_inst_dpt_cd = null;
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public MCTextField Cnd_inst_dpt_nm = null;
	public MCLabel Cnd_act_usr_cd_Label = null;
	/**
	 * Result management PIC cd. 実績責任者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_cd = null;
	/**
	 * Result PIC name 実績責任者名.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_nm = null;
	public MCLabel Cnd_act_dpt_cd_Label = null;
	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_act_dpt_cd = null;
	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_nm = null;
	public MCLabel Cnd_oper_usr_cd_Label = null;
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_oper_usr_cd = null;
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public MCTextField Cnd_oper_usr_nm = null;
	public MCLabel Cnd_oper_rsrc_Label = null;
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public MCTextField Cnd_oper_rsrc = null;
	public MCLabel Cnd_aprv_usr_cd_Label = null;
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_cd = null;
	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_usr_nm = null;
	public MCLabel Cnd_aprv_dpt_cd_Label = null;
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_aprv_dpt_cd = null;
	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_dpt_nm = null;
	public MCLabel Cnd_mfg_inst_unit_typ_Label = null;
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_inst_unit_typ = null;
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_unit_typ_nm = null;
	public MCLabel Cnd_po_aprv_sts_typ_Label = null;
	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_po_aprv_sts_typ = null;
	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_po_aprv_sts_typ_nm = null;
	public MCLabel Cnd_yield_typ_Label = null;
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_yield_typ = null;
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public MCTextField Cnd_yield_typ_nm = null;
	public MCLabel Cnd_yield_rsn_cd_Label = null;
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_yield_rsn_cd = null;
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public MCTextField Cnd_yield_rsn_nm = null;
	public MCLabel Cnd_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField Cnd_gd_nm = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_oper_ord_no_Label = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_ord_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public MCLabel Cnd_mfg_act_no_Label = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_no = null;
	public MCLabel Cnd_oper_inst_no_Label = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_inst_no = null;
	public MCLabel Cnd_oper_act_no_Label = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_oper_act_no = null;
	public MCLabel Cnd_yield_schd_no_Label = null;
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_no = null;
	public MCLabel Cnd_yield_act_no_Label = null;
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_yield_act_no = null;
	public MCLabel Cnd_inst_rpt_rmrks_Label = null;
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public MCTextField Cnd_inst_rpt_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_inst_po_cnt_rmrks_Label = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_inst_po_cnt_rmrks = null;
	public MCLabel Cnd_oper_inst_rpt_rmrks_Label = null;
	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public MCTextField Cnd_oper_inst_rpt_rmrks = null;
	public MCLabel Cnd_oper_intr_rmrks_Label = null;
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public MCTextField Cnd_oper_intr_rmrks = null;
	public MCLabel Cnd_yield_schd_intr_rmrks_Label = null;
	/**
	 * Output schedule internal remarks 出来高予定内部備考.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_intr_rmrks = null;
	public MCLabel Cnd_yield_schd_rpt_rmrks_Label = null;
	/**
	 * Output schedule order sheet remarks 出来高予定指図書備考.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_rpt_rmrks = null;
	public MCLabel Cnd_insp_cnt_rmrks_Label = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_insp_cnt_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	public MCLabel Cnd_itm_mfg_inst_sub_char1_Label = null;
	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_sub_char1 = null;
	public MCLabel Cnd_itm_mfg_inst_sub_char2_Label = null;
	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_sub_char2 = null;
	public MCLabel Cnd_itm_mfg_inst_sub_char3_Label = null;
	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_sub_char3 = null;
	public MCLabel Cnd_mfg_inst_sub_char1_Label = null;
	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_sub_char1 = null;
	public MCLabel Cnd_mfg_inst_sub_char2_Label = null;
	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_sub_char2 = null;
	public MCLabel Cnd_mfg_inst_sub_char3_Label = null;
	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_sub_char3 = null;
	public MCLabel Cnd_yield_schd_sub_char1_Label = null;
	/**
	 * Output schedule spare 1 出来高予定予備１.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_sub_char1 = null;
	public MCLabel Cnd_yield_schd_sub_char2_Label = null;
	/**
	 * Output schedule spare 2 出来高予定予備２.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_sub_char2 = null;
	public MCLabel Cnd_yield_schd_sub_char3_Label = null;
	/**
	 * Output schedule spare 3 出来高予定予備３.<p>
	 *
	 */
	public MCTextField Cnd_yield_schd_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCLabel Cnd_itm_grp_lab1;	// [Cnd]の[itm_grp_p.itm_grp_lab1]を[Cnd_itm_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab2;	// [Cnd]の[itm_grp_p.itm_grp_lab2]を[Cnd_itm_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab3;	// [Cnd]の[itm_grp_p.itm_grp_lab3]を[Cnd_itm_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab4;	// [Cnd]の[itm_grp_p.itm_grp_lab4]を[Cnd_itm_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab5;	// [Cnd]の[itm_grp_p.itm_grp_lab5]を[Cnd_itm_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab6;	// [Cnd]の[itm_grp_p.itm_grp_lab6]を[Cnd_itm_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab7;	// [Cnd]の[itm_grp_p.itm_grp_lab7]を[Cnd_itm_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab8;	// [Cnd]の[itm_grp_p.itm_grp_lab8]を[Cnd_itm_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab9;	// [Cnd]の[itm_grp_p.itm_grp_lab9]を[Cnd_itm_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_itm_grp_lab10;	// [Cnd]の[itm_grp_p.itm_grp_lab10]を[Cnd_itm_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_sppl_grp_p_PPanel;
	public MCLabel Cnd_sppl_grp_lab1;	// [Cnd]の[sppl_grp_p.bp_grp_lab1]を[Cnd_sppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg1;	// [Cnd]の[sppl_grp_p.bp_grp_flg1]を[Cnd_sppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd1;	// [Cnd]の[sppl_grp_p.bp_grp_cd1]を[Cnd_sppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm1;	// [Cnd]の[sppl_grp_p.bp_grp_nm1]を[Cnd_sppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab2;	// [Cnd]の[sppl_grp_p.bp_grp_lab2]を[Cnd_sppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg2;	// [Cnd]の[sppl_grp_p.bp_grp_flg2]を[Cnd_sppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd2;	// [Cnd]の[sppl_grp_p.bp_grp_cd2]を[Cnd_sppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm2;	// [Cnd]の[sppl_grp_p.bp_grp_nm2]を[Cnd_sppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab3;	// [Cnd]の[sppl_grp_p.bp_grp_lab3]を[Cnd_sppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg3;	// [Cnd]の[sppl_grp_p.bp_grp_flg3]を[Cnd_sppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd3;	// [Cnd]の[sppl_grp_p.bp_grp_cd3]を[Cnd_sppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm3;	// [Cnd]の[sppl_grp_p.bp_grp_nm3]を[Cnd_sppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab4;	// [Cnd]の[sppl_grp_p.bp_grp_lab4]を[Cnd_sppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg4;	// [Cnd]の[sppl_grp_p.bp_grp_flg4]を[Cnd_sppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd4;	// [Cnd]の[sppl_grp_p.bp_grp_cd4]を[Cnd_sppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm4;	// [Cnd]の[sppl_grp_p.bp_grp_nm4]を[Cnd_sppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab5;	// [Cnd]の[sppl_grp_p.bp_grp_lab5]を[Cnd_sppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg5;	// [Cnd]の[sppl_grp_p.bp_grp_flg5]を[Cnd_sppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd5;	// [Cnd]の[sppl_grp_p.bp_grp_cd5]を[Cnd_sppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm5;	// [Cnd]の[sppl_grp_p.bp_grp_nm5]を[Cnd_sppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab6;	// [Cnd]の[sppl_grp_p.bp_grp_lab6]を[Cnd_sppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg6;	// [Cnd]の[sppl_grp_p.bp_grp_flg6]を[Cnd_sppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd6;	// [Cnd]の[sppl_grp_p.bp_grp_cd6]を[Cnd_sppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm6;	// [Cnd]の[sppl_grp_p.bp_grp_nm6]を[Cnd_sppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab7;	// [Cnd]の[sppl_grp_p.bp_grp_lab7]を[Cnd_sppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg7;	// [Cnd]の[sppl_grp_p.bp_grp_flg7]を[Cnd_sppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd7;	// [Cnd]の[sppl_grp_p.bp_grp_cd7]を[Cnd_sppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm7;	// [Cnd]の[sppl_grp_p.bp_grp_nm7]を[Cnd_sppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab8;	// [Cnd]の[sppl_grp_p.bp_grp_lab8]を[Cnd_sppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg8;	// [Cnd]の[sppl_grp_p.bp_grp_flg8]を[Cnd_sppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd8;	// [Cnd]の[sppl_grp_p.bp_grp_cd8]を[Cnd_sppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm8;	// [Cnd]の[sppl_grp_p.bp_grp_nm8]を[Cnd_sppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab9;	// [Cnd]の[sppl_grp_p.bp_grp_lab9]を[Cnd_sppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg9;	// [Cnd]の[sppl_grp_p.bp_grp_flg9]を[Cnd_sppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd9;	// [Cnd]の[sppl_grp_p.bp_grp_cd9]を[Cnd_sppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm9;	// [Cnd]の[sppl_grp_p.bp_grp_nm9]を[Cnd_sppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_sppl_grp_lab10;	// [Cnd]の[sppl_grp_p.bp_grp_lab10]を[Cnd_sppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_sppl_grp_flg10;	// [Cnd]の[sppl_grp_p.bp_grp_flg10]を[Cnd_sppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_sppl_grp_cd10;	// [Cnd]の[sppl_grp_p.bp_grp_cd10]を[Cnd_sppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_sppl_grp_nm10;	// [Cnd]の[sppl_grp_p.bp_grp_nm10]を[Cnd_sppl_grp_nm10]としてエイリアス定義。
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [SpplGrp]ブロック関連のField定義
	public MCPanel SpplGrpPanel = null;
	// [SpplGrp]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP1070.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mtd_typ = null;
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_mtd_typ_nm = null;
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_sts_typ = null;
	/**
	 * Mfg. status name 製造状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd = null;
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_nm = null;
	/**
	 * Without mfg. location rack/line 製造場所棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_str_ln_cd_none_flg = null;
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
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
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_str_ln_cd = null;
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_str_ln_nm = null;
	/**
	 * Without storage location rack/line 格納場所棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_str_ln_cd_none_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_inst_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_base_unit_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_yield_schd_qty;// [Rslt]の[yield_schd_qty_p.qty]を[columnRslt_base_unit_yield_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_mfg_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_mfg_qty;// [Rslt]の[base_unit_mfg_qty_p.qty]を[columnRslt_base_unit_mfg_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_mfg_rem_st_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_mfg_rem_st_qty;// [Rslt]の[base_unit_mfg_rem_st_qty_p.qty]を[columnRslt_base_unit_mfg_rem_st_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_mfg_rem_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_mfg_rem_qty;// [Rslt]の[base_unit_mfg_rem_qty_p.qty]を[columnRslt_base_unit_mfg_rem_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_mfg_abort_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_mfg_abort_qty;// [Rslt]の[base_unit_mfg_abort_qty_p.qty]を[columnRslt_base_unit_mfg_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_yield_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_yield_qty;// [Rslt]の[base_unit_yield_qty_p.qty]を[columnRslt_base_unit_yield_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_dfct_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_dfct_qty;// [Rslt]の[base_unit_dfct_qty_p.qty]を[columnRslt_base_unit_dfct_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_ord_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_ord_qty;// [Rslt]の[ord_qty_p.qty]を[columnRslt_base_unit_ord_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_not_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_not_inst_qty;// [Rslt]の[not_inst_qty_p.qty]を[columnRslt_base_unit_not_inst_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_std_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_std_qty;// [Rslt]の[oper_std_qty_p.qty]を[columnRslt_oper_std_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_qty;// [Rslt]の[oper_unit_qty_p.qty]を[columnRslt_oper_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_act_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_act_qty;// [Rslt]の[oper_unit_act_qty_p.qty]を[columnRslt_oper_unit_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_schd_qty;// [Rslt]の[oper_unit_schd_qty_p.qty]を[columnRslt_oper_unit_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_oper_unit_rem_qty_p_PPanel;
	public MCColumnConfig columnRslt_oper_unit_rem_qty;// [Rslt]の[oper_unit_rem_qty_p.qty]を[columnRslt_oper_unit_rem_qty]としてエイリアス定義。
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_cd = null;
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_nm = null;
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_yield_schd_qty;// [Rslt]の[trd_unit_yield_schd_qty_p.qty]を[columnRslt_trd_unit_yield_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_yield_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_yield_qty;// [Rslt]の[trd_unit_yield_qty_p.qty]を[columnRslt_trd_unit_yield_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_dfct_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_dfct_qty;// [Rslt]の[trd_unit_dfct_qty_p.qty]を[columnRslt_trd_unit_dfct_qty]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_rate = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dlv_rqst_hm = null;
	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_schd_dt = null;
	/**
	 * Schedule start time 着手予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_schd_hm = null;
	/**
	 * Scheduled start date (Plan) 着手予定日（計画）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_st_schd_dt = null;
	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_act_dt = null;
	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_act_hm = null;
	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_ac_dt = null;
	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_schd_dt = null;
	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_schd_hm = null;
	/**
	 * Scheduled end date (Plan) 終了予定日（計画）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_end_schd_dt = null;
	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_act_dt = null;
	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_act_hm = null;
	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_ac_dt = null;
	/**
	 * Scheduled output date 出来高予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_dt = null;
	/**
	 * Output schedule time 出来高予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_hm = null;
	/**
	 * Actual output date 出来高実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_act_dt = null;
	/**
	 * Actual output time 出来高実績時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_act_hm = null;
	/**
	 * Output recording date 出来高計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_ac_dt = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
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
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_loc_nm = null;
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_cd = null;
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_nm = null;
	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_str_ln_cd_none_flg = null;
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_lower_yield = null;
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_std_yield = null;
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_upper_yield = null;
	/**
	 * WIP progress 仕掛進捗度.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wip_rate = null;
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_rsrc = null;
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dt = null;
	/**
	 * Order PIC cd. 指図担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_usr_cd = null;
	/**
	 * Order PIC name 指図担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_usr_nm = null;
	/**
	 * Order dept. cd. 指図部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dpt_cd = null;
	/**
	 * Order dept. name 指図部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_dpt_nm = null;
	/**
	 * Order sheet remarks 指図書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_rpt_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_intr_rmrks = null;
	/**
	 * Operation order sheet remarks 工程指図書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_rpt_rmrks = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_po_cnt_rmrks = null;
	/**
	 * Display expiration for print 印字用表示期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_pd = null;
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_lower_yield = null;
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_std_yield = null;
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_upper_yield = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_rev = null;
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_div_seq = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_no = null;
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_abort_flg = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_tgt_flg = null;
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_dt = null;
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_tm = null;
	/**
	 * Approver cd. 承認者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_usr_cd = null;
	/**
	 * Approver name 承認者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_usr_nm = null;
	/**
	 * Approval dept. cd. 承認部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_dpt_cd = null;
	/**
	 * Approval dept. name 承認部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_dpt_nm = null;
	/**
	 * Approval reason 承認理由.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_rsn = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ord_no = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_no = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_no = null;
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_unit_typ = null;
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_unit_typ_nm = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnRslt_outsrc_flg = null;
	/**
	 * Plan changed 計画変更.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_chg_flg = null;
	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unschd_inst_flg = null;
	/**
	 * Unplanned result 計画外実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unschd_act_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_site_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_nm = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * PO approval status type 発注承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_aprv_sts_typ = null;
	/**
	 * PO approval status type name 発注承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_aprv_sts_typ_nm = null;
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_oper_flg = null;
	/**
	 * Output operation ratio 出来高工程比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_oper_ratio = null;
	/**
	 * Operation order group 工程指図グループ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_grp = null;
	/**
	 * Output schedule No. 出来高予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_no = null;
	/**
	 * Output result No. 出来高実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_act_no = null;
	/**
	 * Output progress 出来高進捗度.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_rate = null;
	/**
	 * Output type 出来高区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_typ = null;
	/**
	 * Output type name 出来高区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_typ_nm = null;
	/**
	 * Output reason cd. 出来高理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_rsn_cd = null;
	/**
	 * Output reason name 出来高理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_rsn_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
	/**
	 * MRO supply 非在庫.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_stk_flg = null;
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_sts_typ = null;
	/**
	 * Inspection status name 検査状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_sts_typ_nm = null;
	/**
	 * Output schedule internal remarks 出来高予定内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_intr_rmrks = null;
	/**
	 * Output schedule order sheet remarks 出来高予定指図書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_rpt_rmrks = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_cnt_rmrks = null;
	/**
	 * Item spare 1 品目予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_sub_char1 = null;
	/**
	 * Item spare 2 品目予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_sub_char2 = null;
	/**
	 * Item spare 3 品目予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_sub_char3 = null;
	/**
	 * Mfg. spare 1 製造予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_sub_char1 = null;
	/**
	 * Mfg. spare 2 製造予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_sub_char2 = null;
	/**
	 * Mfg. spare 3 製造予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_sub_char3 = null;
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Output schedule spare 1 出来高予定予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_sub_char1 = null;
	/**
	 * Output schedule spare 2 出来高予定予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_sub_char2 = null;
	/**
	 * Output schedule spare 3 出来高予定予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_yield_schd_sub_char3 = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_sppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_sppl_grp_cd1;// [Rslt]の[sppl_grp_p.bp_grp_cd1]を[columnRslt_sppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm1;// [Rslt]の[sppl_grp_p.bp_grp_nm1]を[columnRslt_sppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd2;// [Rslt]の[sppl_grp_p.bp_grp_cd2]を[columnRslt_sppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm2;// [Rslt]の[sppl_grp_p.bp_grp_nm2]を[columnRslt_sppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd3;// [Rslt]の[sppl_grp_p.bp_grp_cd3]を[columnRslt_sppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm3;// [Rslt]の[sppl_grp_p.bp_grp_nm3]を[columnRslt_sppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd4;// [Rslt]の[sppl_grp_p.bp_grp_cd4]を[columnRslt_sppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm4;// [Rslt]の[sppl_grp_p.bp_grp_nm4]を[columnRslt_sppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd5;// [Rslt]の[sppl_grp_p.bp_grp_cd5]を[columnRslt_sppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm5;// [Rslt]の[sppl_grp_p.bp_grp_nm5]を[columnRslt_sppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd6;// [Rslt]の[sppl_grp_p.bp_grp_cd6]を[columnRslt_sppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm6;// [Rslt]の[sppl_grp_p.bp_grp_nm6]を[columnRslt_sppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd7;// [Rslt]の[sppl_grp_p.bp_grp_cd7]を[columnRslt_sppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm7;// [Rslt]の[sppl_grp_p.bp_grp_nm7]を[columnRslt_sppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd8;// [Rslt]の[sppl_grp_p.bp_grp_cd8]を[columnRslt_sppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm8;// [Rslt]の[sppl_grp_p.bp_grp_nm8]を[columnRslt_sppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd9;// [Rslt]の[sppl_grp_p.bp_grp_cd9]を[columnRslt_sppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm9;// [Rslt]の[sppl_grp_p.bp_grp_nm9]を[columnRslt_sppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_cd10;// [Rslt]の[sppl_grp_p.bp_grp_cd10]を[columnRslt_sppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_sppl_grp_nm10;// [Rslt]の[sppl_grp_p.bp_grp_nm10]を[columnRslt_sppl_grp_nm10]としてエイリアス定義。
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Mfg. order entry 製造指図登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1010 = null;
	/**
	 * Mfg. result entry 製造実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP1100 = null;
	/** [SRCH_INST_HDR]モードを表す定数 */
	public static final String SRCH_INST_HDR = "SRCH_INST_HDR";
	/** [SRCH_INST_OPER]モードを表す定数 */
	public static final String SRCH_INST_OPER = "SRCH_INST_OPER";
	/** [SRCH_INST_YIELD]モードを表す定数 */
	public static final String SRCH_INST_YIELD = "SRCH_INST_YIELD";
	/** [SRCH_ACT_HDR]モードを表す定数 */
	public static final String SRCH_ACT_HDR = "SRCH_ACT_HDR";
	/** [SRCH_ACT_OPER]モードを表す定数 */
	public static final String SRCH_ACT_OPER = "SRCH_ACT_OPER";
	/** [SRCH_ACT_YIELD]モードを表す定数 */
	public static final String SRCH_ACT_YIELD = "SRCH_ACT_YIELD";
	/** [REF_INST_HDR]モードを表す定数 */
	public static final String REF_INST_HDR = "REF_INST_HDR";
	/** [REF_INST_OPER]モードを表す定数 */
	public static final String REF_INST_OPER = "REF_INST_OPER";
	/** [REF_INST_YIELD]モードを表す定数 */
	public static final String REF_INST_YIELD = "REF_INST_YIELD";
	/** [REF_ACT_HDR]モードを表す定数 */
	public static final String REF_ACT_HDR = "REF_ACT_HDR";
	/** [REF_ACT_OPER]モードを表す定数 */
	public static final String REF_ACT_OPER = "REF_ACT_OPER";
	/** [REF_ACT_YIELD]モードを表す定数 */
	public static final String REF_ACT_YIELD = "REF_ACT_YIELD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_INST_HDR, SRCH_INST_OPER, SRCH_INST_YIELD, SRCH_ACT_HDR, SRCH_ACT_OPER, SRCH_ACT_YIELD, REF_INST_HDR, REF_INST_OPER, REF_INST_YIELD, REF_ACT_HDR, REF_ACT_OPER, REF_ACT_YIELD};
	
	/** [MS_MSBCL1070_Srch01]のCallerの作成 */
	protected MSBCP_MfgInstPrSrch_MC.MS_MSBCL1070_Srch01Caller createMS_MSBCL1070_Srch01() {
		MSBCP_MfgInstPrSrch_MC.MS_MSBCL1070_Srch01Caller<MSBCP_MfgInstPrSrch, MS_MSBCL1070_Srch01Bridge>
		caller = ((MSBCP_MfgInstPrSrch_MC)this).new MS_MSBCL1070_Srch01Caller<MSBCP_MfgInstPrSrch, MS_MSBCL1070_Srch01Bridge>(
					(MSBCP_MfgInstPrSrch)this, new MS_MSBCL1070_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL1070_Srch01]の呼び出し */
	protected void callMS_MSBCL1070_Srch01() {
		MCCaller caller = createMS_MSBCL1070_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1070.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP1070.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP1070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1070.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP1070.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP1070.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1070.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP1070.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP1070.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1070.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP1070.RsltR.class);
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
		ret.add(DispUnit1Panel);
		ret.add(DispUnit2Panel);
		ret.add(StsPanel);
		ret.add(UnschdActSrchCndPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(ItmGrpPanel);
		ret.add(SpplGrpPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MfgInstPrSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MfgInstPrSrch_MC_A(String name) {
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
		MSBCP_MfgInstPrSrch_MC.jbCreateDispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateDispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateSts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateUnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateTop((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateFold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateTab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateTab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateTab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateSpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateCtrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateRPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateRslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbCreateBtn((MSBCP_MfgInstPrSrch)this);
	}

	/**
	 * [DispUnit1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit1(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [DispUnit2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit2(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [UnschdActSrchCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUnschdActSrchCnd(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_MfgInstPrSrch p) {
		p.Cnd_st_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().st_schd_dt_p());
		p.Cnd_st_schd_dt_p_PPanel.setName("Cnd.st_schd_dt_p");
		p.Cnd_st_schd_dt_fr = p.Cnd_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_st_schd_dt_fr.addAliasName("Cnd.st_schd_dt_fr", p);
		p.Cnd_st_schd_hm_fr = p.Cnd_st_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_st_schd_hm_fr.addAliasName("Cnd.st_schd_hm_fr", p);
		p.Cnd_st_schd_dt_to = p.Cnd_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_st_schd_dt_to.addAliasName("Cnd.st_schd_dt_to", p);
		p.Cnd_st_schd_hm_to = p.Cnd_st_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_st_schd_hm_to.addAliasName("Cnd.st_schd_hm_to", p);
		p.Cnd_end_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().end_schd_dt_p());
		p.Cnd_end_schd_dt_p_PPanel.setName("Cnd.end_schd_dt_p");
		p.Cnd_end_schd_dt_fr = p.Cnd_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_end_schd_dt_fr.addAliasName("Cnd.end_schd_dt_fr", p);
		p.Cnd_end_schd_hm_fr = p.Cnd_end_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_end_schd_hm_fr.addAliasName("Cnd.end_schd_hm_fr", p);
		p.Cnd_end_schd_dt_to = p.Cnd_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_end_schd_dt_to.addAliasName("Cnd.end_schd_dt_to", p);
		p.Cnd_end_schd_hm_to = p.Cnd_end_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_end_schd_hm_to.addAliasName("Cnd.end_schd_hm_to", p);
		p.Cnd_st_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().st_act_dt_p());
		p.Cnd_st_act_dt_p_PPanel.setName("Cnd.st_act_dt_p");
		p.Cnd_st_act_dt_fr = p.Cnd_st_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_st_act_dt_fr.addAliasName("Cnd.st_act_dt_fr", p);
		p.Cnd_st_act_hm_fr = p.Cnd_st_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_st_act_hm_fr.addAliasName("Cnd.st_act_hm_fr", p);
		p.Cnd_st_act_dt_to = p.Cnd_st_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_st_act_dt_to.addAliasName("Cnd.st_act_dt_to", p);
		p.Cnd_st_act_hm_to = p.Cnd_st_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_st_act_hm_to.addAliasName("Cnd.st_act_hm_to", p);
		p.Cnd_end_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().end_act_dt_p());
		p.Cnd_end_act_dt_p_PPanel.setName("Cnd.end_act_dt_p");
		p.Cnd_end_act_dt_fr = p.Cnd_end_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_end_act_dt_fr.addAliasName("Cnd.end_act_dt_fr", p);
		p.Cnd_end_act_hm_fr = p.Cnd_end_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_end_act_hm_fr.addAliasName("Cnd.end_act_hm_fr", p);
		p.Cnd_end_act_dt_to = p.Cnd_end_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_end_act_dt_to.addAliasName("Cnd.end_act_dt_to", p);
		p.Cnd_end_act_hm_to = p.Cnd_end_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_end_act_hm_to.addAliasName("Cnd.end_act_hm_to", p);
		p.Cnd_yield_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().yield_schd_dt_p());
		p.Cnd_yield_schd_dt_p_PPanel.setName("Cnd.yield_schd_dt_p");
		p.Cnd_yield_schd_dt_fr = p.Cnd_yield_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_yield_schd_dt_fr.addAliasName("Cnd.yield_schd_dt_fr", p);
		p.Cnd_yield_schd_hm_fr = p.Cnd_yield_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_yield_schd_hm_fr.addAliasName("Cnd.yield_schd_hm_fr", p);
		p.Cnd_yield_schd_dt_to = p.Cnd_yield_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_yield_schd_dt_to.addAliasName("Cnd.yield_schd_dt_to", p);
		p.Cnd_yield_schd_hm_to = p.Cnd_yield_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_yield_schd_hm_to.addAliasName("Cnd.yield_schd_hm_to", p);
		p.Cnd_yield_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().yield_act_dt_p());
		p.Cnd_yield_act_dt_p_PPanel.setName("Cnd.yield_act_dt_p");
		p.Cnd_yield_act_dt_fr = p.Cnd_yield_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_yield_act_dt_fr.addAliasName("Cnd.yield_act_dt_fr", p);
		p.Cnd_yield_act_hm_fr = p.Cnd_yield_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_yield_act_hm_fr.addAliasName("Cnd.yield_act_hm_fr", p);
		p.Cnd_yield_act_dt_to = p.Cnd_yield_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_yield_act_dt_to.addAliasName("Cnd.yield_act_dt_to", p);
		p.Cnd_yield_act_hm_to = p.Cnd_yield_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_yield_act_hm_to.addAliasName("Cnd.yield_act_hm_to", p);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().rqst_dlv_rqst_dt_p());
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.setName("Cnd.rqst_dlv_rqst_dt_p");
		p.Cnd_rqst_dlv_rqst_dt_fr = p.Cnd_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_rqst_dlv_rqst_dt_fr.addAliasName("Cnd.rqst_dlv_rqst_dt_fr", p);
		p.Cnd_rqst_dlv_rqst_hm_fr = p.Cnd_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_rqst_dlv_rqst_hm_fr.addAliasName("Cnd.rqst_dlv_rqst_hm_fr", p);
		p.Cnd_rqst_dlv_rqst_dt_to = p.Cnd_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_rqst_dlv_rqst_dt_to.addAliasName("Cnd.rqst_dlv_rqst_dt_to", p);
		p.Cnd_rqst_dlv_rqst_hm_to = p.Cnd_rqst_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_rqst_dlv_rqst_hm_to.addAliasName("Cnd.rqst_dlv_rqst_hm_to", p);
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
		p.Cnd_sno_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_lab1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab1;
		p.Cnd_itm_grp_lab1.addAliasName("Cnd.itm_grp_lab1", p);
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_lab2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab2;
		p.Cnd_itm_grp_lab2.addAliasName("Cnd.itm_grp_lab2", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_lab3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab3;
		p.Cnd_itm_grp_lab3.addAliasName("Cnd.itm_grp_lab3", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_lab4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab4;
		p.Cnd_itm_grp_lab4.addAliasName("Cnd.itm_grp_lab4", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_lab5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab5;
		p.Cnd_itm_grp_lab5.addAliasName("Cnd.itm_grp_lab5", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_lab6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab6;
		p.Cnd_itm_grp_lab6.addAliasName("Cnd.itm_grp_lab6", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_lab7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab7;
		p.Cnd_itm_grp_lab7.addAliasName("Cnd.itm_grp_lab7", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_lab8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab8;
		p.Cnd_itm_grp_lab8.addAliasName("Cnd.itm_grp_lab8", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_lab9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab9;
		p.Cnd_itm_grp_lab9.addAliasName("Cnd.itm_grp_lab9", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_lab10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_lab10;
		p.Cnd_itm_grp_lab10.addAliasName("Cnd.itm_grp_lab10", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
		p.Cnd_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().sppl_grp_p());
		p.Cnd_sppl_grp_p_PPanel.setName("Cnd.sppl_grp_p");
		p.Cnd_sppl_grp_lab1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_sppl_grp_lab1.addAliasName("Cnd.sppl_grp_lab1", p);
		p.Cnd_sppl_grp_flg1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_sppl_grp_flg1.addAliasName("Cnd.sppl_grp_flg1", p);
		p.Cnd_sppl_grp_cd1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_sppl_grp_cd1.addAliasName("Cnd.sppl_grp_cd1", p);
		p.Cnd_sppl_grp_nm1 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_sppl_grp_nm1.addAliasName("Cnd.sppl_grp_nm1", p);
		p.Cnd_sppl_grp_lab2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_sppl_grp_lab2.addAliasName("Cnd.sppl_grp_lab2", p);
		p.Cnd_sppl_grp_flg2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_sppl_grp_flg2.addAliasName("Cnd.sppl_grp_flg2", p);
		p.Cnd_sppl_grp_cd2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_sppl_grp_cd2.addAliasName("Cnd.sppl_grp_cd2", p);
		p.Cnd_sppl_grp_nm2 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_sppl_grp_nm2.addAliasName("Cnd.sppl_grp_nm2", p);
		p.Cnd_sppl_grp_lab3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_sppl_grp_lab3.addAliasName("Cnd.sppl_grp_lab3", p);
		p.Cnd_sppl_grp_flg3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_sppl_grp_flg3.addAliasName("Cnd.sppl_grp_flg3", p);
		p.Cnd_sppl_grp_cd3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_sppl_grp_cd3.addAliasName("Cnd.sppl_grp_cd3", p);
		p.Cnd_sppl_grp_nm3 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_sppl_grp_nm3.addAliasName("Cnd.sppl_grp_nm3", p);
		p.Cnd_sppl_grp_lab4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_sppl_grp_lab4.addAliasName("Cnd.sppl_grp_lab4", p);
		p.Cnd_sppl_grp_flg4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_sppl_grp_flg4.addAliasName("Cnd.sppl_grp_flg4", p);
		p.Cnd_sppl_grp_cd4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_sppl_grp_cd4.addAliasName("Cnd.sppl_grp_cd4", p);
		p.Cnd_sppl_grp_nm4 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_sppl_grp_nm4.addAliasName("Cnd.sppl_grp_nm4", p);
		p.Cnd_sppl_grp_lab5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_sppl_grp_lab5.addAliasName("Cnd.sppl_grp_lab5", p);
		p.Cnd_sppl_grp_flg5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_sppl_grp_flg5.addAliasName("Cnd.sppl_grp_flg5", p);
		p.Cnd_sppl_grp_cd5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_sppl_grp_cd5.addAliasName("Cnd.sppl_grp_cd5", p);
		p.Cnd_sppl_grp_nm5 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_sppl_grp_nm5.addAliasName("Cnd.sppl_grp_nm5", p);
		p.Cnd_sppl_grp_lab6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_sppl_grp_lab6.addAliasName("Cnd.sppl_grp_lab6", p);
		p.Cnd_sppl_grp_flg6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_sppl_grp_flg6.addAliasName("Cnd.sppl_grp_flg6", p);
		p.Cnd_sppl_grp_cd6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_sppl_grp_cd6.addAliasName("Cnd.sppl_grp_cd6", p);
		p.Cnd_sppl_grp_nm6 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_sppl_grp_nm6.addAliasName("Cnd.sppl_grp_nm6", p);
		p.Cnd_sppl_grp_lab7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_sppl_grp_lab7.addAliasName("Cnd.sppl_grp_lab7", p);
		p.Cnd_sppl_grp_flg7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_sppl_grp_flg7.addAliasName("Cnd.sppl_grp_flg7", p);
		p.Cnd_sppl_grp_cd7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_sppl_grp_cd7.addAliasName("Cnd.sppl_grp_cd7", p);
		p.Cnd_sppl_grp_nm7 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_sppl_grp_nm7.addAliasName("Cnd.sppl_grp_nm7", p);
		p.Cnd_sppl_grp_lab8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_sppl_grp_lab8.addAliasName("Cnd.sppl_grp_lab8", p);
		p.Cnd_sppl_grp_flg8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_sppl_grp_flg8.addAliasName("Cnd.sppl_grp_flg8", p);
		p.Cnd_sppl_grp_cd8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_sppl_grp_cd8.addAliasName("Cnd.sppl_grp_cd8", p);
		p.Cnd_sppl_grp_nm8 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_sppl_grp_nm8.addAliasName("Cnd.sppl_grp_nm8", p);
		p.Cnd_sppl_grp_lab9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_sppl_grp_lab9.addAliasName("Cnd.sppl_grp_lab9", p);
		p.Cnd_sppl_grp_flg9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_sppl_grp_flg9.addAliasName("Cnd.sppl_grp_flg9", p);
		p.Cnd_sppl_grp_cd9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_sppl_grp_cd9.addAliasName("Cnd.sppl_grp_cd9", p);
		p.Cnd_sppl_grp_nm9 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_sppl_grp_nm9.addAliasName("Cnd.sppl_grp_nm9", p);
		p.Cnd_sppl_grp_lab10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_sppl_grp_lab10.addAliasName("Cnd.sppl_grp_lab10", p);
		p.Cnd_sppl_grp_flg10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_sppl_grp_flg10.addAliasName("Cnd.sppl_grp_flg10", p);
		p.Cnd_sppl_grp_cd10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_sppl_grp_cd10.addAliasName("Cnd.sppl_grp_cd10", p);
		p.Cnd_sppl_grp_nm10 = p.Cnd_sppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_sppl_grp_nm10.addAliasName("Cnd.sppl_grp_nm10", p);
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [SpplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplGrp(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_MfgInstPrSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_MfgInstPrSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$itm_p);
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
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_base_unit_inst_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_inst_qty.addAliasName("Rslt.base_unit_inst_qty", p);
		p.Rslt_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$yield_schd_qty_p);
		p.Rslt_yield_schd_qty_p_PPanel.setName("Rslt.yield_schd_qty_p");
		p.columnRslt_base_unit_yield_schd_qty = p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_yield_schd_qty.addAliasName("Rslt.base_unit_yield_schd_qty", p);
		p.Rslt_base_unit_mfg_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_mfg_qty_p);
		p.Rslt_base_unit_mfg_qty_p_PPanel.setName("Rslt.base_unit_mfg_qty_p");
		p.columnRslt_base_unit_mfg_qty = p.Rslt_base_unit_mfg_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_mfg_qty.addAliasName("Rslt.base_unit_mfg_qty", p);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_mfg_rem_st_qty_p);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.setName("Rslt.base_unit_mfg_rem_st_qty_p");
		p.columnRslt_base_unit_mfg_rem_st_qty = p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_mfg_rem_st_qty.addAliasName("Rslt.base_unit_mfg_rem_st_qty", p);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_mfg_rem_qty_p);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.setName("Rslt.base_unit_mfg_rem_qty_p");
		p.columnRslt_base_unit_mfg_rem_qty = p.Rslt_base_unit_mfg_rem_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_mfg_rem_qty.addAliasName("Rslt.base_unit_mfg_rem_qty", p);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_mfg_abort_qty_p);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.setName("Rslt.base_unit_mfg_abort_qty_p");
		p.columnRslt_base_unit_mfg_abort_qty = p.Rslt_base_unit_mfg_abort_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_mfg_abort_qty.addAliasName("Rslt.base_unit_mfg_abort_qty", p);
		p.Rslt_base_unit_yield_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_yield_qty_p);
		p.Rslt_base_unit_yield_qty_p_PPanel.setName("Rslt.base_unit_yield_qty_p");
		p.columnRslt_base_unit_yield_qty = p.Rslt_base_unit_yield_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_yield_qty.addAliasName("Rslt.base_unit_yield_qty", p);
		p.Rslt_base_unit_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$base_unit_dfct_qty_p);
		p.Rslt_base_unit_dfct_qty_p_PPanel.setName("Rslt.base_unit_dfct_qty_p");
		p.columnRslt_base_unit_dfct_qty = p.Rslt_base_unit_dfct_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_dfct_qty.addAliasName("Rslt.base_unit_dfct_qty", p);
		p.Rslt_ord_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$ord_qty_p);
		p.Rslt_ord_qty_p_PPanel.setName("Rslt.ord_qty_p");
		p.columnRslt_base_unit_ord_qty = p.Rslt_ord_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_ord_qty.addAliasName("Rslt.base_unit_ord_qty", p);
		p.Rslt_not_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$not_inst_qty_p);
		p.Rslt_not_inst_qty_p_PPanel.setName("Rslt.not_inst_qty_p");
		p.columnRslt_base_unit_not_inst_qty = p.Rslt_not_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_not_inst_qty.addAliasName("Rslt.base_unit_not_inst_qty", p);
		p.Rslt_oper_std_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$oper_std_qty_p);
		p.Rslt_oper_std_qty_p_PPanel.setName("Rslt.oper_std_qty_p");
		p.columnRslt_oper_std_qty = p.Rslt_oper_std_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_std_qty.addAliasName("Rslt.oper_std_qty", p);
		p.Rslt_oper_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$oper_unit_qty_p);
		p.Rslt_oper_unit_qty_p_PPanel.setName("Rslt.oper_unit_qty_p");
		p.columnRslt_oper_unit_qty = p.Rslt_oper_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_qty.addAliasName("Rslt.oper_unit_qty", p);
		p.Rslt_oper_unit_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$oper_unit_act_qty_p);
		p.Rslt_oper_unit_act_qty_p_PPanel.setName("Rslt.oper_unit_act_qty_p");
		p.columnRslt_oper_unit_act_qty = p.Rslt_oper_unit_act_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_act_qty.addAliasName("Rslt.oper_unit_act_qty", p);
		p.Rslt_oper_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$oper_unit_schd_qty_p);
		p.Rslt_oper_unit_schd_qty_p_PPanel.setName("Rslt.oper_unit_schd_qty_p");
		p.columnRslt_oper_unit_schd_qty = p.Rslt_oper_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_schd_qty.addAliasName("Rslt.oper_unit_schd_qty", p);
		p.Rslt_oper_unit_rem_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$oper_unit_rem_qty_p);
		p.Rslt_oper_unit_rem_qty_p_PPanel.setName("Rslt.oper_unit_rem_qty_p");
		p.columnRslt_oper_unit_rem_qty = p.Rslt_oper_unit_rem_qty_p_PPanel.columnQty_qty;
		p.columnRslt_oper_unit_rem_qty.addAliasName("Rslt.oper_unit_rem_qty", p);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$trd_unit_yield_schd_qty_p);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.setName("Rslt.trd_unit_yield_schd_qty_p");
		p.columnRslt_trd_unit_yield_schd_qty = p.Rslt_trd_unit_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_yield_schd_qty.addAliasName("Rslt.trd_unit_yield_schd_qty", p);
		p.Rslt_trd_unit_yield_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$trd_unit_yield_qty_p);
		p.Rslt_trd_unit_yield_qty_p_PPanel.setName("Rslt.trd_unit_yield_qty_p");
		p.columnRslt_trd_unit_yield_qty = p.Rslt_trd_unit_yield_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_yield_qty.addAliasName("Rslt.trd_unit_yield_qty", p);
		p.Rslt_trd_unit_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$trd_unit_dfct_qty_p);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.setName("Rslt.trd_unit_dfct_qty_p");
		p.columnRslt_trd_unit_dfct_qty = p.Rslt_trd_unit_dfct_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_dfct_qty.addAliasName("Rslt.trd_unit_dfct_qty", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$itm_grp_p);
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
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBC.MSBCP1070.RsltR.$sppl_grp_p);
		p.Rslt_sppl_grp_p_PPanel.setName("Rslt.sppl_grp_p");
		p.columnRslt_sppl_grp_cd1 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_sppl_grp_cd1.addAliasName("Rslt.sppl_grp_cd1", p);
		p.columnRslt_sppl_grp_nm1 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_sppl_grp_nm1.addAliasName("Rslt.sppl_grp_nm1", p);
		p.columnRslt_sppl_grp_cd2 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_sppl_grp_cd2.addAliasName("Rslt.sppl_grp_cd2", p);
		p.columnRslt_sppl_grp_nm2 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_sppl_grp_nm2.addAliasName("Rslt.sppl_grp_nm2", p);
		p.columnRslt_sppl_grp_cd3 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_sppl_grp_cd3.addAliasName("Rslt.sppl_grp_cd3", p);
		p.columnRslt_sppl_grp_nm3 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_sppl_grp_nm3.addAliasName("Rslt.sppl_grp_nm3", p);
		p.columnRslt_sppl_grp_cd4 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_sppl_grp_cd4.addAliasName("Rslt.sppl_grp_cd4", p);
		p.columnRslt_sppl_grp_nm4 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_sppl_grp_nm4.addAliasName("Rslt.sppl_grp_nm4", p);
		p.columnRslt_sppl_grp_cd5 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_sppl_grp_cd5.addAliasName("Rslt.sppl_grp_cd5", p);
		p.columnRslt_sppl_grp_nm5 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_sppl_grp_nm5.addAliasName("Rslt.sppl_grp_nm5", p);
		p.columnRslt_sppl_grp_cd6 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_sppl_grp_cd6.addAliasName("Rslt.sppl_grp_cd6", p);
		p.columnRslt_sppl_grp_nm6 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_sppl_grp_nm6.addAliasName("Rslt.sppl_grp_nm6", p);
		p.columnRslt_sppl_grp_cd7 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_sppl_grp_cd7.addAliasName("Rslt.sppl_grp_cd7", p);
		p.columnRslt_sppl_grp_nm7 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_sppl_grp_nm7.addAliasName("Rslt.sppl_grp_nm7", p);
		p.columnRslt_sppl_grp_cd8 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_sppl_grp_cd8.addAliasName("Rslt.sppl_grp_cd8", p);
		p.columnRslt_sppl_grp_nm8 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_sppl_grp_nm8.addAliasName("Rslt.sppl_grp_nm8", p);
		p.columnRslt_sppl_grp_cd9 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_sppl_grp_cd9.addAliasName("Rslt.sppl_grp_cd9", p);
		p.columnRslt_sppl_grp_nm9 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_sppl_grp_nm9.addAliasName("Rslt.sppl_grp_nm9", p);
		p.columnRslt_sppl_grp_cd10 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_sppl_grp_cd10.addAliasName("Rslt.sppl_grp_cd10", p);
		p.columnRslt_sppl_grp_nm10 = p.Rslt_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_sppl_grp_nm10.addAliasName("Rslt.sppl_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_MfgInstPrSrch p) {
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

	
	/** [Cnd_mfg_mtd_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_mtd_typ_p = null;

	/**
	 * [Cnd_mfg_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_mtd_typ_ListPutter() {
		if (Cnd_mfg_mtd_typ_p == null) {
			Cnd_mfg_mtd_typ_p = createCnd_mfg_mtd_typ_ListPutter(Cnd_mfg_mtd_typ, "mfg_mtd_typ", "mfg_mtd_typ_nm");

		}
		return Cnd_mfg_mtd_typ_p;
	}
	
	
	/** [Cnd_mfg_loc_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_site_cd_p = null;

	/**
	 * [Cnd_mfg_loc_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_site_cd_ListPutter() {
		if (Cnd_mfg_loc_site_cd_p == null) {
			Cnd_mfg_loc_site_cd_p = createCnd_mfg_loc_site_cd_ListPutter(Cnd_mfg_loc_site_cd, "mfg_loc_site_cd", "mfg_loc_site_nm");

		}
		return Cnd_mfg_loc_site_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_wg_cd_p = null;

	/**
	 * [Cnd_mfg_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_wg_cd_ListPutter() {
		if (Cnd_mfg_loc_wg_cd_p == null) {
			Cnd_mfg_loc_wg_cd_p = createCnd_mfg_loc_wg_cd_ListPutter(Cnd_mfg_loc_wg_cd, "mfg_loc_wg_cd", "mfg_loc_wg_nm");

		}
		return Cnd_mfg_loc_wg_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_grp_cd_p = null;

	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_grp_cd_ListPutter() {
		if (Cnd_mfg_loc_grp_cd_p == null) {
			Cnd_mfg_loc_grp_cd_p = createCnd_mfg_loc_grp_cd_ListPutter(Cnd_mfg_loc_grp_cd, "mfg_loc_grp_cd", "mfg_loc_grp_nm");

		}
		return Cnd_mfg_loc_grp_cd_p;
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
	
	
	/** [Cnd_mfg_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_str_ln_cd_p = null;

	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_str_ln_cd_ListPutter() {
		if (Cnd_mfg_str_ln_cd_p == null) {
			Cnd_mfg_str_ln_cd_p = createCnd_mfg_str_ln_cd_ListPutter(Cnd_mfg_str_ln_cd, "mfg_str_ln_cd", "mfg_str_ln_nm");

		}
		return Cnd_mfg_str_ln_cd_p;
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
	
	
	/** [Cnd_strg_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_str_ln_cd_p = null;

	/**
	 * [Cnd_strg_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_str_ln_cd_ListPutter() {
		if (Cnd_strg_str_ln_cd_p == null) {
			Cnd_strg_str_ln_cd_p = createCnd_strg_str_ln_cd_ListPutter(Cnd_strg_str_ln_cd, "strg_str_ln_cd", "strg_str_ln_nm");

		}
		return Cnd_strg_str_ln_cd_p;
	}
	
	
	/** [Cnd_oper_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_loc_cd_p = null;

	/**
	 * [Cnd_oper_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_loc_cd_ListPutter() {
		if (Cnd_oper_loc_cd_p == null) {
			Cnd_oper_loc_cd_p = createCnd_oper_loc_cd_ListPutter(Cnd_oper_loc_cd, "oper_loc_cd", "oper_loc_nm");

		}
		return Cnd_oper_loc_cd_p;
	}
	
	
	/** [Cnd_oper_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_str_ln_cd_p = null;

	/**
	 * [Cnd_oper_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_str_ln_cd_ListPutter() {
		if (Cnd_oper_str_ln_cd_p == null) {
			Cnd_oper_str_ln_cd_p = createCnd_oper_str_ln_cd_ListPutter(Cnd_oper_str_ln_cd, "oper_str_ln_cd", "oper_str_ln_nm");

		}
		return Cnd_oper_str_ln_cd_p;
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
	
	
	/** [Cnd_mfg_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_aprv_sts_typ_p = null;

	/**
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_aprv_sts_typ_ListPutter() {
		if (Cnd_mfg_aprv_sts_typ_p == null) {
			Cnd_mfg_aprv_sts_typ_p = createCnd_mfg_aprv_sts_typ_ListPutter(Cnd_mfg_aprv_sts_typ, "mfg_aprv_sts_typ", "mfg_aprv_sts_typ_nm");

		}
		return Cnd_mfg_aprv_sts_typ_p;
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
	
	
	/** [Cnd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_lot_no_p = null;

	/**
	 * [Cnd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_no_ListPutter() {
		if (Cnd_lot_no_p == null) {
			Cnd_lot_no_p = createCnd_lot_no_ListPutter(Cnd_lot_no, "lot_no");

		}
		return Cnd_lot_no_p;
	}
	
	
	/** [Cnd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_no_p = null;

	/**
	 * [Cnd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_no_ListPutter() {
		if (Cnd_sublot_no_p == null) {
			Cnd_sublot_no_p = createCnd_sublot_no_ListPutter(Cnd_sublot_no, "sublot_no");

		}
		return Cnd_sublot_no_p;
	}
	
	
	/** [Cnd_inst_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inst_usr_cd_p = null;

	/**
	 * [Cnd_inst_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inst_usr_cd_ListPutter() {
		if (Cnd_inst_usr_cd_p == null) {
			Cnd_inst_usr_cd_p = createCnd_inst_usr_cd_ListPutter(Cnd_inst_usr_cd, "inst_usr_cd", "inst_usr_nm");

		}
		return Cnd_inst_usr_cd_p;
	}
	
	
	/** [Cnd_inst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_inst_dpt_cd_p = null;

	/**
	 * [Cnd_inst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_inst_dpt_cd_ListPutter() {
		if (Cnd_inst_dpt_cd_p == null) {
			Cnd_inst_dpt_cd_p = createCnd_inst_dpt_cd_ListPutter(Cnd_inst_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");

		}
		return Cnd_inst_dpt_cd_p;
	}
	
	
	/** [Cnd_act_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_usr_cd_p = null;

	/**
	 * [Cnd_act_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_usr_cd_ListPutter() {
		if (Cnd_act_usr_cd_p == null) {
			Cnd_act_usr_cd_p = createCnd_act_usr_cd_ListPutter(Cnd_act_usr_cd, "act_usr_cd", "act_usr_nm");

		}
		return Cnd_act_usr_cd_p;
	}
	
	
	/** [Cnd_act_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_dpt_cd_p = null;

	/**
	 * [Cnd_act_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_dpt_cd_ListPutter() {
		if (Cnd_act_dpt_cd_p == null) {
			Cnd_act_dpt_cd_p = createCnd_act_dpt_cd_ListPutter(Cnd_act_dpt_cd, "act_dpt_cd", "act_dpt_nm");

		}
		return Cnd_act_dpt_cd_p;
	}
	
	
	/** [Cnd_oper_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_usr_cd_p = null;

	/**
	 * [Cnd_oper_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_usr_cd_ListPutter() {
		if (Cnd_oper_usr_cd_p == null) {
			Cnd_oper_usr_cd_p = createCnd_oper_usr_cd_ListPutter(Cnd_oper_usr_cd, "oper_usr_cd", "oper_usr_nm");

		}
		return Cnd_oper_usr_cd_p;
	}
	
	
	/** [Cnd_aprv_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_usr_cd_p = null;

	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_usr_cd_ListPutter() {
		if (Cnd_aprv_usr_cd_p == null) {
			Cnd_aprv_usr_cd_p = createCnd_aprv_usr_cd_ListPutter(Cnd_aprv_usr_cd, "aprv_usr_cd", "aprv_usr_nm");

		}
		return Cnd_aprv_usr_cd_p;
	}
	
	
	/** [Cnd_aprv_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_dpt_cd_p = null;

	/**
	 * [Cnd_aprv_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_dpt_cd_ListPutter() {
		if (Cnd_aprv_dpt_cd_p == null) {
			Cnd_aprv_dpt_cd_p = createCnd_aprv_dpt_cd_ListPutter(Cnd_aprv_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");

		}
		return Cnd_aprv_dpt_cd_p;
	}
	
	
	/** [Cnd_mfg_inst_unit_typ_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_inst_unit_typ_p = null;

	/**
	 * [Cnd_mfg_inst_unit_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_inst_unit_typ_ListPutter() {
		if (Cnd_mfg_inst_unit_typ_p == null) {
			Cnd_mfg_inst_unit_typ_p = createCnd_mfg_inst_unit_typ_ListPutter(Cnd_mfg_inst_unit_typ, "mfg_inst_unit_typ", "mfg_inst_unit_typ_nm");

		}
		return Cnd_mfg_inst_unit_typ_p;
	}
	
	
	/** [Cnd_po_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_po_aprv_sts_typ_p = null;

	/**
	 * [Cnd_po_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_po_aprv_sts_typ_ListPutter() {
		if (Cnd_po_aprv_sts_typ_p == null) {
			Cnd_po_aprv_sts_typ_p = createCnd_po_aprv_sts_typ_ListPutter(Cnd_po_aprv_sts_typ, "po_aprv_sts_typ", "po_aprv_sts_typ_nm");

		}
		return Cnd_po_aprv_sts_typ_p;
	}
	
	
	/** [Cnd_yield_typ_ListPutter]の定義 */
	private MCListPutter Cnd_yield_typ_p = null;

	/**
	 * [Cnd_yield_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_yield_typ_ListPutter() {
		if (Cnd_yield_typ_p == null) {
			Cnd_yield_typ_p = createCnd_yield_typ_ListPutter(Cnd_yield_typ, "yield_typ", "yield_typ_nm");

		}
		return Cnd_yield_typ_p;
	}
	
	
	/** [Cnd_yield_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_yield_rsn_cd_p = null;

	/**
	 * [Cnd_yield_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_yield_rsn_cd_ListPutter() {
		if (Cnd_yield_rsn_cd_p == null) {
			Cnd_yield_rsn_cd_p = createCnd_yield_rsn_cd_ListPutter(Cnd_yield_rsn_cd, "yield_rsn_cd", "yield_rsn_nm");

		}
		return Cnd_yield_rsn_cd_p;
	}
	
	
	/** [Cnd_gd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gd_cd_p = null;

	/**
	 * [Cnd_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gd_cd_ListPutter() {
		if (Cnd_gd_cd_p == null) {
			Cnd_gd_cd_p = createCnd_gd_cd_ListPutter(Cnd_gd_cd, "gd_cd", "gd_nm");

		}
		return Cnd_gd_cd_p;
	}
	
	
	/** [Rslt_bom_ptn_ListPutter]の定義 */
	private MCListPutter Rslt_bom_ptn_p = null;

	/**
	 * [Rslt_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bom_ptn_ListPutter() {
		if (Rslt_bom_ptn_p == null) {
			Rslt_bom_ptn_p = createRslt_bom_ptn_ListPutter(columnRslt_bom_ptn, "bom_ptn");

		}
		return Rslt_bom_ptn_p;
	}
	
	
	/** [Rslt_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_strg_loc_cd_p = null;

	/**
	 * [Rslt_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_strg_loc_cd_ListPutter() {
		if (Rslt_strg_loc_cd_p == null) {
			Rslt_strg_loc_cd_p = createRslt_strg_loc_cd_ListPutter(columnRslt_strg_loc_cd, "strg_loc_cd");

		}
		return Rslt_strg_loc_cd_p;
	}
	
	
	/** [Rslt_oper_cd_ListPutter]の定義 */
	private MCListPutter Rslt_oper_cd_p = null;

	/**
	 * [Rslt_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_oper_cd_ListPutter() {
		if (Rslt_oper_cd_p == null) {
			Rslt_oper_cd_p = createRslt_oper_cd_ListPutter(columnRslt_oper_cd, "oper_cd");

		}
		return Rslt_oper_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MfgInstPrSrch create(){
		MSBCP_MfgInstPrSrch p = new MSBCP_MfgInstPrSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MfgInstPrSrch create(String name){
		MSBCP_MfgInstPrSrch p = new MSBCP_MfgInstPrSrch(name);
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
		MSBCP_MfgInstPrSrch_MC.jbfInitDispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitDispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitSts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitUnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitTop((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitFold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitTab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitTab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitTab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitSpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitCtrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitRPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitRslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbfInitBtn((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitDispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitDispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitSts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitUnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitTop((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitFold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitTab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitTab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitTab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitSpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitCtrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitRPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitRslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.jbInitBtn((MSBCP_MfgInstPrSrch)this);
	}

	/**
	 * [DispUnit1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit1(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.DispUnit1Panel = p.beansFactory.createPanel("DispUnit1");
		p.DispUnit1TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit2(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.DispUnit2Panel = p.beansFactory.createPanel("DispUnit2");
		p.DispUnit2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [UnschdActSrchCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUnschdActSrchCnd(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.UnschdActSrchCndPanel = p.beansFactory.createPanel("UnschdActSrchCnd");
		p.UnschdActSrchCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_MfgInstPrSrch p) {
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
	protected static void jbfInitTab1(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_disp_unit1_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit1");
		p.Cnd_disp_unit1_HDR = p.beansFactory.createRadioButton("Cnd.disp_unit1_HDR");
		p.Cnd_disp_unit1_OPER = p.beansFactory.createRadioButton("Cnd.disp_unit1_OPER");
		p.Cnd_disp_unit1_YIELD = p.beansFactory.createRadioButton("Cnd.disp_unit1_YIELD");
		p.Cnd_disp_unit2_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit2");
		p.Cnd_disp_unit2_INST = p.beansFactory.createRadioButton("Cnd.disp_unit2_INST");
		p.Cnd_disp_unit2_ACT = p.beansFactory.createRadioButton("Cnd.disp_unit2_ACT");
		p.Cnd_tmp_sts_sav_flg = p.beansFactory.createCheckBox("Cnd.tmp_sts_sav_flg");
		p.Cnd_tmp_sts_ord_flg = p.beansFactory.createCheckBox("Cnd.tmp_sts_ord_flg");
		p.Cnd_tmp_sts_stt_flg = p.beansFactory.createCheckBox("Cnd.tmp_sts_stt_flg");
		p.Cnd_tmp_sts_cmpl_flg = p.beansFactory.createCheckBox("Cnd.tmp_sts_cmpl_flg");
		p.Cnd_not_unschd_act_flg = p.beansFactory.createCheckBox("Cnd.not_unschd_act_flg");
		p.Cnd_unschd_act_flg = p.beansFactory.createCheckBox("Cnd.unschd_act_flg");
		p.Cnd_inst_dt_fr_Label = p.beansFactory.createLabel("Cnd.inst_dt_fr_Label");
		p.Cnd_inst_dt_fr = p.beansFactory.createDateField("Cnd.inst_dt_fr");
		p.Cnd_inst_dt_fr.setLabel(p.Cnd_inst_dt_fr_Label);
		p.Cnd_inst_dt_to_Label = p.beansFactory.createLabel("Cnd.inst_dt_to_Label");
		p.Cnd_inst_dt_to = p.beansFactory.createDateField("Cnd.inst_dt_to");
		p.Cnd_inst_dt_to.setLabel(p.Cnd_inst_dt_to_Label);
		p.Cnd_aprv_dt_fr_Label = p.beansFactory.createLabel("Cnd.aprv_dt_fr_Label");
		p.Cnd_aprv_dt_fr = p.beansFactory.createDateField("Cnd.aprv_dt_fr");
		p.Cnd_aprv_dt_fr.setLabel(p.Cnd_aprv_dt_fr_Label);
		p.Cnd_aprv_dt_to_Label = p.beansFactory.createLabel("Cnd.aprv_dt_to_Label");
		p.Cnd_aprv_dt_to = p.beansFactory.createDateField("Cnd.aprv_dt_to");
		p.Cnd_aprv_dt_to.setLabel(p.Cnd_aprv_dt_to_Label);
		p.Cnd_st_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.st_ac_dt_fr_Label");
		p.Cnd_st_ac_dt_fr = p.beansFactory.createDateField("Cnd.st_ac_dt_fr");
		p.Cnd_st_ac_dt_fr.setLabel(p.Cnd_st_ac_dt_fr_Label);
		p.Cnd_st_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.st_ac_dt_to_Label");
		p.Cnd_st_ac_dt_to = p.beansFactory.createDateField("Cnd.st_ac_dt_to");
		p.Cnd_st_ac_dt_to.setLabel(p.Cnd_st_ac_dt_to_Label);
		p.Cnd_end_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.end_ac_dt_fr_Label");
		p.Cnd_end_ac_dt_fr = p.beansFactory.createDateField("Cnd.end_ac_dt_fr");
		p.Cnd_end_ac_dt_fr.setLabel(p.Cnd_end_ac_dt_fr_Label);
		p.Cnd_end_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.end_ac_dt_to_Label");
		p.Cnd_end_ac_dt_to = p.beansFactory.createDateField("Cnd.end_ac_dt_to");
		p.Cnd_end_ac_dt_to.setLabel(p.Cnd_end_ac_dt_to_Label);
		p.Cnd_yield_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.yield_ac_dt_fr_Label");
		p.Cnd_yield_ac_dt_fr = p.beansFactory.createDateField("Cnd.yield_ac_dt_fr");
		p.Cnd_yield_ac_dt_fr.setLabel(p.Cnd_yield_ac_dt_fr_Label);
		p.Cnd_yield_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.yield_ac_dt_to_Label");
		p.Cnd_yield_ac_dt_to = p.beansFactory.createDateField("Cnd.yield_ac_dt_to");
		p.Cnd_yield_ac_dt_to.setLabel(p.Cnd_yield_ac_dt_to_Label);
		p.Cnd_upd_ts_fr_Label = p.beansFactory.createLabel("Cnd.upd_ts_fr_Label");
		p.Cnd_upd_ts_fr = p.beansFactory.createTimestampField("Cnd.upd_ts_fr");
		p.Cnd_upd_ts_fr.setLabel(p.Cnd_upd_ts_fr_Label);
		p.Cnd_upd_ts_to_Label = p.beansFactory.createLabel("Cnd.upd_ts_to_Label");
		p.Cnd_upd_ts_to = p.beansFactory.createTimestampField("Cnd.upd_ts_to");
		p.Cnd_upd_ts_to.setLabel(p.Cnd_upd_ts_to_Label);
		p.Cnd_pr_rate_fr_Label = p.beansFactory.createLabel("Cnd.pr_rate_fr_Label");
		p.Cnd_pr_rate_fr = p.beansFactory.createNumberField("Cnd.pr_rate_fr");
		p.Cnd_pr_rate_fr.setLabel(p.Cnd_pr_rate_fr_Label);
		p.Cnd_pr_rate_to_Label = p.beansFactory.createLabel("Cnd.pr_rate_to_Label");
		p.Cnd_pr_rate_to = p.beansFactory.createNumberField("Cnd.pr_rate_to");
		p.Cnd_pr_rate_to.setLabel(p.Cnd_pr_rate_to_Label);
		p.Cnd_mfg_mtd_typ_Label = p.beansFactory.createLabel("Cnd.mfg_mtd_typ_Label");
		p.Cnd_mfg_mtd_typ = p.beansFactory.createTextComboBox("Cnd.mfg_mtd_typ");
		p.Cnd_mfg_mtd_typ.setLabel(p.Cnd_mfg_mtd_typ_Label);
		p.Cnd_mfg_mtd_typ_nm = p.beansFactory.createTextField("Cnd.mfg_mtd_typ_nm");
		p.Cnd_mfg_loc_site_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_site_cd_Label");
		p.Cnd_mfg_loc_site_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_site_cd");
		p.Cnd_mfg_loc_site_cd.setLabel(p.Cnd_mfg_loc_site_cd_Label);
		p.Cnd_mfg_loc_site_nm = p.beansFactory.createTextField("Cnd.mfg_loc_site_nm");
		p.Cnd_mfg_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_wg_cd_Label");
		p.Cnd_mfg_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_wg_cd");
		p.Cnd_mfg_loc_wg_cd.setLabel(p.Cnd_mfg_loc_wg_cd_Label);
		p.Cnd_mfg_loc_wg_nm = p.beansFactory.createTextField("Cnd.mfg_loc_wg_nm");
		p.Cnd_mfg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_grp_cd_Label");
		p.Cnd_mfg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_grp_cd");
		p.Cnd_mfg_loc_grp_cd.setLabel(p.Cnd_mfg_loc_grp_cd_Label);
		p.Cnd_mfg_loc_grp_nm = p.beansFactory.createTextField("Cnd.mfg_loc_grp_nm");
		p.Cnd_strg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_grp_cd_Label");
		p.Cnd_strg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_loc_grp_cd");
		p.Cnd_strg_loc_grp_cd.setLabel(p.Cnd_strg_loc_grp_cd_Label);
		p.Cnd_strg_loc_grp_nm = p.beansFactory.createTextField("Cnd.strg_loc_grp_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_mfg_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.mfg_str_ln_cd_Label");
		p.Cnd_mfg_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.mfg_str_ln_cd");
		p.Cnd_mfg_str_ln_cd.setLabel(p.Cnd_mfg_str_ln_cd_Label);
		p.Cnd_mfg_str_ln_nm = p.beansFactory.createTextField("Cnd.mfg_str_ln_nm");
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_strg_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.strg_str_ln_cd_Label");
		p.Cnd_strg_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.strg_str_ln_cd");
		p.Cnd_strg_str_ln_cd.setLabel(p.Cnd_strg_str_ln_cd_Label);
		p.Cnd_strg_str_ln_nm = p.beansFactory.createTextField("Cnd.strg_str_ln_nm");
		p.Cnd_oper_loc_cd_Label = p.beansFactory.createLabel("Cnd.oper_loc_cd_Label");
		p.Cnd_oper_loc_cd = p.beansFactory.createTextField("Cnd.oper_loc_cd");
		p.Cnd_oper_loc_cd.setLabel(p.Cnd_oper_loc_cd_Label);
		p.Cnd_oper_loc_nm = p.beansFactory.createTextField("Cnd.oper_loc_nm");
		p.Cnd_oper_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.oper_str_ln_cd_Label");
		p.Cnd_oper_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.oper_str_ln_cd");
		p.Cnd_oper_str_ln_cd.setLabel(p.Cnd_oper_str_ln_cd_Label);
		p.Cnd_oper_str_ln_nm = p.beansFactory.createTextField("Cnd.oper_str_ln_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_abort_flg = p.beansFactory.createCheckBox("Cnd.abort_flg");
		p.Cnd_inc_yield_oper_flg = p.beansFactory.createCheckBox("Cnd.inc_yield_oper_flg");
		p.Cnd_mfg_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.mfg_aprv_sts_typ_Label");
		p.Cnd_mfg_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.mfg_aprv_sts_typ");
		p.Cnd_mfg_aprv_sts_typ.setLabel(p.Cnd_mfg_aprv_sts_typ_Label);
		p.Cnd_mfg_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.mfg_aprv_sts_typ_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_inst_usr_cd_Label = p.beansFactory.createLabel("Cnd.inst_usr_cd_Label");
		p.Cnd_inst_usr_cd = p.beansFactory.createTextField("Cnd.inst_usr_cd");
		p.Cnd_inst_usr_cd.setLabel(p.Cnd_inst_usr_cd_Label);
		p.Cnd_inst_usr_nm = p.beansFactory.createTextField("Cnd.inst_usr_nm");
		p.Cnd_inst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.inst_dpt_cd_Label");
		p.Cnd_inst_dpt_cd = p.beansFactory.createTextField("Cnd.inst_dpt_cd");
		p.Cnd_inst_dpt_cd.setLabel(p.Cnd_inst_dpt_cd_Label);
		p.Cnd_inst_dpt_nm = p.beansFactory.createTextField("Cnd.inst_dpt_nm");
		p.Cnd_act_usr_cd_Label = p.beansFactory.createLabel("Cnd.act_usr_cd_Label");
		p.Cnd_act_usr_cd = p.beansFactory.createTextField("Cnd.act_usr_cd");
		p.Cnd_act_usr_cd.setLabel(p.Cnd_act_usr_cd_Label);
		p.Cnd_act_usr_nm = p.beansFactory.createTextField("Cnd.act_usr_nm");
		p.Cnd_act_dpt_cd_Label = p.beansFactory.createLabel("Cnd.act_dpt_cd_Label");
		p.Cnd_act_dpt_cd = p.beansFactory.createTextComboBox("Cnd.act_dpt_cd");
		p.Cnd_act_dpt_cd.setLabel(p.Cnd_act_dpt_cd_Label);
		p.Cnd_act_dpt_nm = p.beansFactory.createTextField("Cnd.act_dpt_nm");
		p.Cnd_oper_usr_cd_Label = p.beansFactory.createLabel("Cnd.oper_usr_cd_Label");
		p.Cnd_oper_usr_cd = p.beansFactory.createTextField("Cnd.oper_usr_cd");
		p.Cnd_oper_usr_cd.setLabel(p.Cnd_oper_usr_cd_Label);
		p.Cnd_oper_usr_nm = p.beansFactory.createTextField("Cnd.oper_usr_nm");
		p.Cnd_oper_rsrc_Label = p.beansFactory.createLabel("Cnd.oper_rsrc_Label");
		p.Cnd_oper_rsrc = p.beansFactory.createTextField("Cnd.oper_rsrc");
		p.Cnd_oper_rsrc.setLabel(p.Cnd_oper_rsrc_Label);
		p.Cnd_aprv_usr_cd_Label = p.beansFactory.createLabel("Cnd.aprv_usr_cd_Label");
		p.Cnd_aprv_usr_cd = p.beansFactory.createTextField("Cnd.aprv_usr_cd");
		p.Cnd_aprv_usr_cd.setLabel(p.Cnd_aprv_usr_cd_Label);
		p.Cnd_aprv_usr_nm = p.beansFactory.createTextField("Cnd.aprv_usr_nm");
		p.Cnd_aprv_dpt_cd_Label = p.beansFactory.createLabel("Cnd.aprv_dpt_cd_Label");
		p.Cnd_aprv_dpt_cd = p.beansFactory.createTextComboBox("Cnd.aprv_dpt_cd");
		p.Cnd_aprv_dpt_cd.setLabel(p.Cnd_aprv_dpt_cd_Label);
		p.Cnd_aprv_dpt_nm = p.beansFactory.createTextField("Cnd.aprv_dpt_nm");
		p.Cnd_mfg_inst_unit_typ_Label = p.beansFactory.createLabel("Cnd.mfg_inst_unit_typ_Label");
		p.Cnd_mfg_inst_unit_typ = p.beansFactory.createTextComboBox("Cnd.mfg_inst_unit_typ");
		p.Cnd_mfg_inst_unit_typ.setLabel(p.Cnd_mfg_inst_unit_typ_Label);
		p.Cnd_mfg_inst_unit_typ_nm = p.beansFactory.createTextField("Cnd.mfg_inst_unit_typ_nm");
		p.Cnd_po_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.po_aprv_sts_typ_Label");
		p.Cnd_po_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.po_aprv_sts_typ");
		p.Cnd_po_aprv_sts_typ.setLabel(p.Cnd_po_aprv_sts_typ_Label);
		p.Cnd_po_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.po_aprv_sts_typ_nm");
		p.Cnd_yield_typ_Label = p.beansFactory.createLabel("Cnd.yield_typ_Label");
		p.Cnd_yield_typ = p.beansFactory.createTextComboBox("Cnd.yield_typ");
		p.Cnd_yield_typ.setLabel(p.Cnd_yield_typ_Label);
		p.Cnd_yield_typ_nm = p.beansFactory.createTextField("Cnd.yield_typ_nm");
		p.Cnd_yield_rsn_cd_Label = p.beansFactory.createLabel("Cnd.yield_rsn_cd_Label");
		p.Cnd_yield_rsn_cd = p.beansFactory.createTextComboBox("Cnd.yield_rsn_cd");
		p.Cnd_yield_rsn_cd.setLabel(p.Cnd_yield_rsn_cd_Label);
		p.Cnd_yield_rsn_nm = p.beansFactory.createTextField("Cnd.yield_rsn_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_oper_ord_no_Label = p.beansFactory.createLabel("Cnd.oper_ord_no_Label");
		p.Cnd_oper_ord_no = p.beansFactory.createTextField("Cnd.oper_ord_no");
		p.Cnd_oper_ord_no.setLabel(p.Cnd_oper_ord_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_mfg_act_no_Label = p.beansFactory.createLabel("Cnd.mfg_act_no_Label");
		p.Cnd_mfg_act_no = p.beansFactory.createTextField("Cnd.mfg_act_no");
		p.Cnd_mfg_act_no.setLabel(p.Cnd_mfg_act_no_Label);
		p.Cnd_oper_inst_no_Label = p.beansFactory.createLabel("Cnd.oper_inst_no_Label");
		p.Cnd_oper_inst_no = p.beansFactory.createTextField("Cnd.oper_inst_no");
		p.Cnd_oper_inst_no.setLabel(p.Cnd_oper_inst_no_Label);
		p.Cnd_oper_act_no_Label = p.beansFactory.createLabel("Cnd.oper_act_no_Label");
		p.Cnd_oper_act_no = p.beansFactory.createTextField("Cnd.oper_act_no");
		p.Cnd_oper_act_no.setLabel(p.Cnd_oper_act_no_Label);
		p.Cnd_yield_schd_no_Label = p.beansFactory.createLabel("Cnd.yield_schd_no_Label");
		p.Cnd_yield_schd_no = p.beansFactory.createTextField("Cnd.yield_schd_no");
		p.Cnd_yield_schd_no.setLabel(p.Cnd_yield_schd_no_Label);
		p.Cnd_yield_act_no_Label = p.beansFactory.createLabel("Cnd.yield_act_no_Label");
		p.Cnd_yield_act_no = p.beansFactory.createTextField("Cnd.yield_act_no");
		p.Cnd_yield_act_no.setLabel(p.Cnd_yield_act_no_Label);
		p.Cnd_inst_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_rpt_rmrks_Label");
		p.Cnd_inst_rpt_rmrks = p.beansFactory.createTextField("Cnd.inst_rpt_rmrks");
		p.Cnd_inst_rpt_rmrks.setLabel(p.Cnd_inst_rpt_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_inst_po_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_po_cnt_rmrks_Label");
		p.Cnd_inst_po_cnt_rmrks = p.beansFactory.createTextField("Cnd.inst_po_cnt_rmrks");
		p.Cnd_inst_po_cnt_rmrks.setLabel(p.Cnd_inst_po_cnt_rmrks_Label);
		p.Cnd_oper_inst_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.oper_inst_rpt_rmrks_Label");
		p.Cnd_oper_inst_rpt_rmrks = p.beansFactory.createTextField("Cnd.oper_inst_rpt_rmrks");
		p.Cnd_oper_inst_rpt_rmrks.setLabel(p.Cnd_oper_inst_rpt_rmrks_Label);
		p.Cnd_oper_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.oper_intr_rmrks_Label");
		p.Cnd_oper_intr_rmrks = p.beansFactory.createTextField("Cnd.oper_intr_rmrks");
		p.Cnd_oper_intr_rmrks.setLabel(p.Cnd_oper_intr_rmrks_Label);
		p.Cnd_yield_schd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.yield_schd_intr_rmrks_Label");
		p.Cnd_yield_schd_intr_rmrks = p.beansFactory.createTextField("Cnd.yield_schd_intr_rmrks");
		p.Cnd_yield_schd_intr_rmrks.setLabel(p.Cnd_yield_schd_intr_rmrks_Label);
		p.Cnd_yield_schd_rpt_rmrks_Label = p.beansFactory.createLabel("Cnd.yield_schd_rpt_rmrks_Label");
		p.Cnd_yield_schd_rpt_rmrks = p.beansFactory.createTextField("Cnd.yield_schd_rpt_rmrks");
		p.Cnd_yield_schd_rpt_rmrks.setLabel(p.Cnd_yield_schd_rpt_rmrks_Label);
		p.Cnd_insp_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.insp_cnt_rmrks_Label");
		p.Cnd_insp_cnt_rmrks = p.beansFactory.createTextField("Cnd.insp_cnt_rmrks");
		p.Cnd_insp_cnt_rmrks.setLabel(p.Cnd_insp_cnt_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_itm_mfg_inst_sub_char1_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_sub_char1_Label");
		p.Cnd_itm_mfg_inst_sub_char1 = p.beansFactory.createTextField("Cnd.itm_mfg_inst_sub_char1");
		p.Cnd_itm_mfg_inst_sub_char1.setLabel(p.Cnd_itm_mfg_inst_sub_char1_Label);
		p.Cnd_itm_mfg_inst_sub_char2_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_sub_char2_Label");
		p.Cnd_itm_mfg_inst_sub_char2 = p.beansFactory.createTextField("Cnd.itm_mfg_inst_sub_char2");
		p.Cnd_itm_mfg_inst_sub_char2.setLabel(p.Cnd_itm_mfg_inst_sub_char2_Label);
		p.Cnd_itm_mfg_inst_sub_char3_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_sub_char3_Label");
		p.Cnd_itm_mfg_inst_sub_char3 = p.beansFactory.createTextField("Cnd.itm_mfg_inst_sub_char3");
		p.Cnd_itm_mfg_inst_sub_char3.setLabel(p.Cnd_itm_mfg_inst_sub_char3_Label);
		p.Cnd_mfg_inst_sub_char1_Label = p.beansFactory.createLabel("Cnd.mfg_inst_sub_char1_Label");
		p.Cnd_mfg_inst_sub_char1 = p.beansFactory.createTextField("Cnd.mfg_inst_sub_char1");
		p.Cnd_mfg_inst_sub_char1.setLabel(p.Cnd_mfg_inst_sub_char1_Label);
		p.Cnd_mfg_inst_sub_char2_Label = p.beansFactory.createLabel("Cnd.mfg_inst_sub_char2_Label");
		p.Cnd_mfg_inst_sub_char2 = p.beansFactory.createTextField("Cnd.mfg_inst_sub_char2");
		p.Cnd_mfg_inst_sub_char2.setLabel(p.Cnd_mfg_inst_sub_char2_Label);
		p.Cnd_mfg_inst_sub_char3_Label = p.beansFactory.createLabel("Cnd.mfg_inst_sub_char3_Label");
		p.Cnd_mfg_inst_sub_char3 = p.beansFactory.createTextField("Cnd.mfg_inst_sub_char3");
		p.Cnd_mfg_inst_sub_char3.setLabel(p.Cnd_mfg_inst_sub_char3_Label);
		p.Cnd_yield_schd_sub_char1_Label = p.beansFactory.createLabel("Cnd.yield_schd_sub_char1_Label");
		p.Cnd_yield_schd_sub_char1 = p.beansFactory.createTextField("Cnd.yield_schd_sub_char1");
		p.Cnd_yield_schd_sub_char1.setLabel(p.Cnd_yield_schd_sub_char1_Label);
		p.Cnd_yield_schd_sub_char2_Label = p.beansFactory.createLabel("Cnd.yield_schd_sub_char2_Label");
		p.Cnd_yield_schd_sub_char2 = p.beansFactory.createTextField("Cnd.yield_schd_sub_char2");
		p.Cnd_yield_schd_sub_char2.setLabel(p.Cnd_yield_schd_sub_char2_Label);
		p.Cnd_yield_schd_sub_char3_Label = p.beansFactory.createLabel("Cnd.yield_schd_sub_char3_Label");
		p.Cnd_yield_schd_sub_char3 = p.beansFactory.createTextField("Cnd.yield_schd_sub_char3");
		p.Cnd_yield_schd_sub_char3.setLabel(p.Cnd_yield_schd_sub_char3_Label);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplGrp(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.SpplGrpPanel = p.beansFactory.createPanel("SpplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_mfg_mtd_typ = p.beansFactory.createTableColumn("Rslt.mfg_mtd_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_nm = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.mfg_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_strg_str_ln_cd = p.beansFactory.createTableColumn("Rslt.strg_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_strg_str_ln_nm = p.beansFactory.createTableColumn("Rslt.strg_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_strg_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.strg_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_oper_unit_cd = p.beansFactory.createTableColumn("Rslt.oper_unit_cd", MCColumnType.TEXT);
		p.columnRslt_oper_unit_nm = p.beansFactory.createTableColumn("Rslt.oper_unit_nm", MCColumnType.TEXT);
		p.columnRslt_oper_unit_dec_place = p.beansFactory.createTableColumn("Rslt.oper_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pr_rate = p.beansFactory.createTableColumn("Rslt.pr_rate", MCColumnType.NUMBER);
		p.columnRslt_rqst_dlv_rqst_dt = p.beansFactory.createTableColumn("Rslt.rqst_dlv_rqst_dt", MCColumnType.DATE);
		p.columnRslt_rqst_dlv_rqst_hm = p.beansFactory.createTableColumn("Rslt.rqst_dlv_rqst_hm", MCColumnType.DATE);
		p.columnRslt_st_schd_dt = p.beansFactory.createTableColumn("Rslt.st_schd_dt", MCColumnType.DATE);
		p.columnRslt_st_schd_hm = p.beansFactory.createTableColumn("Rslt.st_schd_hm", MCColumnType.DATE);
		p.columnRslt_ord_st_schd_dt = p.beansFactory.createTableColumn("Rslt.ord_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_st_act_dt = p.beansFactory.createTableColumn("Rslt.st_act_dt", MCColumnType.DATE);
		p.columnRslt_st_act_hm = p.beansFactory.createTableColumn("Rslt.st_act_hm", MCColumnType.DATE);
		p.columnRslt_st_ac_dt = p.beansFactory.createTableColumn("Rslt.st_ac_dt", MCColumnType.DATE);
		p.columnRslt_end_schd_dt = p.beansFactory.createTableColumn("Rslt.end_schd_dt", MCColumnType.DATE);
		p.columnRslt_end_schd_hm = p.beansFactory.createTableColumn("Rslt.end_schd_hm", MCColumnType.DATE);
		p.columnRslt_ord_end_schd_dt = p.beansFactory.createTableColumn("Rslt.ord_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_end_act_dt = p.beansFactory.createTableColumn("Rslt.end_act_dt", MCColumnType.DATE);
		p.columnRslt_end_act_hm = p.beansFactory.createTableColumn("Rslt.end_act_hm", MCColumnType.DATE);
		p.columnRslt_end_ac_dt = p.beansFactory.createTableColumn("Rslt.end_ac_dt", MCColumnType.DATE);
		p.columnRslt_yield_schd_dt = p.beansFactory.createTableColumn("Rslt.yield_schd_dt", MCColumnType.DATE);
		p.columnRslt_yield_schd_hm = p.beansFactory.createTableColumn("Rslt.yield_schd_hm", MCColumnType.DATE);
		p.columnRslt_yield_act_dt = p.beansFactory.createTableColumn("Rslt.yield_act_dt", MCColumnType.DATE);
		p.columnRslt_yield_act_hm = p.beansFactory.createTableColumn("Rslt.yield_act_hm", MCColumnType.DATE);
		p.columnRslt_yield_ac_dt = p.beansFactory.createTableColumn("Rslt.yield_ac_dt", MCColumnType.DATE);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_loc_cd = p.beansFactory.createTableColumn("Rslt.oper_loc_cd", MCColumnType.TEXT);
		p.columnRslt_oper_loc_nm = p.beansFactory.createTableColumn("Rslt.oper_loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_cd = p.beansFactory.createTableColumn("Rslt.oper_str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_nm = p.beansFactory.createTableColumn("Rslt.oper_str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_oper_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.oper_str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_oper_lower_yield = p.beansFactory.createTableColumn("Rslt.oper_lower_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_std_yield = p.beansFactory.createTableColumn("Rslt.oper_std_yield", MCColumnType.NUMBER);
		p.columnRslt_oper_upper_yield = p.beansFactory.createTableColumn("Rslt.oper_upper_yield", MCColumnType.NUMBER);
		p.columnRslt_wip_rate = p.beansFactory.createTableColumn("Rslt.wip_rate", MCColumnType.NUMBER);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_oper_rsrc = p.beansFactory.createTableColumn("Rslt.oper_rsrc", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_inst_dt = p.beansFactory.createTableColumn("Rslt.inst_dt", MCColumnType.DATE);
		p.columnRslt_inst_usr_cd = p.beansFactory.createTableColumn("Rslt.inst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_inst_usr_nm = p.beansFactory.createTableColumn("Rslt.inst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_cd = p.beansFactory.createTableColumn("Rslt.inst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_nm = p.beansFactory.createTableColumn("Rslt.inst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_inst_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.inst_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_oper_intr_rmrks = p.beansFactory.createTableColumn("Rslt.oper_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_oper_inst_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.oper_inst_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_po_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.inst_po_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_disp_pd = p.beansFactory.createTableColumn("Rslt.disp_pd", MCColumnType.TEXT);
		p.columnRslt_itm_lower_yield = p.beansFactory.createTableColumn("Rslt.itm_lower_yield", MCColumnType.NUMBER);
		p.columnRslt_itm_std_yield = p.beansFactory.createTableColumn("Rslt.itm_std_yield", MCColumnType.NUMBER);
		p.columnRslt_itm_upper_yield = p.beansFactory.createTableColumn("Rslt.itm_upper_yield", MCColumnType.NUMBER);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_rev = p.beansFactory.createTableColumn("Rslt.mfg_inst_rev", MCColumnType.NUMBER);
		p.columnRslt_div_seq = p.beansFactory.createTableColumn("Rslt.div_seq", MCColumnType.NUMBER);
		p.columnRslt_mfg_act_no = p.beansFactory.createTableColumn("Rslt.mfg_act_no", MCColumnType.TEXT);
		p.columnRslt_inst_abort_flg = p.beansFactory.createTableColumn("Rslt.inst_abort_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_tgt_flg = p.beansFactory.createTableColumn("Rslt.aprv_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_dt = p.beansFactory.createTableColumn("Rslt.aprv_dt", MCColumnType.DATE);
		p.columnRslt_aprv_tm = p.beansFactory.createTableColumn("Rslt.aprv_tm", MCColumnType.DATE);
		p.columnRslt_aprv_usr_cd = p.beansFactory.createTableColumn("Rslt.aprv_usr_cd", MCColumnType.TEXT);
		p.columnRslt_aprv_usr_nm = p.beansFactory.createTableColumn("Rslt.aprv_usr_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_dpt_cd = p.beansFactory.createTableColumn("Rslt.aprv_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_aprv_dpt_nm = p.beansFactory.createTableColumn("Rslt.aprv_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_rsn = p.beansFactory.createTableColumn("Rslt.aprv_rsn", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_oper_ord_no = p.beansFactory.createTableColumn("Rslt.oper_ord_no", MCColumnType.TEXT);
		p.columnRslt_oper_inst_no = p.beansFactory.createTableColumn("Rslt.oper_inst_no", MCColumnType.TEXT);
		p.columnRslt_oper_act_no = p.beansFactory.createTableColumn("Rslt.oper_act_no", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_unit_typ = p.beansFactory.createTableColumn("Rslt.mfg_inst_unit_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_unit_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_inst_unit_typ_nm", MCColumnType.TEXT);
		p.columnRslt_outsrc_flg = p.beansFactory.createTableColumn("Rslt.outsrc_flg", MCColumnType.CHECK);
		p.columnRslt_schd_chg_flg = p.beansFactory.createTableColumn("Rslt.schd_chg_flg", MCColumnType.CHECK);
		p.columnRslt_unschd_inst_flg = p.beansFactory.createTableColumn("Rslt.unschd_inst_flg", MCColumnType.CHECK);
		p.columnRslt_unschd_act_flg = p.beansFactory.createTableColumn("Rslt.unschd_act_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_wg_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_wg_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_site_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_site_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_site_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_site_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_po_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.po_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_po_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.po_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_yield_oper_flg = p.beansFactory.createTableColumn("Rslt.yield_oper_flg", MCColumnType.CHECK);
		p.columnRslt_yield_oper_ratio = p.beansFactory.createTableColumn("Rslt.yield_oper_ratio", MCColumnType.NUMBER);
		p.columnRslt_oper_inst_grp = p.beansFactory.createTableColumn("Rslt.oper_inst_grp", MCColumnType.TEXT);
		p.columnRslt_yield_schd_no = p.beansFactory.createTableColumn("Rslt.yield_schd_no", MCColumnType.TEXT);
		p.columnRslt_yield_act_no = p.beansFactory.createTableColumn("Rslt.yield_act_no", MCColumnType.TEXT);
		p.columnRslt_yield_rate = p.beansFactory.createTableColumn("Rslt.yield_rate", MCColumnType.NUMBER);
		p.columnRslt_yield_typ = p.beansFactory.createTableColumn("Rslt.yield_typ", MCColumnType.TEXT);
		p.columnRslt_yield_typ_nm = p.beansFactory.createTableColumn("Rslt.yield_typ_nm", MCColumnType.TEXT);
		p.columnRslt_yield_rsn_cd = p.beansFactory.createTableColumn("Rslt.yield_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_yield_rsn_nm = p.beansFactory.createTableColumn("Rslt.yield_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_not_stk_flg = p.beansFactory.createTableColumn("Rslt.not_stk_flg", MCColumnType.CHECK);
		p.columnRslt_insp_sts_typ = p.beansFactory.createTableColumn("Rslt.insp_sts_typ", MCColumnType.TEXT);
		p.columnRslt_insp_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_yield_schd_intr_rmrks = p.beansFactory.createTableColumn("Rslt.yield_schd_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_yield_schd_rpt_rmrks = p.beansFactory.createTableColumn("Rslt.yield_schd_rpt_rmrks", MCColumnType.TEXT);
		p.columnRslt_insp_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.insp_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_sub_char1 = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_sub_char1", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_sub_char2 = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_sub_char2", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_sub_char3 = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_sub_char3", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_sub_char1 = p.beansFactory.createTableColumn("Rslt.mfg_inst_sub_char1", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_sub_char2 = p.beansFactory.createTableColumn("Rslt.mfg_inst_sub_char2", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_sub_char3 = p.beansFactory.createTableColumn("Rslt.mfg_inst_sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_yield_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.yield_schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_yield_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.yield_schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_yield_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.yield_schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
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
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010 = p.beansFactory.createButton("Btn.open_MSBCP1010", "open");
		p.Btn_open_MSBCP1100 = p.beansFactory.createButton("Btn.open_MSBCP1100", "open");
	}

	/**
	 * [DispUnit1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit1(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.DispUnit1Panel.setBorder(p.DispUnit1TitledBorder);
		p.add(p.DispUnit1Panel);
		p.setLastBeans(p.DispUnit1Panel);
		p.DispUnit1Panel.setNextBeans(p.DispUnit2Panel);
		p.DispUnit1Panel.setValueCheck(false);
		p.DispUnit1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnit1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit2(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.DispUnit2Panel.setBorder(p.DispUnit2TitledBorder);
		p.add(p.DispUnit2Panel);
		p.DispUnit2Panel.setNextBeans(p.StsPanel);
		p.DispUnit2Panel.setValueCheck(false);
		p.DispUnit2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnit2Panel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.UnschdActSrchCndPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [UnschdActSrchCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUnschdActSrchCnd(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.UnschdActSrchCndPanel.setBorder(p.UnschdActSrchCndTitledBorder);
		p.add(p.UnschdActSrchCndPanel);
		p.UnschdActSrchCndPanel.setNextBeans(p.TopPanel);
		p.UnschdActSrchCndPanel.setValueCheck(false);
		p.UnschdActSrchCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.UnschdActSrchCndPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_MfgInstPrSrch p) {
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBCP_MfgInstPrSrch p) {
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
	protected static void jbInitTab1(MSBCP_MfgInstPrSrch p) {
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
	protected static void jbInitTab2(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ItmGrpPanel, null);
		p.Tab2Panel.setLastBeans(p.ItmGrpPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.SpplGrpPanel, null);
		p.Tab3Panel.setLastBeans(p.SpplGrpPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DispUnit1Panel.setLastBeans(p.Cnd_disp_unit1_Group);
		p.Cnd_disp_unit1_Group.setFirstBeans(p.Cnd_disp_unit1_HDR);
		p.Cnd_disp_unit1_HDR.setActionCommand("HDR");
		p.Cnd_disp_unit1_Group.add(p.Cnd_disp_unit1_HDR);
		p.DispUnit1Panel.add(p.Cnd_disp_unit1_HDR);
		p.Cnd_disp_unit1_HDR.setNextBeans(p.Cnd_disp_unit1_OPER);
		p.Cnd_disp_unit1_OPER.setActionCommand("OPER");
		p.Cnd_disp_unit1_Group.add(p.Cnd_disp_unit1_OPER);
		p.DispUnit1Panel.add(p.Cnd_disp_unit1_OPER);
		p.Cnd_disp_unit1_OPER.setNextBeans(p.Cnd_disp_unit1_YIELD);
		p.Cnd_disp_unit1_YIELD.setActionCommand("YIELD");
		p.Cnd_disp_unit1_Group.add(p.Cnd_disp_unit1_YIELD);
		p.DispUnit1Panel.add(p.Cnd_disp_unit1_YIELD);
		p.Cnd_disp_unit1_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.disp_unit1_META);
		p.DispUnit2Panel.setLastBeans(p.Cnd_disp_unit2_Group);
		p.Cnd_disp_unit2_Group.setFirstBeans(p.Cnd_disp_unit2_INST);
		p.Cnd_disp_unit2_INST.setActionCommand("INST");
		p.Cnd_disp_unit2_Group.add(p.Cnd_disp_unit2_INST);
		p.DispUnit2Panel.add(p.Cnd_disp_unit2_INST);
		p.Cnd_disp_unit2_INST.setNextBeans(p.Cnd_disp_unit2_ACT);
		p.Cnd_disp_unit2_ACT.setActionCommand("ACT");
		p.Cnd_disp_unit2_Group.add(p.Cnd_disp_unit2_ACT);
		p.DispUnit2Panel.add(p.Cnd_disp_unit2_ACT);
		p.Cnd_disp_unit2_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.disp_unit2_META);
		p.StsPanel.add(p.Cnd_tmp_sts_sav_flg);
		p.StsPanel.setLastBeans(p.Cnd_tmp_sts_sav_flg);
		p.Cnd_tmp_sts_sav_flg.setNextBeans(p.Cnd_tmp_sts_ord_flg);
		p.Cnd_tmp_sts_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.tmp_sts_sav_flg_META);
		p.StsPanel.add(p.Cnd_tmp_sts_ord_flg);
		p.Cnd_tmp_sts_ord_flg.setNextBeans(p.Cnd_tmp_sts_stt_flg);
		p.Cnd_tmp_sts_ord_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.tmp_sts_ord_flg_META);
		p.StsPanel.add(p.Cnd_tmp_sts_stt_flg);
		p.Cnd_tmp_sts_stt_flg.setNextBeans(p.Cnd_tmp_sts_cmpl_flg);
		p.Cnd_tmp_sts_stt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.tmp_sts_stt_flg_META);
		p.StsPanel.add(p.Cnd_tmp_sts_cmpl_flg);
		p.Cnd_tmp_sts_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.tmp_sts_cmpl_flg_META);
		p.UnschdActSrchCndPanel.add(p.Cnd_not_unschd_act_flg);
		p.UnschdActSrchCndPanel.setLastBeans(p.Cnd_not_unschd_act_flg);
		p.Cnd_not_unschd_act_flg.setNextBeans(p.Cnd_unschd_act_flg);
		p.Cnd_not_unschd_act_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.not_unschd_act_flg_META);
		p.UnschdActSrchCndPanel.add(p.Cnd_unschd_act_flg);
		p.Cnd_unschd_act_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.unschd_act_flg_META);
		p.CndPanel.add(p.Cnd_st_schd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_st_schd_dt_p_PPanel);
		p.Cnd_st_schd_dt_p_PPanel.setNextBeans(p.Cnd_end_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_end_schd_dt_p_PPanel);
		p.Cnd_end_schd_dt_p_PPanel.setNextBeans(p.Cnd_st_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_st_act_dt_p_PPanel);
		p.Cnd_st_act_dt_p_PPanel.setNextBeans(p.Cnd_end_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_end_act_dt_p_PPanel);
		p.Cnd_end_act_dt_p_PPanel.setNextBeans(p.Cnd_yield_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_yield_schd_dt_p_PPanel);
		p.Cnd_yield_schd_dt_p_PPanel.setNextBeans(p.Cnd_yield_act_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_yield_act_dt_p_PPanel);
		p.Cnd_yield_act_dt_p_PPanel.setNextBeans(p.Cnd_rqst_dlv_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_rqst_dlv_rqst_dt_p_PPanel);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_inst_dt_fr);
		p.CndPanel.add(p.Cnd_inst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_inst_dt_fr);
		p.Cnd_inst_dt_fr.setNextBeans(p.Cnd_inst_dt_to);
		p.Cnd_inst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_dt_fr_META);
		p.Cnd_inst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inst_dt_to_Label);
		p.CndPanel.add(p.Cnd_inst_dt_to);
		p.Cnd_inst_dt_to.setNextBeans(p.Cnd_aprv_dt_fr);
		p.Cnd_inst_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_dt_to_META);
		p.Cnd_inst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_fr);
		p.Cnd_aprv_dt_fr.setNextBeans(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_dt_fr_META);
		p.Cnd_aprv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_aprv_dt_to_Label);
		p.CndPanel.add(p.Cnd_aprv_dt_to);
		p.Cnd_aprv_dt_to.setNextBeans(p.Cnd_st_ac_dt_fr);
		p.Cnd_aprv_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_dt_to_META);
		p.Cnd_aprv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_st_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_st_ac_dt_fr);
		p.Cnd_st_ac_dt_fr.setNextBeans(p.Cnd_st_ac_dt_to);
		p.Cnd_st_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.st_ac_dt_fr_META);
		p.Cnd_st_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_st_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_st_ac_dt_to);
		p.Cnd_st_ac_dt_to.setNextBeans(p.Cnd_end_ac_dt_fr);
		p.Cnd_st_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.st_ac_dt_to_META);
		p.Cnd_st_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_end_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_end_ac_dt_fr);
		p.Cnd_end_ac_dt_fr.setNextBeans(p.Cnd_end_ac_dt_to);
		p.Cnd_end_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.end_ac_dt_fr_META);
		p.Cnd_end_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_end_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_end_ac_dt_to);
		p.Cnd_end_ac_dt_to.setNextBeans(p.Cnd_yield_ac_dt_fr);
		p.Cnd_end_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.end_ac_dt_to_META);
		p.Cnd_end_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_yield_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_yield_ac_dt_fr);
		p.Cnd_yield_ac_dt_fr.setNextBeans(p.Cnd_yield_ac_dt_to);
		p.Cnd_yield_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_ac_dt_fr_META);
		p.Cnd_yield_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_yield_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_yield_ac_dt_to);
		p.Cnd_yield_ac_dt_to.setNextBeans(p.Cnd_upd_ts_fr);
		p.Cnd_yield_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_ac_dt_to_META);
		p.Cnd_yield_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_fr_Label);
		p.CndPanel.add(p.Cnd_upd_ts_fr);
		p.Cnd_upd_ts_fr.setNextBeans(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.upd_ts_fr_META);
		p.Cnd_upd_ts_fr.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_upd_ts_to_Label);
		p.CndPanel.add(p.Cnd_upd_ts_to);
		p.Cnd_upd_ts_to.setNextBeans(p.Cnd_pr_rate_fr);
		p.Cnd_upd_ts_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.upd_ts_to_META);
		p.Cnd_upd_ts_to.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.CndPanel.add(p.Cnd_pr_rate_fr_Label);
		p.CndPanel.add(p.Cnd_pr_rate_fr);
		p.Cnd_pr_rate_fr.setNextBeans(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.pr_rate_fr_META);
		p.CndPanel.add(p.Cnd_pr_rate_to_Label);
		p.CndPanel.add(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_to.setNextBeans(p.Cnd_mfg_mtd_typ);
		p.Cnd_pr_rate_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.pr_rate_to_META);
		p.Cnd_mfg_mtd_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_mtd_typ, true);
		p.Cnd_mfg_mtd_typ.setLinkBeans(p.Cnd_mfg_mtd_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ);
		p.Cnd_mfg_mtd_typ.setNextBeans(p.Cnd_mfg_mtd_typ_nm);
		p.Cnd_mfg_mtd_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_mtd_typ_META);
		p.CndPanel.add(p.Cnd_mfg_mtd_typ_nm);
		p.Cnd_mfg_mtd_typ_nm.setNextBeans(p.Cnd_mfg_loc_site_cd);
		p.Cnd_mfg_mtd_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_mtd_typ_nm_META);
		p.Cnd_mfg_loc_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_site_cd, true);
		p.Cnd_mfg_loc_site_cd.setLinkBeans(p.Cnd_mfg_loc_site_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_site_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_site_cd);
		p.Cnd_mfg_loc_site_cd.setNextBeans(p.Cnd_mfg_loc_site_nm);
		p.Cnd_mfg_loc_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_site_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_site_nm);
		p.Cnd_mfg_loc_site_nm.setNextBeans(p.Cnd_mfg_loc_wg_cd);
		p.Cnd_mfg_loc_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_site_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_site_nm, true);
		p.Cnd_mfg_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_wg_cd, true);
		p.Cnd_mfg_loc_wg_cd.setLinkBeans(p.Cnd_mfg_loc_wg_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_cd);
		p.Cnd_mfg_loc_wg_cd.setNextBeans(p.Cnd_mfg_loc_wg_nm);
		p.Cnd_mfg_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_wg_nm);
		p.Cnd_mfg_loc_wg_nm.setNextBeans(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_wg_nm, true);
		p.Cnd_mfg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_cd, true);
		p.Cnd_mfg_loc_grp_cd.setLinkBeans(p.Cnd_mfg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_grp_cd.setNextBeans(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_nm.setNextBeans(p.Cnd_strg_loc_grp_cd);
		p.Cnd_mfg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_nm, true);
		p.Cnd_strg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_cd, true);
		p.Cnd_strg_loc_grp_cd.setLinkBeans(p.Cnd_strg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_loc_grp_cd.setNextBeans(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_strg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Cnd_mfg_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_cd, true);
		p.Cnd_mfg_str_ln_cd.setLinkBeans(p.Cnd_mfg_str_ln_nm);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_str_ln_cd);
		p.Cnd_mfg_str_ln_cd.setNextBeans(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_mfg_str_ln_nm);
		p.Cnd_mfg_str_ln_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_mfg_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_strg_str_ln_cd);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.Cnd_strg_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_str_ln_cd, true);
		p.Cnd_strg_str_ln_cd.setLinkBeans(p.Cnd_strg_str_ln_nm);
		p.CndPanel.add(p.Cnd_strg_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_strg_str_ln_cd);
		p.Cnd_strg_str_ln_cd.setNextBeans(p.Cnd_strg_str_ln_nm);
		p.Cnd_strg_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_strg_str_ln_nm);
		p.Cnd_strg_str_ln_nm.setNextBeans(p.Cnd_oper_loc_cd);
		p.Cnd_strg_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.strg_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_oper_loc_cd_Label);
		p.CndPanel.add(p.Cnd_oper_loc_cd);
		p.Cnd_oper_loc_cd.setNextBeans(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_loc_cd_META);
		p.Cnd_oper_loc_cd.addLinkBeans(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_loc_cd, true);
		p.CndPanel.add(p.Cnd_oper_loc_nm);
		p.Cnd_oper_loc_nm.setNextBeans(p.Cnd_oper_str_ln_cd);
		p.Cnd_oper_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_loc_nm, true);
		p.Cnd_oper_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_str_ln_cd, true);
		p.Cnd_oper_str_ln_cd.setLinkBeans(p.Cnd_oper_str_ln_nm);
		p.CndPanel.add(p.Cnd_oper_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_oper_str_ln_cd);
		p.Cnd_oper_str_ln_cd.setNextBeans(p.Cnd_oper_str_ln_nm);
		p.Cnd_oper_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_str_ln_cd_META);
		p.CndPanel.add(p.Cnd_oper_str_ln_nm);
		p.Cnd_oper_str_ln_nm.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_oper_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_str_ln_nm, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_abort_flg);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_abort_flg);
		p.Cnd_abort_flg.setNextBeans(p.Cnd_inc_yield_oper_flg);
		p.Cnd_abort_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.abort_flg_META);
		p.CndPanel.add(p.Cnd_inc_yield_oper_flg);
		p.Cnd_inc_yield_oper_flg.setNextBeans(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_inc_yield_oper_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inc_yield_oper_flg_META);
		p.Cnd_mfg_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_aprv_sts_typ, true);
		p.Cnd_mfg_aprv_sts_typ.setLinkBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ);
		p.Cnd_mfg_aprv_sts_typ.setNextBeans(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_mfg_aprv_sts_typ_nm);
		p.Cnd_mfg_aprv_sts_typ_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_mfg_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_aprv_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_inst_usr_cd);
		p.CndPanel.add(p.Cnd_inst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_inst_usr_cd);
		p.Cnd_inst_usr_cd.setNextBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_usr_cd_META);
		p.Cnd_inst_usr_cd.addLinkBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_usr_cd, true);
		p.CndPanel.add(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_nm.setNextBeans(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_usr_nm, true);
		p.CndPanel.add(p.Cnd_inst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_dpt_cd.setNextBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_dpt_cd_META);
		p.Cnd_inst_dpt_cd.addLinkBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_nm.setNextBeans(p.Cnd_act_usr_cd);
		p.Cnd_inst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_act_usr_cd_Label);
		p.CndPanel.add(p.Cnd_act_usr_cd);
		p.Cnd_act_usr_cd.setNextBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.act_usr_cd_META);
		p.Cnd_act_usr_cd.addLinkBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_usr_cd, true);
		p.CndPanel.add(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_nm.setNextBeans(p.Cnd_act_dpt_cd);
		p.Cnd_act_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.act_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_act_usr_nm, true);
		p.Cnd_act_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_dpt_cd, true);
		p.Cnd_act_dpt_cd.setLinkBeans(p.Cnd_act_dpt_nm);
		p.CndPanel.add(p.Cnd_act_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_act_dpt_cd);
		p.Cnd_act_dpt_cd.setNextBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.act_dpt_cd_META);
		p.CndPanel.add(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_nm.setNextBeans(p.Cnd_oper_usr_cd);
		p.Cnd_act_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.act_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_act_dpt_nm, true);
		p.CndPanel.add(p.Cnd_oper_usr_cd_Label);
		p.CndPanel.add(p.Cnd_oper_usr_cd);
		p.Cnd_oper_usr_cd.setNextBeans(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_usr_cd_META);
		p.Cnd_oper_usr_cd.addLinkBeans(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_usr_cd, true);
		p.CndPanel.add(p.Cnd_oper_usr_nm);
		p.Cnd_oper_usr_nm.setNextBeans(p.Cnd_oper_rsrc);
		p.Cnd_oper_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_usr_nm, true);
		p.CndPanel.add(p.Cnd_oper_rsrc_Label);
		p.CndPanel.add(p.Cnd_oper_rsrc);
		p.Cnd_oper_rsrc.setNextBeans(p.Cnd_aprv_usr_cd);
		p.Cnd_oper_rsrc.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_rsrc_META);
		p.setPluralValueEnable(p.Cnd_oper_rsrc, true);
		p.CndPanel.add(p.Cnd_aprv_usr_cd_Label);
		p.CndPanel.add(p.Cnd_aprv_usr_cd);
		p.Cnd_aprv_usr_cd.setNextBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_usr_cd_META);
		p.Cnd_aprv_usr_cd.addLinkBeans(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_usr_cd, true);
		p.CndPanel.add(p.Cnd_aprv_usr_nm);
		p.Cnd_aprv_usr_nm.setNextBeans(p.Cnd_aprv_dpt_cd);
		p.Cnd_aprv_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_aprv_usr_nm, true);
		p.Cnd_aprv_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_dpt_cd, true);
		p.Cnd_aprv_dpt_cd.setLinkBeans(p.Cnd_aprv_dpt_nm);
		p.CndPanel.add(p.Cnd_aprv_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_aprv_dpt_cd);
		p.Cnd_aprv_dpt_cd.setNextBeans(p.Cnd_aprv_dpt_nm);
		p.Cnd_aprv_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_dpt_cd_META);
		p.CndPanel.add(p.Cnd_aprv_dpt_nm);
		p.Cnd_aprv_dpt_nm.setNextBeans(p.Cnd_mfg_inst_unit_typ);
		p.Cnd_aprv_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.aprv_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_aprv_dpt_nm, true);
		p.Cnd_mfg_inst_unit_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_inst_unit_typ, true);
		p.Cnd_mfg_inst_unit_typ.setLinkBeans(p.Cnd_mfg_inst_unit_typ_nm);
		p.CndPanel.add(p.Cnd_mfg_inst_unit_typ_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_unit_typ);
		p.Cnd_mfg_inst_unit_typ.setNextBeans(p.Cnd_mfg_inst_unit_typ_nm);
		p.Cnd_mfg_inst_unit_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_unit_typ_META);
		p.CndPanel.add(p.Cnd_mfg_inst_unit_typ_nm);
		p.Cnd_mfg_inst_unit_typ_nm.setNextBeans(p.Cnd_po_aprv_sts_typ);
		p.Cnd_mfg_inst_unit_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_unit_typ_nm_META);
		p.Cnd_po_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_po_aprv_sts_typ, true);
		p.Cnd_po_aprv_sts_typ.setLinkBeans(p.Cnd_po_aprv_sts_typ_nm);
		p.CndPanel.add(p.Cnd_po_aprv_sts_typ_Label);
		p.CndPanel.add(p.Cnd_po_aprv_sts_typ);
		p.Cnd_po_aprv_sts_typ.setNextBeans(p.Cnd_po_aprv_sts_typ_nm);
		p.Cnd_po_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.po_aprv_sts_typ_META);
		p.CndPanel.add(p.Cnd_po_aprv_sts_typ_nm);
		p.Cnd_po_aprv_sts_typ_nm.setNextBeans(p.Cnd_yield_typ);
		p.Cnd_po_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.po_aprv_sts_typ_nm_META);
		p.Cnd_yield_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_yield_typ, true);
		p.Cnd_yield_typ.setLinkBeans(p.Cnd_yield_typ_nm);
		p.CndPanel.add(p.Cnd_yield_typ_Label);
		p.CndPanel.add(p.Cnd_yield_typ);
		p.Cnd_yield_typ.setNextBeans(p.Cnd_yield_typ_nm);
		p.Cnd_yield_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_typ_META);
		p.CndPanel.add(p.Cnd_yield_typ_nm);
		p.Cnd_yield_typ_nm.setNextBeans(p.Cnd_yield_rsn_cd);
		p.Cnd_yield_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_typ_nm_META);
		p.Cnd_yield_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_yield_rsn_cd, true);
		p.Cnd_yield_rsn_cd.setLinkBeans(p.Cnd_yield_rsn_nm);
		p.CndPanel.add(p.Cnd_yield_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_yield_rsn_cd);
		p.Cnd_yield_rsn_cd.setNextBeans(p.Cnd_yield_rsn_nm);
		p.Cnd_yield_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_rsn_cd_META);
		p.CndPanel.add(p.Cnd_yield_rsn_nm);
		p.Cnd_yield_rsn_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_yield_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_rsn_nm_META);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_itm_ord_no);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.gd_nm_META);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_oper_ord_no);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_oper_ord_no_Label);
		p.CndPanel.add(p.Cnd_oper_ord_no);
		p.Cnd_oper_ord_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_oper_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_ord_no_META);
		p.setPluralValueEnable(p.Cnd_oper_ord_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_itm_mfg_inst_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_oper_inst_no);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.CndPanel.add(p.Cnd_oper_inst_no_Label);
		p.CndPanel.add(p.Cnd_oper_inst_no);
		p.Cnd_oper_inst_no.setNextBeans(p.Cnd_oper_act_no);
		p.Cnd_oper_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_inst_no_META);
		p.setPluralValueEnable(p.Cnd_oper_inst_no, true);
		p.CndPanel.add(p.Cnd_oper_act_no_Label);
		p.CndPanel.add(p.Cnd_oper_act_no);
		p.Cnd_oper_act_no.setNextBeans(p.Cnd_yield_schd_no);
		p.Cnd_oper_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_act_no_META);
		p.setPluralValueEnable(p.Cnd_oper_act_no, true);
		p.CndPanel.add(p.Cnd_yield_schd_no_Label);
		p.CndPanel.add(p.Cnd_yield_schd_no);
		p.Cnd_yield_schd_no.setNextBeans(p.Cnd_yield_act_no);
		p.Cnd_yield_schd_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_no_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_no, true);
		p.CndPanel.add(p.Cnd_yield_act_no_Label);
		p.CndPanel.add(p.Cnd_yield_act_no);
		p.Cnd_yield_act_no.setNextBeans(p.Cnd_inst_rpt_rmrks);
		p.Cnd_yield_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_act_no_META);
		p.setPluralValueEnable(p.Cnd_yield_act_no, true);
		p.CndPanel.add(p.Cnd_inst_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_rpt_rmrks);
		p.Cnd_inst_rpt_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_inst_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inst_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_inst_po_cnt_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_inst_po_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_po_cnt_rmrks);
		p.Cnd_inst_po_cnt_rmrks.setNextBeans(p.Cnd_oper_inst_rpt_rmrks);
		p.Cnd_inst_po_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.inst_po_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_inst_po_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_oper_inst_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_oper_inst_rpt_rmrks);
		p.Cnd_oper_inst_rpt_rmrks.setNextBeans(p.Cnd_oper_intr_rmrks);
		p.Cnd_oper_inst_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_inst_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_oper_inst_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_oper_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_oper_intr_rmrks);
		p.Cnd_oper_intr_rmrks.setNextBeans(p.Cnd_yield_schd_intr_rmrks);
		p.Cnd_oper_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.oper_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_oper_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_yield_schd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_yield_schd_intr_rmrks);
		p.Cnd_yield_schd_intr_rmrks.setNextBeans(p.Cnd_yield_schd_rpt_rmrks);
		p.Cnd_yield_schd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_yield_schd_rpt_rmrks_Label);
		p.CndPanel.add(p.Cnd_yield_schd_rpt_rmrks);
		p.Cnd_yield_schd_rpt_rmrks.setNextBeans(p.Cnd_insp_cnt_rmrks);
		p.Cnd_yield_schd_rpt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_rpt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_rpt_rmrks, true);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks);
		p.Cnd_insp_cnt_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_insp_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.insp_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_insp_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_itm_mfg_inst_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char1_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char1);
		p.Cnd_itm_mfg_inst_sub_char1.setNextBeans(p.Cnd_itm_mfg_inst_sub_char2);
		p.Cnd_itm_mfg_inst_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.itm_mfg_inst_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_sub_char1, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char2_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char2);
		p.Cnd_itm_mfg_inst_sub_char2.setNextBeans(p.Cnd_itm_mfg_inst_sub_char3);
		p.Cnd_itm_mfg_inst_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.itm_mfg_inst_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_sub_char2, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char3_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_sub_char3);
		p.Cnd_itm_mfg_inst_sub_char3.setNextBeans(p.Cnd_mfg_inst_sub_char1);
		p.Cnd_itm_mfg_inst_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.itm_mfg_inst_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_sub_char3, true);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char1_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char1);
		p.Cnd_mfg_inst_sub_char1.setNextBeans(p.Cnd_mfg_inst_sub_char2);
		p.Cnd_mfg_inst_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_sub_char1, true);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char2_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char2);
		p.Cnd_mfg_inst_sub_char2.setNextBeans(p.Cnd_mfg_inst_sub_char3);
		p.Cnd_mfg_inst_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_sub_char2, true);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char3_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_sub_char3);
		p.Cnd_mfg_inst_sub_char3.setNextBeans(p.Cnd_yield_schd_sub_char1);
		p.Cnd_mfg_inst_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.mfg_inst_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_sub_char3, true);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char1);
		p.Cnd_yield_schd_sub_char1.setNextBeans(p.Cnd_yield_schd_sub_char2);
		p.Cnd_yield_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_sub_char1, true);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char2);
		p.Cnd_yield_schd_sub_char2.setNextBeans(p.Cnd_yield_schd_sub_char3);
		p.Cnd_yield_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_sub_char2, true);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_yield_schd_sub_char3);
		p.Cnd_yield_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1070.CndR.yield_schd_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_yield_schd_sub_char3, true);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.SpplGrpPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplGrpPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setValueCheck(false);
		p.ItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplGrp(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.SpplGrpPanel.setValueCheck(false);
		p.SpplGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_MfgInstPrSrch p) {
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
	protected static void jbInitRPnl(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_MfgInstPrSrch p) {
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
	protected static void jbInitBtn(MSBCP_MfgInstPrSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_open_MSBCP1010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP1010);
		p.Btn_open_MSBCP1010.setNextBeans(p.Btn_open_MSBCP1100);
		p.BtnPanel.add(p.Btn_open_MSBCP1100);
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
		MSBCP_MfgInstPrSrch_MC.mcInitDispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitDispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitSts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitUnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitTop((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitFold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitTab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitTab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitTab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitSpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitCtrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitRPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitRslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.mcInitBtn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_INST_HDR]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__HDR_Btn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_INST_OPER]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__OPER_Btn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_INST_YIELD]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__INST__YIELD_Btn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_ACT_HDR]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__HDR_Btn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_ACT_OPER]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__OPER_Btn((MSBCP_MfgInstPrSrch)this);

		// [SRCH_ACT_YIELD]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitSRCH__ACT__YIELD_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_INST_HDR]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__HDR_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_INST_OPER]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__OPER_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_INST_YIELD]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__INST__YIELD_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_ACT_HDR]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__HDR_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_ACT_OPER]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__OPER_Btn((MSBCP_MfgInstPrSrch)this);

		// [REF_ACT_YIELD]ステータスのモードの設定
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_DispUnit1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_DispUnit2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Sts((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_UnschdActSrchCnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Top((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Fold((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Tab1((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Tab2((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Tab3((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Cnd((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_ItmGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_SpplGrp((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Ctrl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_RPnl((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Rslt((MSBCP_MfgInstPrSrch)this);
		MSBCP_MfgInstPrSrch_MC.statusInitREF__ACT__YIELD_Btn((MSBCP_MfgInstPrSrch)this);

	}

	/**
	 *  [DispUnit1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit1(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [DispUnit2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit2(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [UnschdActSrchCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUnschdActSrchCnd(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_MfgInstPrSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_MfgInstPrSrch p) {
		p.Cnd_disp_unit1_Group.addAllListener(p);
		p.Cnd_disp_unit1_HDR.addAllListener(p);
		p.Cnd_disp_unit1_OPER.addAllListener(p);
		p.Cnd_disp_unit1_YIELD.addAllListener(p);
		p.Cnd_disp_unit2_Group.addAllListener(p);
		p.Cnd_disp_unit2_INST.addAllListener(p);
		p.Cnd_disp_unit2_ACT.addAllListener(p);
		p.Cnd_tmp_sts_sav_flg.addAllListener(p);
		p.Cnd_tmp_sts_ord_flg.addAllListener(p);
		p.Cnd_tmp_sts_stt_flg.addAllListener(p);
		p.Cnd_tmp_sts_cmpl_flg.addAllListener(p);
		p.Cnd_not_unschd_act_flg.addAllListener(p);
		p.Cnd_unschd_act_flg.addAllListener(p);
		p.Cnd_inst_dt_fr.setListListener(p);
		p.Cnd_inst_dt_fr.addAllListener(p);
		p.Cnd_inst_dt_to.setListListener(p);
		p.Cnd_inst_dt_to.addAllListener(p);
		p.Cnd_aprv_dt_fr.setListListener(p);
		p.Cnd_aprv_dt_fr.addAllListener(p);
		p.Cnd_aprv_dt_to.setListListener(p);
		p.Cnd_aprv_dt_to.addAllListener(p);
		p.Cnd_st_ac_dt_fr.setListListener(p);
		p.Cnd_st_ac_dt_fr.addAllListener(p);
		p.Cnd_st_ac_dt_to.setListListener(p);
		p.Cnd_st_ac_dt_to.addAllListener(p);
		p.Cnd_end_ac_dt_fr.setListListener(p);
		p.Cnd_end_ac_dt_fr.addAllListener(p);
		p.Cnd_end_ac_dt_to.setListListener(p);
		p.Cnd_end_ac_dt_to.addAllListener(p);
		p.Cnd_yield_ac_dt_fr.setListListener(p);
		p.Cnd_yield_ac_dt_fr.addAllListener(p);
		p.Cnd_yield_ac_dt_to.setListListener(p);
		p.Cnd_yield_ac_dt_to.addAllListener(p);
		p.Cnd_upd_ts_fr.setListListener(p);
		p.Cnd_upd_ts_fr.addAllListener(p);
		p.Cnd_upd_ts_to.setListListener(p);
		p.Cnd_upd_ts_to.addAllListener(p);
		p.Cnd_pr_rate_fr.setListListener(p);
		p.Cnd_pr_rate_fr.addAllListener(p);
		p.Cnd_pr_rate_to.setListListener(p);
		p.Cnd_pr_rate_to.addAllListener(p);
		p.Cnd_mfg_mtd_typ.setListListener(p);
		p.Cnd_mfg_mtd_typ.addAllListener(p);
		p.Cnd_mfg_mtd_typ_nm.setListListener(p);
		p.Cnd_mfg_mtd_typ_nm.addAllListener(p);
		p.Cnd_mfg_loc_site_cd.setListListener(p);
		p.Cnd_mfg_loc_site_cd.addAllListener(p);
		p.Cnd_mfg_loc_site_nm.setListListener(p);
		p.Cnd_mfg_loc_site_nm.addAllListener(p);
		p.Cnd_mfg_loc_wg_cd.setListListener(p);
		p.Cnd_mfg_loc_wg_cd.addAllListener(p);
		p.Cnd_mfg_loc_wg_nm.setListListener(p);
		p.Cnd_mfg_loc_wg_nm.addAllListener(p);
		p.Cnd_mfg_loc_grp_cd.setListListener(p);
		p.Cnd_mfg_loc_grp_cd.addAllListener(p);
		p.Cnd_mfg_loc_grp_nm.setListListener(p);
		p.Cnd_mfg_loc_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_grp_cd.setListListener(p);
		p.Cnd_strg_loc_grp_cd.addAllListener(p);
		p.Cnd_strg_loc_grp_nm.setListListener(p);
		p.Cnd_strg_loc_grp_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_mfg_str_ln_cd.setListListener(p);
		p.Cnd_mfg_str_ln_cd.addAllListener(p);
		p.Cnd_mfg_str_ln_nm.setListListener(p);
		p.Cnd_mfg_str_ln_nm.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_strg_str_ln_cd.setListListener(p);
		p.Cnd_strg_str_ln_cd.addAllListener(p);
		p.Cnd_strg_str_ln_nm.setListListener(p);
		p.Cnd_strg_str_ln_nm.addAllListener(p);
		p.Cnd_oper_loc_cd.setListListener(p);
		p.Cnd_oper_loc_cd.addAllListener(p);
		p.Cnd_oper_loc_nm.setListListener(p);
		p.Cnd_oper_loc_nm.addAllListener(p);
		p.Cnd_oper_str_ln_cd.setListListener(p);
		p.Cnd_oper_str_ln_cd.addAllListener(p);
		p.Cnd_oper_str_ln_nm.setListListener(p);
		p.Cnd_oper_str_ln_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_abort_flg.addAllListener(p);
		p.Cnd_inc_yield_oper_flg.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ.addAllListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_inst_usr_cd.setListListener(p);
		p.Cnd_inst_usr_cd.addAllListener(p);
		p.Cnd_inst_usr_nm.setListListener(p);
		p.Cnd_inst_usr_nm.addAllListener(p);
		p.Cnd_inst_dpt_cd.setListListener(p);
		p.Cnd_inst_dpt_cd.addAllListener(p);
		p.Cnd_inst_dpt_nm.setListListener(p);
		p.Cnd_inst_dpt_nm.addAllListener(p);
		p.Cnd_act_usr_cd.setListListener(p);
		p.Cnd_act_usr_cd.addAllListener(p);
		p.Cnd_act_usr_nm.setListListener(p);
		p.Cnd_act_usr_nm.addAllListener(p);
		p.Cnd_act_dpt_cd.setListListener(p);
		p.Cnd_act_dpt_cd.addAllListener(p);
		p.Cnd_act_dpt_nm.setListListener(p);
		p.Cnd_act_dpt_nm.addAllListener(p);
		p.Cnd_oper_usr_cd.setListListener(p);
		p.Cnd_oper_usr_cd.addAllListener(p);
		p.Cnd_oper_usr_nm.setListListener(p);
		p.Cnd_oper_usr_nm.addAllListener(p);
		p.Cnd_oper_rsrc.setListListener(p);
		p.Cnd_oper_rsrc.addAllListener(p);
		p.Cnd_aprv_usr_cd.setListListener(p);
		p.Cnd_aprv_usr_cd.addAllListener(p);
		p.Cnd_aprv_usr_nm.setListListener(p);
		p.Cnd_aprv_usr_nm.addAllListener(p);
		p.Cnd_aprv_dpt_cd.setListListener(p);
		p.Cnd_aprv_dpt_cd.addAllListener(p);
		p.Cnd_aprv_dpt_nm.setListListener(p);
		p.Cnd_aprv_dpt_nm.addAllListener(p);
		p.Cnd_mfg_inst_unit_typ.setListListener(p);
		p.Cnd_mfg_inst_unit_typ.addAllListener(p);
		p.Cnd_mfg_inst_unit_typ_nm.setListListener(p);
		p.Cnd_mfg_inst_unit_typ_nm.addAllListener(p);
		p.Cnd_po_aprv_sts_typ.setListListener(p);
		p.Cnd_po_aprv_sts_typ.addAllListener(p);
		p.Cnd_po_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_po_aprv_sts_typ_nm.addAllListener(p);
		p.Cnd_yield_typ.setListListener(p);
		p.Cnd_yield_typ.addAllListener(p);
		p.Cnd_yield_typ_nm.setListListener(p);
		p.Cnd_yield_typ_nm.addAllListener(p);
		p.Cnd_yield_rsn_cd.setListListener(p);
		p.Cnd_yield_rsn_cd.addAllListener(p);
		p.Cnd_yield_rsn_nm.setListListener(p);
		p.Cnd_yield_rsn_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_oper_ord_no.setListListener(p);
		p.Cnd_oper_ord_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_oper_inst_no.setListListener(p);
		p.Cnd_oper_inst_no.addAllListener(p);
		p.Cnd_oper_act_no.setListListener(p);
		p.Cnd_oper_act_no.addAllListener(p);
		p.Cnd_yield_schd_no.setListListener(p);
		p.Cnd_yield_schd_no.addAllListener(p);
		p.Cnd_yield_act_no.setListListener(p);
		p.Cnd_yield_act_no.addAllListener(p);
		p.Cnd_inst_rpt_rmrks.setListListener(p);
		p.Cnd_inst_rpt_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_inst_po_cnt_rmrks.setListListener(p);
		p.Cnd_inst_po_cnt_rmrks.addAllListener(p);
		p.Cnd_oper_inst_rpt_rmrks.setListListener(p);
		p.Cnd_oper_inst_rpt_rmrks.addAllListener(p);
		p.Cnd_oper_intr_rmrks.setListListener(p);
		p.Cnd_oper_intr_rmrks.addAllListener(p);
		p.Cnd_yield_schd_intr_rmrks.setListListener(p);
		p.Cnd_yield_schd_intr_rmrks.addAllListener(p);
		p.Cnd_yield_schd_rpt_rmrks.setListListener(p);
		p.Cnd_yield_schd_rpt_rmrks.addAllListener(p);
		p.Cnd_insp_cnt_rmrks.setListListener(p);
		p.Cnd_insp_cnt_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_itm_mfg_inst_sub_char1.setListListener(p);
		p.Cnd_itm_mfg_inst_sub_char1.addAllListener(p);
		p.Cnd_itm_mfg_inst_sub_char2.setListListener(p);
		p.Cnd_itm_mfg_inst_sub_char2.addAllListener(p);
		p.Cnd_itm_mfg_inst_sub_char3.setListListener(p);
		p.Cnd_itm_mfg_inst_sub_char3.addAllListener(p);
		p.Cnd_mfg_inst_sub_char1.setListListener(p);
		p.Cnd_mfg_inst_sub_char1.addAllListener(p);
		p.Cnd_mfg_inst_sub_char2.setListListener(p);
		p.Cnd_mfg_inst_sub_char2.addAllListener(p);
		p.Cnd_mfg_inst_sub_char3.setListListener(p);
		p.Cnd_mfg_inst_sub_char3.addAllListener(p);
		p.Cnd_yield_schd_sub_char1.setListListener(p);
		p.Cnd_yield_schd_sub_char1.addAllListener(p);
		p.Cnd_yield_schd_sub_char2.setListListener(p);
		p.Cnd_yield_schd_sub_char2.addAllListener(p);
		p.Cnd_yield_schd_sub_char3.setListListener(p);
		p.Cnd_yield_schd_sub_char3.addAllListener(p);
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [SpplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplGrp(MSBCP_MfgInstPrSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_MfgInstPrSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_MfgInstPrSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_MfgInstPrSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_mfg_mtd_typ.addAllListener(p);
		p.columnRslt_mfg_mtd_typ.setListListener(p);
		p.columnRslt_mfg_mtd_typ_nm.addAllListener(p);
		p.columnRslt_mfg_mtd_typ_nm.setListListener(p);
		p.columnRslt_mfg_sts_typ.addAllListener(p);
		p.columnRslt_mfg_sts_typ.setListListener(p);
		p.columnRslt_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd.addAllListener(p);
		p.columnRslt_mfg_str_ln_cd.setListListener(p);
		p.columnRslt_mfg_str_ln_nm.addAllListener(p);
		p.columnRslt_mfg_str_ln_nm.setListListener(p);
		p.columnRslt_mfg_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_strg_str_ln_cd.addAllListener(p);
		p.columnRslt_strg_str_ln_cd.setListListener(p);
		p.columnRslt_strg_str_ln_nm.addAllListener(p);
		p.columnRslt_strg_str_ln_nm.setListListener(p);
		p.columnRslt_strg_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_oper_unit_cd.addAllListener(p);
		p.columnRslt_oper_unit_cd.setListListener(p);
		p.columnRslt_oper_unit_nm.addAllListener(p);
		p.columnRslt_oper_unit_nm.setListListener(p);
		p.columnRslt_oper_unit_dec_place.addAllListener(p);
		p.columnRslt_oper_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_pr_rate.addAllListener(p);
		p.columnRslt_pr_rate.setListListener(p);
		p.columnRslt_rqst_dlv_rqst_dt.addAllListener(p);
		p.columnRslt_rqst_dlv_rqst_dt.setListListener(p);
		p.columnRslt_rqst_dlv_rqst_hm.addAllListener(p);
		p.columnRslt_rqst_dlv_rqst_hm.setListListener(p);
		p.columnRslt_st_schd_dt.addAllListener(p);
		p.columnRslt_st_schd_dt.setListListener(p);
		p.columnRslt_st_schd_hm.addAllListener(p);
		p.columnRslt_st_schd_hm.setListListener(p);
		p.columnRslt_ord_st_schd_dt.addAllListener(p);
		p.columnRslt_ord_st_schd_dt.setListListener(p);
		p.columnRslt_st_act_dt.addAllListener(p);
		p.columnRslt_st_act_dt.setListListener(p);
		p.columnRslt_st_act_hm.addAllListener(p);
		p.columnRslt_st_act_hm.setListListener(p);
		p.columnRslt_st_ac_dt.addAllListener(p);
		p.columnRslt_st_ac_dt.setListListener(p);
		p.columnRslt_end_schd_dt.addAllListener(p);
		p.columnRslt_end_schd_dt.setListListener(p);
		p.columnRslt_end_schd_hm.addAllListener(p);
		p.columnRslt_end_schd_hm.setListListener(p);
		p.columnRslt_ord_end_schd_dt.addAllListener(p);
		p.columnRslt_ord_end_schd_dt.setListListener(p);
		p.columnRslt_end_act_dt.addAllListener(p);
		p.columnRslt_end_act_dt.setListListener(p);
		p.columnRslt_end_act_hm.addAllListener(p);
		p.columnRslt_end_act_hm.setListListener(p);
		p.columnRslt_end_ac_dt.addAllListener(p);
		p.columnRslt_end_ac_dt.setListListener(p);
		p.columnRslt_yield_schd_dt.addAllListener(p);
		p.columnRslt_yield_schd_dt.setListListener(p);
		p.columnRslt_yield_schd_hm.addAllListener(p);
		p.columnRslt_yield_schd_hm.setListListener(p);
		p.columnRslt_yield_act_dt.addAllListener(p);
		p.columnRslt_yield_act_dt.setListListener(p);
		p.columnRslt_yield_act_hm.addAllListener(p);
		p.columnRslt_yield_act_hm.setListListener(p);
		p.columnRslt_yield_ac_dt.addAllListener(p);
		p.columnRslt_yield_ac_dt.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_oper_loc_cd.addAllListener(p);
		p.columnRslt_oper_loc_cd.setListListener(p);
		p.columnRslt_oper_loc_nm.addAllListener(p);
		p.columnRslt_oper_loc_nm.setListListener(p);
		p.columnRslt_oper_str_ln_cd.addAllListener(p);
		p.columnRslt_oper_str_ln_cd.setListListener(p);
		p.columnRslt_oper_str_ln_nm.addAllListener(p);
		p.columnRslt_oper_str_ln_nm.setListListener(p);
		p.columnRslt_oper_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_oper_lower_yield.addAllListener(p);
		p.columnRslt_oper_lower_yield.setListListener(p);
		p.columnRslt_oper_std_yield.addAllListener(p);
		p.columnRslt_oper_std_yield.setListListener(p);
		p.columnRslt_oper_upper_yield.addAllListener(p);
		p.columnRslt_oper_upper_yield.setListListener(p);
		p.columnRslt_wip_rate.addAllListener(p);
		p.columnRslt_wip_rate.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_oper_rsrc.addAllListener(p);
		p.columnRslt_oper_rsrc.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_inst_dt.addAllListener(p);
		p.columnRslt_inst_dt.setListListener(p);
		p.columnRslt_inst_usr_cd.addAllListener(p);
		p.columnRslt_inst_usr_cd.setListListener(p);
		p.columnRslt_inst_usr_nm.addAllListener(p);
		p.columnRslt_inst_usr_nm.setListListener(p);
		p.columnRslt_inst_dpt_cd.addAllListener(p);
		p.columnRslt_inst_dpt_cd.setListListener(p);
		p.columnRslt_inst_dpt_nm.addAllListener(p);
		p.columnRslt_inst_dpt_nm.setListListener(p);
		p.columnRslt_inst_rpt_rmrks.addAllListener(p);
		p.columnRslt_inst_rpt_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_oper_intr_rmrks.addAllListener(p);
		p.columnRslt_oper_intr_rmrks.setListListener(p);
		p.columnRslt_oper_inst_rpt_rmrks.addAllListener(p);
		p.columnRslt_oper_inst_rpt_rmrks.setListListener(p);
		p.columnRslt_inst_po_cnt_rmrks.addAllListener(p);
		p.columnRslt_inst_po_cnt_rmrks.setListListener(p);
		p.columnRslt_disp_pd.addAllListener(p);
		p.columnRslt_disp_pd.setListListener(p);
		p.columnRslt_itm_lower_yield.addAllListener(p);
		p.columnRslt_itm_lower_yield.setListListener(p);
		p.columnRslt_itm_std_yield.addAllListener(p);
		p.columnRslt_itm_std_yield.setListListener(p);
		p.columnRslt_itm_upper_yield.addAllListener(p);
		p.columnRslt_itm_upper_yield.setListListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_mfg_inst_rev.addAllListener(p);
		p.columnRslt_mfg_inst_rev.setListListener(p);
		p.columnRslt_div_seq.addAllListener(p);
		p.columnRslt_div_seq.setListListener(p);
		p.columnRslt_mfg_act_no.addAllListener(p);
		p.columnRslt_mfg_act_no.setListListener(p);
		p.columnRslt_inst_abort_flg.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_tgt_flg.addAllListener(p);
		p.columnRslt_aprv_dt.addAllListener(p);
		p.columnRslt_aprv_dt.setListListener(p);
		p.columnRslt_aprv_tm.addAllListener(p);
		p.columnRslt_aprv_tm.setListListener(p);
		p.columnRslt_aprv_usr_cd.addAllListener(p);
		p.columnRslt_aprv_usr_cd.setListListener(p);
		p.columnRslt_aprv_usr_nm.addAllListener(p);
		p.columnRslt_aprv_usr_nm.setListListener(p);
		p.columnRslt_aprv_dpt_cd.addAllListener(p);
		p.columnRslt_aprv_dpt_cd.setListListener(p);
		p.columnRslt_aprv_dpt_nm.addAllListener(p);
		p.columnRslt_aprv_dpt_nm.setListListener(p);
		p.columnRslt_aprv_rsn.addAllListener(p);
		p.columnRslt_aprv_rsn.setListListener(p);
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_oper_ord_no.addAllListener(p);
		p.columnRslt_oper_ord_no.setListListener(p);
		p.columnRslt_oper_inst_no.addAllListener(p);
		p.columnRslt_oper_inst_no.setListListener(p);
		p.columnRslt_oper_act_no.addAllListener(p);
		p.columnRslt_oper_act_no.setListListener(p);
		p.columnRslt_mfg_inst_unit_typ.addAllListener(p);
		p.columnRslt_mfg_inst_unit_typ.setListListener(p);
		p.columnRslt_mfg_inst_unit_typ_nm.addAllListener(p);
		p.columnRslt_mfg_inst_unit_typ_nm.setListListener(p);
		p.columnRslt_outsrc_flg.addAllListener(p);
		p.columnRslt_schd_chg_flg.addAllListener(p);
		p.columnRslt_unschd_inst_flg.addAllListener(p);
		p.columnRslt_unschd_act_flg.addAllListener(p);
		p.columnRslt_mfg_loc_wg_cd.addAllListener(p);
		p.columnRslt_mfg_loc_wg_cd.setListListener(p);
		p.columnRslt_mfg_loc_wg_nm.addAllListener(p);
		p.columnRslt_mfg_loc_wg_nm.setListListener(p);
		p.columnRslt_mfg_loc_site_cd.addAllListener(p);
		p.columnRslt_mfg_loc_site_cd.setListListener(p);
		p.columnRslt_mfg_loc_site_nm.addAllListener(p);
		p.columnRslt_mfg_loc_site_nm.setListListener(p);
		p.columnRslt_mfg_loc_grp_cd.addAllListener(p);
		p.columnRslt_mfg_loc_grp_cd.setListListener(p);
		p.columnRslt_mfg_loc_grp_nm.addAllListener(p);
		p.columnRslt_mfg_loc_grp_nm.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_po_aprv_sts_typ.addAllListener(p);
		p.columnRslt_po_aprv_sts_typ.setListListener(p);
		p.columnRslt_po_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_po_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_yield_oper_flg.addAllListener(p);
		p.columnRslt_yield_oper_ratio.addAllListener(p);
		p.columnRslt_yield_oper_ratio.setListListener(p);
		p.columnRslt_oper_inst_grp.addAllListener(p);
		p.columnRslt_oper_inst_grp.setListListener(p);
		p.columnRslt_yield_schd_no.addAllListener(p);
		p.columnRslt_yield_schd_no.setListListener(p);
		p.columnRslt_yield_act_no.addAllListener(p);
		p.columnRslt_yield_act_no.setListListener(p);
		p.columnRslt_yield_rate.addAllListener(p);
		p.columnRslt_yield_rate.setListListener(p);
		p.columnRslt_yield_typ.addAllListener(p);
		p.columnRslt_yield_typ.setListListener(p);
		p.columnRslt_yield_typ_nm.addAllListener(p);
		p.columnRslt_yield_typ_nm.setListListener(p);
		p.columnRslt_yield_rsn_cd.addAllListener(p);
		p.columnRslt_yield_rsn_cd.setListListener(p);
		p.columnRslt_yield_rsn_nm.addAllListener(p);
		p.columnRslt_yield_rsn_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_not_stk_flg.addAllListener(p);
		p.columnRslt_insp_sts_typ.addAllListener(p);
		p.columnRslt_insp_sts_typ.setListListener(p);
		p.columnRslt_insp_sts_typ_nm.addAllListener(p);
		p.columnRslt_insp_sts_typ_nm.setListListener(p);
		p.columnRslt_yield_schd_intr_rmrks.addAllListener(p);
		p.columnRslt_yield_schd_intr_rmrks.setListListener(p);
		p.columnRslt_yield_schd_rpt_rmrks.addAllListener(p);
		p.columnRslt_yield_schd_rpt_rmrks.setListListener(p);
		p.columnRslt_insp_cnt_rmrks.addAllListener(p);
		p.columnRslt_insp_cnt_rmrks.setListListener(p);
		p.columnRslt_itm_mfg_inst_sub_char1.addAllListener(p);
		p.columnRslt_itm_mfg_inst_sub_char1.setListListener(p);
		p.columnRslt_itm_mfg_inst_sub_char2.addAllListener(p);
		p.columnRslt_itm_mfg_inst_sub_char2.setListListener(p);
		p.columnRslt_itm_mfg_inst_sub_char3.addAllListener(p);
		p.columnRslt_itm_mfg_inst_sub_char3.setListListener(p);
		p.columnRslt_mfg_inst_sub_char1.addAllListener(p);
		p.columnRslt_mfg_inst_sub_char1.setListListener(p);
		p.columnRslt_mfg_inst_sub_char2.addAllListener(p);
		p.columnRslt_mfg_inst_sub_char2.setListListener(p);
		p.columnRslt_mfg_inst_sub_char3.addAllListener(p);
		p.columnRslt_mfg_inst_sub_char3.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_yield_schd_sub_char1.addAllListener(p);
		p.columnRslt_yield_schd_sub_char1.setListListener(p);
		p.columnRslt_yield_schd_sub_char2.addAllListener(p);
		p.columnRslt_yield_schd_sub_char2.setListListener(p);
		p.columnRslt_yield_schd_sub_char3.addAllListener(p);
		p.columnRslt_yield_schd_sub_char3.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_MfgInstPrSrch p) {
		p.Btn_open_MSBCP1010.addAllListener(p);
		p.Btn_open_MSBCP1010.setAPMethodName("doBtn_open_MSBCP1010");
		p.Btn_open_MSBCP1100.addAllListener(p);
		p.Btn_open_MSBCP1100.setAPMethodName("doBtn_open_MSBCP1100");
	}

	/**
	 * [SRCH_INST_HDR]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_INST_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_INST_HDR, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_rsrc.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_INST_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_wip_rate.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_act_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INST_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INST_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_INST_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__HDR_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_INST_HDR, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_INST_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_INST_OPER, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_INST_OPER, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_INST_OPER, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INST_OPER, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INST_OPER, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_INST_OPER]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__OPER_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_INST_OPER, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_INST_OPER, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_INST_YIELD, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_INST_YIELD, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_act_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_INST_YIELD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_no.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_INST_YIELD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INST_YIELD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_INST_YIELD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST__YIELD_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_INST_YIELD, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_INST_YIELD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_rsrc.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wip_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_ACT_OPER, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_ACT_OPER, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_OPER, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_OPER, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_OPER, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_OPER]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__OPER_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT_OPER, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT_OPER, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, SRCH_ACT_YIELD, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, SRCH_ACT_YIELD, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_rsn_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_YIELD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, SRCH_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rate.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_not_stk_flg.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char2.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char3.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_YIELD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_YIELD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_YIELD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__YIELD_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT_YIELD, MCMode.DISABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT_YIELD, MCMode.DISABLE);

	}

	/**
	 * [REF_INST_HDR]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_INST_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_INST_HDR, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_loc_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_rsrc.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_INST_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_INST_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_INST_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_std_yield.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_upper_yield.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_wip_rate.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_rsrc.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_act_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_grp.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_INST_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_INST_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_INST_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_INST_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__HDR_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_INST_HDR, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_INST_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_INST_OPER]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_INST_OPER, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_INST_OPER, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_INST_OPER]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_OPER]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_INST_OPER, MCMode.ENABLE);

	}

	/**
	 * [REF_INST_OPER]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_oper_unit_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_INST_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_INST_OPER, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_INST_OPER, MCMode.READ_ONLY);

	}

	/**
	 * [REF_INST_OPER]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__OPER_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_INST_OPER, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_INST_OPER, MCMode.ENABLE);

	}

	/**
	 * [REF_INST_YIELD]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_INST_YIELD, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_INST_YIELD, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_oper_usr_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_oper_inst_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_act_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_INST_YIELD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_INST_YIELD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_INST_YIELD, MCMode.ENABLE);

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_act_no.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_inst_abort_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_no.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_INST_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_INST_YIELD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_INST_YIELD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_INST_YIELD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__INST__YIELD_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_INST_YIELD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_INST_YIELD, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_loc_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_rsrc.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_aprv_usr_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_seq.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_loc_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_lower_yield.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_std_yield.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_upper_yield.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wip_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_usr_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_rsrc.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_oper_inst_grp.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_OPER]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_ACT_OPER, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_ACT_OPER, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_ord_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_act_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_OPER]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_OPER]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_OPER, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_act_no.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rate.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_typ_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_not_stk_flg.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_ACT_OPER, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_OPER, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_OPER, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_OPER]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__OPER_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT_OPER, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT_OPER, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[DispUnit1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_DispUnit1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[DispUnit2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_DispUnit2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Sts(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[UnschdActSrchCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_UnschdActSrchCnd(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Top(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Fold(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Tab1(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Tab2(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Tab3(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Cnd(MSBCP_MfgInstPrSrch p){
		p.Cnd_disp_unit1_Group.putMode(p, REF_ACT_YIELD, MCMode.REQUIRED);
		p.Cnd_disp_unit2_Group.putMode(p, REF_ACT_YIELD, MCMode.REQUIRED);
		p.Cnd_tmp_sts_sav_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_ord_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_tmp_sts_stt_flg.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_tmp_sts_cmpl_flg.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_not_unschd_act_flg.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_unschd_act_flg.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_schd_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_schd_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_st_act_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_end_act_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_schd_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_yield_act_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_inst_dt_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dt_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dt_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_st_ac_dt_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_end_ac_dt_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_ac_dt_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_fr.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_upd_ts_to.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_mtd_typ.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_mtd_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_loc_site_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_site_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_wg_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_strg_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_inc_yield_oper_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_mfg_aprv_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_rsrc.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_aprv_dpt_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_po_aprv_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_po_aprv_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_typ.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Cnd_yield_rsn_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_rsn_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_ord_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_ord_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_act_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_act_no.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_inst_po_cnt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_inst_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_oper_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_mfg_inst_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_yield_schd_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_ItmGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_SpplGrp(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Ctrl(MSBCP_MfgInstPrSrch p){

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_RPnl(MSBCP_MfgInstPrSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Rslt(MSBCP_MfgInstPrSrch p){
		p.columnRslt_mfg_mtd_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_mtd_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_str_ln_cd_none_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_strg_str_ln_cd_none_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_rem_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_mfg_abort_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_base_unit_yield_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_ord_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_not_inst_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.Rslt_oper_std_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_act_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_schd_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_oper_unit_rem_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_oper_unit_cd.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_nm.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_oper_unit_dec_place.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.Rslt_trd_unit_yield_schd_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_unit_yield_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_unit_dfct_qty_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_pr_rate.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dlv_rqst_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_rqst_dlv_rqst_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_schd_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_st_schd_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_act_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_st_ac_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_schd_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ord_end_schd_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_act_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_end_ac_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_hm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_ac_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_loc_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_str_ln_cd_none_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_lower_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_std_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_upper_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_wip_rate.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_rsrc.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_inst_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_disp_pd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_lower_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_std_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_upper_yield.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_rev.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_inst_abort_flg.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tgt_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dt.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_tm.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_aprv_usr_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_dpt_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_aprv_rsn.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_ord_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_unit_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_outsrc_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_schd_chg_flg.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_unschd_inst_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_unschd_act_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_wg_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_site_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_po_aprv_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_oper_flg.putMode(p, REF_ACT_YIELD, MCMode.INVISIBLE);
		p.columnRslt_yield_oper_ratio.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_grp.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_act_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rate.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_rsn_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_not_stk_flg.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_sts_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_intr_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_rpt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_insp_cnt_rmrks.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char1.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char2.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_yield_schd_sub_char3.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_YIELD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_YIELD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_YIELD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__YIELD_Btn(MSBCP_MfgInstPrSrch p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT_YIELD, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_INST_HDR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_MfgInstPrSrch_MC.setTableConfigRslt((MSBCP_MfgInstPrSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_MfgInstPrSrch p) {
		p.columnRslt_mfg_mtd_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_mtd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mtd_typ);
		p.columnRslt_mfg_mtd_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_mtd_typ_nm);
		p.columnRslt_mfg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_sts_typ);
		p.columnRslt_mfg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_mfg_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd);
		p.columnRslt_mfg_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_nm);
		p.columnRslt_mfg_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_str_ln_cd_none_flg);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_strg_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.strg_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_str_ln_cd);
		p.columnRslt_strg_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.strg_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_str_ln_nm);
		p.columnRslt_strg_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.strg_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_str_ln_cd_none_flg);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_yield_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_mfg_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_mfg_rem_st_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_mfg_rem_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_mfg_abort_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_yield_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_dfct_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_ord_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_not_inst_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_oper_std_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_unit_act_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_unit_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_oper_unit_rem_qty_p_PPanel.QtyTable);
		p.columnRslt_oper_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_cd);
		p.columnRslt_oper_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_nm);
		p.columnRslt_oper_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_trd_unit_yield_schd_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_unit_yield_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_unit_dfct_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_pr_rate.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.pr_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_rate);
		p.columnRslt_rqst_dlv_rqst_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.rqst_dlv_rqst_dt_META);
		p.columnRslt_rqst_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dlv_rqst_dt);
		p.columnRslt_rqst_dlv_rqst_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.rqst_dlv_rqst_hm_META);
		p.columnRslt_rqst_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dlv_rqst_hm);
		p.columnRslt_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.st_schd_dt_META);
		p.columnRslt_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_schd_dt);
		p.columnRslt_st_schd_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.st_schd_hm_META);
		p.columnRslt_st_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_schd_hm);
		p.columnRslt_ord_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ord_st_schd_dt_META);
		p.columnRslt_ord_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_st_schd_dt);
		p.columnRslt_st_act_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.st_act_dt_META);
		p.columnRslt_st_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_act_dt);
		p.columnRslt_st_act_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.st_act_hm_META);
		p.columnRslt_st_act_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_act_hm);
		p.columnRslt_st_ac_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.st_ac_dt_META);
		p.columnRslt_st_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_ac_dt);
		p.columnRslt_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.end_schd_dt_META);
		p.columnRslt_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_schd_dt);
		p.columnRslt_end_schd_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.end_schd_hm_META);
		p.columnRslt_end_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_schd_hm);
		p.columnRslt_ord_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ord_end_schd_dt_META);
		p.columnRslt_ord_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_end_schd_dt);
		p.columnRslt_end_act_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.end_act_dt_META);
		p.columnRslt_end_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_act_dt);
		p.columnRslt_end_act_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.end_act_hm_META);
		p.columnRslt_end_act_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_act_hm);
		p.columnRslt_end_ac_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.end_ac_dt_META);
		p.columnRslt_end_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_ac_dt);
		p.columnRslt_yield_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_dt_META);
		p.columnRslt_yield_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_dt);
		p.columnRslt_yield_schd_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_hm_META);
		p.columnRslt_yield_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_hm);
		p.columnRslt_yield_act_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_act_dt_META);
		p.columnRslt_yield_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_act_dt);
		p.columnRslt_yield_act_hm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_act_hm_META);
		p.columnRslt_yield_act_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_act_hm);
		p.columnRslt_yield_ac_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_ac_dt_META);
		p.columnRslt_yield_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_ac_dt);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_oper_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_loc_cd);
		p.columnRslt_oper_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_loc_nm);
		p.columnRslt_oper_str_ln_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_cd);
		p.columnRslt_oper_str_ln_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_nm);
		p.columnRslt_oper_str_ln_cd_none_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_str_ln_cd_none_flg);
		p.columnRslt_oper_lower_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_lower_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_lower_yield);
		p.columnRslt_oper_std_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_std_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_std_yield);
		p.columnRslt_oper_upper_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_upper_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_upper_yield);
		p.columnRslt_wip_rate.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.wip_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wip_rate);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_oper_rsrc.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_rsrc_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_rsrc);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_inst_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_dt_META);
		p.columnRslt_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dt);
		p.columnRslt_inst_usr_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_cd);
		p.columnRslt_inst_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_nm);
		p.columnRslt_inst_dpt_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_cd);
		p.columnRslt_inst_dpt_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_nm);
		p.columnRslt_inst_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_rpt_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_oper_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_intr_rmrks);
		p.columnRslt_oper_inst_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_inst_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_rpt_rmrks);
		p.columnRslt_inst_po_cnt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_po_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_po_cnt_rmrks);
		p.columnRslt_disp_pd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.disp_pd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_pd);
		p.columnRslt_itm_lower_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_lower_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_lower_yield);
		p.columnRslt_itm_std_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_std_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_std_yield);
		p.columnRslt_itm_upper_yield.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_upper_yield_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_upper_yield);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_mfg_inst_rev.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_rev);
		p.columnRslt_div_seq.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.div_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_seq);
		p.columnRslt_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_no);
		p.columnRslt_inst_abort_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.inst_abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_abort_flg);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_aprv_tgt_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_tgt_flg);
		p.columnRslt_aprv_dt.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_dt_META);
		p.columnRslt_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_dt);
		p.columnRslt_aprv_tm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_tm_META);
		p.columnRslt_aprv_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_tm);
		p.columnRslt_aprv_usr_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_usr_cd);
		p.columnRslt_aprv_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_usr_nm);
		p.columnRslt_aprv_dpt_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_dpt_cd);
		p.columnRslt_aprv_dpt_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_dpt_nm);
		p.columnRslt_aprv_rsn.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.aprv_rsn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_rsn);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ord_no);
		p.columnRslt_oper_inst_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_no);
		p.columnRslt_oper_act_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_no);
		p.columnRslt_mfg_inst_unit_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_unit_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_unit_typ);
		p.columnRslt_mfg_inst_unit_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_unit_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_unit_typ_nm);
		p.columnRslt_outsrc_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.outsrc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_outsrc_flg);
		p.columnRslt_schd_chg_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.schd_chg_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_chg_flg);
		p.columnRslt_unschd_inst_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.unschd_inst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unschd_inst_flg);
		p.columnRslt_unschd_act_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.unschd_act_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unschd_act_flg);
		p.columnRslt_mfg_loc_wg_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_wg_cd);
		p.columnRslt_mfg_loc_wg_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_wg_nm);
		p.columnRslt_mfg_loc_site_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_site_cd);
		p.columnRslt_mfg_loc_site_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_site_nm);
		p.columnRslt_mfg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_cd);
		p.columnRslt_mfg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_nm);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_po_aprv_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.po_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_aprv_sts_typ);
		p.columnRslt_po_aprv_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.po_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_aprv_sts_typ_nm);
		p.columnRslt_yield_oper_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_oper_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_oper_flg);
		p.columnRslt_yield_oper_ratio.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_oper_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_oper_ratio);
		p.columnRslt_oper_inst_grp.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.oper_inst_grp_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_grp);
		p.columnRslt_yield_schd_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_no);
		p.columnRslt_yield_act_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_act_no);
		p.columnRslt_yield_rate.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_rate);
		p.columnRslt_yield_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_typ);
		p.columnRslt_yield_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_typ_nm);
		p.columnRslt_yield_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_rsn_cd);
		p.columnRslt_yield_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_rsn_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_not_stk_flg.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.not_stk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_stk_flg);
		p.columnRslt_insp_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.insp_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_sts_typ);
		p.columnRslt_insp_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.insp_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_sts_typ_nm);
		p.columnRslt_yield_schd_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_intr_rmrks);
		p.columnRslt_yield_schd_rpt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_rpt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_rpt_rmrks);
		p.columnRslt_insp_cnt_rmrks.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.insp_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_cnt_rmrks);
		p.columnRslt_itm_mfg_inst_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_mfg_inst_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_sub_char1);
		p.columnRslt_itm_mfg_inst_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_mfg_inst_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_sub_char2);
		p.columnRslt_itm_mfg_inst_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_mfg_inst_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_sub_char3);
		p.columnRslt_mfg_inst_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_sub_char1);
		p.columnRslt_mfg_inst_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_sub_char2);
		p.columnRslt_mfg_inst_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.mfg_inst_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_sub_char3);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_yield_schd_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_sub_char1);
		p.columnRslt_yield_schd_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_sub_char2);
		p.columnRslt_yield_schd_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.yield_schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_yield_schd_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP1070.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_mfg_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_mtd_typ.getListConfig().setPutter(getCnd_mfg_mtd_typ_ListPutter());
		Cnd_mfg_loc_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_site_cd.getListConfig().setPutter(getCnd_mfg_loc_site_cd_ListPutter());
		Cnd_mfg_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_wg_cd.getListConfig().setPutter(getCnd_mfg_loc_wg_cd_ListPutter());
		Cnd_mfg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_grp_cd.getListConfig().setPutter(getCnd_mfg_loc_grp_cd_ListPutter());
		Cnd_strg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_loc_grp_cd.getListConfig().setPutter(getCnd_strg_loc_grp_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_mfg_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_str_ln_cd.getListConfig().setPutter(getCnd_mfg_str_ln_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_strg_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_str_ln_cd.getListConfig().setPutter(getCnd_strg_str_ln_cd_ListPutter());
		Cnd_oper_loc_cd.getListConfig().setPutter(getCnd_oper_loc_cd_ListPutter());
		Cnd_oper_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_str_ln_cd.getListConfig().setPutter(getCnd_oper_str_ln_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_mfg_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_aprv_sts_typ.getListConfig().setPutter(getCnd_mfg_aprv_sts_typ_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_inst_usr_cd.getListConfig().setPutter(getCnd_inst_usr_cd_ListPutter());
		Cnd_inst_dpt_cd.getListConfig().setPutter(getCnd_inst_dpt_cd_ListPutter());
		Cnd_act_usr_cd.getListConfig().setPutter(getCnd_act_usr_cd_ListPutter());
		Cnd_act_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_act_dpt_cd.getListConfig().setPutter(getCnd_act_dpt_cd_ListPutter());
		Cnd_oper_usr_cd.getListConfig().setPutter(getCnd_oper_usr_cd_ListPutter());
		Cnd_aprv_usr_cd.getListConfig().setPutter(getCnd_aprv_usr_cd_ListPutter());
		Cnd_aprv_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_dpt_cd.getListConfig().setPutter(getCnd_aprv_dpt_cd_ListPutter());
		Cnd_mfg_inst_unit_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_inst_unit_typ.getListConfig().setPutter(getCnd_mfg_inst_unit_typ_ListPutter());
		Cnd_po_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_po_aprv_sts_typ.getListConfig().setPutter(getCnd_po_aprv_sts_typ_ListPutter());
		Cnd_yield_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_yield_typ.getListConfig().setPutter(getCnd_yield_typ_ListPutter());
		Cnd_yield_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_yield_rsn_cd.getListConfig().setPutter(getCnd_yield_rsn_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		columnRslt_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_bom_ptn.getListConfig().setPutter(getRslt_bom_ptn_ListPutter());
		columnRslt_strg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_strg_loc_cd.getListConfig().setPutter(getRslt_strg_loc_cd_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_INST_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INST_HDRStatus() {
		status = SRCH_INST_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INST_OPER]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INST_OPERStatus() {
		status = SRCH_INST_OPER;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INST_YIELD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INST_YIELDStatus() {
		status = SRCH_INST_YIELD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_HDRStatus() {
		status = SRCH_ACT_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_OPER]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_OPERStatus() {
		status = SRCH_ACT_OPER;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_YIELD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_YIELDStatus() {
		status = SRCH_ACT_YIELD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_INST_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_INST_HDRStatus() {
		status = REF_INST_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_INST_OPER]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_INST_OPERStatus() {
		status = REF_INST_OPER;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_INST_YIELD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_INST_YIELDStatus() {
		status = REF_INST_YIELD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_HDRStatus() {
		status = REF_ACT_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_OPER]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_OPERStatus() {
		status = REF_ACT_OPER;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_YIELD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_YIELDStatus() {
		status = REF_ACT_YIELD;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_INST_HDR.equals(status)) {
			setSRCH_INST_HDRStatus();
		}
		else if (SRCH_INST_OPER.equals(status)) {
			setSRCH_INST_OPERStatus();
		}
		else if (SRCH_INST_YIELD.equals(status)) {
			setSRCH_INST_YIELDStatus();
		}
		else if (SRCH_ACT_HDR.equals(status)) {
			setSRCH_ACT_HDRStatus();
		}
		else if (SRCH_ACT_OPER.equals(status)) {
			setSRCH_ACT_OPERStatus();
		}
		else if (SRCH_ACT_YIELD.equals(status)) {
			setSRCH_ACT_YIELDStatus();
		}
		else if (REF_INST_HDR.equals(status)) {
			setREF_INST_HDRStatus();
		}
		else if (REF_INST_OPER.equals(status)) {
			setREF_INST_OPERStatus();
		}
		else if (REF_INST_YIELD.equals(status)) {
			setREF_INST_YIELDStatus();
		}
		else if (REF_ACT_HDR.equals(status)) {
			setREF_ACT_HDRStatus();
		}
		else if (REF_ACT_OPER.equals(status)) {
			setREF_ACT_OPERStatus();
		}
		else if (REF_ACT_YIELD.equals(status)) {
			setREF_ACT_YIELDStatus();
		}
	}

	/**
	 * [Cnd_mfg_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgMtdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Cnd_strg_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgAprvStsTyp");
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
	 * [Cnd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_inst_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inst_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_inst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_inst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_act_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_act_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_inst_unit_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_inst_unit_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgInstUnitTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_po_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_po_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_yield_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_yield_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.YieldTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_yield_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_yield_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.YieldBizRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Rslt_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_mfg_mtd_typ) return getCnd_mfg_mtd_typ(row, info);
		if(combo == Cnd_mfg_loc_site_cd) return getCnd_mfg_loc_site_cd(row, info);
		if(combo == Cnd_mfg_loc_wg_cd) return getCnd_mfg_loc_wg_cd(row, info);
		if(combo == Cnd_mfg_loc_grp_cd) return getCnd_mfg_loc_grp_cd(row, info);
		if(combo == Cnd_strg_loc_grp_cd) return getCnd_strg_loc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_mfg_str_ln_cd) return getCnd_mfg_str_ln_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_strg_str_ln_cd) return getCnd_strg_str_ln_cd(row, info);
		if(combo == Cnd_oper_loc_cd) return getCnd_oper_loc_cd(row, info);
		if(combo == Cnd_oper_str_ln_cd) return getCnd_oper_str_ln_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_mfg_aprv_sts_typ) return getCnd_mfg_aprv_sts_typ(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_inst_usr_cd) return getCnd_inst_usr_cd(row, info);
		if(combo == Cnd_inst_dpt_cd) return getCnd_inst_dpt_cd(row, info);
		if(combo == Cnd_act_usr_cd) return getCnd_act_usr_cd(row, info);
		if(combo == Cnd_act_dpt_cd) return getCnd_act_dpt_cd(row, info);
		if(combo == Cnd_oper_usr_cd) return getCnd_oper_usr_cd(row, info);
		if(combo == Cnd_aprv_usr_cd) return getCnd_aprv_usr_cd(row, info);
		if(combo == Cnd_aprv_dpt_cd) return getCnd_aprv_dpt_cd(row, info);
		if(combo == Cnd_mfg_inst_unit_typ) return getCnd_mfg_inst_unit_typ(row, info);
		if(combo == Cnd_po_aprv_sts_typ) return getCnd_po_aprv_sts_typ(row, info);
		if(combo == Cnd_yield_typ) return getCnd_yield_typ(row, info);
		if(combo == Cnd_yield_rsn_cd) return getCnd_yield_rsn_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == columnRslt_bom_ptn) return getRslt_bom_ptn(row, info);
		if(combo == columnRslt_strg_loc_cd) return getRslt_strg_loc_cd(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
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
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBCP1010) doBtn_open_MSBCP1010(info);
		else if (ap == Btn_open_MSBCP1100) doBtn_open_MSBCP1100(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP1010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP1100]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP1100(MCEventInfo info);

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
		if (vc == Cnd_disp_unit1_Group) return doCnd_disp_unit1_VC(info);
		if (vc == Cnd_disp_unit2_Group) return doCnd_disp_unit2_VC(info);
		if (vc == Cnd_tmp_sts_sav_flg) return doCnd_tmp_sts_sav_flg_VC(info);
		if (vc == Cnd_tmp_sts_ord_flg) return doCnd_tmp_sts_ord_flg_VC(info);
		if (vc == Cnd_tmp_sts_stt_flg) return doCnd_tmp_sts_stt_flg_VC(info);
		if (vc == Cnd_tmp_sts_cmpl_flg) return doCnd_tmp_sts_cmpl_flg_VC(info);
		if (vc == Cnd_not_unschd_act_flg) return doCnd_not_unschd_act_flg_VC(info);
		if (vc == Cnd_unschd_act_flg) return doCnd_unschd_act_flg_VC(info);
		if (vc == Cnd_inst_dt_fr) return doCnd_inst_dt_fr_VC(info);
		if (vc == Cnd_inst_dt_to) return doCnd_inst_dt_to_VC(info);
		if (vc == Cnd_aprv_dt_fr) return doCnd_aprv_dt_fr_VC(info);
		if (vc == Cnd_aprv_dt_to) return doCnd_aprv_dt_to_VC(info);
		if (vc == Cnd_st_ac_dt_fr) return doCnd_st_ac_dt_fr_VC(info);
		if (vc == Cnd_st_ac_dt_to) return doCnd_st_ac_dt_to_VC(info);
		if (vc == Cnd_end_ac_dt_fr) return doCnd_end_ac_dt_fr_VC(info);
		if (vc == Cnd_end_ac_dt_to) return doCnd_end_ac_dt_to_VC(info);
		if (vc == Cnd_yield_ac_dt_fr) return doCnd_yield_ac_dt_fr_VC(info);
		if (vc == Cnd_yield_ac_dt_to) return doCnd_yield_ac_dt_to_VC(info);
		if (vc == Cnd_upd_ts_fr) return doCnd_upd_ts_fr_VC(info);
		if (vc == Cnd_upd_ts_to) return doCnd_upd_ts_to_VC(info);
		if (vc == Cnd_pr_rate_fr) return doCnd_pr_rate_fr_VC(info);
		if (vc == Cnd_pr_rate_to) return doCnd_pr_rate_to_VC(info);
		if (vc == Cnd_mfg_mtd_typ) return doCnd_mfg_mtd_typ_VC(info);
		if (vc == Cnd_mfg_mtd_typ_nm) return doCnd_mfg_mtd_typ_nm_VC(info);
		if (vc == Cnd_mfg_loc_site_cd) return doCnd_mfg_loc_site_cd_VC(info);
		if (vc == Cnd_mfg_loc_site_nm) return doCnd_mfg_loc_site_nm_VC(info);
		if (vc == Cnd_mfg_loc_wg_cd) return doCnd_mfg_loc_wg_cd_VC(info);
		if (vc == Cnd_mfg_loc_wg_nm) return doCnd_mfg_loc_wg_nm_VC(info);
		if (vc == Cnd_mfg_loc_grp_cd) return doCnd_mfg_loc_grp_cd_VC(info);
		if (vc == Cnd_mfg_loc_grp_nm) return doCnd_mfg_loc_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_grp_cd) return doCnd_strg_loc_grp_cd_VC(info);
		if (vc == Cnd_strg_loc_grp_nm) return doCnd_strg_loc_grp_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_mfg_str_ln_cd) return doCnd_mfg_str_ln_cd_VC(info);
		if (vc == Cnd_mfg_str_ln_nm) return doCnd_mfg_str_ln_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_strg_str_ln_cd) return doCnd_strg_str_ln_cd_VC(info);
		if (vc == Cnd_strg_str_ln_nm) return doCnd_strg_str_ln_nm_VC(info);
		if (vc == Cnd_oper_loc_cd) return doCnd_oper_loc_cd_VC(info);
		if (vc == Cnd_oper_loc_nm) return doCnd_oper_loc_nm_VC(info);
		if (vc == Cnd_oper_str_ln_cd) return doCnd_oper_str_ln_cd_VC(info);
		if (vc == Cnd_oper_str_ln_nm) return doCnd_oper_str_ln_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_abort_flg) return doCnd_abort_flg_VC(info);
		if (vc == Cnd_inc_yield_oper_flg) return doCnd_inc_yield_oper_flg_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ) return doCnd_mfg_aprv_sts_typ_VC(info);
		if (vc == Cnd_mfg_aprv_sts_typ_nm) return doCnd_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_inst_usr_cd) return doCnd_inst_usr_cd_VC(info);
		if (vc == Cnd_inst_usr_nm) return doCnd_inst_usr_nm_VC(info);
		if (vc == Cnd_inst_dpt_cd) return doCnd_inst_dpt_cd_VC(info);
		if (vc == Cnd_inst_dpt_nm) return doCnd_inst_dpt_nm_VC(info);
		if (vc == Cnd_act_usr_cd) return doCnd_act_usr_cd_VC(info);
		if (vc == Cnd_act_usr_nm) return doCnd_act_usr_nm_VC(info);
		if (vc == Cnd_act_dpt_cd) return doCnd_act_dpt_cd_VC(info);
		if (vc == Cnd_act_dpt_nm) return doCnd_act_dpt_nm_VC(info);
		if (vc == Cnd_oper_usr_cd) return doCnd_oper_usr_cd_VC(info);
		if (vc == Cnd_oper_usr_nm) return doCnd_oper_usr_nm_VC(info);
		if (vc == Cnd_oper_rsrc) return doCnd_oper_rsrc_VC(info);
		if (vc == Cnd_aprv_usr_cd) return doCnd_aprv_usr_cd_VC(info);
		if (vc == Cnd_aprv_usr_nm) return doCnd_aprv_usr_nm_VC(info);
		if (vc == Cnd_aprv_dpt_cd) return doCnd_aprv_dpt_cd_VC(info);
		if (vc == Cnd_aprv_dpt_nm) return doCnd_aprv_dpt_nm_VC(info);
		if (vc == Cnd_mfg_inst_unit_typ) return doCnd_mfg_inst_unit_typ_VC(info);
		if (vc == Cnd_mfg_inst_unit_typ_nm) return doCnd_mfg_inst_unit_typ_nm_VC(info);
		if (vc == Cnd_po_aprv_sts_typ) return doCnd_po_aprv_sts_typ_VC(info);
		if (vc == Cnd_po_aprv_sts_typ_nm) return doCnd_po_aprv_sts_typ_nm_VC(info);
		if (vc == Cnd_yield_typ) return doCnd_yield_typ_VC(info);
		if (vc == Cnd_yield_typ_nm) return doCnd_yield_typ_nm_VC(info);
		if (vc == Cnd_yield_rsn_cd) return doCnd_yield_rsn_cd_VC(info);
		if (vc == Cnd_yield_rsn_nm) return doCnd_yield_rsn_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_oper_ord_no) return doCnd_oper_ord_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_oper_inst_no) return doCnd_oper_inst_no_VC(info);
		if (vc == Cnd_oper_act_no) return doCnd_oper_act_no_VC(info);
		if (vc == Cnd_yield_schd_no) return doCnd_yield_schd_no_VC(info);
		if (vc == Cnd_yield_act_no) return doCnd_yield_act_no_VC(info);
		if (vc == Cnd_inst_rpt_rmrks) return doCnd_inst_rpt_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_inst_po_cnt_rmrks) return doCnd_inst_po_cnt_rmrks_VC(info);
		if (vc == Cnd_oper_inst_rpt_rmrks) return doCnd_oper_inst_rpt_rmrks_VC(info);
		if (vc == Cnd_oper_intr_rmrks) return doCnd_oper_intr_rmrks_VC(info);
		if (vc == Cnd_yield_schd_intr_rmrks) return doCnd_yield_schd_intr_rmrks_VC(info);
		if (vc == Cnd_yield_schd_rpt_rmrks) return doCnd_yield_schd_rpt_rmrks_VC(info);
		if (vc == Cnd_insp_cnt_rmrks) return doCnd_insp_cnt_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_itm_mfg_inst_sub_char1) return doCnd_itm_mfg_inst_sub_char1_VC(info);
		if (vc == Cnd_itm_mfg_inst_sub_char2) return doCnd_itm_mfg_inst_sub_char2_VC(info);
		if (vc == Cnd_itm_mfg_inst_sub_char3) return doCnd_itm_mfg_inst_sub_char3_VC(info);
		if (vc == Cnd_mfg_inst_sub_char1) return doCnd_mfg_inst_sub_char1_VC(info);
		if (vc == Cnd_mfg_inst_sub_char2) return doCnd_mfg_inst_sub_char2_VC(info);
		if (vc == Cnd_mfg_inst_sub_char3) return doCnd_mfg_inst_sub_char3_VC(info);
		if (vc == Cnd_yield_schd_sub_char1) return doCnd_yield_schd_sub_char1_VC(info);
		if (vc == Cnd_yield_schd_sub_char2) return doCnd_yield_schd_sub_char2_VC(info);
		if (vc == Cnd_yield_schd_sub_char3) return doCnd_yield_schd_sub_char3_VC(info);
		if (vc == columnRslt_mfg_mtd_typ) return doRslt_mfg_mtd_typ_VC(info);
		if (vc == columnRslt_mfg_mtd_typ_nm) return doRslt_mfg_mtd_typ_nm_VC(info);
		if (vc == columnRslt_mfg_sts_typ) return doRslt_mfg_sts_typ_VC(info);
		if (vc == columnRslt_mfg_sts_typ_nm) return doRslt_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd) return doRslt_mfg_str_ln_cd_VC(info);
		if (vc == columnRslt_mfg_str_ln_nm) return doRslt_mfg_str_ln_nm_VC(info);
		if (vc == columnRslt_mfg_str_ln_cd_none_flg) return doRslt_mfg_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_strg_str_ln_cd) return doRslt_strg_str_ln_cd_VC(info);
		if (vc == columnRslt_strg_str_ln_nm) return doRslt_strg_str_ln_nm_VC(info);
		if (vc == columnRslt_strg_str_ln_cd_none_flg) return doRslt_strg_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_oper_unit_cd) return doRslt_oper_unit_cd_VC(info);
		if (vc == columnRslt_oper_unit_nm) return doRslt_oper_unit_nm_VC(info);
		if (vc == columnRslt_oper_unit_dec_place) return doRslt_oper_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_pr_rate) return doRslt_pr_rate_VC(info);
		if (vc == columnRslt_rqst_dlv_rqst_dt) return doRslt_rqst_dlv_rqst_dt_VC(info);
		if (vc == columnRslt_rqst_dlv_rqst_hm) return doRslt_rqst_dlv_rqst_hm_VC(info);
		if (vc == columnRslt_st_schd_dt) return doRslt_st_schd_dt_VC(info);
		if (vc == columnRslt_st_schd_hm) return doRslt_st_schd_hm_VC(info);
		if (vc == columnRslt_ord_st_schd_dt) return doRslt_ord_st_schd_dt_VC(info);
		if (vc == columnRslt_st_act_dt) return doRslt_st_act_dt_VC(info);
		if (vc == columnRslt_st_act_hm) return doRslt_st_act_hm_VC(info);
		if (vc == columnRslt_st_ac_dt) return doRslt_st_ac_dt_VC(info);
		if (vc == columnRslt_end_schd_dt) return doRslt_end_schd_dt_VC(info);
		if (vc == columnRslt_end_schd_hm) return doRslt_end_schd_hm_VC(info);
		if (vc == columnRslt_ord_end_schd_dt) return doRslt_ord_end_schd_dt_VC(info);
		if (vc == columnRslt_end_act_dt) return doRslt_end_act_dt_VC(info);
		if (vc == columnRslt_end_act_hm) return doRslt_end_act_hm_VC(info);
		if (vc == columnRslt_end_ac_dt) return doRslt_end_ac_dt_VC(info);
		if (vc == columnRslt_yield_schd_dt) return doRslt_yield_schd_dt_VC(info);
		if (vc == columnRslt_yield_schd_hm) return doRslt_yield_schd_hm_VC(info);
		if (vc == columnRslt_yield_act_dt) return doRslt_yield_act_dt_VC(info);
		if (vc == columnRslt_yield_act_hm) return doRslt_yield_act_hm_VC(info);
		if (vc == columnRslt_yield_ac_dt) return doRslt_yield_ac_dt_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_oper_loc_cd) return doRslt_oper_loc_cd_VC(info);
		if (vc == columnRslt_oper_loc_nm) return doRslt_oper_loc_nm_VC(info);
		if (vc == columnRslt_oper_str_ln_cd) return doRslt_oper_str_ln_cd_VC(info);
		if (vc == columnRslt_oper_str_ln_nm) return doRslt_oper_str_ln_nm_VC(info);
		if (vc == columnRslt_oper_str_ln_cd_none_flg) return doRslt_oper_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_oper_lower_yield) return doRslt_oper_lower_yield_VC(info);
		if (vc == columnRslt_oper_std_yield) return doRslt_oper_std_yield_VC(info);
		if (vc == columnRslt_oper_upper_yield) return doRslt_oper_upper_yield_VC(info);
		if (vc == columnRslt_wip_rate) return doRslt_wip_rate_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_oper_rsrc) return doRslt_oper_rsrc_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_inst_dt) return doRslt_inst_dt_VC(info);
		if (vc == columnRslt_inst_usr_cd) return doRslt_inst_usr_cd_VC(info);
		if (vc == columnRslt_inst_usr_nm) return doRslt_inst_usr_nm_VC(info);
		if (vc == columnRslt_inst_dpt_cd) return doRslt_inst_dpt_cd_VC(info);
		if (vc == columnRslt_inst_dpt_nm) return doRslt_inst_dpt_nm_VC(info);
		if (vc == columnRslt_inst_rpt_rmrks) return doRslt_inst_rpt_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_oper_intr_rmrks) return doRslt_oper_intr_rmrks_VC(info);
		if (vc == columnRslt_oper_inst_rpt_rmrks) return doRslt_oper_inst_rpt_rmrks_VC(info);
		if (vc == columnRslt_inst_po_cnt_rmrks) return doRslt_inst_po_cnt_rmrks_VC(info);
		if (vc == columnRslt_disp_pd) return doRslt_disp_pd_VC(info);
		if (vc == columnRslt_itm_lower_yield) return doRslt_itm_lower_yield_VC(info);
		if (vc == columnRslt_itm_std_yield) return doRslt_itm_std_yield_VC(info);
		if (vc == columnRslt_itm_upper_yield) return doRslt_itm_upper_yield_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_mfg_inst_rev) return doRslt_mfg_inst_rev_VC(info);
		if (vc == columnRslt_div_seq) return doRslt_div_seq_VC(info);
		if (vc == columnRslt_mfg_act_no) return doRslt_mfg_act_no_VC(info);
		if (vc == columnRslt_inst_abort_flg) return doRslt_inst_abort_flg_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_tgt_flg) return doRslt_aprv_tgt_flg_VC(info);
		if (vc == columnRslt_aprv_dt) return doRslt_aprv_dt_VC(info);
		if (vc == columnRslt_aprv_tm) return doRslt_aprv_tm_VC(info);
		if (vc == columnRslt_aprv_usr_cd) return doRslt_aprv_usr_cd_VC(info);
		if (vc == columnRslt_aprv_usr_nm) return doRslt_aprv_usr_nm_VC(info);
		if (vc == columnRslt_aprv_dpt_cd) return doRslt_aprv_dpt_cd_VC(info);
		if (vc == columnRslt_aprv_dpt_nm) return doRslt_aprv_dpt_nm_VC(info);
		if (vc == columnRslt_aprv_rsn) return doRslt_aprv_rsn_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_oper_ord_no) return doRslt_oper_ord_no_VC(info);
		if (vc == columnRslt_oper_inst_no) return doRslt_oper_inst_no_VC(info);
		if (vc == columnRslt_oper_act_no) return doRslt_oper_act_no_VC(info);
		if (vc == columnRslt_mfg_inst_unit_typ) return doRslt_mfg_inst_unit_typ_VC(info);
		if (vc == columnRslt_mfg_inst_unit_typ_nm) return doRslt_mfg_inst_unit_typ_nm_VC(info);
		if (vc == columnRslt_outsrc_flg) return doRslt_outsrc_flg_VC(info);
		if (vc == columnRslt_schd_chg_flg) return doRslt_schd_chg_flg_VC(info);
		if (vc == columnRslt_unschd_inst_flg) return doRslt_unschd_inst_flg_VC(info);
		if (vc == columnRslt_unschd_act_flg) return doRslt_unschd_act_flg_VC(info);
		if (vc == columnRslt_mfg_loc_wg_cd) return doRslt_mfg_loc_wg_cd_VC(info);
		if (vc == columnRslt_mfg_loc_wg_nm) return doRslt_mfg_loc_wg_nm_VC(info);
		if (vc == columnRslt_mfg_loc_site_cd) return doRslt_mfg_loc_site_cd_VC(info);
		if (vc == columnRslt_mfg_loc_site_nm) return doRslt_mfg_loc_site_nm_VC(info);
		if (vc == columnRslt_mfg_loc_grp_cd) return doRslt_mfg_loc_grp_cd_VC(info);
		if (vc == columnRslt_mfg_loc_grp_nm) return doRslt_mfg_loc_grp_nm_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_po_aprv_sts_typ) return doRslt_po_aprv_sts_typ_VC(info);
		if (vc == columnRslt_po_aprv_sts_typ_nm) return doRslt_po_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_yield_oper_flg) return doRslt_yield_oper_flg_VC(info);
		if (vc == columnRslt_yield_oper_ratio) return doRslt_yield_oper_ratio_VC(info);
		if (vc == columnRslt_oper_inst_grp) return doRslt_oper_inst_grp_VC(info);
		if (vc == columnRslt_yield_schd_no) return doRslt_yield_schd_no_VC(info);
		if (vc == columnRslt_yield_act_no) return doRslt_yield_act_no_VC(info);
		if (vc == columnRslt_yield_rate) return doRslt_yield_rate_VC(info);
		if (vc == columnRslt_yield_typ) return doRslt_yield_typ_VC(info);
		if (vc == columnRslt_yield_typ_nm) return doRslt_yield_typ_nm_VC(info);
		if (vc == columnRslt_yield_rsn_cd) return doRslt_yield_rsn_cd_VC(info);
		if (vc == columnRslt_yield_rsn_nm) return doRslt_yield_rsn_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_not_stk_flg) return doRslt_not_stk_flg_VC(info);
		if (vc == columnRslt_insp_sts_typ) return doRslt_insp_sts_typ_VC(info);
		if (vc == columnRslt_insp_sts_typ_nm) return doRslt_insp_sts_typ_nm_VC(info);
		if (vc == columnRslt_yield_schd_intr_rmrks) return doRslt_yield_schd_intr_rmrks_VC(info);
		if (vc == columnRslt_yield_schd_rpt_rmrks) return doRslt_yield_schd_rpt_rmrks_VC(info);
		if (vc == columnRslt_insp_cnt_rmrks) return doRslt_insp_cnt_rmrks_VC(info);
		if (vc == columnRslt_itm_mfg_inst_sub_char1) return doRslt_itm_mfg_inst_sub_char1_VC(info);
		if (vc == columnRslt_itm_mfg_inst_sub_char2) return doRslt_itm_mfg_inst_sub_char2_VC(info);
		if (vc == columnRslt_itm_mfg_inst_sub_char3) return doRslt_itm_mfg_inst_sub_char3_VC(info);
		if (vc == columnRslt_mfg_inst_sub_char1) return doRslt_mfg_inst_sub_char1_VC(info);
		if (vc == columnRslt_mfg_inst_sub_char2) return doRslt_mfg_inst_sub_char2_VC(info);
		if (vc == columnRslt_mfg_inst_sub_char3) return doRslt_mfg_inst_sub_char3_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_yield_schd_sub_char1) return doRslt_yield_schd_sub_char1_VC(info);
		if (vc == columnRslt_yield_schd_sub_char2) return doRslt_yield_schd_sub_char2_VC(info);
		if (vc == columnRslt_yield_schd_sub_char3) return doRslt_yield_schd_sub_char3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
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
	 * [Cnd]パネルの[disp_unit1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_unit1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_unit2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_unit2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tmp_sts_sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tmp_sts_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tmp_sts_ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tmp_sts_ord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tmp_sts_stt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tmp_sts_stt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tmp_sts_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tmp_sts_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_unschd_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_unschd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unschd_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unschd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_st_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_end_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upd_ts_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upd_ts_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pr_rate_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pr_rate_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_yield_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_yield_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_rsrc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_unit_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_inst_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_mfg_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_yield_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_str_ln_cd_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pr_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dlv_rqst_hm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[st_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_act_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_act_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_ac_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[end_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_act_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_act_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_act_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_act_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_upper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wip_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wip_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_rsrc_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_rpt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_inst_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_inst_rpt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_upper_yield_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_rsn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_rsn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_unit_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_chg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_chg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unschd_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unschd_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unschd_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unschd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_oper_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_oper_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_inst_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_inst_grp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_rpt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_rpt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[yield_schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_yield_schd_sub_char3_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_disp_unit1_Group) doCnd_disp_unit1_NC(info);
		else if (nc == Cnd_disp_unit2_Group) doCnd_disp_unit2_NC(info);
		else if (nc == Cnd_tmp_sts_sav_flg) doCnd_tmp_sts_sav_flg_NC(info);
		else if (nc == Cnd_tmp_sts_ord_flg) doCnd_tmp_sts_ord_flg_NC(info);
		else if (nc == Cnd_tmp_sts_stt_flg) doCnd_tmp_sts_stt_flg_NC(info);
		else if (nc == Cnd_tmp_sts_cmpl_flg) doCnd_tmp_sts_cmpl_flg_NC(info);
		else if (nc == Cnd_not_unschd_act_flg) doCnd_not_unschd_act_flg_NC(info);
		else if (nc == Cnd_unschd_act_flg) doCnd_unschd_act_flg_NC(info);
		else if (nc == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NC(info);
		else if (nc == Cnd_inst_dt_to) doCnd_inst_dt_to_NC(info);
		else if (nc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NC(info);
		else if (nc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NC(info);
		else if (nc == Cnd_st_ac_dt_fr) doCnd_st_ac_dt_fr_NC(info);
		else if (nc == Cnd_st_ac_dt_to) doCnd_st_ac_dt_to_NC(info);
		else if (nc == Cnd_end_ac_dt_fr) doCnd_end_ac_dt_fr_NC(info);
		else if (nc == Cnd_end_ac_dt_to) doCnd_end_ac_dt_to_NC(info);
		else if (nc == Cnd_yield_ac_dt_fr) doCnd_yield_ac_dt_fr_NC(info);
		else if (nc == Cnd_yield_ac_dt_to) doCnd_yield_ac_dt_to_NC(info);
		else if (nc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NC(info);
		else if (nc == Cnd_upd_ts_to) doCnd_upd_ts_to_NC(info);
		else if (nc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NC(info);
		else if (nc == Cnd_pr_rate_to) doCnd_pr_rate_to_NC(info);
		else if (nc == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NC(info);
		else if (nc == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NC(info);
		else if (nc == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NC(info);
		else if (nc == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NC(info);
		else if (nc == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NC(info);
		else if (nc == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NC(info);
		else if (nc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NC(info);
		else if (nc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NC(info);
		else if (nc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NC(info);
		else if (nc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_strg_str_ln_cd) doCnd_strg_str_ln_cd_NC(info);
		else if (nc == Cnd_strg_str_ln_nm) doCnd_strg_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NC(info);
		else if (nc == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NC(info);
		else if (nc == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NC(info);
		else if (nc == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_abort_flg) doCnd_abort_flg_NC(info);
		else if (nc == Cnd_inc_yield_oper_flg) doCnd_inc_yield_oper_flg_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NC(info);
		else if (nc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NC(info);
		else if (nc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NC(info);
		else if (nc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NC(info);
		else if (nc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NC(info);
		else if (nc == Cnd_act_usr_cd) doCnd_act_usr_cd_NC(info);
		else if (nc == Cnd_act_usr_nm) doCnd_act_usr_nm_NC(info);
		else if (nc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NC(info);
		else if (nc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NC(info);
		else if (nc == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NC(info);
		else if (nc == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NC(info);
		else if (nc == Cnd_oper_rsrc) doCnd_oper_rsrc_NC(info);
		else if (nc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NC(info);
		else if (nc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NC(info);
		else if (nc == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NC(info);
		else if (nc == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NC(info);
		else if (nc == Cnd_mfg_inst_unit_typ) doCnd_mfg_inst_unit_typ_NC(info);
		else if (nc == Cnd_mfg_inst_unit_typ_nm) doCnd_mfg_inst_unit_typ_nm_NC(info);
		else if (nc == Cnd_po_aprv_sts_typ) doCnd_po_aprv_sts_typ_NC(info);
		else if (nc == Cnd_po_aprv_sts_typ_nm) doCnd_po_aprv_sts_typ_nm_NC(info);
		else if (nc == Cnd_yield_typ) doCnd_yield_typ_NC(info);
		else if (nc == Cnd_yield_typ_nm) doCnd_yield_typ_nm_NC(info);
		else if (nc == Cnd_yield_rsn_cd) doCnd_yield_rsn_cd_NC(info);
		else if (nc == Cnd_yield_rsn_nm) doCnd_yield_rsn_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_oper_ord_no) doCnd_oper_ord_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_oper_inst_no) doCnd_oper_inst_no_NC(info);
		else if (nc == Cnd_oper_act_no) doCnd_oper_act_no_NC(info);
		else if (nc == Cnd_yield_schd_no) doCnd_yield_schd_no_NC(info);
		else if (nc == Cnd_yield_act_no) doCnd_yield_act_no_NC(info);
		else if (nc == Cnd_inst_rpt_rmrks) doCnd_inst_rpt_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_inst_po_cnt_rmrks) doCnd_inst_po_cnt_rmrks_NC(info);
		else if (nc == Cnd_oper_inst_rpt_rmrks) doCnd_oper_inst_rpt_rmrks_NC(info);
		else if (nc == Cnd_oper_intr_rmrks) doCnd_oper_intr_rmrks_NC(info);
		else if (nc == Cnd_yield_schd_intr_rmrks) doCnd_yield_schd_intr_rmrks_NC(info);
		else if (nc == Cnd_yield_schd_rpt_rmrks) doCnd_yield_schd_rpt_rmrks_NC(info);
		else if (nc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_itm_mfg_inst_sub_char1) doCnd_itm_mfg_inst_sub_char1_NC(info);
		else if (nc == Cnd_itm_mfg_inst_sub_char2) doCnd_itm_mfg_inst_sub_char2_NC(info);
		else if (nc == Cnd_itm_mfg_inst_sub_char3) doCnd_itm_mfg_inst_sub_char3_NC(info);
		else if (nc == Cnd_mfg_inst_sub_char1) doCnd_mfg_inst_sub_char1_NC(info);
		else if (nc == Cnd_mfg_inst_sub_char2) doCnd_mfg_inst_sub_char2_NC(info);
		else if (nc == Cnd_mfg_inst_sub_char3) doCnd_mfg_inst_sub_char3_NC(info);
		else if (nc == Cnd_yield_schd_sub_char1) doCnd_yield_schd_sub_char1_NC(info);
		else if (nc == Cnd_yield_schd_sub_char2) doCnd_yield_schd_sub_char2_NC(info);
		else if (nc == Cnd_yield_schd_sub_char3) doCnd_yield_schd_sub_char3_NC(info);
		else if (nc == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NC(info);
		else if (nc == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_sts_typ) doRslt_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_sts_typ_nm) doRslt_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NC(info);
		else if (nc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NC(info);
		else if (nc == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_strg_str_ln_cd) doRslt_strg_str_ln_cd_NC(info);
		else if (nc == columnRslt_strg_str_ln_nm) doRslt_strg_str_ln_nm_NC(info);
		else if (nc == columnRslt_strg_str_ln_cd_none_flg) doRslt_strg_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NC(info);
		else if (nc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NC(info);
		else if (nc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_pr_rate) doRslt_pr_rate_NC(info);
		else if (nc == columnRslt_rqst_dlv_rqst_dt) doRslt_rqst_dlv_rqst_dt_NC(info);
		else if (nc == columnRslt_rqst_dlv_rqst_hm) doRslt_rqst_dlv_rqst_hm_NC(info);
		else if (nc == columnRslt_st_schd_dt) doRslt_st_schd_dt_NC(info);
		else if (nc == columnRslt_st_schd_hm) doRslt_st_schd_hm_NC(info);
		else if (nc == columnRslt_ord_st_schd_dt) doRslt_ord_st_schd_dt_NC(info);
		else if (nc == columnRslt_st_act_dt) doRslt_st_act_dt_NC(info);
		else if (nc == columnRslt_st_act_hm) doRslt_st_act_hm_NC(info);
		else if (nc == columnRslt_st_ac_dt) doRslt_st_ac_dt_NC(info);
		else if (nc == columnRslt_end_schd_dt) doRslt_end_schd_dt_NC(info);
		else if (nc == columnRslt_end_schd_hm) doRslt_end_schd_hm_NC(info);
		else if (nc == columnRslt_ord_end_schd_dt) doRslt_ord_end_schd_dt_NC(info);
		else if (nc == columnRslt_end_act_dt) doRslt_end_act_dt_NC(info);
		else if (nc == columnRslt_end_act_hm) doRslt_end_act_hm_NC(info);
		else if (nc == columnRslt_end_ac_dt) doRslt_end_ac_dt_NC(info);
		else if (nc == columnRslt_yield_schd_dt) doRslt_yield_schd_dt_NC(info);
		else if (nc == columnRslt_yield_schd_hm) doRslt_yield_schd_hm_NC(info);
		else if (nc == columnRslt_yield_act_dt) doRslt_yield_act_dt_NC(info);
		else if (nc == columnRslt_yield_act_hm) doRslt_yield_act_hm_NC(info);
		else if (nc == columnRslt_yield_ac_dt) doRslt_yield_ac_dt_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NC(info);
		else if (nc == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NC(info);
		else if (nc == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NC(info);
		else if (nc == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NC(info);
		else if (nc == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NC(info);
		else if (nc == columnRslt_oper_std_yield) doRslt_oper_std_yield_NC(info);
		else if (nc == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NC(info);
		else if (nc == columnRslt_wip_rate) doRslt_wip_rate_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_oper_rsrc) doRslt_oper_rsrc_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_inst_dt) doRslt_inst_dt_NC(info);
		else if (nc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NC(info);
		else if (nc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NC(info);
		else if (nc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NC(info);
		else if (nc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NC(info);
		else if (nc == columnRslt_inst_rpt_rmrks) doRslt_inst_rpt_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_oper_intr_rmrks) doRslt_oper_intr_rmrks_NC(info);
		else if (nc == columnRslt_oper_inst_rpt_rmrks) doRslt_oper_inst_rpt_rmrks_NC(info);
		else if (nc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NC(info);
		else if (nc == columnRslt_disp_pd) doRslt_disp_pd_NC(info);
		else if (nc == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NC(info);
		else if (nc == columnRslt_itm_std_yield) doRslt_itm_std_yield_NC(info);
		else if (nc == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_mfg_inst_rev) doRslt_mfg_inst_rev_NC(info);
		else if (nc == columnRslt_div_seq) doRslt_div_seq_NC(info);
		else if (nc == columnRslt_mfg_act_no) doRslt_mfg_act_no_NC(info);
		else if (nc == columnRslt_inst_abort_flg) doRslt_inst_abort_flg_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_tgt_flg) doRslt_aprv_tgt_flg_NC(info);
		else if (nc == columnRslt_aprv_dt) doRslt_aprv_dt_NC(info);
		else if (nc == columnRslt_aprv_tm) doRslt_aprv_tm_NC(info);
		else if (nc == columnRslt_aprv_usr_cd) doRslt_aprv_usr_cd_NC(info);
		else if (nc == columnRslt_aprv_usr_nm) doRslt_aprv_usr_nm_NC(info);
		else if (nc == columnRslt_aprv_dpt_cd) doRslt_aprv_dpt_cd_NC(info);
		else if (nc == columnRslt_aprv_dpt_nm) doRslt_aprv_dpt_nm_NC(info);
		else if (nc == columnRslt_aprv_rsn) doRslt_aprv_rsn_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_oper_ord_no) doRslt_oper_ord_no_NC(info);
		else if (nc == columnRslt_oper_inst_no) doRslt_oper_inst_no_NC(info);
		else if (nc == columnRslt_oper_act_no) doRslt_oper_act_no_NC(info);
		else if (nc == columnRslt_mfg_inst_unit_typ) doRslt_mfg_inst_unit_typ_NC(info);
		else if (nc == columnRslt_mfg_inst_unit_typ_nm) doRslt_mfg_inst_unit_typ_nm_NC(info);
		else if (nc == columnRslt_outsrc_flg) doRslt_outsrc_flg_NC(info);
		else if (nc == columnRslt_schd_chg_flg) doRslt_schd_chg_flg_NC(info);
		else if (nc == columnRslt_unschd_inst_flg) doRslt_unschd_inst_flg_NC(info);
		else if (nc == columnRslt_unschd_act_flg) doRslt_unschd_act_flg_NC(info);
		else if (nc == columnRslt_mfg_loc_wg_cd) doRslt_mfg_loc_wg_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_wg_nm) doRslt_mfg_loc_wg_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_site_cd) doRslt_mfg_loc_site_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_site_nm) doRslt_mfg_loc_site_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_po_aprv_sts_typ) doRslt_po_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_po_aprv_sts_typ_nm) doRslt_po_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_yield_oper_flg) doRslt_yield_oper_flg_NC(info);
		else if (nc == columnRslt_yield_oper_ratio) doRslt_yield_oper_ratio_NC(info);
		else if (nc == columnRslt_oper_inst_grp) doRslt_oper_inst_grp_NC(info);
		else if (nc == columnRslt_yield_schd_no) doRslt_yield_schd_no_NC(info);
		else if (nc == columnRslt_yield_act_no) doRslt_yield_act_no_NC(info);
		else if (nc == columnRslt_yield_rate) doRslt_yield_rate_NC(info);
		else if (nc == columnRslt_yield_typ) doRslt_yield_typ_NC(info);
		else if (nc == columnRslt_yield_typ_nm) doRslt_yield_typ_nm_NC(info);
		else if (nc == columnRslt_yield_rsn_cd) doRslt_yield_rsn_cd_NC(info);
		else if (nc == columnRslt_yield_rsn_nm) doRslt_yield_rsn_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_not_stk_flg) doRslt_not_stk_flg_NC(info);
		else if (nc == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NC(info);
		else if (nc == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NC(info);
		else if (nc == columnRslt_yield_schd_intr_rmrks) doRslt_yield_schd_intr_rmrks_NC(info);
		else if (nc == columnRslt_yield_schd_rpt_rmrks) doRslt_yield_schd_rpt_rmrks_NC(info);
		else if (nc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_sub_char1) doRslt_itm_mfg_inst_sub_char1_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_sub_char2) doRslt_itm_mfg_inst_sub_char2_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_sub_char3) doRslt_itm_mfg_inst_sub_char3_NC(info);
		else if (nc == columnRslt_mfg_inst_sub_char1) doRslt_mfg_inst_sub_char1_NC(info);
		else if (nc == columnRslt_mfg_inst_sub_char2) doRslt_mfg_inst_sub_char2_NC(info);
		else if (nc == columnRslt_mfg_inst_sub_char3) doRslt_mfg_inst_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_yield_schd_sub_char1) doRslt_yield_schd_sub_char1_NC(info);
		else if (nc == columnRslt_yield_schd_sub_char2) doRslt_yield_schd_sub_char2_NC(info);
		else if (nc == columnRslt_yield_schd_sub_char3) doRslt_yield_schd_sub_char3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
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
	 * [Cnd]パネルの[disp_unit1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_ord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_stt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_stt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_unschd_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_unschd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unschd_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unschd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_yield_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_yield_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wip_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_pd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_rsn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rsn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_chg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_chg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_grp_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_rpt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_rpt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[yield_schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char3_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_disp_unit1_Group) doCnd_disp_unit1_NE(info);
		else if (ne == Cnd_disp_unit2_Group) doCnd_disp_unit2_NE(info);
		else if (ne == Cnd_tmp_sts_sav_flg) doCnd_tmp_sts_sav_flg_NE(info);
		else if (ne == Cnd_tmp_sts_ord_flg) doCnd_tmp_sts_ord_flg_NE(info);
		else if (ne == Cnd_tmp_sts_stt_flg) doCnd_tmp_sts_stt_flg_NE(info);
		else if (ne == Cnd_tmp_sts_cmpl_flg) doCnd_tmp_sts_cmpl_flg_NE(info);
		else if (ne == Cnd_not_unschd_act_flg) doCnd_not_unschd_act_flg_NE(info);
		else if (ne == Cnd_unschd_act_flg) doCnd_unschd_act_flg_NE(info);
		else if (ne == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NE(info);
		else if (ne == Cnd_inst_dt_to) doCnd_inst_dt_to_NE(info);
		else if (ne == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NE(info);
		else if (ne == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NE(info);
		else if (ne == Cnd_st_ac_dt_fr) doCnd_st_ac_dt_fr_NE(info);
		else if (ne == Cnd_st_ac_dt_to) doCnd_st_ac_dt_to_NE(info);
		else if (ne == Cnd_end_ac_dt_fr) doCnd_end_ac_dt_fr_NE(info);
		else if (ne == Cnd_end_ac_dt_to) doCnd_end_ac_dt_to_NE(info);
		else if (ne == Cnd_yield_ac_dt_fr) doCnd_yield_ac_dt_fr_NE(info);
		else if (ne == Cnd_yield_ac_dt_to) doCnd_yield_ac_dt_to_NE(info);
		else if (ne == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NE(info);
		else if (ne == Cnd_upd_ts_to) doCnd_upd_ts_to_NE(info);
		else if (ne == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NE(info);
		else if (ne == Cnd_pr_rate_to) doCnd_pr_rate_to_NE(info);
		else if (ne == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NE(info);
		else if (ne == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NE(info);
		else if (ne == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NE(info);
		else if (ne == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NE(info);
		else if (ne == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NE(info);
		else if (ne == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NE(info);
		else if (ne == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NE(info);
		else if (ne == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NE(info);
		else if (ne == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NE(info);
		else if (ne == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_strg_str_ln_cd) doCnd_strg_str_ln_cd_NE(info);
		else if (ne == Cnd_strg_str_ln_nm) doCnd_strg_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NE(info);
		else if (ne == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NE(info);
		else if (ne == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NE(info);
		else if (ne == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_abort_flg) doCnd_abort_flg_NE(info);
		else if (ne == Cnd_inc_yield_oper_flg) doCnd_inc_yield_oper_flg_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NE(info);
		else if (ne == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NE(info);
		else if (ne == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NE(info);
		else if (ne == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NE(info);
		else if (ne == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NE(info);
		else if (ne == Cnd_act_usr_cd) doCnd_act_usr_cd_NE(info);
		else if (ne == Cnd_act_usr_nm) doCnd_act_usr_nm_NE(info);
		else if (ne == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NE(info);
		else if (ne == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NE(info);
		else if (ne == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NE(info);
		else if (ne == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NE(info);
		else if (ne == Cnd_oper_rsrc) doCnd_oper_rsrc_NE(info);
		else if (ne == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NE(info);
		else if (ne == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NE(info);
		else if (ne == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NE(info);
		else if (ne == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NE(info);
		else if (ne == Cnd_mfg_inst_unit_typ) doCnd_mfg_inst_unit_typ_NE(info);
		else if (ne == Cnd_mfg_inst_unit_typ_nm) doCnd_mfg_inst_unit_typ_nm_NE(info);
		else if (ne == Cnd_po_aprv_sts_typ) doCnd_po_aprv_sts_typ_NE(info);
		else if (ne == Cnd_po_aprv_sts_typ_nm) doCnd_po_aprv_sts_typ_nm_NE(info);
		else if (ne == Cnd_yield_typ) doCnd_yield_typ_NE(info);
		else if (ne == Cnd_yield_typ_nm) doCnd_yield_typ_nm_NE(info);
		else if (ne == Cnd_yield_rsn_cd) doCnd_yield_rsn_cd_NE(info);
		else if (ne == Cnd_yield_rsn_nm) doCnd_yield_rsn_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_oper_ord_no) doCnd_oper_ord_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_oper_inst_no) doCnd_oper_inst_no_NE(info);
		else if (ne == Cnd_oper_act_no) doCnd_oper_act_no_NE(info);
		else if (ne == Cnd_yield_schd_no) doCnd_yield_schd_no_NE(info);
		else if (ne == Cnd_yield_act_no) doCnd_yield_act_no_NE(info);
		else if (ne == Cnd_inst_rpt_rmrks) doCnd_inst_rpt_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_inst_po_cnt_rmrks) doCnd_inst_po_cnt_rmrks_NE(info);
		else if (ne == Cnd_oper_inst_rpt_rmrks) doCnd_oper_inst_rpt_rmrks_NE(info);
		else if (ne == Cnd_oper_intr_rmrks) doCnd_oper_intr_rmrks_NE(info);
		else if (ne == Cnd_yield_schd_intr_rmrks) doCnd_yield_schd_intr_rmrks_NE(info);
		else if (ne == Cnd_yield_schd_rpt_rmrks) doCnd_yield_schd_rpt_rmrks_NE(info);
		else if (ne == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_itm_mfg_inst_sub_char1) doCnd_itm_mfg_inst_sub_char1_NE(info);
		else if (ne == Cnd_itm_mfg_inst_sub_char2) doCnd_itm_mfg_inst_sub_char2_NE(info);
		else if (ne == Cnd_itm_mfg_inst_sub_char3) doCnd_itm_mfg_inst_sub_char3_NE(info);
		else if (ne == Cnd_mfg_inst_sub_char1) doCnd_mfg_inst_sub_char1_NE(info);
		else if (ne == Cnd_mfg_inst_sub_char2) doCnd_mfg_inst_sub_char2_NE(info);
		else if (ne == Cnd_mfg_inst_sub_char3) doCnd_mfg_inst_sub_char3_NE(info);
		else if (ne == Cnd_yield_schd_sub_char1) doCnd_yield_schd_sub_char1_NE(info);
		else if (ne == Cnd_yield_schd_sub_char2) doCnd_yield_schd_sub_char2_NE(info);
		else if (ne == Cnd_yield_schd_sub_char3) doCnd_yield_schd_sub_char3_NE(info);
		else if (ne == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NE(info);
		else if (ne == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_sts_typ) doRslt_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_sts_typ_nm) doRslt_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NE(info);
		else if (ne == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NE(info);
		else if (ne == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_strg_str_ln_cd) doRslt_strg_str_ln_cd_NE(info);
		else if (ne == columnRslt_strg_str_ln_nm) doRslt_strg_str_ln_nm_NE(info);
		else if (ne == columnRslt_strg_str_ln_cd_none_flg) doRslt_strg_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NE(info);
		else if (ne == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NE(info);
		else if (ne == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_pr_rate) doRslt_pr_rate_NE(info);
		else if (ne == columnRslt_rqst_dlv_rqst_dt) doRslt_rqst_dlv_rqst_dt_NE(info);
		else if (ne == columnRslt_rqst_dlv_rqst_hm) doRslt_rqst_dlv_rqst_hm_NE(info);
		else if (ne == columnRslt_st_schd_dt) doRslt_st_schd_dt_NE(info);
		else if (ne == columnRslt_st_schd_hm) doRslt_st_schd_hm_NE(info);
		else if (ne == columnRslt_ord_st_schd_dt) doRslt_ord_st_schd_dt_NE(info);
		else if (ne == columnRslt_st_act_dt) doRslt_st_act_dt_NE(info);
		else if (ne == columnRslt_st_act_hm) doRslt_st_act_hm_NE(info);
		else if (ne == columnRslt_st_ac_dt) doRslt_st_ac_dt_NE(info);
		else if (ne == columnRslt_end_schd_dt) doRslt_end_schd_dt_NE(info);
		else if (ne == columnRslt_end_schd_hm) doRslt_end_schd_hm_NE(info);
		else if (ne == columnRslt_ord_end_schd_dt) doRslt_ord_end_schd_dt_NE(info);
		else if (ne == columnRslt_end_act_dt) doRslt_end_act_dt_NE(info);
		else if (ne == columnRslt_end_act_hm) doRslt_end_act_hm_NE(info);
		else if (ne == columnRslt_end_ac_dt) doRslt_end_ac_dt_NE(info);
		else if (ne == columnRslt_yield_schd_dt) doRslt_yield_schd_dt_NE(info);
		else if (ne == columnRslt_yield_schd_hm) doRslt_yield_schd_hm_NE(info);
		else if (ne == columnRslt_yield_act_dt) doRslt_yield_act_dt_NE(info);
		else if (ne == columnRslt_yield_act_hm) doRslt_yield_act_hm_NE(info);
		else if (ne == columnRslt_yield_ac_dt) doRslt_yield_ac_dt_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NE(info);
		else if (ne == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NE(info);
		else if (ne == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NE(info);
		else if (ne == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NE(info);
		else if (ne == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NE(info);
		else if (ne == columnRslt_oper_std_yield) doRslt_oper_std_yield_NE(info);
		else if (ne == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NE(info);
		else if (ne == columnRslt_wip_rate) doRslt_wip_rate_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_oper_rsrc) doRslt_oper_rsrc_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_inst_dt) doRslt_inst_dt_NE(info);
		else if (ne == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NE(info);
		else if (ne == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NE(info);
		else if (ne == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NE(info);
		else if (ne == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NE(info);
		else if (ne == columnRslt_inst_rpt_rmrks) doRslt_inst_rpt_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_oper_intr_rmrks) doRslt_oper_intr_rmrks_NE(info);
		else if (ne == columnRslt_oper_inst_rpt_rmrks) doRslt_oper_inst_rpt_rmrks_NE(info);
		else if (ne == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NE(info);
		else if (ne == columnRslt_disp_pd) doRslt_disp_pd_NE(info);
		else if (ne == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NE(info);
		else if (ne == columnRslt_itm_std_yield) doRslt_itm_std_yield_NE(info);
		else if (ne == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_mfg_inst_rev) doRslt_mfg_inst_rev_NE(info);
		else if (ne == columnRslt_div_seq) doRslt_div_seq_NE(info);
		else if (ne == columnRslt_mfg_act_no) doRslt_mfg_act_no_NE(info);
		else if (ne == columnRslt_inst_abort_flg) doRslt_inst_abort_flg_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_tgt_flg) doRslt_aprv_tgt_flg_NE(info);
		else if (ne == columnRslt_aprv_dt) doRslt_aprv_dt_NE(info);
		else if (ne == columnRslt_aprv_tm) doRslt_aprv_tm_NE(info);
		else if (ne == columnRslt_aprv_usr_cd) doRslt_aprv_usr_cd_NE(info);
		else if (ne == columnRslt_aprv_usr_nm) doRslt_aprv_usr_nm_NE(info);
		else if (ne == columnRslt_aprv_dpt_cd) doRslt_aprv_dpt_cd_NE(info);
		else if (ne == columnRslt_aprv_dpt_nm) doRslt_aprv_dpt_nm_NE(info);
		else if (ne == columnRslt_aprv_rsn) doRslt_aprv_rsn_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_oper_ord_no) doRslt_oper_ord_no_NE(info);
		else if (ne == columnRslt_oper_inst_no) doRslt_oper_inst_no_NE(info);
		else if (ne == columnRslt_oper_act_no) doRslt_oper_act_no_NE(info);
		else if (ne == columnRslt_mfg_inst_unit_typ) doRslt_mfg_inst_unit_typ_NE(info);
		else if (ne == columnRslt_mfg_inst_unit_typ_nm) doRslt_mfg_inst_unit_typ_nm_NE(info);
		else if (ne == columnRslt_outsrc_flg) doRslt_outsrc_flg_NE(info);
		else if (ne == columnRslt_schd_chg_flg) doRslt_schd_chg_flg_NE(info);
		else if (ne == columnRslt_unschd_inst_flg) doRslt_unschd_inst_flg_NE(info);
		else if (ne == columnRslt_unschd_act_flg) doRslt_unschd_act_flg_NE(info);
		else if (ne == columnRslt_mfg_loc_wg_cd) doRslt_mfg_loc_wg_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_wg_nm) doRslt_mfg_loc_wg_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_site_cd) doRslt_mfg_loc_site_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_site_nm) doRslt_mfg_loc_site_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_po_aprv_sts_typ) doRslt_po_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_po_aprv_sts_typ_nm) doRslt_po_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_yield_oper_flg) doRslt_yield_oper_flg_NE(info);
		else if (ne == columnRslt_yield_oper_ratio) doRslt_yield_oper_ratio_NE(info);
		else if (ne == columnRslt_oper_inst_grp) doRslt_oper_inst_grp_NE(info);
		else if (ne == columnRslt_yield_schd_no) doRslt_yield_schd_no_NE(info);
		else if (ne == columnRslt_yield_act_no) doRslt_yield_act_no_NE(info);
		else if (ne == columnRslt_yield_rate) doRslt_yield_rate_NE(info);
		else if (ne == columnRslt_yield_typ) doRslt_yield_typ_NE(info);
		else if (ne == columnRslt_yield_typ_nm) doRslt_yield_typ_nm_NE(info);
		else if (ne == columnRslt_yield_rsn_cd) doRslt_yield_rsn_cd_NE(info);
		else if (ne == columnRslt_yield_rsn_nm) doRslt_yield_rsn_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_not_stk_flg) doRslt_not_stk_flg_NE(info);
		else if (ne == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NE(info);
		else if (ne == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NE(info);
		else if (ne == columnRslt_yield_schd_intr_rmrks) doRslt_yield_schd_intr_rmrks_NE(info);
		else if (ne == columnRslt_yield_schd_rpt_rmrks) doRslt_yield_schd_rpt_rmrks_NE(info);
		else if (ne == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_sub_char1) doRslt_itm_mfg_inst_sub_char1_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_sub_char2) doRslt_itm_mfg_inst_sub_char2_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_sub_char3) doRslt_itm_mfg_inst_sub_char3_NE(info);
		else if (ne == columnRslt_mfg_inst_sub_char1) doRslt_mfg_inst_sub_char1_NE(info);
		else if (ne == columnRslt_mfg_inst_sub_char2) doRslt_mfg_inst_sub_char2_NE(info);
		else if (ne == columnRslt_mfg_inst_sub_char3) doRslt_mfg_inst_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_yield_schd_sub_char1) doRslt_yield_schd_sub_char1_NE(info);
		else if (ne == columnRslt_yield_schd_sub_char2) doRslt_yield_schd_sub_char2_NE(info);
		else if (ne == columnRslt_yield_schd_sub_char3) doRslt_yield_schd_sub_char3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
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
	 * [Cnd]パネルの[disp_unit1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_ord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_stt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_stt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_unschd_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_unschd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unschd_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unschd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_yield_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_yield_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wip_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_pd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_rsn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rsn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_chg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_chg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_grp_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_rpt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_rpt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[yield_schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char3_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_disp_unit1_Group) doCnd_disp_unit1_NX(info);
		else if (nx == Cnd_disp_unit2_Group) doCnd_disp_unit2_NX(info);
		else if (nx == Cnd_tmp_sts_sav_flg) doCnd_tmp_sts_sav_flg_NX(info);
		else if (nx == Cnd_tmp_sts_ord_flg) doCnd_tmp_sts_ord_flg_NX(info);
		else if (nx == Cnd_tmp_sts_stt_flg) doCnd_tmp_sts_stt_flg_NX(info);
		else if (nx == Cnd_tmp_sts_cmpl_flg) doCnd_tmp_sts_cmpl_flg_NX(info);
		else if (nx == Cnd_not_unschd_act_flg) doCnd_not_unschd_act_flg_NX(info);
		else if (nx == Cnd_unschd_act_flg) doCnd_unschd_act_flg_NX(info);
		else if (nx == Cnd_inst_dt_fr) doCnd_inst_dt_fr_NX(info);
		else if (nx == Cnd_inst_dt_to) doCnd_inst_dt_to_NX(info);
		else if (nx == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_NX(info);
		else if (nx == Cnd_aprv_dt_to) doCnd_aprv_dt_to_NX(info);
		else if (nx == Cnd_st_ac_dt_fr) doCnd_st_ac_dt_fr_NX(info);
		else if (nx == Cnd_st_ac_dt_to) doCnd_st_ac_dt_to_NX(info);
		else if (nx == Cnd_end_ac_dt_fr) doCnd_end_ac_dt_fr_NX(info);
		else if (nx == Cnd_end_ac_dt_to) doCnd_end_ac_dt_to_NX(info);
		else if (nx == Cnd_yield_ac_dt_fr) doCnd_yield_ac_dt_fr_NX(info);
		else if (nx == Cnd_yield_ac_dt_to) doCnd_yield_ac_dt_to_NX(info);
		else if (nx == Cnd_upd_ts_fr) doCnd_upd_ts_fr_NX(info);
		else if (nx == Cnd_upd_ts_to) doCnd_upd_ts_to_NX(info);
		else if (nx == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NX(info);
		else if (nx == Cnd_pr_rate_to) doCnd_pr_rate_to_NX(info);
		else if (nx == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_NX(info);
		else if (nx == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_NX(info);
		else if (nx == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_NX(info);
		else if (nx == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_NX(info);
		else if (nx == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_NX(info);
		else if (nx == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_NX(info);
		else if (nx == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NX(info);
		else if (nx == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NX(info);
		else if (nx == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_NX(info);
		else if (nx == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_strg_str_ln_cd) doCnd_strg_str_ln_cd_NX(info);
		else if (nx == Cnd_strg_str_ln_nm) doCnd_strg_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_loc_cd) doCnd_oper_loc_cd_NX(info);
		else if (nx == Cnd_oper_loc_nm) doCnd_oper_loc_nm_NX(info);
		else if (nx == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_NX(info);
		else if (nx == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_abort_flg) doCnd_abort_flg_NX(info);
		else if (nx == Cnd_inc_yield_oper_flg) doCnd_inc_yield_oper_flg_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_NX(info);
		else if (nx == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NX(info);
		else if (nx == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NX(info);
		else if (nx == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NX(info);
		else if (nx == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NX(info);
		else if (nx == Cnd_act_usr_cd) doCnd_act_usr_cd_NX(info);
		else if (nx == Cnd_act_usr_nm) doCnd_act_usr_nm_NX(info);
		else if (nx == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NX(info);
		else if (nx == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NX(info);
		else if (nx == Cnd_oper_usr_cd) doCnd_oper_usr_cd_NX(info);
		else if (nx == Cnd_oper_usr_nm) doCnd_oper_usr_nm_NX(info);
		else if (nx == Cnd_oper_rsrc) doCnd_oper_rsrc_NX(info);
		else if (nx == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_NX(info);
		else if (nx == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_NX(info);
		else if (nx == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_NX(info);
		else if (nx == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_NX(info);
		else if (nx == Cnd_mfg_inst_unit_typ) doCnd_mfg_inst_unit_typ_NX(info);
		else if (nx == Cnd_mfg_inst_unit_typ_nm) doCnd_mfg_inst_unit_typ_nm_NX(info);
		else if (nx == Cnd_po_aprv_sts_typ) doCnd_po_aprv_sts_typ_NX(info);
		else if (nx == Cnd_po_aprv_sts_typ_nm) doCnd_po_aprv_sts_typ_nm_NX(info);
		else if (nx == Cnd_yield_typ) doCnd_yield_typ_NX(info);
		else if (nx == Cnd_yield_typ_nm) doCnd_yield_typ_nm_NX(info);
		else if (nx == Cnd_yield_rsn_cd) doCnd_yield_rsn_cd_NX(info);
		else if (nx == Cnd_yield_rsn_nm) doCnd_yield_rsn_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_oper_ord_no) doCnd_oper_ord_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_oper_inst_no) doCnd_oper_inst_no_NX(info);
		else if (nx == Cnd_oper_act_no) doCnd_oper_act_no_NX(info);
		else if (nx == Cnd_yield_schd_no) doCnd_yield_schd_no_NX(info);
		else if (nx == Cnd_yield_act_no) doCnd_yield_act_no_NX(info);
		else if (nx == Cnd_inst_rpt_rmrks) doCnd_inst_rpt_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_inst_po_cnt_rmrks) doCnd_inst_po_cnt_rmrks_NX(info);
		else if (nx == Cnd_oper_inst_rpt_rmrks) doCnd_oper_inst_rpt_rmrks_NX(info);
		else if (nx == Cnd_oper_intr_rmrks) doCnd_oper_intr_rmrks_NX(info);
		else if (nx == Cnd_yield_schd_intr_rmrks) doCnd_yield_schd_intr_rmrks_NX(info);
		else if (nx == Cnd_yield_schd_rpt_rmrks) doCnd_yield_schd_rpt_rmrks_NX(info);
		else if (nx == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_itm_mfg_inst_sub_char1) doCnd_itm_mfg_inst_sub_char1_NX(info);
		else if (nx == Cnd_itm_mfg_inst_sub_char2) doCnd_itm_mfg_inst_sub_char2_NX(info);
		else if (nx == Cnd_itm_mfg_inst_sub_char3) doCnd_itm_mfg_inst_sub_char3_NX(info);
		else if (nx == Cnd_mfg_inst_sub_char1) doCnd_mfg_inst_sub_char1_NX(info);
		else if (nx == Cnd_mfg_inst_sub_char2) doCnd_mfg_inst_sub_char2_NX(info);
		else if (nx == Cnd_mfg_inst_sub_char3) doCnd_mfg_inst_sub_char3_NX(info);
		else if (nx == Cnd_yield_schd_sub_char1) doCnd_yield_schd_sub_char1_NX(info);
		else if (nx == Cnd_yield_schd_sub_char2) doCnd_yield_schd_sub_char2_NX(info);
		else if (nx == Cnd_yield_schd_sub_char3) doCnd_yield_schd_sub_char3_NX(info);
		else if (nx == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_NX(info);
		else if (nx == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_sts_typ) doRslt_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_sts_typ_nm) doRslt_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_NX(info);
		else if (nx == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_NX(info);
		else if (nx == columnRslt_mfg_str_ln_cd_none_flg) doRslt_mfg_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_strg_str_ln_cd) doRslt_strg_str_ln_cd_NX(info);
		else if (nx == columnRslt_strg_str_ln_nm) doRslt_strg_str_ln_nm_NX(info);
		else if (nx == columnRslt_strg_str_ln_cd_none_flg) doRslt_strg_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_NX(info);
		else if (nx == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_NX(info);
		else if (nx == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_pr_rate) doRslt_pr_rate_NX(info);
		else if (nx == columnRslt_rqst_dlv_rqst_dt) doRslt_rqst_dlv_rqst_dt_NX(info);
		else if (nx == columnRslt_rqst_dlv_rqst_hm) doRslt_rqst_dlv_rqst_hm_NX(info);
		else if (nx == columnRslt_st_schd_dt) doRslt_st_schd_dt_NX(info);
		else if (nx == columnRslt_st_schd_hm) doRslt_st_schd_hm_NX(info);
		else if (nx == columnRslt_ord_st_schd_dt) doRslt_ord_st_schd_dt_NX(info);
		else if (nx == columnRslt_st_act_dt) doRslt_st_act_dt_NX(info);
		else if (nx == columnRslt_st_act_hm) doRslt_st_act_hm_NX(info);
		else if (nx == columnRslt_st_ac_dt) doRslt_st_ac_dt_NX(info);
		else if (nx == columnRslt_end_schd_dt) doRslt_end_schd_dt_NX(info);
		else if (nx == columnRslt_end_schd_hm) doRslt_end_schd_hm_NX(info);
		else if (nx == columnRslt_ord_end_schd_dt) doRslt_ord_end_schd_dt_NX(info);
		else if (nx == columnRslt_end_act_dt) doRslt_end_act_dt_NX(info);
		else if (nx == columnRslt_end_act_hm) doRslt_end_act_hm_NX(info);
		else if (nx == columnRslt_end_ac_dt) doRslt_end_ac_dt_NX(info);
		else if (nx == columnRslt_yield_schd_dt) doRslt_yield_schd_dt_NX(info);
		else if (nx == columnRslt_yield_schd_hm) doRslt_yield_schd_hm_NX(info);
		else if (nx == columnRslt_yield_act_dt) doRslt_yield_act_dt_NX(info);
		else if (nx == columnRslt_yield_act_hm) doRslt_yield_act_hm_NX(info);
		else if (nx == columnRslt_yield_ac_dt) doRslt_yield_ac_dt_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_NX(info);
		else if (nx == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_NX(info);
		else if (nx == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_NX(info);
		else if (nx == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_NX(info);
		else if (nx == columnRslt_oper_str_ln_cd_none_flg) doRslt_oper_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_NX(info);
		else if (nx == columnRslt_oper_std_yield) doRslt_oper_std_yield_NX(info);
		else if (nx == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_NX(info);
		else if (nx == columnRslt_wip_rate) doRslt_wip_rate_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_oper_rsrc) doRslt_oper_rsrc_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_inst_dt) doRslt_inst_dt_NX(info);
		else if (nx == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NX(info);
		else if (nx == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NX(info);
		else if (nx == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NX(info);
		else if (nx == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NX(info);
		else if (nx == columnRslt_inst_rpt_rmrks) doRslt_inst_rpt_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_oper_intr_rmrks) doRslt_oper_intr_rmrks_NX(info);
		else if (nx == columnRslt_oper_inst_rpt_rmrks) doRslt_oper_inst_rpt_rmrks_NX(info);
		else if (nx == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NX(info);
		else if (nx == columnRslt_disp_pd) doRslt_disp_pd_NX(info);
		else if (nx == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_NX(info);
		else if (nx == columnRslt_itm_std_yield) doRslt_itm_std_yield_NX(info);
		else if (nx == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_mfg_inst_rev) doRslt_mfg_inst_rev_NX(info);
		else if (nx == columnRslt_div_seq) doRslt_div_seq_NX(info);
		else if (nx == columnRslt_mfg_act_no) doRslt_mfg_act_no_NX(info);
		else if (nx == columnRslt_inst_abort_flg) doRslt_inst_abort_flg_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_tgt_flg) doRslt_aprv_tgt_flg_NX(info);
		else if (nx == columnRslt_aprv_dt) doRslt_aprv_dt_NX(info);
		else if (nx == columnRslt_aprv_tm) doRslt_aprv_tm_NX(info);
		else if (nx == columnRslt_aprv_usr_cd) doRslt_aprv_usr_cd_NX(info);
		else if (nx == columnRslt_aprv_usr_nm) doRslt_aprv_usr_nm_NX(info);
		else if (nx == columnRslt_aprv_dpt_cd) doRslt_aprv_dpt_cd_NX(info);
		else if (nx == columnRslt_aprv_dpt_nm) doRslt_aprv_dpt_nm_NX(info);
		else if (nx == columnRslt_aprv_rsn) doRslt_aprv_rsn_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_oper_ord_no) doRslt_oper_ord_no_NX(info);
		else if (nx == columnRslt_oper_inst_no) doRslt_oper_inst_no_NX(info);
		else if (nx == columnRslt_oper_act_no) doRslt_oper_act_no_NX(info);
		else if (nx == columnRslt_mfg_inst_unit_typ) doRslt_mfg_inst_unit_typ_NX(info);
		else if (nx == columnRslt_mfg_inst_unit_typ_nm) doRslt_mfg_inst_unit_typ_nm_NX(info);
		else if (nx == columnRslt_outsrc_flg) doRslt_outsrc_flg_NX(info);
		else if (nx == columnRslt_schd_chg_flg) doRslt_schd_chg_flg_NX(info);
		else if (nx == columnRslt_unschd_inst_flg) doRslt_unschd_inst_flg_NX(info);
		else if (nx == columnRslt_unschd_act_flg) doRslt_unschd_act_flg_NX(info);
		else if (nx == columnRslt_mfg_loc_wg_cd) doRslt_mfg_loc_wg_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_wg_nm) doRslt_mfg_loc_wg_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_site_cd) doRslt_mfg_loc_site_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_site_nm) doRslt_mfg_loc_site_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_po_aprv_sts_typ) doRslt_po_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_po_aprv_sts_typ_nm) doRslt_po_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_yield_oper_flg) doRslt_yield_oper_flg_NX(info);
		else if (nx == columnRslt_yield_oper_ratio) doRslt_yield_oper_ratio_NX(info);
		else if (nx == columnRslt_oper_inst_grp) doRslt_oper_inst_grp_NX(info);
		else if (nx == columnRslt_yield_schd_no) doRslt_yield_schd_no_NX(info);
		else if (nx == columnRslt_yield_act_no) doRslt_yield_act_no_NX(info);
		else if (nx == columnRslt_yield_rate) doRslt_yield_rate_NX(info);
		else if (nx == columnRslt_yield_typ) doRslt_yield_typ_NX(info);
		else if (nx == columnRslt_yield_typ_nm) doRslt_yield_typ_nm_NX(info);
		else if (nx == columnRslt_yield_rsn_cd) doRslt_yield_rsn_cd_NX(info);
		else if (nx == columnRslt_yield_rsn_nm) doRslt_yield_rsn_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_not_stk_flg) doRslt_not_stk_flg_NX(info);
		else if (nx == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_NX(info);
		else if (nx == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_NX(info);
		else if (nx == columnRslt_yield_schd_intr_rmrks) doRslt_yield_schd_intr_rmrks_NX(info);
		else if (nx == columnRslt_yield_schd_rpt_rmrks) doRslt_yield_schd_rpt_rmrks_NX(info);
		else if (nx == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_sub_char1) doRslt_itm_mfg_inst_sub_char1_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_sub_char2) doRslt_itm_mfg_inst_sub_char2_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_sub_char3) doRslt_itm_mfg_inst_sub_char3_NX(info);
		else if (nx == columnRslt_mfg_inst_sub_char1) doRslt_mfg_inst_sub_char1_NX(info);
		else if (nx == columnRslt_mfg_inst_sub_char2) doRslt_mfg_inst_sub_char2_NX(info);
		else if (nx == columnRslt_mfg_inst_sub_char3) doRslt_mfg_inst_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_yield_schd_sub_char1) doRslt_yield_schd_sub_char1_NX(info);
		else if (nx == columnRslt_yield_schd_sub_char2) doRslt_yield_schd_sub_char2_NX(info);
		else if (nx == columnRslt_yield_schd_sub_char3) doRslt_yield_schd_sub_char3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
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
	 * [Cnd]パネルの[disp_unit1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_ord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_stt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_stt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tmp_sts_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tmp_sts_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_unschd_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_unschd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unschd_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unschd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_yield_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_yield_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_none_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wip_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_pd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_rsn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rsn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_chg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_chg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unschd_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unschd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_grp_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_rpt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_rpt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[yield_schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char3_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_inst_dt_fr) doCnd_inst_dt_fr_LC(info);
		else if (lc == Cnd_inst_dt_to) doCnd_inst_dt_to_LC(info);
		else if (lc == Cnd_aprv_dt_fr) doCnd_aprv_dt_fr_LC(info);
		else if (lc == Cnd_aprv_dt_to) doCnd_aprv_dt_to_LC(info);
		else if (lc == Cnd_st_ac_dt_fr) doCnd_st_ac_dt_fr_LC(info);
		else if (lc == Cnd_st_ac_dt_to) doCnd_st_ac_dt_to_LC(info);
		else if (lc == Cnd_end_ac_dt_fr) doCnd_end_ac_dt_fr_LC(info);
		else if (lc == Cnd_end_ac_dt_to) doCnd_end_ac_dt_to_LC(info);
		else if (lc == Cnd_yield_ac_dt_fr) doCnd_yield_ac_dt_fr_LC(info);
		else if (lc == Cnd_yield_ac_dt_to) doCnd_yield_ac_dt_to_LC(info);
		else if (lc == Cnd_upd_ts_fr) doCnd_upd_ts_fr_LC(info);
		else if (lc == Cnd_upd_ts_to) doCnd_upd_ts_to_LC(info);
		else if (lc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_LC(info);
		else if (lc == Cnd_pr_rate_to) doCnd_pr_rate_to_LC(info);
		else if (lc == Cnd_mfg_mtd_typ) doCnd_mfg_mtd_typ_LC(info);
		else if (lc == Cnd_mfg_mtd_typ_nm) doCnd_mfg_mtd_typ_nm_LC(info);
		else if (lc == Cnd_mfg_loc_site_cd) doCnd_mfg_loc_site_cd_LC(info);
		else if (lc == Cnd_mfg_loc_site_nm) doCnd_mfg_loc_site_nm_LC(info);
		else if (lc == Cnd_mfg_loc_wg_cd) doCnd_mfg_loc_wg_cd_LC(info);
		else if (lc == Cnd_mfg_loc_wg_nm) doCnd_mfg_loc_wg_nm_LC(info);
		else if (lc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_LC(info);
		else if (lc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_LC(info);
		else if (lc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_mfg_str_ln_cd) doCnd_mfg_str_ln_cd_LC(info);
		else if (lc == Cnd_mfg_str_ln_nm) doCnd_mfg_str_ln_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == Cnd_strg_str_ln_cd) doCnd_strg_str_ln_cd_LC(info);
		else if (lc == Cnd_strg_str_ln_nm) doCnd_strg_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_loc_cd) doCnd_oper_loc_cd_LC(info);
		else if (lc == Cnd_oper_loc_nm) doCnd_oper_loc_nm_LC(info);
		else if (lc == Cnd_oper_str_ln_cd) doCnd_oper_str_ln_cd_LC(info);
		else if (lc == Cnd_oper_str_ln_nm) doCnd_oper_str_ln_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ) doCnd_mfg_aprv_sts_typ_LC(info);
		else if (lc == Cnd_mfg_aprv_sts_typ_nm) doCnd_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_LC(info);
		else if (lc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_LC(info);
		else if (lc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_LC(info);
		else if (lc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_LC(info);
		else if (lc == Cnd_act_usr_cd) doCnd_act_usr_cd_LC(info);
		else if (lc == Cnd_act_usr_nm) doCnd_act_usr_nm_LC(info);
		else if (lc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_LC(info);
		else if (lc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_LC(info);
		else if (lc == Cnd_oper_usr_cd) doCnd_oper_usr_cd_LC(info);
		else if (lc == Cnd_oper_usr_nm) doCnd_oper_usr_nm_LC(info);
		else if (lc == Cnd_oper_rsrc) doCnd_oper_rsrc_LC(info);
		else if (lc == Cnd_aprv_usr_cd) doCnd_aprv_usr_cd_LC(info);
		else if (lc == Cnd_aprv_usr_nm) doCnd_aprv_usr_nm_LC(info);
		else if (lc == Cnd_aprv_dpt_cd) doCnd_aprv_dpt_cd_LC(info);
		else if (lc == Cnd_aprv_dpt_nm) doCnd_aprv_dpt_nm_LC(info);
		else if (lc == Cnd_mfg_inst_unit_typ) doCnd_mfg_inst_unit_typ_LC(info);
		else if (lc == Cnd_mfg_inst_unit_typ_nm) doCnd_mfg_inst_unit_typ_nm_LC(info);
		else if (lc == Cnd_po_aprv_sts_typ) doCnd_po_aprv_sts_typ_LC(info);
		else if (lc == Cnd_po_aprv_sts_typ_nm) doCnd_po_aprv_sts_typ_nm_LC(info);
		else if (lc == Cnd_yield_typ) doCnd_yield_typ_LC(info);
		else if (lc == Cnd_yield_typ_nm) doCnd_yield_typ_nm_LC(info);
		else if (lc == Cnd_yield_rsn_cd) doCnd_yield_rsn_cd_LC(info);
		else if (lc == Cnd_yield_rsn_nm) doCnd_yield_rsn_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_oper_ord_no) doCnd_oper_ord_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_oper_inst_no) doCnd_oper_inst_no_LC(info);
		else if (lc == Cnd_oper_act_no) doCnd_oper_act_no_LC(info);
		else if (lc == Cnd_yield_schd_no) doCnd_yield_schd_no_LC(info);
		else if (lc == Cnd_yield_act_no) doCnd_yield_act_no_LC(info);
		else if (lc == Cnd_inst_rpt_rmrks) doCnd_inst_rpt_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_inst_po_cnt_rmrks) doCnd_inst_po_cnt_rmrks_LC(info);
		else if (lc == Cnd_oper_inst_rpt_rmrks) doCnd_oper_inst_rpt_rmrks_LC(info);
		else if (lc == Cnd_oper_intr_rmrks) doCnd_oper_intr_rmrks_LC(info);
		else if (lc == Cnd_yield_schd_intr_rmrks) doCnd_yield_schd_intr_rmrks_LC(info);
		else if (lc == Cnd_yield_schd_rpt_rmrks) doCnd_yield_schd_rpt_rmrks_LC(info);
		else if (lc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_itm_mfg_inst_sub_char1) doCnd_itm_mfg_inst_sub_char1_LC(info);
		else if (lc == Cnd_itm_mfg_inst_sub_char2) doCnd_itm_mfg_inst_sub_char2_LC(info);
		else if (lc == Cnd_itm_mfg_inst_sub_char3) doCnd_itm_mfg_inst_sub_char3_LC(info);
		else if (lc == Cnd_mfg_inst_sub_char1) doCnd_mfg_inst_sub_char1_LC(info);
		else if (lc == Cnd_mfg_inst_sub_char2) doCnd_mfg_inst_sub_char2_LC(info);
		else if (lc == Cnd_mfg_inst_sub_char3) doCnd_mfg_inst_sub_char3_LC(info);
		else if (lc == Cnd_yield_schd_sub_char1) doCnd_yield_schd_sub_char1_LC(info);
		else if (lc == Cnd_yield_schd_sub_char2) doCnd_yield_schd_sub_char2_LC(info);
		else if (lc == Cnd_yield_schd_sub_char3) doCnd_yield_schd_sub_char3_LC(info);
		else if (lc == columnRslt_mfg_mtd_typ) doRslt_mfg_mtd_typ_LC(info);
		else if (lc == columnRslt_mfg_mtd_typ_nm) doRslt_mfg_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_sts_typ) doRslt_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_sts_typ_nm) doRslt_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_mfg_str_ln_cd) doRslt_mfg_str_ln_cd_LC(info);
		else if (lc == columnRslt_mfg_str_ln_nm) doRslt_mfg_str_ln_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_strg_str_ln_cd) doRslt_strg_str_ln_cd_LC(info);
		else if (lc == columnRslt_strg_str_ln_nm) doRslt_strg_str_ln_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_oper_unit_cd) doRslt_oper_unit_cd_LC(info);
		else if (lc == columnRslt_oper_unit_nm) doRslt_oper_unit_nm_LC(info);
		else if (lc == columnRslt_oper_unit_dec_place) doRslt_oper_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_pr_rate) doRslt_pr_rate_LC(info);
		else if (lc == columnRslt_rqst_dlv_rqst_dt) doRslt_rqst_dlv_rqst_dt_LC(info);
		else if (lc == columnRslt_rqst_dlv_rqst_hm) doRslt_rqst_dlv_rqst_hm_LC(info);
		else if (lc == columnRslt_st_schd_dt) doRslt_st_schd_dt_LC(info);
		else if (lc == columnRslt_st_schd_hm) doRslt_st_schd_hm_LC(info);
		else if (lc == columnRslt_ord_st_schd_dt) doRslt_ord_st_schd_dt_LC(info);
		else if (lc == columnRslt_st_act_dt) doRslt_st_act_dt_LC(info);
		else if (lc == columnRslt_st_act_hm) doRslt_st_act_hm_LC(info);
		else if (lc == columnRslt_st_ac_dt) doRslt_st_ac_dt_LC(info);
		else if (lc == columnRslt_end_schd_dt) doRslt_end_schd_dt_LC(info);
		else if (lc == columnRslt_end_schd_hm) doRslt_end_schd_hm_LC(info);
		else if (lc == columnRslt_ord_end_schd_dt) doRslt_ord_end_schd_dt_LC(info);
		else if (lc == columnRslt_end_act_dt) doRslt_end_act_dt_LC(info);
		else if (lc == columnRslt_end_act_hm) doRslt_end_act_hm_LC(info);
		else if (lc == columnRslt_end_ac_dt) doRslt_end_ac_dt_LC(info);
		else if (lc == columnRslt_yield_schd_dt) doRslt_yield_schd_dt_LC(info);
		else if (lc == columnRslt_yield_schd_hm) doRslt_yield_schd_hm_LC(info);
		else if (lc == columnRslt_yield_act_dt) doRslt_yield_act_dt_LC(info);
		else if (lc == columnRslt_yield_act_hm) doRslt_yield_act_hm_LC(info);
		else if (lc == columnRslt_yield_ac_dt) doRslt_yield_ac_dt_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_oper_loc_cd) doRslt_oper_loc_cd_LC(info);
		else if (lc == columnRslt_oper_loc_nm) doRslt_oper_loc_nm_LC(info);
		else if (lc == columnRslt_oper_str_ln_cd) doRslt_oper_str_ln_cd_LC(info);
		else if (lc == columnRslt_oper_str_ln_nm) doRslt_oper_str_ln_nm_LC(info);
		else if (lc == columnRslt_oper_lower_yield) doRslt_oper_lower_yield_LC(info);
		else if (lc == columnRslt_oper_std_yield) doRslt_oper_std_yield_LC(info);
		else if (lc == columnRslt_oper_upper_yield) doRslt_oper_upper_yield_LC(info);
		else if (lc == columnRslt_wip_rate) doRslt_wip_rate_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_oper_rsrc) doRslt_oper_rsrc_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_inst_dt) doRslt_inst_dt_LC(info);
		else if (lc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_LC(info);
		else if (lc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_LC(info);
		else if (lc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_LC(info);
		else if (lc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_LC(info);
		else if (lc == columnRslt_inst_rpt_rmrks) doRslt_inst_rpt_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_oper_intr_rmrks) doRslt_oper_intr_rmrks_LC(info);
		else if (lc == columnRslt_oper_inst_rpt_rmrks) doRslt_oper_inst_rpt_rmrks_LC(info);
		else if (lc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_LC(info);
		else if (lc == columnRslt_disp_pd) doRslt_disp_pd_LC(info);
		else if (lc == columnRslt_itm_lower_yield) doRslt_itm_lower_yield_LC(info);
		else if (lc == columnRslt_itm_std_yield) doRslt_itm_std_yield_LC(info);
		else if (lc == columnRslt_itm_upper_yield) doRslt_itm_upper_yield_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_mfg_inst_rev) doRslt_mfg_inst_rev_LC(info);
		else if (lc == columnRslt_div_seq) doRslt_div_seq_LC(info);
		else if (lc == columnRslt_mfg_act_no) doRslt_mfg_act_no_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_aprv_dt) doRslt_aprv_dt_LC(info);
		else if (lc == columnRslt_aprv_tm) doRslt_aprv_tm_LC(info);
		else if (lc == columnRslt_aprv_usr_cd) doRslt_aprv_usr_cd_LC(info);
		else if (lc == columnRslt_aprv_usr_nm) doRslt_aprv_usr_nm_LC(info);
		else if (lc == columnRslt_aprv_dpt_cd) doRslt_aprv_dpt_cd_LC(info);
		else if (lc == columnRslt_aprv_dpt_nm) doRslt_aprv_dpt_nm_LC(info);
		else if (lc == columnRslt_aprv_rsn) doRslt_aprv_rsn_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_oper_ord_no) doRslt_oper_ord_no_LC(info);
		else if (lc == columnRslt_oper_inst_no) doRslt_oper_inst_no_LC(info);
		else if (lc == columnRslt_oper_act_no) doRslt_oper_act_no_LC(info);
		else if (lc == columnRslt_mfg_inst_unit_typ) doRslt_mfg_inst_unit_typ_LC(info);
		else if (lc == columnRslt_mfg_inst_unit_typ_nm) doRslt_mfg_inst_unit_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_wg_cd) doRslt_mfg_loc_wg_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_wg_nm) doRslt_mfg_loc_wg_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_site_cd) doRslt_mfg_loc_site_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_site_nm) doRslt_mfg_loc_site_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_po_aprv_sts_typ) doRslt_po_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_po_aprv_sts_typ_nm) doRslt_po_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_yield_oper_ratio) doRslt_yield_oper_ratio_LC(info);
		else if (lc == columnRslt_oper_inst_grp) doRslt_oper_inst_grp_LC(info);
		else if (lc == columnRslt_yield_schd_no) doRslt_yield_schd_no_LC(info);
		else if (lc == columnRslt_yield_act_no) doRslt_yield_act_no_LC(info);
		else if (lc == columnRslt_yield_rate) doRslt_yield_rate_LC(info);
		else if (lc == columnRslt_yield_typ) doRslt_yield_typ_LC(info);
		else if (lc == columnRslt_yield_typ_nm) doRslt_yield_typ_nm_LC(info);
		else if (lc == columnRslt_yield_rsn_cd) doRslt_yield_rsn_cd_LC(info);
		else if (lc == columnRslt_yield_rsn_nm) doRslt_yield_rsn_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_insp_sts_typ) doRslt_insp_sts_typ_LC(info);
		else if (lc == columnRslt_insp_sts_typ_nm) doRslt_insp_sts_typ_nm_LC(info);
		else if (lc == columnRslt_yield_schd_intr_rmrks) doRslt_yield_schd_intr_rmrks_LC(info);
		else if (lc == columnRslt_yield_schd_rpt_rmrks) doRslt_yield_schd_rpt_rmrks_LC(info);
		else if (lc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_sub_char1) doRslt_itm_mfg_inst_sub_char1_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_sub_char2) doRslt_itm_mfg_inst_sub_char2_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_sub_char3) doRslt_itm_mfg_inst_sub_char3_LC(info);
		else if (lc == columnRslt_mfg_inst_sub_char1) doRslt_mfg_inst_sub_char1_LC(info);
		else if (lc == columnRslt_mfg_inst_sub_char2) doRslt_mfg_inst_sub_char2_LC(info);
		else if (lc == columnRslt_mfg_inst_sub_char3) doRslt_mfg_inst_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_yield_schd_sub_char1) doRslt_yield_schd_sub_char1_LC(info);
		else if (lc == columnRslt_yield_schd_sub_char2) doRslt_yield_schd_sub_char2_LC(info);
		else if (lc == columnRslt_yield_schd_sub_char3) doRslt_yield_schd_sub_char3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
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
	 * [Cnd]パネルの[inst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[st_ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_st_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[end_ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_end_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upd_ts_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_ts_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pr_rate_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pr_rate_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_rsrc_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_unit_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_unit_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_mfg_inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[yield_schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_yield_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_str_ln_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dlv_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_act_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_act_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_act_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_act_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wip_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wip_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_rsrc_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_pd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[div_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_div_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_tm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_rsn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_rsn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_unit_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_unit_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_oper_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_oper_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_grp_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_rpt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_rpt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[yield_schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[yield_schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_yield_schd_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_mfg_mtd_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_site_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_strg_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_loc_cd]の作成メソッド
	 */
	public MCList getCnd_oper_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_oper_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgAprvStsTyp(row, info);
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
	 * コンボ／リストのリスト[Cnd_lot_no]の作成メソッド
	 */
	public MCList getCnd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inst_usr_cd]の作成メソッド
	 */
	public MCList getCnd_inst_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_inst_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_inst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_usr_cd]の作成メソッド
	 */
	public MCList getCnd_act_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_act_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_usr_cd]の作成メソッド
	 */
	public MCList getCnd_oper_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_usr_cd]の作成メソッド
	 */
	public MCList getCnd_aprv_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_aprv_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_inst_unit_typ]の作成メソッド
	 */
	public MCList getCnd_mfg_inst_unit_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgInstUnitTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_po_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_po_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_yield_typ]の作成メソッド
	 */
	public MCList getCnd_yield_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getYieldTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_yield_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_yield_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getYieldBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bom_ptn]の作成メソッド
	 */
	public MCList getRslt_bom_ptn(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_strg_loc_cd]の作成メソッド
	 */
	public MCList getRslt_strg_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL1070.Srch01")) {
			return new MS_MSBCL1070_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL1070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1070_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1070_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL1070_Srch01Bridge() {
			p_MS_MSBCL1070_Srch01 = new MCParam(PDef.MS_MSBCL1070_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1070_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1070.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1070.RsltR.class));

			p_MS_MSBCL1070_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1070_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1070_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1070_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1070_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1070.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1070.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1070.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1070.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1070_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1070.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1070_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1070.RsltR>)p_MS_MSBCL1070_Srch01.getContainerParam().getDownBlock(0));
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