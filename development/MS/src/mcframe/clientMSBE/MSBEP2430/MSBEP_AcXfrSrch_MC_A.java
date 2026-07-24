package mcframe.clientMSBE.MSBEP2430;

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
import mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch01Caller;
import mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch02Caller;
import mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch03Caller;
import mcframe.clientMSBE.MSBEP2430.MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Prnt02Caller;

/**
 * 画面"MSBEP_AcXfrSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_AcXfrSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP2430";

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
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * REF2,View order,2;REF3,View result,3;PRNT_ACXFR,Issue transfer slip,5; REF2,指図を参照する,2;REF3,実績を参照する,3;PRNT_ACXFR,振替伝票発行,5;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_REF2 = null;
	public MCRadioButton Cnd_ope_REF3 = null;
	public MCRadioButton Cnd_ope_PRNT_ACXFR = null;
	/**
	 * Unordered 未指図.<p>
	 *
	 */
	public MCCheckBox Cnd_not_inst_flg = null;
	/**
	 * Ordered 指図済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_flg = null;
	/**
	 * Partially completed 一部完了.<p>
	 *
	 */
	public MCCheckBox Cnd_part_comp_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_comp_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_wms_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_wms_flg = null;
	public MCLabel Cnd_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Cnd_trd_nm = null;
	public MCLabel Cnd_trd_ptn_typ_Label = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Cnd_trd_ptn_typ = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_acxfr_schd_no_Label = null;
	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_acxfr_schd_no = null;
	public MCLabel Cnd_acxfr_inst_no_Label = null;
	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_acxfr_inst_no = null;
	public MCLabel Cnd_acxfr_inst_d_no_Label = null;
	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_acxfr_inst_d_no = null;
	public MCLabel Cnd_acxfr_act_no_Label = null;
	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_acxfr_act_no = null;
	public MCLabel Cnd_acxfr_act_d_no_Label = null;
	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_acxfr_act_d_no = null;
	public MCLabel Cnd_ext_acxfr_act_no_Label = null;
	/**
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_acxfr_act_no = null;
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public MCCheckBox Cnd_abort_flg = null;
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
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
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
	public MCLabel Cnd_bd_dpt_cd_Label = null;
	/**
	 * Charged dept. 負担部門.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCTextField Cnd_bd_dpt_nm = null;
	public MCLabel Cnd_rqst_dt_fr_Label = null;
	/**
	 * Transfer requested date 振替依頼日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rqst_dt_fr = null;
	public MCLabel Cnd_rqst_dt_to_Label = null;
	/**
	 * Transfer request date TO 振替依頼日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rqst_dt_to = null;
	public MCLabel Cnd_acxfr_schd_dt_fr_Label = null;
	/**
	 * Scheduled transfer date FROM 振替予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_acxfr_schd_dt_fr = null;
	public MCLabel Cnd_acxfr_schd_dt_to_Label = null;
	/**
	 * Scheduled transfer date TO 振替予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_acxfr_schd_dt_to = null;
	public MCLabel Cnd_acxfr_inst_dt_fr_Label = null;
	/**
	 * Transfer order date FROM 振替指図日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_acxfr_inst_dt_fr = null;
	public MCLabel Cnd_acxfr_inst_dt_to_Label = null;
	/**
	 * Transfer order date TO 振替指図日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_acxfr_inst_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_acxfr_act_dt_p_PPanel;
	public MCDateField Cnd_acxfr_act_dt_fr;	// [Cnd]の[acxfr_act_dt_p.ymd_fr]を[Cnd_acxfr_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_acxfr_act_hm_fr;	// [Cnd]の[acxfr_act_dt_p.hm_fr]を[Cnd_acxfr_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_acxfr_act_dt_to;	// [Cnd]の[acxfr_act_dt_p.ymd_to]を[Cnd_acxfr_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_acxfr_act_hm_to;	// [Cnd]の[acxfr_act_dt_p.hm_to]を[Cnd_acxfr_act_hm_to]としてエイリアス定義。
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Transfer recording date FROM 振替計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Transfer recording date TO 振替計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	public MCLabel Cnd_rsn_cd_Label = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCTextField Cnd_rsn_nm = null;
	public MCLabel Cnd_dspsl_no_Label = null;
	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dspsl_no = null;
	/**
	 * Include scheduled unapproved 予定未承認含む.<p>
	 *
	 */
	public MCCheckBox Cnd_schd_no_aprv_flg = null;
	public MCLabel Cnd_rqst_usr_cd_Label = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_usr_nm = null;
	public MCLabel Cnd_rqst_dpt_cd_Label = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_dpt_nm = null;
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
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_cd = null;
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_nm = null;
	public MCLabel Cnd_act_dpt_cd_Label = null;
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_cd = null;
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_nm = null;
	public MCLabel Cnd_schd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public MCTextField Cnd_schd_trd_d_rmrks = null;
	public MCLabel Cnd_schd_dspsl_rmrks_Label = null;
	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public MCTextField Cnd_schd_dspsl_rmrks = null;
	public MCLabel Cnd_schd_sub_char1_Label = null;
	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char1 = null;
	public MCLabel Cnd_schd_sub_char2_Label = null;
	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char2 = null;
	public MCLabel Cnd_schd_sub_char3_Label = null;
	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char3 = null;
	public MCLabel Cnd_inst_intr_rmrks_Label = null;
	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_intr_rmrks = null;
	public MCLabel Cnd_inst_trd_rmrks_Label = null;
	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_trd_rmrks = null;
	public MCLabel Cnd_inst_rmrks_Label = null;
	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_rmrks = null;
	public MCLabel Cnd_inst_sub_char1_Label = null;
	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_sub_char1 = null;
	public MCLabel Cnd_inst_sub_char2_Label = null;
	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_sub_char2 = null;
	public MCLabel Cnd_inst_sub_char3_Label = null;
	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_inst_sub_char3 = null;
	public MCLabel Cnd_inst_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_intr_d_rmrks = null;
	public MCLabel Cnd_inst_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_trd_d_rmrks = null;
	public MCLabel Cnd_inst_d_rmrks_Label = null;
	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_d_rmrks = null;
	public MCLabel Cnd_inst_d_sub_char1_Label = null;
	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_d_sub_char1 = null;
	public MCLabel Cnd_inst_d_sub_char2_Label = null;
	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_d_sub_char2 = null;
	public MCLabel Cnd_inst_d_sub_char3_Label = null;
	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public MCTextField Cnd_inst_d_sub_char3 = null;
	public MCLabel Cnd_act_intr_rmrks_Label = null;
	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_rmrks = null;
	public MCLabel Cnd_act_trd_rmrks_Label = null;
	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_act_trd_rmrks = null;
	public MCLabel Cnd_act_sub_char1_Label = null;
	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char1 = null;
	public MCLabel Cnd_act_sub_char2_Label = null;
	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char2 = null;
	public MCLabel Cnd_act_sub_char3_Label = null;
	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char3 = null;
	public MCLabel Cnd_act_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_d_rmrks = null;
	public MCLabel Cnd_act_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public MCTextField Cnd_act_trd_d_rmrks = null;
	public MCLabel Cnd_act_d_sub_char1_Label = null;
	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char1 = null;
	public MCLabel Cnd_act_d_sub_char2_Label = null;
	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char2 = null;
	public MCLabel Cnd_act_d_sub_char3_Label = null;
	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char3 = null;
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
	// [WmsTrgt]ブロック関連のField定義
	public MCPanel WmsTrgtPanel = null;
	public MCTitledBorder WmsTrgtTitledBorder = null;
	// [WmsTrgt]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBE.MSBEP2430.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_no = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_schd_unit_p_PPanel;
	public MCColumnConfig columnRslt_trd_schd_unit_qty;// [Rslt]の[trd_schd_unit_p.qty]を[columnRslt_trd_schd_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_inst_unit_p_PPanel;
	public MCColumnConfig columnRslt_trd_inst_unit_qty;// [Rslt]の[trd_inst_unit_p.qty]を[columnRslt_trd_inst_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_act_unit_p_PPanel;
	public MCColumnConfig columnRslt_trd_act_unit_qty;// [Rslt]の[trd_act_unit_p.qty]を[columnRslt_trd_act_unit_qty]としてエイリアス定義。
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
	 * Base unit number of decimal places 基準単位小数有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_qty;// [Rslt]の[pack_unit_p.qty]を[columnRslt_pack_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_stk_amt_p_PPanel;
	public MCColumnConfig columnRslt_stk_amt;// [Rslt]の[stk_amt_p.amt]を[columnRslt_stk_amt]としてエイリアス定義。
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Currency unit number of decimal places 通貨単位小数有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_dec_place = null;
	/**
	 * Transfer request date 振替依頼日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dt = null;
	/**
	 * Scheduled transfer date 振替予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_schd_dt = null;
	/**
	 * Transfer order date 振替指図日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_inst_dt = null;
	/**
	 * Actual transfer date 振替実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_dt = null;
	/**
	 * Actual transfer time 振替実績時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_hm = null;
	/**
	 * Transfer recording date 振替計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd_none_flg = null;
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
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rsn_nm = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Rslt_bd_p_PPanel;
	public MCColumnConfig columnRslt_bd_dpt_cd;// [Rslt]の[bd_p.bd_dpt_cd]を[columnRslt_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_dpt_nm;// [Rslt]の[bd_p.bd_dpt_nm]を[columnRslt_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_cd;// [Rslt]の[bd_p.bd_itm_cd]を[columnRslt_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub1;// [Rslt]の[bd_p.bd_itm_sub1]を[columnRslt_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub2;// [Rslt]の[bd_p.bd_itm_sub2]を[columnRslt_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub3;// [Rslt]の[bd_p.bd_itm_sub3]を[columnRslt_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_nm;// [Rslt]の[bd_p.bd_itm_nm]を[columnRslt_bd_itm_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_lot_no;// [Rslt]の[bd_p.bd_lot_no]を[columnRslt_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sublot_no;// [Rslt]の[bd_p.bd_sublot_no]を[columnRslt_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno1;// [Rslt]の[bd_p.bd_sno1]を[columnRslt_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno2;// [Rslt]の[bd_p.bd_sno2]を[columnRslt_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno3;// [Rslt]の[bd_p.bd_sno3]を[columnRslt_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno4;// [Rslt]の[bd_p.bd_sno4]を[columnRslt_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_cd;// [Rslt]の[bd_p.bd_bp_cd]を[columnRslt_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_nm;// [Rslt]の[bd_p.bd_bp_nm]を[columnRslt_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_cd;// [Rslt]の[bd_p.bd_loc_cd]を[columnRslt_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_nm;// [Rslt]の[bd_p.bd_loc_nm]を[columnRslt_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_cd;// [Rslt]の[bd_p.bd_ctg_cd]を[columnRslt_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_nm;// [Rslt]の[bd_p.bd_ctg_nm]を[columnRslt_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_cd;// [Rslt]の[bd_p.bd_oper_cd]を[columnRslt_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_nm;// [Rslt]の[bd_p.bd_oper_nm]を[columnRslt_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_iv_no;// [Rslt]の[bd_p.bd_iv_no]を[columnRslt_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_slo_no;// [Rslt]の[bd_p.bd_slo_no]を[columnRslt_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_po_no;// [Rslt]の[bd_p.bd_po_no]を[columnRslt_bd_po_no]としてエイリアス定義。
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_usr_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_dpt_nm = null;
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
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_usr_cd = null;
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_usr_nm = null;
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_dpt_cd = null;
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_dpt_nm = null;
	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_typ = null;
	/**
	 * Order type name 指図区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_typ_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ_nm = null;
	/**
	 * Other accounting transfer schedule No. 他勘定振替予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_schd_no = null;
	/**
	 * Schedule rev. number 予定改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_schd_rev = null;
	/**
	 * Other accounting transfer order No. 他勘定振替指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_inst_no = null;
	/**
	 * Other accounting transfer order details No. 他勘定振替指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_inst_d_no = null;
	/**
	 * Other accounting transfer result No. 他勘定振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_no = null;
	/**
	 * Other accounting transfer result details No. 他勘定振替実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_d_no = null;
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wms_flg = null;
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
	 * External other accounting transfer result No. 外部他勘定振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_acxfr_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acxfr_act_rev = null;
	/**
	 * Disposal application No. 廃棄申請ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dspsl_no = null;
	/**
	 * Transfer slip No. 振替伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_flg = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_aprv_sts_typ_nm = null;
	/**
	 * Transaction details remarks (Schedule) 取引明細備考（予定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_trd_d_rmrks = null;
	/**
	 * Disposal request remarks (schedule) 廃棄申請備考（予定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_dspsl_rmrks = null;
	/**
	 * Spare 1 (Schedule) 予備１（予定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char1 = null;
	/**
	 * Spare 2 (Schedule) 予備２（予定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char2 = null;
	/**
	 * Spare 3 (Schedule) 予備３（予定）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char3 = null;
	/**
	 * Internal remarks (Order header) 内部備考（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_intr_rmrks = null;
	/**
	 * Transaction remarks (Order header) 取引備考（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_trd_rmrks = null;
	/**
	 * Order remarks (Order header) 指図備考（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_rmrks = null;
	/**
	 * Spare 1 (Order header) 予備１（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_sub_char1 = null;
	/**
	 * Spare 2 (Order header) 予備２（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_sub_char2 = null;
	/**
	 * Spare 3 (Order header) 予備３（指図ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_sub_char3 = null;
	/**
	 * Internal details remarks (Order details) 内部明細備考（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_intr_d_rmrks = null;
	/**
	 * Transaction details remarks (Order details) 取引明細備考（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_trd_d_rmrks = null;
	/**
	 * Order details remarks (Details) 指図明細備考（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_rmrks = null;
	/**
	 * Spare 1 (Order details) 予備１（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_sub_char1 = null;
	/**
	 * Spare 2 (Order details) 予備２（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_sub_char2 = null;
	/**
	 * Spare 3 (Order details) 予備３（指図明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_d_sub_char3 = null;
	/**
	 * Internal remarks (Result header) 内部備考（実績ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_rmrks = null;
	/**
	 * Transaction remarks (Result header) 取引備考（実績ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_trd_rmrks = null;
	/**
	 * Spare 1 (Result header) 予備１（実績ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char1 = null;
	/**
	 * Spare 2 (Result header) 予備２（実績ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char2 = null;
	/**
	 * Spare 3 (Result header) 予備３（実績ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char3 = null;
	/**
	 * Internal details remarks (Result details) 内部明細備考（実績明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_d_rmrks = null;
	/**
	 * Transaction details remarks (Result details) 取引明細備考（実績明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_trd_d_rmrks = null;
	/**
	 * Spare 1 (Result details) 予備１（実績明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char1 = null;
	/**
	 * Spare 2 (Result details) 予備２（実績明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char2 = null;
	/**
	 * Spare 3 (Result details) 予備３（実績明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char3 = null;
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
	 * Other accounting transfer order 他勘定振替指図.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2410 = null;
	/**
	 * Other accounting transfer result 他勘定振替実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2420 = null;
	/**
	 * Transfer slip 振替伝票.<p>
	 *
	 */
	public MCButton Btn_prnt_acxfr = null;
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
	/** [SRCH_SCHD]モードを表す定数 */
	public static final String SRCH_SCHD = "SRCH_SCHD";
	/** [SRCH_INST]モードを表す定数 */
	public static final String SRCH_INST = "SRCH_INST";
	/** [SRCH_ACT]モードを表す定数 */
	public static final String SRCH_ACT = "SRCH_ACT";
	/** [PRNT_DSPSL]モードを表す定数 */
	public static final String PRNT_DSPSL = "PRNT_DSPSL";
	/** [PRNT_ACXFR]モードを表す定数 */
	public static final String PRNT_ACXFR = "PRNT_ACXFR";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SCHD, SRCH_INST, SRCH_ACT, PRNT_DSPSL, PRNT_ACXFR};
	
	/** [MS_MSBEL2430_Srch01]のCallerの作成 */
	protected MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch01Caller createMS_MSBEL2430_Srch01() {
		MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch01Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch01Bridge>
		caller = ((MSBEP_AcXfrSrch_MC)this).new MS_MSBEL2430_Srch01Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch01Bridge>(
					(MSBEP_AcXfrSrch)this, new MS_MSBEL2430_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2430_Srch01]の呼び出し */
	protected void callMS_MSBEL2430_Srch01() {
		MCCaller caller = createMS_MSBEL2430_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2430_Srch02]のCallerの作成 */
	protected MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch02Caller createMS_MSBEL2430_Srch02() {
		MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch02Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch02Bridge>
		caller = ((MSBEP_AcXfrSrch_MC)this).new MS_MSBEL2430_Srch02Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch02Bridge>(
					(MSBEP_AcXfrSrch)this, new MS_MSBEL2430_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL2430_Srch02]の呼び出し */
	protected void callMS_MSBEL2430_Srch02() {
		MCCaller caller = createMS_MSBEL2430_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL2430_Srch03]のCallerの作成 */
	protected MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch03Caller createMS_MSBEL2430_Srch03() {
		MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Srch03Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch03Bridge>
		caller = ((MSBEP_AcXfrSrch_MC)this).new MS_MSBEL2430_Srch03Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Srch03Bridge>(
					(MSBEP_AcXfrSrch)this, new MS_MSBEL2430_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBEL2430_Srch03]の呼び出し */
	protected void callMS_MSBEL2430_Srch03() {
		MCCaller caller = createMS_MSBEL2430_Srch03();
		caller.exec();
	}
	/** [MS_MSBEL2430_Prnt02]のCallerの作成 */
	protected MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Prnt02Caller createMS_MSBEL2430_Prnt02() {
		MSBEP_AcXfrSrch_MC.MS_MSBEL2430_Prnt02Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Prnt02Bridge>
		caller = ((MSBEP_AcXfrSrch_MC)this).new MS_MSBEL2430_Prnt02Caller<MSBEP_AcXfrSrch, MS_MSBEL2430_Prnt02Bridge>(
					(MSBEP_AcXfrSrch)this, new MS_MSBEL2430_Prnt02Bridge());
		return caller;
	}
	/** [MS_MSBEL2430_Prnt02]の呼び出し */
	protected void callMS_MSBEL2430_Prnt02() {
		MCCaller caller = createMS_MSBEL2430_Prnt02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2430.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2430.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2430.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2430.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2430.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2430.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2430.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2430.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2430.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2430.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2430.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(StsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
		ret.add(WmsTrgtPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_AcXfrSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_AcXfrSrch_MC_A(String name) {
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
		MSBEP_AcXfrSrch_MC.jbCreateScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateSts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateTop((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateFold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateTab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateTab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateWmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateCtrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateRPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateRslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbCreateBtn((MSBEP_AcXfrSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_AcXfrSrch p) {
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
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
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
		p.Cnd_acxfr_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().acxfr_act_dt_p());
		p.Cnd_acxfr_act_dt_p_PPanel.setName("Cnd.acxfr_act_dt_p");
		p.Cnd_acxfr_act_dt_fr = p.Cnd_acxfr_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_acxfr_act_dt_fr.addAliasName("Cnd.acxfr_act_dt_fr", p);
		p.Cnd_acxfr_act_hm_fr = p.Cnd_acxfr_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_acxfr_act_hm_fr.addAliasName("Cnd.acxfr_act_hm_fr", p);
		p.Cnd_acxfr_act_dt_to = p.Cnd_acxfr_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_acxfr_act_dt_to.addAliasName("Cnd.acxfr_act_dt_to", p);
		p.Cnd_acxfr_act_hm_to = p.Cnd_acxfr_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_acxfr_act_hm_to.addAliasName("Cnd.acxfr_act_hm_to", p);
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
	 * [WmsTrgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWmsTrgt(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_AcXfrSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_AcXfrSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_AcXfrSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$itm_p);
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
		p.Rslt_trd_schd_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$trd_schd_unit_p);
		p.Rslt_trd_schd_unit_p_PPanel.setName("Rslt.trd_schd_unit_p");
		p.columnRslt_trd_schd_unit_qty = p.Rslt_trd_schd_unit_p_PPanel.columnQty_qty;
		p.columnRslt_trd_schd_unit_qty.addAliasName("Rslt.trd_schd_unit_qty", p);
		p.Rslt_trd_inst_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$trd_inst_unit_p);
		p.Rslt_trd_inst_unit_p_PPanel.setName("Rslt.trd_inst_unit_p");
		p.columnRslt_trd_inst_unit_qty = p.Rslt_trd_inst_unit_p_PPanel.columnQty_qty;
		p.columnRslt_trd_inst_unit_qty.addAliasName("Rslt.trd_inst_unit_qty", p);
		p.Rslt_trd_act_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$trd_act_unit_p);
		p.Rslt_trd_act_unit_p_PPanel.setName("Rslt.trd_act_unit_p");
		p.columnRslt_trd_act_unit_qty = p.Rslt_trd_act_unit_p_PPanel.columnQty_qty;
		p.columnRslt_trd_act_unit_qty.addAliasName("Rslt.trd_act_unit_qty", p);
		p.Rslt_base_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$base_unit_p);
		p.Rslt_base_unit_p_PPanel.setName("Rslt.base_unit_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_pack_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$pack_unit_p);
		p.Rslt_pack_unit_p_PPanel.setName("Rslt.pack_unit_p");
		p.columnRslt_pack_unit_qty = p.Rslt_pack_unit_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_qty.addAliasName("Rslt.pack_unit_qty", p);
		p.Rslt_stk_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$stk_amt_p);
		p.Rslt_stk_amt_p_PPanel.setName("Rslt.stk_amt_p");
		p.columnRslt_stk_amt = p.Rslt_stk_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_stk_amt.addAliasName("Rslt.stk_amt", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$sno_wrk_no_p);
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
		p.Rslt_bd_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$bd_p);
		p.Rslt_bd_p_PPanel.setName("Rslt.bd_p");
		p.columnRslt_bd_dpt_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnRslt_bd_dpt_cd.addAliasName("Rslt.bd_dpt_cd", p);
		p.columnRslt_bd_dpt_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnRslt_bd_dpt_nm.addAliasName("Rslt.bd_dpt_nm", p);
		p.columnRslt_bd_itm_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnRslt_bd_itm_cd.addAliasName("Rslt.bd_itm_cd", p);
		p.columnRslt_bd_itm_sub1 = p.Rslt_bd_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnRslt_bd_itm_sub1.addAliasName("Rslt.bd_itm_sub1", p);
		p.columnRslt_bd_itm_sub2 = p.Rslt_bd_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnRslt_bd_itm_sub2.addAliasName("Rslt.bd_itm_sub2", p);
		p.columnRslt_bd_itm_sub3 = p.Rslt_bd_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnRslt_bd_itm_sub3.addAliasName("Rslt.bd_itm_sub3", p);
		p.columnRslt_bd_itm_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnRslt_bd_itm_nm.addAliasName("Rslt.bd_itm_nm", p);
		p.columnRslt_bd_lot_no = p.Rslt_bd_p_PPanel.columnBdItem_bd_lot_no;
		p.columnRslt_bd_lot_no.addAliasName("Rslt.bd_lot_no", p);
		p.columnRslt_bd_sublot_no = p.Rslt_bd_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnRslt_bd_sublot_no.addAliasName("Rslt.bd_sublot_no", p);
		p.columnRslt_bd_sno1 = p.Rslt_bd_p_PPanel.columnBdItem_bd_sno1;
		p.columnRslt_bd_sno1.addAliasName("Rslt.bd_sno1", p);
		p.columnRslt_bd_sno2 = p.Rslt_bd_p_PPanel.columnBdItem_bd_sno2;
		p.columnRslt_bd_sno2.addAliasName("Rslt.bd_sno2", p);
		p.columnRslt_bd_sno3 = p.Rslt_bd_p_PPanel.columnBdItem_bd_sno3;
		p.columnRslt_bd_sno3.addAliasName("Rslt.bd_sno3", p);
		p.columnRslt_bd_sno4 = p.Rslt_bd_p_PPanel.columnBdItem_bd_sno4;
		p.columnRslt_bd_sno4.addAliasName("Rslt.bd_sno4", p);
		p.columnRslt_bd_bp_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnRslt_bd_bp_cd.addAliasName("Rslt.bd_bp_cd", p);
		p.columnRslt_bd_bp_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnRslt_bd_bp_nm.addAliasName("Rslt.bd_bp_nm", p);
		p.columnRslt_bd_loc_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnRslt_bd_loc_cd.addAliasName("Rslt.bd_loc_cd", p);
		p.columnRslt_bd_loc_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnRslt_bd_loc_nm.addAliasName("Rslt.bd_loc_nm", p);
		p.columnRslt_bd_ctg_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnRslt_bd_ctg_cd.addAliasName("Rslt.bd_ctg_cd", p);
		p.columnRslt_bd_ctg_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnRslt_bd_ctg_nm.addAliasName("Rslt.bd_ctg_nm", p);
		p.columnRslt_bd_oper_cd = p.Rslt_bd_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnRslt_bd_oper_cd.addAliasName("Rslt.bd_oper_cd", p);
		p.columnRslt_bd_oper_nm = p.Rslt_bd_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnRslt_bd_oper_nm.addAliasName("Rslt.bd_oper_nm", p);
		p.columnRslt_bd_iv_no = p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no;
		p.columnRslt_bd_iv_no.addAliasName("Rslt.bd_iv_no", p);
		p.columnRslt_bd_slo_no = p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no;
		p.columnRslt_bd_slo_no.addAliasName("Rslt.bd_slo_no", p);
		p.columnRslt_bd_po_no = p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no;
		p.columnRslt_bd_po_no.addAliasName("Rslt.bd_po_no", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP2430.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_AcXfrSrch p) {
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

	
	/** [Cnd_trd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cd_p = null;

	/**
	 * [Cnd_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cd_ListPutter() {
		if (Cnd_trd_cd_p == null) {
			Cnd_trd_cd_p = createCnd_trd_cd_ListPutter(Cnd_trd_cd, "trd_cd", "trd_nm");

		}
		return Cnd_trd_cd_p;
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
	
	
	/** [Cnd_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bd_dpt_cd_p = null;

	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bd_dpt_cd_ListPutter() {
		if (Cnd_bd_dpt_cd_p == null) {
			Cnd_bd_dpt_cd_p = createCnd_bd_dpt_cd_ListPutter(Cnd_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Cnd_bd_dpt_cd_p;
	}
	
	
	/** [Cnd_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rsn_cd_p = null;

	/**
	 * [Cnd_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rsn_cd_ListPutter() {
		if (Cnd_rsn_cd_p == null) {
			Cnd_rsn_cd_p = createCnd_rsn_cd_ListPutter(Cnd_rsn_cd, "rsn_cd", "rsn_nm");

		}
		return Cnd_rsn_cd_p;
	}
	
	
	/** [Cnd_rqst_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_usr_cd_p = null;

	/**
	 * [Cnd_rqst_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_usr_cd_ListPutter() {
		if (Cnd_rqst_usr_cd_p == null) {
			Cnd_rqst_usr_cd_p = createCnd_rqst_usr_cd_ListPutter(Cnd_rqst_usr_cd, "rqst_usr_cd", "rqst_usr_nm");

		}
		return Cnd_rqst_usr_cd_p;
	}
	
	
	/** [Cnd_rqst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_dpt_cd_p = null;

	/**
	 * [Cnd_rqst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_dpt_cd_ListPutter() {
		if (Cnd_rqst_dpt_cd_p == null) {
			Cnd_rqst_dpt_cd_p = createCnd_rqst_dpt_cd_ListPutter(Cnd_rqst_dpt_cd, "rqst_dpt_cd", "rqst_dpt_nm");

		}
		return Cnd_rqst_dpt_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AcXfrSrch create(){
		MSBEP_AcXfrSrch p = new MSBEP_AcXfrSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_AcXfrSrch create(String name){
		MSBEP_AcXfrSrch p = new MSBEP_AcXfrSrch(name);
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
		MSBEP_AcXfrSrch_MC.jbfInitScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitSts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitTop((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitFold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitTab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitTab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitWmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitCtrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitRPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitRslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbfInitBtn((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitSts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitTop((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitFold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitTab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitTab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitWmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitCtrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitRPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitRslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.jbInitBtn((MSBEP_AcXfrSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_AcXfrSrch p) {
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
	protected static void jbfInitTab1(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_REF2 = p.beansFactory.createRadioButton("Cnd.ope_REF2");
		p.Cnd_ope_REF3 = p.beansFactory.createRadioButton("Cnd.ope_REF3");
		p.Cnd_ope_PRNT_ACXFR = p.beansFactory.createRadioButton("Cnd.ope_PRNT_ACXFR");
		p.Cnd_not_inst_flg = p.beansFactory.createCheckBox("Cnd.not_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_part_comp_flg = p.beansFactory.createCheckBox("Cnd.part_comp_flg");
		p.Cnd_comp_flg = p.beansFactory.createCheckBox("Cnd.comp_flg");
		p.Cnd_wms_flg = p.beansFactory.createCheckBox("Cnd.wms_flg");
		p.Cnd_not_wms_flg = p.beansFactory.createCheckBox("Cnd.not_wms_flg");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_trd_ptn_typ_Label = p.beansFactory.createLabel("Cnd.trd_ptn_typ_Label");
		p.Cnd_trd_ptn_typ = p.beansFactory.createTextField("Cnd.trd_ptn_typ");
		p.Cnd_trd_ptn_typ.setLabel(p.Cnd_trd_ptn_typ_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_acxfr_schd_no_Label = p.beansFactory.createLabel("Cnd.acxfr_schd_no_Label");
		p.Cnd_acxfr_schd_no = p.beansFactory.createTextField("Cnd.acxfr_schd_no");
		p.Cnd_acxfr_schd_no.setLabel(p.Cnd_acxfr_schd_no_Label);
		p.Cnd_acxfr_inst_no_Label = p.beansFactory.createLabel("Cnd.acxfr_inst_no_Label");
		p.Cnd_acxfr_inst_no = p.beansFactory.createTextField("Cnd.acxfr_inst_no");
		p.Cnd_acxfr_inst_no.setLabel(p.Cnd_acxfr_inst_no_Label);
		p.Cnd_acxfr_inst_d_no_Label = p.beansFactory.createLabel("Cnd.acxfr_inst_d_no_Label");
		p.Cnd_acxfr_inst_d_no = p.beansFactory.createTextField("Cnd.acxfr_inst_d_no");
		p.Cnd_acxfr_inst_d_no.setLabel(p.Cnd_acxfr_inst_d_no_Label);
		p.Cnd_acxfr_act_no_Label = p.beansFactory.createLabel("Cnd.acxfr_act_no_Label");
		p.Cnd_acxfr_act_no = p.beansFactory.createTextField("Cnd.acxfr_act_no");
		p.Cnd_acxfr_act_no.setLabel(p.Cnd_acxfr_act_no_Label);
		p.Cnd_acxfr_act_d_no_Label = p.beansFactory.createLabel("Cnd.acxfr_act_d_no_Label");
		p.Cnd_acxfr_act_d_no = p.beansFactory.createTextField("Cnd.acxfr_act_d_no");
		p.Cnd_acxfr_act_d_no.setLabel(p.Cnd_acxfr_act_d_no_Label);
		p.Cnd_ext_acxfr_act_no_Label = p.beansFactory.createLabel("Cnd.ext_acxfr_act_no_Label");
		p.Cnd_ext_acxfr_act_no = p.beansFactory.createTextField("Cnd.ext_acxfr_act_no");
		p.Cnd_ext_acxfr_act_no.setLabel(p.Cnd_ext_acxfr_act_no_Label);
		p.Cnd_abort_flg = p.beansFactory.createCheckBox("Cnd.abort_flg");
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
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
		p.Cnd_bd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bd_dpt_cd_Label");
		p.Cnd_bd_dpt_cd = p.beansFactory.createTextField("Cnd.bd_dpt_cd");
		p.Cnd_bd_dpt_cd.setLabel(p.Cnd_bd_dpt_cd_Label);
		p.Cnd_bd_dpt_nm = p.beansFactory.createTextField("Cnd.bd_dpt_nm");
		p.Cnd_rqst_dt_fr_Label = p.beansFactory.createLabel("Cnd.rqst_dt_fr_Label");
		p.Cnd_rqst_dt_fr = p.beansFactory.createDateField("Cnd.rqst_dt_fr");
		p.Cnd_rqst_dt_fr.setLabel(p.Cnd_rqst_dt_fr_Label);
		p.Cnd_rqst_dt_to_Label = p.beansFactory.createLabel("Cnd.rqst_dt_to_Label");
		p.Cnd_rqst_dt_to = p.beansFactory.createDateField("Cnd.rqst_dt_to");
		p.Cnd_rqst_dt_to.setLabel(p.Cnd_rqst_dt_to_Label);
		p.Cnd_acxfr_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.acxfr_schd_dt_fr_Label");
		p.Cnd_acxfr_schd_dt_fr = p.beansFactory.createDateField("Cnd.acxfr_schd_dt_fr");
		p.Cnd_acxfr_schd_dt_fr.setLabel(p.Cnd_acxfr_schd_dt_fr_Label);
		p.Cnd_acxfr_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.acxfr_schd_dt_to_Label");
		p.Cnd_acxfr_schd_dt_to = p.beansFactory.createDateField("Cnd.acxfr_schd_dt_to");
		p.Cnd_acxfr_schd_dt_to.setLabel(p.Cnd_acxfr_schd_dt_to_Label);
		p.Cnd_acxfr_inst_dt_fr_Label = p.beansFactory.createLabel("Cnd.acxfr_inst_dt_fr_Label");
		p.Cnd_acxfr_inst_dt_fr = p.beansFactory.createDateField("Cnd.acxfr_inst_dt_fr");
		p.Cnd_acxfr_inst_dt_fr.setLabel(p.Cnd_acxfr_inst_dt_fr_Label);
		p.Cnd_acxfr_inst_dt_to_Label = p.beansFactory.createLabel("Cnd.acxfr_inst_dt_to_Label");
		p.Cnd_acxfr_inst_dt_to = p.beansFactory.createDateField("Cnd.acxfr_inst_dt_to");
		p.Cnd_acxfr_inst_dt_to.setLabel(p.Cnd_acxfr_inst_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_rsn_cd_Label = p.beansFactory.createLabel("Cnd.rsn_cd_Label");
		p.Cnd_rsn_cd = p.beansFactory.createTextComboBox("Cnd.rsn_cd");
		p.Cnd_rsn_cd.setLabel(p.Cnd_rsn_cd_Label);
		p.Cnd_rsn_nm = p.beansFactory.createTextField("Cnd.rsn_nm");
		p.Cnd_dspsl_no_Label = p.beansFactory.createLabel("Cnd.dspsl_no_Label");
		p.Cnd_dspsl_no = p.beansFactory.createTextField("Cnd.dspsl_no");
		p.Cnd_dspsl_no.setLabel(p.Cnd_dspsl_no_Label);
		p.Cnd_schd_no_aprv_flg = p.beansFactory.createCheckBox("Cnd.schd_no_aprv_flg");
		p.Cnd_rqst_usr_cd_Label = p.beansFactory.createLabel("Cnd.rqst_usr_cd_Label");
		p.Cnd_rqst_usr_cd = p.beansFactory.createTextField("Cnd.rqst_usr_cd");
		p.Cnd_rqst_usr_cd.setLabel(p.Cnd_rqst_usr_cd_Label);
		p.Cnd_rqst_usr_nm = p.beansFactory.createTextField("Cnd.rqst_usr_nm");
		p.Cnd_rqst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rqst_dpt_cd_Label");
		p.Cnd_rqst_dpt_cd = p.beansFactory.createTextField("Cnd.rqst_dpt_cd");
		p.Cnd_rqst_dpt_cd.setLabel(p.Cnd_rqst_dpt_cd_Label);
		p.Cnd_rqst_dpt_nm = p.beansFactory.createTextField("Cnd.rqst_dpt_nm");
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
		p.Cnd_act_dpt_cd = p.beansFactory.createTextField("Cnd.act_dpt_cd");
		p.Cnd_act_dpt_cd.setLabel(p.Cnd_act_dpt_cd_Label);
		p.Cnd_act_dpt_nm = p.beansFactory.createTextField("Cnd.act_dpt_nm");
		p.Cnd_schd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_trd_d_rmrks_Label");
		p.Cnd_schd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.schd_trd_d_rmrks");
		p.Cnd_schd_trd_d_rmrks.setLabel(p.Cnd_schd_trd_d_rmrks_Label);
		p.Cnd_schd_dspsl_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_dspsl_rmrks_Label");
		p.Cnd_schd_dspsl_rmrks = p.beansFactory.createTextField("Cnd.schd_dspsl_rmrks");
		p.Cnd_schd_dspsl_rmrks.setLabel(p.Cnd_schd_dspsl_rmrks_Label);
		p.Cnd_schd_sub_char1_Label = p.beansFactory.createLabel("Cnd.schd_sub_char1_Label");
		p.Cnd_schd_sub_char1 = p.beansFactory.createTextField("Cnd.schd_sub_char1");
		p.Cnd_schd_sub_char1.setLabel(p.Cnd_schd_sub_char1_Label);
		p.Cnd_schd_sub_char2_Label = p.beansFactory.createLabel("Cnd.schd_sub_char2_Label");
		p.Cnd_schd_sub_char2 = p.beansFactory.createTextField("Cnd.schd_sub_char2");
		p.Cnd_schd_sub_char2.setLabel(p.Cnd_schd_sub_char2_Label);
		p.Cnd_schd_sub_char3_Label = p.beansFactory.createLabel("Cnd.schd_sub_char3_Label");
		p.Cnd_schd_sub_char3 = p.beansFactory.createTextField("Cnd.schd_sub_char3");
		p.Cnd_schd_sub_char3.setLabel(p.Cnd_schd_sub_char3_Label);
		p.Cnd_inst_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_intr_rmrks_Label");
		p.Cnd_inst_intr_rmrks = p.beansFactory.createTextField("Cnd.inst_intr_rmrks");
		p.Cnd_inst_intr_rmrks.setLabel(p.Cnd_inst_intr_rmrks_Label);
		p.Cnd_inst_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_trd_rmrks_Label");
		p.Cnd_inst_trd_rmrks = p.beansFactory.createTextField("Cnd.inst_trd_rmrks");
		p.Cnd_inst_trd_rmrks.setLabel(p.Cnd_inst_trd_rmrks_Label);
		p.Cnd_inst_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_rmrks_Label");
		p.Cnd_inst_rmrks = p.beansFactory.createTextField("Cnd.inst_rmrks");
		p.Cnd_inst_rmrks.setLabel(p.Cnd_inst_rmrks_Label);
		p.Cnd_inst_sub_char1_Label = p.beansFactory.createLabel("Cnd.inst_sub_char1_Label");
		p.Cnd_inst_sub_char1 = p.beansFactory.createTextField("Cnd.inst_sub_char1");
		p.Cnd_inst_sub_char1.setLabel(p.Cnd_inst_sub_char1_Label);
		p.Cnd_inst_sub_char2_Label = p.beansFactory.createLabel("Cnd.inst_sub_char2_Label");
		p.Cnd_inst_sub_char2 = p.beansFactory.createTextField("Cnd.inst_sub_char2");
		p.Cnd_inst_sub_char2.setLabel(p.Cnd_inst_sub_char2_Label);
		p.Cnd_inst_sub_char3_Label = p.beansFactory.createLabel("Cnd.inst_sub_char3_Label");
		p.Cnd_inst_sub_char3 = p.beansFactory.createTextField("Cnd.inst_sub_char3");
		p.Cnd_inst_sub_char3.setLabel(p.Cnd_inst_sub_char3_Label);
		p.Cnd_inst_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_intr_d_rmrks_Label");
		p.Cnd_inst_intr_d_rmrks = p.beansFactory.createTextField("Cnd.inst_intr_d_rmrks");
		p.Cnd_inst_intr_d_rmrks.setLabel(p.Cnd_inst_intr_d_rmrks_Label);
		p.Cnd_inst_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_trd_d_rmrks_Label");
		p.Cnd_inst_trd_d_rmrks = p.beansFactory.createTextField("Cnd.inst_trd_d_rmrks");
		p.Cnd_inst_trd_d_rmrks.setLabel(p.Cnd_inst_trd_d_rmrks_Label);
		p.Cnd_inst_d_rmrks_Label = p.beansFactory.createLabel("Cnd.inst_d_rmrks_Label");
		p.Cnd_inst_d_rmrks = p.beansFactory.createTextField("Cnd.inst_d_rmrks");
		p.Cnd_inst_d_rmrks.setLabel(p.Cnd_inst_d_rmrks_Label);
		p.Cnd_inst_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.inst_d_sub_char1_Label");
		p.Cnd_inst_d_sub_char1 = p.beansFactory.createTextField("Cnd.inst_d_sub_char1");
		p.Cnd_inst_d_sub_char1.setLabel(p.Cnd_inst_d_sub_char1_Label);
		p.Cnd_inst_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.inst_d_sub_char2_Label");
		p.Cnd_inst_d_sub_char2 = p.beansFactory.createTextField("Cnd.inst_d_sub_char2");
		p.Cnd_inst_d_sub_char2.setLabel(p.Cnd_inst_d_sub_char2_Label);
		p.Cnd_inst_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.inst_d_sub_char3_Label");
		p.Cnd_inst_d_sub_char3 = p.beansFactory.createTextField("Cnd.inst_d_sub_char3");
		p.Cnd_inst_d_sub_char3.setLabel(p.Cnd_inst_d_sub_char3_Label);
		p.Cnd_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_rmrks_Label");
		p.Cnd_act_intr_rmrks = p.beansFactory.createTextField("Cnd.act_intr_rmrks");
		p.Cnd_act_intr_rmrks.setLabel(p.Cnd_act_intr_rmrks_Label);
		p.Cnd_act_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.act_trd_rmrks_Label");
		p.Cnd_act_trd_rmrks = p.beansFactory.createTextField("Cnd.act_trd_rmrks");
		p.Cnd_act_trd_rmrks.setLabel(p.Cnd_act_trd_rmrks_Label);
		p.Cnd_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_sub_char1_Label");
		p.Cnd_act_sub_char1 = p.beansFactory.createTextField("Cnd.act_sub_char1");
		p.Cnd_act_sub_char1.setLabel(p.Cnd_act_sub_char1_Label);
		p.Cnd_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_sub_char2_Label");
		p.Cnd_act_sub_char2 = p.beansFactory.createTextField("Cnd.act_sub_char2");
		p.Cnd_act_sub_char2.setLabel(p.Cnd_act_sub_char2_Label);
		p.Cnd_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_sub_char3_Label");
		p.Cnd_act_sub_char3 = p.beansFactory.createTextField("Cnd.act_sub_char3");
		p.Cnd_act_sub_char3.setLabel(p.Cnd_act_sub_char3_Label);
		p.Cnd_act_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_d_rmrks_Label");
		p.Cnd_act_intr_d_rmrks = p.beansFactory.createTextField("Cnd.act_intr_d_rmrks");
		p.Cnd_act_intr_d_rmrks.setLabel(p.Cnd_act_intr_d_rmrks_Label);
		p.Cnd_act_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.act_trd_d_rmrks_Label");
		p.Cnd_act_trd_d_rmrks = p.beansFactory.createTextField("Cnd.act_trd_d_rmrks");
		p.Cnd_act_trd_d_rmrks.setLabel(p.Cnd_act_trd_d_rmrks_Label);
		p.Cnd_act_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char1_Label");
		p.Cnd_act_d_sub_char1 = p.beansFactory.createTextField("Cnd.act_d_sub_char1");
		p.Cnd_act_d_sub_char1.setLabel(p.Cnd_act_d_sub_char1_Label);
		p.Cnd_act_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char2_Label");
		p.Cnd_act_d_sub_char2 = p.beansFactory.createTextField("Cnd.act_d_sub_char2");
		p.Cnd_act_d_sub_char2.setLabel(p.Cnd_act_d_sub_char2_Label);
		p.Cnd_act_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char3_Label");
		p.Cnd_act_d_sub_char3 = p.beansFactory.createTextField("Cnd.act_d_sub_char3");
		p.Cnd_act_d_sub_char3.setLabel(p.Cnd_act_d_sub_char3_Label);
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWmsTrgt(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel = p.beansFactory.createPanel("WmsTrgt");
		p.WmsTrgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_ver_no = p.beansFactory.createTableColumn("Rslt.ver_no", MCColumnType.TEXT);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_unit_dec_place = p.beansFactory.createTableColumn("Rslt.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_dec_place", MCColumnType.NUMBER);
		p.columnRslt_rqst_dt = p.beansFactory.createTableColumn("Rslt.rqst_dt", MCColumnType.DATE);
		p.columnRslt_acxfr_schd_dt = p.beansFactory.createTableColumn("Rslt.acxfr_schd_dt", MCColumnType.DATE);
		p.columnRslt_acxfr_inst_dt = p.beansFactory.createTableColumn("Rslt.acxfr_inst_dt", MCColumnType.DATE);
		p.columnRslt_acxfr_act_dt = p.beansFactory.createTableColumn("Rslt.acxfr_act_dt", MCColumnType.DATE);
		p.columnRslt_acxfr_act_hm = p.beansFactory.createTableColumn("Rslt.acxfr_act_hm", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_fix_no_typ = p.beansFactory.createTableColumn("Rslt.fix_no_typ", MCColumnType.TEXT);
		p.columnRslt_fix_no_typ_nm = p.beansFactory.createTableColumn("Rslt.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnRslt_fix_no = p.beansFactory.createTableColumn("Rslt.fix_no", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_rsn_cd = p.beansFactory.createTableColumn("Rslt.rsn_cd", MCColumnType.TEXT);
		p.columnRslt_rsn_nm = p.beansFactory.createTableColumn("Rslt.rsn_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_cd = p.beansFactory.createTableColumn("Rslt.rqst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_usr_nm = p.beansFactory.createTableColumn("Rslt.rqst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_cd = p.beansFactory.createTableColumn("Rslt.rqst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_dpt_nm = p.beansFactory.createTableColumn("Rslt.rqst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_inst_usr_cd = p.beansFactory.createTableColumn("Rslt.inst_usr_cd", MCColumnType.TEXT);
		p.columnRslt_inst_usr_nm = p.beansFactory.createTableColumn("Rslt.inst_usr_nm", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_cd = p.beansFactory.createTableColumn("Rslt.inst_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_inst_dpt_nm = p.beansFactory.createTableColumn("Rslt.inst_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_act_usr_cd = p.beansFactory.createTableColumn("Rslt.act_usr_cd", MCColumnType.TEXT);
		p.columnRslt_act_usr_nm = p.beansFactory.createTableColumn("Rslt.act_usr_nm", MCColumnType.TEXT);
		p.columnRslt_act_dpt_cd = p.beansFactory.createTableColumn("Rslt.act_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_act_dpt_nm = p.beansFactory.createTableColumn("Rslt.act_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_inst_typ = p.beansFactory.createTableColumn("Rslt.inst_typ", MCColumnType.TEXT);
		p.columnRslt_inst_typ_nm = p.beansFactory.createTableColumn("Rslt.inst_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ_nm = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRslt_acxfr_schd_no = p.beansFactory.createTableColumn("Rslt.acxfr_schd_no", MCColumnType.TEXT);
		p.columnRslt_acxfr_schd_rev = p.beansFactory.createTableColumn("Rslt.acxfr_schd_rev", MCColumnType.NUMBER);
		p.columnRslt_acxfr_inst_no = p.beansFactory.createTableColumn("Rslt.acxfr_inst_no", MCColumnType.TEXT);
		p.columnRslt_acxfr_inst_d_no = p.beansFactory.createTableColumn("Rslt.acxfr_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_acxfr_act_no = p.beansFactory.createTableColumn("Rslt.acxfr_act_no", MCColumnType.TEXT);
		p.columnRslt_acxfr_act_d_no = p.beansFactory.createTableColumn("Rslt.acxfr_act_d_no", MCColumnType.TEXT);
		p.columnRslt_wms_flg = p.beansFactory.createTableColumn("Rslt.wms_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_acxfr_act_no = p.beansFactory.createTableColumn("Rslt.ext_acxfr_act_no", MCColumnType.TEXT);
		p.columnRslt_acxfr_act_rev = p.beansFactory.createTableColumn("Rslt.acxfr_act_rev", MCColumnType.NUMBER);
		p.columnRslt_dspsl_no = p.beansFactory.createTableColumn("Rslt.dspsl_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_aprv_flg = p.beansFactory.createTableColumn("Rslt.aprv_flg", MCColumnType.CHECK);
		p.columnRslt_aprv_no = p.beansFactory.createTableColumn("Rslt.aprv_no", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_schd_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.schd_trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_dspsl_rmrks = p.beansFactory.createTableColumn("Rslt.schd_dspsl_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_inst_intr_rmrks = p.beansFactory.createTableColumn("Rslt.inst_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_trd_rmrks = p.beansFactory.createTableColumn("Rslt.inst_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_rmrks = p.beansFactory.createTableColumn("Rslt.inst_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_sub_char1 = p.beansFactory.createTableColumn("Rslt.inst_sub_char1", MCColumnType.TEXT);
		p.columnRslt_inst_sub_char2 = p.beansFactory.createTableColumn("Rslt.inst_sub_char2", MCColumnType.TEXT);
		p.columnRslt_inst_sub_char3 = p.beansFactory.createTableColumn("Rslt.inst_sub_char3", MCColumnType.TEXT);
		p.columnRslt_inst_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.inst_intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.inst_trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_d_rmrks = p.beansFactory.createTableColumn("Rslt.inst_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_inst_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.inst_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_inst_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.inst_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_inst_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.inst_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_trd_rmrks = p.beansFactory.createTableColumn("Rslt.act_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.act_trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2410 = p.beansFactory.createButton("Btn.open_MSBEP2410", "open");
		p.Btn_open_MSBEP2420 = p.beansFactory.createButton("Btn.open_MSBEP2420", "open");
		p.Btn_prnt_acxfr = p.beansFactory.createButton("Btn.prnt_acxfr", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.StsPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.TopPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_AcXfrSrch p) {
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
	protected static void jbInitTab1(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.WmsTrgtPanel, null);
		p.Tab1Panel.setLastBeans(p.WmsTrgtPanel);
		p.WmsTrgtPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ItmCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_REF2);
		p.Cnd_ope_REF2.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF2);
		p.ScreenOpePanel.add(p.Cnd_ope_REF2);
		p.Cnd_ope_REF2.setNextBeans(p.Cnd_ope_REF3);
		p.Cnd_ope_REF3.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF3);
		p.ScreenOpePanel.add(p.Cnd_ope_REF3);
		p.Cnd_ope_REF3.setNextBeans(p.Cnd_ope_PRNT_ACXFR);
		p.Cnd_ope_PRNT_ACXFR.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT_ACXFR);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT_ACXFR);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.ope_META);
		p.StsPanel.add(p.Cnd_not_inst_flg);
		p.StsPanel.setLastBeans(p.Cnd_not_inst_flg);
		p.Cnd_not_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_not_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.not_inst_flg_META);
		p.StsPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_part_comp_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_flg_META);
		p.StsPanel.add(p.Cnd_part_comp_flg);
		p.Cnd_part_comp_flg.setNextBeans(p.Cnd_comp_flg);
		p.Cnd_part_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.part_comp_flg_META);
		p.StsPanel.add(p.Cnd_comp_flg);
		p.Cnd_comp_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.comp_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_wms_flg);
		p.WmsTrgtPanel.setLastBeans(p.Cnd_wms_flg);
		p.Cnd_wms_flg.setNextBeans(p.Cnd_not_wms_flg);
		p.Cnd_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.wms_flg_META);
		p.WmsTrgtPanel.add(p.Cnd_not_wms_flg);
		p.Cnd_not_wms_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.not_wms_flg_META);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.CndPanel.setLastBeans(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_trd_ptn_typ);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_trd_ptn_typ_Label);
		p.CndPanel.add(p.Cnd_trd_ptn_typ);
		p.Cnd_trd_ptn_typ.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_trd_ptn_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.trd_ptn_typ_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_acxfr_schd_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_acxfr_schd_no_Label);
		p.CndPanel.add(p.Cnd_acxfr_schd_no);
		p.Cnd_acxfr_schd_no.setNextBeans(p.Cnd_acxfr_inst_no);
		p.Cnd_acxfr_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_schd_no_META);
		p.setPluralValueEnable(p.Cnd_acxfr_schd_no, true);
		p.CndPanel.add(p.Cnd_acxfr_inst_no_Label);
		p.CndPanel.add(p.Cnd_acxfr_inst_no);
		p.Cnd_acxfr_inst_no.setNextBeans(p.Cnd_acxfr_inst_d_no);
		p.Cnd_acxfr_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_inst_no_META);
		p.setPluralValueEnable(p.Cnd_acxfr_inst_no, true);
		p.CndPanel.add(p.Cnd_acxfr_inst_d_no_Label);
		p.CndPanel.add(p.Cnd_acxfr_inst_d_no);
		p.Cnd_acxfr_inst_d_no.setNextBeans(p.Cnd_acxfr_act_no);
		p.Cnd_acxfr_inst_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_inst_d_no_META);
		p.setPluralValueEnable(p.Cnd_acxfr_inst_d_no, true);
		p.CndPanel.add(p.Cnd_acxfr_act_no_Label);
		p.CndPanel.add(p.Cnd_acxfr_act_no);
		p.Cnd_acxfr_act_no.setNextBeans(p.Cnd_acxfr_act_d_no);
		p.Cnd_acxfr_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_act_no_META);
		p.setPluralValueEnable(p.Cnd_acxfr_act_no, true);
		p.CndPanel.add(p.Cnd_acxfr_act_d_no_Label);
		p.CndPanel.add(p.Cnd_acxfr_act_d_no);
		p.Cnd_acxfr_act_d_no.setNextBeans(p.Cnd_ext_acxfr_act_no);
		p.Cnd_acxfr_act_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_acxfr_act_d_no, true);
		p.CndPanel.add(p.Cnd_ext_acxfr_act_no_Label);
		p.CndPanel.add(p.Cnd_ext_acxfr_act_no);
		p.Cnd_ext_acxfr_act_no.setNextBeans(p.Cnd_abort_flg);
		p.Cnd_ext_acxfr_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.ext_acxfr_act_no_META);
		p.setPluralValueEnable(p.Cnd_ext_acxfr_act_no, true);
		p.CndPanel.add(p.Cnd_abort_flg);
		p.Cnd_abort_flg.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_abort_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.abort_flg_META);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_loc_grp_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_bd_dpt_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_bd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bd_dpt_cd);
		p.Cnd_bd_dpt_cd.setNextBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.bd_dpt_cd_META);
		p.Cnd_bd_dpt_cd.addLinkBeans(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bd_dpt_nm);
		p.Cnd_bd_dpt_nm.setNextBeans(p.Cnd_rqst_dt_fr);
		p.Cnd_bd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.bd_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bd_dpt_nm, true);
		p.CndPanel.add(p.Cnd_rqst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rqst_dt_fr);
		p.Cnd_rqst_dt_fr.setNextBeans(p.Cnd_rqst_dt_to);
		p.Cnd_rqst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_dt_fr_META);
		p.Cnd_rqst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rqst_dt_to_Label);
		p.CndPanel.add(p.Cnd_rqst_dt_to);
		p.Cnd_rqst_dt_to.setNextBeans(p.Cnd_acxfr_schd_dt_fr);
		p.Cnd_rqst_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_dt_to_META);
		p.Cnd_rqst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acxfr_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_acxfr_schd_dt_fr);
		p.Cnd_acxfr_schd_dt_fr.setNextBeans(p.Cnd_acxfr_schd_dt_to);
		p.Cnd_acxfr_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_schd_dt_fr_META);
		p.Cnd_acxfr_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acxfr_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_acxfr_schd_dt_to);
		p.Cnd_acxfr_schd_dt_to.setNextBeans(p.Cnd_acxfr_inst_dt_fr);
		p.Cnd_acxfr_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_schd_dt_to_META);
		p.Cnd_acxfr_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acxfr_inst_dt_fr_Label);
		p.CndPanel.add(p.Cnd_acxfr_inst_dt_fr);
		p.Cnd_acxfr_inst_dt_fr.setNextBeans(p.Cnd_acxfr_inst_dt_to);
		p.Cnd_acxfr_inst_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_inst_dt_fr_META);
		p.Cnd_acxfr_inst_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acxfr_inst_dt_to_Label);
		p.CndPanel.add(p.Cnd_acxfr_inst_dt_to);
		p.Cnd_acxfr_inst_dt_to.setNextBeans(p.Cnd_acxfr_act_dt_p_PPanel);
		p.Cnd_acxfr_inst_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.acxfr_inst_dt_to_META);
		p.Cnd_acxfr_inst_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acxfr_act_dt_p_PPanel);
		p.Cnd_acxfr_act_dt_p_PPanel.setNextBeans(p.Cnd_ac_dt_fr);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_rsn_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rsn_cd, true);
		p.Cnd_rsn_cd.setLinkBeans(p.Cnd_rsn_nm);
		p.CndPanel.add(p.Cnd_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_rsn_cd);
		p.Cnd_rsn_cd.setNextBeans(p.Cnd_rsn_nm);
		p.Cnd_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rsn_cd_META);
		p.CndPanel.add(p.Cnd_rsn_nm);
		p.Cnd_rsn_nm.setNextBeans(p.Cnd_dspsl_no);
		p.Cnd_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_rsn_nm, true);
		p.CndPanel.add(p.Cnd_dspsl_no_Label);
		p.CndPanel.add(p.Cnd_dspsl_no);
		p.Cnd_dspsl_no.setNextBeans(p.Cnd_schd_no_aprv_flg);
		p.Cnd_dspsl_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.dspsl_no_META);
		p.CndPanel.add(p.Cnd_schd_no_aprv_flg);
		p.Cnd_schd_no_aprv_flg.setNextBeans(p.Cnd_rqst_usr_cd);
		p.Cnd_schd_no_aprv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_no_aprv_flg_META);
		p.CndPanel.add(p.Cnd_rqst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_usr_cd);
		p.Cnd_rqst_usr_cd.setNextBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_usr_cd_META);
		p.Cnd_rqst_usr_cd.addLinkBeans(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_usr_cd, true);
		p.CndPanel.add(p.Cnd_rqst_usr_nm);
		p.Cnd_rqst_usr_nm.setNextBeans(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_usr_nm, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_dpt_cd);
		p.Cnd_rqst_dpt_cd.setNextBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_dpt_cd_META);
		p.Cnd_rqst_dpt_cd.addLinkBeans(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rqst_dpt_nm);
		p.Cnd_rqst_dpt_nm.setNextBeans(p.Cnd_inst_usr_cd);
		p.Cnd_rqst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.rqst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_inst_usr_cd_Label);
		p.CndPanel.add(p.Cnd_inst_usr_cd);
		p.Cnd_inst_usr_cd.setNextBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_usr_cd_META);
		p.Cnd_inst_usr_cd.addLinkBeans(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_usr_cd, true);
		p.CndPanel.add(p.Cnd_inst_usr_nm);
		p.Cnd_inst_usr_nm.setNextBeans(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_usr_nm, true);
		p.CndPanel.add(p.Cnd_inst_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_inst_dpt_cd);
		p.Cnd_inst_dpt_cd.setNextBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_dpt_cd_META);
		p.Cnd_inst_dpt_cd.addLinkBeans(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_inst_dpt_cd, true);
		p.CndPanel.add(p.Cnd_inst_dpt_nm);
		p.Cnd_inst_dpt_nm.setNextBeans(p.Cnd_act_usr_cd);
		p.Cnd_inst_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_inst_dpt_nm, true);
		p.CndPanel.add(p.Cnd_act_usr_cd_Label);
		p.CndPanel.add(p.Cnd_act_usr_cd);
		p.Cnd_act_usr_cd.setNextBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_usr_cd_META);
		p.Cnd_act_usr_cd.addLinkBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_usr_cd, true);
		p.CndPanel.add(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_nm.setNextBeans(p.Cnd_act_dpt_cd);
		p.Cnd_act_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_act_usr_nm, true);
		p.CndPanel.add(p.Cnd_act_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_act_dpt_cd);
		p.Cnd_act_dpt_cd.setNextBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_dpt_cd_META);
		p.Cnd_act_dpt_cd.addLinkBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_dpt_cd, true);
		p.CndPanel.add(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_nm.setNextBeans(p.Cnd_schd_trd_d_rmrks);
		p.Cnd_act_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_act_dpt_nm, true);
		p.CndPanel.add(p.Cnd_schd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_trd_d_rmrks);
		p.Cnd_schd_trd_d_rmrks.setNextBeans(p.Cnd_schd_dspsl_rmrks);
		p.Cnd_schd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_trd_d_rmrks_META);
		p.CndPanel.add(p.Cnd_schd_dspsl_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_dspsl_rmrks);
		p.Cnd_schd_dspsl_rmrks.setNextBeans(p.Cnd_schd_sub_char1);
		p.Cnd_schd_dspsl_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_dspsl_rmrks_META);
		p.CndPanel.add(p.Cnd_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char1);
		p.Cnd_schd_sub_char1.setNextBeans(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_sub_char1_META);
		p.CndPanel.add(p.Cnd_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char2.setNextBeans(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_sub_char2_META);
		p.CndPanel.add(p.Cnd_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char3.setNextBeans(p.Cnd_inst_intr_rmrks);
		p.Cnd_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.schd_sub_char3_META);
		p.CndPanel.add(p.Cnd_inst_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_intr_rmrks);
		p.Cnd_inst_intr_rmrks.setNextBeans(p.Cnd_inst_trd_rmrks);
		p.Cnd_inst_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_intr_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_trd_rmrks);
		p.Cnd_inst_trd_rmrks.setNextBeans(p.Cnd_inst_rmrks);
		p.Cnd_inst_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_trd_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_rmrks);
		p.Cnd_inst_rmrks.setNextBeans(p.Cnd_inst_sub_char1);
		p.Cnd_inst_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_sub_char1_Label);
		p.CndPanel.add(p.Cnd_inst_sub_char1);
		p.Cnd_inst_sub_char1.setNextBeans(p.Cnd_inst_sub_char2);
		p.Cnd_inst_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_sub_char1_META);
		p.CndPanel.add(p.Cnd_inst_sub_char2_Label);
		p.CndPanel.add(p.Cnd_inst_sub_char2);
		p.Cnd_inst_sub_char2.setNextBeans(p.Cnd_inst_sub_char3);
		p.Cnd_inst_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_sub_char2_META);
		p.CndPanel.add(p.Cnd_inst_sub_char3_Label);
		p.CndPanel.add(p.Cnd_inst_sub_char3);
		p.Cnd_inst_sub_char3.setNextBeans(p.Cnd_inst_intr_d_rmrks);
		p.Cnd_inst_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_sub_char3_META);
		p.CndPanel.add(p.Cnd_inst_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_intr_d_rmrks);
		p.Cnd_inst_intr_d_rmrks.setNextBeans(p.Cnd_inst_trd_d_rmrks);
		p.Cnd_inst_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_intr_d_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_trd_d_rmrks);
		p.Cnd_inst_trd_d_rmrks.setNextBeans(p.Cnd_inst_d_rmrks);
		p.Cnd_inst_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_trd_d_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_inst_d_rmrks);
		p.Cnd_inst_d_rmrks.setNextBeans(p.Cnd_inst_d_sub_char1);
		p.Cnd_inst_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_d_rmrks_META);
		p.CndPanel.add(p.Cnd_inst_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_inst_d_sub_char1);
		p.Cnd_inst_d_sub_char1.setNextBeans(p.Cnd_inst_d_sub_char2);
		p.Cnd_inst_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_d_sub_char1_META);
		p.CndPanel.add(p.Cnd_inst_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_inst_d_sub_char2);
		p.Cnd_inst_d_sub_char2.setNextBeans(p.Cnd_inst_d_sub_char3);
		p.Cnd_inst_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_d_sub_char2_META);
		p.CndPanel.add(p.Cnd_inst_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_inst_d_sub_char3);
		p.Cnd_inst_d_sub_char3.setNextBeans(p.Cnd_act_intr_rmrks);
		p.Cnd_inst_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.inst_d_sub_char3_META);
		p.CndPanel.add(p.Cnd_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_rmrks);
		p.Cnd_act_intr_rmrks.setNextBeans(p.Cnd_act_trd_rmrks);
		p.Cnd_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_intr_rmrks_META);
		p.CndPanel.add(p.Cnd_act_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_trd_rmrks);
		p.Cnd_act_trd_rmrks.setNextBeans(p.Cnd_act_sub_char1);
		p.Cnd_act_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_trd_rmrks_META);
		p.CndPanel.add(p.Cnd_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_sub_char1);
		p.Cnd_act_sub_char1.setNextBeans(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_sub_char1_META);
		p.CndPanel.add(p.Cnd_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char2.setNextBeans(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_sub_char2_META);
		p.CndPanel.add(p.Cnd_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char3.setNextBeans(p.Cnd_act_intr_d_rmrks);
		p.Cnd_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_sub_char3_META);
		p.CndPanel.add(p.Cnd_act_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_d_rmrks);
		p.Cnd_act_intr_d_rmrks.setNextBeans(p.Cnd_act_trd_d_rmrks);
		p.Cnd_act_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_intr_d_rmrks_META);
		p.CndPanel.add(p.Cnd_act_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_trd_d_rmrks);
		p.Cnd_act_trd_d_rmrks.setNextBeans(p.Cnd_act_d_sub_char1);
		p.Cnd_act_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_trd_d_rmrks_META);
		p.CndPanel.add(p.Cnd_act_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char1);
		p.Cnd_act_d_sub_char1.setNextBeans(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_d_sub_char1_META);
		p.CndPanel.add(p.Cnd_act_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char2.setNextBeans(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_d_sub_char2_META);
		p.CndPanel.add(p.Cnd_act_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2430.CndR.act_d_sub_char3_META);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [WmsTrgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWmsTrgt(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.WmsTrgtPanel.setBorder(p.WmsTrgtTitledBorder);
		p.WmsTrgtPanel.setValueCheck(false);
		p.WmsTrgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.WmsTrgtPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_AcXfrSrch p) {
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
	protected static void jbInitRPnl(MSBEP_AcXfrSrch p) {
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
	protected static void jbInitRslt(MSBEP_AcXfrSrch p) {
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
	protected static void jbInitBtn(MSBEP_AcXfrSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2410.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP2410);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP2410);
		p.Btn_open_MSBEP2410.setNextBeans(p.Btn_open_MSBEP2420);
		p.Btn_open_MSBEP2420.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBEP2420);
		p.Btn_open_MSBEP2420.setNextBeans(p.Btn_prnt_acxfr);
		p.Btn_prnt_acxfr.setIcon("PRINT");
		p.Btn_prnt_acxfr.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_acxfr);
		p.Btn_prnt_acxfr.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
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
		MSBEP_AcXfrSrch_MC.mcInitScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitSts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitTop((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitFold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitTab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitTab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitWmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitCtrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitRPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitRslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.mcInitBtn((MSBEP_AcXfrSrch)this);

		// [SRCH_SCHD]ステータスのモードの設定
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_ScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Sts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Top((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Fold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Tab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Tab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_ItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Cnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_WmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Ctrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_RPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Rslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__SCHD_Btn((MSBEP_AcXfrSrch)this);

		// [SRCH_INST]ステータスのモードの設定
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_ScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Sts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Top((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Fold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Tab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Tab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_ItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Cnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_WmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Ctrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_RPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Rslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__INST_Btn((MSBEP_AcXfrSrch)this);

		// [SRCH_ACT]ステータスのモードの設定
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_ScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Sts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Top((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Fold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Tab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Tab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_ItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Cnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_WmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Ctrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_RPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Rslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitSRCH__ACT_Btn((MSBEP_AcXfrSrch)this);

		// [PRNT_DSPSL]ステータスのモードの設定
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_ScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Sts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Top((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Fold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Tab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Tab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_ItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Cnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_WmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Ctrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_RPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Rslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__DSPSL_Btn((MSBEP_AcXfrSrch)this);

		// [PRNT_ACXFR]ステータスのモードの設定
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_ScreenOpe((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Sts((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Top((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Fold((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Tab1((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Tab2((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_ItmCnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Cnd((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_WmsTrgt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Ctrl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_RPnl((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Rslt((MSBEP_AcXfrSrch)this);
		MSBEP_AcXfrSrch_MC.statusInitPRNT__ACXFR_Btn((MSBEP_AcXfrSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_AcXfrSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_AcXfrSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_REF2.addAllListener(p);
		p.Cnd_ope_REF3.addAllListener(p);
		p.Cnd_ope_PRNT_ACXFR.addAllListener(p);
		p.Cnd_not_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_part_comp_flg.addAllListener(p);
		p.Cnd_comp_flg.addAllListener(p);
		p.Cnd_wms_flg.addAllListener(p);
		p.Cnd_not_wms_flg.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_trd_ptn_typ.setListListener(p);
		p.Cnd_trd_ptn_typ.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_acxfr_schd_no.setListListener(p);
		p.Cnd_acxfr_schd_no.addAllListener(p);
		p.Cnd_acxfr_inst_no.setListListener(p);
		p.Cnd_acxfr_inst_no.addAllListener(p);
		p.Cnd_acxfr_inst_d_no.setListListener(p);
		p.Cnd_acxfr_inst_d_no.addAllListener(p);
		p.Cnd_acxfr_act_no.setListListener(p);
		p.Cnd_acxfr_act_no.addAllListener(p);
		p.Cnd_acxfr_act_d_no.setListListener(p);
		p.Cnd_acxfr_act_d_no.addAllListener(p);
		p.Cnd_ext_acxfr_act_no.setListListener(p);
		p.Cnd_ext_acxfr_act_no.addAllListener(p);
		p.Cnd_abort_flg.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
		p.Cnd_bd_dpt_cd.setListListener(p);
		p.Cnd_bd_dpt_cd.addAllListener(p);
		p.Cnd_bd_dpt_nm.setListListener(p);
		p.Cnd_bd_dpt_nm.addAllListener(p);
		p.Cnd_rqst_dt_fr.setListListener(p);
		p.Cnd_rqst_dt_fr.addAllListener(p);
		p.Cnd_rqst_dt_to.setListListener(p);
		p.Cnd_rqst_dt_to.addAllListener(p);
		p.Cnd_acxfr_schd_dt_fr.setListListener(p);
		p.Cnd_acxfr_schd_dt_fr.addAllListener(p);
		p.Cnd_acxfr_schd_dt_to.setListListener(p);
		p.Cnd_acxfr_schd_dt_to.addAllListener(p);
		p.Cnd_acxfr_inst_dt_fr.setListListener(p);
		p.Cnd_acxfr_inst_dt_fr.addAllListener(p);
		p.Cnd_acxfr_inst_dt_to.setListListener(p);
		p.Cnd_acxfr_inst_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_rsn_cd.setListListener(p);
		p.Cnd_rsn_cd.addAllListener(p);
		p.Cnd_rsn_nm.setListListener(p);
		p.Cnd_rsn_nm.addAllListener(p);
		p.Cnd_dspsl_no.setListListener(p);
		p.Cnd_dspsl_no.addAllListener(p);
		p.Cnd_schd_no_aprv_flg.addAllListener(p);
		p.Cnd_rqst_usr_cd.setListListener(p);
		p.Cnd_rqst_usr_cd.addAllListener(p);
		p.Cnd_rqst_usr_nm.setListListener(p);
		p.Cnd_rqst_usr_nm.addAllListener(p);
		p.Cnd_rqst_dpt_cd.setListListener(p);
		p.Cnd_rqst_dpt_cd.addAllListener(p);
		p.Cnd_rqst_dpt_nm.setListListener(p);
		p.Cnd_rqst_dpt_nm.addAllListener(p);
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
		p.Cnd_schd_trd_d_rmrks.setListListener(p);
		p.Cnd_schd_trd_d_rmrks.addAllListener(p);
		p.Cnd_schd_dspsl_rmrks.setListListener(p);
		p.Cnd_schd_dspsl_rmrks.addAllListener(p);
		p.Cnd_schd_sub_char1.setListListener(p);
		p.Cnd_schd_sub_char1.addAllListener(p);
		p.Cnd_schd_sub_char2.setListListener(p);
		p.Cnd_schd_sub_char2.addAllListener(p);
		p.Cnd_schd_sub_char3.setListListener(p);
		p.Cnd_schd_sub_char3.addAllListener(p);
		p.Cnd_inst_intr_rmrks.setListListener(p);
		p.Cnd_inst_intr_rmrks.addAllListener(p);
		p.Cnd_inst_trd_rmrks.setListListener(p);
		p.Cnd_inst_trd_rmrks.addAllListener(p);
		p.Cnd_inst_rmrks.setListListener(p);
		p.Cnd_inst_rmrks.addAllListener(p);
		p.Cnd_inst_sub_char1.setListListener(p);
		p.Cnd_inst_sub_char1.addAllListener(p);
		p.Cnd_inst_sub_char2.setListListener(p);
		p.Cnd_inst_sub_char2.addAllListener(p);
		p.Cnd_inst_sub_char3.setListListener(p);
		p.Cnd_inst_sub_char3.addAllListener(p);
		p.Cnd_inst_intr_d_rmrks.setListListener(p);
		p.Cnd_inst_intr_d_rmrks.addAllListener(p);
		p.Cnd_inst_trd_d_rmrks.setListListener(p);
		p.Cnd_inst_trd_d_rmrks.addAllListener(p);
		p.Cnd_inst_d_rmrks.setListListener(p);
		p.Cnd_inst_d_rmrks.addAllListener(p);
		p.Cnd_inst_d_sub_char1.setListListener(p);
		p.Cnd_inst_d_sub_char1.addAllListener(p);
		p.Cnd_inst_d_sub_char2.setListListener(p);
		p.Cnd_inst_d_sub_char2.addAllListener(p);
		p.Cnd_inst_d_sub_char3.setListListener(p);
		p.Cnd_inst_d_sub_char3.addAllListener(p);
		p.Cnd_act_intr_rmrks.setListListener(p);
		p.Cnd_act_intr_rmrks.addAllListener(p);
		p.Cnd_act_trd_rmrks.setListListener(p);
		p.Cnd_act_trd_rmrks.addAllListener(p);
		p.Cnd_act_sub_char1.setListListener(p);
		p.Cnd_act_sub_char1.addAllListener(p);
		p.Cnd_act_sub_char2.setListListener(p);
		p.Cnd_act_sub_char2.addAllListener(p);
		p.Cnd_act_sub_char3.setListListener(p);
		p.Cnd_act_sub_char3.addAllListener(p);
		p.Cnd_act_intr_d_rmrks.setListListener(p);
		p.Cnd_act_intr_d_rmrks.addAllListener(p);
		p.Cnd_act_trd_d_rmrks.setListListener(p);
		p.Cnd_act_trd_d_rmrks.addAllListener(p);
		p.Cnd_act_d_sub_char1.setListListener(p);
		p.Cnd_act_d_sub_char1.addAllListener(p);
		p.Cnd_act_d_sub_char2.setListListener(p);
		p.Cnd_act_d_sub_char2.addAllListener(p);
		p.Cnd_act_d_sub_char3.setListListener(p);
		p.Cnd_act_d_sub_char3.addAllListener(p);
	}

	/**
	 *  [WmsTrgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWmsTrgt(MSBEP_AcXfrSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_AcXfrSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_AcXfrSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_AcXfrSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_ver_no.addAllListener(p);
		p.columnRslt_ver_no.setListListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_unit_dec_place.addAllListener(p);
		p.columnRslt_pack_unit_dec_place.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_dec_place.addAllListener(p);
		p.columnRslt_base_cur_dec_place.setListListener(p);
		p.columnRslt_rqst_dt.addAllListener(p);
		p.columnRslt_rqst_dt.setListListener(p);
		p.columnRslt_acxfr_schd_dt.addAllListener(p);
		p.columnRslt_acxfr_schd_dt.setListListener(p);
		p.columnRslt_acxfr_inst_dt.addAllListener(p);
		p.columnRslt_acxfr_inst_dt.setListListener(p);
		p.columnRslt_acxfr_act_dt.addAllListener(p);
		p.columnRslt_acxfr_act_dt.setListListener(p);
		p.columnRslt_acxfr_act_hm.addAllListener(p);
		p.columnRslt_acxfr_act_hm.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_fix_no_typ.addAllListener(p);
		p.columnRslt_fix_no_typ.setListListener(p);
		p.columnRslt_fix_no_typ_nm.addAllListener(p);
		p.columnRslt_fix_no_typ_nm.setListListener(p);
		p.columnRslt_fix_no.addAllListener(p);
		p.columnRslt_fix_no.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_rsn_cd.addAllListener(p);
		p.columnRslt_rsn_cd.setListListener(p);
		p.columnRslt_rsn_nm.addAllListener(p);
		p.columnRslt_rsn_nm.setListListener(p);
		p.columnRslt_rqst_usr_cd.addAllListener(p);
		p.columnRslt_rqst_usr_cd.setListListener(p);
		p.columnRslt_rqst_usr_nm.addAllListener(p);
		p.columnRslt_rqst_usr_nm.setListListener(p);
		p.columnRslt_rqst_dpt_cd.addAllListener(p);
		p.columnRslt_rqst_dpt_cd.setListListener(p);
		p.columnRslt_rqst_dpt_nm.addAllListener(p);
		p.columnRslt_rqst_dpt_nm.setListListener(p);
		p.columnRslt_inst_usr_cd.addAllListener(p);
		p.columnRslt_inst_usr_cd.setListListener(p);
		p.columnRslt_inst_usr_nm.addAllListener(p);
		p.columnRslt_inst_usr_nm.setListListener(p);
		p.columnRslt_inst_dpt_cd.addAllListener(p);
		p.columnRslt_inst_dpt_cd.setListListener(p);
		p.columnRslt_inst_dpt_nm.addAllListener(p);
		p.columnRslt_inst_dpt_nm.setListListener(p);
		p.columnRslt_act_usr_cd.addAllListener(p);
		p.columnRslt_act_usr_cd.setListListener(p);
		p.columnRslt_act_usr_nm.addAllListener(p);
		p.columnRslt_act_usr_nm.setListListener(p);
		p.columnRslt_act_dpt_cd.addAllListener(p);
		p.columnRslt_act_dpt_cd.setListListener(p);
		p.columnRslt_act_dpt_nm.addAllListener(p);
		p.columnRslt_act_dpt_nm.setListListener(p);
		p.columnRslt_inst_typ.addAllListener(p);
		p.columnRslt_inst_typ.setListListener(p);
		p.columnRslt_inst_typ_nm.addAllListener(p);
		p.columnRslt_inst_typ_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_trd_ptn_typ_nm.addAllListener(p);
		p.columnRslt_trd_ptn_typ_nm.setListListener(p);
		p.columnRslt_acxfr_schd_no.addAllListener(p);
		p.columnRslt_acxfr_schd_no.setListListener(p);
		p.columnRslt_acxfr_schd_rev.addAllListener(p);
		p.columnRslt_acxfr_schd_rev.setListListener(p);
		p.columnRslt_acxfr_inst_no.addAllListener(p);
		p.columnRslt_acxfr_inst_no.setListListener(p);
		p.columnRslt_acxfr_inst_d_no.addAllListener(p);
		p.columnRslt_acxfr_inst_d_no.setListListener(p);
		p.columnRslt_acxfr_act_no.addAllListener(p);
		p.columnRslt_acxfr_act_no.setListListener(p);
		p.columnRslt_acxfr_act_d_no.addAllListener(p);
		p.columnRslt_acxfr_act_d_no.setListListener(p);
		p.columnRslt_wms_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_acxfr_act_no.addAllListener(p);
		p.columnRslt_ext_acxfr_act_no.setListListener(p);
		p.columnRslt_acxfr_act_rev.addAllListener(p);
		p.columnRslt_acxfr_act_rev.setListListener(p);
		p.columnRslt_dspsl_no.addAllListener(p);
		p.columnRslt_dspsl_no.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_aprv_flg.addAllListener(p);
		p.columnRslt_aprv_no.addAllListener(p);
		p.columnRslt_aprv_no.setListListener(p);
		p.columnRslt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_aprv_sts_typ.setListListener(p);
		p.columnRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_schd_trd_d_rmrks.addAllListener(p);
		p.columnRslt_schd_trd_d_rmrks.setListListener(p);
		p.columnRslt_schd_dspsl_rmrks.addAllListener(p);
		p.columnRslt_schd_dspsl_rmrks.setListListener(p);
		p.columnRslt_schd_sub_char1.addAllListener(p);
		p.columnRslt_schd_sub_char1.setListListener(p);
		p.columnRslt_schd_sub_char2.addAllListener(p);
		p.columnRslt_schd_sub_char2.setListListener(p);
		p.columnRslt_schd_sub_char3.addAllListener(p);
		p.columnRslt_schd_sub_char3.setListListener(p);
		p.columnRslt_inst_intr_rmrks.addAllListener(p);
		p.columnRslt_inst_intr_rmrks.setListListener(p);
		p.columnRslt_inst_trd_rmrks.addAllListener(p);
		p.columnRslt_inst_trd_rmrks.setListListener(p);
		p.columnRslt_inst_rmrks.addAllListener(p);
		p.columnRslt_inst_rmrks.setListListener(p);
		p.columnRslt_inst_sub_char1.addAllListener(p);
		p.columnRslt_inst_sub_char1.setListListener(p);
		p.columnRslt_inst_sub_char2.addAllListener(p);
		p.columnRslt_inst_sub_char2.setListListener(p);
		p.columnRslt_inst_sub_char3.addAllListener(p);
		p.columnRslt_inst_sub_char3.setListListener(p);
		p.columnRslt_inst_intr_d_rmrks.addAllListener(p);
		p.columnRslt_inst_intr_d_rmrks.setListListener(p);
		p.columnRslt_inst_trd_d_rmrks.addAllListener(p);
		p.columnRslt_inst_trd_d_rmrks.setListListener(p);
		p.columnRslt_inst_d_rmrks.addAllListener(p);
		p.columnRslt_inst_d_rmrks.setListListener(p);
		p.columnRslt_inst_d_sub_char1.addAllListener(p);
		p.columnRslt_inst_d_sub_char1.setListListener(p);
		p.columnRslt_inst_d_sub_char2.addAllListener(p);
		p.columnRslt_inst_d_sub_char2.setListListener(p);
		p.columnRslt_inst_d_sub_char3.addAllListener(p);
		p.columnRslt_inst_d_sub_char3.setListListener(p);
		p.columnRslt_act_intr_rmrks.addAllListener(p);
		p.columnRslt_act_intr_rmrks.setListListener(p);
		p.columnRslt_act_trd_rmrks.addAllListener(p);
		p.columnRslt_act_trd_rmrks.setListListener(p);
		p.columnRslt_act_sub_char1.addAllListener(p);
		p.columnRslt_act_sub_char1.setListListener(p);
		p.columnRslt_act_sub_char2.addAllListener(p);
		p.columnRslt_act_sub_char2.setListListener(p);
		p.columnRslt_act_sub_char3.addAllListener(p);
		p.columnRslt_act_sub_char3.setListListener(p);
		p.columnRslt_act_intr_d_rmrks.addAllListener(p);
		p.columnRslt_act_intr_d_rmrks.setListListener(p);
		p.columnRslt_act_trd_d_rmrks.addAllListener(p);
		p.columnRslt_act_trd_d_rmrks.setListListener(p);
		p.columnRslt_act_d_sub_char1.addAllListener(p);
		p.columnRslt_act_d_sub_char1.setListListener(p);
		p.columnRslt_act_d_sub_char2.addAllListener(p);
		p.columnRslt_act_d_sub_char2.setListListener(p);
		p.columnRslt_act_d_sub_char3.addAllListener(p);
		p.columnRslt_act_d_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBEP_AcXfrSrch p) {
		p.Btn_open_MSBEP2410.addAllListener(p);
		p.Btn_open_MSBEP2410.setAPMethodName("doBtn_open_MSBEP2410");
		p.Btn_open_MSBEP2420.addAllListener(p);
		p.Btn_open_MSBEP2420.setAPMethodName("doBtn_open_MSBEP2420");
		p.Btn_prnt_acxfr.addAllListener(p);
		p.Btn_prnt_acxfr.setAPMethodName("doBtn_prnt_acxfr");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [SRCH_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ScreenOpe(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Sts(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Top(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Fold(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab1(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Tab2(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_ItmCnd(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Cnd(MSBEP_AcXfrSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_inst_flg.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_part_comp_flg.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_comp_flg.putMode(p, SRCH_SCHD, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_trd_ptn_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_acxfr_schd_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_acxfr_inst_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_d_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_d_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ext_acxfr_act_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_rqst_dt_to.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_acxfr_schd_dt_fr.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_acxfr_schd_dt_to.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_acxfr_inst_dt_fr.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_to.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_dt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, SRCH_SCHD, MCMode.ENABLE);
		p.Cnd_dspsl_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_schd_no_aprv_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_schd_dspsl_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Cnd_inst_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_intr_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_WmsTrgt(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Ctrl(MSBEP_AcXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SCHD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_RPnl(MSBEP_AcXfrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD_Rslt(MSBEP_AcXfrSrch p){
		p.columnRslt_check.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_trd_schd_unit_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_inst_unit_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_act_unit_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_base_unit_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_stk_amt_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_dec_place.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_dt.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_hm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_bd_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_usr_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_usr_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_inst_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_rev.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_d_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_d_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ext_acxfr_act_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_rev.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_dspsl_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_aprv_flg.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_dspsl_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH__SCHD_Btn(MSBEP_AcXfrSrch p){
		p.Btn_open_MSBEP2410.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_open_MSBEP2420.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_prnt_acxfr.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_ScreenOpe(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Sts(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Top(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Fold(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab1(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Tab2(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_ItmCnd(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd(MSBEP_AcXfrSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_inst_flg.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_part_comp_flg.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_comp_flg.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_trd_ptn_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_schd_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_acxfr_inst_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_inst_d_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_act_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_d_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_ext_acxfr_act_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_rqst_dt_to.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_acxfr_schd_dt_fr.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_schd_dt_to.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_inst_dt_fr.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_inst_dt_to.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_acxfr_act_dt_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_dspsl_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_schd_no_aprv_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_schd_dspsl_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Cnd_inst_intr_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_trd_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_sub_char1.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_sub_char2.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_sub_char3.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_intr_d_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_d_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_d_sub_char1.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_d_sub_char2.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_inst_d_sub_char3.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_WmsTrgt(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Ctrl(MSBEP_AcXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_INST, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_RPnl(MSBEP_AcXfrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Rslt(MSBEP_AcXfrSrch p){
		p.columnRslt_check.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_trd_schd_unit_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_inst_unit_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_act_unit_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_base_unit_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_pack_unit_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_stk_amt_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_rqst_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_dt.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_dt.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_hm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Rslt_bd_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_act_usr_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_usr_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_rev.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_d_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_d_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_ext_acxfr_act_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_rev.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dspsl_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_schd_dspsl_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_trd_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_intr_d_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_d_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_d_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_inst_d_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Btn(MSBEP_AcXfrSrch p){
		p.Btn_open_MSBEP2410.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_open_MSBEP2420.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_prnt_acxfr.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ScreenOpe(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Sts(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Top(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Fold(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab1(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Tab2(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_ItmCnd(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Cnd(MSBEP_AcXfrSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_inst_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_part_comp_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_trd_ptn_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_acxfr_schd_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_acxfr_inst_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_acxfr_inst_d_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_acxfr_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_acxfr_act_d_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ext_acxfr_act_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_rqst_dt_to.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_acxfr_schd_dt_fr.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_acxfr_schd_dt_to.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_fr.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_to.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_dt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_rsn_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_dspsl_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_schd_no_aprv_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_inst_usr_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_schd_dspsl_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Cnd_inst_intr_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_trd_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_intr_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_WmsTrgt(MSBEP_AcXfrSrch p){

	}

	/**
	 * [SRCH_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Ctrl(MSBEP_AcXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_RPnl(MSBEP_AcXfrSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT_Rslt(MSBEP_AcXfrSrch p){
		p.columnRslt_check.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_trd_schd_unit_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_inst_unit_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_act_unit_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_base_unit_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_pack_unit_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_stk_amt_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_dec_place.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_dt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_dt.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_hm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_bd_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_cd.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_act_usr_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_inst_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_inst_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_rev.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_d_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_d_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ext_acxfr_act_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rev.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_dspsl_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_schd_dspsl_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char1.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char2.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char3.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_d_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_d_rmrks.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char1.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char2.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char3.putMode(p, SRCH_ACT, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH__ACT_Btn(MSBEP_AcXfrSrch p){
		p.Btn_open_MSBEP2410.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_open_MSBEP2420.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_prnt_acxfr.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT, MCMode.DISABLE);

	}

	/**
	 * [PRNT_DSPSL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_ScreenOpe(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Sts(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Top(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Fold(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Tab1(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Tab2(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_ItmCnd(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Cnd(MSBEP_AcXfrSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT_DSPSL, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_inst_flg.putMode(p, PRNT_DSPSL, MCMode.REQUIRED);
		p.Cnd_part_comp_flg.putMode(p, PRNT_DSPSL, MCMode.REQUIRED);
		p.Cnd_comp_flg.putMode(p, PRNT_DSPSL, MCMode.REQUIRED);
		p.Cnd_wms_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_not_wms_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_trd_ptn_typ.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_acxfr_schd_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_acxfr_inst_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_d_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_d_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_ext_acxfr_act_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_loc_grp_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_rqst_dt_to.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_acxfr_schd_dt_fr.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_acxfr_schd_dt_to.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_acxfr_inst_dt_fr.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_to.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_dt_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_rsn_cd.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.Cnd_dspsl_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_schd_no_aprv_flg.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_inst_usr_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_usr_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_schd_dspsl_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Cnd_inst_intr_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_trd_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char1.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char2.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char3.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_intr_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char1.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char2.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char3.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT_DSPSL]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_WmsTrgt(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Ctrl(MSBEP_AcXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT_DSPSL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT_DSPSL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_RPnl(MSBEP_AcXfrSrch p){
		p.RPnl_dwnld.putMode(p, PRNT_DSPSL, MCMode.ENABLE);

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Rslt(MSBEP_AcXfrSrch p){
		p.columnRslt_check.putMode(p, PRNT_DSPSL, MCMode.ENABLE);
		p.columnRslt_trd_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Rslt_trd_schd_unit_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_inst_unit_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_act_unit_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Rslt_base_unit_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_dec_place.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Rslt_pack_unit_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_stk_amt_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_dec_place.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dt.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_dt.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_dt.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_dt.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_hm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Rslt_bd_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_usr_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_usr_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_cd.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_dpt_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_inst_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_rev.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_d_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_d_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_wms_flg.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ext_acxfr_act_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rev.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_dspsl_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_aprv_flg.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_schd_dspsl_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, PRNT_DSPSL, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT_DSPSL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT_DSPSL, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_DSPSL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__DSPSL_Btn(MSBEP_AcXfrSrch p){
		p.Btn_open_MSBEP2410.putMode(p, PRNT_DSPSL, MCMode.DISABLE);
		p.Btn_open_MSBEP2420.putMode(p, PRNT_DSPSL, MCMode.DISABLE);
		p.Btn_prnt_acxfr.putMode(p, PRNT_DSPSL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT_DSPSL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, PRNT_DSPSL, MCMode.DISABLE);

	}

	/**
	 * [PRNT_ACXFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_ScreenOpe(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Sts(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Top(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Fold(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Tab1(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Tab2(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_ItmCnd(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Cnd(MSBEP_AcXfrSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT_ACXFR, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_inst_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_part_comp_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_comp_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_wms_flg.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_not_wms_flg.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_trd_ptn_typ.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_wg_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_acxfr_schd_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_acxfr_inst_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_acxfr_inst_d_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_acxfr_act_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_acxfr_act_d_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_ext_acxfr_act_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_abort_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_loc_grp_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_bd_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_bd_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_rqst_dt_fr.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_rqst_dt_to.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_acxfr_schd_dt_fr.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_acxfr_schd_dt_to.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_fr.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_acxfr_inst_dt_to.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_acxfr_act_dt_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_rsn_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_rsn_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_dspsl_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_schd_no_aprv_flg.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_rqst_usr_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_rqst_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_inst_usr_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_usr_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_act_usr_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_schd_dspsl_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char1.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char2.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_schd_sub_char3.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Cnd_inst_intr_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_trd_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char1.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char2.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_sub_char3.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_intr_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char1.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char2.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_inst_d_sub_char3.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [PRNT_ACXFR]ステータスの[WmsTrgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_WmsTrgt(MSBEP_AcXfrSrch p){

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Ctrl(MSBEP_AcXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT_ACXFR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT_ACXFR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_RPnl(MSBEP_AcXfrSrch p){
		p.RPnl_dwnld.putMode(p, PRNT_ACXFR, MCMode.ENABLE);

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Rslt(MSBEP_AcXfrSrch p){
		p.columnRslt_check.putMode(p, PRNT_ACXFR, MCMode.ENABLE);
		p.columnRslt_trd_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_pr_sts_typ_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_trd_schd_unit_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_inst_unit_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_trd_act_unit_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_base_unit_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_pack_unit_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_stk_amt_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_dec_place.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dt.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_dt.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_dt.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_act_dt.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_hm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_fix_no_typ_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_fix_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_rsn_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_rsn_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Rslt_bd_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_iv_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_slo_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.Rslt_bd_p_PPanel.columnBdItem_bd_po_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_rqst_usr_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_rqst_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_usr_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_act_usr_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_usr_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_inst_typ.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_inst_typ_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_schd_rev.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_acxfr_inst_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_acxfr_inst_d_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_d_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_wms_flg.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ext_acxfr_act_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_acxfr_act_rev.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_dspsl_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_aprv_flg.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_aprv_no.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_schd_dspsl_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char1.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char2.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_sub_char3.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_intr_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char1.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char2.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_inst_d_sub_char3.putMode(p, PRNT_ACXFR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT_ACXFR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT_ACXFR, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT_ACXFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT__ACXFR_Btn(MSBEP_AcXfrSrch p){
		p.Btn_open_MSBEP2410.putMode(p, PRNT_ACXFR, MCMode.DISABLE);
		p.Btn_open_MSBEP2420.putMode(p, PRNT_ACXFR, MCMode.DISABLE);
		p.Btn_prnt_acxfr.putMode(p, PRNT_ACXFR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, PRNT_ACXFR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, PRNT_ACXFR, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_INST;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_AcXfrSrch_MC.setTableConfigRslt((MSBEP_AcXfrSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_AcXfrSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_ver_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ver_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_no);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_trd_schd_unit_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_inst_unit_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_act_unit_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_base_unit_p_PPanel.QtyTable);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.pack_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_dec_place);
		p.RsltTable.addTable(p.Rslt_pack_unit_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_stk_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_dec_place.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.base_cur_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_dec_place);
		p.columnRslt_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rqst_dt_META);
		p.columnRslt_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dt);
		p.columnRslt_acxfr_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_schd_dt_META);
		p.columnRslt_acxfr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_schd_dt);
		p.columnRslt_acxfr_inst_dt.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_inst_dt_META);
		p.columnRslt_acxfr_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_inst_dt);
		p.columnRslt_acxfr_act_dt.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_act_dt_META);
		p.columnRslt_acxfr_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_dt);
		p.columnRslt_acxfr_act_hm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_act_hm_META);
		p.columnRslt_acxfr_act_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_hm);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_str_ln_cd_none_flg.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd_none_flg);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.fix_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ);
		p.columnRslt_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.fix_no_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ_nm);
		p.columnRslt_fix_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.fix_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_cd);
		p.columnRslt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_bd_p_PPanel.BdItemTable);
		p.columnRslt_rqst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rqst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_cd);
		p.columnRslt_rqst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rqst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_usr_nm);
		p.columnRslt_rqst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rqst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_cd);
		p.columnRslt_rqst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.rqst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_dpt_nm);
		p.columnRslt_inst_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_cd);
		p.columnRslt_inst_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_usr_nm);
		p.columnRslt_inst_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_cd);
		p.columnRslt_inst_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_dpt_nm);
		p.columnRslt_act_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_usr_cd);
		p.columnRslt_act_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_usr_nm);
		p.columnRslt_act_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_dpt_cd);
		p.columnRslt_act_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_dpt_nm);
		p.columnRslt_inst_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_typ);
		p.columnRslt_inst_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_typ_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.trd_ptn_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ_nm);
		p.columnRslt_acxfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_schd_no);
		p.columnRslt_acxfr_schd_rev.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_schd_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_schd_rev);
		p.columnRslt_acxfr_inst_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_inst_no);
		p.columnRslt_acxfr_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_inst_d_no);
		p.columnRslt_acxfr_act_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_no);
		p.columnRslt_acxfr_act_d_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_d_no);
		p.columnRslt_wms_flg.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.wms_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wms_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_acxfr_act_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ext_acxfr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_acxfr_act_no);
		p.columnRslt_acxfr_act_rev.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.acxfr_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acxfr_act_rev);
		p.columnRslt_dspsl_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.dspsl_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dspsl_no);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_aprv_flg.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.aprv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_flg);
		p.columnRslt_aprv_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_no);
		p.columnRslt_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ);
		p.columnRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ_nm);
		p.columnRslt_schd_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.schd_trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_trd_d_rmrks);
		p.columnRslt_schd_dspsl_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.schd_dspsl_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_dspsl_rmrks);
		p.columnRslt_schd_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char1);
		p.columnRslt_schd_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char2);
		p.columnRslt_schd_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char3);
		p.columnRslt_inst_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_intr_rmrks);
		p.columnRslt_inst_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_trd_rmrks);
		p.columnRslt_inst_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_rmrks);
		p.columnRslt_inst_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_sub_char1);
		p.columnRslt_inst_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_sub_char2);
		p.columnRslt_inst_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_sub_char3);
		p.columnRslt_inst_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_intr_d_rmrks);
		p.columnRslt_inst_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_trd_d_rmrks);
		p.columnRslt_inst_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_rmrks);
		p.columnRslt_inst_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_sub_char1);
		p.columnRslt_inst_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_sub_char2);
		p.columnRslt_inst_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.inst_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_d_sub_char3);
		p.columnRslt_act_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_rmrks);
		p.columnRslt_act_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_trd_rmrks);
		p.columnRslt_act_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char1);
		p.columnRslt_act_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char2);
		p.columnRslt_act_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char3);
		p.columnRslt_act_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_d_rmrks);
		p.columnRslt_act_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_trd_d_rmrks);
		p.columnRslt_act_d_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char1);
		p.columnRslt_act_d_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char2);
		p.columnRslt_act_d_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2430.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
		Cnd_bd_dpt_cd.getListConfig().setPutter(getCnd_bd_dpt_cd_ListPutter());
		Cnd_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rsn_cd.getListConfig().setPutter(getCnd_rsn_cd_ListPutter());
		Cnd_rqst_usr_cd.getListConfig().setPutter(getCnd_rqst_usr_cd_ListPutter());
		Cnd_rqst_dpt_cd.getListConfig().setPutter(getCnd_rqst_dpt_cd_ListPutter());
		Cnd_inst_usr_cd.getListConfig().setPutter(getCnd_inst_usr_cd_ListPutter());
		Cnd_inst_dpt_cd.getListConfig().setPutter(getCnd_inst_dpt_cd_ListPutter());
		Cnd_act_usr_cd.getListConfig().setPutter(getCnd_act_usr_cd_ListPutter());
		Cnd_act_dpt_cd.getListConfig().setPutter(getCnd_act_dpt_cd_ListPutter());
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
	 * この画面を[SRCH_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSTStatus() {
		status = SRCH_INST;
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
	 * この画面を[PRNT_DSPSL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_DSPSLStatus() {
		status = PRNT_DSPSL;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT_ACXFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNT_ACXFRStatus() {
		status = PRNT_ACXFR;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SCHD.equals(status)) {
			setSRCH_SCHDStatus();
		}
		else if (SRCH_INST.equals(status)) {
			setSRCH_INSTStatus();
		}
		else if (SRCH_ACT.equals(status)) {
			setSRCH_ACTStatus();
		}
		else if (PRNT_DSPSL.equals(status)) {
			setPRNT_DSPSLStatus();
		}
		else if (PRNT_ACXFR.equals(status)) {
			setPRNT_ACXFRStatus();
		}
	}

	/**
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
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
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcxfrGrAcxfrGiDispBizRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_bd_dpt_cd) return getCnd_bd_dpt_cd(row, info);
		if(combo == Cnd_rsn_cd) return getCnd_rsn_cd(row, info);
		if(combo == Cnd_rqst_usr_cd) return getCnd_rqst_usr_cd(row, info);
		if(combo == Cnd_rqst_dpt_cd) return getCnd_rqst_dpt_cd(row, info);
		if(combo == Cnd_inst_usr_cd) return getCnd_inst_usr_cd(row, info);
		if(combo == Cnd_inst_dpt_cd) return getCnd_inst_dpt_cd(row, info);
		if(combo == Cnd_act_usr_cd) return getCnd_act_usr_cd(row, info);
		if(combo == Cnd_act_dpt_cd) return getCnd_act_dpt_cd(row, info);
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
		else if (ap == Btn_open_MSBEP2410) doBtn_open_MSBEP2410(info);
		else if (ap == Btn_open_MSBEP2420) doBtn_open_MSBEP2420(info);
		else if (ap == Btn_prnt_acxfr) doBtn_prnt_acxfr(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
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
	 * [Btn]パネルの[open_MSBEP2410]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2410(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2420]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2420(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_acxfr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_acxfr(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Cnd_not_inst_flg) return doCnd_not_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_part_comp_flg) return doCnd_part_comp_flg_VC(info);
		if (vc == Cnd_comp_flg) return doCnd_comp_flg_VC(info);
		if (vc == Cnd_wms_flg) return doCnd_wms_flg_VC(info);
		if (vc == Cnd_not_wms_flg) return doCnd_not_wms_flg_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_trd_ptn_typ) return doCnd_trd_ptn_typ_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_acxfr_schd_no) return doCnd_acxfr_schd_no_VC(info);
		if (vc == Cnd_acxfr_inst_no) return doCnd_acxfr_inst_no_VC(info);
		if (vc == Cnd_acxfr_inst_d_no) return doCnd_acxfr_inst_d_no_VC(info);
		if (vc == Cnd_acxfr_act_no) return doCnd_acxfr_act_no_VC(info);
		if (vc == Cnd_acxfr_act_d_no) return doCnd_acxfr_act_d_no_VC(info);
		if (vc == Cnd_ext_acxfr_act_no) return doCnd_ext_acxfr_act_no_VC(info);
		if (vc == Cnd_abort_flg) return doCnd_abort_flg_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_bd_dpt_cd) return doCnd_bd_dpt_cd_VC(info);
		if (vc == Cnd_bd_dpt_nm) return doCnd_bd_dpt_nm_VC(info);
		if (vc == Cnd_rqst_dt_fr) return doCnd_rqst_dt_fr_VC(info);
		if (vc == Cnd_rqst_dt_to) return doCnd_rqst_dt_to_VC(info);
		if (vc == Cnd_acxfr_schd_dt_fr) return doCnd_acxfr_schd_dt_fr_VC(info);
		if (vc == Cnd_acxfr_schd_dt_to) return doCnd_acxfr_schd_dt_to_VC(info);
		if (vc == Cnd_acxfr_inst_dt_fr) return doCnd_acxfr_inst_dt_fr_VC(info);
		if (vc == Cnd_acxfr_inst_dt_to) return doCnd_acxfr_inst_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_rsn_cd) return doCnd_rsn_cd_VC(info);
		if (vc == Cnd_rsn_nm) return doCnd_rsn_nm_VC(info);
		if (vc == Cnd_dspsl_no) return doCnd_dspsl_no_VC(info);
		if (vc == Cnd_schd_no_aprv_flg) return doCnd_schd_no_aprv_flg_VC(info);
		if (vc == Cnd_rqst_usr_cd) return doCnd_rqst_usr_cd_VC(info);
		if (vc == Cnd_rqst_usr_nm) return doCnd_rqst_usr_nm_VC(info);
		if (vc == Cnd_rqst_dpt_cd) return doCnd_rqst_dpt_cd_VC(info);
		if (vc == Cnd_rqst_dpt_nm) return doCnd_rqst_dpt_nm_VC(info);
		if (vc == Cnd_inst_usr_cd) return doCnd_inst_usr_cd_VC(info);
		if (vc == Cnd_inst_usr_nm) return doCnd_inst_usr_nm_VC(info);
		if (vc == Cnd_inst_dpt_cd) return doCnd_inst_dpt_cd_VC(info);
		if (vc == Cnd_inst_dpt_nm) return doCnd_inst_dpt_nm_VC(info);
		if (vc == Cnd_act_usr_cd) return doCnd_act_usr_cd_VC(info);
		if (vc == Cnd_act_usr_nm) return doCnd_act_usr_nm_VC(info);
		if (vc == Cnd_act_dpt_cd) return doCnd_act_dpt_cd_VC(info);
		if (vc == Cnd_act_dpt_nm) return doCnd_act_dpt_nm_VC(info);
		if (vc == Cnd_schd_trd_d_rmrks) return doCnd_schd_trd_d_rmrks_VC(info);
		if (vc == Cnd_schd_dspsl_rmrks) return doCnd_schd_dspsl_rmrks_VC(info);
		if (vc == Cnd_schd_sub_char1) return doCnd_schd_sub_char1_VC(info);
		if (vc == Cnd_schd_sub_char2) return doCnd_schd_sub_char2_VC(info);
		if (vc == Cnd_schd_sub_char3) return doCnd_schd_sub_char3_VC(info);
		if (vc == Cnd_inst_intr_rmrks) return doCnd_inst_intr_rmrks_VC(info);
		if (vc == Cnd_inst_trd_rmrks) return doCnd_inst_trd_rmrks_VC(info);
		if (vc == Cnd_inst_rmrks) return doCnd_inst_rmrks_VC(info);
		if (vc == Cnd_inst_sub_char1) return doCnd_inst_sub_char1_VC(info);
		if (vc == Cnd_inst_sub_char2) return doCnd_inst_sub_char2_VC(info);
		if (vc == Cnd_inst_sub_char3) return doCnd_inst_sub_char3_VC(info);
		if (vc == Cnd_inst_intr_d_rmrks) return doCnd_inst_intr_d_rmrks_VC(info);
		if (vc == Cnd_inst_trd_d_rmrks) return doCnd_inst_trd_d_rmrks_VC(info);
		if (vc == Cnd_inst_d_rmrks) return doCnd_inst_d_rmrks_VC(info);
		if (vc == Cnd_inst_d_sub_char1) return doCnd_inst_d_sub_char1_VC(info);
		if (vc == Cnd_inst_d_sub_char2) return doCnd_inst_d_sub_char2_VC(info);
		if (vc == Cnd_inst_d_sub_char3) return doCnd_inst_d_sub_char3_VC(info);
		if (vc == Cnd_act_intr_rmrks) return doCnd_act_intr_rmrks_VC(info);
		if (vc == Cnd_act_trd_rmrks) return doCnd_act_trd_rmrks_VC(info);
		if (vc == Cnd_act_sub_char1) return doCnd_act_sub_char1_VC(info);
		if (vc == Cnd_act_sub_char2) return doCnd_act_sub_char2_VC(info);
		if (vc == Cnd_act_sub_char3) return doCnd_act_sub_char3_VC(info);
		if (vc == Cnd_act_intr_d_rmrks) return doCnd_act_intr_d_rmrks_VC(info);
		if (vc == Cnd_act_trd_d_rmrks) return doCnd_act_trd_d_rmrks_VC(info);
		if (vc == Cnd_act_d_sub_char1) return doCnd_act_d_sub_char1_VC(info);
		if (vc == Cnd_act_d_sub_char2) return doCnd_act_d_sub_char2_VC(info);
		if (vc == Cnd_act_d_sub_char3) return doCnd_act_d_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_ver_no) return doRslt_ver_no_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_unit_dec_place) return doRslt_pack_unit_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_dec_place) return doRslt_base_cur_dec_place_VC(info);
		if (vc == columnRslt_rqst_dt) return doRslt_rqst_dt_VC(info);
		if (vc == columnRslt_acxfr_schd_dt) return doRslt_acxfr_schd_dt_VC(info);
		if (vc == columnRslt_acxfr_inst_dt) return doRslt_acxfr_inst_dt_VC(info);
		if (vc == columnRslt_acxfr_act_dt) return doRslt_acxfr_act_dt_VC(info);
		if (vc == columnRslt_acxfr_act_hm) return doRslt_acxfr_act_hm_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_str_ln_cd_none_flg) return doRslt_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_fix_no_typ) return doRslt_fix_no_typ_VC(info);
		if (vc == columnRslt_fix_no_typ_nm) return doRslt_fix_no_typ_nm_VC(info);
		if (vc == columnRslt_fix_no) return doRslt_fix_no_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_rsn_cd) return doRslt_rsn_cd_VC(info);
		if (vc == columnRslt_rsn_nm) return doRslt_rsn_nm_VC(info);
		if (vc == columnRslt_rqst_usr_cd) return doRslt_rqst_usr_cd_VC(info);
		if (vc == columnRslt_rqst_usr_nm) return doRslt_rqst_usr_nm_VC(info);
		if (vc == columnRslt_rqst_dpt_cd) return doRslt_rqst_dpt_cd_VC(info);
		if (vc == columnRslt_rqst_dpt_nm) return doRslt_rqst_dpt_nm_VC(info);
		if (vc == columnRslt_inst_usr_cd) return doRslt_inst_usr_cd_VC(info);
		if (vc == columnRslt_inst_usr_nm) return doRslt_inst_usr_nm_VC(info);
		if (vc == columnRslt_inst_dpt_cd) return doRslt_inst_dpt_cd_VC(info);
		if (vc == columnRslt_inst_dpt_nm) return doRslt_inst_dpt_nm_VC(info);
		if (vc == columnRslt_act_usr_cd) return doRslt_act_usr_cd_VC(info);
		if (vc == columnRslt_act_usr_nm) return doRslt_act_usr_nm_VC(info);
		if (vc == columnRslt_act_dpt_cd) return doRslt_act_dpt_cd_VC(info);
		if (vc == columnRslt_act_dpt_nm) return doRslt_act_dpt_nm_VC(info);
		if (vc == columnRslt_inst_typ) return doRslt_inst_typ_VC(info);
		if (vc == columnRslt_inst_typ_nm) return doRslt_inst_typ_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_trd_ptn_typ_nm) return doRslt_trd_ptn_typ_nm_VC(info);
		if (vc == columnRslt_acxfr_schd_no) return doRslt_acxfr_schd_no_VC(info);
		if (vc == columnRslt_acxfr_schd_rev) return doRslt_acxfr_schd_rev_VC(info);
		if (vc == columnRslt_acxfr_inst_no) return doRslt_acxfr_inst_no_VC(info);
		if (vc == columnRslt_acxfr_inst_d_no) return doRslt_acxfr_inst_d_no_VC(info);
		if (vc == columnRslt_acxfr_act_no) return doRslt_acxfr_act_no_VC(info);
		if (vc == columnRslt_acxfr_act_d_no) return doRslt_acxfr_act_d_no_VC(info);
		if (vc == columnRslt_wms_flg) return doRslt_wms_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_acxfr_act_no) return doRslt_ext_acxfr_act_no_VC(info);
		if (vc == columnRslt_acxfr_act_rev) return doRslt_acxfr_act_rev_VC(info);
		if (vc == columnRslt_dspsl_no) return doRslt_dspsl_no_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_aprv_flg) return doRslt_aprv_flg_VC(info);
		if (vc == columnRslt_aprv_no) return doRslt_aprv_no_VC(info);
		if (vc == columnRslt_aprv_sts_typ) return doRslt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_aprv_sts_typ_nm) return doRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_schd_trd_d_rmrks) return doRslt_schd_trd_d_rmrks_VC(info);
		if (vc == columnRslt_schd_dspsl_rmrks) return doRslt_schd_dspsl_rmrks_VC(info);
		if (vc == columnRslt_schd_sub_char1) return doRslt_schd_sub_char1_VC(info);
		if (vc == columnRslt_schd_sub_char2) return doRslt_schd_sub_char2_VC(info);
		if (vc == columnRslt_schd_sub_char3) return doRslt_schd_sub_char3_VC(info);
		if (vc == columnRslt_inst_intr_rmrks) return doRslt_inst_intr_rmrks_VC(info);
		if (vc == columnRslt_inst_trd_rmrks) return doRslt_inst_trd_rmrks_VC(info);
		if (vc == columnRslt_inst_rmrks) return doRslt_inst_rmrks_VC(info);
		if (vc == columnRslt_inst_sub_char1) return doRslt_inst_sub_char1_VC(info);
		if (vc == columnRslt_inst_sub_char2) return doRslt_inst_sub_char2_VC(info);
		if (vc == columnRslt_inst_sub_char3) return doRslt_inst_sub_char3_VC(info);
		if (vc == columnRslt_inst_intr_d_rmrks) return doRslt_inst_intr_d_rmrks_VC(info);
		if (vc == columnRslt_inst_trd_d_rmrks) return doRslt_inst_trd_d_rmrks_VC(info);
		if (vc == columnRslt_inst_d_rmrks) return doRslt_inst_d_rmrks_VC(info);
		if (vc == columnRslt_inst_d_sub_char1) return doRslt_inst_d_sub_char1_VC(info);
		if (vc == columnRslt_inst_d_sub_char2) return doRslt_inst_d_sub_char2_VC(info);
		if (vc == columnRslt_inst_d_sub_char3) return doRslt_inst_d_sub_char3_VC(info);
		if (vc == columnRslt_act_intr_rmrks) return doRslt_act_intr_rmrks_VC(info);
		if (vc == columnRslt_act_trd_rmrks) return doRslt_act_trd_rmrks_VC(info);
		if (vc == columnRslt_act_sub_char1) return doRslt_act_sub_char1_VC(info);
		if (vc == columnRslt_act_sub_char2) return doRslt_act_sub_char2_VC(info);
		if (vc == columnRslt_act_sub_char3) return doRslt_act_sub_char3_VC(info);
		if (vc == columnRslt_act_intr_d_rmrks) return doRslt_act_intr_d_rmrks_VC(info);
		if (vc == columnRslt_act_trd_d_rmrks) return doRslt_act_trd_d_rmrks_VC(info);
		if (vc == columnRslt_act_d_sub_char1) return doRslt_act_d_sub_char1_VC(info);
		if (vc == columnRslt_act_d_sub_char2) return doRslt_act_d_sub_char2_VC(info);
		if (vc == columnRslt_act_d_sub_char3) return doRslt_act_d_sub_char3_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_inst_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[part_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_ptn_typ_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[acxfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_acxfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_acxfr_act_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_inst_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acxfr_inst_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dspsl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dspsl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_no_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_no_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dspsl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dspsl_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_d_sub_char3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_trd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_d_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_none_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_schd_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wms_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_acxfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_acxfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acxfr_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dspsl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dspsl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_dspsl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_dspsl_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_d_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_trd_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_d_sub_char3_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_not_inst_flg) doCnd_not_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_part_comp_flg) doCnd_part_comp_flg_NC(info);
		else if (nc == Cnd_comp_flg) doCnd_comp_flg_NC(info);
		else if (nc == Cnd_wms_flg) doCnd_wms_flg_NC(info);
		else if (nc == Cnd_not_wms_flg) doCnd_not_wms_flg_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_trd_ptn_typ) doCnd_trd_ptn_typ_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_acxfr_schd_no) doCnd_acxfr_schd_no_NC(info);
		else if (nc == Cnd_acxfr_inst_no) doCnd_acxfr_inst_no_NC(info);
		else if (nc == Cnd_acxfr_inst_d_no) doCnd_acxfr_inst_d_no_NC(info);
		else if (nc == Cnd_acxfr_act_no) doCnd_acxfr_act_no_NC(info);
		else if (nc == Cnd_acxfr_act_d_no) doCnd_acxfr_act_d_no_NC(info);
		else if (nc == Cnd_ext_acxfr_act_no) doCnd_ext_acxfr_act_no_NC(info);
		else if (nc == Cnd_abort_flg) doCnd_abort_flg_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NC(info);
		else if (nc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NC(info);
		else if (nc == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NC(info);
		else if (nc == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NC(info);
		else if (nc == Cnd_acxfr_schd_dt_fr) doCnd_acxfr_schd_dt_fr_NC(info);
		else if (nc == Cnd_acxfr_schd_dt_to) doCnd_acxfr_schd_dt_to_NC(info);
		else if (nc == Cnd_acxfr_inst_dt_fr) doCnd_acxfr_inst_dt_fr_NC(info);
		else if (nc == Cnd_acxfr_inst_dt_to) doCnd_acxfr_inst_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_rsn_cd) doCnd_rsn_cd_NC(info);
		else if (nc == Cnd_rsn_nm) doCnd_rsn_nm_NC(info);
		else if (nc == Cnd_dspsl_no) doCnd_dspsl_no_NC(info);
		else if (nc == Cnd_schd_no_aprv_flg) doCnd_schd_no_aprv_flg_NC(info);
		else if (nc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NC(info);
		else if (nc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NC(info);
		else if (nc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NC(info);
		else if (nc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NC(info);
		else if (nc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NC(info);
		else if (nc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NC(info);
		else if (nc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NC(info);
		else if (nc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NC(info);
		else if (nc == Cnd_act_usr_cd) doCnd_act_usr_cd_NC(info);
		else if (nc == Cnd_act_usr_nm) doCnd_act_usr_nm_NC(info);
		else if (nc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NC(info);
		else if (nc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NC(info);
		else if (nc == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_schd_dspsl_rmrks) doCnd_schd_dspsl_rmrks_NC(info);
		else if (nc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NC(info);
		else if (nc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NC(info);
		else if (nc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NC(info);
		else if (nc == Cnd_inst_intr_rmrks) doCnd_inst_intr_rmrks_NC(info);
		else if (nc == Cnd_inst_trd_rmrks) doCnd_inst_trd_rmrks_NC(info);
		else if (nc == Cnd_inst_rmrks) doCnd_inst_rmrks_NC(info);
		else if (nc == Cnd_inst_sub_char1) doCnd_inst_sub_char1_NC(info);
		else if (nc == Cnd_inst_sub_char2) doCnd_inst_sub_char2_NC(info);
		else if (nc == Cnd_inst_sub_char3) doCnd_inst_sub_char3_NC(info);
		else if (nc == Cnd_inst_intr_d_rmrks) doCnd_inst_intr_d_rmrks_NC(info);
		else if (nc == Cnd_inst_trd_d_rmrks) doCnd_inst_trd_d_rmrks_NC(info);
		else if (nc == Cnd_inst_d_rmrks) doCnd_inst_d_rmrks_NC(info);
		else if (nc == Cnd_inst_d_sub_char1) doCnd_inst_d_sub_char1_NC(info);
		else if (nc == Cnd_inst_d_sub_char2) doCnd_inst_d_sub_char2_NC(info);
		else if (nc == Cnd_inst_d_sub_char3) doCnd_inst_d_sub_char3_NC(info);
		else if (nc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NC(info);
		else if (nc == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NC(info);
		else if (nc == Cnd_act_sub_char1) doCnd_act_sub_char1_NC(info);
		else if (nc == Cnd_act_sub_char2) doCnd_act_sub_char2_NC(info);
		else if (nc == Cnd_act_sub_char3) doCnd_act_sub_char3_NC(info);
		else if (nc == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NC(info);
		else if (nc == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NC(info);
		else if (nc == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NC(info);
		else if (nc == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NC(info);
		else if (nc == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_ver_no) doRslt_ver_no_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_dec_place) doRslt_base_cur_dec_place_NC(info);
		else if (nc == columnRslt_rqst_dt) doRslt_rqst_dt_NC(info);
		else if (nc == columnRslt_acxfr_schd_dt) doRslt_acxfr_schd_dt_NC(info);
		else if (nc == columnRslt_acxfr_inst_dt) doRslt_acxfr_inst_dt_NC(info);
		else if (nc == columnRslt_acxfr_act_dt) doRslt_acxfr_act_dt_NC(info);
		else if (nc == columnRslt_acxfr_act_hm) doRslt_acxfr_act_hm_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_fix_no_typ) doRslt_fix_no_typ_NC(info);
		else if (nc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NC(info);
		else if (nc == columnRslt_fix_no) doRslt_fix_no_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_rsn_cd) doRslt_rsn_cd_NC(info);
		else if (nc == columnRslt_rsn_nm) doRslt_rsn_nm_NC(info);
		else if (nc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NC(info);
		else if (nc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NC(info);
		else if (nc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NC(info);
		else if (nc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NC(info);
		else if (nc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NC(info);
		else if (nc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NC(info);
		else if (nc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NC(info);
		else if (nc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NC(info);
		else if (nc == columnRslt_act_usr_cd) doRslt_act_usr_cd_NC(info);
		else if (nc == columnRslt_act_usr_nm) doRslt_act_usr_nm_NC(info);
		else if (nc == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NC(info);
		else if (nc == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NC(info);
		else if (nc == columnRslt_inst_typ) doRslt_inst_typ_NC(info);
		else if (nc == columnRslt_inst_typ_nm) doRslt_inst_typ_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRslt_acxfr_schd_no) doRslt_acxfr_schd_no_NC(info);
		else if (nc == columnRslt_acxfr_schd_rev) doRslt_acxfr_schd_rev_NC(info);
		else if (nc == columnRslt_acxfr_inst_no) doRslt_acxfr_inst_no_NC(info);
		else if (nc == columnRslt_acxfr_inst_d_no) doRslt_acxfr_inst_d_no_NC(info);
		else if (nc == columnRslt_acxfr_act_no) doRslt_acxfr_act_no_NC(info);
		else if (nc == columnRslt_acxfr_act_d_no) doRslt_acxfr_act_d_no_NC(info);
		else if (nc == columnRslt_wms_flg) doRslt_wms_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_acxfr_act_no) doRslt_ext_acxfr_act_no_NC(info);
		else if (nc == columnRslt_acxfr_act_rev) doRslt_acxfr_act_rev_NC(info);
		else if (nc == columnRslt_dspsl_no) doRslt_dspsl_no_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_aprv_flg) doRslt_aprv_flg_NC(info);
		else if (nc == columnRslt_aprv_no) doRslt_aprv_no_NC(info);
		else if (nc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_schd_dspsl_rmrks) doRslt_schd_dspsl_rmrks_NC(info);
		else if (nc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NC(info);
		else if (nc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NC(info);
		else if (nc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NC(info);
		else if (nc == columnRslt_inst_intr_rmrks) doRslt_inst_intr_rmrks_NC(info);
		else if (nc == columnRslt_inst_trd_rmrks) doRslt_inst_trd_rmrks_NC(info);
		else if (nc == columnRslt_inst_rmrks) doRslt_inst_rmrks_NC(info);
		else if (nc == columnRslt_inst_sub_char1) doRslt_inst_sub_char1_NC(info);
		else if (nc == columnRslt_inst_sub_char2) doRslt_inst_sub_char2_NC(info);
		else if (nc == columnRslt_inst_sub_char3) doRslt_inst_sub_char3_NC(info);
		else if (nc == columnRslt_inst_intr_d_rmrks) doRslt_inst_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_inst_trd_d_rmrks) doRslt_inst_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NC(info);
		else if (nc == columnRslt_inst_d_sub_char1) doRslt_inst_d_sub_char1_NC(info);
		else if (nc == columnRslt_inst_d_sub_char2) doRslt_inst_d_sub_char2_NC(info);
		else if (nc == columnRslt_inst_d_sub_char3) doRslt_inst_d_sub_char3_NC(info);
		else if (nc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NC(info);
		else if (nc == columnRslt_act_sub_char1) doRslt_act_sub_char1_NC(info);
		else if (nc == columnRslt_act_sub_char2) doRslt_act_sub_char2_NC(info);
		else if (nc == columnRslt_act_sub_char3) doRslt_act_sub_char3_NC(info);
		else if (nc == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[acxfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_acxfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_acxfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dspsl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dspsl_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_no_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_no_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dspsl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dspsl_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_acxfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_acxfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dspsl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dspsl_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dspsl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dspsl_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char3_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_not_inst_flg) doCnd_not_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_part_comp_flg) doCnd_part_comp_flg_NE(info);
		else if (ne == Cnd_comp_flg) doCnd_comp_flg_NE(info);
		else if (ne == Cnd_wms_flg) doCnd_wms_flg_NE(info);
		else if (ne == Cnd_not_wms_flg) doCnd_not_wms_flg_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_trd_ptn_typ) doCnd_trd_ptn_typ_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_acxfr_schd_no) doCnd_acxfr_schd_no_NE(info);
		else if (ne == Cnd_acxfr_inst_no) doCnd_acxfr_inst_no_NE(info);
		else if (ne == Cnd_acxfr_inst_d_no) doCnd_acxfr_inst_d_no_NE(info);
		else if (ne == Cnd_acxfr_act_no) doCnd_acxfr_act_no_NE(info);
		else if (ne == Cnd_acxfr_act_d_no) doCnd_acxfr_act_d_no_NE(info);
		else if (ne == Cnd_ext_acxfr_act_no) doCnd_ext_acxfr_act_no_NE(info);
		else if (ne == Cnd_abort_flg) doCnd_abort_flg_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NE(info);
		else if (ne == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NE(info);
		else if (ne == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NE(info);
		else if (ne == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NE(info);
		else if (ne == Cnd_acxfr_schd_dt_fr) doCnd_acxfr_schd_dt_fr_NE(info);
		else if (ne == Cnd_acxfr_schd_dt_to) doCnd_acxfr_schd_dt_to_NE(info);
		else if (ne == Cnd_acxfr_inst_dt_fr) doCnd_acxfr_inst_dt_fr_NE(info);
		else if (ne == Cnd_acxfr_inst_dt_to) doCnd_acxfr_inst_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_rsn_cd) doCnd_rsn_cd_NE(info);
		else if (ne == Cnd_rsn_nm) doCnd_rsn_nm_NE(info);
		else if (ne == Cnd_dspsl_no) doCnd_dspsl_no_NE(info);
		else if (ne == Cnd_schd_no_aprv_flg) doCnd_schd_no_aprv_flg_NE(info);
		else if (ne == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NE(info);
		else if (ne == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NE(info);
		else if (ne == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NE(info);
		else if (ne == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NE(info);
		else if (ne == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NE(info);
		else if (ne == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NE(info);
		else if (ne == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NE(info);
		else if (ne == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NE(info);
		else if (ne == Cnd_act_usr_cd) doCnd_act_usr_cd_NE(info);
		else if (ne == Cnd_act_usr_nm) doCnd_act_usr_nm_NE(info);
		else if (ne == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NE(info);
		else if (ne == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NE(info);
		else if (ne == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_schd_dspsl_rmrks) doCnd_schd_dspsl_rmrks_NE(info);
		else if (ne == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NE(info);
		else if (ne == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NE(info);
		else if (ne == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NE(info);
		else if (ne == Cnd_inst_intr_rmrks) doCnd_inst_intr_rmrks_NE(info);
		else if (ne == Cnd_inst_trd_rmrks) doCnd_inst_trd_rmrks_NE(info);
		else if (ne == Cnd_inst_rmrks) doCnd_inst_rmrks_NE(info);
		else if (ne == Cnd_inst_sub_char1) doCnd_inst_sub_char1_NE(info);
		else if (ne == Cnd_inst_sub_char2) doCnd_inst_sub_char2_NE(info);
		else if (ne == Cnd_inst_sub_char3) doCnd_inst_sub_char3_NE(info);
		else if (ne == Cnd_inst_intr_d_rmrks) doCnd_inst_intr_d_rmrks_NE(info);
		else if (ne == Cnd_inst_trd_d_rmrks) doCnd_inst_trd_d_rmrks_NE(info);
		else if (ne == Cnd_inst_d_rmrks) doCnd_inst_d_rmrks_NE(info);
		else if (ne == Cnd_inst_d_sub_char1) doCnd_inst_d_sub_char1_NE(info);
		else if (ne == Cnd_inst_d_sub_char2) doCnd_inst_d_sub_char2_NE(info);
		else if (ne == Cnd_inst_d_sub_char3) doCnd_inst_d_sub_char3_NE(info);
		else if (ne == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NE(info);
		else if (ne == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NE(info);
		else if (ne == Cnd_act_sub_char1) doCnd_act_sub_char1_NE(info);
		else if (ne == Cnd_act_sub_char2) doCnd_act_sub_char2_NE(info);
		else if (ne == Cnd_act_sub_char3) doCnd_act_sub_char3_NE(info);
		else if (ne == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NE(info);
		else if (ne == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NE(info);
		else if (ne == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NE(info);
		else if (ne == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NE(info);
		else if (ne == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_ver_no) doRslt_ver_no_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_dec_place) doRslt_base_cur_dec_place_NE(info);
		else if (ne == columnRslt_rqst_dt) doRslt_rqst_dt_NE(info);
		else if (ne == columnRslt_acxfr_schd_dt) doRslt_acxfr_schd_dt_NE(info);
		else if (ne == columnRslt_acxfr_inst_dt) doRslt_acxfr_inst_dt_NE(info);
		else if (ne == columnRslt_acxfr_act_dt) doRslt_acxfr_act_dt_NE(info);
		else if (ne == columnRslt_acxfr_act_hm) doRslt_acxfr_act_hm_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_fix_no_typ) doRslt_fix_no_typ_NE(info);
		else if (ne == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NE(info);
		else if (ne == columnRslt_fix_no) doRslt_fix_no_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_rsn_cd) doRslt_rsn_cd_NE(info);
		else if (ne == columnRslt_rsn_nm) doRslt_rsn_nm_NE(info);
		else if (ne == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NE(info);
		else if (ne == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NE(info);
		else if (ne == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NE(info);
		else if (ne == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NE(info);
		else if (ne == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NE(info);
		else if (ne == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NE(info);
		else if (ne == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NE(info);
		else if (ne == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NE(info);
		else if (ne == columnRslt_act_usr_cd) doRslt_act_usr_cd_NE(info);
		else if (ne == columnRslt_act_usr_nm) doRslt_act_usr_nm_NE(info);
		else if (ne == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NE(info);
		else if (ne == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NE(info);
		else if (ne == columnRslt_inst_typ) doRslt_inst_typ_NE(info);
		else if (ne == columnRslt_inst_typ_nm) doRslt_inst_typ_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRslt_acxfr_schd_no) doRslt_acxfr_schd_no_NE(info);
		else if (ne == columnRslt_acxfr_schd_rev) doRslt_acxfr_schd_rev_NE(info);
		else if (ne == columnRslt_acxfr_inst_no) doRslt_acxfr_inst_no_NE(info);
		else if (ne == columnRslt_acxfr_inst_d_no) doRslt_acxfr_inst_d_no_NE(info);
		else if (ne == columnRslt_acxfr_act_no) doRslt_acxfr_act_no_NE(info);
		else if (ne == columnRslt_acxfr_act_d_no) doRslt_acxfr_act_d_no_NE(info);
		else if (ne == columnRslt_wms_flg) doRslt_wms_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_acxfr_act_no) doRslt_ext_acxfr_act_no_NE(info);
		else if (ne == columnRslt_acxfr_act_rev) doRslt_acxfr_act_rev_NE(info);
		else if (ne == columnRslt_dspsl_no) doRslt_dspsl_no_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_aprv_flg) doRslt_aprv_flg_NE(info);
		else if (ne == columnRslt_aprv_no) doRslt_aprv_no_NE(info);
		else if (ne == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_schd_dspsl_rmrks) doRslt_schd_dspsl_rmrks_NE(info);
		else if (ne == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NE(info);
		else if (ne == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NE(info);
		else if (ne == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NE(info);
		else if (ne == columnRslt_inst_intr_rmrks) doRslt_inst_intr_rmrks_NE(info);
		else if (ne == columnRslt_inst_trd_rmrks) doRslt_inst_trd_rmrks_NE(info);
		else if (ne == columnRslt_inst_rmrks) doRslt_inst_rmrks_NE(info);
		else if (ne == columnRslt_inst_sub_char1) doRslt_inst_sub_char1_NE(info);
		else if (ne == columnRslt_inst_sub_char2) doRslt_inst_sub_char2_NE(info);
		else if (ne == columnRslt_inst_sub_char3) doRslt_inst_sub_char3_NE(info);
		else if (ne == columnRslt_inst_intr_d_rmrks) doRslt_inst_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_inst_trd_d_rmrks) doRslt_inst_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NE(info);
		else if (ne == columnRslt_inst_d_sub_char1) doRslt_inst_d_sub_char1_NE(info);
		else if (ne == columnRslt_inst_d_sub_char2) doRslt_inst_d_sub_char2_NE(info);
		else if (ne == columnRslt_inst_d_sub_char3) doRslt_inst_d_sub_char3_NE(info);
		else if (ne == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NE(info);
		else if (ne == columnRslt_act_sub_char1) doRslt_act_sub_char1_NE(info);
		else if (ne == columnRslt_act_sub_char2) doRslt_act_sub_char2_NE(info);
		else if (ne == columnRslt_act_sub_char3) doRslt_act_sub_char3_NE(info);
		else if (ne == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[acxfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_acxfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_acxfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dspsl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dspsl_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_no_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_no_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dspsl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dspsl_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[act_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_acxfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_acxfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dspsl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dspsl_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dspsl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dspsl_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char3_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_not_inst_flg) doCnd_not_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_part_comp_flg) doCnd_part_comp_flg_NX(info);
		else if (nx == Cnd_comp_flg) doCnd_comp_flg_NX(info);
		else if (nx == Cnd_wms_flg) doCnd_wms_flg_NX(info);
		else if (nx == Cnd_not_wms_flg) doCnd_not_wms_flg_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_trd_ptn_typ) doCnd_trd_ptn_typ_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_acxfr_schd_no) doCnd_acxfr_schd_no_NX(info);
		else if (nx == Cnd_acxfr_inst_no) doCnd_acxfr_inst_no_NX(info);
		else if (nx == Cnd_acxfr_inst_d_no) doCnd_acxfr_inst_d_no_NX(info);
		else if (nx == Cnd_acxfr_act_no) doCnd_acxfr_act_no_NX(info);
		else if (nx == Cnd_acxfr_act_d_no) doCnd_acxfr_act_d_no_NX(info);
		else if (nx == Cnd_ext_acxfr_act_no) doCnd_ext_acxfr_act_no_NX(info);
		else if (nx == Cnd_abort_flg) doCnd_abort_flg_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_NX(info);
		else if (nx == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_NX(info);
		else if (nx == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_NX(info);
		else if (nx == Cnd_rqst_dt_to) doCnd_rqst_dt_to_NX(info);
		else if (nx == Cnd_acxfr_schd_dt_fr) doCnd_acxfr_schd_dt_fr_NX(info);
		else if (nx == Cnd_acxfr_schd_dt_to) doCnd_acxfr_schd_dt_to_NX(info);
		else if (nx == Cnd_acxfr_inst_dt_fr) doCnd_acxfr_inst_dt_fr_NX(info);
		else if (nx == Cnd_acxfr_inst_dt_to) doCnd_acxfr_inst_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_rsn_cd) doCnd_rsn_cd_NX(info);
		else if (nx == Cnd_rsn_nm) doCnd_rsn_nm_NX(info);
		else if (nx == Cnd_dspsl_no) doCnd_dspsl_no_NX(info);
		else if (nx == Cnd_schd_no_aprv_flg) doCnd_schd_no_aprv_flg_NX(info);
		else if (nx == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_NX(info);
		else if (nx == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_NX(info);
		else if (nx == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_NX(info);
		else if (nx == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_NX(info);
		else if (nx == Cnd_inst_usr_cd) doCnd_inst_usr_cd_NX(info);
		else if (nx == Cnd_inst_usr_nm) doCnd_inst_usr_nm_NX(info);
		else if (nx == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_NX(info);
		else if (nx == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_NX(info);
		else if (nx == Cnd_act_usr_cd) doCnd_act_usr_cd_NX(info);
		else if (nx == Cnd_act_usr_nm) doCnd_act_usr_nm_NX(info);
		else if (nx == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NX(info);
		else if (nx == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NX(info);
		else if (nx == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_schd_dspsl_rmrks) doCnd_schd_dspsl_rmrks_NX(info);
		else if (nx == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NX(info);
		else if (nx == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NX(info);
		else if (nx == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NX(info);
		else if (nx == Cnd_inst_intr_rmrks) doCnd_inst_intr_rmrks_NX(info);
		else if (nx == Cnd_inst_trd_rmrks) doCnd_inst_trd_rmrks_NX(info);
		else if (nx == Cnd_inst_rmrks) doCnd_inst_rmrks_NX(info);
		else if (nx == Cnd_inst_sub_char1) doCnd_inst_sub_char1_NX(info);
		else if (nx == Cnd_inst_sub_char2) doCnd_inst_sub_char2_NX(info);
		else if (nx == Cnd_inst_sub_char3) doCnd_inst_sub_char3_NX(info);
		else if (nx == Cnd_inst_intr_d_rmrks) doCnd_inst_intr_d_rmrks_NX(info);
		else if (nx == Cnd_inst_trd_d_rmrks) doCnd_inst_trd_d_rmrks_NX(info);
		else if (nx == Cnd_inst_d_rmrks) doCnd_inst_d_rmrks_NX(info);
		else if (nx == Cnd_inst_d_sub_char1) doCnd_inst_d_sub_char1_NX(info);
		else if (nx == Cnd_inst_d_sub_char2) doCnd_inst_d_sub_char2_NX(info);
		else if (nx == Cnd_inst_d_sub_char3) doCnd_inst_d_sub_char3_NX(info);
		else if (nx == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NX(info);
		else if (nx == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NX(info);
		else if (nx == Cnd_act_sub_char1) doCnd_act_sub_char1_NX(info);
		else if (nx == Cnd_act_sub_char2) doCnd_act_sub_char2_NX(info);
		else if (nx == Cnd_act_sub_char3) doCnd_act_sub_char3_NX(info);
		else if (nx == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NX(info);
		else if (nx == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NX(info);
		else if (nx == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NX(info);
		else if (nx == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NX(info);
		else if (nx == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_ver_no) doRslt_ver_no_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_dec_place) doRslt_base_cur_dec_place_NX(info);
		else if (nx == columnRslt_rqst_dt) doRslt_rqst_dt_NX(info);
		else if (nx == columnRslt_acxfr_schd_dt) doRslt_acxfr_schd_dt_NX(info);
		else if (nx == columnRslt_acxfr_inst_dt) doRslt_acxfr_inst_dt_NX(info);
		else if (nx == columnRslt_acxfr_act_dt) doRslt_acxfr_act_dt_NX(info);
		else if (nx == columnRslt_acxfr_act_hm) doRslt_acxfr_act_hm_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_fix_no_typ) doRslt_fix_no_typ_NX(info);
		else if (nx == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NX(info);
		else if (nx == columnRslt_fix_no) doRslt_fix_no_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_rsn_cd) doRslt_rsn_cd_NX(info);
		else if (nx == columnRslt_rsn_nm) doRslt_rsn_nm_NX(info);
		else if (nx == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_NX(info);
		else if (nx == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_NX(info);
		else if (nx == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_NX(info);
		else if (nx == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_NX(info);
		else if (nx == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_NX(info);
		else if (nx == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_NX(info);
		else if (nx == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_NX(info);
		else if (nx == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_NX(info);
		else if (nx == columnRslt_act_usr_cd) doRslt_act_usr_cd_NX(info);
		else if (nx == columnRslt_act_usr_nm) doRslt_act_usr_nm_NX(info);
		else if (nx == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NX(info);
		else if (nx == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NX(info);
		else if (nx == columnRslt_inst_typ) doRslt_inst_typ_NX(info);
		else if (nx == columnRslt_inst_typ_nm) doRslt_inst_typ_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRslt_acxfr_schd_no) doRslt_acxfr_schd_no_NX(info);
		else if (nx == columnRslt_acxfr_schd_rev) doRslt_acxfr_schd_rev_NX(info);
		else if (nx == columnRslt_acxfr_inst_no) doRslt_acxfr_inst_no_NX(info);
		else if (nx == columnRslt_acxfr_inst_d_no) doRslt_acxfr_inst_d_no_NX(info);
		else if (nx == columnRslt_acxfr_act_no) doRslt_acxfr_act_no_NX(info);
		else if (nx == columnRslt_acxfr_act_d_no) doRslt_acxfr_act_d_no_NX(info);
		else if (nx == columnRslt_wms_flg) doRslt_wms_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_acxfr_act_no) doRslt_ext_acxfr_act_no_NX(info);
		else if (nx == columnRslt_acxfr_act_rev) doRslt_acxfr_act_rev_NX(info);
		else if (nx == columnRslt_dspsl_no) doRslt_dspsl_no_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_aprv_flg) doRslt_aprv_flg_NX(info);
		else if (nx == columnRslt_aprv_no) doRslt_aprv_no_NX(info);
		else if (nx == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_schd_dspsl_rmrks) doRslt_schd_dspsl_rmrks_NX(info);
		else if (nx == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NX(info);
		else if (nx == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NX(info);
		else if (nx == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NX(info);
		else if (nx == columnRslt_inst_intr_rmrks) doRslt_inst_intr_rmrks_NX(info);
		else if (nx == columnRslt_inst_trd_rmrks) doRslt_inst_trd_rmrks_NX(info);
		else if (nx == columnRslt_inst_rmrks) doRslt_inst_rmrks_NX(info);
		else if (nx == columnRslt_inst_sub_char1) doRslt_inst_sub_char1_NX(info);
		else if (nx == columnRslt_inst_sub_char2) doRslt_inst_sub_char2_NX(info);
		else if (nx == columnRslt_inst_sub_char3) doRslt_inst_sub_char3_NX(info);
		else if (nx == columnRslt_inst_intr_d_rmrks) doRslt_inst_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_inst_trd_d_rmrks) doRslt_inst_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_NX(info);
		else if (nx == columnRslt_inst_d_sub_char1) doRslt_inst_d_sub_char1_NX(info);
		else if (nx == columnRslt_inst_d_sub_char2) doRslt_inst_d_sub_char2_NX(info);
		else if (nx == columnRslt_inst_d_sub_char3) doRslt_inst_d_sub_char3_NX(info);
		else if (nx == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NX(info);
		else if (nx == columnRslt_act_sub_char1) doRslt_act_sub_char1_NX(info);
		else if (nx == columnRslt_act_sub_char2) doRslt_act_sub_char2_NX(info);
		else if (nx == columnRslt_act_sub_char3) doRslt_act_sub_char3_NX(info);
		else if (nx == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[acxfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_acxfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_acxfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dspsl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dspsl_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_no_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_no_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dspsl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dspsl_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[act_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wms_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_acxfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_acxfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dspsl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dspsl_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dspsl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dspsl_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char3_NX(MCEventInfo info){
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
		if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_ptn_typ) doCnd_trd_ptn_typ_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_acxfr_schd_no) doCnd_acxfr_schd_no_LC(info);
		else if (lc == Cnd_acxfr_inst_no) doCnd_acxfr_inst_no_LC(info);
		else if (lc == Cnd_acxfr_inst_d_no) doCnd_acxfr_inst_d_no_LC(info);
		else if (lc == Cnd_acxfr_act_no) doCnd_acxfr_act_no_LC(info);
		else if (lc == Cnd_acxfr_act_d_no) doCnd_acxfr_act_d_no_LC(info);
		else if (lc == Cnd_ext_acxfr_act_no) doCnd_ext_acxfr_act_no_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_bd_dpt_cd) doCnd_bd_dpt_cd_LC(info);
		else if (lc == Cnd_bd_dpt_nm) doCnd_bd_dpt_nm_LC(info);
		else if (lc == Cnd_rqst_dt_fr) doCnd_rqst_dt_fr_LC(info);
		else if (lc == Cnd_rqst_dt_to) doCnd_rqst_dt_to_LC(info);
		else if (lc == Cnd_acxfr_schd_dt_fr) doCnd_acxfr_schd_dt_fr_LC(info);
		else if (lc == Cnd_acxfr_schd_dt_to) doCnd_acxfr_schd_dt_to_LC(info);
		else if (lc == Cnd_acxfr_inst_dt_fr) doCnd_acxfr_inst_dt_fr_LC(info);
		else if (lc == Cnd_acxfr_inst_dt_to) doCnd_acxfr_inst_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_rsn_cd) doCnd_rsn_cd_LC(info);
		else if (lc == Cnd_rsn_nm) doCnd_rsn_nm_LC(info);
		else if (lc == Cnd_dspsl_no) doCnd_dspsl_no_LC(info);
		else if (lc == Cnd_rqst_usr_cd) doCnd_rqst_usr_cd_LC(info);
		else if (lc == Cnd_rqst_usr_nm) doCnd_rqst_usr_nm_LC(info);
		else if (lc == Cnd_rqst_dpt_cd) doCnd_rqst_dpt_cd_LC(info);
		else if (lc == Cnd_rqst_dpt_nm) doCnd_rqst_dpt_nm_LC(info);
		else if (lc == Cnd_inst_usr_cd) doCnd_inst_usr_cd_LC(info);
		else if (lc == Cnd_inst_usr_nm) doCnd_inst_usr_nm_LC(info);
		else if (lc == Cnd_inst_dpt_cd) doCnd_inst_dpt_cd_LC(info);
		else if (lc == Cnd_inst_dpt_nm) doCnd_inst_dpt_nm_LC(info);
		else if (lc == Cnd_act_usr_cd) doCnd_act_usr_cd_LC(info);
		else if (lc == Cnd_act_usr_nm) doCnd_act_usr_nm_LC(info);
		else if (lc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_LC(info);
		else if (lc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_LC(info);
		else if (lc == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_schd_dspsl_rmrks) doCnd_schd_dspsl_rmrks_LC(info);
		else if (lc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_LC(info);
		else if (lc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_LC(info);
		else if (lc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_LC(info);
		else if (lc == Cnd_inst_intr_rmrks) doCnd_inst_intr_rmrks_LC(info);
		else if (lc == Cnd_inst_trd_rmrks) doCnd_inst_trd_rmrks_LC(info);
		else if (lc == Cnd_inst_rmrks) doCnd_inst_rmrks_LC(info);
		else if (lc == Cnd_inst_sub_char1) doCnd_inst_sub_char1_LC(info);
		else if (lc == Cnd_inst_sub_char2) doCnd_inst_sub_char2_LC(info);
		else if (lc == Cnd_inst_sub_char3) doCnd_inst_sub_char3_LC(info);
		else if (lc == Cnd_inst_intr_d_rmrks) doCnd_inst_intr_d_rmrks_LC(info);
		else if (lc == Cnd_inst_trd_d_rmrks) doCnd_inst_trd_d_rmrks_LC(info);
		else if (lc == Cnd_inst_d_rmrks) doCnd_inst_d_rmrks_LC(info);
		else if (lc == Cnd_inst_d_sub_char1) doCnd_inst_d_sub_char1_LC(info);
		else if (lc == Cnd_inst_d_sub_char2) doCnd_inst_d_sub_char2_LC(info);
		else if (lc == Cnd_inst_d_sub_char3) doCnd_inst_d_sub_char3_LC(info);
		else if (lc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_LC(info);
		else if (lc == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_LC(info);
		else if (lc == Cnd_act_sub_char1) doCnd_act_sub_char1_LC(info);
		else if (lc == Cnd_act_sub_char2) doCnd_act_sub_char2_LC(info);
		else if (lc == Cnd_act_sub_char3) doCnd_act_sub_char3_LC(info);
		else if (lc == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_LC(info);
		else if (lc == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_LC(info);
		else if (lc == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_LC(info);
		else if (lc == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_LC(info);
		else if (lc == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_ver_no) doRslt_ver_no_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_dec_place) doRslt_base_cur_dec_place_LC(info);
		else if (lc == columnRslt_rqst_dt) doRslt_rqst_dt_LC(info);
		else if (lc == columnRslt_acxfr_schd_dt) doRslt_acxfr_schd_dt_LC(info);
		else if (lc == columnRslt_acxfr_inst_dt) doRslt_acxfr_inst_dt_LC(info);
		else if (lc == columnRslt_acxfr_act_dt) doRslt_acxfr_act_dt_LC(info);
		else if (lc == columnRslt_acxfr_act_hm) doRslt_acxfr_act_hm_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_fix_no_typ) doRslt_fix_no_typ_LC(info);
		else if (lc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_LC(info);
		else if (lc == columnRslt_fix_no) doRslt_fix_no_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_rsn_cd) doRslt_rsn_cd_LC(info);
		else if (lc == columnRslt_rsn_nm) doRslt_rsn_nm_LC(info);
		else if (lc == columnRslt_rqst_usr_cd) doRslt_rqst_usr_cd_LC(info);
		else if (lc == columnRslt_rqst_usr_nm) doRslt_rqst_usr_nm_LC(info);
		else if (lc == columnRslt_rqst_dpt_cd) doRslt_rqst_dpt_cd_LC(info);
		else if (lc == columnRslt_rqst_dpt_nm) doRslt_rqst_dpt_nm_LC(info);
		else if (lc == columnRslt_inst_usr_cd) doRslt_inst_usr_cd_LC(info);
		else if (lc == columnRslt_inst_usr_nm) doRslt_inst_usr_nm_LC(info);
		else if (lc == columnRslt_inst_dpt_cd) doRslt_inst_dpt_cd_LC(info);
		else if (lc == columnRslt_inst_dpt_nm) doRslt_inst_dpt_nm_LC(info);
		else if (lc == columnRslt_act_usr_cd) doRslt_act_usr_cd_LC(info);
		else if (lc == columnRslt_act_usr_nm) doRslt_act_usr_nm_LC(info);
		else if (lc == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_LC(info);
		else if (lc == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_LC(info);
		else if (lc == columnRslt_inst_typ) doRslt_inst_typ_LC(info);
		else if (lc == columnRslt_inst_typ_nm) doRslt_inst_typ_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRslt_acxfr_schd_no) doRslt_acxfr_schd_no_LC(info);
		else if (lc == columnRslt_acxfr_schd_rev) doRslt_acxfr_schd_rev_LC(info);
		else if (lc == columnRslt_acxfr_inst_no) doRslt_acxfr_inst_no_LC(info);
		else if (lc == columnRslt_acxfr_inst_d_no) doRslt_acxfr_inst_d_no_LC(info);
		else if (lc == columnRslt_acxfr_act_no) doRslt_acxfr_act_no_LC(info);
		else if (lc == columnRslt_acxfr_act_d_no) doRslt_acxfr_act_d_no_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_acxfr_act_no) doRslt_ext_acxfr_act_no_LC(info);
		else if (lc == columnRslt_acxfr_act_rev) doRslt_acxfr_act_rev_LC(info);
		else if (lc == columnRslt_dspsl_no) doRslt_dspsl_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_aprv_no) doRslt_aprv_no_LC(info);
		else if (lc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_schd_dspsl_rmrks) doRslt_schd_dspsl_rmrks_LC(info);
		else if (lc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_LC(info);
		else if (lc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_LC(info);
		else if (lc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_LC(info);
		else if (lc == columnRslt_inst_intr_rmrks) doRslt_inst_intr_rmrks_LC(info);
		else if (lc == columnRslt_inst_trd_rmrks) doRslt_inst_trd_rmrks_LC(info);
		else if (lc == columnRslt_inst_rmrks) doRslt_inst_rmrks_LC(info);
		else if (lc == columnRslt_inst_sub_char1) doRslt_inst_sub_char1_LC(info);
		else if (lc == columnRslt_inst_sub_char2) doRslt_inst_sub_char2_LC(info);
		else if (lc == columnRslt_inst_sub_char3) doRslt_inst_sub_char3_LC(info);
		else if (lc == columnRslt_inst_intr_d_rmrks) doRslt_inst_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_inst_trd_d_rmrks) doRslt_inst_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_inst_d_rmrks) doRslt_inst_d_rmrks_LC(info);
		else if (lc == columnRslt_inst_d_sub_char1) doRslt_inst_d_sub_char1_LC(info);
		else if (lc == columnRslt_inst_d_sub_char2) doRslt_inst_d_sub_char2_LC(info);
		else if (lc == columnRslt_inst_d_sub_char3) doRslt_inst_d_sub_char3_LC(info);
		else if (lc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_LC(info);
		else if (lc == columnRslt_act_sub_char1) doRslt_act_sub_char1_LC(info);
		else if (lc == columnRslt_act_sub_char2) doRslt_act_sub_char2_LC(info);
		else if (lc == columnRslt_act_sub_char3) doRslt_act_sub_char3_LC(info);
		else if (lc == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_LC(info);
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
	 * [Cnd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_ptn_typ_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[acxfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_acxfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_acxfr_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acxfr_inst_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acxfr_inst_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dspsl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dspsl_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dspsl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dspsl_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[inst_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_schd_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_schd_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ext_acxfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_acxfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acxfr_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acxfr_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dspsl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dspsl_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dspsl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dspsl_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_d_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcxfrGrAcxfrGiDispBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_usr_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2430.Srch01")) {
			return new MS_MSBEL2430_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2430.Srch02")) {
			return new MS_MSBEL2430_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL2430.Srch03")) {
			return new MS_MSBEL2430_Srch03Bridge();
		}
		if (id.equals("MS.MSBEL2430.Prnt02")) {
			return new MS_MSBEL2430_Prnt02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2430_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2430_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2430_Srch01Bridge() {
			p_MS_MSBEL2430_Srch01 = new MCParam(PDef.MS_MSBEL2430_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2430_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));

			p_MS_MSBEL2430_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2430_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2430_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2430_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2430_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2430.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2430.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2430.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2430_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2430_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)p_MS_MSBEL2430_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2430_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2430_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL2430_Srch02Bridge() {
			p_MS_MSBEL2430_Srch02 = new MCParam(PDef.MS_MSBEL2430_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2430_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));

			p_MS_MSBEL2430_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2430_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2430_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2430_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2430_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2430.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2430.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2430.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2430_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2430_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)p_MS_MSBEL2430_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2430_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2430_Srch03;

		/** コンストラクタ */
		protected MS_MSBEL2430_Srch03Bridge() {
			p_MS_MSBEL2430_Srch03 = new MCParam(PDef.MS_MSBEL2430_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2430_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2430.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));

			p_MS_MSBEL2430_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2430_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2430_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2430_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2430_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2430.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2430.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2430.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2430_Srch03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2430_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)p_MS_MSBEL2430_Srch03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2430_Prnt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2430_Prnt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2430_Prnt02;

		/** コンストラクタ */
		protected MS_MSBEL2430_Prnt02Bridge() {
			p_MS_MSBEL2430_Prnt02 = new MCParam(PDef.MS_MSBEL2430_Prnt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2430_Prnt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2430.RsltR.class));
			// Down

			p_MS_MSBEL2430_Prnt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2430_Prnt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2430_Prnt02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2430_Prnt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2430_Prnt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2430.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2430.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL2430_Prnt02;
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