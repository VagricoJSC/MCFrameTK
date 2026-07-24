package mcframe.clientMSBC.MSBCP1150;

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
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Srch01Caller;
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Srch02Caller;
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Srch03Caller;
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Imp01Caller;
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Upd01Caller;
import mcframe.clientMSBC.MSBCP1150.MSBCP_WkActReg_MC.MS_MSBCL1150_Del01Caller;

/**
 * 画面"MSBCP_WkActReg"パネルクラスです。<p>
 *
 * 一覧形式での工数実績の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_WkActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP1150";

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
	// [DispUnit]ブロック関連のField定義
	public MCPanel DispUnitPanel = null;
	public MCTitledBorder DispUnitTitledBorder = null;
	// [DispUnit]ブロックの項目のField定義
	// [OperSts]ブロック関連のField定義
	public MCPanel OperStsPanel = null;
	public MCTitledBorder OperStsTitledBorder = null;
	// [OperSts]ブロックの項目のField定義
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
	// [Mes]ブロック関連のField定義
	public MCPanel MesPanel = null;
	public MCTitledBorder MesTitledBorder = null;
	// [Mes]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * ACT,Result;SCHD,Schedule ACT,実績;SCHD,予定.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit_Group = null;
	public MCRadioButton Cnd_disp_unit_ACT = null;
	public MCRadioButton Cnd_disp_unit_SCHD = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_ord_flg = null;
	/**
	 * In process 着手中.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_stt_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_cmpl_flg = null;
	/**
	 * No order 指図無し.<p>
	 *
	 */
	public MCCheckBox Cnd_oper_no_inst_flg = null;
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
	/**
	 * No scheduled 予定無し.<p>
	 *
	 */
	public MCCheckBox Cnd_no_schd_flg = null;
	/**
	 * For MES ＭＥＳ対象.<p>
	 *
	 */
	public MCCheckBox Cnd_mes_tgt_flg = null;
	/**
	 * Not for MES ＭＥＳ対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_mes_tgt_flg = null;
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
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
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_oper_st_schd_dt_p_PPanel;
	public MCDateField Cnd_oper_st_schd_dt_fr;	// [Cnd]の[oper_st_schd_dt_p.ymd_fr]を[Cnd_oper_st_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_oper_st_schd_hm_fr;	// [Cnd]の[oper_st_schd_dt_p.hm_fr]を[Cnd_oper_st_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_oper_st_schd_dt_to;	// [Cnd]の[oper_st_schd_dt_p.ymd_to]を[Cnd_oper_st_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_oper_st_schd_hm_to;	// [Cnd]の[oper_st_schd_dt_p.hm_to]を[Cnd_oper_st_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_oper_end_schd_dt_p_PPanel;
	public MCDateField Cnd_oper_end_schd_dt_fr;	// [Cnd]の[oper_end_schd_dt_p.ymd_fr]を[Cnd_oper_end_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_oper_end_schd_hm_fr;	// [Cnd]の[oper_end_schd_dt_p.hm_fr]を[Cnd_oper_end_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_oper_end_schd_dt_to;	// [Cnd]の[oper_end_schd_dt_p.ymd_to]を[Cnd_oper_end_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_oper_end_schd_hm_to;	// [Cnd]の[oper_end_schd_dt_p.hm_to]を[Cnd_oper_end_schd_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_wk_cost_cd_Label = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCTextField Cnd_wk_cost_nm = null;
	public MCLabel Cnd_wk_rsn_cd_Label = null;
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wk_rsn_cd = null;
	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public MCTextField Cnd_wk_rsn_nm = null;
	public MCLabel Cnd_wk_day_cd_Label = null;
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wk_day_cd = null;
	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public MCTextField Cnd_wk_day_nm = null;
	public MCLabel Cnd_dpt_wg_cd_Label = null;
	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_wg_cd = null;
	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_wg_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
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
	public MCLabel Cnd_loc_wg_cd_Label = null;
	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_wg_cd = null;
	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_wg_nm = null;
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
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
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
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
	public MCLabel Cnd_mfg_inst_no_Label = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_inst_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_wk_usr_cd_Label = null;
	/**
	 * Worker cd. 作業者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_wk_usr_cd = null;
	/**
	 * Worker name 作業者名.<p>
	 *
	 */
	public MCTextField Cnd_wk_usr_nm = null;
	public MCLabel Cnd_wk_usr_dpt_cd_Label = null;
	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_wk_usr_dpt_cd = null;
	/**
	 * Worker dept. 作業者部門名.<p>
	 *
	 */
	public MCTextField Cnd_wk_usr_dpt_nm = null;
	public MCLabel Cnd_fclty_Label = null;
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public MCTextField Cnd_fclty = null;
	public MCLabel Cnd_itm_mfg_inst_no_Label = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_mfg_inst_no = null;
	public MCLabel Cnd_wk_act_no_Label = null;
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wk_act_no = null;
	public MCLabel Cnd_mfg_act_no_Label = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_act_no = null;
	/**
	 * Indirect man-hour result only 指図外工数実績のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_no_mfg_inst_only_flg = null;
	public MCLabel Cnd_ext_wk_act_no_Label = null;
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_wk_act_no = null;
	public MCLabel Cnd_schd_intr_rmrks_Label = null;
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_intr_rmrks = null;
	public MCLabel Cnd_schd_sub_char1_Label = null;
	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char1 = null;
	public MCLabel Cnd_schd_sub_char2_Label = null;
	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char2 = null;
	public MCLabel Cnd_schd_sub_char3_Label = null;
	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char3 = null;
	public MCLabel Cnd_act_intr_rmrks_Label = null;
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_rmrks = null;
	public MCLabel Cnd_act_sub_char1_Label = null;
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char1 = null;
	public MCLabel Cnd_act_sub_char2_Label = null;
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char2 = null;
	public MCLabel Cnd_act_sub_char3_Label = null;
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char3 = null;
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_ac_dt_Label = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDateField BulkSet_ac_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_wk_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_wk_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_wk_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_wk_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_wk_usr_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_wk_usr_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_wk_usr_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_wk_usr_dpt_nm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP1150.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * With mfg. order 製造指図あり.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_wk_act_flg = null;
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
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_disp_seq = null;
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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_nm = null;
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_st_tm_p_PPanel;
	public MCColumnConfig columnRslt_dummy_st_dt;// [Rslt]の[st_tm_p.ymd]を[columnRslt_dummy_st_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_st_tm;// [Rslt]の[st_tm_p.hm]を[columnRslt_st_tm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_end_tm_p_PPanel;
	public MCColumnConfig columnRslt_dummy_end_dt;// [Rslt]の[end_tm_p.ymd]を[columnRslt_dummy_end_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_end_tm;// [Rslt]の[end_tm_p.hm]を[columnRslt_end_tm]としてエイリアス定義。
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCColumnConfig columnRslt_brk_pd = null;
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_calc_ctl_flg = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D Rslt_schd_sum_wk_cost_p_PPanel;
	public MCColumnConfig columnRslt_schd_sum_wk_cost;// [Rslt]の[schd_sum_wk_cost_p.wk_cost_qty]を[columnRslt_schd_sum_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D Rslt_act_wk_cost_p_PPanel;
	public MCColumnConfig columnRslt_act_wk_cost;// [Rslt]の[act_wk_cost_p.wk_cost_qty]を[columnRslt_act_wk_cost]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D Rslt_rem_wk_cost_p_PPanel;
	public MCColumnConfig columnRslt_rem_wk_cost;// [Rslt]の[rem_wk_cost_p.wk_cost_qty]を[columnRslt_rem_wk_cost]としてエイリアス定義。
	/**
	 * Work element unit name 工数管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_unit_nm = null;
	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_rate = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_rnd_typ = null;
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_day_cd = null;
	/**
	 * Work type name 勤務種類名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_day_nm = null;
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_rsn_cd = null;
	/**
	 * Man-hour reason name 工数理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_rsn_nm = null;
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
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_str_ln_cd_none_flg]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_wk_usr_cd;// [Rslt]の[usr_dpt_p.usr_cd]を[columnRslt_wk_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_wk_usr_nm;// [Rslt]の[usr_dpt_p.usr_nm]を[columnRslt_wk_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_wk_usr_dpt_cd;// [Rslt]の[usr_dpt_p.dpt_cd]を[columnRslt_wk_usr_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_wk_usr_dpt_nm;// [Rslt]の[usr_dpt_p.dpt_nm]を[columnRslt_wk_usr_dpt_nm]としてエイリアス定義。
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fclty = null;
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_intr_rmrks = null;
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_cost_calc_flg = null;
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D Rslt_schd_wk_cost_p_PPanel;
	public MCColumnConfig columnRslt_schd_wk_cost;// [Rslt]の[schd_wk_cost_p.wk_cost_qty]を[columnRslt_schd_wk_cost]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D Rslt_schd_fxd_wk_cost_p_PPanel;
	public MCColumnConfig columnRslt_schd_fxd_wk_cost;// [Rslt]の[schd_fxd_wk_cost_p.wk_cost_qty]を[columnRslt_schd_fxd_wk_cost]としてエイリアス定義。
	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char1 = null;
	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char2 = null;
	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char3 = null;
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_rmrks = null;
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char1 = null;
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char2 = null;
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
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
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Rslt_lot_no_p_PPanel;
	public MCColumnConfig columnRslt_crt_lot_flg;// [Rslt]の[lot_no_p.crt_lot_flg]を[columnRslt_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_lot_no;// [Rslt]の[lot_no_p.lot_no]を[columnRslt_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_sublot_no;// [Rslt]の[lot_no_p.sublot_no]を[columnRslt_sublot_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Scheduled operation start date 工程着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_st_schd_dt = null;
	/**
	 * Scheduled operation start time 工程着手予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_st_schd_hm = null;
	/**
	 * Scheduled operation end date 工程終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_end_schd_dt = null;
	/**
	 * Scheduled operation end time 工程終了予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_end_schd_hm = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	/**
	 * Status (Man-hours) 状況（工数）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_mfg_sts_typ = null;
	/**
	 * Status name (Man-hours) 状況名（工数）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_mfg_sts_typ_nm = null;
	/**
	 * Status (Operation) 状況（工程）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_mfg_sts_typ = null;
	/**
	 * Status name (Operation) 状況名（工程）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_mfg_sts_typ_nm = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_flg = null;
	/**
	 * Approval status 承認状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Approval status name 承認状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_inst_no = null;
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_schd_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_act_no = null;
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_act_no = null;
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_act_no = null;
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mes_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_wk_act_no = null;
	/**
	 * Dept. WG cd. 部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_wg_cd = null;
	/**
	 * Dept. WG name 部門ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_wg_nm = null;
	/**
	 * Location WG cd. 場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_wg_cd = null;
	/**
	 * Location WG name 場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_wg_nm = null;
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_cd = null;
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_upd_cntr = null;
	/**
	 * Man-hour result update counter 工数実績更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wk_act_upd_cntr = null;
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
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH_SCHD]モードを表す定数 */
	public static final String SRCH_SCHD = "SRCH_SCHD";
	/** [REF_SCHD]モードを表す定数 */
	public static final String REF_SCHD = "REF_SCHD";
	/** [SRCH_ACT]モードを表す定数 */
	public static final String SRCH_ACT = "SRCH_ACT";
	/** [REF_ACT]モードを表す定数 */
	public static final String REF_ACT = "REF_ACT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH_DEL, DEL, SRCH_SCHD, REF_SCHD, SRCH_ACT, REF_ACT};
	
	/** [MS_MSBCL1150_Srch01]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Srch01Caller createMS_MSBCL1150_Srch01() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Srch01Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch01Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Srch01Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch01Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Srch01]の呼び出し */
	protected void callMS_MSBCL1150_Srch01() {
		MCCaller caller = createMS_MSBCL1150_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL1150_Srch02]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Srch02Caller createMS_MSBCL1150_Srch02() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Srch02Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch02Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Srch02Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch02Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Srch02]の呼び出し */
	protected void callMS_MSBCL1150_Srch02() {
		MCCaller caller = createMS_MSBCL1150_Srch02();
		caller.exec();
	}
	/** [MS_MSBCL1150_Srch03]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Srch03Caller createMS_MSBCL1150_Srch03() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Srch03Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch03Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Srch03Caller<MSBCP_WkActReg, MS_MSBCL1150_Srch03Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Srch03]の呼び出し */
	protected void callMS_MSBCL1150_Srch03() {
		MCCaller caller = createMS_MSBCL1150_Srch03();
		caller.exec();
	}
	/** [MS_MSBCL1150_Imp01]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Imp01Caller createMS_MSBCL1150_Imp01() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Imp01Caller<MSBCP_WkActReg, MS_MSBCL1150_Imp01Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Imp01Caller<MSBCP_WkActReg, MS_MSBCL1150_Imp01Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Imp01]の呼び出し */
	protected void callMS_MSBCL1150_Imp01() {
		MCCaller caller = createMS_MSBCL1150_Imp01();
		caller.exec();
	}
	/** [MS_MSBCL1150_Upd01]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Upd01Caller createMS_MSBCL1150_Upd01() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Upd01Caller<MSBCP_WkActReg, MS_MSBCL1150_Upd01Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Upd01Caller<MSBCP_WkActReg, MS_MSBCL1150_Upd01Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Upd01]の呼び出し */
	protected void callMS_MSBCL1150_Upd01() {
		MCCaller caller = createMS_MSBCL1150_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL1150_Del01]のCallerの作成 */
	protected MSBCP_WkActReg_MC.MS_MSBCL1150_Del01Caller createMS_MSBCL1150_Del01() {
		MSBCP_WkActReg_MC.MS_MSBCL1150_Del01Caller<MSBCP_WkActReg, MS_MSBCL1150_Del01Bridge>
		caller = ((MSBCP_WkActReg_MC)this).new MS_MSBCL1150_Del01Caller<MSBCP_WkActReg, MS_MSBCL1150_Del01Bridge>(
					(MSBCP_WkActReg)this, new MS_MSBCL1150_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL1150_Del01]の呼び出し */
	protected void callMS_MSBCL1150_Del01() {
		MCCaller caller = createMS_MSBCL1150_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1150.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1150.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP1150.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP1150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP1150.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP1150.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBC.MSBCP1150.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBC.MSBCP1150.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBC.MSBCP1150.BulkSetR createBulkSetR() {
		return mcframe.clientMSBC.MSBCP1150.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP1150.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1150.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP1150.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP1150.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1150.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(DispUnitPanel);
		ret.add(OperStsPanel);
		ret.add(StsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(MesPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_WkActReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_WkActReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_WkActReg_MC.jbCreateScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateDispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateOperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateTop((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateFold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateTab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateTab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateMes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateCnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateCnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateCtrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateRPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateBulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateRslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateBtn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbCreateEastBtn((MSBCP_WkActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_WkActReg p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBCP_WkActReg p) {
	}

	/**
	 * [OperSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOperSts(MSBCP_WkActReg p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBCP_WkActReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_WkActReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_WkActReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_WkActReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_WkActReg p) {
	}

	/**
	 * [Mes]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMes(MSBCP_WkActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_WkActReg p) {
		p.Cnd_oper_st_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().oper_st_schd_dt_p());
		p.Cnd_oper_st_schd_dt_p_PPanel.setName("Cnd.oper_st_schd_dt_p");
		p.Cnd_oper_st_schd_dt_fr = p.Cnd_oper_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_oper_st_schd_dt_fr.addAliasName("Cnd.oper_st_schd_dt_fr", p);
		p.Cnd_oper_st_schd_hm_fr = p.Cnd_oper_st_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_oper_st_schd_hm_fr.addAliasName("Cnd.oper_st_schd_hm_fr", p);
		p.Cnd_oper_st_schd_dt_to = p.Cnd_oper_st_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_oper_st_schd_dt_to.addAliasName("Cnd.oper_st_schd_dt_to", p);
		p.Cnd_oper_st_schd_hm_to = p.Cnd_oper_st_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_oper_st_schd_hm_to.addAliasName("Cnd.oper_st_schd_hm_to", p);
		p.Cnd_oper_end_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().oper_end_schd_dt_p());
		p.Cnd_oper_end_schd_dt_p_PPanel.setName("Cnd.oper_end_schd_dt_p");
		p.Cnd_oper_end_schd_dt_fr = p.Cnd_oper_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_oper_end_schd_dt_fr.addAliasName("Cnd.oper_end_schd_dt_fr", p);
		p.Cnd_oper_end_schd_hm_fr = p.Cnd_oper_end_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_oper_end_schd_hm_fr.addAliasName("Cnd.oper_end_schd_hm_fr", p);
		p.Cnd_oper_end_schd_dt_to = p.Cnd_oper_end_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_oper_end_schd_dt_to.addAliasName("Cnd.oper_end_schd_dt_to", p);
		p.Cnd_oper_end_schd_hm_to = p.Cnd_oper_end_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_oper_end_schd_hm_to.addAliasName("Cnd.oper_end_schd_hm_to", p);
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
	protected static void jbCreateCnd2(MSBCP_WkActReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_WkActReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_WkActReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBCP_WkActReg p) {
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_wk_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_wk_usr_cd.addAliasName("BulkSet.wk_usr_cd", p);
		p.BulkSet_wk_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_wk_usr_nm.addAliasName("BulkSet.wk_usr_nm", p);
		p.BulkSet_wk_usr_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_wk_usr_dpt_cd.addAliasName("BulkSet.wk_usr_dpt_cd", p);
		p.BulkSet_wk_usr_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_wk_usr_dpt_nm.addAliasName("BulkSet.wk_usr_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_WkActReg p) {
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_st_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$st_tm_p);
		p.Rslt_st_tm_p_PPanel.setName("Rslt.st_tm_p");
		p.columnRslt_dummy_st_dt = p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dummy_st_dt.addAliasName("Rslt.dummy_st_dt", p);
		p.columnRslt_st_tm = p.Rslt_st_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_st_tm.addAliasName("Rslt.st_tm", p);
		p.Rslt_end_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$end_tm_p);
		p.Rslt_end_tm_p_PPanel.setName("Rslt.end_tm_p");
		p.columnRslt_dummy_end_dt = p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dummy_end_dt.addAliasName("Rslt.dummy_end_dt", p);
		p.columnRslt_end_tm = p.Rslt_end_tm_p_PPanel.columnYmdHm_hm;
		p.columnRslt_end_tm.addAliasName("Rslt.end_tm", p);
		p.Rslt_schd_sum_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$schd_sum_wk_cost_p);
		p.Rslt_schd_sum_wk_cost_p_PPanel.setName("Rslt.schd_sum_wk_cost_p");
		p.columnRslt_schd_sum_wk_cost = p.Rslt_schd_sum_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnRslt_schd_sum_wk_cost.addAliasName("Rslt.schd_sum_wk_cost", p);
		p.Rslt_act_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$act_wk_cost_p);
		p.Rslt_act_wk_cost_p_PPanel.setName("Rslt.act_wk_cost_p");
		p.columnRslt_act_wk_cost = p.Rslt_act_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnRslt_act_wk_cost.addAliasName("Rslt.act_wk_cost", p);
		p.Rslt_rem_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$rem_wk_cost_p);
		p.Rslt_rem_wk_cost_p_PPanel.setName("Rslt.rem_wk_cost_p");
		p.columnRslt_rem_wk_cost = p.Rslt_rem_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnRslt_rem_wk_cost.addAliasName("Rslt.rem_wk_cost", p);
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$usr_dpt_p);
		p.Rslt_usr_dpt_p_PPanel.setName("Rslt.usr_dpt_p");
		p.columnRslt_wk_usr_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_wk_usr_cd.addAliasName("Rslt.wk_usr_cd", p);
		p.columnRslt_wk_usr_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_wk_usr_nm.addAliasName("Rslt.wk_usr_nm", p);
		p.columnRslt_wk_usr_dpt_cd = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_wk_usr_dpt_cd.addAliasName("Rslt.wk_usr_dpt_cd", p);
		p.columnRslt_wk_usr_dpt_nm = p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_wk_usr_dpt_nm.addAliasName("Rslt.wk_usr_dpt_nm", p);
		p.Rslt_schd_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$schd_wk_cost_p);
		p.Rslt_schd_wk_cost_p_PPanel.setName("Rslt.schd_wk_cost_p");
		p.columnRslt_schd_wk_cost = p.Rslt_schd_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnRslt_schd_wk_cost.addAliasName("Rslt.schd_wk_cost", p);
		p.Rslt_schd_fxd_wk_cost_p_PPanel = mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$schd_fxd_wk_cost_p);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.setName("Rslt.schd_fxd_wk_cost_p");
		p.columnRslt_schd_fxd_wk_cost = p.Rslt_schd_fxd_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty;
		p.columnRslt_schd_fxd_wk_cost.addAliasName("Rslt.schd_fxd_wk_cost", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$itm_p);
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
		p.Rslt_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$lot_no_p);
		p.Rslt_lot_no_p_PPanel.setName("Rslt.lot_no_p");
		p.columnRslt_crt_lot_flg = p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnRslt_crt_lot_flg.addAliasName("Rslt.crt_lot_flg", p);
		p.columnRslt_lot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnRslt_lot_no.addAliasName("Rslt.lot_no", p);
		p.columnRslt_sublot_no = p.Rslt_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnRslt_sublot_no.addAliasName("Rslt.sublot_no", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$sno_wrk_no_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP1150.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBCP_WkActReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_WkActReg p) {
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
	
	
	/** [Cnd_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_cost_cd_p = null;

	/**
	 * [Cnd_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_cost_cd_ListPutter() {
		if (Cnd_wk_cost_cd_p == null) {
			Cnd_wk_cost_cd_p = createCnd_wk_cost_cd_ListPutter(Cnd_wk_cost_cd, "wk_cost_cd", "wk_cost_nm");

		}
		return Cnd_wk_cost_cd_p;
	}
	
	
	/** [Cnd_wk_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_rsn_cd_p = null;

	/**
	 * [Cnd_wk_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_rsn_cd_ListPutter() {
		if (Cnd_wk_rsn_cd_p == null) {
			Cnd_wk_rsn_cd_p = createCnd_wk_rsn_cd_ListPutter(Cnd_wk_rsn_cd, "wk_rsn_cd", "wk_rsn_nm");

		}
		return Cnd_wk_rsn_cd_p;
	}
	
	
	/** [Cnd_wk_day_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_day_cd_p = null;

	/**
	 * [Cnd_wk_day_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_day_cd_ListPutter() {
		if (Cnd_wk_day_cd_p == null) {
			Cnd_wk_day_cd_p = createCnd_wk_day_cd_ListPutter(Cnd_wk_day_cd, "wk_day_cd", "wk_day_nm");

		}
		return Cnd_wk_day_cd_p;
	}
	
	
	/** [Cnd_dpt_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_wg_cd_p = null;

	/**
	 * [Cnd_dpt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_wg_cd_ListPutter() {
		if (Cnd_dpt_wg_cd_p == null) {
			Cnd_dpt_wg_cd_p = createCnd_dpt_wg_cd_ListPutter(Cnd_dpt_wg_cd, "dpt_wg_cd", "dpt_wg_nm");

		}
		return Cnd_dpt_wg_cd_p;
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
	
	
	/** [Cnd_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_wg_cd_p = null;

	/**
	 * [Cnd_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_wg_cd_ListPutter() {
		if (Cnd_loc_wg_cd_p == null) {
			Cnd_loc_wg_cd_p = createCnd_loc_wg_cd_ListPutter(Cnd_loc_wg_cd, "loc_wg_cd", "loc_wg_nm");

		}
		return Cnd_loc_wg_cd_p;
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
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
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
	
	
	/** [Cnd_wk_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_usr_cd_p = null;

	/**
	 * [Cnd_wk_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_usr_cd_ListPutter() {
		if (Cnd_wk_usr_cd_p == null) {
			Cnd_wk_usr_cd_p = createCnd_wk_usr_cd_ListPutter(Cnd_wk_usr_cd, "wk_usr_cd", "wk_usr_nm");

		}
		return Cnd_wk_usr_cd_p;
	}
	
	
	/** [Cnd_wk_usr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_usr_dpt_cd_p = null;

	/**
	 * [Cnd_wk_usr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_usr_dpt_cd_ListPutter() {
		if (Cnd_wk_usr_dpt_cd_p == null) {
			Cnd_wk_usr_dpt_cd_p = createCnd_wk_usr_dpt_cd_ListPutter(Cnd_wk_usr_dpt_cd, "wk_usr_dpt_cd", "wk_usr_dpt_nm");

		}
		return Cnd_wk_usr_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "wk_usr_dpt_cd", "wk_usr_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_mfg_inst_no_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_inst_no_p = null;

	/**
	 * [Rslt_mfg_inst_no_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_inst_no_ListPutter() {
		if (Rslt_mfg_inst_no_p == null) {
			Rslt_mfg_inst_no_p = createRslt_mfg_inst_no_ListPutter(columnRslt_mfg_inst_no, "mfg_inst_no", "div_seq");

		}
		return Rslt_mfg_inst_no_p;
	}
	
	
	/** [Rslt_div_seq_ListPutter]の定義 */
	private MCListPutter Rslt_div_seq_p = null;

	/**
	 * [Rslt_div_seq_ListPutter]の取得
	 */
	protected MCListPutter getRslt_div_seq_ListPutter() {
		if (Rslt_div_seq_p == null) {
			Rslt_div_seq_p = createRslt_div_seq_ListPutter(columnRslt_div_seq, "div_seq");

		}
		return Rslt_div_seq_p;
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
	
	
	/** [Rslt_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wk_cost_cd_p = null;

	/**
	 * [Rslt_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wk_cost_cd_ListPutter() {
		if (Rslt_wk_cost_cd_p == null) {
			Rslt_wk_cost_cd_p = createRslt_wk_cost_cd_ListPutter(columnRslt_wk_cost_cd, "wk_cost_cd", "wk_cost_nm","wk_cost_unit_nm","wk_cost_dec_place","wk_cost_rnd_typ");

		}
		return Rslt_wk_cost_cd_p;
	}
	
	
	/** [Rslt_wk_day_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wk_day_cd_p = null;

	/**
	 * [Rslt_wk_day_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wk_day_cd_ListPutter() {
		if (Rslt_wk_day_cd_p == null) {
			Rslt_wk_day_cd_p = createRslt_wk_day_cd_ListPutter(columnRslt_wk_day_cd, "wk_day_cd", "wk_day_nm");

		}
		return Rslt_wk_day_cd_p;
	}
	
	
	/** [Rslt_wk_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_wk_rsn_cd_p = null;

	/**
	 * [Rslt_wk_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_wk_rsn_cd_ListPutter() {
		if (Rslt_wk_rsn_cd_p == null) {
			Rslt_wk_rsn_cd_p = createRslt_wk_rsn_cd_ListPutter(columnRslt_wk_rsn_cd, "wk_rsn_cd", "wk_rsn_nm");

		}
		return Rslt_wk_rsn_cd_p;
	}
	
	
	/** [Rslt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dpt_cd_p = null;

	/**
	 * [Rslt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dpt_cd_ListPutter() {
		if (Rslt_dpt_cd_p == null) {
			Rslt_dpt_cd_p = createRslt_dpt_cd_ListPutter(columnRslt_dpt_cd, "dpt_cd", "dpt_nm","dpt_wg_cd","dpt_wg_nm");

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
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd", "loc_nm","loc_wg_cd","loc_wg_nm","site_cd","site_nm","loc_grp_cd","loc_grp_nm","str_ln_tgt_flg");

		}
		return Rslt_loc_cd_p;
	}
	
	
	/** [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "wk_usr_dpt_cd", "wk_usr_dpt_nm");
		}
		return Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_WkActReg create(){
		MSBCP_WkActReg p = new MSBCP_WkActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_WkActReg create(String name){
		MSBCP_WkActReg p = new MSBCP_WkActReg(name);
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
		MSBCP_WkActReg_MC.jbfInitScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitDispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitOperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitTop((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitFold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitTab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitTab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitMes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitCnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitCnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitCtrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitRPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitBulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitRslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitBtn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbfInitEastBtn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitDispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitOperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitTop((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitFold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitTab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitTab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitMes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitCnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitCnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitCtrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitRPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitBulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitRslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitBtn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.jbInitEastBtn((MSBCP_WkActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OperSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOperSts(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.OperStsPanel = p.beansFactory.createPanel("OperSts");
		p.OperStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_WkActReg p) {
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
	protected static void jbfInitTab1(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Mes]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMes(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.MesPanel = p.beansFactory.createPanel("Mes");
		p.MesTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_unit_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit");
		p.Cnd_disp_unit_ACT = p.beansFactory.createRadioButton("Cnd.disp_unit_ACT");
		p.Cnd_disp_unit_SCHD = p.beansFactory.createRadioButton("Cnd.disp_unit_SCHD");
		p.Cnd_oper_ord_flg = p.beansFactory.createCheckBox("Cnd.oper_ord_flg");
		p.Cnd_oper_stt_flg = p.beansFactory.createCheckBox("Cnd.oper_stt_flg");
		p.Cnd_oper_cmpl_flg = p.beansFactory.createCheckBox("Cnd.oper_cmpl_flg");
		p.Cnd_oper_no_inst_flg = p.beansFactory.createCheckBox("Cnd.oper_no_inst_flg");
		p.Cnd_ord_flg = p.beansFactory.createCheckBox("Cnd.ord_flg");
		p.Cnd_stt_flg = p.beansFactory.createCheckBox("Cnd.stt_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_no_schd_flg = p.beansFactory.createCheckBox("Cnd.no_schd_flg");
		p.Cnd_mes_tgt_flg = p.beansFactory.createCheckBox("Cnd.mes_tgt_flg");
		p.Cnd_not_mes_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_mes_tgt_flg");
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_pr_rate_fr_Label = p.beansFactory.createLabel("Cnd.pr_rate_fr_Label");
		p.Cnd_pr_rate_fr = p.beansFactory.createNumberField("Cnd.pr_rate_fr");
		p.Cnd_pr_rate_fr.setLabel(p.Cnd_pr_rate_fr_Label);
		p.Cnd_pr_rate_to_Label = p.beansFactory.createLabel("Cnd.pr_rate_to_Label");
		p.Cnd_pr_rate_to = p.beansFactory.createNumberField("Cnd.pr_rate_to");
		p.Cnd_pr_rate_to.setLabel(p.Cnd_pr_rate_to_Label);
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_wk_cost_cd_Label = p.beansFactory.createLabel("Cnd.wk_cost_cd_Label");
		p.Cnd_wk_cost_cd = p.beansFactory.createTextComboBox("Cnd.wk_cost_cd");
		p.Cnd_wk_cost_cd.setLabel(p.Cnd_wk_cost_cd_Label);
		p.Cnd_wk_cost_nm = p.beansFactory.createTextField("Cnd.wk_cost_nm");
		p.Cnd_wk_rsn_cd_Label = p.beansFactory.createLabel("Cnd.wk_rsn_cd_Label");
		p.Cnd_wk_rsn_cd = p.beansFactory.createTextComboBox("Cnd.wk_rsn_cd");
		p.Cnd_wk_rsn_cd.setLabel(p.Cnd_wk_rsn_cd_Label);
		p.Cnd_wk_rsn_nm = p.beansFactory.createTextField("Cnd.wk_rsn_nm");
		p.Cnd_wk_day_cd_Label = p.beansFactory.createLabel("Cnd.wk_day_cd_Label");
		p.Cnd_wk_day_cd = p.beansFactory.createTextComboBox("Cnd.wk_day_cd");
		p.Cnd_wk_day_cd.setLabel(p.Cnd_wk_day_cd_Label);
		p.Cnd_wk_day_nm = p.beansFactory.createTextField("Cnd.wk_day_nm");
		p.Cnd_dpt_wg_cd_Label = p.beansFactory.createLabel("Cnd.dpt_wg_cd_Label");
		p.Cnd_dpt_wg_cd = p.beansFactory.createTextComboBox("Cnd.dpt_wg_cd");
		p.Cnd_dpt_wg_cd.setLabel(p.Cnd_dpt_wg_cd_Label);
		p.Cnd_dpt_wg_nm = p.beansFactory.createTextField("Cnd.dpt_wg_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.loc_wg_cd_Label");
		p.Cnd_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.loc_wg_cd");
		p.Cnd_loc_wg_cd.setLabel(p.Cnd_loc_wg_cd_Label);
		p.Cnd_loc_wg_nm = p.beansFactory.createTextField("Cnd.loc_wg_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.mfg_inst_no_Label");
		p.Cnd_mfg_inst_no = p.beansFactory.createTextField("Cnd.mfg_inst_no");
		p.Cnd_mfg_inst_no.setLabel(p.Cnd_mfg_inst_no_Label);
		p.Cnd_wk_usr_cd_Label = p.beansFactory.createLabel("Cnd.wk_usr_cd_Label");
		p.Cnd_wk_usr_cd = p.beansFactory.createTextField("Cnd.wk_usr_cd");
		p.Cnd_wk_usr_cd.setLabel(p.Cnd_wk_usr_cd_Label);
		p.Cnd_wk_usr_nm = p.beansFactory.createTextField("Cnd.wk_usr_nm");
		p.Cnd_wk_usr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.wk_usr_dpt_cd_Label");
		p.Cnd_wk_usr_dpt_cd = p.beansFactory.createTextField("Cnd.wk_usr_dpt_cd");
		p.Cnd_wk_usr_dpt_cd.setLabel(p.Cnd_wk_usr_dpt_cd_Label);
		p.Cnd_wk_usr_dpt_nm = p.beansFactory.createTextField("Cnd.wk_usr_dpt_nm");
		p.Cnd_fclty_Label = p.beansFactory.createLabel("Cnd.fclty_Label");
		p.Cnd_fclty = p.beansFactory.createTextField("Cnd.fclty");
		p.Cnd_fclty.setLabel(p.Cnd_fclty_Label);
		p.Cnd_itm_mfg_inst_no_Label = p.beansFactory.createLabel("Cnd.itm_mfg_inst_no_Label");
		p.Cnd_itm_mfg_inst_no = p.beansFactory.createTextField("Cnd.itm_mfg_inst_no");
		p.Cnd_itm_mfg_inst_no.setLabel(p.Cnd_itm_mfg_inst_no_Label);
		p.Cnd_wk_act_no_Label = p.beansFactory.createLabel("Cnd.wk_act_no_Label");
		p.Cnd_wk_act_no = p.beansFactory.createTextField("Cnd.wk_act_no");
		p.Cnd_wk_act_no.setLabel(p.Cnd_wk_act_no_Label);
		p.Cnd_mfg_act_no_Label = p.beansFactory.createLabel("Cnd.mfg_act_no_Label");
		p.Cnd_mfg_act_no = p.beansFactory.createTextField("Cnd.mfg_act_no");
		p.Cnd_mfg_act_no.setLabel(p.Cnd_mfg_act_no_Label);
		p.Cnd_no_mfg_inst_only_flg = p.beansFactory.createCheckBox("Cnd.no_mfg_inst_only_flg");
		p.Cnd_ext_wk_act_no_Label = p.beansFactory.createLabel("Cnd.ext_wk_act_no_Label");
		p.Cnd_ext_wk_act_no = p.beansFactory.createTextField("Cnd.ext_wk_act_no");
		p.Cnd_ext_wk_act_no.setLabel(p.Cnd_ext_wk_act_no_Label);
		p.Cnd_schd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_intr_rmrks_Label");
		p.Cnd_schd_intr_rmrks = p.beansFactory.createTextField("Cnd.schd_intr_rmrks");
		p.Cnd_schd_intr_rmrks.setLabel(p.Cnd_schd_intr_rmrks_Label);
		p.Cnd_schd_sub_char1_Label = p.beansFactory.createLabel("Cnd.schd_sub_char1_Label");
		p.Cnd_schd_sub_char1 = p.beansFactory.createTextField("Cnd.schd_sub_char1");
		p.Cnd_schd_sub_char1.setLabel(p.Cnd_schd_sub_char1_Label);
		p.Cnd_schd_sub_char2_Label = p.beansFactory.createLabel("Cnd.schd_sub_char2_Label");
		p.Cnd_schd_sub_char2 = p.beansFactory.createTextField("Cnd.schd_sub_char2");
		p.Cnd_schd_sub_char2.setLabel(p.Cnd_schd_sub_char2_Label);
		p.Cnd_schd_sub_char3_Label = p.beansFactory.createLabel("Cnd.schd_sub_char3_Label");
		p.Cnd_schd_sub_char3 = p.beansFactory.createTextField("Cnd.schd_sub_char3");
		p.Cnd_schd_sub_char3.setLabel(p.Cnd_schd_sub_char3_Label);
		p.Cnd_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_rmrks_Label");
		p.Cnd_act_intr_rmrks = p.beansFactory.createTextField("Cnd.act_intr_rmrks");
		p.Cnd_act_intr_rmrks.setLabel(p.Cnd_act_intr_rmrks_Label);
		p.Cnd_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_sub_char1_Label");
		p.Cnd_act_sub_char1 = p.beansFactory.createTextField("Cnd.act_sub_char1");
		p.Cnd_act_sub_char1.setLabel(p.Cnd_act_sub_char1_Label);
		p.Cnd_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_sub_char2_Label");
		p.Cnd_act_sub_char2 = p.beansFactory.createTextField("Cnd.act_sub_char2");
		p.Cnd_act_sub_char2.setLabel(p.Cnd_act_sub_char2_Label);
		p.Cnd_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_sub_char3_Label");
		p.Cnd_act_sub_char3 = p.beansFactory.createTextField("Cnd.act_sub_char3");
		p.Cnd_act_sub_char3.setLabel(p.Cnd_act_sub_char3_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_ac_dt_Label = p.beansFactory.createLabel("BulkSet.ac_dt_Label");
		p.BulkSet_ac_dt = p.beansFactory.createDateField("BulkSet.ac_dt");
		p.BulkSet_ac_dt.setLabel(p.BulkSet_ac_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_inst_wk_act_flg = p.beansFactory.createTableColumn("Rslt.inst_wk_act_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_div_seq = p.beansFactory.createTableColumn("Rslt.div_seq", MCColumnType.NUMBER_COMBO);
		p.columnRslt_oper_disp_seq = p.beansFactory.createTableColumn("Rslt.oper_disp_seq", MCColumnType.NUMBER);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_wk_cost_cd = p.beansFactory.createTableColumn("Rslt.wk_cost_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wk_cost_nm = p.beansFactory.createTableColumn("Rslt.wk_cost_nm", MCColumnType.TEXT);
		p.columnRslt_brk_pd = p.beansFactory.createTableColumn("Rslt.brk_pd", MCColumnType.NUMBER);
		p.columnRslt_wk_cost_calc_ctl_flg = p.beansFactory.createTableColumn("Rslt.wk_cost_calc_ctl_flg", MCColumnType.CHECK);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_wk_cost_unit_nm = p.beansFactory.createTableColumn("Rslt.wk_cost_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pr_rate = p.beansFactory.createTableColumn("Rslt.pr_rate", MCColumnType.NUMBER);
		p.columnRslt_wk_cost_dec_place = p.beansFactory.createTableColumn("Rslt.wk_cost_dec_place", MCColumnType.NUMBER);
		p.columnRslt_wk_cost_rnd_typ = p.beansFactory.createTableColumn("Rslt.wk_cost_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_wk_day_cd = p.beansFactory.createTableColumn("Rslt.wk_day_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wk_day_nm = p.beansFactory.createTableColumn("Rslt.wk_day_nm", MCColumnType.TEXT);
		p.columnRslt_wk_rsn_cd = p.beansFactory.createTableColumn("Rslt.wk_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_wk_rsn_nm = p.beansFactory.createTableColumn("Rslt.wk_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_fclty = p.beansFactory.createTableColumn("Rslt.fclty", MCColumnType.TEXT);
		p.columnRslt_schd_intr_rmrks = p.beansFactory.createTableColumn("Rslt.schd_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_wk_cost_calc_flg = p.beansFactory.createTableColumn("Rslt.wk_cost_calc_flg", MCColumnType.CHECK);
		p.columnRslt_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_oper_st_schd_dt = p.beansFactory.createTableColumn("Rslt.oper_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_oper_st_schd_hm = p.beansFactory.createTableColumn("Rslt.oper_st_schd_hm", MCColumnType.DATE);
		p.columnRslt_oper_end_schd_dt = p.beansFactory.createTableColumn("Rslt.oper_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_oper_end_schd_hm = p.beansFactory.createTableColumn("Rslt.oper_end_schd_hm", MCColumnType.DATE);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_wk_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.wk_mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_wk_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.wk_mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_oper_mfg_sts_typ = p.beansFactory.createTableColumn("Rslt.oper_mfg_sts_typ", MCColumnType.TEXT);
		p.columnRslt_oper_mfg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.oper_mfg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_aprv_flg = p.beansFactory.createTableColumn("Rslt.aprv_flg", MCColumnType.CHECK);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_oper_inst_no = p.beansFactory.createTableColumn("Rslt.oper_inst_no", MCColumnType.TEXT);
		p.columnRslt_wk_schd_no = p.beansFactory.createTableColumn("Rslt.wk_schd_no", MCColumnType.TEXT);
		p.columnRslt_mfg_act_no = p.beansFactory.createTableColumn("Rslt.mfg_act_no", MCColumnType.TEXT);
		p.columnRslt_oper_act_no = p.beansFactory.createTableColumn("Rslt.oper_act_no", MCColumnType.TEXT);
		p.columnRslt_wk_act_no = p.beansFactory.createTableColumn("Rslt.wk_act_no", MCColumnType.TEXT);
		p.columnRslt_mes_flg = p.beansFactory.createTableColumn("Rslt.mes_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_wk_act_no = p.beansFactory.createTableColumn("Rslt.ext_wk_act_no", MCColumnType.TEXT);
		p.columnRslt_dpt_wg_cd = p.beansFactory.createTableColumn("Rslt.dpt_wg_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_wg_nm = p.beansFactory.createTableColumn("Rslt.dpt_wg_nm", MCColumnType.TEXT);
		p.columnRslt_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_loc_wg_nm = p.beansFactory.createTableColumn("Rslt.loc_wg_nm", MCColumnType.TEXT);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_mfg_inst_upd_cntr = p.beansFactory.createTableColumn("Rslt.mfg_inst_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_wk_act_upd_cntr = p.beansFactory.createTableColumn("Rslt.wk_act_upd_cntr", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010 = p.beansFactory.createButton("Btn.open_MSBCP1010", "open");
		p.Btn_open_MSBCP1100 = p.beansFactory.createButton("Btn.open_MSBCP1100", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.DispUnitPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDispUnit(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.OperStsPanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [OperSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOperSts(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.OperStsPanel.setBorder(p.OperStsTitledBorder);
		p.add(p.OperStsPanel);
		p.OperStsPanel.setNextBeans(p.StsPanel);
		p.OperStsPanel.setValueCheck(false);
		p.OperStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OperStsPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.TopPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
	protected static void jbInitFold(MSBCP_WkActReg p) {
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
	protected static void jbInitTab1(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.MesPanel, null);
		p.Tab1Panel.setLastBeans(p.MesPanel);
		p.MesPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Mes]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMes(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.MesPanel.setBorder(p.MesTitledBorder);
		p.MesPanel.setValueCheck(false);
		p.MesPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MesPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_unit_Group);
		p.Cnd_disp_unit_Group.setFirstBeans(p.Cnd_disp_unit_ACT);
		p.Cnd_disp_unit_ACT.setActionCommand("0");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_ACT);
		p.DispUnitPanel.add(p.Cnd_disp_unit_ACT);
		p.Cnd_disp_unit_ACT.setNextBeans(p.Cnd_disp_unit_SCHD);
		p.Cnd_disp_unit_SCHD.setActionCommand("1");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_SCHD);
		p.DispUnitPanel.add(p.Cnd_disp_unit_SCHD);
		p.Cnd_disp_unit_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.disp_unit_META);
		p.OperStsPanel.add(p.Cnd_oper_ord_flg);
		p.OperStsPanel.setLastBeans(p.Cnd_oper_ord_flg);
		p.Cnd_oper_ord_flg.setNextBeans(p.Cnd_oper_stt_flg);
		p.Cnd_oper_ord_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_ord_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_stt_flg);
		p.Cnd_oper_stt_flg.setNextBeans(p.Cnd_oper_cmpl_flg);
		p.Cnd_oper_stt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_stt_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_cmpl_flg);
		p.Cnd_oper_cmpl_flg.setNextBeans(p.Cnd_oper_no_inst_flg);
		p.Cnd_oper_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_cmpl_flg_META);
		p.OperStsPanel.add(p.Cnd_oper_no_inst_flg);
		p.Cnd_oper_no_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_no_inst_flg_META);
		p.StsPanel.add(p.Cnd_ord_flg);
		p.StsPanel.setLastBeans(p.Cnd_ord_flg);
		p.Cnd_ord_flg.setNextBeans(p.Cnd_stt_flg);
		p.Cnd_ord_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.ord_flg_META);
		p.StsPanel.add(p.Cnd_stt_flg);
		p.Cnd_stt_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_stt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.stt_flg_META);
		p.StsPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setNextBeans(p.Cnd_no_schd_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.cmpl_flg_META);
		p.StsPanel.add(p.Cnd_no_schd_flg);
		p.Cnd_no_schd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.no_schd_flg_META);
		p.MesPanel.add(p.Cnd_mes_tgt_flg);
		p.MesPanel.setLastBeans(p.Cnd_mes_tgt_flg);
		p.Cnd_mes_tgt_flg.setNextBeans(p.Cnd_not_mes_tgt_flg);
		p.Cnd_mes_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.mes_tgt_flg_META);
		p.MesPanel.add(p.Cnd_not_mes_tgt_flg);
		p.Cnd_not_mes_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.not_mes_tgt_flg_META);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_pr_rate_fr);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pr_rate_fr_Label);
		p.CndPanel.add(p.Cnd_pr_rate_fr);
		p.Cnd_pr_rate_fr.setNextBeans(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.pr_rate_fr_META);
		p.CndPanel.add(p.Cnd_pr_rate_to_Label);
		p.CndPanel.add(p.Cnd_pr_rate_to);
		p.Cnd_pr_rate_to.setNextBeans(p.Cnd_oper_st_schd_dt_p_PPanel);
		p.Cnd_pr_rate_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.pr_rate_to_META);
		p.CndPanel.add(p.Cnd_oper_st_schd_dt_p_PPanel);
		p.Cnd_oper_st_schd_dt_p_PPanel.setNextBeans(p.Cnd_oper_end_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_oper_end_schd_dt_p_PPanel);
		p.Cnd_oper_end_schd_dt_p_PPanel.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.CndPanel.add(p.Cnd_oper_cd_Label);
		p.CndPanel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_cd_META);
		p.CndPanel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_wk_cost_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd_wk_cost_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_cost_cd, true);
		p.Cnd_wk_cost_cd.setLinkBeans(p.Cnd_wk_cost_nm);
		p.CndPanel.add(p.Cnd_wk_cost_cd_Label);
		p.CndPanel.add(p.Cnd_wk_cost_cd);
		p.Cnd_wk_cost_cd.setNextBeans(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_cost_cd_META);
		p.CndPanel.add(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_nm.setNextBeans(p.Cnd_wk_rsn_cd);
		p.Cnd_wk_cost_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_cost_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_cost_nm, true);
		p.Cnd_wk_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_rsn_cd, true);
		p.Cnd_wk_rsn_cd.setLinkBeans(p.Cnd_wk_rsn_nm);
		p.CndPanel.add(p.Cnd_wk_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_wk_rsn_cd);
		p.Cnd_wk_rsn_cd.setNextBeans(p.Cnd_wk_rsn_nm);
		p.Cnd_wk_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_rsn_cd_META);
		p.CndPanel.add(p.Cnd_wk_rsn_nm);
		p.Cnd_wk_rsn_nm.setNextBeans(p.Cnd_wk_day_cd);
		p.Cnd_wk_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_rsn_nm, true);
		p.Cnd_wk_day_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_day_cd, true);
		p.Cnd_wk_day_cd.setLinkBeans(p.Cnd_wk_day_nm);
		p.CndPanel.add(p.Cnd_wk_day_cd_Label);
		p.CndPanel.add(p.Cnd_wk_day_cd);
		p.Cnd_wk_day_cd.setNextBeans(p.Cnd_wk_day_nm);
		p.Cnd_wk_day_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_day_cd_META);
		p.CndPanel.add(p.Cnd_wk_day_nm);
		p.Cnd_wk_day_nm.setNextBeans(p.Cnd_dpt_wg_cd);
		p.Cnd_wk_day_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_day_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_day_nm, true);
		p.Cnd_dpt_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_wg_cd, true);
		p.Cnd_dpt_wg_cd.setLinkBeans(p.Cnd_dpt_wg_nm);
		p.CndPanel.add(p.Cnd_dpt_wg_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_wg_cd);
		p.Cnd_dpt_wg_cd.setNextBeans(p.Cnd_dpt_wg_nm);
		p.Cnd_dpt_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.dpt_wg_cd_META);
		p.CndPanel.add(p.Cnd_dpt_wg_nm);
		p.Cnd_dpt_wg_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_dpt_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.dpt_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_wg_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_wg_cd, true);
		p.Cnd_loc_wg_cd.setLinkBeans(p.Cnd_loc_wg_nm);
		p.CndPanel.add(p.Cnd_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_loc_wg_cd);
		p.Cnd_loc_wg_cd.setNextBeans(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_wg_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
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
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_mfg_inst_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_mfg_inst_no);
		p.Cnd_mfg_inst_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_wk_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_wk_usr_cd_Label);
		p.CndPanel.add(p.Cnd_wk_usr_cd);
		p.Cnd_wk_usr_cd.setNextBeans(p.Cnd_wk_usr_nm);
		p.Cnd_wk_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_usr_cd_META);
		p.Cnd_wk_usr_cd.addLinkBeans(p.Cnd_wk_usr_nm);
		p.Cnd_wk_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_usr_cd, true);
		p.CndPanel.add(p.Cnd_wk_usr_nm);
		p.Cnd_wk_usr_nm.setNextBeans(p.Cnd_wk_usr_dpt_cd);
		p.Cnd_wk_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_usr_nm, true);
		p.CndPanel.add(p.Cnd_wk_usr_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_wk_usr_dpt_cd);
		p.Cnd_wk_usr_dpt_cd.setNextBeans(p.Cnd_wk_usr_dpt_nm);
		p.Cnd_wk_usr_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_usr_dpt_cd_META);
		p.Cnd_wk_usr_dpt_cd.addLinkBeans(p.Cnd_wk_usr_dpt_nm);
		p.Cnd_wk_usr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_usr_dpt_cd, true);
		p.CndPanel.add(p.Cnd_wk_usr_dpt_nm);
		p.Cnd_wk_usr_dpt_nm.setNextBeans(p.Cnd_fclty);
		p.Cnd_wk_usr_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_usr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_usr_dpt_nm, true);
		p.CndPanel.add(p.Cnd_fclty_Label);
		p.CndPanel.add(p.Cnd_fclty);
		p.Cnd_fclty.setNextBeans(p.Cnd_itm_mfg_inst_no);
		p.Cnd_fclty.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.fclty_META);
		p.setPluralValueEnable(p.Cnd_fclty, true);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no_Label);
		p.CndPanel.add(p.Cnd_itm_mfg_inst_no);
		p.Cnd_itm_mfg_inst_no.setNextBeans(p.Cnd_wk_act_no);
		p.Cnd_itm_mfg_inst_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.itm_mfg_inst_no_META);
		p.setPluralValueEnable(p.Cnd_itm_mfg_inst_no, true);
		p.CndPanel.add(p.Cnd_wk_act_no_Label);
		p.CndPanel.add(p.Cnd_wk_act_no);
		p.Cnd_wk_act_no.setNextBeans(p.Cnd_mfg_act_no);
		p.Cnd_wk_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.wk_act_no_META);
		p.setPluralValueEnable(p.Cnd_wk_act_no, true);
		p.CndPanel.add(p.Cnd_mfg_act_no_Label);
		p.CndPanel.add(p.Cnd_mfg_act_no);
		p.Cnd_mfg_act_no.setNextBeans(p.Cnd_no_mfg_inst_only_flg);
		p.Cnd_mfg_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.mfg_act_no_META);
		p.setPluralValueEnable(p.Cnd_mfg_act_no, true);
		p.CndPanel.add(p.Cnd_no_mfg_inst_only_flg);
		p.Cnd_no_mfg_inst_only_flg.setNextBeans(p.Cnd_ext_wk_act_no);
		p.Cnd_no_mfg_inst_only_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.no_mfg_inst_only_flg_META);
		p.CndPanel.add(p.Cnd_ext_wk_act_no_Label);
		p.CndPanel.add(p.Cnd_ext_wk_act_no);
		p.Cnd_ext_wk_act_no.setNextBeans(p.Cnd_schd_intr_rmrks);
		p.Cnd_ext_wk_act_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.ext_wk_act_no_META);
		p.setPluralValueEnable(p.Cnd_ext_wk_act_no, true);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks);
		p.Cnd_schd_intr_rmrks.setNextBeans(p.Cnd_schd_sub_char1);
		p.Cnd_schd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.schd_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char1);
		p.Cnd_schd_sub_char1.setNextBeans(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.schd_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char2.setNextBeans(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.schd_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char3.setNextBeans(p.Cnd_act_intr_rmrks);
		p.Cnd_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.schd_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_rmrks);
		p.Cnd_act_intr_rmrks.setNextBeans(p.Cnd_act_sub_char1);
		p.Cnd_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_sub_char1);
		p.Cnd_act_sub_char1.setNextBeans(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char2.setNextBeans(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP1150.CndR.act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_WkActReg p) {
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
	protected static void jbInitRPnl(MSBCP_WkActReg p) {
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
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_ac_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_ac_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_ac_dt);
		p.BulkSet_ac_dt.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_ac_dt.setRow(p.getBulkSetR(), mcframe.clientMSBC.MSBCP1150.BulkSetR.ac_dt_META);
		p.BulkSet_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_wk_usr_dpt_nm);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_WkActReg p) {
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
	protected static void jbInitBtn(MSBCP_WkActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP1010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP1010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP1010);
		p.Btn_open_MSBCP1010.setNextBeans(p.Btn_open_MSBCP1100);
		p.Btn_open_MSBCP1100.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP1100);
		p.Btn_open_MSBCP1100.setNextBeans(p.Btn_select_all);
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
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_WkActReg p) {
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
		MSBCP_WkActReg_MC.mcInitScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitDispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitOperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitTop((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitFold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitTab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitTab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitMes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitCnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitCnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitCtrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitRPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitBulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitRslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitBtn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.mcInitEastBtn((MSBCP_WkActReg)this);

		// [UPD]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitUPD_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitUPD_EastBtn((MSBCP_WkActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitFIX__U_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitFIX__U_EastBtn((MSBCP_WkActReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__DEL_EastBtn((MSBCP_WkActReg)this);

		// [DEL]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitDEL_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitDEL_EastBtn((MSBCP_WkActReg)this);

		// [SRCH_SCHD]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__SCHD_EastBtn((MSBCP_WkActReg)this);

		// [REF_SCHD]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitREF__SCHD_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__SCHD_EastBtn((MSBCP_WkActReg)this);

		// [SRCH_ACT]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitSRCH__ACT_EastBtn((MSBCP_WkActReg)this);

		// [REF_ACT]ステータスのモードの設定
		MSBCP_WkActReg_MC.statusInitREF__ACT_ScreenOpe((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_DispUnit((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_OperSts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Sts((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Top((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Fold((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Tab1((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Tab2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Mes((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Cnd((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Cnd2((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Ctrl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_RPnl((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_BulkSet((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Rslt((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_Btn((MSBCP_WkActReg)this);
		MSBCP_WkActReg_MC.statusInitREF__ACT_EastBtn((MSBCP_WkActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_WkActReg p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBCP_WkActReg p) {
	}

	/**
	 *  [OperSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOperSts(MSBCP_WkActReg p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBCP_WkActReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_WkActReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_WkActReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_WkActReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_WkActReg p) {
	}

	/**
	 *  [Mes]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMes(MSBCP_WkActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_WkActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_unit_Group.addAllListener(p);
		p.Cnd_disp_unit_ACT.addAllListener(p);
		p.Cnd_disp_unit_SCHD.addAllListener(p);
		p.Cnd_oper_ord_flg.addAllListener(p);
		p.Cnd_oper_stt_flg.addAllListener(p);
		p.Cnd_oper_cmpl_flg.addAllListener(p);
		p.Cnd_oper_no_inst_flg.addAllListener(p);
		p.Cnd_ord_flg.addAllListener(p);
		p.Cnd_stt_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_no_schd_flg.addAllListener(p);
		p.Cnd_mes_tgt_flg.addAllListener(p);
		p.Cnd_not_mes_tgt_flg.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_pr_rate_fr.setListListener(p);
		p.Cnd_pr_rate_fr.addAllListener(p);
		p.Cnd_pr_rate_to.setListListener(p);
		p.Cnd_pr_rate_to.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_wk_cost_cd.setListListener(p);
		p.Cnd_wk_cost_cd.addAllListener(p);
		p.Cnd_wk_cost_nm.setListListener(p);
		p.Cnd_wk_cost_nm.addAllListener(p);
		p.Cnd_wk_rsn_cd.setListListener(p);
		p.Cnd_wk_rsn_cd.addAllListener(p);
		p.Cnd_wk_rsn_nm.setListListener(p);
		p.Cnd_wk_rsn_nm.addAllListener(p);
		p.Cnd_wk_day_cd.setListListener(p);
		p.Cnd_wk_day_cd.addAllListener(p);
		p.Cnd_wk_day_nm.setListListener(p);
		p.Cnd_wk_day_nm.addAllListener(p);
		p.Cnd_dpt_wg_cd.setListListener(p);
		p.Cnd_dpt_wg_cd.addAllListener(p);
		p.Cnd_dpt_wg_nm.setListListener(p);
		p.Cnd_dpt_wg_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_wg_cd.setListListener(p);
		p.Cnd_loc_wg_cd.addAllListener(p);
		p.Cnd_loc_wg_nm.setListListener(p);
		p.Cnd_loc_wg_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_mfg_inst_no.setListListener(p);
		p.Cnd_mfg_inst_no.addAllListener(p);
		p.Cnd_wk_usr_cd.setListListener(p);
		p.Cnd_wk_usr_cd.addAllListener(p);
		p.Cnd_wk_usr_nm.setListListener(p);
		p.Cnd_wk_usr_nm.addAllListener(p);
		p.Cnd_wk_usr_dpt_cd.setListListener(p);
		p.Cnd_wk_usr_dpt_cd.addAllListener(p);
		p.Cnd_wk_usr_dpt_nm.setListListener(p);
		p.Cnd_wk_usr_dpt_nm.addAllListener(p);
		p.Cnd_fclty.setListListener(p);
		p.Cnd_fclty.addAllListener(p);
		p.Cnd_itm_mfg_inst_no.setListListener(p);
		p.Cnd_itm_mfg_inst_no.addAllListener(p);
		p.Cnd_wk_act_no.setListListener(p);
		p.Cnd_wk_act_no.addAllListener(p);
		p.Cnd_mfg_act_no.setListListener(p);
		p.Cnd_mfg_act_no.addAllListener(p);
		p.Cnd_no_mfg_inst_only_flg.addAllListener(p);
		p.Cnd_ext_wk_act_no.setListListener(p);
		p.Cnd_ext_wk_act_no.addAllListener(p);
		p.Cnd_schd_intr_rmrks.setListListener(p);
		p.Cnd_schd_intr_rmrks.addAllListener(p);
		p.Cnd_schd_sub_char1.setListListener(p);
		p.Cnd_schd_sub_char1.addAllListener(p);
		p.Cnd_schd_sub_char2.setListListener(p);
		p.Cnd_schd_sub_char2.addAllListener(p);
		p.Cnd_schd_sub_char3.setListListener(p);
		p.Cnd_schd_sub_char3.addAllListener(p);
		p.Cnd_act_intr_rmrks.setListListener(p);
		p.Cnd_act_intr_rmrks.addAllListener(p);
		p.Cnd_act_sub_char1.setListListener(p);
		p.Cnd_act_sub_char1.addAllListener(p);
		p.Cnd_act_sub_char2.setListListener(p);
		p.Cnd_act_sub_char2.addAllListener(p);
		p.Cnd_act_sub_char3.setListListener(p);
		p.Cnd_act_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBCP_WkActReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_WkActReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_WkActReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBCP_WkActReg p) {
		p.BulkSet_ac_dt.setListListener(p);
		p.BulkSet_ac_dt.addAllListener(p);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_WkActReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_inst_wk_act_flg.addAllListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_div_seq.addAllListener(p);
		p.columnRslt_div_seq.setListListener(p);
		p.columnRslt_oper_disp_seq.addAllListener(p);
		p.columnRslt_oper_disp_seq.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_wk_cost_cd.addAllListener(p);
		p.columnRslt_wk_cost_cd.setListListener(p);
		p.columnRslt_wk_cost_nm.addAllListener(p);
		p.columnRslt_wk_cost_nm.setListListener(p);
		p.columnRslt_brk_pd.addAllListener(p);
		p.columnRslt_brk_pd.setListListener(p);
		p.columnRslt_wk_cost_calc_ctl_flg.addAllListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_wk_cost_unit_nm.addAllListener(p);
		p.columnRslt_wk_cost_unit_nm.setListListener(p);
		p.columnRslt_pr_rate.addAllListener(p);
		p.columnRslt_pr_rate.setListListener(p);
		p.columnRslt_wk_cost_dec_place.addAllListener(p);
		p.columnRslt_wk_cost_dec_place.setListListener(p);
		p.columnRslt_wk_cost_rnd_typ.addAllListener(p);
		p.columnRslt_wk_cost_rnd_typ.setListListener(p);
		p.columnRslt_wk_day_cd.addAllListener(p);
		p.columnRslt_wk_day_cd.setListListener(p);
		p.columnRslt_wk_day_nm.addAllListener(p);
		p.columnRslt_wk_day_nm.setListListener(p);
		p.columnRslt_wk_rsn_cd.addAllListener(p);
		p.columnRslt_wk_rsn_cd.setListListener(p);
		p.columnRslt_wk_rsn_nm.addAllListener(p);
		p.columnRslt_wk_rsn_nm.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_tgt_flg.addAllListener(p);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_fclty.addAllListener(p);
		p.columnRslt_fclty.setListListener(p);
		p.columnRslt_schd_intr_rmrks.addAllListener(p);
		p.columnRslt_schd_intr_rmrks.setListListener(p);
		p.columnRslt_wk_cost_calc_flg.addAllListener(p);
		p.columnRslt_schd_sub_char1.addAllListener(p);
		p.columnRslt_schd_sub_char1.setListListener(p);
		p.columnRslt_schd_sub_char2.addAllListener(p);
		p.columnRslt_schd_sub_char2.setListListener(p);
		p.columnRslt_schd_sub_char3.addAllListener(p);
		p.columnRslt_schd_sub_char3.setListListener(p);
		p.columnRslt_act_intr_rmrks.addAllListener(p);
		p.columnRslt_act_intr_rmrks.setListListener(p);
		p.columnRslt_act_sub_char1.addAllListener(p);
		p.columnRslt_act_sub_char1.setListListener(p);
		p.columnRslt_act_sub_char2.addAllListener(p);
		p.columnRslt_act_sub_char2.setListListener(p);
		p.columnRslt_act_sub_char3.addAllListener(p);
		p.columnRslt_act_sub_char3.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_oper_st_schd_dt.addAllListener(p);
		p.columnRslt_oper_st_schd_dt.setListListener(p);
		p.columnRslt_oper_st_schd_hm.addAllListener(p);
		p.columnRslt_oper_st_schd_hm.setListListener(p);
		p.columnRslt_oper_end_schd_dt.addAllListener(p);
		p.columnRslt_oper_end_schd_dt.setListListener(p);
		p.columnRslt_oper_end_schd_hm.addAllListener(p);
		p.columnRslt_oper_end_schd_hm.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_wk_mfg_sts_typ.addAllListener(p);
		p.columnRslt_wk_mfg_sts_typ.setListListener(p);
		p.columnRslt_wk_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_wk_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_oper_mfg_sts_typ.addAllListener(p);
		p.columnRslt_oper_mfg_sts_typ.setListListener(p);
		p.columnRslt_oper_mfg_sts_typ_nm.addAllListener(p);
		p.columnRslt_oper_mfg_sts_typ_nm.setListListener(p);
		p.columnRslt_aprv_flg.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_oper_inst_no.addAllListener(p);
		p.columnRslt_oper_inst_no.setListListener(p);
		p.columnRslt_wk_schd_no.addAllListener(p);
		p.columnRslt_wk_schd_no.setListListener(p);
		p.columnRslt_mfg_act_no.addAllListener(p);
		p.columnRslt_mfg_act_no.setListListener(p);
		p.columnRslt_oper_act_no.addAllListener(p);
		p.columnRslt_oper_act_no.setListListener(p);
		p.columnRslt_wk_act_no.addAllListener(p);
		p.columnRslt_wk_act_no.setListListener(p);
		p.columnRslt_mes_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_wk_act_no.addAllListener(p);
		p.columnRslt_ext_wk_act_no.setListListener(p);
		p.columnRslt_dpt_wg_cd.addAllListener(p);
		p.columnRslt_dpt_wg_cd.setListListener(p);
		p.columnRslt_dpt_wg_nm.addAllListener(p);
		p.columnRslt_dpt_wg_nm.setListListener(p);
		p.columnRslt_loc_wg_cd.addAllListener(p);
		p.columnRslt_loc_wg_cd.setListListener(p);
		p.columnRslt_loc_wg_nm.addAllListener(p);
		p.columnRslt_loc_wg_nm.setListListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
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
		p.columnRslt_mfg_inst_upd_cntr.addAllListener(p);
		p.columnRslt_mfg_inst_upd_cntr.setListListener(p);
		p.columnRslt_wk_act_upd_cntr.addAllListener(p);
		p.columnRslt_wk_act_upd_cntr.setListListener(p);
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
	protected static void mcInitBtn(MSBCP_WkActReg p) {
		p.Btn_open_MSBCP1010.addAllListener(p);
		p.Btn_open_MSBCP1010.setAPMethodName("doBtn_open_MSBCP1010");
		p.Btn_open_MSBCP1100.addAllListener(p);
		p.Btn_open_MSBCP1100.setAPMethodName("doBtn_open_MSBCP1100");
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
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_WkActReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_inst_wk_act_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_mfg_inst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_div_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_oper_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_wk_cost_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_st_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.REQUIRED);
		p.columnRslt_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_wk_day_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_wk_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.Rslt_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnRslt_fclty.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_act_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_act_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_act_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRslt_oper_st_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [FIX_U]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_inst_wk_act_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_stt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnRslt_inst_wk_act_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_oper_ord_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_stt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_inst_wk_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Top(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ord_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_stt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mes_tgt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_rsn_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_day_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_day_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_dpt_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_dpt_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_fclty.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ext_wk_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inst_wk_act_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Top(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_oper_ord_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_stt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ord_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_stt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mes_tgt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pr_rate_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_rsn_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_day_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_day_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_dpt_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_wk_usr_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_fclty.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_mfg_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_ext_wk_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, REF_SCHD, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inst_wk_act_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_SCHD, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Top(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_oper_ord_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_stt_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [SRCH_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_inst_wk_act_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_ACT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_EastBtn(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_ScreenOpe(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_DispUnit(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[OperSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_OperSts(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Sts(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Top(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Fold(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab1(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab2(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Mes]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Mes(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Cnd(MSBCP_WkActReg p){
		p.Cnd_ope_Group.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_oper_ord_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_oper_stt_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_oper_cmpl_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_oper_no_inst_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ord_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_stt_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_cmpl_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_no_schd_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_mes_tgt_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_not_mes_tgt_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pr_rate_fr.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_pr_rate_to.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Cnd_oper_st_schd_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_end_schd_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_rsn_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_rsn_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_day_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_day_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dpt_wg_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dpt_wg_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_mfg_inst_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_usr_dpt_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_fclty.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_itm_mfg_inst_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wk_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_mfg_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_no_mfg_inst_only_flg.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ext_wk_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Cnd2(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Ctrl(MSBCP_WkActReg p){

	}

	/**
	 * [REF_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_RPnl(MSBCP_WkActReg p){
		p.RPnl_dwnld.putMode(p, REF_ACT, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_BulkSet(MSBCP_WkActReg p){
		p.BulkSet_ac_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Rslt(MSBCP_WkActReg p){
		p.columnRslt_check.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_inst_wk_act_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_div_seq.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_disp_seq.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_st_tm_p_PPanel.columnYmdHm_ymd.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_end_tm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_tm_p_PPanel.columnYmdHm_ymd.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_brk_pd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_ctl_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_schd_sum_wk_cost_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_act_wk_cost_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_rem_wk_cost_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_wk_cost_unit_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_rate.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_cost_rnd_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_day_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_day_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_rsn_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Rslt_usr_dpt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_fclty.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_cost_calc_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_schd_wk_cost_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.Rslt_schd_fxd_wk_cost_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5340.MAUBP_WkCostQty_D.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_lot_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Rslt_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_oper_st_schd_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_st_schd_hm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_end_schd_hm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_ptn.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_mfg_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_mfg_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_inst_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_schd_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_oper_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wk_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mes_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_wk_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dpt_wg_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_upd_cntr.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_wk_act_upd_cntr.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Btn(MSBCP_WkActReg p){
		p.Btn_open_MSBCP1010.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Btn_open_MSBCP1100.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_EastBtn(MSBCP_WkActReg p){

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
		MSBCP_WkActReg_MC.setTableConfigRslt((MSBCP_WkActReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_WkActReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_inst_wk_act_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.inst_wk_act_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_wk_act_flg);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mfg_inst_no_META);
		p.columnRslt_mfg_inst_no.setListType(MCListType.STRICT);
		p.columnRslt_mfg_inst_no.addLinkBeans(p.columnRslt_div_seq);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_div_seq.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.div_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_div_seq);
		p.columnRslt_oper_disp_seq.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_disp_seq);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_cd_META);
		p.columnRslt_oper_cd.addLinkBeans(p.columnRslt_oper_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_wk_cost_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_cd_META);
		p.columnRslt_wk_cost_cd.addLinkBeans(p.columnRslt_wk_cost_nm,p.columnRslt_wk_cost_unit_nm,p.columnRslt_wk_cost_dec_place,p.columnRslt_wk_cost_rnd_typ);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_cd);
		p.columnRslt_wk_cost_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_nm);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_st_tm_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_end_tm_p_PPanel.YmdHmTable);
		p.columnRslt_brk_pd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.brk_pd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_brk_pd);
		p.columnRslt_wk_cost_calc_ctl_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_calc_ctl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_calc_ctl_flg);
		p.RsltTable.addTable(p.Rslt_schd_sum_wk_cost_p_PPanel.WkCostQtyTable);
		p.RsltTable.addTable(p.Rslt_act_wk_cost_p_PPanel.WkCostQtyTable);
		p.Rslt_act_wk_cost_p_PPanel.columnWkCostQty_wk_cost_qty.setMinusEnable(true);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.RsltTable.addTable(p.Rslt_rem_wk_cost_p_PPanel.WkCostQtyTable);
		p.columnRslt_wk_cost_unit_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_unit_nm);
		p.columnRslt_pr_rate.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.pr_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_rate);
		p.columnRslt_wk_cost_dec_place.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_dec_place);
		p.columnRslt_wk_cost_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_rnd_typ);
		p.columnRslt_wk_day_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_day_cd_META);
		p.columnRslt_wk_day_cd.addLinkBeans(p.columnRslt_wk_day_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_day_cd);
		p.columnRslt_wk_day_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_day_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_day_nm);
		p.columnRslt_wk_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_rsn_cd_META);
		p.columnRslt_wk_rsn_cd.addLinkBeans(p.columnRslt_wk_rsn_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_rsn_cd);
		p.columnRslt_wk_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_rsn_nm);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.dpt_cd_META);
		p.columnRslt_dpt_cd.addLinkBeans(p.columnRslt_dpt_nm,p.columnRslt_dpt_wg_cd,p.columnRslt_dpt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt_loc_cd.addLinkBeans(p.columnRslt_loc_nm,p.columnRslt_loc_wg_cd,p.columnRslt_loc_wg_nm,p.columnRslt_site_cd,p.columnRslt_site_nm,p.columnRslt_loc_grp_cd,p.columnRslt_loc_grp_nm,p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_tgt_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnRslt_str_ln_nm);
		p.RsltTable.addTable(p.Rslt_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_wk_usr_dpt_nm);
		p.columnRslt_fclty.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.fclty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fclty);
		p.columnRslt_schd_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.schd_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_intr_rmrks);
		p.columnRslt_wk_cost_calc_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_cost_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_cost_calc_flg);
		p.RsltTable.addTable(p.Rslt_schd_wk_cost_p_PPanel.WkCostQtyTable);
		p.RsltTable.addTable(p.Rslt_schd_fxd_wk_cost_p_PPanel.WkCostQtyTable);
		p.columnRslt_schd_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char1);
		p.columnRslt_schd_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char2);
		p.columnRslt_schd_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char3);
		p.columnRslt_act_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_rmrks);
		p.columnRslt_act_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char1);
		p.columnRslt_act_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char2);
		p.columnRslt_act_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char3);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.RsltTable.addTable(p.Rslt_lot_no_p_PPanel.LotNoTable);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_oper_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_st_schd_dt_META);
		p.columnRslt_oper_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_st_schd_dt);
		p.columnRslt_oper_st_schd_hm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_st_schd_hm_META);
		p.columnRslt_oper_st_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_st_schd_hm);
		p.columnRslt_oper_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_end_schd_dt_META);
		p.columnRslt_oper_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_end_schd_dt);
		p.columnRslt_oper_end_schd_hm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_end_schd_hm_META);
		p.columnRslt_oper_end_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_end_schd_hm);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.columnRslt_wk_mfg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_mfg_sts_typ);
		p.columnRslt_wk_mfg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_mfg_sts_typ_nm);
		p.columnRslt_oper_mfg_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_mfg_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_mfg_sts_typ);
		p.columnRslt_oper_mfg_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_mfg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_mfg_sts_typ_nm);
		p.columnRslt_aprv_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_flg);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_oper_inst_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_inst_no);
		p.columnRslt_wk_schd_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_schd_no);
		p.columnRslt_mfg_act_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mfg_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_act_no);
		p.columnRslt_oper_act_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.oper_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_act_no);
		p.columnRslt_wk_act_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_act_no);
		p.columnRslt_mes_flg.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mes_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mes_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_wk_act_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ext_wk_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_wk_act_no);
		p.columnRslt_dpt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.dpt_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_wg_cd);
		p.columnRslt_dpt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.dpt_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_wg_nm);
		p.columnRslt_loc_wg_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_cd);
		p.columnRslt_loc_wg_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_nm);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_mfg_inst_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.mfg_inst_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_upd_cntr);
		p.columnRslt_wk_act_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.wk_act_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wk_act_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP1150.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wk_cost_cd.getListConfig().setPutter(getCnd_wk_cost_cd_ListPutter());
		Cnd_wk_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wk_rsn_cd.getListConfig().setPutter(getCnd_wk_rsn_cd_ListPutter());
		Cnd_wk_day_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wk_day_cd.getListConfig().setPutter(getCnd_wk_day_cd_ListPutter());
		Cnd_dpt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_wg_cd.getListConfig().setPutter(getCnd_dpt_wg_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_wg_cd.getListConfig().setPutter(getCnd_loc_wg_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
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
		Cnd_wk_usr_cd.getListConfig().setPutter(getCnd_wk_usr_cd_ListPutter());
		Cnd_wk_usr_dpt_cd.getListConfig().setPutter(getCnd_wk_usr_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnRslt_mfg_inst_no.getListConfig().setPutter(getRslt_mfg_inst_no_ListPutter());
		columnRslt_div_seq.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_div_seq.getListConfig().setPutter(getRslt_div_seq_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
		columnRslt_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wk_cost_cd.getListConfig().setPutter(getRslt_wk_cost_cd_ListPutter());
		columnRslt_wk_day_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wk_day_cd.getListConfig().setPutter(getRslt_wk_day_cd_ListPutter());
		columnRslt_wk_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_wk_rsn_cd.getListConfig().setPutter(getRslt_wk_rsn_cd_ListPutter());
		columnRslt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dpt_cd.getListConfig().setPutter(getRslt_dpt_cd_ListPutter());
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
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
	 * この画面を[SRCH_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHDStatus() {
		status = SRCH_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHDStatus() {
		status = REF_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACTStatus() {
		status = SRCH_ACT;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACTStatus() {
		status = REF_ACT;
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
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH_SCHD.equals(status)) {
			setSRCH_SCHDStatus();
		}
		else if (REF_SCHD.equals(status)) {
			setREF_SCHDStatus();
		}
		else if (SRCH_ACT.equals(status)) {
			setSRCH_ACTStatus();
		}
		else if (REF_ACT.equals(status)) {
			setREF_ACTStatus();
		}
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
	 * [Cnd_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
		return lp;
	}
	 
	/**
	 * [Cnd_wk_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_wk_day_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_day_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkDay");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
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
	 * [Cnd_wk_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_wk_usr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_usr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_mfg_inst_no_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_inst_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.MfgInstNo");
		return lp;
	}
	 
	/**
	 * [Rslt_div_seq_ListPutter]の作成
	 */
	protected MCListPutter createRslt_div_seq_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.DivSeq");
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
	 * [Rslt_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
		return lp;
	}
	 
	/**
	 * [Rslt_wk_day_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wk_day_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkDay");
		return lp;
	}
	 
	/**
	 * [Rslt_wk_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_wk_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkRsn");
		return lp;
	}
	 
	/**
	 * [Rslt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_wk_cost_cd) return getCnd_wk_cost_cd(row, info);
		if(combo == Cnd_wk_rsn_cd) return getCnd_wk_rsn_cd(row, info);
		if(combo == Cnd_wk_day_cd) return getCnd_wk_day_cd(row, info);
		if(combo == Cnd_dpt_wg_cd) return getCnd_dpt_wg_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_wg_cd) return getCnd_loc_wg_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_wk_usr_cd) return getCnd_wk_usr_cd(row, info);
		if(combo == Cnd_wk_usr_dpt_cd) return getCnd_wk_usr_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_mfg_inst_no) return getRslt_mfg_inst_no(row, info);
		if(combo == columnRslt_div_seq) return getRslt_div_seq(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
		if(combo == columnRslt_wk_cost_cd) return getRslt_wk_cost_cd(row, info);
		if(combo == columnRslt_wk_day_cd) return getRslt_wk_day_cd(row, info);
		if(combo == columnRslt_wk_rsn_cd) return getRslt_wk_rsn_cd(row, info);
		if(combo == columnRslt_dpt_cd) return getRslt_dpt_cd(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
		if(combo == Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == Rslt_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
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
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_disp_unit_Group) return doCnd_disp_unit_VC(info);
		if (vc == Cnd_oper_ord_flg) return doCnd_oper_ord_flg_VC(info);
		if (vc == Cnd_oper_stt_flg) return doCnd_oper_stt_flg_VC(info);
		if (vc == Cnd_oper_cmpl_flg) return doCnd_oper_cmpl_flg_VC(info);
		if (vc == Cnd_oper_no_inst_flg) return doCnd_oper_no_inst_flg_VC(info);
		if (vc == Cnd_ord_flg) return doCnd_ord_flg_VC(info);
		if (vc == Cnd_stt_flg) return doCnd_stt_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_no_schd_flg) return doCnd_no_schd_flg_VC(info);
		if (vc == Cnd_mes_tgt_flg) return doCnd_mes_tgt_flg_VC(info);
		if (vc == Cnd_not_mes_tgt_flg) return doCnd_not_mes_tgt_flg_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_pr_rate_fr) return doCnd_pr_rate_fr_VC(info);
		if (vc == Cnd_pr_rate_to) return doCnd_pr_rate_to_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_wk_cost_cd) return doCnd_wk_cost_cd_VC(info);
		if (vc == Cnd_wk_cost_nm) return doCnd_wk_cost_nm_VC(info);
		if (vc == Cnd_wk_rsn_cd) return doCnd_wk_rsn_cd_VC(info);
		if (vc == Cnd_wk_rsn_nm) return doCnd_wk_rsn_nm_VC(info);
		if (vc == Cnd_wk_day_cd) return doCnd_wk_day_cd_VC(info);
		if (vc == Cnd_wk_day_nm) return doCnd_wk_day_nm_VC(info);
		if (vc == Cnd_dpt_wg_cd) return doCnd_dpt_wg_cd_VC(info);
		if (vc == Cnd_dpt_wg_nm) return doCnd_dpt_wg_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_wg_cd) return doCnd_loc_wg_cd_VC(info);
		if (vc == Cnd_loc_wg_nm) return doCnd_loc_wg_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_mfg_inst_no) return doCnd_mfg_inst_no_VC(info);
		if (vc == Cnd_wk_usr_cd) return doCnd_wk_usr_cd_VC(info);
		if (vc == Cnd_wk_usr_nm) return doCnd_wk_usr_nm_VC(info);
		if (vc == Cnd_wk_usr_dpt_cd) return doCnd_wk_usr_dpt_cd_VC(info);
		if (vc == Cnd_wk_usr_dpt_nm) return doCnd_wk_usr_dpt_nm_VC(info);
		if (vc == Cnd_fclty) return doCnd_fclty_VC(info);
		if (vc == Cnd_itm_mfg_inst_no) return doCnd_itm_mfg_inst_no_VC(info);
		if (vc == Cnd_wk_act_no) return doCnd_wk_act_no_VC(info);
		if (vc == Cnd_mfg_act_no) return doCnd_mfg_act_no_VC(info);
		if (vc == Cnd_no_mfg_inst_only_flg) return doCnd_no_mfg_inst_only_flg_VC(info);
		if (vc == Cnd_ext_wk_act_no) return doCnd_ext_wk_act_no_VC(info);
		if (vc == Cnd_schd_intr_rmrks) return doCnd_schd_intr_rmrks_VC(info);
		if (vc == Cnd_schd_sub_char1) return doCnd_schd_sub_char1_VC(info);
		if (vc == Cnd_schd_sub_char2) return doCnd_schd_sub_char2_VC(info);
		if (vc == Cnd_schd_sub_char3) return doCnd_schd_sub_char3_VC(info);
		if (vc == Cnd_act_intr_rmrks) return doCnd_act_intr_rmrks_VC(info);
		if (vc == Cnd_act_sub_char1) return doCnd_act_sub_char1_VC(info);
		if (vc == Cnd_act_sub_char2) return doCnd_act_sub_char2_VC(info);
		if (vc == Cnd_act_sub_char3) return doCnd_act_sub_char3_VC(info);
		if (vc == BulkSet_ac_dt) return doBulkSet_ac_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_inst_wk_act_flg) return doRslt_inst_wk_act_flg_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_div_seq) return doRslt_div_seq_VC(info);
		if (vc == columnRslt_oper_disp_seq) return doRslt_oper_disp_seq_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_wk_cost_cd) return doRslt_wk_cost_cd_VC(info);
		if (vc == columnRslt_wk_cost_nm) return doRslt_wk_cost_nm_VC(info);
		if (vc == columnRslt_brk_pd) return doRslt_brk_pd_VC(info);
		if (vc == columnRslt_wk_cost_calc_ctl_flg) return doRslt_wk_cost_calc_ctl_flg_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_wk_cost_unit_nm) return doRslt_wk_cost_unit_nm_VC(info);
		if (vc == columnRslt_pr_rate) return doRslt_pr_rate_VC(info);
		if (vc == columnRslt_wk_cost_dec_place) return doRslt_wk_cost_dec_place_VC(info);
		if (vc == columnRslt_wk_cost_rnd_typ) return doRslt_wk_cost_rnd_typ_VC(info);
		if (vc == columnRslt_wk_day_cd) return doRslt_wk_day_cd_VC(info);
		if (vc == columnRslt_wk_day_nm) return doRslt_wk_day_nm_VC(info);
		if (vc == columnRslt_wk_rsn_cd) return doRslt_wk_rsn_cd_VC(info);
		if (vc == columnRslt_wk_rsn_nm) return doRslt_wk_rsn_nm_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_tgt_flg) return doRslt_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_fclty) return doRslt_fclty_VC(info);
		if (vc == columnRslt_schd_intr_rmrks) return doRslt_schd_intr_rmrks_VC(info);
		if (vc == columnRslt_wk_cost_calc_flg) return doRslt_wk_cost_calc_flg_VC(info);
		if (vc == columnRslt_schd_sub_char1) return doRslt_schd_sub_char1_VC(info);
		if (vc == columnRslt_schd_sub_char2) return doRslt_schd_sub_char2_VC(info);
		if (vc == columnRslt_schd_sub_char3) return doRslt_schd_sub_char3_VC(info);
		if (vc == columnRslt_act_intr_rmrks) return doRslt_act_intr_rmrks_VC(info);
		if (vc == columnRslt_act_sub_char1) return doRslt_act_sub_char1_VC(info);
		if (vc == columnRslt_act_sub_char2) return doRslt_act_sub_char2_VC(info);
		if (vc == columnRslt_act_sub_char3) return doRslt_act_sub_char3_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_oper_st_schd_dt) return doRslt_oper_st_schd_dt_VC(info);
		if (vc == columnRslt_oper_st_schd_hm) return doRslt_oper_st_schd_hm_VC(info);
		if (vc == columnRslt_oper_end_schd_dt) return doRslt_oper_end_schd_dt_VC(info);
		if (vc == columnRslt_oper_end_schd_hm) return doRslt_oper_end_schd_hm_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_wk_mfg_sts_typ) return doRslt_wk_mfg_sts_typ_VC(info);
		if (vc == columnRslt_wk_mfg_sts_typ_nm) return doRslt_wk_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_oper_mfg_sts_typ) return doRslt_oper_mfg_sts_typ_VC(info);
		if (vc == columnRslt_oper_mfg_sts_typ_nm) return doRslt_oper_mfg_sts_typ_nm_VC(info);
		if (vc == columnRslt_aprv_flg) return doRslt_aprv_flg_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_oper_inst_no) return doRslt_oper_inst_no_VC(info);
		if (vc == columnRslt_wk_schd_no) return doRslt_wk_schd_no_VC(info);
		if (vc == columnRslt_mfg_act_no) return doRslt_mfg_act_no_VC(info);
		if (vc == columnRslt_oper_act_no) return doRslt_oper_act_no_VC(info);
		if (vc == columnRslt_wk_act_no) return doRslt_wk_act_no_VC(info);
		if (vc == columnRslt_mes_flg) return doRslt_mes_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_wk_act_no) return doRslt_ext_wk_act_no_VC(info);
		if (vc == columnRslt_dpt_wg_cd) return doRslt_dpt_wg_cd_VC(info);
		if (vc == columnRslt_dpt_wg_nm) return doRslt_dpt_wg_nm_VC(info);
		if (vc == columnRslt_loc_wg_cd) return doRslt_loc_wg_cd_VC(info);
		if (vc == columnRslt_loc_wg_nm) return doRslt_loc_wg_nm_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_mfg_inst_upd_cntr) return doRslt_mfg_inst_upd_cntr_VC(info);
		if (vc == columnRslt_wk_act_upd_cntr) return doRslt_wk_act_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_ord_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_stt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_no_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_no_inst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mes_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mes_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_mes_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_mes_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_day_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_day_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_day_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_day_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_wg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_wg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_usr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_usr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fclty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fclty_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_mfg_inst_only_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_mfg_inst_only_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_wk_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_wk_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_ac_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_wk_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_wk_act_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_disp_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[brk_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_brk_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_calc_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_cost_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_unit_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_cost_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_day_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_day_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_day_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_day_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_rsn_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fclty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fclty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_cost_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_st_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_st_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_end_schd_hm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_mfg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_mfg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_mfg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mes_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mes_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_wk_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_wk_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_inst_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wk_act_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wk_act_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_disp_unit_Group) doCnd_disp_unit_NC(info);
		else if (nc == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NC(info);
		else if (nc == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NC(info);
		else if (nc == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NC(info);
		else if (nc == Cnd_oper_no_inst_flg) doCnd_oper_no_inst_flg_NC(info);
		else if (nc == Cnd_ord_flg) doCnd_ord_flg_NC(info);
		else if (nc == Cnd_stt_flg) doCnd_stt_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_no_schd_flg) doCnd_no_schd_flg_NC(info);
		else if (nc == Cnd_mes_tgt_flg) doCnd_mes_tgt_flg_NC(info);
		else if (nc == Cnd_not_mes_tgt_flg) doCnd_not_mes_tgt_flg_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NC(info);
		else if (nc == Cnd_pr_rate_to) doCnd_pr_rate_to_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NC(info);
		else if (nc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NC(info);
		else if (nc == Cnd_wk_rsn_cd) doCnd_wk_rsn_cd_NC(info);
		else if (nc == Cnd_wk_rsn_nm) doCnd_wk_rsn_nm_NC(info);
		else if (nc == Cnd_wk_day_cd) doCnd_wk_day_cd_NC(info);
		else if (nc == Cnd_wk_day_nm) doCnd_wk_day_nm_NC(info);
		else if (nc == Cnd_dpt_wg_cd) doCnd_dpt_wg_cd_NC(info);
		else if (nc == Cnd_dpt_wg_nm) doCnd_dpt_wg_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NC(info);
		else if (nc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NC(info);
		else if (nc == Cnd_wk_usr_cd) doCnd_wk_usr_cd_NC(info);
		else if (nc == Cnd_wk_usr_nm) doCnd_wk_usr_nm_NC(info);
		else if (nc == Cnd_wk_usr_dpt_cd) doCnd_wk_usr_dpt_cd_NC(info);
		else if (nc == Cnd_wk_usr_dpt_nm) doCnd_wk_usr_dpt_nm_NC(info);
		else if (nc == Cnd_fclty) doCnd_fclty_NC(info);
		else if (nc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NC(info);
		else if (nc == Cnd_wk_act_no) doCnd_wk_act_no_NC(info);
		else if (nc == Cnd_mfg_act_no) doCnd_mfg_act_no_NC(info);
		else if (nc == Cnd_no_mfg_inst_only_flg) doCnd_no_mfg_inst_only_flg_NC(info);
		else if (nc == Cnd_ext_wk_act_no) doCnd_ext_wk_act_no_NC(info);
		else if (nc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NC(info);
		else if (nc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NC(info);
		else if (nc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NC(info);
		else if (nc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NC(info);
		else if (nc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NC(info);
		else if (nc == Cnd_act_sub_char1) doCnd_act_sub_char1_NC(info);
		else if (nc == Cnd_act_sub_char2) doCnd_act_sub_char2_NC(info);
		else if (nc == Cnd_act_sub_char3) doCnd_act_sub_char3_NC(info);
		else if (nc == BulkSet_ac_dt) doBulkSet_ac_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_inst_wk_act_flg) doRslt_inst_wk_act_flg_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_div_seq) doRslt_div_seq_NC(info);
		else if (nc == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_wk_cost_cd) doRslt_wk_cost_cd_NC(info);
		else if (nc == columnRslt_wk_cost_nm) doRslt_wk_cost_nm_NC(info);
		else if (nc == columnRslt_brk_pd) doRslt_brk_pd_NC(info);
		else if (nc == columnRslt_wk_cost_calc_ctl_flg) doRslt_wk_cost_calc_ctl_flg_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_wk_cost_unit_nm) doRslt_wk_cost_unit_nm_NC(info);
		else if (nc == columnRslt_pr_rate) doRslt_pr_rate_NC(info);
		else if (nc == columnRslt_wk_cost_dec_place) doRslt_wk_cost_dec_place_NC(info);
		else if (nc == columnRslt_wk_cost_rnd_typ) doRslt_wk_cost_rnd_typ_NC(info);
		else if (nc == columnRslt_wk_day_cd) doRslt_wk_day_cd_NC(info);
		else if (nc == columnRslt_wk_day_nm) doRslt_wk_day_nm_NC(info);
		else if (nc == columnRslt_wk_rsn_cd) doRslt_wk_rsn_cd_NC(info);
		else if (nc == columnRslt_wk_rsn_nm) doRslt_wk_rsn_nm_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_fclty) doRslt_fclty_NC(info);
		else if (nc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NC(info);
		else if (nc == columnRslt_wk_cost_calc_flg) doRslt_wk_cost_calc_flg_NC(info);
		else if (nc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NC(info);
		else if (nc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NC(info);
		else if (nc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NC(info);
		else if (nc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_act_sub_char1) doRslt_act_sub_char1_NC(info);
		else if (nc == columnRslt_act_sub_char2) doRslt_act_sub_char2_NC(info);
		else if (nc == columnRslt_act_sub_char3) doRslt_act_sub_char3_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_oper_st_schd_dt) doRslt_oper_st_schd_dt_NC(info);
		else if (nc == columnRslt_oper_st_schd_hm) doRslt_oper_st_schd_hm_NC(info);
		else if (nc == columnRslt_oper_end_schd_dt) doRslt_oper_end_schd_dt_NC(info);
		else if (nc == columnRslt_oper_end_schd_hm) doRslt_oper_end_schd_hm_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_wk_mfg_sts_typ) doRslt_wk_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_wk_mfg_sts_typ_nm) doRslt_wk_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NC(info);
		else if (nc == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_aprv_flg) doRslt_aprv_flg_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_oper_inst_no) doRslt_oper_inst_no_NC(info);
		else if (nc == columnRslt_wk_schd_no) doRslt_wk_schd_no_NC(info);
		else if (nc == columnRslt_mfg_act_no) doRslt_mfg_act_no_NC(info);
		else if (nc == columnRslt_oper_act_no) doRslt_oper_act_no_NC(info);
		else if (nc == columnRslt_wk_act_no) doRslt_wk_act_no_NC(info);
		else if (nc == columnRslt_mes_flg) doRslt_mes_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_wk_act_no) doRslt_ext_wk_act_no_NC(info);
		else if (nc == columnRslt_dpt_wg_cd) doRslt_dpt_wg_cd_NC(info);
		else if (nc == columnRslt_dpt_wg_nm) doRslt_dpt_wg_nm_NC(info);
		else if (nc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NC(info);
		else if (nc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_mfg_inst_upd_cntr) doRslt_mfg_inst_upd_cntr_NC(info);
		else if (nc == columnRslt_wk_act_upd_cntr) doRslt_wk_act_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_no_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_no_inst_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[no_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mes_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mes_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fclty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fclty_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_mfg_inst_only_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_mfg_inst_only_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_wk_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_wk_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wk_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wk_act_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[brk_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_brk_pd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fclty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fclty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_st_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_wk_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_wk_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_disp_unit_Group) doCnd_disp_unit_NE(info);
		else if (ne == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NE(info);
		else if (ne == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NE(info);
		else if (ne == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NE(info);
		else if (ne == Cnd_oper_no_inst_flg) doCnd_oper_no_inst_flg_NE(info);
		else if (ne == Cnd_ord_flg) doCnd_ord_flg_NE(info);
		else if (ne == Cnd_stt_flg) doCnd_stt_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_no_schd_flg) doCnd_no_schd_flg_NE(info);
		else if (ne == Cnd_mes_tgt_flg) doCnd_mes_tgt_flg_NE(info);
		else if (ne == Cnd_not_mes_tgt_flg) doCnd_not_mes_tgt_flg_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NE(info);
		else if (ne == Cnd_pr_rate_to) doCnd_pr_rate_to_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NE(info);
		else if (ne == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NE(info);
		else if (ne == Cnd_wk_rsn_cd) doCnd_wk_rsn_cd_NE(info);
		else if (ne == Cnd_wk_rsn_nm) doCnd_wk_rsn_nm_NE(info);
		else if (ne == Cnd_wk_day_cd) doCnd_wk_day_cd_NE(info);
		else if (ne == Cnd_wk_day_nm) doCnd_wk_day_nm_NE(info);
		else if (ne == Cnd_dpt_wg_cd) doCnd_dpt_wg_cd_NE(info);
		else if (ne == Cnd_dpt_wg_nm) doCnd_dpt_wg_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NE(info);
		else if (ne == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NE(info);
		else if (ne == Cnd_wk_usr_cd) doCnd_wk_usr_cd_NE(info);
		else if (ne == Cnd_wk_usr_nm) doCnd_wk_usr_nm_NE(info);
		else if (ne == Cnd_wk_usr_dpt_cd) doCnd_wk_usr_dpt_cd_NE(info);
		else if (ne == Cnd_wk_usr_dpt_nm) doCnd_wk_usr_dpt_nm_NE(info);
		else if (ne == Cnd_fclty) doCnd_fclty_NE(info);
		else if (ne == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NE(info);
		else if (ne == Cnd_wk_act_no) doCnd_wk_act_no_NE(info);
		else if (ne == Cnd_mfg_act_no) doCnd_mfg_act_no_NE(info);
		else if (ne == Cnd_no_mfg_inst_only_flg) doCnd_no_mfg_inst_only_flg_NE(info);
		else if (ne == Cnd_ext_wk_act_no) doCnd_ext_wk_act_no_NE(info);
		else if (ne == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NE(info);
		else if (ne == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NE(info);
		else if (ne == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NE(info);
		else if (ne == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NE(info);
		else if (ne == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NE(info);
		else if (ne == Cnd_act_sub_char1) doCnd_act_sub_char1_NE(info);
		else if (ne == Cnd_act_sub_char2) doCnd_act_sub_char2_NE(info);
		else if (ne == Cnd_act_sub_char3) doCnd_act_sub_char3_NE(info);
		else if (ne == BulkSet_ac_dt) doBulkSet_ac_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_inst_wk_act_flg) doRslt_inst_wk_act_flg_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_div_seq) doRslt_div_seq_NE(info);
		else if (ne == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_wk_cost_cd) doRslt_wk_cost_cd_NE(info);
		else if (ne == columnRslt_wk_cost_nm) doRslt_wk_cost_nm_NE(info);
		else if (ne == columnRslt_brk_pd) doRslt_brk_pd_NE(info);
		else if (ne == columnRslt_wk_cost_calc_ctl_flg) doRslt_wk_cost_calc_ctl_flg_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_wk_cost_unit_nm) doRslt_wk_cost_unit_nm_NE(info);
		else if (ne == columnRslt_pr_rate) doRslt_pr_rate_NE(info);
		else if (ne == columnRslt_wk_cost_dec_place) doRslt_wk_cost_dec_place_NE(info);
		else if (ne == columnRslt_wk_cost_rnd_typ) doRslt_wk_cost_rnd_typ_NE(info);
		else if (ne == columnRslt_wk_day_cd) doRslt_wk_day_cd_NE(info);
		else if (ne == columnRslt_wk_day_nm) doRslt_wk_day_nm_NE(info);
		else if (ne == columnRslt_wk_rsn_cd) doRslt_wk_rsn_cd_NE(info);
		else if (ne == columnRslt_wk_rsn_nm) doRslt_wk_rsn_nm_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_fclty) doRslt_fclty_NE(info);
		else if (ne == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NE(info);
		else if (ne == columnRslt_wk_cost_calc_flg) doRslt_wk_cost_calc_flg_NE(info);
		else if (ne == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NE(info);
		else if (ne == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NE(info);
		else if (ne == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NE(info);
		else if (ne == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_act_sub_char1) doRslt_act_sub_char1_NE(info);
		else if (ne == columnRslt_act_sub_char2) doRslt_act_sub_char2_NE(info);
		else if (ne == columnRslt_act_sub_char3) doRslt_act_sub_char3_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_oper_st_schd_dt) doRslt_oper_st_schd_dt_NE(info);
		else if (ne == columnRslt_oper_st_schd_hm) doRslt_oper_st_schd_hm_NE(info);
		else if (ne == columnRslt_oper_end_schd_dt) doRslt_oper_end_schd_dt_NE(info);
		else if (ne == columnRslt_oper_end_schd_hm) doRslt_oper_end_schd_hm_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_wk_mfg_sts_typ) doRslt_wk_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_wk_mfg_sts_typ_nm) doRslt_wk_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NE(info);
		else if (ne == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_aprv_flg) doRslt_aprv_flg_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_oper_inst_no) doRslt_oper_inst_no_NE(info);
		else if (ne == columnRslt_wk_schd_no) doRslt_wk_schd_no_NE(info);
		else if (ne == columnRslt_mfg_act_no) doRslt_mfg_act_no_NE(info);
		else if (ne == columnRslt_oper_act_no) doRslt_oper_act_no_NE(info);
		else if (ne == columnRslt_wk_act_no) doRslt_wk_act_no_NE(info);
		else if (ne == columnRslt_mes_flg) doRslt_mes_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_wk_act_no) doRslt_ext_wk_act_no_NE(info);
		else if (ne == columnRslt_dpt_wg_cd) doRslt_dpt_wg_cd_NE(info);
		else if (ne == columnRslt_dpt_wg_nm) doRslt_dpt_wg_nm_NE(info);
		else if (ne == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NE(info);
		else if (ne == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_mfg_inst_upd_cntr) doRslt_mfg_inst_upd_cntr_NE(info);
		else if (ne == columnRslt_wk_act_upd_cntr) doRslt_wk_act_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_no_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_no_inst_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[no_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mes_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mes_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fclty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fclty_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_mfg_inst_only_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_mfg_inst_only_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_wk_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_wk_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wk_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wk_act_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[brk_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_brk_pd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fclty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fclty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_st_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_wk_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_wk_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_disp_unit_Group) doCnd_disp_unit_NX(info);
		else if (nx == Cnd_oper_ord_flg) doCnd_oper_ord_flg_NX(info);
		else if (nx == Cnd_oper_stt_flg) doCnd_oper_stt_flg_NX(info);
		else if (nx == Cnd_oper_cmpl_flg) doCnd_oper_cmpl_flg_NX(info);
		else if (nx == Cnd_oper_no_inst_flg) doCnd_oper_no_inst_flg_NX(info);
		else if (nx == Cnd_ord_flg) doCnd_ord_flg_NX(info);
		else if (nx == Cnd_stt_flg) doCnd_stt_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_no_schd_flg) doCnd_no_schd_flg_NX(info);
		else if (nx == Cnd_mes_tgt_flg) doCnd_mes_tgt_flg_NX(info);
		else if (nx == Cnd_not_mes_tgt_flg) doCnd_not_mes_tgt_flg_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_pr_rate_fr) doCnd_pr_rate_fr_NX(info);
		else if (nx == Cnd_pr_rate_to) doCnd_pr_rate_to_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NX(info);
		else if (nx == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NX(info);
		else if (nx == Cnd_wk_rsn_cd) doCnd_wk_rsn_cd_NX(info);
		else if (nx == Cnd_wk_rsn_nm) doCnd_wk_rsn_nm_NX(info);
		else if (nx == Cnd_wk_day_cd) doCnd_wk_day_cd_NX(info);
		else if (nx == Cnd_wk_day_nm) doCnd_wk_day_nm_NX(info);
		else if (nx == Cnd_dpt_wg_cd) doCnd_dpt_wg_cd_NX(info);
		else if (nx == Cnd_dpt_wg_nm) doCnd_dpt_wg_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NX(info);
		else if (nx == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_mfg_inst_no) doCnd_mfg_inst_no_NX(info);
		else if (nx == Cnd_wk_usr_cd) doCnd_wk_usr_cd_NX(info);
		else if (nx == Cnd_wk_usr_nm) doCnd_wk_usr_nm_NX(info);
		else if (nx == Cnd_wk_usr_dpt_cd) doCnd_wk_usr_dpt_cd_NX(info);
		else if (nx == Cnd_wk_usr_dpt_nm) doCnd_wk_usr_dpt_nm_NX(info);
		else if (nx == Cnd_fclty) doCnd_fclty_NX(info);
		else if (nx == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_NX(info);
		else if (nx == Cnd_wk_act_no) doCnd_wk_act_no_NX(info);
		else if (nx == Cnd_mfg_act_no) doCnd_mfg_act_no_NX(info);
		else if (nx == Cnd_no_mfg_inst_only_flg) doCnd_no_mfg_inst_only_flg_NX(info);
		else if (nx == Cnd_ext_wk_act_no) doCnd_ext_wk_act_no_NX(info);
		else if (nx == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NX(info);
		else if (nx == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NX(info);
		else if (nx == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NX(info);
		else if (nx == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NX(info);
		else if (nx == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NX(info);
		else if (nx == Cnd_act_sub_char1) doCnd_act_sub_char1_NX(info);
		else if (nx == Cnd_act_sub_char2) doCnd_act_sub_char2_NX(info);
		else if (nx == Cnd_act_sub_char3) doCnd_act_sub_char3_NX(info);
		else if (nx == BulkSet_ac_dt) doBulkSet_ac_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_inst_wk_act_flg) doRslt_inst_wk_act_flg_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_div_seq) doRslt_div_seq_NX(info);
		else if (nx == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_wk_cost_cd) doRslt_wk_cost_cd_NX(info);
		else if (nx == columnRslt_wk_cost_nm) doRslt_wk_cost_nm_NX(info);
		else if (nx == columnRslt_brk_pd) doRslt_brk_pd_NX(info);
		else if (nx == columnRslt_wk_cost_calc_ctl_flg) doRslt_wk_cost_calc_ctl_flg_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_wk_cost_unit_nm) doRslt_wk_cost_unit_nm_NX(info);
		else if (nx == columnRslt_pr_rate) doRslt_pr_rate_NX(info);
		else if (nx == columnRslt_wk_cost_dec_place) doRslt_wk_cost_dec_place_NX(info);
		else if (nx == columnRslt_wk_cost_rnd_typ) doRslt_wk_cost_rnd_typ_NX(info);
		else if (nx == columnRslt_wk_day_cd) doRslt_wk_day_cd_NX(info);
		else if (nx == columnRslt_wk_day_nm) doRslt_wk_day_nm_NX(info);
		else if (nx == columnRslt_wk_rsn_cd) doRslt_wk_rsn_cd_NX(info);
		else if (nx == columnRslt_wk_rsn_nm) doRslt_wk_rsn_nm_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_fclty) doRslt_fclty_NX(info);
		else if (nx == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NX(info);
		else if (nx == columnRslt_wk_cost_calc_flg) doRslt_wk_cost_calc_flg_NX(info);
		else if (nx == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NX(info);
		else if (nx == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NX(info);
		else if (nx == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NX(info);
		else if (nx == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_act_sub_char1) doRslt_act_sub_char1_NX(info);
		else if (nx == columnRslt_act_sub_char2) doRslt_act_sub_char2_NX(info);
		else if (nx == columnRslt_act_sub_char3) doRslt_act_sub_char3_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_oper_st_schd_dt) doRslt_oper_st_schd_dt_NX(info);
		else if (nx == columnRslt_oper_st_schd_hm) doRslt_oper_st_schd_hm_NX(info);
		else if (nx == columnRslt_oper_end_schd_dt) doRslt_oper_end_schd_dt_NX(info);
		else if (nx == columnRslt_oper_end_schd_hm) doRslt_oper_end_schd_hm_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_wk_mfg_sts_typ) doRslt_wk_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_wk_mfg_sts_typ_nm) doRslt_wk_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_NX(info);
		else if (nx == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_aprv_flg) doRslt_aprv_flg_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_oper_inst_no) doRslt_oper_inst_no_NX(info);
		else if (nx == columnRslt_wk_schd_no) doRslt_wk_schd_no_NX(info);
		else if (nx == columnRslt_mfg_act_no) doRslt_mfg_act_no_NX(info);
		else if (nx == columnRslt_oper_act_no) doRslt_oper_act_no_NX(info);
		else if (nx == columnRslt_wk_act_no) doRslt_wk_act_no_NX(info);
		else if (nx == columnRslt_mes_flg) doRslt_mes_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_wk_act_no) doRslt_ext_wk_act_no_NX(info);
		else if (nx == columnRslt_dpt_wg_cd) doRslt_dpt_wg_cd_NX(info);
		else if (nx == columnRslt_dpt_wg_nm) doRslt_dpt_wg_nm_NX(info);
		else if (nx == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NX(info);
		else if (nx == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_mfg_inst_upd_cntr) doRslt_mfg_inst_upd_cntr_NX(info);
		else if (nx == columnRslt_wk_act_upd_cntr) doRslt_wk_act_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_ord_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_stt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_stt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_no_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_no_inst_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[no_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mes_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mes_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mes_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mes_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fclty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fclty_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_mfg_inst_only_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_mfg_inst_only_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_wk_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_wk_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_wk_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_wk_act_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[brk_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_brk_pd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fclty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fclty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_st_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mes_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mes_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_wk_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_wk_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_upd_cntr_NX(MCEventInfo info){
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
		if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_pr_rate_fr) doCnd_pr_rate_fr_LC(info);
		else if (lc == Cnd_pr_rate_to) doCnd_pr_rate_to_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_LC(info);
		else if (lc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_LC(info);
		else if (lc == Cnd_wk_rsn_cd) doCnd_wk_rsn_cd_LC(info);
		else if (lc == Cnd_wk_rsn_nm) doCnd_wk_rsn_nm_LC(info);
		else if (lc == Cnd_wk_day_cd) doCnd_wk_day_cd_LC(info);
		else if (lc == Cnd_wk_day_nm) doCnd_wk_day_nm_LC(info);
		else if (lc == Cnd_dpt_wg_cd) doCnd_dpt_wg_cd_LC(info);
		else if (lc == Cnd_dpt_wg_nm) doCnd_dpt_wg_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_LC(info);
		else if (lc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_mfg_inst_no) doCnd_mfg_inst_no_LC(info);
		else if (lc == Cnd_wk_usr_cd) doCnd_wk_usr_cd_LC(info);
		else if (lc == Cnd_wk_usr_nm) doCnd_wk_usr_nm_LC(info);
		else if (lc == Cnd_wk_usr_dpt_cd) doCnd_wk_usr_dpt_cd_LC(info);
		else if (lc == Cnd_wk_usr_dpt_nm) doCnd_wk_usr_dpt_nm_LC(info);
		else if (lc == Cnd_fclty) doCnd_fclty_LC(info);
		else if (lc == Cnd_itm_mfg_inst_no) doCnd_itm_mfg_inst_no_LC(info);
		else if (lc == Cnd_wk_act_no) doCnd_wk_act_no_LC(info);
		else if (lc == Cnd_mfg_act_no) doCnd_mfg_act_no_LC(info);
		else if (lc == Cnd_ext_wk_act_no) doCnd_ext_wk_act_no_LC(info);
		else if (lc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_LC(info);
		else if (lc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_LC(info);
		else if (lc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_LC(info);
		else if (lc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_LC(info);
		else if (lc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_LC(info);
		else if (lc == Cnd_act_sub_char1) doCnd_act_sub_char1_LC(info);
		else if (lc == Cnd_act_sub_char2) doCnd_act_sub_char2_LC(info);
		else if (lc == Cnd_act_sub_char3) doCnd_act_sub_char3_LC(info);
		else if (lc == BulkSet_ac_dt) doBulkSet_ac_dt_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_div_seq) doRslt_div_seq_LC(info);
		else if (lc == columnRslt_oper_disp_seq) doRslt_oper_disp_seq_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_wk_cost_cd) doRslt_wk_cost_cd_LC(info);
		else if (lc == columnRslt_wk_cost_nm) doRslt_wk_cost_nm_LC(info);
		else if (lc == columnRslt_brk_pd) doRslt_brk_pd_LC(info);
		else if (lc == columnRslt_wk_cost_unit_nm) doRslt_wk_cost_unit_nm_LC(info);
		else if (lc == columnRslt_pr_rate) doRslt_pr_rate_LC(info);
		else if (lc == columnRslt_wk_cost_dec_place) doRslt_wk_cost_dec_place_LC(info);
		else if (lc == columnRslt_wk_cost_rnd_typ) doRslt_wk_cost_rnd_typ_LC(info);
		else if (lc == columnRslt_wk_day_cd) doRslt_wk_day_cd_LC(info);
		else if (lc == columnRslt_wk_day_nm) doRslt_wk_day_nm_LC(info);
		else if (lc == columnRslt_wk_rsn_cd) doRslt_wk_rsn_cd_LC(info);
		else if (lc == columnRslt_wk_rsn_nm) doRslt_wk_rsn_nm_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_fclty) doRslt_fclty_LC(info);
		else if (lc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_LC(info);
		else if (lc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_LC(info);
		else if (lc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_LC(info);
		else if (lc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_LC(info);
		else if (lc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_act_sub_char1) doRslt_act_sub_char1_LC(info);
		else if (lc == columnRslt_act_sub_char2) doRslt_act_sub_char2_LC(info);
		else if (lc == columnRslt_act_sub_char3) doRslt_act_sub_char3_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_oper_st_schd_dt) doRslt_oper_st_schd_dt_LC(info);
		else if (lc == columnRslt_oper_st_schd_hm) doRslt_oper_st_schd_hm_LC(info);
		else if (lc == columnRslt_oper_end_schd_dt) doRslt_oper_end_schd_dt_LC(info);
		else if (lc == columnRslt_oper_end_schd_hm) doRslt_oper_end_schd_hm_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_wk_mfg_sts_typ) doRslt_wk_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_wk_mfg_sts_typ_nm) doRslt_wk_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_oper_mfg_sts_typ) doRslt_oper_mfg_sts_typ_LC(info);
		else if (lc == columnRslt_oper_mfg_sts_typ_nm) doRslt_oper_mfg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_oper_inst_no) doRslt_oper_inst_no_LC(info);
		else if (lc == columnRslt_wk_schd_no) doRslt_wk_schd_no_LC(info);
		else if (lc == columnRslt_mfg_act_no) doRslt_mfg_act_no_LC(info);
		else if (lc == columnRslt_oper_act_no) doRslt_oper_act_no_LC(info);
		else if (lc == columnRslt_wk_act_no) doRslt_wk_act_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_wk_act_no) doRslt_ext_wk_act_no_LC(info);
		else if (lc == columnRslt_dpt_wg_cd) doRslt_dpt_wg_cd_LC(info);
		else if (lc == columnRslt_dpt_wg_nm) doRslt_dpt_wg_nm_LC(info);
		else if (lc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_LC(info);
		else if (lc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_mfg_inst_upd_cntr) doRslt_mfg_inst_upd_cntr_LC(info);
		else if (lc == columnRslt_wk_act_upd_cntr) doRslt_wk_act_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_day_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_day_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_wg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_wg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_usr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_usr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fclty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fclty_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_wk_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_wk_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_ac_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_disp_seq_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[brk_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_brk_pd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_cost_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_cost_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_day_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_day_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_rsn_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[fclty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fclty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_st_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_st_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_end_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_end_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_mfg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_mfg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_mfg_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_wk_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_wk_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[mfg_inst_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wk_act_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wk_act_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_cost_cd]の作成メソッド
	 */
	public MCList getCnd_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_wk_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_day_cd]の作成メソッド
	 */
	public MCList getCnd_wk_day_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkDay(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_wg_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
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
	 * コンボ／リストのリスト[Cnd_wk_usr_cd]の作成メソッド
	 */
	public MCList getCnd_wk_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_usr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_wk_usr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_inst_no]の作成メソッド
	 */
	public MCList getRslt_mfg_inst_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getMfgInstNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_div_seq]の作成メソッド
	 */
	public MCList getRslt_div_seq(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getDivSeq(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wk_cost_cd]の作成メソッド
	 */
	public MCList getRslt_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wk_day_cd]の作成メソッド
	 */
	public MCList getRslt_wk_day_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkDay(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_wk_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_wk_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getRslt_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL1150.Srch01")) {
			return new MS_MSBCL1150_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL1150.Srch02")) {
			return new MS_MSBCL1150_Srch02Bridge();
		}
		if (id.equals("MS.MSBCL1150.Srch03")) {
			return new MS_MSBCL1150_Srch03Bridge();
		}
		if (id.equals("MS.MSBCL1150.Imp01")) {
			return new MS_MSBCL1150_Imp01Bridge();
		}
		if (id.equals("MS.MSBCL1150.Upd01")) {
			return new MS_MSBCL1150_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL1150.Del01")) {
			return new MS_MSBCL1150_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL1150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL1150_Srch01Bridge() {
			p_MS_MSBCL1150_Srch01 = new MCParam(PDef.MS_MSBCL1150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1150.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL1150_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Srch02;

		/** コンストラクタ */
		protected MS_MSBCL1150_Srch02Bridge() {
			p_MS_MSBCL1150_Srch02 = new MCParam(PDef.MS_MSBCL1150_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1150.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Srch02.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL1150_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Srch03;

		/** コンストラクタ */
		protected MS_MSBCL1150_Srch03Bridge() {
			p_MS_MSBCL1150_Srch03 = new MCParam(PDef.MS_MSBCL1150_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP1150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP1150.CndR up0() {
			return (mcframe.clientMSBC.MSBCP1150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Srch03.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Srch03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL1150_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Imp01;

		/** コンストラクタ */
		protected MS_MSBCL1150_Imp01Bridge() {
			p_MS_MSBCL1150_Imp01 = new MCParam(PDef.MS_MSBCL1150_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Imp01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL1150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL1150_Upd01Bridge() {
			p_MS_MSBCL1150_Upd01 = new MCParam(PDef.MS_MSBCL1150_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL1150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL1150_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL1150_Del01;

		/** コンストラクタ */
		protected MS_MSBCL1150_Del01Bridge() {
			p_MS_MSBCL1150_Del01 = new MCParam(PDef.MS_MSBCL1150_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL1150_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));

			p_MS_MSBCL1150_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL1150_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL1150_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL1150_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL1150_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP1150.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL1150_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP1150.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL1150_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP1150.RsltR>)p_MS_MSBCL1150_Del01.getContainerParam().getDownBlock(0));
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