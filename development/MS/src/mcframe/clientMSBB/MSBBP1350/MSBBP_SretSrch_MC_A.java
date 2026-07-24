package mcframe.clientMSBB.MSBBP1350;

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
import mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch_MC.MS_MSBBL1350_Srch01Caller;
import mcframe.clientMSBB.MSBBP1350.MSBBP_SretSrch_MC.MS_MSBBL1350_Srch02Caller;

/**
 * 画面"MSBBP_SretSrch"パネルクラスです。<p>
 *
 * 売上返品予定、売上返品実績を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SretSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP1350";

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
	// [SrchMode]ブロック関連のField定義
	public MCPanel SrchModePanel = null;
	public MCTitledBorder SrchModeTitledBorder = null;
	// [SrchMode]ブロックの項目のField定義
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
	// [Iv]ブロック関連のField定義
	public MCPanel IvPanel = null;
	public MCTitledBorder IvTitledBorder = null;
	// [Iv]ブロックの項目のField定義
	// [Sync]ブロック関連のField定義
	public MCPanel SyncPanel = null;
	public MCTitledBorder SyncTitledBorder = null;
	// [Sync]ブロックの項目のField定義
	// [Vmi]ブロック関連のField定義
	public MCPanel VmiPanel = null;
	public MCTitledBorder VmiTitledBorder = null;
	// [Vmi]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SRCH_SCHD_REF,View schedule;SRCH_ACT_REF,View result; SRCH_SCHD_REF,予定を参照する;SRCH_ACT_REF,実績を参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SRCH_SCHD_REF = null;
	public MCRadioButton Cnd_ope_SRCH_ACT_REF = null;
	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public MCCheckBox Cnd_non_arr_flg = null;
	/**
	 * Partial receipt/not recorded 一部入荷・未計上.<p>
	 *
	 */
	public MCCheckBox Cnd_part_arr_non_ac_flg = null;
	/**
	 * Partial receipt 一部入荷.<p>
	 *
	 */
	public MCCheckBox Cnd_part_arr_flg = null;
	/**
	 * Receipt completed/not recorded 入荷完了・未計上.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_arr_non_ac_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	/**
	 * SRCH_LST,Breakdown of details;SRCH_DTL,Details;SRCH_HDR,Header SRCH_LST,詳細;SRCH_DTL,明細;SRCH_HDR,ヘッダ.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_SRCH_LST = null;
	public MCRadioButton Cnd_mode_SRCH_DTL = null;
	public MCRadioButton Cnd_mode_SRCH_HDR = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_trgt_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_trgt_flg = null;
	/**
	 * Do する.<p>
	 *
	 */
	public MCCheckBox Cnd_sync_flg = null;
	/**
	 * Do not しない.<p>
	 *
	 */
	public MCCheckBox Cnd_not_sync_flg = null;
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCCheckBox Cnd_vmi_flg = null;
	/**
	 * Other consignment 貸出以外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_vmi_flg = null;
	public MCLabel Cnd_sls_ret_schd_dt_fr_Label = null;
	/**
	 * Scheduled sales return date FROM 売上返品予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sls_ret_schd_dt_fr = null;
	public MCLabel Cnd_sls_ret_schd_dt_to_Label = null;
	/**
	 * Scheduled sales return date TO 売上返品予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sls_ret_schd_dt_to = null;
	public MCLabel Cnd_sls_ret_dt_fr_Label = null;
	/**
	 * Sales return date FROM 売上返品日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sls_ret_dt_fr = null;
	public MCLabel Cnd_sls_ret_dt_to_Label = null;
	/**
	 * Sales return date TO 売上返品日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sls_ret_dt_to = null;
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
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
	public MCLabel Cnd_sls_usr_cd_Label = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
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
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public MCLabel Cnd_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm1 = null;
	public MCLabel Cnd_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm2 = null;
	public MCLabel Cnd_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
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
	public MCLabel Cnd_sls_ret_schd_no_Label = null;
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_ret_schd_no = null;
	public MCLabel Cnd_sls_ret_schd_d_no_Label = null;
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_ret_schd_d_no = null;
	public MCLabel Cnd_arr_act_no_Label = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_arr_act_no = null;
	public MCLabel Cnd_sls_act_no_Label = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_act_no = null;
	public MCLabel Cnd_sls_act_d_no_Label = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sls_act_d_no = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
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
	/**
	 * Include discount for return 返品目的の値引含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_ret_dscnt_flg = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
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
	public MCLabel Cnd_cst_itm_cd_Label = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCTextField Cnd_cst_itm_nm = null;
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
	public MCLabel Cnd_ret_rsn_cd_Label = null;
	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ret_rsn_cd = null;
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public MCTextField Cnd_ret_rsn_nm = null;
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
	public MCLabel Cnd_cst_po_no_Label = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_no = null;
	public MCLabel Cnd_cst_po_d_no_Label = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_d_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_schd_intr_rmrks_Label = null;
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_intr_rmrks = null;
	public MCLabel Cnd_act_intr_rmrks_Label = null;
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_schd_d_intr_rmrks_Label = null;
	/**
	 * Schedule internal details remarks 予定内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_intr_rmrks = null;
	public MCLabel Cnd_act_d_intr_rmrks_Label = null;
	/**
	 * Result internal details remarks 実績内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_act_d_intr_rmrks = null;
	public MCLabel Cnd_arr_cnt_rmrks_Label = null;
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_arr_cnt_rmrks = null;
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
	public MCLabel Cnd_schd_d_sub_char1_Label = null;
	/**
	 * Schedule details spare 1 予定明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char1 = null;
	public MCLabel Cnd_schd_d_sub_char2_Label = null;
	/**
	 * Schedule details spare 2 予定明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char2 = null;
	public MCLabel Cnd_schd_d_sub_char3_Label = null;
	/**
	 * Schedule details spare 3 予定明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char3 = null;
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
	public MCLabel Cnd_act_d_sub_char1_Label = null;
	/**
	 * Result details spare 1 実績明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char1 = null;
	public MCLabel Cnd_act_d_sub_char2_Label = null;
	/**
	 * Result details spare 2 実績明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char2 = null;
	public MCLabel Cnd_act_d_sub_char3_Label = null;
	/**
	 * Result details spare 3 実績明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char3 = null;
	public MCLabel Cnd_act_io_sub_char1_Label = null;
	/**
	 * Result GR/GI spare 1 実績受払予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char1 = null;
	public MCLabel Cnd_act_io_sub_char2_Label = null;
	/**
	 * Result GR/GI spare 2 実績受払予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char2 = null;
	public MCLabel Cnd_act_io_sub_char3_Label = null;
	/**
	 * Result GR/GI spare 3 実績受払予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char3 = null;
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_abort_flg = null;
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_dlv_grp_p_PPanel;
	public MCLabel Cnd_dlv_grp_lab1;	// [Cnd]の[dlv_grp_p.bp_grp_lab1]を[Cnd_dlv_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg1;	// [Cnd]の[dlv_grp_p.bp_grp_flg1]を[Cnd_dlv_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd1;	// [Cnd]の[dlv_grp_p.bp_grp_cd1]を[Cnd_dlv_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm1;	// [Cnd]の[dlv_grp_p.bp_grp_nm1]を[Cnd_dlv_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab2;	// [Cnd]の[dlv_grp_p.bp_grp_lab2]を[Cnd_dlv_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg2;	// [Cnd]の[dlv_grp_p.bp_grp_flg2]を[Cnd_dlv_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd2;	// [Cnd]の[dlv_grp_p.bp_grp_cd2]を[Cnd_dlv_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm2;	// [Cnd]の[dlv_grp_p.bp_grp_nm2]を[Cnd_dlv_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab3;	// [Cnd]の[dlv_grp_p.bp_grp_lab3]を[Cnd_dlv_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg3;	// [Cnd]の[dlv_grp_p.bp_grp_flg3]を[Cnd_dlv_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd3;	// [Cnd]の[dlv_grp_p.bp_grp_cd3]を[Cnd_dlv_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm3;	// [Cnd]の[dlv_grp_p.bp_grp_nm3]を[Cnd_dlv_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab4;	// [Cnd]の[dlv_grp_p.bp_grp_lab4]を[Cnd_dlv_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg4;	// [Cnd]の[dlv_grp_p.bp_grp_flg4]を[Cnd_dlv_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd4;	// [Cnd]の[dlv_grp_p.bp_grp_cd4]を[Cnd_dlv_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm4;	// [Cnd]の[dlv_grp_p.bp_grp_nm4]を[Cnd_dlv_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab5;	// [Cnd]の[dlv_grp_p.bp_grp_lab5]を[Cnd_dlv_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg5;	// [Cnd]の[dlv_grp_p.bp_grp_flg5]を[Cnd_dlv_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd5;	// [Cnd]の[dlv_grp_p.bp_grp_cd5]を[Cnd_dlv_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm5;	// [Cnd]の[dlv_grp_p.bp_grp_nm5]を[Cnd_dlv_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab6;	// [Cnd]の[dlv_grp_p.bp_grp_lab6]を[Cnd_dlv_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg6;	// [Cnd]の[dlv_grp_p.bp_grp_flg6]を[Cnd_dlv_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd6;	// [Cnd]の[dlv_grp_p.bp_grp_cd6]を[Cnd_dlv_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm6;	// [Cnd]の[dlv_grp_p.bp_grp_nm6]を[Cnd_dlv_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab7;	// [Cnd]の[dlv_grp_p.bp_grp_lab7]を[Cnd_dlv_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg7;	// [Cnd]の[dlv_grp_p.bp_grp_flg7]を[Cnd_dlv_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd7;	// [Cnd]の[dlv_grp_p.bp_grp_cd7]を[Cnd_dlv_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm7;	// [Cnd]の[dlv_grp_p.bp_grp_nm7]を[Cnd_dlv_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab8;	// [Cnd]の[dlv_grp_p.bp_grp_lab8]を[Cnd_dlv_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg8;	// [Cnd]の[dlv_grp_p.bp_grp_flg8]を[Cnd_dlv_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd8;	// [Cnd]の[dlv_grp_p.bp_grp_cd8]を[Cnd_dlv_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm8;	// [Cnd]の[dlv_grp_p.bp_grp_nm8]を[Cnd_dlv_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab9;	// [Cnd]の[dlv_grp_p.bp_grp_lab9]を[Cnd_dlv_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg9;	// [Cnd]の[dlv_grp_p.bp_grp_flg9]を[Cnd_dlv_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd9;	// [Cnd]の[dlv_grp_p.bp_grp_cd9]を[Cnd_dlv_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm9;	// [Cnd]の[dlv_grp_p.bp_grp_nm9]を[Cnd_dlv_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_dlv_grp_lab10;	// [Cnd]の[dlv_grp_p.bp_grp_lab10]を[Cnd_dlv_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_dlv_grp_flg10;	// [Cnd]の[dlv_grp_p.bp_grp_flg10]を[Cnd_dlv_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_dlv_grp_cd10;	// [Cnd]の[dlv_grp_p.bp_grp_cd10]を[Cnd_dlv_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_dlv_grp_nm10;	// [Cnd]の[dlv_grp_p.bp_grp_nm10]を[Cnd_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_cst_grp_p_PPanel;
	public MCLabel Cnd_cst_grp_lab1;	// [Cnd]の[cst_grp_p.bp_grp_lab1]を[Cnd_cst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg1;	// [Cnd]の[cst_grp_p.bp_grp_flg1]を[Cnd_cst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd1;	// [Cnd]の[cst_grp_p.bp_grp_cd1]を[Cnd_cst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm1;	// [Cnd]の[cst_grp_p.bp_grp_nm1]を[Cnd_cst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab2;	// [Cnd]の[cst_grp_p.bp_grp_lab2]を[Cnd_cst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg2;	// [Cnd]の[cst_grp_p.bp_grp_flg2]を[Cnd_cst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd2;	// [Cnd]の[cst_grp_p.bp_grp_cd2]を[Cnd_cst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm2;	// [Cnd]の[cst_grp_p.bp_grp_nm2]を[Cnd_cst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab3;	// [Cnd]の[cst_grp_p.bp_grp_lab3]を[Cnd_cst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg3;	// [Cnd]の[cst_grp_p.bp_grp_flg3]を[Cnd_cst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd3;	// [Cnd]の[cst_grp_p.bp_grp_cd3]を[Cnd_cst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm3;	// [Cnd]の[cst_grp_p.bp_grp_nm3]を[Cnd_cst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab4;	// [Cnd]の[cst_grp_p.bp_grp_lab4]を[Cnd_cst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg4;	// [Cnd]の[cst_grp_p.bp_grp_flg4]を[Cnd_cst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd4;	// [Cnd]の[cst_grp_p.bp_grp_cd4]を[Cnd_cst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm4;	// [Cnd]の[cst_grp_p.bp_grp_nm4]を[Cnd_cst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab5;	// [Cnd]の[cst_grp_p.bp_grp_lab5]を[Cnd_cst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg5;	// [Cnd]の[cst_grp_p.bp_grp_flg5]を[Cnd_cst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd5;	// [Cnd]の[cst_grp_p.bp_grp_cd5]を[Cnd_cst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm5;	// [Cnd]の[cst_grp_p.bp_grp_nm5]を[Cnd_cst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab6;	// [Cnd]の[cst_grp_p.bp_grp_lab6]を[Cnd_cst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg6;	// [Cnd]の[cst_grp_p.bp_grp_flg6]を[Cnd_cst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd6;	// [Cnd]の[cst_grp_p.bp_grp_cd6]を[Cnd_cst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm6;	// [Cnd]の[cst_grp_p.bp_grp_nm6]を[Cnd_cst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab7;	// [Cnd]の[cst_grp_p.bp_grp_lab7]を[Cnd_cst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg7;	// [Cnd]の[cst_grp_p.bp_grp_flg7]を[Cnd_cst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd7;	// [Cnd]の[cst_grp_p.bp_grp_cd7]を[Cnd_cst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm7;	// [Cnd]の[cst_grp_p.bp_grp_nm7]を[Cnd_cst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab8;	// [Cnd]の[cst_grp_p.bp_grp_lab8]を[Cnd_cst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg8;	// [Cnd]の[cst_grp_p.bp_grp_flg8]を[Cnd_cst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd8;	// [Cnd]の[cst_grp_p.bp_grp_cd8]を[Cnd_cst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm8;	// [Cnd]の[cst_grp_p.bp_grp_nm8]を[Cnd_cst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab9;	// [Cnd]の[cst_grp_p.bp_grp_lab9]を[Cnd_cst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg9;	// [Cnd]の[cst_grp_p.bp_grp_flg9]を[Cnd_cst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd9;	// [Cnd]の[cst_grp_p.bp_grp_cd9]を[Cnd_cst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm9;	// [Cnd]の[cst_grp_p.bp_grp_nm9]を[Cnd_cst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_cst_grp_lab10;	// [Cnd]の[cst_grp_p.bp_grp_lab10]を[Cnd_cst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_cst_grp_flg10;	// [Cnd]の[cst_grp_p.bp_grp_flg10]を[Cnd_cst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_cst_grp_cd10;	// [Cnd]の[cst_grp_p.bp_grp_cd10]を[Cnd_cst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_cst_grp_nm10;	// [Cnd]の[cst_grp_p.bp_grp_nm10]を[Cnd_cst_grp_nm10]としてエイリアス定義。
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
	// [CstCnd]ブロック関連のField定義
	public MCPanel CstCndPanel = null;
	// [CstCnd]ブロックの項目のField定義
	// [DlvCnd]ブロック関連のField定義
	public MCPanel DlvCndPanel = null;
	// [DlvCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
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
	public MCTable2<mcframe.clientMSBB.MSBBP1350.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	/**
	 * Status type 状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sret_schd_sts_typ = null;
	/**
	 * Status type name 状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sret_schd_sts_typ_nm = null;
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_ret_schd_no = null;
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_ret_schd_d_no = null;
	/**
	 * Scheduled sales return date 売上返品予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_ret_schd_dt = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_act_no = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_no = null;
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_rev = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_d_no = null;
	/**
	 * Sales result GR/GI No. 売上実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_io_no = null;
	/**
	 * Sales return date 売上返品日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_basis_dt = null;
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_schd_dt = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_nm = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Transaction currency number of decimal places 取引通貨小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_upri_dec_place = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Base currency number of decimal places 基準通貨小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_amt_dec_place = null;
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_upri_dec_place = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_nm = null;
	/**
	 * Tax currency number of decimal places 納税通貨小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_amt_dec_place = null;
	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_upri_dec_place = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_iv_no = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Schedule internal remarks 予定内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_intr_rmrks = null;
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_rmrks = null;
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
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sync_flg = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sret_fr_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sret_fr_nm = null;
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sret_fr_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_addr_p_PPanel;
	public MCColumnConfig columnRslt_sret_fr_zip_cd;// [Rslt]の[addr_p.zip_cd]を[columnRslt_sret_fr_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_addr1;// [Rslt]の[addr_p.addr1]を[columnRslt_sret_fr_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_addr2;// [Rslt]の[addr_p.addr2]を[columnRslt_sret_fr_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_addr3;// [Rslt]の[addr_p.addr3]を[columnRslt_sret_fr_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_addr4;// [Rslt]の[addr_p.addr4]を[columnRslt_sret_fr_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_cntct_dpt;// [Rslt]の[addr_p.cntct_dpt]を[columnRslt_sret_fr_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_cntct_psn;// [Rslt]の[addr_p.cntct_psn]を[columnRslt_sret_fr_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_tel;// [Rslt]の[addr_p.tel]を[columnRslt_sret_fr_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_sret_fr_fax;// [Rslt]の[addr_p.fax]を[columnRslt_sret_fr_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_cd;// [Rslt]の[addr_p.cntry_cd]を[columnRslt_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_nm;// [Rslt]の[addr_p.cntry_nm]を[columnRslt_cntry_nm]としてエイリアス定義。
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pri_prnt_flg = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm3 = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_qty_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_dtl_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_dtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_qty_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_arr_qty_p_PPanel;
	public MCColumnConfig columnRslt_dtl_arr_qty;// [Rslt]の[arr_qty_p.qty]を[columnRslt_dtl_arr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_sls_ret_qty_p_PPanel;
	public MCColumnConfig columnRslt_sls_ret_qty;// [Rslt]の[sls_ret_qty_p.qty]を[columnRslt_sls_ret_qty]としてエイリアス定義。
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_cmpl_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_inc_tax_amt_p.amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_dscnt_amt_p.amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_cd = null;
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_cost_upri_p_PPanel;
	public MCColumnConfig columnRslt_cost_upri;// [Rslt]の[cost_upri_p.upri]を[columnRslt_cost_upri]としてエイリアス定義。
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_fix_flg = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_tax_amt;// [Rslt]の[base_cur_inc_tax_amt_p.amt]を[columnRslt_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_upri;// [Rslt]の[ptax_cur_upri_p.upri]を[columnRslt_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_tax_amt;// [Rslt]の[ptax_cur_inc_tax_amt_p.amt]を[columnRslt_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_dscnt_amt;// [Rslt]の[ptax_cur_dscnt_amt_p.amt]を[columnRslt_ptax_cur_dscnt_amt]としてエイリアス定義。
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
	 * Consignment grading cd. 貸出格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cnsgn_gd_cd = null;
	/**
	 * Consignment grading name 貸出格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cnsgn_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_dtl_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_dtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dtl_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_dtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dtl_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_dtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dtl_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_dtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vmi_flg = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_rsn_cd = null;
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_rsn_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_dpt_nm = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_amt = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_crryovr_times = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Schedule details internal remarks 予定明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_intr_rmrks = null;
	/**
	 * Result details internal remarks 実績明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_intr_rmrks = null;
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_cnt_rmrks = null;
	/**
	 * Schedule details spare 1 予定明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char1 = null;
	/**
	 * Schedule details spare 2 予定明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char2 = null;
	/**
	 * Schedule details spare 3 予定明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char3 = null;
	/**
	 * Result details spare 1 実績明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char1 = null;
	/**
	 * Result details spare 2 実績明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char2 = null;
	/**
	 * Result details spare 3 実績明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char3 = null;
	/**
	 * Result GR/GI spare 1 実績受払予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char1 = null;
	/**
	 * Result GR/GI spare 2 実績受払予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char2 = null;
	/**
	 * Result GR/GI spare 3 実績受払予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char3 = null;
	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_sls_act_no = null;
	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_sls_act_d_no = null;
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_sls_ac_dt = null;
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_no = null;
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_d_no = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_purc_ac_dt = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_dlv_grp_p_PPanel;
	public MCColumnConfig columnRslt_dlv_grp_cd1;// [Rslt]の[dlv_grp_p.bp_grp_cd1]を[columnRslt_dlv_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm1;// [Rslt]の[dlv_grp_p.bp_grp_nm1]を[columnRslt_dlv_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd2;// [Rslt]の[dlv_grp_p.bp_grp_cd2]を[columnRslt_dlv_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm2;// [Rslt]の[dlv_grp_p.bp_grp_nm2]を[columnRslt_dlv_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd3;// [Rslt]の[dlv_grp_p.bp_grp_cd3]を[columnRslt_dlv_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm3;// [Rslt]の[dlv_grp_p.bp_grp_nm3]を[columnRslt_dlv_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd4;// [Rslt]の[dlv_grp_p.bp_grp_cd4]を[columnRslt_dlv_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm4;// [Rslt]の[dlv_grp_p.bp_grp_nm4]を[columnRslt_dlv_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd5;// [Rslt]の[dlv_grp_p.bp_grp_cd5]を[columnRslt_dlv_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm5;// [Rslt]の[dlv_grp_p.bp_grp_nm5]を[columnRslt_dlv_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd6;// [Rslt]の[dlv_grp_p.bp_grp_cd6]を[columnRslt_dlv_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm6;// [Rslt]の[dlv_grp_p.bp_grp_nm6]を[columnRslt_dlv_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd7;// [Rslt]の[dlv_grp_p.bp_grp_cd7]を[columnRslt_dlv_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm7;// [Rslt]の[dlv_grp_p.bp_grp_nm7]を[columnRslt_dlv_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd8;// [Rslt]の[dlv_grp_p.bp_grp_cd8]を[columnRslt_dlv_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm8;// [Rslt]の[dlv_grp_p.bp_grp_nm8]を[columnRslt_dlv_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd9;// [Rslt]の[dlv_grp_p.bp_grp_cd9]を[columnRslt_dlv_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm9;// [Rslt]の[dlv_grp_p.bp_grp_nm9]を[columnRslt_dlv_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_cd10;// [Rslt]の[dlv_grp_p.bp_grp_cd10]を[columnRslt_dlv_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_grp_nm10;// [Rslt]の[dlv_grp_p.bp_grp_nm10]を[columnRslt_dlv_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_cst_grp_p_PPanel;
	public MCColumnConfig columnRslt_cst_grp_cd1;// [Rslt]の[cst_grp_p.bp_grp_cd1]を[columnRslt_cst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm1;// [Rslt]の[cst_grp_p.bp_grp_nm1]を[columnRslt_cst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd2;// [Rslt]の[cst_grp_p.bp_grp_cd2]を[columnRslt_cst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm2;// [Rslt]の[cst_grp_p.bp_grp_nm2]を[columnRslt_cst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd3;// [Rslt]の[cst_grp_p.bp_grp_cd3]を[columnRslt_cst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm3;// [Rslt]の[cst_grp_p.bp_grp_nm3]を[columnRslt_cst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd4;// [Rslt]の[cst_grp_p.bp_grp_cd4]を[columnRslt_cst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm4;// [Rslt]の[cst_grp_p.bp_grp_nm4]を[columnRslt_cst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd5;// [Rslt]の[cst_grp_p.bp_grp_cd5]を[columnRslt_cst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm5;// [Rslt]の[cst_grp_p.bp_grp_nm5]を[columnRslt_cst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd6;// [Rslt]の[cst_grp_p.bp_grp_cd6]を[columnRslt_cst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm6;// [Rslt]の[cst_grp_p.bp_grp_nm6]を[columnRslt_cst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd7;// [Rslt]の[cst_grp_p.bp_grp_cd7]を[columnRslt_cst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm7;// [Rslt]の[cst_grp_p.bp_grp_nm7]を[columnRslt_cst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd8;// [Rslt]の[cst_grp_p.bp_grp_cd8]を[columnRslt_cst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm8;// [Rslt]の[cst_grp_p.bp_grp_nm8]を[columnRslt_cst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd9;// [Rslt]の[cst_grp_p.bp_grp_cd9]を[columnRslt_cst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm9;// [Rslt]の[cst_grp_p.bp_grp_nm9]を[columnRslt_cst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_cd10;// [Rslt]の[cst_grp_p.bp_grp_cd10]を[columnRslt_cst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_cst_grp_nm10;// [Rslt]の[cst_grp_p.bp_grp_nm10]を[columnRslt_cst_grp_nm10]としてエイリアス定義。
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
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
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
	 * Sales return schedule entry 売上返品予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1330 = null;
	/**
	 * Sales return entry 売上返品登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1340 = null;
	/** [SRCH_SCHD_LST]モードを表す定数 */
	public static final String SRCH_SCHD_LST = "SRCH_SCHD_LST";
	/** [SRCH_SCHD_DTL]モードを表す定数 */
	public static final String SRCH_SCHD_DTL = "SRCH_SCHD_DTL";
	/** [SRCH_SCHD_HDR]モードを表す定数 */
	public static final String SRCH_SCHD_HDR = "SRCH_SCHD_HDR";
	/** [SRCH_ACT_LST]モードを表す定数 */
	public static final String SRCH_ACT_LST = "SRCH_ACT_LST";
	/** [SRCH_ACT_DTL]モードを表す定数 */
	public static final String SRCH_ACT_DTL = "SRCH_ACT_DTL";
	/** [SRCH_ACT_HDR]モードを表す定数 */
	public static final String SRCH_ACT_HDR = "SRCH_ACT_HDR";
	/** [REF_SCHD_LST]モードを表す定数 */
	public static final String REF_SCHD_LST = "REF_SCHD_LST";
	/** [REF_SCHD_DTL]モードを表す定数 */
	public static final String REF_SCHD_DTL = "REF_SCHD_DTL";
	/** [REF_SCHD_HDR]モードを表す定数 */
	public static final String REF_SCHD_HDR = "REF_SCHD_HDR";
	/** [REF_ACT_LST]モードを表す定数 */
	public static final String REF_ACT_LST = "REF_ACT_LST";
	/** [REF_ACT_DTL]モードを表す定数 */
	public static final String REF_ACT_DTL = "REF_ACT_DTL";
	/** [REF_ACT_HDR]モードを表す定数 */
	public static final String REF_ACT_HDR = "REF_ACT_HDR";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SCHD_LST, SRCH_SCHD_DTL, SRCH_SCHD_HDR, SRCH_ACT_LST, SRCH_ACT_DTL, SRCH_ACT_HDR, REF_SCHD_LST, REF_SCHD_DTL, REF_SCHD_HDR, REF_ACT_LST, REF_ACT_DTL, REF_ACT_HDR};
	
	/** [MS_MSBBL1350_Srch01]のCallerの作成 */
	protected MSBBP_SretSrch_MC.MS_MSBBL1350_Srch01Caller createMS_MSBBL1350_Srch01() {
		MSBBP_SretSrch_MC.MS_MSBBL1350_Srch01Caller<MSBBP_SretSrch, MS_MSBBL1350_Srch01Bridge>
		caller = ((MSBBP_SretSrch_MC)this).new MS_MSBBL1350_Srch01Caller<MSBBP_SretSrch, MS_MSBBL1350_Srch01Bridge>(
					(MSBBP_SretSrch)this, new MS_MSBBL1350_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1350_Srch01]の呼び出し */
	protected void callMS_MSBBL1350_Srch01() {
		MCCaller caller = createMS_MSBBL1350_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1350_Srch02]のCallerの作成 */
	protected MSBBP_SretSrch_MC.MS_MSBBL1350_Srch02Caller createMS_MSBBL1350_Srch02() {
		MSBBP_SretSrch_MC.MS_MSBBL1350_Srch02Caller<MSBBP_SretSrch, MS_MSBBL1350_Srch02Bridge>
		caller = ((MSBBP_SretSrch_MC)this).new MS_MSBBL1350_Srch02Caller<MSBBP_SretSrch, MS_MSBBL1350_Srch02Bridge>(
					(MSBBP_SretSrch)this, new MS_MSBBL1350_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1350_Srch02]の呼び出し */
	protected void callMS_MSBBL1350_Srch02() {
		MCCaller caller = createMS_MSBBL1350_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1350.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1350.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1350.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1350.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1350.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1350.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1350.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1350.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1350.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1350.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1350.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1350.RsltR.class);
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
		ret.add(SrchModePanel);
		ret.add(StsPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(IvPanel);
		ret.add(SyncPanel);
		ret.add(VmiPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(CstCndPanel);
		ret.add(DlvCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SretSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SretSrch_MC_A(String name) {
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
		MSBBP_SretSrch_MC.jbCreateScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateSrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateSts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateTop((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateFold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateTab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateIv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateSync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateVmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateTab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateTab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateTab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateCstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateDlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateCtrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateRPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateRslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbCreateBtn((MSBBP_SretSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_SretSrch p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBBP_SretSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBBP_SretSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_SretSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_SretSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_SretSrch p) {
	}

	/**
	 * [Iv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIv(MSBBP_SretSrch p) {
	}

	/**
	 * [Sync]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSync(MSBBP_SretSrch p) {
	}

	/**
	 * [Vmi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateVmi(MSBBP_SretSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_SretSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_SretSrch p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_SretSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SretSrch p) {
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
		p.Cnd_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().dlv_grp_p());
		p.Cnd_dlv_grp_p_PPanel.setName("Cnd.dlv_grp_p");
		p.Cnd_dlv_grp_lab1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_dlv_grp_lab1.addAliasName("Cnd.dlv_grp_lab1", p);
		p.Cnd_dlv_grp_flg1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_dlv_grp_flg1.addAliasName("Cnd.dlv_grp_flg1", p);
		p.Cnd_dlv_grp_cd1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_dlv_grp_cd1.addAliasName("Cnd.dlv_grp_cd1", p);
		p.Cnd_dlv_grp_nm1 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_dlv_grp_nm1.addAliasName("Cnd.dlv_grp_nm1", p);
		p.Cnd_dlv_grp_lab2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_dlv_grp_lab2.addAliasName("Cnd.dlv_grp_lab2", p);
		p.Cnd_dlv_grp_flg2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_dlv_grp_flg2.addAliasName("Cnd.dlv_grp_flg2", p);
		p.Cnd_dlv_grp_cd2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_dlv_grp_cd2.addAliasName("Cnd.dlv_grp_cd2", p);
		p.Cnd_dlv_grp_nm2 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_dlv_grp_nm2.addAliasName("Cnd.dlv_grp_nm2", p);
		p.Cnd_dlv_grp_lab3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_dlv_grp_lab3.addAliasName("Cnd.dlv_grp_lab3", p);
		p.Cnd_dlv_grp_flg3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_dlv_grp_flg3.addAliasName("Cnd.dlv_grp_flg3", p);
		p.Cnd_dlv_grp_cd3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_dlv_grp_cd3.addAliasName("Cnd.dlv_grp_cd3", p);
		p.Cnd_dlv_grp_nm3 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_dlv_grp_nm3.addAliasName("Cnd.dlv_grp_nm3", p);
		p.Cnd_dlv_grp_lab4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_dlv_grp_lab4.addAliasName("Cnd.dlv_grp_lab4", p);
		p.Cnd_dlv_grp_flg4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_dlv_grp_flg4.addAliasName("Cnd.dlv_grp_flg4", p);
		p.Cnd_dlv_grp_cd4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_dlv_grp_cd4.addAliasName("Cnd.dlv_grp_cd4", p);
		p.Cnd_dlv_grp_nm4 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_dlv_grp_nm4.addAliasName("Cnd.dlv_grp_nm4", p);
		p.Cnd_dlv_grp_lab5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_dlv_grp_lab5.addAliasName("Cnd.dlv_grp_lab5", p);
		p.Cnd_dlv_grp_flg5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_dlv_grp_flg5.addAliasName("Cnd.dlv_grp_flg5", p);
		p.Cnd_dlv_grp_cd5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_dlv_grp_cd5.addAliasName("Cnd.dlv_grp_cd5", p);
		p.Cnd_dlv_grp_nm5 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_dlv_grp_nm5.addAliasName("Cnd.dlv_grp_nm5", p);
		p.Cnd_dlv_grp_lab6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_dlv_grp_lab6.addAliasName("Cnd.dlv_grp_lab6", p);
		p.Cnd_dlv_grp_flg6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_dlv_grp_flg6.addAliasName("Cnd.dlv_grp_flg6", p);
		p.Cnd_dlv_grp_cd6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_dlv_grp_cd6.addAliasName("Cnd.dlv_grp_cd6", p);
		p.Cnd_dlv_grp_nm6 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_dlv_grp_nm6.addAliasName("Cnd.dlv_grp_nm6", p);
		p.Cnd_dlv_grp_lab7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_dlv_grp_lab7.addAliasName("Cnd.dlv_grp_lab7", p);
		p.Cnd_dlv_grp_flg7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_dlv_grp_flg7.addAliasName("Cnd.dlv_grp_flg7", p);
		p.Cnd_dlv_grp_cd7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_dlv_grp_cd7.addAliasName("Cnd.dlv_grp_cd7", p);
		p.Cnd_dlv_grp_nm7 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_dlv_grp_nm7.addAliasName("Cnd.dlv_grp_nm7", p);
		p.Cnd_dlv_grp_lab8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_dlv_grp_lab8.addAliasName("Cnd.dlv_grp_lab8", p);
		p.Cnd_dlv_grp_flg8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_dlv_grp_flg8.addAliasName("Cnd.dlv_grp_flg8", p);
		p.Cnd_dlv_grp_cd8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_dlv_grp_cd8.addAliasName("Cnd.dlv_grp_cd8", p);
		p.Cnd_dlv_grp_nm8 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_dlv_grp_nm8.addAliasName("Cnd.dlv_grp_nm8", p);
		p.Cnd_dlv_grp_lab9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_dlv_grp_lab9.addAliasName("Cnd.dlv_grp_lab9", p);
		p.Cnd_dlv_grp_flg9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_dlv_grp_flg9.addAliasName("Cnd.dlv_grp_flg9", p);
		p.Cnd_dlv_grp_cd9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_dlv_grp_cd9.addAliasName("Cnd.dlv_grp_cd9", p);
		p.Cnd_dlv_grp_nm9 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_dlv_grp_nm9.addAliasName("Cnd.dlv_grp_nm9", p);
		p.Cnd_dlv_grp_lab10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_dlv_grp_lab10.addAliasName("Cnd.dlv_grp_lab10", p);
		p.Cnd_dlv_grp_flg10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_dlv_grp_flg10.addAliasName("Cnd.dlv_grp_flg10", p);
		p.Cnd_dlv_grp_cd10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_dlv_grp_cd10.addAliasName("Cnd.dlv_grp_cd10", p);
		p.Cnd_dlv_grp_nm10 = p.Cnd_dlv_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_dlv_grp_nm10.addAliasName("Cnd.dlv_grp_nm10", p);
		p.Cnd_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().cst_grp_p());
		p.Cnd_cst_grp_p_PPanel.setName("Cnd.cst_grp_p");
		p.Cnd_cst_grp_lab1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_cst_grp_lab1.addAliasName("Cnd.cst_grp_lab1", p);
		p.Cnd_cst_grp_flg1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_cst_grp_flg1.addAliasName("Cnd.cst_grp_flg1", p);
		p.Cnd_cst_grp_cd1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_cst_grp_cd1.addAliasName("Cnd.cst_grp_cd1", p);
		p.Cnd_cst_grp_nm1 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_cst_grp_nm1.addAliasName("Cnd.cst_grp_nm1", p);
		p.Cnd_cst_grp_lab2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_cst_grp_lab2.addAliasName("Cnd.cst_grp_lab2", p);
		p.Cnd_cst_grp_flg2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_cst_grp_flg2.addAliasName("Cnd.cst_grp_flg2", p);
		p.Cnd_cst_grp_cd2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_cst_grp_cd2.addAliasName("Cnd.cst_grp_cd2", p);
		p.Cnd_cst_grp_nm2 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_cst_grp_nm2.addAliasName("Cnd.cst_grp_nm2", p);
		p.Cnd_cst_grp_lab3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_cst_grp_lab3.addAliasName("Cnd.cst_grp_lab3", p);
		p.Cnd_cst_grp_flg3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_cst_grp_flg3.addAliasName("Cnd.cst_grp_flg3", p);
		p.Cnd_cst_grp_cd3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_cst_grp_cd3.addAliasName("Cnd.cst_grp_cd3", p);
		p.Cnd_cst_grp_nm3 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_cst_grp_nm3.addAliasName("Cnd.cst_grp_nm3", p);
		p.Cnd_cst_grp_lab4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_cst_grp_lab4.addAliasName("Cnd.cst_grp_lab4", p);
		p.Cnd_cst_grp_flg4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_cst_grp_flg4.addAliasName("Cnd.cst_grp_flg4", p);
		p.Cnd_cst_grp_cd4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_cst_grp_cd4.addAliasName("Cnd.cst_grp_cd4", p);
		p.Cnd_cst_grp_nm4 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_cst_grp_nm4.addAliasName("Cnd.cst_grp_nm4", p);
		p.Cnd_cst_grp_lab5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_cst_grp_lab5.addAliasName("Cnd.cst_grp_lab5", p);
		p.Cnd_cst_grp_flg5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_cst_grp_flg5.addAliasName("Cnd.cst_grp_flg5", p);
		p.Cnd_cst_grp_cd5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_cst_grp_cd5.addAliasName("Cnd.cst_grp_cd5", p);
		p.Cnd_cst_grp_nm5 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_cst_grp_nm5.addAliasName("Cnd.cst_grp_nm5", p);
		p.Cnd_cst_grp_lab6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_cst_grp_lab6.addAliasName("Cnd.cst_grp_lab6", p);
		p.Cnd_cst_grp_flg6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_cst_grp_flg6.addAliasName("Cnd.cst_grp_flg6", p);
		p.Cnd_cst_grp_cd6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_cst_grp_cd6.addAliasName("Cnd.cst_grp_cd6", p);
		p.Cnd_cst_grp_nm6 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_cst_grp_nm6.addAliasName("Cnd.cst_grp_nm6", p);
		p.Cnd_cst_grp_lab7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_cst_grp_lab7.addAliasName("Cnd.cst_grp_lab7", p);
		p.Cnd_cst_grp_flg7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_cst_grp_flg7.addAliasName("Cnd.cst_grp_flg7", p);
		p.Cnd_cst_grp_cd7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_cst_grp_cd7.addAliasName("Cnd.cst_grp_cd7", p);
		p.Cnd_cst_grp_nm7 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_cst_grp_nm7.addAliasName("Cnd.cst_grp_nm7", p);
		p.Cnd_cst_grp_lab8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_cst_grp_lab8.addAliasName("Cnd.cst_grp_lab8", p);
		p.Cnd_cst_grp_flg8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_cst_grp_flg8.addAliasName("Cnd.cst_grp_flg8", p);
		p.Cnd_cst_grp_cd8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_cst_grp_cd8.addAliasName("Cnd.cst_grp_cd8", p);
		p.Cnd_cst_grp_nm8 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_cst_grp_nm8.addAliasName("Cnd.cst_grp_nm8", p);
		p.Cnd_cst_grp_lab9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_cst_grp_lab9.addAliasName("Cnd.cst_grp_lab9", p);
		p.Cnd_cst_grp_flg9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_cst_grp_flg9.addAliasName("Cnd.cst_grp_flg9", p);
		p.Cnd_cst_grp_cd9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_cst_grp_cd9.addAliasName("Cnd.cst_grp_cd9", p);
		p.Cnd_cst_grp_nm9 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_cst_grp_nm9.addAliasName("Cnd.cst_grp_nm9", p);
		p.Cnd_cst_grp_lab10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_cst_grp_lab10.addAliasName("Cnd.cst_grp_lab10", p);
		p.Cnd_cst_grp_flg10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_cst_grp_flg10.addAliasName("Cnd.cst_grp_flg10", p);
		p.Cnd_cst_grp_cd10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_cst_grp_cd10.addAliasName("Cnd.cst_grp_cd10", p);
		p.Cnd_cst_grp_nm10 = p.Cnd_cst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_cst_grp_nm10.addAliasName("Cnd.cst_grp_nm10", p);
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
	}

	/**
	 * [CstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCstCnd(MSBBP_SretSrch p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBBP_SretSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBBP_SretSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_SretSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBBP_SretSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_SretSrch p) {
		p.Rslt_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$addr_p);
		p.Rslt_addr_p_PPanel.setName("Rslt.addr_p");
		p.columnRslt_sret_fr_zip_cd = p.Rslt_addr_p_PPanel.columnAddr_zip_cd;
		p.columnRslt_sret_fr_zip_cd.addAliasName("Rslt.sret_fr_zip_cd", p);
		p.columnRslt_sret_fr_addr1 = p.Rslt_addr_p_PPanel.columnAddr_addr1;
		p.columnRslt_sret_fr_addr1.addAliasName("Rslt.sret_fr_addr1", p);
		p.columnRslt_sret_fr_addr2 = p.Rslt_addr_p_PPanel.columnAddr_addr2;
		p.columnRslt_sret_fr_addr2.addAliasName("Rslt.sret_fr_addr2", p);
		p.columnRslt_sret_fr_addr3 = p.Rslt_addr_p_PPanel.columnAddr_addr3;
		p.columnRslt_sret_fr_addr3.addAliasName("Rslt.sret_fr_addr3", p);
		p.columnRslt_sret_fr_addr4 = p.Rslt_addr_p_PPanel.columnAddr_addr4;
		p.columnRslt_sret_fr_addr4.addAliasName("Rslt.sret_fr_addr4", p);
		p.columnRslt_sret_fr_cntct_dpt = p.Rslt_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnRslt_sret_fr_cntct_dpt.addAliasName("Rslt.sret_fr_cntct_dpt", p);
		p.columnRslt_sret_fr_cntct_psn = p.Rslt_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnRslt_sret_fr_cntct_psn.addAliasName("Rslt.sret_fr_cntct_psn", p);
		p.columnRslt_sret_fr_tel = p.Rslt_addr_p_PPanel.columnAddr_tel;
		p.columnRslt_sret_fr_tel.addAliasName("Rslt.sret_fr_tel", p);
		p.columnRslt_sret_fr_fax = p.Rslt_addr_p_PPanel.columnAddr_fax;
		p.columnRslt_sret_fr_fax.addAliasName("Rslt.sret_fr_fax", p);
		p.columnRslt_cntry_cd = p.Rslt_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_cntry_cd.addAliasName("Rslt.cntry_cd", p);
		p.columnRslt_cntry_nm = p.Rslt_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_cntry_nm.addAliasName("Rslt.cntry_nm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$itm_p);
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
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_dtl_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_dtl_base_unit_qty.addAliasName("Rslt.dtl_base_unit_qty", p);
		p.Rslt_arr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$arr_qty_p);
		p.Rslt_arr_qty_p_PPanel.setName("Rslt.arr_qty_p");
		p.columnRslt_dtl_arr_qty = p.Rslt_arr_qty_p_PPanel.columnQty_qty;
		p.columnRslt_dtl_arr_qty.addAliasName("Rslt.dtl_arr_qty", p);
		p.Rslt_sls_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$sls_ret_qty_p);
		p.Rslt_sls_ret_qty_p_PPanel.setName("Rslt.sls_ret_qty_p");
		p.columnRslt_sls_ret_qty = p.Rslt_sls_ret_qty_p_PPanel.columnQty_qty;
		p.columnRslt_sls_ret_qty.addAliasName("Rslt.sls_ret_qty", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_cost_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$cost_upri_p);
		p.Rslt_cost_upri_p_PPanel.setName("Rslt.cost_upri_p");
		p.columnRslt_cost_upri = p.Rslt_cost_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_cost_upri.addAliasName("Rslt.cost_upri", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_cur_inc_tax_amt_p);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.setName("Rslt.base_cur_inc_tax_amt_p");
		p.columnRslt_base_cur_inc_tax_amt = p.Rslt_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_tax_amt.addAliasName("Rslt.base_cur_inc_tax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ptax_cur_inc_tax_amt_p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_tax_amt_p");
		p.columnRslt_ptax_cur_inc_tax_amt = p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_tax_amt.addAliasName("Rslt.ptax_cur_inc_tax_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_dtl_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_dtl_sno1.addAliasName("Rslt.dtl_sno1", p);
		p.columnRslt_dtl_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_dtl_sno2.addAliasName("Rslt.dtl_sno2", p);
		p.columnRslt_dtl_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_dtl_sno3.addAliasName("Rslt.dtl_sno3", p);
		p.columnRslt_dtl_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_dtl_sno4.addAliasName("Rslt.dtl_sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$dlv_grp_p);
		p.Rslt_dlv_grp_p_PPanel.setName("Rslt.dlv_grp_p");
		p.columnRslt_dlv_grp_cd1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_dlv_grp_cd1.addAliasName("Rslt.dlv_grp_cd1", p);
		p.columnRslt_dlv_grp_nm1 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_dlv_grp_nm1.addAliasName("Rslt.dlv_grp_nm1", p);
		p.columnRslt_dlv_grp_cd2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_dlv_grp_cd2.addAliasName("Rslt.dlv_grp_cd2", p);
		p.columnRslt_dlv_grp_nm2 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_dlv_grp_nm2.addAliasName("Rslt.dlv_grp_nm2", p);
		p.columnRslt_dlv_grp_cd3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_dlv_grp_cd3.addAliasName("Rslt.dlv_grp_cd3", p);
		p.columnRslt_dlv_grp_nm3 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_dlv_grp_nm3.addAliasName("Rslt.dlv_grp_nm3", p);
		p.columnRslt_dlv_grp_cd4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_dlv_grp_cd4.addAliasName("Rslt.dlv_grp_cd4", p);
		p.columnRslt_dlv_grp_nm4 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_dlv_grp_nm4.addAliasName("Rslt.dlv_grp_nm4", p);
		p.columnRslt_dlv_grp_cd5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_dlv_grp_cd5.addAliasName("Rslt.dlv_grp_cd5", p);
		p.columnRslt_dlv_grp_nm5 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_dlv_grp_nm5.addAliasName("Rslt.dlv_grp_nm5", p);
		p.columnRslt_dlv_grp_cd6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_dlv_grp_cd6.addAliasName("Rslt.dlv_grp_cd6", p);
		p.columnRslt_dlv_grp_nm6 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_dlv_grp_nm6.addAliasName("Rslt.dlv_grp_nm6", p);
		p.columnRslt_dlv_grp_cd7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_dlv_grp_cd7.addAliasName("Rslt.dlv_grp_cd7", p);
		p.columnRslt_dlv_grp_nm7 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_dlv_grp_nm7.addAliasName("Rslt.dlv_grp_nm7", p);
		p.columnRslt_dlv_grp_cd8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_dlv_grp_cd8.addAliasName("Rslt.dlv_grp_cd8", p);
		p.columnRslt_dlv_grp_nm8 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_dlv_grp_nm8.addAliasName("Rslt.dlv_grp_nm8", p);
		p.columnRslt_dlv_grp_cd9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_dlv_grp_cd9.addAliasName("Rslt.dlv_grp_cd9", p);
		p.columnRslt_dlv_grp_nm9 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_dlv_grp_nm9.addAliasName("Rslt.dlv_grp_nm9", p);
		p.columnRslt_dlv_grp_cd10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_dlv_grp_cd10.addAliasName("Rslt.dlv_grp_cd10", p);
		p.columnRslt_dlv_grp_nm10 = p.Rslt_dlv_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_dlv_grp_nm10.addAliasName("Rslt.dlv_grp_nm10", p);
		p.Rslt_cst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$cst_grp_p);
		p.Rslt_cst_grp_p_PPanel.setName("Rslt.cst_grp_p");
		p.columnRslt_cst_grp_cd1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_cst_grp_cd1.addAliasName("Rslt.cst_grp_cd1", p);
		p.columnRslt_cst_grp_nm1 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_cst_grp_nm1.addAliasName("Rslt.cst_grp_nm1", p);
		p.columnRslt_cst_grp_cd2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_cst_grp_cd2.addAliasName("Rslt.cst_grp_cd2", p);
		p.columnRslt_cst_grp_nm2 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_cst_grp_nm2.addAliasName("Rslt.cst_grp_nm2", p);
		p.columnRslt_cst_grp_cd3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_cst_grp_cd3.addAliasName("Rslt.cst_grp_cd3", p);
		p.columnRslt_cst_grp_nm3 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_cst_grp_nm3.addAliasName("Rslt.cst_grp_nm3", p);
		p.columnRslt_cst_grp_cd4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_cst_grp_cd4.addAliasName("Rslt.cst_grp_cd4", p);
		p.columnRslt_cst_grp_nm4 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_cst_grp_nm4.addAliasName("Rslt.cst_grp_nm4", p);
		p.columnRslt_cst_grp_cd5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_cst_grp_cd5.addAliasName("Rslt.cst_grp_cd5", p);
		p.columnRslt_cst_grp_nm5 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_cst_grp_nm5.addAliasName("Rslt.cst_grp_nm5", p);
		p.columnRslt_cst_grp_cd6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_cst_grp_cd6.addAliasName("Rslt.cst_grp_cd6", p);
		p.columnRslt_cst_grp_nm6 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_cst_grp_nm6.addAliasName("Rslt.cst_grp_nm6", p);
		p.columnRslt_cst_grp_cd7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_cst_grp_cd7.addAliasName("Rslt.cst_grp_cd7", p);
		p.columnRslt_cst_grp_nm7 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_cst_grp_nm7.addAliasName("Rslt.cst_grp_nm7", p);
		p.columnRslt_cst_grp_cd8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_cst_grp_cd8.addAliasName("Rslt.cst_grp_cd8", p);
		p.columnRslt_cst_grp_nm8 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_cst_grp_nm8.addAliasName("Rslt.cst_grp_nm8", p);
		p.columnRslt_cst_grp_cd9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_cst_grp_cd9.addAliasName("Rslt.cst_grp_cd9", p);
		p.columnRslt_cst_grp_nm9 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_cst_grp_nm9.addAliasName("Rslt.cst_grp_nm9", p);
		p.columnRslt_cst_grp_cd10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_cst_grp_cd10.addAliasName("Rslt.cst_grp_cd10", p);
		p.columnRslt_cst_grp_nm10 = p.Rslt_cst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_cst_grp_nm10.addAliasName("Rslt.cst_grp_nm10", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBB.MSBBP1350.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBBP_SretSrch p) {
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

	
	/** [Cnd_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_usr_cd_p = null;

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_usr_cd_ListPutter() {
		if (Cnd_sls_usr_cd_p == null) {
			Cnd_sls_usr_cd_p = createCnd_sls_usr_cd_ListPutter(Cnd_sls_usr_cd, "sls_usr_cd", "sls_usr_nm");

		}
		return Cnd_sls_usr_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
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
	
	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_dest_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd1_p = null;

	/**
	 * [Cnd_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd1_ListPutter() {
		if (Cnd_dest_cd1_p == null) {
			Cnd_dest_cd1_p = createCnd_dest_cd1_ListPutter(Cnd_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Cnd_dest_cd1_p;
	}
	
	
	/** [Cnd_dest_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd2_p = null;

	/**
	 * [Cnd_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd2_ListPutter() {
		if (Cnd_dest_cd2_p == null) {
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Cnd_dest_cd2_p;
	}
	
	
	/** [Cnd_dest_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd3_p = null;

	/**
	 * [Cnd_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd3_ListPutter() {
		if (Cnd_dest_cd3_p == null) {
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Cnd_dest_cd3_p;
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
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	
	
	/** [Cnd_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_itm_cd_p = null;

	/**
	 * [Cnd_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_itm_cd_ListPutter() {
		if (Cnd_cst_itm_cd_p == null) {
			Cnd_cst_itm_cd_p = createCnd_cst_itm_cd_ListPutter(Cnd_cst_itm_cd, "cst_itm_cd", "cst_itm_nm");

		}
		return Cnd_cst_itm_cd_p;
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
	
	
	/** [Cnd_ret_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ret_rsn_cd_p = null;

	/**
	 * [Cnd_ret_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ret_rsn_cd_ListPutter() {
		if (Cnd_ret_rsn_cd_p == null) {
			Cnd_ret_rsn_cd_p = createCnd_ret_rsn_cd_ListPutter(Cnd_ret_rsn_cd, "ret_rsn_cd", "ret_rsn_nm");

		}
		return Cnd_ret_rsn_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SretSrch create(){
		MSBBP_SretSrch p = new MSBBP_SretSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SretSrch create(String name){
		MSBBP_SretSrch p = new MSBBP_SretSrch(name);
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
		MSBBP_SretSrch_MC.jbfInitScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitSrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitSts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitTop((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitFold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitTab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitIv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitSync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitVmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitTab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitTab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitTab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitCstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitDlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitCtrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitRPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitRslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbfInitBtn((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitSrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitSts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitTop((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitFold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitTab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitIv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitSync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitVmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitTab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitTab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitTab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitCstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitDlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitCtrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitRPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitRslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.jbInitBtn((MSBBP_SretSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_SretSrch p) {
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
	protected static void jbfInitTab1(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIv(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.IvPanel = p.beansFactory.createPanel("Iv");
		p.IvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Sync]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSync(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.SyncPanel = p.beansFactory.createPanel("Sync");
		p.SyncTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Vmi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitVmi(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.VmiPanel = p.beansFactory.createPanel("Vmi");
		p.VmiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SRCH_SCHD_REF = p.beansFactory.createRadioButton("Cnd.ope_SRCH_SCHD_REF");
		p.Cnd_ope_SRCH_ACT_REF = p.beansFactory.createRadioButton("Cnd.ope_SRCH_ACT_REF");
		p.Cnd_non_arr_flg = p.beansFactory.createCheckBox("Cnd.non_arr_flg");
		p.Cnd_part_arr_non_ac_flg = p.beansFactory.createCheckBox("Cnd.part_arr_non_ac_flg");
		p.Cnd_part_arr_flg = p.beansFactory.createCheckBox("Cnd.part_arr_flg");
		p.Cnd_cmpl_arr_non_ac_flg = p.beansFactory.createCheckBox("Cnd.cmpl_arr_non_ac_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_SRCH_LST = p.beansFactory.createRadioButton("Cnd.mode_SRCH_LST");
		p.Cnd_mode_SRCH_DTL = p.beansFactory.createRadioButton("Cnd.mode_SRCH_DTL");
		p.Cnd_mode_SRCH_HDR = p.beansFactory.createRadioButton("Cnd.mode_SRCH_HDR");
		p.Cnd_iv_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_trgt_flg");
		p.Cnd_iv_not_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_trgt_flg");
		p.Cnd_sync_flg = p.beansFactory.createCheckBox("Cnd.sync_flg");
		p.Cnd_not_sync_flg = p.beansFactory.createCheckBox("Cnd.not_sync_flg");
		p.Cnd_vmi_flg = p.beansFactory.createCheckBox("Cnd.vmi_flg");
		p.Cnd_not_vmi_flg = p.beansFactory.createCheckBox("Cnd.not_vmi_flg");
		p.Cnd_sls_ret_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_ret_schd_dt_fr_Label");
		p.Cnd_sls_ret_schd_dt_fr = p.beansFactory.createDateField("Cnd.sls_ret_schd_dt_fr");
		p.Cnd_sls_ret_schd_dt_fr.setLabel(p.Cnd_sls_ret_schd_dt_fr_Label);
		p.Cnd_sls_ret_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_ret_schd_dt_to_Label");
		p.Cnd_sls_ret_schd_dt_to = p.beansFactory.createDateField("Cnd.sls_ret_schd_dt_to");
		p.Cnd_sls_ret_schd_dt_to.setLabel(p.Cnd_sls_ret_schd_dt_to_Label);
		p.Cnd_sls_ret_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_ret_dt_fr_Label");
		p.Cnd_sls_ret_dt_fr = p.beansFactory.createDateField("Cnd.sls_ret_dt_fr");
		p.Cnd_sls_ret_dt_fr.setLabel(p.Cnd_sls_ret_dt_fr_Label);
		p.Cnd_sls_ret_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_ret_dt_to_Label");
		p.Cnd_sls_ret_dt_to = p.beansFactory.createDateField("Cnd.sls_ret_dt_to");
		p.Cnd_sls_ret_dt_to.setLabel(p.Cnd_sls_ret_dt_to_Label);
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_dest_cd1_Label = p.beansFactory.createLabel("Cnd.dest_cd1_Label");
		p.Cnd_dest_cd1 = p.beansFactory.createTextField("Cnd.dest_cd1");
		p.Cnd_dest_cd1.setLabel(p.Cnd_dest_cd1_Label);
		p.Cnd_dest_nm1 = p.beansFactory.createTextField("Cnd.dest_nm1");
		p.Cnd_dest_cd2_Label = p.beansFactory.createLabel("Cnd.dest_cd2_Label");
		p.Cnd_dest_cd2 = p.beansFactory.createTextField("Cnd.dest_cd2");
		p.Cnd_dest_cd2.setLabel(p.Cnd_dest_cd2_Label);
		p.Cnd_dest_nm2 = p.beansFactory.createTextField("Cnd.dest_nm2");
		p.Cnd_dest_cd3_Label = p.beansFactory.createLabel("Cnd.dest_cd3_Label");
		p.Cnd_dest_cd3 = p.beansFactory.createTextField("Cnd.dest_cd3");
		p.Cnd_dest_cd3.setLabel(p.Cnd_dest_cd3_Label);
		p.Cnd_dest_nm3 = p.beansFactory.createTextField("Cnd.dest_nm3");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.loc_wg_cd_Label");
		p.Cnd_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.loc_wg_cd");
		p.Cnd_loc_wg_cd.setLabel(p.Cnd_loc_wg_cd_Label);
		p.Cnd_loc_wg_nm = p.beansFactory.createTextField("Cnd.loc_wg_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_sls_ret_schd_no_Label = p.beansFactory.createLabel("Cnd.sls_ret_schd_no_Label");
		p.Cnd_sls_ret_schd_no = p.beansFactory.createTextField("Cnd.sls_ret_schd_no");
		p.Cnd_sls_ret_schd_no.setLabel(p.Cnd_sls_ret_schd_no_Label);
		p.Cnd_sls_ret_schd_d_no_Label = p.beansFactory.createLabel("Cnd.sls_ret_schd_d_no_Label");
		p.Cnd_sls_ret_schd_d_no = p.beansFactory.createTextField("Cnd.sls_ret_schd_d_no");
		p.Cnd_sls_ret_schd_d_no.setLabel(p.Cnd_sls_ret_schd_d_no_Label);
		p.Cnd_arr_act_no_Label = p.beansFactory.createLabel("Cnd.arr_act_no_Label");
		p.Cnd_arr_act_no = p.beansFactory.createTextField("Cnd.arr_act_no");
		p.Cnd_arr_act_no.setLabel(p.Cnd_arr_act_no_Label);
		p.Cnd_sls_act_no_Label = p.beansFactory.createLabel("Cnd.sls_act_no_Label");
		p.Cnd_sls_act_no = p.beansFactory.createTextField("Cnd.sls_act_no");
		p.Cnd_sls_act_no.setLabel(p.Cnd_sls_act_no_Label);
		p.Cnd_sls_act_d_no_Label = p.beansFactory.createLabel("Cnd.sls_act_d_no_Label");
		p.Cnd_sls_act_d_no = p.beansFactory.createTextField("Cnd.sls_act_d_no");
		p.Cnd_sls_act_d_no.setLabel(p.Cnd_sls_act_d_no_Label);
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_inc_ret_dscnt_flg = p.beansFactory.createCheckBox("Cnd.inc_ret_dscnt_flg");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_ret_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ret_rsn_cd_Label");
		p.Cnd_ret_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ret_rsn_cd");
		p.Cnd_ret_rsn_cd.setLabel(p.Cnd_ret_rsn_cd_Label);
		p.Cnd_ret_rsn_nm = p.beansFactory.createTextField("Cnd.ret_rsn_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_schd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_intr_rmrks_Label");
		p.Cnd_schd_intr_rmrks = p.beansFactory.createTextField("Cnd.schd_intr_rmrks");
		p.Cnd_schd_intr_rmrks.setLabel(p.Cnd_schd_intr_rmrks_Label);
		p.Cnd_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_rmrks_Label");
		p.Cnd_act_intr_rmrks = p.beansFactory.createTextField("Cnd.act_intr_rmrks");
		p.Cnd_act_intr_rmrks.setLabel(p.Cnd_act_intr_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_schd_d_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_d_intr_rmrks_Label");
		p.Cnd_schd_d_intr_rmrks = p.beansFactory.createTextField("Cnd.schd_d_intr_rmrks");
		p.Cnd_schd_d_intr_rmrks.setLabel(p.Cnd_schd_d_intr_rmrks_Label);
		p.Cnd_act_d_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.act_d_intr_rmrks_Label");
		p.Cnd_act_d_intr_rmrks = p.beansFactory.createTextField("Cnd.act_d_intr_rmrks");
		p.Cnd_act_d_intr_rmrks.setLabel(p.Cnd_act_d_intr_rmrks_Label);
		p.Cnd_arr_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.arr_cnt_rmrks_Label");
		p.Cnd_arr_cnt_rmrks = p.beansFactory.createTextField("Cnd.arr_cnt_rmrks");
		p.Cnd_arr_cnt_rmrks.setLabel(p.Cnd_arr_cnt_rmrks_Label);
		p.Cnd_schd_sub_char1_Label = p.beansFactory.createLabel("Cnd.schd_sub_char1_Label");
		p.Cnd_schd_sub_char1 = p.beansFactory.createTextField("Cnd.schd_sub_char1");
		p.Cnd_schd_sub_char1.setLabel(p.Cnd_schd_sub_char1_Label);
		p.Cnd_schd_sub_char2_Label = p.beansFactory.createLabel("Cnd.schd_sub_char2_Label");
		p.Cnd_schd_sub_char2 = p.beansFactory.createTextField("Cnd.schd_sub_char2");
		p.Cnd_schd_sub_char2.setLabel(p.Cnd_schd_sub_char2_Label);
		p.Cnd_schd_sub_char3_Label = p.beansFactory.createLabel("Cnd.schd_sub_char3_Label");
		p.Cnd_schd_sub_char3 = p.beansFactory.createTextField("Cnd.schd_sub_char3");
		p.Cnd_schd_sub_char3.setLabel(p.Cnd_schd_sub_char3_Label);
		p.Cnd_schd_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.schd_d_sub_char1_Label");
		p.Cnd_schd_d_sub_char1 = p.beansFactory.createTextField("Cnd.schd_d_sub_char1");
		p.Cnd_schd_d_sub_char1.setLabel(p.Cnd_schd_d_sub_char1_Label);
		p.Cnd_schd_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.schd_d_sub_char2_Label");
		p.Cnd_schd_d_sub_char2 = p.beansFactory.createTextField("Cnd.schd_d_sub_char2");
		p.Cnd_schd_d_sub_char2.setLabel(p.Cnd_schd_d_sub_char2_Label);
		p.Cnd_schd_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.schd_d_sub_char3_Label");
		p.Cnd_schd_d_sub_char3 = p.beansFactory.createTextField("Cnd.schd_d_sub_char3");
		p.Cnd_schd_d_sub_char3.setLabel(p.Cnd_schd_d_sub_char3_Label);
		p.Cnd_act_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_sub_char1_Label");
		p.Cnd_act_sub_char1 = p.beansFactory.createTextField("Cnd.act_sub_char1");
		p.Cnd_act_sub_char1.setLabel(p.Cnd_act_sub_char1_Label);
		p.Cnd_act_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_sub_char2_Label");
		p.Cnd_act_sub_char2 = p.beansFactory.createTextField("Cnd.act_sub_char2");
		p.Cnd_act_sub_char2.setLabel(p.Cnd_act_sub_char2_Label);
		p.Cnd_act_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_sub_char3_Label");
		p.Cnd_act_sub_char3 = p.beansFactory.createTextField("Cnd.act_sub_char3");
		p.Cnd_act_sub_char3.setLabel(p.Cnd_act_sub_char3_Label);
		p.Cnd_act_d_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char1_Label");
		p.Cnd_act_d_sub_char1 = p.beansFactory.createTextField("Cnd.act_d_sub_char1");
		p.Cnd_act_d_sub_char1.setLabel(p.Cnd_act_d_sub_char1_Label);
		p.Cnd_act_d_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char2_Label");
		p.Cnd_act_d_sub_char2 = p.beansFactory.createTextField("Cnd.act_d_sub_char2");
		p.Cnd_act_d_sub_char2.setLabel(p.Cnd_act_d_sub_char2_Label);
		p.Cnd_act_d_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_d_sub_char3_Label");
		p.Cnd_act_d_sub_char3 = p.beansFactory.createTextField("Cnd.act_d_sub_char3");
		p.Cnd_act_d_sub_char3.setLabel(p.Cnd_act_d_sub_char3_Label);
		p.Cnd_act_io_sub_char1_Label = p.beansFactory.createLabel("Cnd.act_io_sub_char1_Label");
		p.Cnd_act_io_sub_char1 = p.beansFactory.createTextField("Cnd.act_io_sub_char1");
		p.Cnd_act_io_sub_char1.setLabel(p.Cnd_act_io_sub_char1_Label);
		p.Cnd_act_io_sub_char2_Label = p.beansFactory.createLabel("Cnd.act_io_sub_char2_Label");
		p.Cnd_act_io_sub_char2 = p.beansFactory.createTextField("Cnd.act_io_sub_char2");
		p.Cnd_act_io_sub_char2.setLabel(p.Cnd_act_io_sub_char2_Label);
		p.Cnd_act_io_sub_char3_Label = p.beansFactory.createLabel("Cnd.act_io_sub_char3_Label");
		p.Cnd_act_io_sub_char3 = p.beansFactory.createTextField("Cnd.act_io_sub_char3");
		p.Cnd_act_io_sub_char3.setLabel(p.Cnd_act_io_sub_char3_Label);
		p.Cnd_inc_abort_flg = p.beansFactory.createCheckBox("Cnd.inc_abort_flg");
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCstCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel = p.beansFactory.createPanel("CstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_sret_schd_sts_typ = p.beansFactory.createTableColumn("Rslt.sret_schd_sts_typ", MCColumnType.TEXT);
		p.columnRslt_sret_schd_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.sret_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_sls_ret_schd_no = p.beansFactory.createTableColumn("Rslt.sls_ret_schd_no", MCColumnType.TEXT);
		p.columnRslt_sls_ret_schd_d_no = p.beansFactory.createTableColumn("Rslt.sls_ret_schd_d_no", MCColumnType.TEXT);
		p.columnRslt_sls_ret_schd_dt = p.beansFactory.createTableColumn("Rslt.sls_ret_schd_dt", MCColumnType.DATE);
		p.columnRslt_arr_act_no = p.beansFactory.createTableColumn("Rslt.arr_act_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_no = p.beansFactory.createTableColumn("Rslt.sls_act_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_rev = p.beansFactory.createTableColumn("Rslt.sls_act_rev", MCColumnType.NUMBER);
		p.columnRslt_sls_act_d_no = p.beansFactory.createTableColumn("Rslt.sls_act_d_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_io_no = p.beansFactory.createTableColumn("Rslt.sls_act_io_no", MCColumnType.TEXT);
		p.columnRslt_sls_dt = p.beansFactory.createTableColumn("Rslt.sls_dt", MCColumnType.DATE);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_bill_basis_dt = p.beansFactory.createTableColumn("Rslt.bill_basis_dt", MCColumnType.DATE);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_nm = p.beansFactory.createTableColumn("Rslt.acst_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_ref_iv_no = p.beansFactory.createTableColumn("Rslt.ref_iv_no", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_intr_rmrks = p.beansFactory.createTableColumn("Rslt.schd_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_sync_flg = p.beansFactory.createTableColumn("Rslt.sync_flg", MCColumnType.CHECK);
		p.columnRslt_sret_fr_cd = p.beansFactory.createTableColumn("Rslt.sret_fr_cd", MCColumnType.TEXT);
		p.columnRslt_sret_fr_nm = p.beansFactory.createTableColumn("Rslt.sret_fr_nm", MCColumnType.TEXT);
		p.columnRslt_sret_fr_sundry_flg = p.beansFactory.createTableColumn("Rslt.sret_fr_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_pri_prnt_flg = p.beansFactory.createTableColumn("Rslt.pri_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_nm1 = p.beansFactory.createTableColumn("Rslt.dest_nm1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_nm2 = p.beansFactory.createTableColumn("Rslt.dest_nm2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_dest_nm3 = p.beansFactory.createTableColumn("Rslt.dest_nm3", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_cntry_org_cd = p.beansFactory.createTableColumn("Rslt.cntry_org_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_org_nm = p.beansFactory.createTableColumn("Rslt.cntry_org_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_qty_dec_place = p.beansFactory.createTableColumn("Rslt.trd_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_qty_dec_place = p.beansFactory.createTableColumn("Rslt.base_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_arr_cmpl_flg = p.beansFactory.createTableColumn("Rslt.arr_cmpl_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_tax_fix_flg = p.beansFactory.createTableColumn("Rslt.tax_fix_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_cnsgn_gd_cd = p.beansFactory.createTableColumn("Rslt.cnsgn_gd_cd", MCColumnType.TEXT);
		p.columnRslt_cnsgn_gd_nm = p.beansFactory.createTableColumn("Rslt.cnsgn_gd_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_loc_wg_nm = p.beansFactory.createTableColumn("Rslt.loc_wg_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_vmi_flg = p.beansFactory.createTableColumn("Rslt.vmi_flg", MCColumnType.CHECK);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_ret_rsn_cd = p.beansFactory.createTableColumn("Rslt.ret_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_ret_rsn_nm = p.beansFactory.createTableColumn("Rslt.ret_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_wtax_amt = p.beansFactory.createTableColumn("Rslt.wtax_amt", MCColumnType.NUMBER);
		p.columnRslt_bill_crryovr_times = p.beansFactory.createTableColumn("Rslt.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_d_intr_rmrks = p.beansFactory.createTableColumn("Rslt.schd_d_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_d_intr_rmrks = p.beansFactory.createTableColumn("Rslt.act_d_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_arr_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.arr_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char3", MCColumnType.TEXT);
		p.columnRslt_ref_sls_act_no = p.beansFactory.createTableColumn("Rslt.ref_sls_act_no", MCColumnType.TEXT);
		p.columnRslt_ref_sls_act_d_no = p.beansFactory.createTableColumn("Rslt.ref_sls_act_d_no", MCColumnType.TEXT);
		p.columnRslt_base_sls_ac_dt = p.beansFactory.createTableColumn("Rslt.base_sls_ac_dt", MCColumnType.DATE);
		p.columnRslt_purc_ret_act_no = p.beansFactory.createTableColumn("Rslt.purc_ret_act_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_act_d_no = p.beansFactory.createTableColumn("Rslt.purc_ret_act_d_no", MCColumnType.TEXT);
		p.columnRslt_base_purc_ac_dt = p.beansFactory.createTableColumn("Rslt.base_purc_ac_dt", MCColumnType.DATE);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
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
	protected static void jbfInitBtn(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1330 = p.beansFactory.createButton("Btn.open_MSBBP1330", "open");
		p.Btn_open_MSBBP1340 = p.beansFactory.createButton("Btn.open_MSBBP1340", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SrchModePanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.StsPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.add(p.StsPanel);
		p.StsPanel.setNextBeans(p.TopPanel);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NNWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_SretSrch p) {
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
	protected static void jbInitFold(MSBBP_SretSrch p) {
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
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.FoldTab.add(p.Tab4Panel, "Fold.tab4");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.IvPanel, null);
		p.Tab1Panel.setLastBeans(p.IvPanel);
		p.IvPanel.setNextBeans(p.SyncPanel);
		p.Tab1Panel.add(p.SyncPanel, null);
		p.SyncPanel.setNextBeans(p.VmiPanel);
		p.Tab1Panel.add(p.VmiPanel, null);
		p.VmiPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIv(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.IvPanel.setBorder(p.IvTitledBorder);
		p.IvPanel.setValueCheck(false);
		p.IvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Sync]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSync(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.SyncPanel.setBorder(p.SyncTitledBorder);
		p.SyncPanel.setValueCheck(false);
		p.SyncPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SyncPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Vmi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitVmi(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.VmiPanel.setBorder(p.VmiTitledBorder);
		p.VmiPanel.setValueCheck(false);
		p.VmiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.VmiPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.DlvCndPanel, null);
		p.Tab2Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.CstCndPanel, null);
		p.Tab3Panel.setLastBeans(p.CstCndPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SRCH_SCHD_REF);
		p.Cnd_ope_SRCH_SCHD_REF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_SCHD_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_SCHD_REF);
		p.Cnd_ope_SRCH_SCHD_REF.setNextBeans(p.Cnd_ope_SRCH_ACT_REF);
		p.Cnd_ope_SRCH_ACT_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_ACT_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_ACT_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ope_META);
		p.StsPanel.add(p.Cnd_non_arr_flg);
		p.StsPanel.setLastBeans(p.Cnd_non_arr_flg);
		p.Cnd_non_arr_flg.setNextBeans(p.Cnd_part_arr_non_ac_flg);
		p.Cnd_non_arr_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.non_arr_flg_META);
		p.StsPanel.add(p.Cnd_part_arr_non_ac_flg);
		p.Cnd_part_arr_non_ac_flg.setNextBeans(p.Cnd_part_arr_flg);
		p.Cnd_part_arr_non_ac_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.part_arr_non_ac_flg_META);
		p.StsPanel.add(p.Cnd_part_arr_flg);
		p.Cnd_part_arr_flg.setNextBeans(p.Cnd_cmpl_arr_non_ac_flg);
		p.Cnd_part_arr_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.part_arr_flg_META);
		p.StsPanel.add(p.Cnd_cmpl_arr_non_ac_flg);
		p.Cnd_cmpl_arr_non_ac_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_arr_non_ac_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cmpl_arr_non_ac_flg_META);
		p.StsPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cmpl_flg_META);
		p.SrchModePanel.setLastBeans(p.Cnd_mode_Group);
		p.Cnd_mode_Group.setFirstBeans(p.Cnd_mode_SRCH_LST);
		p.Cnd_mode_SRCH_LST.setActionCommand("0");
		p.Cnd_mode_Group.add(p.Cnd_mode_SRCH_LST);
		p.SrchModePanel.add(p.Cnd_mode_SRCH_LST);
		p.Cnd_mode_SRCH_LST.setNextBeans(p.Cnd_mode_SRCH_DTL);
		p.Cnd_mode_SRCH_DTL.setActionCommand("1");
		p.Cnd_mode_Group.add(p.Cnd_mode_SRCH_DTL);
		p.SrchModePanel.add(p.Cnd_mode_SRCH_DTL);
		p.Cnd_mode_SRCH_DTL.setNextBeans(p.Cnd_mode_SRCH_HDR);
		p.Cnd_mode_SRCH_HDR.setActionCommand("2");
		p.Cnd_mode_Group.add(p.Cnd_mode_SRCH_HDR);
		p.SrchModePanel.add(p.Cnd_mode_SRCH_HDR);
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.mode_META);
		p.IvPanel.add(p.Cnd_iv_trgt_flg);
		p.IvPanel.setLastBeans(p.Cnd_iv_trgt_flg);
		p.Cnd_iv_trgt_flg.setNextBeans(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.iv_trgt_flg_META);
		p.IvPanel.add(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_not_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.iv_not_trgt_flg_META);
		p.SyncPanel.add(p.Cnd_sync_flg);
		p.SyncPanel.setLastBeans(p.Cnd_sync_flg);
		p.Cnd_sync_flg.setNextBeans(p.Cnd_not_sync_flg);
		p.Cnd_sync_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sync_flg_META);
		p.SyncPanel.add(p.Cnd_not_sync_flg);
		p.Cnd_not_sync_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.not_sync_flg_META);
		p.VmiPanel.add(p.Cnd_vmi_flg);
		p.VmiPanel.setLastBeans(p.Cnd_vmi_flg);
		p.Cnd_vmi_flg.setNextBeans(p.Cnd_not_vmi_flg);
		p.Cnd_vmi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.vmi_flg_META);
		p.VmiPanel.add(p.Cnd_not_vmi_flg);
		p.Cnd_not_vmi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.not_vmi_flg_META);
		p.CndPanel.add(p.Cnd_sls_ret_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_sls_ret_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_sls_ret_schd_dt_fr);
		p.Cnd_sls_ret_schd_dt_fr.setNextBeans(p.Cnd_sls_ret_schd_dt_to);
		p.Cnd_sls_ret_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_schd_dt_fr_META);
		p.Cnd_sls_ret_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_ret_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_sls_ret_schd_dt_to);
		p.Cnd_sls_ret_schd_dt_to.setNextBeans(p.Cnd_sls_ret_dt_fr);
		p.Cnd_sls_ret_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_schd_dt_to_META);
		p.Cnd_sls_ret_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_ret_dt_fr_Label);
		p.CndPanel.add(p.Cnd_sls_ret_dt_fr);
		p.Cnd_sls_ret_dt_fr.setNextBeans(p.Cnd_sls_ret_dt_to);
		p.Cnd_sls_ret_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_dt_fr_META);
		p.Cnd_sls_ret_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_ret_dt_to_Label);
		p.CndPanel.add(p.Cnd_sls_ret_dt_to);
		p.Cnd_sls_ret_dt_to.setNextBeans(p.Cnd_ac_ym_fr);
		p.Cnd_sls_ret_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_dt_to_META);
		p.Cnd_sls_ret_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_site_cd);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_wg_cd, true);
		p.Cnd_loc_wg_cd.setLinkBeans(p.Cnd_loc_wg_nm);
		p.CndPanel.add(p.Cnd_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_loc_wg_cd);
		p.Cnd_loc_wg_cd.setNextBeans(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_wg_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_sls_ret_schd_no);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_sls_ret_schd_no_Label);
		p.CndPanel.add(p.Cnd_sls_ret_schd_no);
		p.Cnd_sls_ret_schd_no.setNextBeans(p.Cnd_sls_ret_schd_d_no);
		p.Cnd_sls_ret_schd_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_schd_no_META);
		p.setPluralValueEnable(p.Cnd_sls_ret_schd_no, true);
		p.CndPanel.add(p.Cnd_sls_ret_schd_d_no_Label);
		p.CndPanel.add(p.Cnd_sls_ret_schd_d_no);
		p.Cnd_sls_ret_schd_d_no.setNextBeans(p.Cnd_arr_act_no);
		p.Cnd_sls_ret_schd_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_ret_schd_d_no_META);
		p.setPluralValueEnable(p.Cnd_sls_ret_schd_d_no, true);
		p.CndPanel.add(p.Cnd_arr_act_no_Label);
		p.CndPanel.add(p.Cnd_arr_act_no);
		p.Cnd_arr_act_no.setNextBeans(p.Cnd_sls_act_no);
		p.Cnd_arr_act_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.arr_act_no_META);
		p.setPluralValueEnable(p.Cnd_arr_act_no, true);
		p.CndPanel.add(p.Cnd_sls_act_no_Label);
		p.CndPanel.add(p.Cnd_sls_act_no);
		p.Cnd_sls_act_no.setNextBeans(p.Cnd_sls_act_d_no);
		p.Cnd_sls_act_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_act_no_META);
		p.setPluralValueEnable(p.Cnd_sls_act_no, true);
		p.CndPanel.add(p.Cnd_sls_act_d_no_Label);
		p.CndPanel.add(p.Cnd_sls_act_d_no);
		p.Cnd_sls_act_d_no.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_sls_act_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sls_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_sls_act_d_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_inc_ret_dscnt_flg);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_nm_META);
		p.CndPanel.add(p.Cnd_inc_ret_dscnt_flg);
		p.Cnd_inc_ret_dscnt_flg.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_inc_ret_dscnt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.inc_ret_dscnt_flg_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_ret_rsn_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_ret_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ret_rsn_cd, true);
		p.Cnd_ret_rsn_cd.setLinkBeans(p.Cnd_ret_rsn_nm);
		p.CndPanel.add(p.Cnd_ret_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ret_rsn_cd);
		p.Cnd_ret_rsn_cd.setNextBeans(p.Cnd_ret_rsn_nm);
		p.Cnd_ret_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ret_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ret_rsn_nm);
		p.Cnd_ret_rsn_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_ret_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.ret_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ret_rsn_nm, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_schd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks);
		p.Cnd_schd_intr_rmrks.setNextBeans(p.Cnd_act_intr_rmrks);
		p.Cnd_schd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_rmrks);
		p.Cnd_act_intr_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_schd_d_intr_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_d_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_d_intr_rmrks);
		p.Cnd_schd_d_intr_rmrks.setNextBeans(p.Cnd_act_d_intr_rmrks);
		p.Cnd_schd_d_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_d_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_d_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_act_d_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_d_intr_rmrks);
		p.Cnd_act_d_intr_rmrks.setNextBeans(p.Cnd_arr_cnt_rmrks);
		p.Cnd_act_d_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_d_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_d_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_arr_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_arr_cnt_rmrks);
		p.Cnd_arr_cnt_rmrks.setNextBeans(p.Cnd_schd_sub_char1);
		p.Cnd_arr_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.arr_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_arr_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char1);
		p.Cnd_schd_sub_char1.setNextBeans(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char2.setNextBeans(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char3.setNextBeans(p.Cnd_schd_d_sub_char1);
		p.Cnd_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char3, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char1);
		p.Cnd_schd_d_sub_char1.setNextBeans(p.Cnd_schd_d_sub_char2);
		p.Cnd_schd_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char2);
		p.Cnd_schd_d_sub_char2.setNextBeans(p.Cnd_schd_d_sub_char3);
		p.Cnd_schd_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char3);
		p.Cnd_schd_d_sub_char3.setNextBeans(p.Cnd_act_sub_char1);
		p.Cnd_schd_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.schd_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_sub_char1);
		p.Cnd_act_sub_char1.setNextBeans(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char2.setNextBeans(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char3.setNextBeans(p.Cnd_act_d_sub_char1);
		p.Cnd_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char1);
		p.Cnd_act_d_sub_char1.setNextBeans(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char2.setNextBeans(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char3.setNextBeans(p.Cnd_act_io_sub_char1);
		p.Cnd_act_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char1);
		p.Cnd_act_io_sub_char1.setNextBeans(p.Cnd_act_io_sub_char2);
		p.Cnd_act_io_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_io_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char2);
		p.Cnd_act_io_sub_char2.setNextBeans(p.Cnd_act_io_sub_char3);
		p.Cnd_act_io_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_io_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char3);
		p.Cnd_act_io_sub_char3.setNextBeans(p.Cnd_inc_abort_flg);
		p.Cnd_act_io_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.act_io_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_abort_flg);
		p.Cnd_inc_abort_flg.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_inc_abort_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.inc_abort_flg_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1350.CndR.inc_can_flg_META);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.CstCndPanel.add(p.Cnd_cst_grp_p_PPanel);
		p.CstCndPanel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [CstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCstCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.CstCndPanel.setValueCheck(false);
		p.CstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_SretSrch p) {
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
	protected static void jbInitRPnl(MSBBP_SretSrch p) {
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
	protected static void jbInitRslt(MSBBP_SretSrch p) {
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
	protected static void jbInitBtn(MSBBP_SretSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1330.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1330);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1330);
		p.Btn_open_MSBBP1330.setNextBeans(p.Btn_open_MSBBP1340);
		p.Btn_open_MSBBP1340.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBBP1340);
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
		MSBBP_SretSrch_MC.mcInitScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitSrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitSts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitTop((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitFold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitTab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitIv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitSync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitVmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitTab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitTab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitTab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitCstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitDlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitCtrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitRPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitRslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.mcInitBtn((MSBBP_SretSrch)this);

		// [SRCH_SCHD_LST]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__LST_Btn((MSBBP_SretSrch)this);

		// [SRCH_SCHD_DTL]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__DTL_Btn((MSBBP_SretSrch)this);

		// [SRCH_SCHD_HDR]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__SCHD__HDR_Btn((MSBBP_SretSrch)this);

		// [SRCH_ACT_LST]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__LST_Btn((MSBBP_SretSrch)this);

		// [SRCH_ACT_DTL]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__DTL_Btn((MSBBP_SretSrch)this);

		// [SRCH_ACT_HDR]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitSRCH__ACT__HDR_Btn((MSBBP_SretSrch)this);

		// [REF_SCHD_LST]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__LST_Btn((MSBBP_SretSrch)this);

		// [REF_SCHD_DTL]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__DTL_Btn((MSBBP_SretSrch)this);

		// [REF_SCHD_HDR]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__SCHD__HDR_Btn((MSBBP_SretSrch)this);

		// [REF_ACT_LST]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__LST_Btn((MSBBP_SretSrch)this);

		// [REF_ACT_DTL]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__DTL_Btn((MSBBP_SretSrch)this);

		// [REF_ACT_HDR]ステータスのモードの設定
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_ScreenOpe((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_SrchMode((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Sts((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Top((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Fold((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Tab1((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Iv((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Sync((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Vmi((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Tab2((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Tab3((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Tab4((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Cnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_CstCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_DlvCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_ItmCnd((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Ctrl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_RPnl((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Rslt((MSBBP_SretSrch)this);
		MSBBP_SretSrch_MC.statusInitREF__ACT__HDR_Btn((MSBBP_SretSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_SretSrch p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBBP_SretSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBBP_SretSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_SretSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_SretSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_SretSrch p) {
	}

	/**
	 *  [Iv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIv(MSBBP_SretSrch p) {
	}

	/**
	 *  [Sync]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSync(MSBBP_SretSrch p) {
	}

	/**
	 *  [Vmi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitVmi(MSBBP_SretSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_SretSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_SretSrch p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_SretSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SretSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SRCH_SCHD_REF.addAllListener(p);
		p.Cnd_ope_SRCH_ACT_REF.addAllListener(p);
		p.Cnd_non_arr_flg.addAllListener(p);
		p.Cnd_part_arr_non_ac_flg.addAllListener(p);
		p.Cnd_part_arr_flg.addAllListener(p);
		p.Cnd_cmpl_arr_non_ac_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_SRCH_LST.addAllListener(p);
		p.Cnd_mode_SRCH_DTL.addAllListener(p);
		p.Cnd_mode_SRCH_HDR.addAllListener(p);
		p.Cnd_iv_trgt_flg.addAllListener(p);
		p.Cnd_iv_not_trgt_flg.addAllListener(p);
		p.Cnd_sync_flg.addAllListener(p);
		p.Cnd_not_sync_flg.addAllListener(p);
		p.Cnd_vmi_flg.addAllListener(p);
		p.Cnd_not_vmi_flg.addAllListener(p);
		p.Cnd_sls_ret_schd_dt_fr.setListListener(p);
		p.Cnd_sls_ret_schd_dt_fr.addAllListener(p);
		p.Cnd_sls_ret_schd_dt_to.setListListener(p);
		p.Cnd_sls_ret_schd_dt_to.addAllListener(p);
		p.Cnd_sls_ret_dt_fr.setListListener(p);
		p.Cnd_sls_ret_dt_fr.addAllListener(p);
		p.Cnd_sls_ret_dt_to.setListListener(p);
		p.Cnd_sls_ret_dt_to.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_dest_cd1.setListListener(p);
		p.Cnd_dest_cd1.addAllListener(p);
		p.Cnd_dest_nm1.setListListener(p);
		p.Cnd_dest_nm1.addAllListener(p);
		p.Cnd_dest_cd2.setListListener(p);
		p.Cnd_dest_cd2.addAllListener(p);
		p.Cnd_dest_nm2.setListListener(p);
		p.Cnd_dest_nm2.addAllListener(p);
		p.Cnd_dest_cd3.setListListener(p);
		p.Cnd_dest_cd3.addAllListener(p);
		p.Cnd_dest_nm3.setListListener(p);
		p.Cnd_dest_nm3.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_wg_cd.setListListener(p);
		p.Cnd_loc_wg_cd.addAllListener(p);
		p.Cnd_loc_wg_nm.setListListener(p);
		p.Cnd_loc_wg_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_sls_ret_schd_no.setListListener(p);
		p.Cnd_sls_ret_schd_no.addAllListener(p);
		p.Cnd_sls_ret_schd_d_no.setListListener(p);
		p.Cnd_sls_ret_schd_d_no.addAllListener(p);
		p.Cnd_arr_act_no.setListListener(p);
		p.Cnd_arr_act_no.addAllListener(p);
		p.Cnd_sls_act_no.setListListener(p);
		p.Cnd_sls_act_no.addAllListener(p);
		p.Cnd_sls_act_d_no.setListListener(p);
		p.Cnd_sls_act_d_no.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_inc_ret_dscnt_flg.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_ret_rsn_cd.setListListener(p);
		p.Cnd_ret_rsn_cd.addAllListener(p);
		p.Cnd_ret_rsn_nm.setListListener(p);
		p.Cnd_ret_rsn_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_schd_intr_rmrks.setListListener(p);
		p.Cnd_schd_intr_rmrks.addAllListener(p);
		p.Cnd_act_intr_rmrks.setListListener(p);
		p.Cnd_act_intr_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_schd_d_intr_rmrks.setListListener(p);
		p.Cnd_schd_d_intr_rmrks.addAllListener(p);
		p.Cnd_act_d_intr_rmrks.setListListener(p);
		p.Cnd_act_d_intr_rmrks.addAllListener(p);
		p.Cnd_arr_cnt_rmrks.setListListener(p);
		p.Cnd_arr_cnt_rmrks.addAllListener(p);
		p.Cnd_schd_sub_char1.setListListener(p);
		p.Cnd_schd_sub_char1.addAllListener(p);
		p.Cnd_schd_sub_char2.setListListener(p);
		p.Cnd_schd_sub_char2.addAllListener(p);
		p.Cnd_schd_sub_char3.setListListener(p);
		p.Cnd_schd_sub_char3.addAllListener(p);
		p.Cnd_schd_d_sub_char1.setListListener(p);
		p.Cnd_schd_d_sub_char1.addAllListener(p);
		p.Cnd_schd_d_sub_char2.setListListener(p);
		p.Cnd_schd_d_sub_char2.addAllListener(p);
		p.Cnd_schd_d_sub_char3.setListListener(p);
		p.Cnd_schd_d_sub_char3.addAllListener(p);
		p.Cnd_act_sub_char1.setListListener(p);
		p.Cnd_act_sub_char1.addAllListener(p);
		p.Cnd_act_sub_char2.setListListener(p);
		p.Cnd_act_sub_char2.addAllListener(p);
		p.Cnd_act_sub_char3.setListListener(p);
		p.Cnd_act_sub_char3.addAllListener(p);
		p.Cnd_act_d_sub_char1.setListListener(p);
		p.Cnd_act_d_sub_char1.addAllListener(p);
		p.Cnd_act_d_sub_char2.setListListener(p);
		p.Cnd_act_d_sub_char2.addAllListener(p);
		p.Cnd_act_d_sub_char3.setListListener(p);
		p.Cnd_act_d_sub_char3.addAllListener(p);
		p.Cnd_act_io_sub_char1.setListListener(p);
		p.Cnd_act_io_sub_char1.addAllListener(p);
		p.Cnd_act_io_sub_char2.setListListener(p);
		p.Cnd_act_io_sub_char2.addAllListener(p);
		p.Cnd_act_io_sub_char3.setListListener(p);
		p.Cnd_act_io_sub_char3.addAllListener(p);
		p.Cnd_inc_abort_flg.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
	}

	/**
	 *  [CstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCstCnd(MSBBP_SretSrch p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBBP_SretSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBBP_SretSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_SretSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBBP_SretSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_SretSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ.setListListener(p);
		p.columnRslt_sret_schd_sts_typ_nm.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_sls_ret_schd_no.addAllListener(p);
		p.columnRslt_sls_ret_schd_no.setListListener(p);
		p.columnRslt_sls_ret_schd_d_no.addAllListener(p);
		p.columnRslt_sls_ret_schd_d_no.setListListener(p);
		p.columnRslt_sls_ret_schd_dt.addAllListener(p);
		p.columnRslt_sls_ret_schd_dt.setListListener(p);
		p.columnRslt_arr_act_no.addAllListener(p);
		p.columnRslt_arr_act_no.setListListener(p);
		p.columnRslt_sls_act_no.addAllListener(p);
		p.columnRslt_sls_act_no.setListListener(p);
		p.columnRslt_sls_act_rev.addAllListener(p);
		p.columnRslt_sls_act_rev.setListListener(p);
		p.columnRslt_sls_act_d_no.addAllListener(p);
		p.columnRslt_sls_act_d_no.setListListener(p);
		p.columnRslt_sls_act_io_no.addAllListener(p);
		p.columnRslt_sls_act_io_no.setListListener(p);
		p.columnRslt_sls_dt.addAllListener(p);
		p.columnRslt_sls_dt.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_bill_basis_dt.addAllListener(p);
		p.columnRslt_bill_basis_dt.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_acst_nm.addAllListener(p);
		p.columnRslt_acst_nm.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_trd_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_upri_dec_place.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_amt_dec_place.addAllListener(p);
		p.columnRslt_base_amt_dec_place.setListListener(p);
		p.columnRslt_base_upri_dec_place.addAllListener(p);
		p.columnRslt_base_upri_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_ptax_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_upri_dec_place.addAllListener(p);
		p.columnRslt_ptax_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_ref_iv_no.addAllListener(p);
		p.columnRslt_ref_iv_no.setListListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_schd_intr_rmrks.addAllListener(p);
		p.columnRslt_schd_intr_rmrks.setListListener(p);
		p.columnRslt_act_intr_rmrks.addAllListener(p);
		p.columnRslt_act_intr_rmrks.setListListener(p);
		p.columnRslt_schd_sub_char1.addAllListener(p);
		p.columnRslt_schd_sub_char1.setListListener(p);
		p.columnRslt_schd_sub_char2.addAllListener(p);
		p.columnRslt_schd_sub_char2.setListListener(p);
		p.columnRslt_schd_sub_char3.addAllListener(p);
		p.columnRslt_schd_sub_char3.setListListener(p);
		p.columnRslt_act_sub_char1.addAllListener(p);
		p.columnRslt_act_sub_char1.setListListener(p);
		p.columnRslt_act_sub_char2.addAllListener(p);
		p.columnRslt_act_sub_char2.setListListener(p);
		p.columnRslt_act_sub_char3.addAllListener(p);
		p.columnRslt_act_sub_char3.setListListener(p);
		p.columnRslt_sync_flg.addAllListener(p);
		p.columnRslt_sret_fr_cd.addAllListener(p);
		p.columnRslt_sret_fr_cd.setListListener(p);
		p.columnRslt_sret_fr_nm.addAllListener(p);
		p.columnRslt_sret_fr_nm.setListListener(p);
		p.columnRslt_sret_fr_sundry_flg.addAllListener(p);
		p.columnRslt_pri_prnt_flg.addAllListener(p);
		p.columnRslt_dest_cd1.addAllListener(p);
		p.columnRslt_dest_cd1.setListListener(p);
		p.columnRslt_dest_nm1.addAllListener(p);
		p.columnRslt_dest_nm1.setListListener(p);
		p.columnRslt_dest_cd2.addAllListener(p);
		p.columnRslt_dest_cd2.setListListener(p);
		p.columnRslt_dest_nm2.addAllListener(p);
		p.columnRslt_dest_nm2.setListListener(p);
		p.columnRslt_dest_cd3.addAllListener(p);
		p.columnRslt_dest_cd3.setListListener(p);
		p.columnRslt_dest_nm3.addAllListener(p);
		p.columnRslt_dest_nm3.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnRslt_asset_mng_typ_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_cntry_org_cd.addAllListener(p);
		p.columnRslt_cntry_org_cd.setListListener(p);
		p.columnRslt_cntry_org_nm.addAllListener(p);
		p.columnRslt_cntry_org_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_qty_dec_place.addAllListener(p);
		p.columnRslt_trd_qty_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_qty_dec_place.addAllListener(p);
		p.columnRslt_base_qty_dec_place.setListListener(p);
		p.columnRslt_arr_cmpl_flg.addAllListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.setListListener(p);
		p.columnRslt_dscnt_rsn_nm.addAllListener(p);
		p.columnRslt_dscnt_rsn_nm.setListListener(p);
		p.columnRslt_tax_fix_flg.addAllListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_cnsgn_gd_cd.addAllListener(p);
		p.columnRslt_cnsgn_gd_cd.setListListener(p);
		p.columnRslt_cnsgn_gd_nm.addAllListener(p);
		p.columnRslt_cnsgn_gd_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_loc_wg_cd.addAllListener(p);
		p.columnRslt_loc_wg_cd.setListListener(p);
		p.columnRslt_loc_wg_nm.addAllListener(p);
		p.columnRslt_loc_wg_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_vmi_flg.addAllListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_ret_rsn_cd.addAllListener(p);
		p.columnRslt_ret_rsn_cd.setListListener(p);
		p.columnRslt_ret_rsn_nm.addAllListener(p);
		p.columnRslt_ret_rsn_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_wtax_amt.addAllListener(p);
		p.columnRslt_wtax_amt.setListListener(p);
		p.columnRslt_bill_crryovr_times.addAllListener(p);
		p.columnRslt_bill_crryovr_times.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_schd_d_intr_rmrks.addAllListener(p);
		p.columnRslt_schd_d_intr_rmrks.setListListener(p);
		p.columnRslt_act_d_intr_rmrks.addAllListener(p);
		p.columnRslt_act_d_intr_rmrks.setListListener(p);
		p.columnRslt_arr_cnt_rmrks.addAllListener(p);
		p.columnRslt_arr_cnt_rmrks.setListListener(p);
		p.columnRslt_schd_d_sub_char1.addAllListener(p);
		p.columnRslt_schd_d_sub_char1.setListListener(p);
		p.columnRslt_schd_d_sub_char2.addAllListener(p);
		p.columnRslt_schd_d_sub_char2.setListListener(p);
		p.columnRslt_schd_d_sub_char3.addAllListener(p);
		p.columnRslt_schd_d_sub_char3.setListListener(p);
		p.columnRslt_act_d_sub_char1.addAllListener(p);
		p.columnRslt_act_d_sub_char1.setListListener(p);
		p.columnRslt_act_d_sub_char2.addAllListener(p);
		p.columnRslt_act_d_sub_char2.setListListener(p);
		p.columnRslt_act_d_sub_char3.addAllListener(p);
		p.columnRslt_act_d_sub_char3.setListListener(p);
		p.columnRslt_act_io_sub_char1.addAllListener(p);
		p.columnRslt_act_io_sub_char1.setListListener(p);
		p.columnRslt_act_io_sub_char2.addAllListener(p);
		p.columnRslt_act_io_sub_char2.setListListener(p);
		p.columnRslt_act_io_sub_char3.addAllListener(p);
		p.columnRslt_act_io_sub_char3.setListListener(p);
		p.columnRslt_ref_sls_act_no.addAllListener(p);
		p.columnRslt_ref_sls_act_no.setListListener(p);
		p.columnRslt_ref_sls_act_d_no.addAllListener(p);
		p.columnRslt_ref_sls_act_d_no.setListListener(p);
		p.columnRslt_base_sls_ac_dt.addAllListener(p);
		p.columnRslt_base_sls_ac_dt.setListListener(p);
		p.columnRslt_purc_ret_act_no.addAllListener(p);
		p.columnRslt_purc_ret_act_no.setListListener(p);
		p.columnRslt_purc_ret_act_d_no.addAllListener(p);
		p.columnRslt_purc_ret_act_d_no.setListListener(p);
		p.columnRslt_base_purc_ac_dt.addAllListener(p);
		p.columnRslt_base_purc_ac_dt.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
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
	protected static void mcInitBtn(MSBBP_SretSrch p) {
		p.Btn_open_MSBBP1330.addAllListener(p);
		p.Btn_open_MSBBP1330.setAPMethodName("doBtn_open_MSBBP1330");
		p.Btn_open_MSBBP1340.addAllListener(p);
		p.Btn_open_MSBBP1340.setAPMethodName("doBtn_open_MSBBP1340");
	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_arr_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_arr_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.INVISIBLE);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_vmi_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_amt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Top(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_vmi_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_ret_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ret_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.INVISIBLE);
		p.columnRslt_pri_prnt_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_vmi_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_amt.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_sls_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH__ACT__HDR_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_arr_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_SCHD_LST, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_SCHD_LST, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_arr_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_not_sync_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_vmi_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_not_vmi_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_ym_fr.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_ym_to.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_usr_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_ret_rsn_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ret_rsn_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_rev.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_basis_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sync_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.INVISIBLE);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_vmi_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_amt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_act_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_abort_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_LST]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_LST, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_act_io_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_LST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_ACT_LST, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_not_vmi_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_ret_rsn_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ret_rsn_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_act_io_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_vmi_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wtax_amt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_ACT_DTL, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ScreenOpe(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_SrchMode(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Sts(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Top(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Fold(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab1(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Iv(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Sync]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Sync(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Vmi]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Vmi(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab2(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab3(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab4(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Cnd(MSBBP_SretSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_non_arr_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_non_ac_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_arr_non_ac_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_mode_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_sync_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_sync_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_vmi_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_vmi_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_cd3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dest_nm3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_ret_schd_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_ret_schd_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sls_act_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sls_act_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_ret_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ret_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_po_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_abort_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[CstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_CstCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_DlvCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ItmCnd(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Ctrl(MSBBP_SretSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_RPnl(MSBBP_SretSrch p){
		p.RPnl_dwnld.putMode(p, REF_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Rslt(MSBBP_SretSrch p){
		p.columnRslt_abort_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_ret_schd_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_ret_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_rev.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_act_io_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sls_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_bill_basis_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_iv_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sync_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_fr_sundry_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_addr_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.INVISIBLE);
		p.columnRslt_pri_prnt_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_cd3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dest_nm3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_cst_itm_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_itm_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_arr_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_sls_ret_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_arr_cmpl_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_cost_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_tax_fix_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cnsgn_gd_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnRslt_vmi_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cst_po_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_wtax_amt.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bill_crryovr_times.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_arr_cnt_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_sls_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_sls_ac_dt.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_dlv_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
		p.Rslt_cst_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
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
	protected static void statusInitREF__ACT__HDR_Btn(MSBBP_SretSrch p){
		p.Btn_open_MSBBP1330.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBBP1340.putMode(p, REF_ACT_HDR, MCMode.DISABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SCHD_DTL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SretSrch_MC.setTableConfigRslt((MSBBP_SretSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBBP_SretSrch p) {
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.columnRslt_sret_schd_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sret_schd_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_schd_sts_typ);
		p.columnRslt_sret_schd_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sret_schd_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_schd_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_sls_ret_schd_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_ret_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_ret_schd_no);
		p.columnRslt_sls_ret_schd_d_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_ret_schd_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_ret_schd_d_no);
		p.columnRslt_sls_ret_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_ret_schd_dt_META);
		p.columnRslt_sls_ret_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_ret_schd_dt);
		p.columnRslt_arr_act_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.arr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_act_no);
		p.columnRslt_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_no);
		p.columnRslt_sls_act_rev.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_rev);
		p.columnRslt_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_d_no);
		p.columnRslt_sls_act_io_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_act_io_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_io_no);
		p.columnRslt_sls_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_dt_META);
		p.columnRslt_sls_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dt);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_bill_basis_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.bill_basis_dt_META);
		p.columnRslt_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_basis_dt);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_acst_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.acst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_nm);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.columnRslt_trd_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_upri_dec_place);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_amt_dec_place);
		p.columnRslt_base_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_upri_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_amt_dec_place);
		p.columnRslt_ptax_upri_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_upri_dec_place);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_ref_iv_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ref_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_iv_no);
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_schd_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_intr_rmrks);
		p.columnRslt_act_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_rmrks);
		p.columnRslt_schd_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char1);
		p.columnRslt_schd_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char2);
		p.columnRslt_schd_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char3);
		p.columnRslt_act_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char1);
		p.columnRslt_act_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char2);
		p.columnRslt_act_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char3);
		p.columnRslt_sync_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sync_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sync_flg);
		p.columnRslt_sret_fr_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sret_fr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_fr_cd);
		p.columnRslt_sret_fr_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sret_fr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_fr_nm);
		p.columnRslt_sret_fr_sundry_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sret_fr_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_fr_sundry_flg);
		p.RsltTable.addTable(p.Rslt_addr_p_PPanel.AddrTable);
		p.columnRslt_pri_prnt_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.pri_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pri_prnt_flg);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dest_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.asset_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_cntry_org_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cntry_org_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_cd);
		p.columnRslt_cntry_org_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cntry_org_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_qty_dec_place);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_qty_dec_place.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_qty_dec_place);
		p.RsltTable.addTable(p.Rslt_arr_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_sls_ret_qty_p_PPanel.QtyTable);
		p.columnRslt_arr_cmpl_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.arr_cmpl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_cmpl_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_cost_upri_p_PPanel.UpriTable);
		p.columnRslt_tax_fix_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.tax_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_fix_flg);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_cnsgn_gd_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cnsgn_gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cnsgn_gd_cd);
		p.columnRslt_cnsgn_gd_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cnsgn_gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cnsgn_gd_nm);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_loc_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_cd);
		p.columnRslt_loc_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.loc_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_vmi_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.vmi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vmi_flg);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_ret_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ret_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_rsn_cd);
		p.columnRslt_ret_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ret_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_rsn_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.columnRslt_wtax_amt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.wtax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_amt);
		p.columnRslt_bill_crryovr_times.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.bill_crryovr_times_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_crryovr_times);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_schd_d_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_d_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_intr_rmrks);
		p.columnRslt_act_d_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_d_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_intr_rmrks);
		p.columnRslt_arr_cnt_rmrks.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.arr_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_cnt_rmrks);
		p.columnRslt_schd_d_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char1);
		p.columnRslt_schd_d_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char2);
		p.columnRslt_schd_d_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.schd_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char3);
		p.columnRslt_act_d_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char1);
		p.columnRslt_act_d_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char2);
		p.columnRslt_act_d_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char3);
		p.columnRslt_act_io_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_io_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char1);
		p.columnRslt_act_io_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_io_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char2);
		p.columnRslt_act_io_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.act_io_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char3);
		p.columnRslt_ref_sls_act_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ref_sls_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_sls_act_no);
		p.columnRslt_ref_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ref_sls_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_sls_act_d_no);
		p.columnRslt_base_sls_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_sls_ac_dt_META);
		p.columnRslt_base_sls_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_sls_ac_dt);
		p.columnRslt_purc_ret_act_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.purc_ret_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_no);
		p.columnRslt_purc_ret_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.purc_ret_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_d_no);
		p.columnRslt_base_purc_ac_dt.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.base_purc_ac_dt_META);
		p.columnRslt_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_purc_ac_dt);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_cst_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1350.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_wg_cd.getListConfig().setPutter(getCnd_loc_wg_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_ret_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ret_rsn_cd.getListConfig().setPutter(getCnd_ret_rsn_cd_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_SCHD_LST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHD_LSTStatus() {
		status = SRCH_SCHD_LST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SCHD_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHD_DTLStatus() {
		status = SRCH_SCHD_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SCHD_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SCHD_HDRStatus() {
		status = SRCH_SCHD_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_LST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_LSTStatus() {
		status = SRCH_ACT_LST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_ACT_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ACT_DTLStatus() {
		status = SRCH_ACT_DTL;
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
	 * この画面を[REF_SCHD_LST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHD_LSTStatus() {
		status = REF_SCHD_LST;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHD_DTLStatus() {
		status = REF_SCHD_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHD_HDRStatus() {
		status = REF_SCHD_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_LST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_LSTStatus() {
		status = REF_ACT_LST;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACT_DTLStatus() {
		status = REF_ACT_DTL;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SCHD_LST.equals(status)) {
			setSRCH_SCHD_LSTStatus();
		}
		else if (SRCH_SCHD_DTL.equals(status)) {
			setSRCH_SCHD_DTLStatus();
		}
		else if (SRCH_SCHD_HDR.equals(status)) {
			setSRCH_SCHD_HDRStatus();
		}
		else if (SRCH_ACT_LST.equals(status)) {
			setSRCH_ACT_LSTStatus();
		}
		else if (SRCH_ACT_DTL.equals(status)) {
			setSRCH_ACT_DTLStatus();
		}
		else if (SRCH_ACT_HDR.equals(status)) {
			setSRCH_ACT_HDRStatus();
		}
		else if (REF_SCHD_LST.equals(status)) {
			setREF_SCHD_LSTStatus();
		}
		else if (REF_SCHD_DTL.equals(status)) {
			setREF_SCHD_DTLStatus();
		}
		else if (REF_SCHD_HDR.equals(status)) {
			setREF_SCHD_HDRStatus();
		}
		else if (REF_ACT_LST.equals(status)) {
			setREF_ACT_LSTStatus();
		}
		else if (REF_ACT_DTL.equals(status)) {
			setREF_ACT_DTLStatus();
		}
		else if (REF_ACT_HDR.equals(status)) {
			setREF_ACT_HDRStatus();
		}
	}

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
		lp.setListLogicId("MA.MAUAP0010.LgWg");
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
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
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
	 * [Cnd_ret_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ret_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsRtnBizRsn");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_wg_cd) return getCnd_loc_wg_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_ret_rsn_cd) return getCnd_ret_rsn_cd(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1330) doBtn_open_MSBBP1330(info);
		else if (ap == Btn_open_MSBBP1340) doBtn_open_MSBBP1340(info);
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
	 * [Btn]パネルの[open_MSBBP1330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1330(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1340]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1340(MCEventInfo info);

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
		if (vc == Cnd_non_arr_flg) return doCnd_non_arr_flg_VC(info);
		if (vc == Cnd_part_arr_non_ac_flg) return doCnd_part_arr_non_ac_flg_VC(info);
		if (vc == Cnd_part_arr_flg) return doCnd_part_arr_flg_VC(info);
		if (vc == Cnd_cmpl_arr_non_ac_flg) return doCnd_cmpl_arr_non_ac_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_mode_Group) return doCnd_mode_VC(info);
		if (vc == Cnd_iv_trgt_flg) return doCnd_iv_trgt_flg_VC(info);
		if (vc == Cnd_iv_not_trgt_flg) return doCnd_iv_not_trgt_flg_VC(info);
		if (vc == Cnd_sync_flg) return doCnd_sync_flg_VC(info);
		if (vc == Cnd_not_sync_flg) return doCnd_not_sync_flg_VC(info);
		if (vc == Cnd_vmi_flg) return doCnd_vmi_flg_VC(info);
		if (vc == Cnd_not_vmi_flg) return doCnd_not_vmi_flg_VC(info);
		if (vc == Cnd_sls_ret_schd_dt_fr) return doCnd_sls_ret_schd_dt_fr_VC(info);
		if (vc == Cnd_sls_ret_schd_dt_to) return doCnd_sls_ret_schd_dt_to_VC(info);
		if (vc == Cnd_sls_ret_dt_fr) return doCnd_sls_ret_dt_fr_VC(info);
		if (vc == Cnd_sls_ret_dt_to) return doCnd_sls_ret_dt_to_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_dest_cd1) return doCnd_dest_cd1_VC(info);
		if (vc == Cnd_dest_nm1) return doCnd_dest_nm1_VC(info);
		if (vc == Cnd_dest_cd2) return doCnd_dest_cd2_VC(info);
		if (vc == Cnd_dest_nm2) return doCnd_dest_nm2_VC(info);
		if (vc == Cnd_dest_cd3) return doCnd_dest_cd3_VC(info);
		if (vc == Cnd_dest_nm3) return doCnd_dest_nm3_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_wg_cd) return doCnd_loc_wg_cd_VC(info);
		if (vc == Cnd_loc_wg_nm) return doCnd_loc_wg_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_sls_ret_schd_no) return doCnd_sls_ret_schd_no_VC(info);
		if (vc == Cnd_sls_ret_schd_d_no) return doCnd_sls_ret_schd_d_no_VC(info);
		if (vc == Cnd_arr_act_no) return doCnd_arr_act_no_VC(info);
		if (vc == Cnd_sls_act_no) return doCnd_sls_act_no_VC(info);
		if (vc == Cnd_sls_act_d_no) return doCnd_sls_act_d_no_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_inc_ret_dscnt_flg) return doCnd_inc_ret_dscnt_flg_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_ret_rsn_cd) return doCnd_ret_rsn_cd_VC(info);
		if (vc == Cnd_ret_rsn_nm) return doCnd_ret_rsn_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_schd_intr_rmrks) return doCnd_schd_intr_rmrks_VC(info);
		if (vc == Cnd_act_intr_rmrks) return doCnd_act_intr_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_schd_d_intr_rmrks) return doCnd_schd_d_intr_rmrks_VC(info);
		if (vc == Cnd_act_d_intr_rmrks) return doCnd_act_d_intr_rmrks_VC(info);
		if (vc == Cnd_arr_cnt_rmrks) return doCnd_arr_cnt_rmrks_VC(info);
		if (vc == Cnd_schd_sub_char1) return doCnd_schd_sub_char1_VC(info);
		if (vc == Cnd_schd_sub_char2) return doCnd_schd_sub_char2_VC(info);
		if (vc == Cnd_schd_sub_char3) return doCnd_schd_sub_char3_VC(info);
		if (vc == Cnd_schd_d_sub_char1) return doCnd_schd_d_sub_char1_VC(info);
		if (vc == Cnd_schd_d_sub_char2) return doCnd_schd_d_sub_char2_VC(info);
		if (vc == Cnd_schd_d_sub_char3) return doCnd_schd_d_sub_char3_VC(info);
		if (vc == Cnd_act_sub_char1) return doCnd_act_sub_char1_VC(info);
		if (vc == Cnd_act_sub_char2) return doCnd_act_sub_char2_VC(info);
		if (vc == Cnd_act_sub_char3) return doCnd_act_sub_char3_VC(info);
		if (vc == Cnd_act_d_sub_char1) return doCnd_act_d_sub_char1_VC(info);
		if (vc == Cnd_act_d_sub_char2) return doCnd_act_d_sub_char2_VC(info);
		if (vc == Cnd_act_d_sub_char3) return doCnd_act_d_sub_char3_VC(info);
		if (vc == Cnd_act_io_sub_char1) return doCnd_act_io_sub_char1_VC(info);
		if (vc == Cnd_act_io_sub_char2) return doCnd_act_io_sub_char2_VC(info);
		if (vc == Cnd_act_io_sub_char3) return doCnd_act_io_sub_char3_VC(info);
		if (vc == Cnd_inc_abort_flg) return doCnd_inc_abort_flg_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_sret_schd_sts_typ) return doRslt_sret_schd_sts_typ_VC(info);
		if (vc == columnRslt_sret_schd_sts_typ_nm) return doRslt_sret_schd_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_sls_ret_schd_no) return doRslt_sls_ret_schd_no_VC(info);
		if (vc == columnRslt_sls_ret_schd_d_no) return doRslt_sls_ret_schd_d_no_VC(info);
		if (vc == columnRslt_sls_ret_schd_dt) return doRslt_sls_ret_schd_dt_VC(info);
		if (vc == columnRslt_arr_act_no) return doRslt_arr_act_no_VC(info);
		if (vc == columnRslt_sls_act_no) return doRslt_sls_act_no_VC(info);
		if (vc == columnRslt_sls_act_rev) return doRslt_sls_act_rev_VC(info);
		if (vc == columnRslt_sls_act_d_no) return doRslt_sls_act_d_no_VC(info);
		if (vc == columnRslt_sls_act_io_no) return doRslt_sls_act_io_no_VC(info);
		if (vc == columnRslt_sls_dt) return doRslt_sls_dt_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_bill_basis_dt) return doRslt_bill_basis_dt_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_acst_nm) return doRslt_acst_nm_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_upri_dec_place) return doRslt_trd_upri_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_amt_dec_place) return doRslt_base_amt_dec_place_VC(info);
		if (vc == columnRslt_base_upri_dec_place) return doRslt_base_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_amt_dec_place) return doRslt_ptax_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_upri_dec_place) return doRslt_ptax_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_ref_iv_no) return doRslt_ref_iv_no_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_schd_intr_rmrks) return doRslt_schd_intr_rmrks_VC(info);
		if (vc == columnRslt_act_intr_rmrks) return doRslt_act_intr_rmrks_VC(info);
		if (vc == columnRslt_schd_sub_char1) return doRslt_schd_sub_char1_VC(info);
		if (vc == columnRslt_schd_sub_char2) return doRslt_schd_sub_char2_VC(info);
		if (vc == columnRslt_schd_sub_char3) return doRslt_schd_sub_char3_VC(info);
		if (vc == columnRslt_act_sub_char1) return doRslt_act_sub_char1_VC(info);
		if (vc == columnRslt_act_sub_char2) return doRslt_act_sub_char2_VC(info);
		if (vc == columnRslt_act_sub_char3) return doRslt_act_sub_char3_VC(info);
		if (vc == columnRslt_sync_flg) return doRslt_sync_flg_VC(info);
		if (vc == columnRslt_sret_fr_cd) return doRslt_sret_fr_cd_VC(info);
		if (vc == columnRslt_sret_fr_nm) return doRslt_sret_fr_nm_VC(info);
		if (vc == columnRslt_sret_fr_sundry_flg) return doRslt_sret_fr_sundry_flg_VC(info);
		if (vc == columnRslt_pri_prnt_flg) return doRslt_pri_prnt_flg_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_nm1) return doRslt_dest_nm1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_nm2) return doRslt_dest_nm2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_dest_nm3) return doRslt_dest_nm3_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ_nm) return doRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_cntry_org_cd) return doRslt_cntry_org_cd_VC(info);
		if (vc == columnRslt_cntry_org_nm) return doRslt_cntry_org_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_qty_dec_place) return doRslt_trd_qty_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_qty_dec_place) return doRslt_base_qty_dec_place_VC(info);
		if (vc == columnRslt_arr_cmpl_flg) return doRslt_arr_cmpl_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_tax_fix_flg) return doRslt_tax_fix_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_cnsgn_gd_cd) return doRslt_cnsgn_gd_cd_VC(info);
		if (vc == columnRslt_cnsgn_gd_nm) return doRslt_cnsgn_gd_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_loc_wg_cd) return doRslt_loc_wg_cd_VC(info);
		if (vc == columnRslt_loc_wg_nm) return doRslt_loc_wg_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_vmi_flg) return doRslt_vmi_flg_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_ret_rsn_cd) return doRslt_ret_rsn_cd_VC(info);
		if (vc == columnRslt_ret_rsn_nm) return doRslt_ret_rsn_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_wtax_amt) return doRslt_wtax_amt_VC(info);
		if (vc == columnRslt_bill_crryovr_times) return doRslt_bill_crryovr_times_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_schd_d_intr_rmrks) return doRslt_schd_d_intr_rmrks_VC(info);
		if (vc == columnRslt_act_d_intr_rmrks) return doRslt_act_d_intr_rmrks_VC(info);
		if (vc == columnRslt_arr_cnt_rmrks) return doRslt_arr_cnt_rmrks_VC(info);
		if (vc == columnRslt_schd_d_sub_char1) return doRslt_schd_d_sub_char1_VC(info);
		if (vc == columnRslt_schd_d_sub_char2) return doRslt_schd_d_sub_char2_VC(info);
		if (vc == columnRslt_schd_d_sub_char3) return doRslt_schd_d_sub_char3_VC(info);
		if (vc == columnRslt_act_d_sub_char1) return doRslt_act_d_sub_char1_VC(info);
		if (vc == columnRslt_act_d_sub_char2) return doRslt_act_d_sub_char2_VC(info);
		if (vc == columnRslt_act_d_sub_char3) return doRslt_act_d_sub_char3_VC(info);
		if (vc == columnRslt_act_io_sub_char1) return doRslt_act_io_sub_char1_VC(info);
		if (vc == columnRslt_act_io_sub_char2) return doRslt_act_io_sub_char2_VC(info);
		if (vc == columnRslt_act_io_sub_char3) return doRslt_act_io_sub_char3_VC(info);
		if (vc == columnRslt_ref_sls_act_no) return doRslt_ref_sls_act_no_VC(info);
		if (vc == columnRslt_ref_sls_act_d_no) return doRslt_ref_sls_act_d_no_VC(info);
		if (vc == columnRslt_base_sls_ac_dt) return doRslt_base_sls_ac_dt_VC(info);
		if (vc == columnRslt_purc_ret_act_no) return doRslt_purc_ret_act_no_VC(info);
		if (vc == columnRslt_purc_ret_act_d_no) return doRslt_purc_ret_act_d_no_VC(info);
		if (vc == columnRslt_base_purc_ac_dt) return doRslt_base_purc_ac_dt_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
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
	 * [Cnd]パネルの[non_arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_non_arr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_arr_non_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_arr_non_ac_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_arr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_arr_non_ac_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_arr_non_ac_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_trgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_not_trgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_ret_dscnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_itm_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_rsn_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_po_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arr_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arr_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_d_sub_char3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_io_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_can_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sret_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sret_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sret_schd_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_ret_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_upri_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sret_fr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sret_fr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sret_fr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sret_fr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sret_fr_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sret_fr_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_qty_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_qty_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cnsgn_gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cnsgn_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cnsgn_gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cnsgn_gd_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_d_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_d_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_d_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_io_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_sls_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_sls_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_purc_ac_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_non_arr_flg) doCnd_non_arr_flg_NC(info);
		else if (nc == Cnd_part_arr_non_ac_flg) doCnd_part_arr_non_ac_flg_NC(info);
		else if (nc == Cnd_part_arr_flg) doCnd_part_arr_flg_NC(info);
		else if (nc == Cnd_cmpl_arr_non_ac_flg) doCnd_cmpl_arr_non_ac_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NC(info);
		else if (nc == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NC(info);
		else if (nc == Cnd_sync_flg) doCnd_sync_flg_NC(info);
		else if (nc == Cnd_not_sync_flg) doCnd_not_sync_flg_NC(info);
		else if (nc == Cnd_vmi_flg) doCnd_vmi_flg_NC(info);
		else if (nc == Cnd_not_vmi_flg) doCnd_not_vmi_flg_NC(info);
		else if (nc == Cnd_sls_ret_schd_dt_fr) doCnd_sls_ret_schd_dt_fr_NC(info);
		else if (nc == Cnd_sls_ret_schd_dt_to) doCnd_sls_ret_schd_dt_to_NC(info);
		else if (nc == Cnd_sls_ret_dt_fr) doCnd_sls_ret_dt_fr_NC(info);
		else if (nc == Cnd_sls_ret_dt_to) doCnd_sls_ret_dt_to_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_dest_cd1) doCnd_dest_cd1_NC(info);
		else if (nc == Cnd_dest_nm1) doCnd_dest_nm1_NC(info);
		else if (nc == Cnd_dest_cd2) doCnd_dest_cd2_NC(info);
		else if (nc == Cnd_dest_nm2) doCnd_dest_nm2_NC(info);
		else if (nc == Cnd_dest_cd3) doCnd_dest_cd3_NC(info);
		else if (nc == Cnd_dest_nm3) doCnd_dest_nm3_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NC(info);
		else if (nc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NC(info);
		else if (nc == Cnd_sls_ret_schd_d_no) doCnd_sls_ret_schd_d_no_NC(info);
		else if (nc == Cnd_arr_act_no) doCnd_arr_act_no_NC(info);
		else if (nc == Cnd_sls_act_no) doCnd_sls_act_no_NC(info);
		else if (nc == Cnd_sls_act_d_no) doCnd_sls_act_d_no_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_ret_rsn_cd) doCnd_ret_rsn_cd_NC(info);
		else if (nc == Cnd_ret_rsn_nm) doCnd_ret_rsn_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NC(info);
		else if (nc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_schd_d_intr_rmrks) doCnd_schd_d_intr_rmrks_NC(info);
		else if (nc == Cnd_act_d_intr_rmrks) doCnd_act_d_intr_rmrks_NC(info);
		else if (nc == Cnd_arr_cnt_rmrks) doCnd_arr_cnt_rmrks_NC(info);
		else if (nc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NC(info);
		else if (nc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NC(info);
		else if (nc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NC(info);
		else if (nc == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NC(info);
		else if (nc == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NC(info);
		else if (nc == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NC(info);
		else if (nc == Cnd_act_sub_char1) doCnd_act_sub_char1_NC(info);
		else if (nc == Cnd_act_sub_char2) doCnd_act_sub_char2_NC(info);
		else if (nc == Cnd_act_sub_char3) doCnd_act_sub_char3_NC(info);
		else if (nc == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NC(info);
		else if (nc == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NC(info);
		else if (nc == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NC(info);
		else if (nc == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NC(info);
		else if (nc == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NC(info);
		else if (nc == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NC(info);
		else if (nc == Cnd_inc_abort_flg) doCnd_inc_abort_flg_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NC(info);
		else if (nc == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_sls_ret_schd_no) doRslt_sls_ret_schd_no_NC(info);
		else if (nc == columnRslt_sls_ret_schd_d_no) doRslt_sls_ret_schd_d_no_NC(info);
		else if (nc == columnRslt_sls_ret_schd_dt) doRslt_sls_ret_schd_dt_NC(info);
		else if (nc == columnRslt_arr_act_no) doRslt_arr_act_no_NC(info);
		else if (nc == columnRslt_sls_act_no) doRslt_sls_act_no_NC(info);
		else if (nc == columnRslt_sls_act_rev) doRslt_sls_act_rev_NC(info);
		else if (nc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NC(info);
		else if (nc == columnRslt_sls_act_io_no) doRslt_sls_act_io_no_NC(info);
		else if (nc == columnRslt_sls_dt) doRslt_sls_dt_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_acst_nm) doRslt_acst_nm_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_ref_iv_no) doRslt_ref_iv_no_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NC(info);
		else if (nc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NC(info);
		else if (nc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NC(info);
		else if (nc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NC(info);
		else if (nc == columnRslt_act_sub_char1) doRslt_act_sub_char1_NC(info);
		else if (nc == columnRslt_act_sub_char2) doRslt_act_sub_char2_NC(info);
		else if (nc == columnRslt_act_sub_char3) doRslt_act_sub_char3_NC(info);
		else if (nc == columnRslt_sync_flg) doRslt_sync_flg_NC(info);
		else if (nc == columnRslt_sret_fr_cd) doRslt_sret_fr_cd_NC(info);
		else if (nc == columnRslt_sret_fr_nm) doRslt_sret_fr_nm_NC(info);
		else if (nc == columnRslt_sret_fr_sundry_flg) doRslt_sret_fr_sundry_flg_NC(info);
		else if (nc == columnRslt_pri_prnt_flg) doRslt_pri_prnt_flg_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_nm1) doRslt_dest_nm1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_nm2) doRslt_dest_nm2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_dest_nm3) doRslt_dest_nm3_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NC(info);
		else if (nc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NC(info);
		else if (nc == columnRslt_arr_cmpl_flg) doRslt_arr_cmpl_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_cnsgn_gd_cd) doRslt_cnsgn_gd_cd_NC(info);
		else if (nc == columnRslt_cnsgn_gd_nm) doRslt_cnsgn_gd_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NC(info);
		else if (nc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_vmi_flg) doRslt_vmi_flg_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NC(info);
		else if (nc == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_wtax_amt) doRslt_wtax_amt_NC(info);
		else if (nc == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_schd_d_intr_rmrks) doRslt_schd_d_intr_rmrks_NC(info);
		else if (nc == columnRslt_act_d_intr_rmrks) doRslt_act_d_intr_rmrks_NC(info);
		else if (nc == columnRslt_arr_cnt_rmrks) doRslt_arr_cnt_rmrks_NC(info);
		else if (nc == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NC(info);
		else if (nc == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NC(info);
		else if (nc == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NC(info);
		else if (nc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NC(info);
		else if (nc == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NC(info);
		else if (nc == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NC(info);
		else if (nc == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NC(info);
		else if (nc == columnRslt_ref_sls_act_no) doRslt_ref_sls_act_no_NC(info);
		else if (nc == columnRslt_ref_sls_act_d_no) doRslt_ref_sls_act_d_no_NC(info);
		else if (nc == columnRslt_base_sls_ac_dt) doRslt_base_sls_ac_dt_NC(info);
		else if (nc == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NC(info);
		else if (nc == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NC(info);
		else if (nc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
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
	 * [Cnd]パネルの[non_arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_non_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_non_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_arr_non_ac_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_arr_non_ac_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char3_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cnsgn_gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cnsgn_gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_sls_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_sls_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_non_arr_flg) doCnd_non_arr_flg_NE(info);
		else if (ne == Cnd_part_arr_non_ac_flg) doCnd_part_arr_non_ac_flg_NE(info);
		else if (ne == Cnd_part_arr_flg) doCnd_part_arr_flg_NE(info);
		else if (ne == Cnd_cmpl_arr_non_ac_flg) doCnd_cmpl_arr_non_ac_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NE(info);
		else if (ne == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NE(info);
		else if (ne == Cnd_sync_flg) doCnd_sync_flg_NE(info);
		else if (ne == Cnd_not_sync_flg) doCnd_not_sync_flg_NE(info);
		else if (ne == Cnd_vmi_flg) doCnd_vmi_flg_NE(info);
		else if (ne == Cnd_not_vmi_flg) doCnd_not_vmi_flg_NE(info);
		else if (ne == Cnd_sls_ret_schd_dt_fr) doCnd_sls_ret_schd_dt_fr_NE(info);
		else if (ne == Cnd_sls_ret_schd_dt_to) doCnd_sls_ret_schd_dt_to_NE(info);
		else if (ne == Cnd_sls_ret_dt_fr) doCnd_sls_ret_dt_fr_NE(info);
		else if (ne == Cnd_sls_ret_dt_to) doCnd_sls_ret_dt_to_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_dest_cd1) doCnd_dest_cd1_NE(info);
		else if (ne == Cnd_dest_nm1) doCnd_dest_nm1_NE(info);
		else if (ne == Cnd_dest_cd2) doCnd_dest_cd2_NE(info);
		else if (ne == Cnd_dest_nm2) doCnd_dest_nm2_NE(info);
		else if (ne == Cnd_dest_cd3) doCnd_dest_cd3_NE(info);
		else if (ne == Cnd_dest_nm3) doCnd_dest_nm3_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NE(info);
		else if (ne == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NE(info);
		else if (ne == Cnd_sls_ret_schd_d_no) doCnd_sls_ret_schd_d_no_NE(info);
		else if (ne == Cnd_arr_act_no) doCnd_arr_act_no_NE(info);
		else if (ne == Cnd_sls_act_no) doCnd_sls_act_no_NE(info);
		else if (ne == Cnd_sls_act_d_no) doCnd_sls_act_d_no_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_ret_rsn_cd) doCnd_ret_rsn_cd_NE(info);
		else if (ne == Cnd_ret_rsn_nm) doCnd_ret_rsn_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NE(info);
		else if (ne == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_schd_d_intr_rmrks) doCnd_schd_d_intr_rmrks_NE(info);
		else if (ne == Cnd_act_d_intr_rmrks) doCnd_act_d_intr_rmrks_NE(info);
		else if (ne == Cnd_arr_cnt_rmrks) doCnd_arr_cnt_rmrks_NE(info);
		else if (ne == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NE(info);
		else if (ne == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NE(info);
		else if (ne == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NE(info);
		else if (ne == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NE(info);
		else if (ne == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NE(info);
		else if (ne == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NE(info);
		else if (ne == Cnd_act_sub_char1) doCnd_act_sub_char1_NE(info);
		else if (ne == Cnd_act_sub_char2) doCnd_act_sub_char2_NE(info);
		else if (ne == Cnd_act_sub_char3) doCnd_act_sub_char3_NE(info);
		else if (ne == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NE(info);
		else if (ne == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NE(info);
		else if (ne == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NE(info);
		else if (ne == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NE(info);
		else if (ne == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NE(info);
		else if (ne == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NE(info);
		else if (ne == Cnd_inc_abort_flg) doCnd_inc_abort_flg_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NE(info);
		else if (ne == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_sls_ret_schd_no) doRslt_sls_ret_schd_no_NE(info);
		else if (ne == columnRslt_sls_ret_schd_d_no) doRslt_sls_ret_schd_d_no_NE(info);
		else if (ne == columnRslt_sls_ret_schd_dt) doRslt_sls_ret_schd_dt_NE(info);
		else if (ne == columnRslt_arr_act_no) doRslt_arr_act_no_NE(info);
		else if (ne == columnRslt_sls_act_no) doRslt_sls_act_no_NE(info);
		else if (ne == columnRslt_sls_act_rev) doRslt_sls_act_rev_NE(info);
		else if (ne == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NE(info);
		else if (ne == columnRslt_sls_act_io_no) doRslt_sls_act_io_no_NE(info);
		else if (ne == columnRslt_sls_dt) doRslt_sls_dt_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_acst_nm) doRslt_acst_nm_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_ref_iv_no) doRslt_ref_iv_no_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NE(info);
		else if (ne == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NE(info);
		else if (ne == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NE(info);
		else if (ne == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NE(info);
		else if (ne == columnRslt_act_sub_char1) doRslt_act_sub_char1_NE(info);
		else if (ne == columnRslt_act_sub_char2) doRslt_act_sub_char2_NE(info);
		else if (ne == columnRslt_act_sub_char3) doRslt_act_sub_char3_NE(info);
		else if (ne == columnRslt_sync_flg) doRslt_sync_flg_NE(info);
		else if (ne == columnRslt_sret_fr_cd) doRslt_sret_fr_cd_NE(info);
		else if (ne == columnRslt_sret_fr_nm) doRslt_sret_fr_nm_NE(info);
		else if (ne == columnRslt_sret_fr_sundry_flg) doRslt_sret_fr_sundry_flg_NE(info);
		else if (ne == columnRslt_pri_prnt_flg) doRslt_pri_prnt_flg_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_nm1) doRslt_dest_nm1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_nm2) doRslt_dest_nm2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_dest_nm3) doRslt_dest_nm3_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NE(info);
		else if (ne == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NE(info);
		else if (ne == columnRslt_arr_cmpl_flg) doRslt_arr_cmpl_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_cnsgn_gd_cd) doRslt_cnsgn_gd_cd_NE(info);
		else if (ne == columnRslt_cnsgn_gd_nm) doRslt_cnsgn_gd_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NE(info);
		else if (ne == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_vmi_flg) doRslt_vmi_flg_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NE(info);
		else if (ne == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_wtax_amt) doRslt_wtax_amt_NE(info);
		else if (ne == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_schd_d_intr_rmrks) doRslt_schd_d_intr_rmrks_NE(info);
		else if (ne == columnRslt_act_d_intr_rmrks) doRslt_act_d_intr_rmrks_NE(info);
		else if (ne == columnRslt_arr_cnt_rmrks) doRslt_arr_cnt_rmrks_NE(info);
		else if (ne == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NE(info);
		else if (ne == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NE(info);
		else if (ne == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NE(info);
		else if (ne == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NE(info);
		else if (ne == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NE(info);
		else if (ne == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NE(info);
		else if (ne == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NE(info);
		else if (ne == columnRslt_ref_sls_act_no) doRslt_ref_sls_act_no_NE(info);
		else if (ne == columnRslt_ref_sls_act_d_no) doRslt_ref_sls_act_d_no_NE(info);
		else if (ne == columnRslt_base_sls_ac_dt) doRslt_base_sls_ac_dt_NE(info);
		else if (ne == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NE(info);
		else if (ne == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NE(info);
		else if (ne == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
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
	 * [Cnd]パネルの[non_arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_non_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_non_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_arr_non_ac_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_arr_non_ac_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char3_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[act_io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cnsgn_gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cnsgn_gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[act_io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_sls_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_sls_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_non_arr_flg) doCnd_non_arr_flg_NX(info);
		else if (nx == Cnd_part_arr_non_ac_flg) doCnd_part_arr_non_ac_flg_NX(info);
		else if (nx == Cnd_part_arr_flg) doCnd_part_arr_flg_NX(info);
		else if (nx == Cnd_cmpl_arr_non_ac_flg) doCnd_cmpl_arr_non_ac_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NX(info);
		else if (nx == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NX(info);
		else if (nx == Cnd_sync_flg) doCnd_sync_flg_NX(info);
		else if (nx == Cnd_not_sync_flg) doCnd_not_sync_flg_NX(info);
		else if (nx == Cnd_vmi_flg) doCnd_vmi_flg_NX(info);
		else if (nx == Cnd_not_vmi_flg) doCnd_not_vmi_flg_NX(info);
		else if (nx == Cnd_sls_ret_schd_dt_fr) doCnd_sls_ret_schd_dt_fr_NX(info);
		else if (nx == Cnd_sls_ret_schd_dt_to) doCnd_sls_ret_schd_dt_to_NX(info);
		else if (nx == Cnd_sls_ret_dt_fr) doCnd_sls_ret_dt_fr_NX(info);
		else if (nx == Cnd_sls_ret_dt_to) doCnd_sls_ret_dt_to_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_dest_cd1) doCnd_dest_cd1_NX(info);
		else if (nx == Cnd_dest_nm1) doCnd_dest_nm1_NX(info);
		else if (nx == Cnd_dest_cd2) doCnd_dest_cd2_NX(info);
		else if (nx == Cnd_dest_nm2) doCnd_dest_nm2_NX(info);
		else if (nx == Cnd_dest_cd3) doCnd_dest_cd3_NX(info);
		else if (nx == Cnd_dest_nm3) doCnd_dest_nm3_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NX(info);
		else if (nx == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_NX(info);
		else if (nx == Cnd_sls_ret_schd_d_no) doCnd_sls_ret_schd_d_no_NX(info);
		else if (nx == Cnd_arr_act_no) doCnd_arr_act_no_NX(info);
		else if (nx == Cnd_sls_act_no) doCnd_sls_act_no_NX(info);
		else if (nx == Cnd_sls_act_d_no) doCnd_sls_act_d_no_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_ret_rsn_cd) doCnd_ret_rsn_cd_NX(info);
		else if (nx == Cnd_ret_rsn_nm) doCnd_ret_rsn_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NX(info);
		else if (nx == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_schd_d_intr_rmrks) doCnd_schd_d_intr_rmrks_NX(info);
		else if (nx == Cnd_act_d_intr_rmrks) doCnd_act_d_intr_rmrks_NX(info);
		else if (nx == Cnd_arr_cnt_rmrks) doCnd_arr_cnt_rmrks_NX(info);
		else if (nx == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NX(info);
		else if (nx == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NX(info);
		else if (nx == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NX(info);
		else if (nx == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NX(info);
		else if (nx == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NX(info);
		else if (nx == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NX(info);
		else if (nx == Cnd_act_sub_char1) doCnd_act_sub_char1_NX(info);
		else if (nx == Cnd_act_sub_char2) doCnd_act_sub_char2_NX(info);
		else if (nx == Cnd_act_sub_char3) doCnd_act_sub_char3_NX(info);
		else if (nx == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NX(info);
		else if (nx == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NX(info);
		else if (nx == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NX(info);
		else if (nx == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NX(info);
		else if (nx == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NX(info);
		else if (nx == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NX(info);
		else if (nx == Cnd_inc_abort_flg) doCnd_inc_abort_flg_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NX(info);
		else if (nx == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_sls_ret_schd_no) doRslt_sls_ret_schd_no_NX(info);
		else if (nx == columnRslt_sls_ret_schd_d_no) doRslt_sls_ret_schd_d_no_NX(info);
		else if (nx == columnRslt_sls_ret_schd_dt) doRslt_sls_ret_schd_dt_NX(info);
		else if (nx == columnRslt_arr_act_no) doRslt_arr_act_no_NX(info);
		else if (nx == columnRslt_sls_act_no) doRslt_sls_act_no_NX(info);
		else if (nx == columnRslt_sls_act_rev) doRslt_sls_act_rev_NX(info);
		else if (nx == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_NX(info);
		else if (nx == columnRslt_sls_act_io_no) doRslt_sls_act_io_no_NX(info);
		else if (nx == columnRslt_sls_dt) doRslt_sls_dt_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_acst_nm) doRslt_acst_nm_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_ref_iv_no) doRslt_ref_iv_no_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NX(info);
		else if (nx == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NX(info);
		else if (nx == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NX(info);
		else if (nx == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NX(info);
		else if (nx == columnRslt_act_sub_char1) doRslt_act_sub_char1_NX(info);
		else if (nx == columnRslt_act_sub_char2) doRslt_act_sub_char2_NX(info);
		else if (nx == columnRslt_act_sub_char3) doRslt_act_sub_char3_NX(info);
		else if (nx == columnRslt_sync_flg) doRslt_sync_flg_NX(info);
		else if (nx == columnRslt_sret_fr_cd) doRslt_sret_fr_cd_NX(info);
		else if (nx == columnRslt_sret_fr_nm) doRslt_sret_fr_nm_NX(info);
		else if (nx == columnRslt_sret_fr_sundry_flg) doRslt_sret_fr_sundry_flg_NX(info);
		else if (nx == columnRslt_pri_prnt_flg) doRslt_pri_prnt_flg_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_nm1) doRslt_dest_nm1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_nm2) doRslt_dest_nm2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_dest_nm3) doRslt_dest_nm3_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NX(info);
		else if (nx == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NX(info);
		else if (nx == columnRslt_arr_cmpl_flg) doRslt_arr_cmpl_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_cnsgn_gd_cd) doRslt_cnsgn_gd_cd_NX(info);
		else if (nx == columnRslt_cnsgn_gd_nm) doRslt_cnsgn_gd_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NX(info);
		else if (nx == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_vmi_flg) doRslt_vmi_flg_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NX(info);
		else if (nx == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_wtax_amt) doRslt_wtax_amt_NX(info);
		else if (nx == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_schd_d_intr_rmrks) doRslt_schd_d_intr_rmrks_NX(info);
		else if (nx == columnRslt_act_d_intr_rmrks) doRslt_act_d_intr_rmrks_NX(info);
		else if (nx == columnRslt_arr_cnt_rmrks) doRslt_arr_cnt_rmrks_NX(info);
		else if (nx == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NX(info);
		else if (nx == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NX(info);
		else if (nx == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NX(info);
		else if (nx == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NX(info);
		else if (nx == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NX(info);
		else if (nx == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NX(info);
		else if (nx == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NX(info);
		else if (nx == columnRslt_ref_sls_act_no) doRslt_ref_sls_act_no_NX(info);
		else if (nx == columnRslt_ref_sls_act_d_no) doRslt_ref_sls_act_d_no_NX(info);
		else if (nx == columnRslt_base_sls_ac_dt) doRslt_base_sls_ac_dt_NX(info);
		else if (nx == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NX(info);
		else if (nx == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NX(info);
		else if (nx == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
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
	 * [Cnd]パネルの[non_arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_non_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_non_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_non_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_arr_non_ac_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_arr_non_ac_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_trgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_trgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_not_trgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_not_trgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char3_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[act_io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cnsgn_gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cnsgn_gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[act_io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_sls_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_sls_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_sls_ret_schd_dt_fr) doCnd_sls_ret_schd_dt_fr_LC(info);
		else if (lc == Cnd_sls_ret_schd_dt_to) doCnd_sls_ret_schd_dt_to_LC(info);
		else if (lc == Cnd_sls_ret_dt_fr) doCnd_sls_ret_dt_fr_LC(info);
		else if (lc == Cnd_sls_ret_dt_to) doCnd_sls_ret_dt_to_LC(info);
		else if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_dest_cd1) doCnd_dest_cd1_LC(info);
		else if (lc == Cnd_dest_nm1) doCnd_dest_nm1_LC(info);
		else if (lc == Cnd_dest_cd2) doCnd_dest_cd2_LC(info);
		else if (lc == Cnd_dest_nm2) doCnd_dest_nm2_LC(info);
		else if (lc == Cnd_dest_cd3) doCnd_dest_cd3_LC(info);
		else if (lc == Cnd_dest_nm3) doCnd_dest_nm3_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_LC(info);
		else if (lc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_sls_ret_schd_no) doCnd_sls_ret_schd_no_LC(info);
		else if (lc == Cnd_sls_ret_schd_d_no) doCnd_sls_ret_schd_d_no_LC(info);
		else if (lc == Cnd_arr_act_no) doCnd_arr_act_no_LC(info);
		else if (lc == Cnd_sls_act_no) doCnd_sls_act_no_LC(info);
		else if (lc == Cnd_sls_act_d_no) doCnd_sls_act_d_no_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_ret_rsn_cd) doCnd_ret_rsn_cd_LC(info);
		else if (lc == Cnd_ret_rsn_nm) doCnd_ret_rsn_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_LC(info);
		else if (lc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_schd_d_intr_rmrks) doCnd_schd_d_intr_rmrks_LC(info);
		else if (lc == Cnd_act_d_intr_rmrks) doCnd_act_d_intr_rmrks_LC(info);
		else if (lc == Cnd_arr_cnt_rmrks) doCnd_arr_cnt_rmrks_LC(info);
		else if (lc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_LC(info);
		else if (lc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_LC(info);
		else if (lc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_LC(info);
		else if (lc == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_LC(info);
		else if (lc == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_LC(info);
		else if (lc == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_LC(info);
		else if (lc == Cnd_act_sub_char1) doCnd_act_sub_char1_LC(info);
		else if (lc == Cnd_act_sub_char2) doCnd_act_sub_char2_LC(info);
		else if (lc == Cnd_act_sub_char3) doCnd_act_sub_char3_LC(info);
		else if (lc == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_LC(info);
		else if (lc == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_LC(info);
		else if (lc == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_LC(info);
		else if (lc == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_LC(info);
		else if (lc == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_LC(info);
		else if (lc == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_LC(info);
		else if (lc == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_LC(info);
		else if (lc == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_sls_ret_schd_no) doRslt_sls_ret_schd_no_LC(info);
		else if (lc == columnRslt_sls_ret_schd_d_no) doRslt_sls_ret_schd_d_no_LC(info);
		else if (lc == columnRslt_sls_ret_schd_dt) doRslt_sls_ret_schd_dt_LC(info);
		else if (lc == columnRslt_arr_act_no) doRslt_arr_act_no_LC(info);
		else if (lc == columnRslt_sls_act_no) doRslt_sls_act_no_LC(info);
		else if (lc == columnRslt_sls_act_rev) doRslt_sls_act_rev_LC(info);
		else if (lc == columnRslt_sls_act_d_no) doRslt_sls_act_d_no_LC(info);
		else if (lc == columnRslt_sls_act_io_no) doRslt_sls_act_io_no_LC(info);
		else if (lc == columnRslt_sls_dt) doRslt_sls_dt_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_bill_basis_dt) doRslt_bill_basis_dt_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_acst_nm) doRslt_acst_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_ref_iv_no) doRslt_ref_iv_no_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_LC(info);
		else if (lc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_LC(info);
		else if (lc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_LC(info);
		else if (lc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_LC(info);
		else if (lc == columnRslt_act_sub_char1) doRslt_act_sub_char1_LC(info);
		else if (lc == columnRslt_act_sub_char2) doRslt_act_sub_char2_LC(info);
		else if (lc == columnRslt_act_sub_char3) doRslt_act_sub_char3_LC(info);
		else if (lc == columnRslt_sret_fr_cd) doRslt_sret_fr_cd_LC(info);
		else if (lc == columnRslt_sret_fr_nm) doRslt_sret_fr_nm_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_nm1) doRslt_dest_nm1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_nm2) doRslt_dest_nm2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_dest_nm3) doRslt_dest_nm3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ_nm) doRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_LC(info);
		else if (lc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_LC(info);
		else if (lc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_LC(info);
		else if (lc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_cnsgn_gd_cd) doRslt_cnsgn_gd_cd_LC(info);
		else if (lc == columnRslt_cnsgn_gd_nm) doRslt_cnsgn_gd_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_LC(info);
		else if (lc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_LC(info);
		else if (lc == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_wtax_amt) doRslt_wtax_amt_LC(info);
		else if (lc == columnRslt_bill_crryovr_times) doRslt_bill_crryovr_times_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_schd_d_intr_rmrks) doRslt_schd_d_intr_rmrks_LC(info);
		else if (lc == columnRslt_act_d_intr_rmrks) doRslt_act_d_intr_rmrks_LC(info);
		else if (lc == columnRslt_arr_cnt_rmrks) doRslt_arr_cnt_rmrks_LC(info);
		else if (lc == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_LC(info);
		else if (lc == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_LC(info);
		else if (lc == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_LC(info);
		else if (lc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_LC(info);
		else if (lc == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_LC(info);
		else if (lc == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_LC(info);
		else if (lc == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_LC(info);
		else if (lc == columnRslt_ref_sls_act_no) doRslt_ref_sls_act_no_LC(info);
		else if (lc == columnRslt_ref_sls_act_d_no) doRslt_ref_sls_act_d_no_LC(info);
		else if (lc == columnRslt_base_sls_ac_dt) doRslt_base_sls_ac_dt_LC(info);
		else if (lc == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_LC(info);
		else if (lc == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_LC(info);
		else if (lc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
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
	 * [Cnd]パネルの[sls_ret_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_itm_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_rsn_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_d_sub_char3_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_io_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_schd_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_ret_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_ret_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sret_fr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sret_fr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sret_fr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_qty_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_qty_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cnsgn_gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cnsgn_gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cnsgn_gd_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_d_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_io_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_sls_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_sls_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sls_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sls_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgWg(row, info);
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
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
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
	 * コンボ／リストのリスト[Cnd_ret_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_ret_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsRtnBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1350.Srch01")) {
			return new MS_MSBBL1350_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1350.Srch02")) {
			return new MS_MSBBL1350_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1350_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1350_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1350_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1350_Srch01Bridge() {
			p_MS_MSBBL1350_Srch01 = new MCParam(PDef.MS_MSBBL1350_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1350_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1350.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1350.RsltR.class));

			p_MS_MSBBL1350_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1350_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1350_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1350_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1350_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1350.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1350.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1350.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1350.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1350_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1350.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1350_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1350.RsltR>)p_MS_MSBBL1350_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBBL1350_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1350_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1350_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1350_Srch02Bridge() {
			p_MS_MSBBL1350_Srch02 = new MCParam(PDef.MS_MSBBL1350_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1350_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1350.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1350.RsltR.class));

			p_MS_MSBBL1350_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1350_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1350_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1350_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1350_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1350.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1350.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1350.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1350.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1350_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1350.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1350_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1350.RsltR>)p_MS_MSBBL1350_Srch02.getContainerParam().getDownBlock(0));
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