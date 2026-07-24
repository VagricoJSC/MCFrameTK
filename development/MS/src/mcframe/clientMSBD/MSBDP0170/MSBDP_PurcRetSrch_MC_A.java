package mcframe.clientMSBD.MSBDP0170;

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
import mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch01Caller;
import mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch02Caller;
import mcframe.clientMSBD.MSBDP0170.MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Prnt01Caller;

/**
 * 画面"MSBDP_PurcRetSrch"パネルクラスです。<p>
 *
 * 仕入返品依頼、仕入返品実績を一覧で照会します。仕入返品票を一括で発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcRetSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBDP0170";

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
	// [Trnst]ブロック関連のField定義
	public MCPanel TrnstPanel = null;
	public MCTitledBorder TrnstTitledBorder = null;
	// [Trnst]ブロックの項目のField定義
	// [ProcTyp]ブロック関連のField定義
	public MCPanel ProcTypPanel = null;
	public MCTitledBorder ProcTypTitledBorder = null;
	// [ProcTyp]ブロックの項目のField定義
	// [Iv]ブロック関連のField定義
	public MCPanel IvPanel = null;
	public MCTitledBorder IvTitledBorder = null;
	// [Iv]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [SpplCnd]ブロック関連のField定義
	public MCPanel SpplCndPanel = null;
	public MCTitledBorder SpplCndTitledBorder = null;
	// [SpplCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	public MCTitledBorder ItmCndTitledBorder = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PRNT,Issue report;SRCH_SCHD_REF,View return schedule;SRCH_ACT_REF,View return result; PRNT,帳票発行;SRCH_SCHD_REF,返品予定を参照する;SRCH_ACT_REF,返品実績を参照する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	public MCRadioButton Cnd_ope_SRCH_SCHD_REF = null;
	public MCRadioButton Cnd_ope_SRCH_ACT_REF = null;
	/**
	 * SRCH_LST,Breakdown of details;SRCH_DTL,Details;SRCH_HDR,Header SRCH_LST,詳細;SRCH_DTL,明細;SRCH_HDR,ヘッダ.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_SRCH_LST = null;
	public MCRadioButton Cnd_mode_SRCH_DTL = null;
	public MCRadioButton Cnd_mode_SRCH_HDR = null;
	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public MCCheckBox Cnd_not_transt_flg = null;
	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public MCCheckBox Cnd_part_transt_flg = null;
	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public MCCheckBox Cnd_all_transt_flg = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCCheckBox Cnd_sret_abort_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_issue_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_issue_flg = null;
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
	public MCLabel Cnd_purc_ret_dt_fr_Label = null;
	/**
	 * Purchase return date FROM 仕入返品日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_ret_dt_fr = null;
	public MCLabel Cnd_purc_ret_dt_to_Label = null;
	/**
	 * Purchase return date TO 仕入返品日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_ret_dt_to = null;
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
	public MCLabel Cnd_schd_dt_fr_Label = null;
	/**
	 * Scheduled return date FROM 返品予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_fr = null;
	public MCLabel Cnd_schd_dt_to_Label = null;
	/**
	 * Scheduled return date TO 返品予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_to = null;
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
	public MCLabel Cnd_ret_sppl_nm_Label = null;
	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public MCTextField Cnd_ret_sppl_nm = null;
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
	public MCLabel Cnd_purc_ret_loc_cd_Label = null;
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_ret_loc_cd = null;
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_loc_nm = null;
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
	public MCLabel Cnd_iv_itm_nm_Label = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCTextField Cnd_iv_itm_nm = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_purc_dpt_cd_Label = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_nm = null;
	public MCLabel Cnd_purc_dpt_wg_cd_Label = null;
	/**
	 * Purchasing dept. WG cd. 購買部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_dpt_wg_cd = null;
	/**
	 * Purchasing dept. WG name 購買部門ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_purc_dpt_wg_nm = null;
	public MCLabel Cnd_purc_usr_cd_Label = null;
	/**
	 * Purchasing PIC 購買担当者.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_purc_ret_act_no_Label = null;
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_act_no = null;
	public MCLabel Cnd_purc_ret_act_d_no_Label = null;
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_act_d_no = null;
	public MCLabel Cnd_purc_ret_schd_no_Label = null;
	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_schd_no = null;
	public MCLabel Cnd_purc_ret_schd_d_no_Label = null;
	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_schd_d_no = null;
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
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
	public MCLabel Cnd_purc_ret_print_rmrks_Label = null;
	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_print_rmrks = null;
	public MCLabel Cnd_purc_ret_print_d_rmrks_Label = null;
	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public MCTextField Cnd_purc_ret_print_d_rmrks = null;
	public MCLabel Cnd_schd_trd_rmrks_Label = null;
	/**
	 * Return schedule transaction remarks 返品予定取引備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_trd_rmrks = null;
	public MCLabel Cnd_schd_trd_d_rmrks_Label = null;
	/**
	 * Return schedule transaction details remarks 返品予定取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_trd_d_rmrks = null;
	public MCLabel Cnd_schd_intr_rmrks_Label = null;
	/**
	 * Return schedule internal remarks 返品予定内部備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_intr_rmrks = null;
	public MCLabel Cnd_schd_intr_d_rmrks_Label = null;
	/**
	 * Return schedule internal details remarks 返品予定内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_schd_intr_d_rmrks = null;
	public MCLabel Cnd_act_trd_rmrks_Label = null;
	/**
	 * Return result transaction remarks 返品実績取引備考.<p>
	 *
	 */
	public MCTextField Cnd_act_trd_rmrks = null;
	public MCLabel Cnd_act_trd_d_rmrks_Label = null;
	/**
	 * Return result transaction details remarks 返品実績取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_act_trd_d_rmrks = null;
	public MCLabel Cnd_act_intr_rmrks_Label = null;
	/**
	 * Return result internal remarks 返品実績内部備考.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_rmrks = null;
	public MCLabel Cnd_act_intr_d_rmrks_Label = null;
	/**
	 * Return result internal details remarks 返品実績内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_act_intr_d_rmrks = null;
	public MCLabel Cnd_schd_sub_char1_Label = null;
	/**
	 * Return schedule spare 1 返品予定予備１.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char1 = null;
	public MCLabel Cnd_schd_sub_char2_Label = null;
	/**
	 * Return schedule spare 2 返品予定予備２.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char2 = null;
	public MCLabel Cnd_schd_sub_char3_Label = null;
	/**
	 * Return schedule spare 3 返品予定予備３.<p>
	 *
	 */
	public MCTextField Cnd_schd_sub_char3 = null;
	public MCLabel Cnd_schd_d_sub_char1_Label = null;
	/**
	 * Return schedule details spare 1 返品予定明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char1 = null;
	public MCLabel Cnd_schd_d_sub_char2_Label = null;
	/**
	 * Return schedule details spare 2 返品予定明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char2 = null;
	public MCLabel Cnd_schd_d_sub_char3_Label = null;
	/**
	 * Return schedule details spare 3 返品予定明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_schd_d_sub_char3 = null;
	public MCLabel Cnd_schd_io_sub_char1_Label = null;
	/**
	 * Return schedule GR/GI spare 1 返品予定受払予備１.<p>
	 *
	 */
	public MCTextField Cnd_schd_io_sub_char1 = null;
	public MCLabel Cnd_schd_io_sub_char2_Label = null;
	/**
	 * Return schedule GR/GI spare 2 返品予定受払予備２.<p>
	 *
	 */
	public MCTextField Cnd_schd_io_sub_char2 = null;
	public MCLabel Cnd_schd_io_sub_char3_Label = null;
	/**
	 * Return schedule GR/GI spare 3 返品予定受払予備３.<p>
	 *
	 */
	public MCTextField Cnd_schd_io_sub_char3 = null;
	public MCLabel Cnd_act_sub_char1_Label = null;
	/**
	 * Return result spare 1 返品実績予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char1 = null;
	public MCLabel Cnd_act_sub_char2_Label = null;
	/**
	 * Return result spare 2 返品実績予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char2 = null;
	public MCLabel Cnd_act_sub_char3_Label = null;
	/**
	 * Return result spare 3 返品実績予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_sub_char3 = null;
	public MCLabel Cnd_act_d_sub_char1_Label = null;
	/**
	 * Return result details spare 1 返品実績明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char1 = null;
	public MCLabel Cnd_act_d_sub_char2_Label = null;
	/**
	 * Return result details spare 2 返品実績明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char2 = null;
	public MCLabel Cnd_act_d_sub_char3_Label = null;
	/**
	 * Return result details spare 3 返品実績明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_d_sub_char3 = null;
	public MCLabel Cnd_act_io_sub_char1_Label = null;
	/**
	 * Return result GR/GI spare 1 返品実績受払予備１.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char1 = null;
	public MCLabel Cnd_act_io_sub_char2_Label = null;
	/**
	 * Return result GR/GI spare 2 返品実績受払予備２.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char2 = null;
	public MCLabel Cnd_act_io_sub_char3_Label = null;
	/**
	 * Return result GR/GI spare 3 返品実績受払予備３.<p>
	 *
	 */
	public MCTextField Cnd_act_io_sub_char3 = null;
	/**
	 * Include discount for return 返品目的の値引含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_ret_dscnt_flg = null;
	/**
	 * Include cancelled 取消済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
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
	public MCTable2<mcframe.clientMSBD.MSBDP0170.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_nm = null;
	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_sppl_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Rslt_ret_sppl_addr_p_PPanel;
	public MCColumnConfig columnRslt_cntry_cd;// [Rslt]の[ret_sppl_addr_p.cntry_cd]を[columnRslt_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntry_nm;// [Rslt]の[ret_sppl_addr_p.cntry_nm]を[columnRslt_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_zip_cd;// [Rslt]の[ret_sppl_addr_p.zip_cd]を[columnRslt_ret_sppl_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_addr1;// [Rslt]の[ret_sppl_addr_p.addr1]を[columnRslt_ret_sppl_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_addr2;// [Rslt]の[ret_sppl_addr_p.addr2]を[columnRslt_ret_sppl_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_addr3;// [Rslt]の[ret_sppl_addr_p.addr3]を[columnRslt_ret_sppl_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_addr4;// [Rslt]の[ret_sppl_addr_p.addr4]を[columnRslt_ret_sppl_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_tel;// [Rslt]の[ret_sppl_addr_p.tel]を[columnRslt_ret_sppl_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_ret_sppl_fax;// [Rslt]の[ret_sppl_addr_p.fax]を[columnRslt_ret_sppl_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntct_dpt;// [Rslt]の[ret_sppl_addr_p.cntct_dpt]を[columnRslt_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_cntct_psn;// [Rslt]の[ret_sppl_addr_p.cntct_psn]を[columnRslt_cntct_psn]としてエイリアス定義。
	/**
	 * Return-to PIC form of address 返品先担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_sppl_cntct_psn_title = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_rcpt_iv_no = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_nm = null;
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
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
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
	 * Return-from location WG cd 返品元場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_wg_cd = null;
	/**
	 * Return-from location WG name 返品元場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_wg_nm = null;
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_loc_cd = null;
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_loc_nm = null;
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
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
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_nm = null;
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ_nm = null;
	/**
	 * Return slip issue date and time 返品票発行日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_print_dt = null;
	/**
	 * Return slip issued 返品票発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_print_flg = null;
	/**
	 * Purchase return date 仕入返品日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_dt = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Scheduled return date 返品予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_dt = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
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
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_qty_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_ret_qty_p_PPanel;
	public MCColumnConfig columnRslt_ret_qty;// [Rslt]の[ret_qty_p.qty]を[columnRslt_ret_qty]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnRslt_abort_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnRslt_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_upri;// [Rslt]の[trd_cur_proc_upri_p.upri]を[columnRslt_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_upri;// [Rslt]の[trd_cur_onr_prov_upri_p.upri]を[columnRslt_trd_cur_onr_prov_upri]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_amt;// [Rslt]の[trd_cur_proc_amt_p.amt]を[columnRslt_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.amt]を[columnRslt_trd_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt_inc_tax_cur_amt;// [Rslt]の[trd_cur_amt_inc_tax_cur_amt_p.amt]を[columnRslt_trd_cur_amt_inc_tax_cur_amt]としてエイリアス定義。
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
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_crryovr_times = null;
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
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_upri_dec_place = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_upri;// [Rslt]の[base_cur_proc_upri_p.upri]を[columnRslt_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_upri;// [Rslt]の[base_cur_onr_prov_upri_p.upri]を[columnRslt_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_amt;// [Rslt]の[base_cur_proc_amt_p.amt]を[columnRslt_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_amt;// [Rslt]の[base_cur_onr_prov_amt_p.amt]を[columnRslt_base_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt_inc_tax_cur_amt;// [Rslt]の[base_cur_amt_inc_tax_cur_amt_p.amt]を[columnRslt_base_cur_amt_inc_tax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
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
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_amt_dec_place = null;
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_upri_dec_place = null;
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
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_amt_dec_place = null;
	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_upri_dec_place = null;
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_dt = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_ptax_xrate_p_PPanel;
	public MCColumnConfig columnRslt_ptax_xrate;// [Rslt]の[ptax_xrate_p.xrate]を[columnRslt_ptax_xrate]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_upri;// [Rslt]の[ptax_cur_upri_p.upri]を[columnRslt_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_upri;// [Rslt]の[ptax_cur_proc_upri_p.upri]を[columnRslt_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_upri;// [Rslt]の[ptax_cur_onr_prov_upri_p.upri]を[columnRslt_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_dscnt_amt;// [Rslt]の[ptax_cur_dscnt_amt_p.amt]を[columnRslt_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_tax_amt;// [Rslt]の[ptax_cur_inc_tax_amt_p.amt]を[columnRslt_ptax_cur_inc_tax_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_typ_nm = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_inst_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
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
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ret_rsn_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_nm = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_bd_itm_p_PPanel;
	public MCColumnConfig columnRslt_bd_itm_cd;// [Rslt]の[bd_itm_p.itm_cd]を[columnRslt_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub1;// [Rslt]の[bd_itm_p.itm_sub1]を[columnRslt_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub2;// [Rslt]の[bd_itm_p.itm_sub2]を[columnRslt_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub3;// [Rslt]の[bd_itm_p.itm_sub3]を[columnRslt_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_nm;// [Rslt]の[bd_itm_p.itm_nm]を[columnRslt_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_lot_no = null;
	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sublot_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_bd_sno_p_PPanel;
	public MCColumnConfig columnRslt_bd_sno1;// [Rslt]の[bd_sno_p.sno1]を[columnRslt_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno2;// [Rslt]の[bd_sno_p.sno2]を[columnRslt_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno3;// [Rslt]の[bd_sno_p.sno3]を[columnRslt_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno4;// [Rslt]の[bd_sno_p.sno4]を[columnRslt_bd_sno4]としてエイリアス定義。
	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_loc_cd = null;
	/**
	 * Charged location name 負担場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_loc_nm = null;
	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_ctg_cd = null;
	/**
	 * Charged item group name 負担品群名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_ctg_nm = null;
	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_oper_cd = null;
	/**
	 * Charged operation name 負担工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_oper_nm = null;
	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_iv_no = null;
	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_slo_no = null;
	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_po_no = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Rslt_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_purc_cont_qty;// [Rslt]の[purc_cont_qty_p.purc_cont_qty]を[columnRslt_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Rslt_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_purc_cont_fctr;// [Rslt]の[purc_cont_fctr_p.purc_cont_fctr]を[columnRslt_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_qty;// [Rslt]の[cont_qty_p.cont_qty]を[columnRslt_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm1 = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks1 = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm2 = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks2 = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_nm3 = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tterm_rmrks3 = null;
	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_print_rmrks = null;
	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_print_d_rmrks = null;
	/**
	 * Return schedule transaction remarks 返品予定取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_trd_rmrks = null;
	/**
	 * Return schedule transaction details remarks 返品予定取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_trd_d_rmrks = null;
	/**
	 * Return schedule internal remarks 返品予定内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_intr_rmrks = null;
	/**
	 * Return schedule internal details remarks 返品予定内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_intr_d_rmrks = null;
	/**
	 * Return result transaction remarks 返品実績取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_trd_rmrks = null;
	/**
	 * Return result transaction details remarks 返品実績取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_trd_d_rmrks = null;
	/**
	 * Return result internal remarks 返品実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_rmrks = null;
	/**
	 * Return result internal details remarks 返品実績内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_intr_d_rmrks = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_no = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_d_no = null;
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_no = null;
	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_rev = null;
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_d_no = null;
	/**
	 * Purchase return result GR/GI No. 仕入返品実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_act_io_no = null;
	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_schd_no = null;
	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_schd_d_no = null;
	/**
	 * Purchase return schedule GR/GI No. 仕入返品予定受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ret_schd_io_no = null;
	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_purc_act_no = null;
	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ref_purc_act_d_no = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_purc_ac_dt = null;
	/**
	 * Return schedule spare 1 返品予定予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char1 = null;
	/**
	 * Return schedule spare 2 返品予定予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char2 = null;
	/**
	 * Return schedule spare 3 返品予定予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_sub_char3 = null;
	/**
	 * Return schedule details spare 1 返品予定明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char1 = null;
	/**
	 * Return schedule details spare 2 返品予定明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char2 = null;
	/**
	 * Return schedule details spare 3 返品予定明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_d_sub_char3 = null;
	/**
	 * Return schedule GR/GI spare 1 返品予定受払予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_io_sub_char1 = null;
	/**
	 * Return schedule GR/GI spare 2 返品予定受払予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_io_sub_char2 = null;
	/**
	 * Return schedule GR/GI spare 3 返品予定受払予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_io_sub_char3 = null;
	/**
	 * Return result spare 1 返品実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char1 = null;
	/**
	 * Return result spare 2 返品実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char2 = null;
	/**
	 * Return result spare 3 返品実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_sub_char3 = null;
	/**
	 * Return result details spare 1 返品実績明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char1 = null;
	/**
	 * Return result details spare 2 返品実績明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char2 = null;
	/**
	 * Return result details spare 3 返品実績明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_sub_char3 = null;
	/**
	 * Return result GR/GI spare 1 返品実績受払予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char1 = null;
	/**
	 * Return result GR/GI spare 2 返品実績受払予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char2 = null;
	/**
	 * Return result GR/GI spare 3 返品実績受払予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_io_sub_char3 = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
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
	 * Purchase return schedule 仕入返品予定.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0150 = null;
	/**
	 * Purchase return 仕入返品.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0160 = null;
	/**
	 * Purchase discount 仕入値引.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0180 = null;
	/**
	 * Return slip 返品票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";
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
	public static final String[] statusArray = new String[]{SRCH_PRNT, PRNT, SRCH_SCHD_LST, SRCH_SCHD_DTL, SRCH_SCHD_HDR, SRCH_ACT_LST, SRCH_ACT_DTL, SRCH_ACT_HDR, REF_SCHD_LST, REF_SCHD_DTL, REF_SCHD_HDR, REF_ACT_LST, REF_ACT_DTL, REF_ACT_HDR};
	
	/** [MS_MSBDL0170_Srch01]のCallerの作成 */
	protected MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch01Caller createMS_MSBDL0170_Srch01() {
		MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch01Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Srch01Bridge>
		caller = ((MSBDP_PurcRetSrch_MC)this).new MS_MSBDL0170_Srch01Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Srch01Bridge>(
					(MSBDP_PurcRetSrch)this, new MS_MSBDL0170_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0170_Srch01]の呼び出し */
	protected void callMS_MSBDL0170_Srch01() {
		MCCaller caller = createMS_MSBDL0170_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0170_Srch02]のCallerの作成 */
	protected MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch02Caller createMS_MSBDL0170_Srch02() {
		MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Srch02Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Srch02Bridge>
		caller = ((MSBDP_PurcRetSrch_MC)this).new MS_MSBDL0170_Srch02Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Srch02Bridge>(
					(MSBDP_PurcRetSrch)this, new MS_MSBDL0170_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0170_Srch02]の呼び出し */
	protected void callMS_MSBDL0170_Srch02() {
		MCCaller caller = createMS_MSBDL0170_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0170_Prnt01]のCallerの作成 */
	protected MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Prnt01Caller createMS_MSBDL0170_Prnt01() {
		MSBDP_PurcRetSrch_MC.MS_MSBDL0170_Prnt01Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Prnt01Bridge>
		caller = ((MSBDP_PurcRetSrch_MC)this).new MS_MSBDL0170_Prnt01Caller<MSBDP_PurcRetSrch, MS_MSBDL0170_Prnt01Bridge>(
					(MSBDP_PurcRetSrch)this, new MS_MSBDL0170_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0170_Prnt01]の呼び出し */
	protected void callMS_MSBDL0170_Prnt01() {
		MCCaller caller = createMS_MSBDL0170_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0170.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0170.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0170.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0170.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0170.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0170.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0170.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBD.MSBDP0170.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0170.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBD.MSBDP0170.RsltR createRsltR() {
		return mcframe.clientMSBD.MSBDP0170.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0170.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBD.MSBDP0170.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0170.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0170.BtnR createBtnR() {
		return mcframe.clientMSBD.MSBDP0170.BtnR.create();
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
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(TrnstPanel);
		ret.add(ProcTypPanel);
		ret.add(IvPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(SpplCndPanel);
		ret.add(ItmCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcRetSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcRetSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcRetSrch_MC.jbCreateScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateSrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateTop((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateFold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateTab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateTrnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateIv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateTab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateTab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateSpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateCtrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateRPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateRslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbCreateBtn((MSBDP_PurcRetSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Trnst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTrnst(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [ProcTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateProcTyp(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Iv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIv(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [SpplCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplCnd(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcRetSrch p) {
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PurcRetSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBDP_PurcRetSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBDP_PurcRetSrch p) {
		p.Rslt_ret_sppl_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ret_sppl_addr_p);
		p.Rslt_ret_sppl_addr_p_PPanel.setName("Rslt.ret_sppl_addr_p");
		p.columnRslt_cntry_cd = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnRslt_cntry_cd.addAliasName("Rslt.cntry_cd", p);
		p.columnRslt_cntry_nm = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnRslt_cntry_nm.addAliasName("Rslt.cntry_nm", p);
		p.columnRslt_ret_sppl_zip_cd = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_zip_cd;
		p.columnRslt_ret_sppl_zip_cd.addAliasName("Rslt.ret_sppl_zip_cd", p);
		p.columnRslt_ret_sppl_addr1 = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_addr1;
		p.columnRslt_ret_sppl_addr1.addAliasName("Rslt.ret_sppl_addr1", p);
		p.columnRslt_ret_sppl_addr2 = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_addr2;
		p.columnRslt_ret_sppl_addr2.addAliasName("Rslt.ret_sppl_addr2", p);
		p.columnRslt_ret_sppl_addr3 = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_addr3;
		p.columnRslt_ret_sppl_addr3.addAliasName("Rslt.ret_sppl_addr3", p);
		p.columnRslt_ret_sppl_addr4 = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_addr4;
		p.columnRslt_ret_sppl_addr4.addAliasName("Rslt.ret_sppl_addr4", p);
		p.columnRslt_ret_sppl_tel = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_tel;
		p.columnRslt_ret_sppl_tel.addAliasName("Rslt.ret_sppl_tel", p);
		p.columnRslt_ret_sppl_fax = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_fax;
		p.columnRslt_ret_sppl_fax.addAliasName("Rslt.ret_sppl_fax", p);
		p.columnRslt_cntct_dpt = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnRslt_cntct_dpt.addAliasName("Rslt.cntct_dpt", p);
		p.columnRslt_cntct_psn = p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnRslt_cntct_psn.addAliasName("Rslt.cntct_psn", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$itm_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$sno_p);
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
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ret_qty_p);
		p.Rslt_ret_qty_p_PPanel.setName("Rslt.ret_qty_p");
		p.columnRslt_ret_qty = p.Rslt_ret_qty_p_PPanel.columnQty_qty;
		p.columnRslt_ret_qty.addAliasName("Rslt.ret_qty", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_proc_upri_p);
		p.Rslt_trd_cur_proc_upri_p_PPanel.setName("Rslt.trd_cur_proc_upri_p");
		p.columnRslt_trd_cur_proc_upri = p.Rslt_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_proc_upri.addAliasName("Rslt.trd_cur_proc_upri", p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_onr_prov_upri_p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.setName("Rslt.trd_cur_onr_prov_upri_p");
		p.columnRslt_trd_cur_onr_prov_upri = p.Rslt_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_onr_prov_upri.addAliasName("Rslt.trd_cur_onr_prov_upri", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_proc_amt_p);
		p.Rslt_trd_cur_proc_amt_p_PPanel.setName("Rslt.trd_cur_proc_amt_p");
		p.columnRslt_trd_cur_proc_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_proc_amt.addAliasName("Rslt.trd_cur_proc_amt", p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_onr_prov_amt_p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.setName("Rslt.trd_cur_onr_prov_amt_p");
		p.columnRslt_trd_cur_onr_prov_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_onr_prov_amt.addAliasName("Rslt.trd_cur_onr_prov_amt", p);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_amt_inc_tax_cur_amt_p);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_inc_tax_cur_amt_p");
		p.columnRslt_trd_cur_amt_inc_tax_cur_amt = p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt_inc_tax_cur_amt.addAliasName("Rslt.trd_cur_amt_inc_tax_cur_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_proc_upri_p);
		p.Rslt_base_cur_proc_upri_p_PPanel.setName("Rslt.base_cur_proc_upri_p");
		p.columnRslt_base_cur_proc_upri = p.Rslt_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_proc_upri.addAliasName("Rslt.base_cur_proc_upri", p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_onr_prov_upri_p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.setName("Rslt.base_cur_onr_prov_upri_p");
		p.columnRslt_base_cur_onr_prov_upri = p.Rslt_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_onr_prov_upri.addAliasName("Rslt.base_cur_onr_prov_upri", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_proc_amt_p);
		p.Rslt_base_cur_proc_amt_p_PPanel.setName("Rslt.base_cur_proc_amt_p");
		p.columnRslt_base_cur_proc_amt = p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_proc_amt.addAliasName("Rslt.base_cur_proc_amt", p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_onr_prov_amt_p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.setName("Rslt.base_cur_onr_prov_amt_p");
		p.columnRslt_base_cur_onr_prov_amt = p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_onr_prov_amt.addAliasName("Rslt.base_cur_onr_prov_amt", p);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_amt_inc_tax_cur_amt_p);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_inc_tax_cur_amt_p");
		p.columnRslt_base_cur_amt_inc_tax_cur_amt = p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt_inc_tax_cur_amt.addAliasName("Rslt.base_cur_amt_inc_tax_cur_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_xrate_p);
		p.Rslt_ptax_xrate_p_PPanel.setName("Rslt.ptax_xrate_p");
		p.columnRslt_ptax_xrate = p.Rslt_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_ptax_xrate.addAliasName("Rslt.ptax_xrate", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_proc_upri_p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.setName("Rslt.ptax_cur_proc_upri_p");
		p.columnRslt_ptax_cur_proc_upri = p.Rslt_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_proc_upri.addAliasName("Rslt.ptax_cur_proc_upri", p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_onr_prov_upri_p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.setName("Rslt.ptax_cur_onr_prov_upri_p");
		p.columnRslt_ptax_cur_onr_prov_upri = p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_onr_prov_upri.addAliasName("Rslt.ptax_cur_onr_prov_upri", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$ptax_cur_inc_tax_amt_p);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_tax_amt_p");
		p.columnRslt_ptax_cur_inc_tax_amt = p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_tax_amt.addAliasName("Rslt.ptax_cur_inc_tax_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_bd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$bd_itm_p);
		p.Rslt_bd_itm_p_PPanel.setName("Rslt.bd_itm_p");
		p.columnRslt_bd_itm_cd = p.Rslt_bd_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_bd_itm_cd.addAliasName("Rslt.bd_itm_cd", p);
		p.columnRslt_bd_itm_sub1 = p.Rslt_bd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_bd_itm_sub1.addAliasName("Rslt.bd_itm_sub1", p);
		p.columnRslt_bd_itm_sub2 = p.Rslt_bd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_bd_itm_sub2.addAliasName("Rslt.bd_itm_sub2", p);
		p.columnRslt_bd_itm_sub3 = p.Rslt_bd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_bd_itm_sub3.addAliasName("Rslt.bd_itm_sub3", p);
		p.columnRslt_bd_itm_nm = p.Rslt_bd_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_bd_itm_nm.addAliasName("Rslt.bd_itm_nm", p);
		p.Rslt_bd_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$bd_sno_p);
		p.Rslt_bd_sno_p_PPanel.setName("Rslt.bd_sno_p");
		p.columnRslt_bd_sno1 = p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_bd_sno1.addAliasName("Rslt.bd_sno1", p);
		p.columnRslt_bd_sno2 = p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_bd_sno2.addAliasName("Rslt.bd_sno2", p);
		p.columnRslt_bd_sno3 = p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_bd_sno3.addAliasName("Rslt.bd_sno3", p);
		p.columnRslt_bd_sno4 = p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_bd_sno4.addAliasName("Rslt.bd_sno4", p);
		p.Rslt_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$purc_cont_qty_p);
		p.Rslt_purc_cont_qty_p_PPanel.setName("Rslt.purc_cont_qty_p");
		p.columnRslt_purc_cont_qty = p.Rslt_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnRslt_purc_cont_qty.addAliasName("Rslt.purc_cont_qty", p);
		p.Rslt_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$purc_cont_fctr_p);
		p.Rslt_purc_cont_fctr_p_PPanel.setName("Rslt.purc_cont_fctr_p");
		p.columnRslt_purc_cont_fctr = p.Rslt_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnRslt_purc_cont_fctr.addAliasName("Rslt.purc_cont_fctr", p);
		p.Rslt_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$cont_qty_p);
		p.Rslt_cont_qty_p_PPanel.setName("Rslt.cont_qty_p");
		p.columnRslt_cont_qty = p.Rslt_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_qty.addAliasName("Rslt.cont_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$sppl_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBD.MSBDP0170.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBDP_PurcRetSrch p) {
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
	
	
	/** [Cnd_purc_ret_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_ret_loc_cd_p = null;

	/**
	 * [Cnd_purc_ret_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_ret_loc_cd_ListPutter() {
		if (Cnd_purc_ret_loc_cd_p == null) {
			Cnd_purc_ret_loc_cd_p = createCnd_purc_ret_loc_cd_ListPutter(Cnd_purc_ret_loc_cd, "purc_ret_loc_cd", "purc_ret_loc_nm");

		}
		return Cnd_purc_ret_loc_cd_p;
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
	
	
	/** [Cnd_purc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_dpt_cd_p = null;

	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_dpt_cd_ListPutter() {
		if (Cnd_purc_dpt_cd_p == null) {
			Cnd_purc_dpt_cd_p = createCnd_purc_dpt_cd_ListPutter(Cnd_purc_dpt_cd, "purc_dpt_cd", "purc_dpt_nm");

		}
		return Cnd_purc_dpt_cd_p;
	}
	
	
	/** [Cnd_purc_dpt_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_dpt_wg_cd_p = null;

	/**
	 * [Cnd_purc_dpt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_dpt_wg_cd_ListPutter() {
		if (Cnd_purc_dpt_wg_cd_p == null) {
			Cnd_purc_dpt_wg_cd_p = createCnd_purc_dpt_wg_cd_ListPutter(Cnd_purc_dpt_wg_cd, "purc_dpt_wg_cd", "purc_dpt_wg_nm");

		}
		return Cnd_purc_dpt_wg_cd_p;
	}
	
	
	/** [Cnd_purc_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_usr_cd_p = null;

	/**
	 * [Cnd_purc_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_usr_cd_ListPutter() {
		if (Cnd_purc_usr_cd_p == null) {
			Cnd_purc_usr_cd_p = createCnd_purc_usr_cd_ListPutter(Cnd_purc_usr_cd, "purc_usr_cd", "purc_usr_nm");

		}
		return Cnd_purc_usr_cd_p;
	}
	
	
	/** [Cnd_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_dpt_cd_p = null;

	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_dpt_cd_ListPutter() {
		if (Cnd_ap_dpt_cd_p == null) {
			Cnd_ap_dpt_cd_p = createCnd_ap_dpt_cd_ListPutter(Cnd_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Cnd_ap_dpt_cd_p;
	}
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
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
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","ver_flg","itm_sub1","itm_sub2","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","ver_flg","itm_sub2","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","ver_flg","itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","ver_flg");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcRetSrch create(){
		MSBDP_PurcRetSrch p = new MSBDP_PurcRetSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcRetSrch create(String name){
		MSBDP_PurcRetSrch p = new MSBDP_PurcRetSrch(name);
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
		MSBDP_PurcRetSrch_MC.jbfInitScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitSrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitTop((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitFold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitTab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitTrnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitIv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitTab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitTab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitSpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitCtrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitRPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitRslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbfInitBtn((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitSrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitTop((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitFold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitTab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitTrnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitIv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitTab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitTab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitSpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitCtrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitRPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitRslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.jbInitBtn((MSBDP_PurcRetSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcRetSrch p) {
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
	protected static void jbfInitTab1(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Trnst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTrnst(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.TrnstPanel = p.beansFactory.createPanel("Trnst");
		p.TrnstTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ProcTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitProcTyp(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ProcTypPanel = p.beansFactory.createPanel("ProcTyp");
		p.ProcTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIv(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.IvPanel = p.beansFactory.createPanel("Iv");
		p.IvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.SpplCndPanel = p.beansFactory.createPanel("SpplCnd");
		p.SpplCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		p.ItmCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_ope_SRCH_SCHD_REF = p.beansFactory.createRadioButton("Cnd.ope_SRCH_SCHD_REF");
		p.Cnd_ope_SRCH_ACT_REF = p.beansFactory.createRadioButton("Cnd.ope_SRCH_ACT_REF");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_SRCH_LST = p.beansFactory.createRadioButton("Cnd.mode_SRCH_LST");
		p.Cnd_mode_SRCH_DTL = p.beansFactory.createRadioButton("Cnd.mode_SRCH_DTL");
		p.Cnd_mode_SRCH_HDR = p.beansFactory.createRadioButton("Cnd.mode_SRCH_HDR");
		p.Cnd_not_transt_flg = p.beansFactory.createCheckBox("Cnd.not_transt_flg");
		p.Cnd_part_transt_flg = p.beansFactory.createCheckBox("Cnd.part_transt_flg");
		p.Cnd_all_transt_flg = p.beansFactory.createCheckBox("Cnd.all_transt_flg");
		p.Cnd_sret_abort_flg = p.beansFactory.createCheckBox("Cnd.sret_abort_flg");
		p.Cnd_not_issue_flg = p.beansFactory.createCheckBox("Cnd.not_issue_flg");
		p.Cnd_issue_flg = p.beansFactory.createCheckBox("Cnd.issue_flg");
		p.Cnd_iv_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_trgt_flg");
		p.Cnd_iv_not_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_trgt_flg");
		p.Cnd_purc_ret_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_ret_dt_fr_Label");
		p.Cnd_purc_ret_dt_fr = p.beansFactory.createDateField("Cnd.purc_ret_dt_fr");
		p.Cnd_purc_ret_dt_fr.setLabel(p.Cnd_purc_ret_dt_fr_Label);
		p.Cnd_purc_ret_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_ret_dt_to_Label");
		p.Cnd_purc_ret_dt_to = p.beansFactory.createDateField("Cnd.purc_ret_dt_to");
		p.Cnd_purc_ret_dt_to.setLabel(p.Cnd_purc_ret_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_dt_fr_Label");
		p.Cnd_schd_dt_fr = p.beansFactory.createDateField("Cnd.schd_dt_fr");
		p.Cnd_schd_dt_fr.setLabel(p.Cnd_schd_dt_fr_Label);
		p.Cnd_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_dt_to_Label");
		p.Cnd_schd_dt_to = p.beansFactory.createDateField("Cnd.schd_dt_to");
		p.Cnd_schd_dt_to.setLabel(p.Cnd_schd_dt_to_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_ret_sppl_nm_Label = p.beansFactory.createLabel("Cnd.ret_sppl_nm_Label");
		p.Cnd_ret_sppl_nm = p.beansFactory.createTextField("Cnd.ret_sppl_nm");
		p.Cnd_ret_sppl_nm.setLabel(p.Cnd_ret_sppl_nm_Label);
		p.Cnd_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.loc_wg_cd_Label");
		p.Cnd_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.loc_wg_cd");
		p.Cnd_loc_wg_cd.setLabel(p.Cnd_loc_wg_cd_Label);
		p.Cnd_loc_wg_nm = p.beansFactory.createTextField("Cnd.loc_wg_nm");
		p.Cnd_purc_ret_loc_cd_Label = p.beansFactory.createLabel("Cnd.purc_ret_loc_cd_Label");
		p.Cnd_purc_ret_loc_cd = p.beansFactory.createTextComboBox("Cnd.purc_ret_loc_cd");
		p.Cnd_purc_ret_loc_cd.setLabel(p.Cnd_purc_ret_loc_cd_Label);
		p.Cnd_purc_ret_loc_nm = p.beansFactory.createTextField("Cnd.purc_ret_loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_iv_itm_nm_Label = p.beansFactory.createLabel("Cnd.iv_itm_nm_Label");
		p.Cnd_iv_itm_nm = p.beansFactory.createTextField("Cnd.iv_itm_nm");
		p.Cnd_iv_itm_nm.setLabel(p.Cnd_iv_itm_nm_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_cd_Label");
		p.Cnd_purc_dpt_cd = p.beansFactory.createTextField("Cnd.purc_dpt_cd");
		p.Cnd_purc_dpt_cd.setLabel(p.Cnd_purc_dpt_cd_Label);
		p.Cnd_purc_dpt_nm = p.beansFactory.createTextField("Cnd.purc_dpt_nm");
		p.Cnd_purc_dpt_wg_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_wg_cd_Label");
		p.Cnd_purc_dpt_wg_cd = p.beansFactory.createTextComboBox("Cnd.purc_dpt_wg_cd");
		p.Cnd_purc_dpt_wg_cd.setLabel(p.Cnd_purc_dpt_wg_cd_Label);
		p.Cnd_purc_dpt_wg_nm = p.beansFactory.createTextField("Cnd.purc_dpt_wg_nm");
		p.Cnd_purc_usr_cd_Label = p.beansFactory.createLabel("Cnd.purc_usr_cd_Label");
		p.Cnd_purc_usr_cd = p.beansFactory.createTextField("Cnd.purc_usr_cd");
		p.Cnd_purc_usr_cd.setLabel(p.Cnd_purc_usr_cd_Label);
		p.Cnd_purc_usr_nm = p.beansFactory.createTextField("Cnd.purc_usr_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_purc_ret_act_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_act_no_Label");
		p.Cnd_purc_ret_act_no = p.beansFactory.createTextField("Cnd.purc_ret_act_no");
		p.Cnd_purc_ret_act_no.setLabel(p.Cnd_purc_ret_act_no_Label);
		p.Cnd_purc_ret_act_d_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_act_d_no_Label");
		p.Cnd_purc_ret_act_d_no = p.beansFactory.createTextField("Cnd.purc_ret_act_d_no");
		p.Cnd_purc_ret_act_d_no.setLabel(p.Cnd_purc_ret_act_d_no_Label);
		p.Cnd_purc_ret_schd_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_schd_no_Label");
		p.Cnd_purc_ret_schd_no = p.beansFactory.createTextField("Cnd.purc_ret_schd_no");
		p.Cnd_purc_ret_schd_no.setLabel(p.Cnd_purc_ret_schd_no_Label);
		p.Cnd_purc_ret_schd_d_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_schd_d_no_Label");
		p.Cnd_purc_ret_schd_d_no = p.beansFactory.createTextField("Cnd.purc_ret_schd_d_no");
		p.Cnd_purc_ret_schd_d_no.setLabel(p.Cnd_purc_ret_schd_d_no_Label);
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_purc_ret_print_rmrks_Label = p.beansFactory.createLabel("Cnd.purc_ret_print_rmrks_Label");
		p.Cnd_purc_ret_print_rmrks = p.beansFactory.createTextField("Cnd.purc_ret_print_rmrks");
		p.Cnd_purc_ret_print_rmrks.setLabel(p.Cnd_purc_ret_print_rmrks_Label);
		p.Cnd_purc_ret_print_d_rmrks_Label = p.beansFactory.createLabel("Cnd.purc_ret_print_d_rmrks_Label");
		p.Cnd_purc_ret_print_d_rmrks = p.beansFactory.createTextField("Cnd.purc_ret_print_d_rmrks");
		p.Cnd_purc_ret_print_d_rmrks.setLabel(p.Cnd_purc_ret_print_d_rmrks_Label);
		p.Cnd_schd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_trd_rmrks_Label");
		p.Cnd_schd_trd_rmrks = p.beansFactory.createTextField("Cnd.schd_trd_rmrks");
		p.Cnd_schd_trd_rmrks.setLabel(p.Cnd_schd_trd_rmrks_Label);
		p.Cnd_schd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_trd_d_rmrks_Label");
		p.Cnd_schd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.schd_trd_d_rmrks");
		p.Cnd_schd_trd_d_rmrks.setLabel(p.Cnd_schd_trd_d_rmrks_Label);
		p.Cnd_schd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_intr_rmrks_Label");
		p.Cnd_schd_intr_rmrks = p.beansFactory.createTextField("Cnd.schd_intr_rmrks");
		p.Cnd_schd_intr_rmrks.setLabel(p.Cnd_schd_intr_rmrks_Label);
		p.Cnd_schd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.schd_intr_d_rmrks_Label");
		p.Cnd_schd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.schd_intr_d_rmrks");
		p.Cnd_schd_intr_d_rmrks.setLabel(p.Cnd_schd_intr_d_rmrks_Label);
		p.Cnd_act_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.act_trd_rmrks_Label");
		p.Cnd_act_trd_rmrks = p.beansFactory.createTextField("Cnd.act_trd_rmrks");
		p.Cnd_act_trd_rmrks.setLabel(p.Cnd_act_trd_rmrks_Label);
		p.Cnd_act_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.act_trd_d_rmrks_Label");
		p.Cnd_act_trd_d_rmrks = p.beansFactory.createTextField("Cnd.act_trd_d_rmrks");
		p.Cnd_act_trd_d_rmrks.setLabel(p.Cnd_act_trd_d_rmrks_Label);
		p.Cnd_act_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_rmrks_Label");
		p.Cnd_act_intr_rmrks = p.beansFactory.createTextField("Cnd.act_intr_rmrks");
		p.Cnd_act_intr_rmrks.setLabel(p.Cnd_act_intr_rmrks_Label);
		p.Cnd_act_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.act_intr_d_rmrks_Label");
		p.Cnd_act_intr_d_rmrks = p.beansFactory.createTextField("Cnd.act_intr_d_rmrks");
		p.Cnd_act_intr_d_rmrks.setLabel(p.Cnd_act_intr_d_rmrks_Label);
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
		p.Cnd_schd_io_sub_char1_Label = p.beansFactory.createLabel("Cnd.schd_io_sub_char1_Label");
		p.Cnd_schd_io_sub_char1 = p.beansFactory.createTextField("Cnd.schd_io_sub_char1");
		p.Cnd_schd_io_sub_char1.setLabel(p.Cnd_schd_io_sub_char1_Label);
		p.Cnd_schd_io_sub_char2_Label = p.beansFactory.createLabel("Cnd.schd_io_sub_char2_Label");
		p.Cnd_schd_io_sub_char2 = p.beansFactory.createTextField("Cnd.schd_io_sub_char2");
		p.Cnd_schd_io_sub_char2.setLabel(p.Cnd_schd_io_sub_char2_Label);
		p.Cnd_schd_io_sub_char3_Label = p.beansFactory.createLabel("Cnd.schd_io_sub_char3_Label");
		p.Cnd_schd_io_sub_char3 = p.beansFactory.createTextField("Cnd.schd_io_sub_char3");
		p.Cnd_schd_io_sub_char3.setLabel(p.Cnd_schd_io_sub_char3_Label);
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
		p.Cnd_inc_ret_dscnt_flg = p.beansFactory.createCheckBox("Cnd.inc_ret_dscnt_flg");
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_sret_schd_sts_typ = p.beansFactory.createTableColumn("Rslt.sret_schd_sts_typ", MCColumnType.TEXT);
		p.columnRslt_sret_schd_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.sret_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_ret_sppl_nm = p.beansFactory.createTableColumn("Rslt.ret_sppl_nm", MCColumnType.TEXT);
		p.columnRslt_ret_sppl_cntct_psn_title = p.beansFactory.createTableColumn("Rslt.ret_sppl_cntct_psn_title", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_ref_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.ref_rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_purc_usr_cd = p.beansFactory.createTableColumn("Rslt.purc_usr_cd", MCColumnType.TEXT);
		p.columnRslt_purc_usr_nm = p.beansFactory.createTableColumn("Rslt.purc_usr_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_loc_wg_nm = p.beansFactory.createTableColumn("Rslt.loc_wg_nm", MCColumnType.TEXT);
		p.columnRslt_purc_ret_loc_cd = p.beansFactory.createTableColumn("Rslt.purc_ret_loc_cd", MCColumnType.TEXT);
		p.columnRslt_purc_ret_loc_nm = p.beansFactory.createTableColumn("Rslt.purc_ret_loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_cd = p.beansFactory.createTableColumn("Rslt.sppl_itm_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_nm = p.beansFactory.createTableColumn("Rslt.sppl_itm_nm", MCColumnType.TEXT);
		p.columnRslt_purc_id_typ = p.beansFactory.createTableColumn("Rslt.purc_id_typ", MCColumnType.TEXT);
		p.columnRslt_purc_id_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_purc_ret_print_dt = p.beansFactory.createTableColumn("Rslt.purc_ret_print_dt", MCColumnType.DATE);
		p.columnRslt_purc_ret_print_flg = p.beansFactory.createTableColumn("Rslt.purc_ret_print_flg", MCColumnType.CHECK);
		p.columnRslt_purc_ret_dt = p.beansFactory.createTableColumn("Rslt.purc_ret_dt", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_schd_dt = p.beansFactory.createTableColumn("Rslt.schd_dt", MCColumnType.DATE);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_qty_dec_place = p.beansFactory.createTableColumn("Rslt.trd_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_qty_dec_place = p.beansFactory.createTableColumn("Rslt.base_qty_dec_place", MCColumnType.NUMBER);
		p.columnRslt_abort_flg = p.beansFactory.createTableColumn("Rslt.abort_flg", MCColumnType.CHECK);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_pay_crryovr_times = p.beansFactory.createTableColumn("Rslt.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_dt = p.beansFactory.createTableColumn("Rslt.ptax_dt", MCColumnType.DATE);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_purc_typ = p.beansFactory.createTableColumn("Rslt.purc_typ", MCColumnType.TEXT);
		p.columnRslt_purc_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_ret_rsn_cd = p.beansFactory.createTableColumn("Rslt.ret_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_ret_rsn_nm = p.beansFactory.createTableColumn("Rslt.ret_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_cd = p.beansFactory.createTableColumn("Rslt.bd_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bd_dpt_nm = p.beansFactory.createTableColumn("Rslt.bd_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_lot_no = p.beansFactory.createTableColumn("Rslt.bd_lot_no", MCColumnType.TEXT);
		p.columnRslt_bd_sublot_no = p.beansFactory.createTableColumn("Rslt.bd_sublot_no", MCColumnType.TEXT);
		p.columnRslt_bd_loc_cd = p.beansFactory.createTableColumn("Rslt.bd_loc_cd", MCColumnType.TEXT);
		p.columnRslt_bd_loc_nm = p.beansFactory.createTableColumn("Rslt.bd_loc_nm", MCColumnType.TEXT);
		p.columnRslt_bd_ctg_cd = p.beansFactory.createTableColumn("Rslt.bd_ctg_cd", MCColumnType.TEXT);
		p.columnRslt_bd_ctg_nm = p.beansFactory.createTableColumn("Rslt.bd_ctg_nm", MCColumnType.TEXT);
		p.columnRslt_bd_oper_cd = p.beansFactory.createTableColumn("Rslt.bd_oper_cd", MCColumnType.TEXT);
		p.columnRslt_bd_oper_nm = p.beansFactory.createTableColumn("Rslt.bd_oper_nm", MCColumnType.TEXT);
		p.columnRslt_bd_iv_no = p.beansFactory.createTableColumn("Rslt.bd_iv_no", MCColumnType.TEXT);
		p.columnRslt_bd_slo_no = p.beansFactory.createTableColumn("Rslt.bd_slo_no", MCColumnType.TEXT);
		p.columnRslt_bd_po_no = p.beansFactory.createTableColumn("Rslt.bd_po_no", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_purc_ret_print_rmrks = p.beansFactory.createTableColumn("Rslt.purc_ret_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_purc_ret_print_d_rmrks = p.beansFactory.createTableColumn("Rslt.purc_ret_print_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_trd_rmrks = p.beansFactory.createTableColumn("Rslt.schd_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.schd_trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_intr_rmrks = p.beansFactory.createTableColumn("Rslt.schd_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_schd_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.schd_intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_trd_rmrks = p.beansFactory.createTableColumn("Rslt.act_trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.act_trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_intr_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_act_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.act_intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_d_no = p.beansFactory.createTableColumn("Rslt.purc_act_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_act_no = p.beansFactory.createTableColumn("Rslt.purc_ret_act_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_act_rev = p.beansFactory.createTableColumn("Rslt.purc_ret_act_rev", MCColumnType.NUMBER);
		p.columnRslt_purc_ret_act_d_no = p.beansFactory.createTableColumn("Rslt.purc_ret_act_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_act_io_no = p.beansFactory.createTableColumn("Rslt.purc_ret_act_io_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_schd_no = p.beansFactory.createTableColumn("Rslt.purc_ret_schd_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_schd_d_no = p.beansFactory.createTableColumn("Rslt.purc_ret_schd_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_ret_schd_io_no = p.beansFactory.createTableColumn("Rslt.purc_ret_schd_io_no", MCColumnType.TEXT);
		p.columnRslt_ref_purc_act_no = p.beansFactory.createTableColumn("Rslt.ref_purc_act_no", MCColumnType.TEXT);
		p.columnRslt_ref_purc_act_d_no = p.beansFactory.createTableColumn("Rslt.ref_purc_act_d_no", MCColumnType.TEXT);
		p.columnRslt_base_purc_ac_dt = p.beansFactory.createTableColumn("Rslt.base_purc_ac_dt", MCColumnType.DATE);
		p.columnRslt_schd_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_sub_char3", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_schd_io_sub_char1 = p.beansFactory.createTableColumn("Rslt.schd_io_sub_char1", MCColumnType.TEXT);
		p.columnRslt_schd_io_sub_char2 = p.beansFactory.createTableColumn("Rslt.schd_io_sub_char2", MCColumnType.TEXT);
		p.columnRslt_schd_io_sub_char3 = p.beansFactory.createTableColumn("Rslt.schd_io_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_d_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_d_sub_char3", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char1 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char1", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char2 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char2", MCColumnType.TEXT);
		p.columnRslt_act_io_sub_char3 = p.beansFactory.createTableColumn("Rslt.act_io_sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0150 = p.beansFactory.createButton("Btn.open_MSBDP0150", "open");
		p.Btn_open_MSBDP0160 = p.beansFactory.createButton("Btn.open_MSBDP0160", "open");
		p.Btn_open_MSBDP0180 = p.beansFactory.createButton("Btn.open_MSBDP0180", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SrchModePanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.TopPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBDP_PurcRetSrch p) {
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
	protected static void jbInitFold(MSBDP_PurcRetSrch p) {
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
	protected static void jbInitTab1(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.TrnstPanel, null);
		p.Tab1Panel.setLastBeans(p.TrnstPanel);
		p.TrnstPanel.setNextBeans(p.ProcTypPanel);
		p.Tab1Panel.add(p.ProcTypPanel, null);
		p.ProcTypPanel.setNextBeans(p.IvPanel);
		p.Tab1Panel.add(p.IvPanel, null);
		p.IvPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Trnst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTrnst(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.TrnstPanel.setBorder(p.TrnstTitledBorder);
		p.TrnstPanel.setValueCheck(false);
		p.TrnstPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TrnstPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [ProcTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitProcTyp(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ProcTypPanel.setBorder(p.ProcTypTitledBorder);
		p.ProcTypPanel.setValueCheck(false);
		p.ProcTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ProcTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Iv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIv(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.IvPanel.setBorder(p.IvTitledBorder);
		p.IvPanel.setValueCheck(false);
		p.IvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SpplCndPanel, null);
		p.Tab2Panel.setLastBeans(p.SpplCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ItmCndPanel, null);
		p.Tab3Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [SpplCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.SpplCndPanel.setBorder(p.SpplCndTitledBorder);
		p.SpplCndPanel.setValueCheck(false);
		p.SpplCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setBorder(p.ItmCndTitledBorder);
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setNextBeans(p.Cnd_ope_SRCH_SCHD_REF);
		p.Cnd_ope_SRCH_SCHD_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_SCHD_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_SCHD_REF);
		p.Cnd_ope_SRCH_SCHD_REF.setNextBeans(p.Cnd_ope_SRCH_ACT_REF);
		p.Cnd_ope_SRCH_ACT_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH_ACT_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH_ACT_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ope_META);
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
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.mode_META);
		p.TrnstPanel.add(p.Cnd_not_transt_flg);
		p.TrnstPanel.setLastBeans(p.Cnd_not_transt_flg);
		p.Cnd_not_transt_flg.setNextBeans(p.Cnd_part_transt_flg);
		p.Cnd_not_transt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.not_transt_flg_META);
		p.TrnstPanel.add(p.Cnd_part_transt_flg);
		p.Cnd_part_transt_flg.setNextBeans(p.Cnd_all_transt_flg);
		p.Cnd_part_transt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.part_transt_flg_META);
		p.TrnstPanel.add(p.Cnd_all_transt_flg);
		p.Cnd_all_transt_flg.setNextBeans(p.Cnd_sret_abort_flg);
		p.Cnd_all_transt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.all_transt_flg_META);
		p.TrnstPanel.add(p.Cnd_sret_abort_flg);
		p.Cnd_sret_abort_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.sret_abort_flg_META);
		p.ProcTypPanel.add(p.Cnd_not_issue_flg);
		p.ProcTypPanel.setLastBeans(p.Cnd_not_issue_flg);
		p.Cnd_not_issue_flg.setNextBeans(p.Cnd_issue_flg);
		p.Cnd_not_issue_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.not_issue_flg_META);
		p.ProcTypPanel.add(p.Cnd_issue_flg);
		p.Cnd_issue_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.issue_flg_META);
		p.IvPanel.add(p.Cnd_iv_trgt_flg);
		p.IvPanel.setLastBeans(p.Cnd_iv_trgt_flg);
		p.Cnd_iv_trgt_flg.setNextBeans(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.iv_trgt_flg_META);
		p.IvPanel.add(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_not_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.iv_not_trgt_flg_META);
		p.CndPanel.add(p.Cnd_purc_ret_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_ret_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_purc_ret_dt_fr);
		p.Cnd_purc_ret_dt_fr.setNextBeans(p.Cnd_purc_ret_dt_to);
		p.Cnd_purc_ret_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_dt_fr_META);
		p.Cnd_purc_ret_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_ret_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_ret_dt_to);
		p.Cnd_purc_ret_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_purc_ret_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_dt_to_META);
		p.Cnd_purc_ret_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_schd_dt_fr);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_dt_fr);
		p.Cnd_schd_dt_fr.setNextBeans(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_dt_fr_META);
		p.Cnd_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_dt_to_META);
		p.Cnd_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_ret_sppl_nm);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_ret_sppl_nm_Label);
		p.CndPanel.add(p.Cnd_ret_sppl_nm);
		p.Cnd_ret_sppl_nm.setNextBeans(p.Cnd_loc_wg_cd);
		p.Cnd_ret_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ret_sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_ret_sppl_nm, true);
		p.Cnd_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_wg_cd, true);
		p.Cnd_loc_wg_cd.setLinkBeans(p.Cnd_loc_wg_nm);
		p.CndPanel.add(p.Cnd_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_loc_wg_cd);
		p.Cnd_loc_wg_cd.setNextBeans(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_loc_wg_nm);
		p.Cnd_loc_wg_nm.setNextBeans(p.Cnd_purc_ret_loc_cd);
		p.Cnd_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_wg_nm, true);
		p.Cnd_purc_ret_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_ret_loc_cd, true);
		p.Cnd_purc_ret_loc_cd.setLinkBeans(p.Cnd_purc_ret_loc_nm);
		p.CndPanel.add(p.Cnd_purc_ret_loc_cd_Label);
		p.CndPanel.add(p.Cnd_purc_ret_loc_cd);
		p.Cnd_purc_ret_loc_cd.setNextBeans(p.Cnd_purc_ret_loc_nm);
		p.Cnd_purc_ret_loc_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_loc_cd_META);
		p.CndPanel.add(p.Cnd_purc_ret_loc_nm);
		p.Cnd_purc_ret_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_purc_ret_loc_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
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
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_iv_itm_nm);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_iv_itm_nm_Label);
		p.CndPanel.add(p.Cnd_iv_itm_nm);
		p.Cnd_iv_itm_nm.setNextBeans(p.Cnd_iv_no);
		p.Cnd_iv_itm_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.iv_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_iv_itm_nm, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_purc_dpt_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_dpt_cd_META);
		p.Cnd_purc_dpt_cd.addLinkBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_purc_dpt_wg_cd);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_nm, true);
		p.Cnd_purc_dpt_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_wg_cd, true);
		p.Cnd_purc_dpt_wg_cd.setLinkBeans(p.Cnd_purc_dpt_wg_nm);
		p.CndPanel.add(p.Cnd_purc_dpt_wg_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_wg_cd);
		p.Cnd_purc_dpt_wg_cd.setNextBeans(p.Cnd_purc_dpt_wg_nm);
		p.Cnd_purc_dpt_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_dpt_wg_cd_META);
		p.CndPanel.add(p.Cnd_purc_dpt_wg_nm);
		p.Cnd_purc_dpt_wg_nm.setNextBeans(p.Cnd_purc_usr_cd);
		p.Cnd_purc_dpt_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_dpt_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_wg_nm, true);
		p.CndPanel.add(p.Cnd_purc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_purc_usr_cd);
		p.Cnd_purc_usr_cd.setNextBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_usr_cd_META);
		p.Cnd_purc_usr_cd.addLinkBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_usr_cd, true);
		p.CndPanel.add(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_purc_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_usr_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_po_no);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_purc_ret_act_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_act_no);
		p.Cnd_purc_ret_act_no.setNextBeans(p.Cnd_purc_ret_act_d_no);
		p.Cnd_purc_ret_act_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_act_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_act_d_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_act_d_no);
		p.Cnd_purc_ret_act_d_no.setNextBeans(p.Cnd_purc_ret_schd_no);
		p.Cnd_purc_ret_act_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_act_d_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_schd_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_schd_no);
		p.Cnd_purc_ret_schd_no.setNextBeans(p.Cnd_purc_ret_schd_d_no);
		p.Cnd_purc_ret_schd_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_schd_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_schd_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_schd_d_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_schd_d_no);
		p.Cnd_purc_ret_schd_d_no.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_purc_ret_schd_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_schd_d_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_schd_d_no, true);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_purc_ret_print_rmrks);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_purc_ret_print_rmrks_Label);
		p.CndPanel.add(p.Cnd_purc_ret_print_rmrks);
		p.Cnd_purc_ret_print_rmrks.setNextBeans(p.Cnd_purc_ret_print_d_rmrks);
		p.Cnd_purc_ret_print_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_print_rmrks_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_print_rmrks, true);
		p.CndPanel.add(p.Cnd_purc_ret_print_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_purc_ret_print_d_rmrks);
		p.Cnd_purc_ret_print_d_rmrks.setNextBeans(p.Cnd_schd_trd_rmrks);
		p.Cnd_purc_ret_print_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.purc_ret_print_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_print_d_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_trd_rmrks);
		p.Cnd_schd_trd_rmrks.setNextBeans(p.Cnd_schd_trd_d_rmrks);
		p.Cnd_schd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_trd_d_rmrks);
		p.Cnd_schd_trd_d_rmrks.setNextBeans(p.Cnd_schd_intr_rmrks);
		p.Cnd_schd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_intr_rmrks);
		p.Cnd_schd_intr_rmrks.setNextBeans(p.Cnd_schd_intr_d_rmrks);
		p.Cnd_schd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_schd_intr_d_rmrks);
		p.Cnd_schd_intr_d_rmrks.setNextBeans(p.Cnd_act_trd_rmrks);
		p.Cnd_schd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_schd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_act_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_trd_rmrks);
		p.Cnd_act_trd_rmrks.setNextBeans(p.Cnd_act_trd_d_rmrks);
		p.Cnd_act_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_act_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_trd_d_rmrks);
		p.Cnd_act_trd_d_rmrks.setNextBeans(p.Cnd_act_intr_rmrks);
		p.Cnd_act_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_act_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_rmrks);
		p.Cnd_act_intr_rmrks.setNextBeans(p.Cnd_act_intr_d_rmrks);
		p.Cnd_act_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_act_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_act_intr_d_rmrks);
		p.Cnd_act_intr_d_rmrks.setNextBeans(p.Cnd_schd_sub_char1);
		p.Cnd_act_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_act_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_schd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char1);
		p.Cnd_schd_sub_char1.setNextBeans(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char2);
		p.Cnd_schd_sub_char2.setNextBeans(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_sub_char3);
		p.Cnd_schd_sub_char3.setNextBeans(p.Cnd_schd_d_sub_char1);
		p.Cnd_schd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_sub_char3, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char1);
		p.Cnd_schd_d_sub_char1.setNextBeans(p.Cnd_schd_d_sub_char2);
		p.Cnd_schd_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char2);
		p.Cnd_schd_d_sub_char2.setNextBeans(p.Cnd_schd_d_sub_char3);
		p.Cnd_schd_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_d_sub_char3);
		p.Cnd_schd_d_sub_char3.setNextBeans(p.Cnd_schd_io_sub_char1);
		p.Cnd_schd_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_schd_io_sub_char1_Label);
		p.CndPanel.add(p.Cnd_schd_io_sub_char1);
		p.Cnd_schd_io_sub_char1.setNextBeans(p.Cnd_schd_io_sub_char2);
		p.Cnd_schd_io_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_io_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_schd_io_sub_char1, true);
		p.CndPanel.add(p.Cnd_schd_io_sub_char2_Label);
		p.CndPanel.add(p.Cnd_schd_io_sub_char2);
		p.Cnd_schd_io_sub_char2.setNextBeans(p.Cnd_schd_io_sub_char3);
		p.Cnd_schd_io_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_io_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_schd_io_sub_char2, true);
		p.CndPanel.add(p.Cnd_schd_io_sub_char3_Label);
		p.CndPanel.add(p.Cnd_schd_io_sub_char3);
		p.Cnd_schd_io_sub_char3.setNextBeans(p.Cnd_act_sub_char1);
		p.Cnd_schd_io_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.schd_io_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_schd_io_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_sub_char1);
		p.Cnd_act_sub_char1.setNextBeans(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_sub_char2);
		p.Cnd_act_sub_char2.setNextBeans(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_sub_char3);
		p.Cnd_act_sub_char3.setNextBeans(p.Cnd_act_d_sub_char1);
		p.Cnd_act_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char1);
		p.Cnd_act_d_sub_char1.setNextBeans(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_d_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char2);
		p.Cnd_act_d_sub_char2.setNextBeans(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_d_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_d_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_d_sub_char3);
		p.Cnd_act_d_sub_char3.setNextBeans(p.Cnd_act_io_sub_char1);
		p.Cnd_act_d_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_d_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_d_sub_char3, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char1_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char1);
		p.Cnd_act_io_sub_char1.setNextBeans(p.Cnd_act_io_sub_char2);
		p.Cnd_act_io_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_io_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char1, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char2_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char2);
		p.Cnd_act_io_sub_char2.setNextBeans(p.Cnd_act_io_sub_char3);
		p.Cnd_act_io_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_io_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char2, true);
		p.CndPanel.add(p.Cnd_act_io_sub_char3_Label);
		p.CndPanel.add(p.Cnd_act_io_sub_char3);
		p.Cnd_act_io_sub_char3.setNextBeans(p.Cnd_inc_ret_dscnt_flg);
		p.Cnd_act_io_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.act_io_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_act_io_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_ret_dscnt_flg);
		p.Cnd_inc_ret_dscnt_flg.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_inc_ret_dscnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.inc_ret_dscnt_flg_META);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0170.CndR.inc_past_flg_META);
		p.SpplCndPanel.add(p.Cnd_sppl_grp_p_PPanel);
		p.SpplCndPanel.setLastBeans(p.Cnd_sppl_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PurcRetSrch p) {
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
	protected static void jbInitRPnl(MSBDP_PurcRetSrch p) {
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
	protected static void jbInitRslt(MSBDP_PurcRetSrch p) {
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
	protected static void jbInitBtn(MSBDP_PurcRetSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0150.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBDP0150);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBDP0150);
		p.Btn_open_MSBDP0150.setNextBeans(p.Btn_open_MSBDP0160);
		p.Btn_open_MSBDP0160.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBDP0160);
		p.Btn_open_MSBDP0160.setNextBeans(p.Btn_open_MSBDP0180);
		p.Btn_open_MSBDP0180.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBDP0180);
		p.Btn_open_MSBDP0180.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0170.BtnR.indiv_prnt_flg_META);
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
		MSBDP_PurcRetSrch_MC.mcInitScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitSrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitTop((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitFold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitTab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitTrnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitIv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitTab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitTab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitSpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitCtrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitRPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitRslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.mcInitBtn((MSBDP_PurcRetSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__PRNT_Btn((MSBDP_PurcRetSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitPRNT_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitPRNT_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_SCHD_LST]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__LST_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_SCHD_DTL]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__DTL_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_SCHD_HDR]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__SCHD__HDR_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_ACT_LST]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__LST_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_ACT_DTL]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__DTL_Btn((MSBDP_PurcRetSrch)this);

		// [SRCH_ACT_HDR]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitSRCH__ACT__HDR_Btn((MSBDP_PurcRetSrch)this);

		// [REF_SCHD_LST]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__LST_Btn((MSBDP_PurcRetSrch)this);

		// [REF_SCHD_DTL]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__DTL_Btn((MSBDP_PurcRetSrch)this);

		// [REF_SCHD_HDR]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__SCHD__HDR_Btn((MSBDP_PurcRetSrch)this);

		// [REF_ACT_LST]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__LST_Btn((MSBDP_PurcRetSrch)this);

		// [REF_ACT_DTL]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__DTL_Btn((MSBDP_PurcRetSrch)this);

		// [REF_ACT_HDR]ステータスのモードの設定
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_ScreenOpe((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_SrchMode((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Top((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Fold((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Tab1((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Trnst((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_ProcTyp((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Iv((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Tab2((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Tab3((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_SpplCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_ItmCnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Cnd((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Ctrl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_RPnl((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Rslt((MSBDP_PurcRetSrch)this);
		MSBDP_PurcRetSrch_MC.statusInitREF__ACT__HDR_Btn((MSBDP_PurcRetSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcRetSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Trnst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTrnst(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [ProcTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitProcTyp(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Iv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIv(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [SpplCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplCnd(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBDP_PurcRetSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcRetSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_ope_SRCH_SCHD_REF.addAllListener(p);
		p.Cnd_ope_SRCH_ACT_REF.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_SRCH_LST.addAllListener(p);
		p.Cnd_mode_SRCH_DTL.addAllListener(p);
		p.Cnd_mode_SRCH_HDR.addAllListener(p);
		p.Cnd_not_transt_flg.addAllListener(p);
		p.Cnd_part_transt_flg.addAllListener(p);
		p.Cnd_all_transt_flg.addAllListener(p);
		p.Cnd_sret_abort_flg.addAllListener(p);
		p.Cnd_not_issue_flg.addAllListener(p);
		p.Cnd_issue_flg.addAllListener(p);
		p.Cnd_iv_trgt_flg.addAllListener(p);
		p.Cnd_iv_not_trgt_flg.addAllListener(p);
		p.Cnd_purc_ret_dt_fr.setListListener(p);
		p.Cnd_purc_ret_dt_fr.addAllListener(p);
		p.Cnd_purc_ret_dt_to.setListListener(p);
		p.Cnd_purc_ret_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_schd_dt_fr.setListListener(p);
		p.Cnd_schd_dt_fr.addAllListener(p);
		p.Cnd_schd_dt_to.setListListener(p);
		p.Cnd_schd_dt_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_ret_sppl_nm.setListListener(p);
		p.Cnd_ret_sppl_nm.addAllListener(p);
		p.Cnd_loc_wg_cd.setListListener(p);
		p.Cnd_loc_wg_cd.addAllListener(p);
		p.Cnd_loc_wg_nm.setListListener(p);
		p.Cnd_loc_wg_nm.addAllListener(p);
		p.Cnd_purc_ret_loc_cd.setListListener(p);
		p.Cnd_purc_ret_loc_cd.addAllListener(p);
		p.Cnd_purc_ret_loc_nm.setListListener(p);
		p.Cnd_purc_ret_loc_nm.addAllListener(p);
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
		p.Cnd_iv_itm_nm.setListListener(p);
		p.Cnd_iv_itm_nm.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_purc_dpt_cd.setListListener(p);
		p.Cnd_purc_dpt_cd.addAllListener(p);
		p.Cnd_purc_dpt_nm.setListListener(p);
		p.Cnd_purc_dpt_nm.addAllListener(p);
		p.Cnd_purc_dpt_wg_cd.setListListener(p);
		p.Cnd_purc_dpt_wg_cd.addAllListener(p);
		p.Cnd_purc_dpt_wg_nm.setListListener(p);
		p.Cnd_purc_dpt_wg_nm.addAllListener(p);
		p.Cnd_purc_usr_cd.setListListener(p);
		p.Cnd_purc_usr_cd.addAllListener(p);
		p.Cnd_purc_usr_nm.setListListener(p);
		p.Cnd_purc_usr_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_purc_ret_act_no.setListListener(p);
		p.Cnd_purc_ret_act_no.addAllListener(p);
		p.Cnd_purc_ret_act_d_no.setListListener(p);
		p.Cnd_purc_ret_act_d_no.addAllListener(p);
		p.Cnd_purc_ret_schd_no.setListListener(p);
		p.Cnd_purc_ret_schd_no.addAllListener(p);
		p.Cnd_purc_ret_schd_d_no.setListListener(p);
		p.Cnd_purc_ret_schd_d_no.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_purc_ret_print_rmrks.setListListener(p);
		p.Cnd_purc_ret_print_rmrks.addAllListener(p);
		p.Cnd_purc_ret_print_d_rmrks.setListListener(p);
		p.Cnd_purc_ret_print_d_rmrks.addAllListener(p);
		p.Cnd_schd_trd_rmrks.setListListener(p);
		p.Cnd_schd_trd_rmrks.addAllListener(p);
		p.Cnd_schd_trd_d_rmrks.setListListener(p);
		p.Cnd_schd_trd_d_rmrks.addAllListener(p);
		p.Cnd_schd_intr_rmrks.setListListener(p);
		p.Cnd_schd_intr_rmrks.addAllListener(p);
		p.Cnd_schd_intr_d_rmrks.setListListener(p);
		p.Cnd_schd_intr_d_rmrks.addAllListener(p);
		p.Cnd_act_trd_rmrks.setListListener(p);
		p.Cnd_act_trd_rmrks.addAllListener(p);
		p.Cnd_act_trd_d_rmrks.setListListener(p);
		p.Cnd_act_trd_d_rmrks.addAllListener(p);
		p.Cnd_act_intr_rmrks.setListListener(p);
		p.Cnd_act_intr_rmrks.addAllListener(p);
		p.Cnd_act_intr_d_rmrks.setListListener(p);
		p.Cnd_act_intr_d_rmrks.addAllListener(p);
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
		p.Cnd_schd_io_sub_char1.setListListener(p);
		p.Cnd_schd_io_sub_char1.addAllListener(p);
		p.Cnd_schd_io_sub_char2.setListListener(p);
		p.Cnd_schd_io_sub_char2.addAllListener(p);
		p.Cnd_schd_io_sub_char3.setListListener(p);
		p.Cnd_schd_io_sub_char3.addAllListener(p);
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
		p.Cnd_inc_ret_dscnt_flg.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PurcRetSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBDP_PurcRetSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBDP_PurcRetSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ.setListListener(p);
		p.columnRslt_sret_schd_sts_typ_nm.addAllListener(p);
		p.columnRslt_sret_schd_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_ret_sppl_nm.addAllListener(p);
		p.columnRslt_ret_sppl_nm.setListListener(p);
		p.columnRslt_ret_sppl_cntct_psn_title.addAllListener(p);
		p.columnRslt_ret_sppl_cntct_psn_title.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_ref_rcpt_iv_no.addAllListener(p);
		p.columnRslt_ref_rcpt_iv_no.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_purc_usr_cd.addAllListener(p);
		p.columnRslt_purc_usr_cd.setListListener(p);
		p.columnRslt_purc_usr_nm.addAllListener(p);
		p.columnRslt_purc_usr_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_loc_wg_cd.addAllListener(p);
		p.columnRslt_loc_wg_cd.setListListener(p);
		p.columnRslt_loc_wg_nm.addAllListener(p);
		p.columnRslt_loc_wg_nm.setListListener(p);
		p.columnRslt_purc_ret_loc_cd.addAllListener(p);
		p.columnRslt_purc_ret_loc_cd.setListListener(p);
		p.columnRslt_purc_ret_loc_nm.addAllListener(p);
		p.columnRslt_purc_ret_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_sppl_itm_cd.addAllListener(p);
		p.columnRslt_sppl_itm_cd.setListListener(p);
		p.columnRslt_sppl_itm_nm.addAllListener(p);
		p.columnRslt_sppl_itm_nm.setListListener(p);
		p.columnRslt_purc_id_typ.addAllListener(p);
		p.columnRslt_purc_id_typ.setListListener(p);
		p.columnRslt_purc_id_typ_nm.addAllListener(p);
		p.columnRslt_purc_id_typ_nm.setListListener(p);
		p.columnRslt_purc_ret_print_dt.addAllListener(p);
		p.columnRslt_purc_ret_print_dt.setListListener(p);
		p.columnRslt_purc_ret_print_flg.addAllListener(p);
		p.columnRslt_purc_ret_dt.addAllListener(p);
		p.columnRslt_purc_ret_dt.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_schd_dt.addAllListener(p);
		p.columnRslt_schd_dt.setListListener(p);
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
		p.columnRslt_abort_flg.addAllListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.addAllListener(p);
		p.columnRslt_dscnt_rsn_cd.setListListener(p);
		p.columnRslt_dscnt_rsn_nm.addAllListener(p);
		p.columnRslt_dscnt_rsn_nm.setListListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_pay_crryovr_times.addAllListener(p);
		p.columnRslt_pay_crryovr_times.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_trd_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_upri_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_amt_dec_place.addAllListener(p);
		p.columnRslt_base_amt_dec_place.setListListener(p);
		p.columnRslt_base_upri_dec_place.addAllListener(p);
		p.columnRslt_base_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_ptax_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_upri_dec_place.addAllListener(p);
		p.columnRslt_ptax_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_dt.addAllListener(p);
		p.columnRslt_ptax_dt.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_purc_typ.addAllListener(p);
		p.columnRslt_purc_typ.setListListener(p);
		p.columnRslt_purc_typ_nm.addAllListener(p);
		p.columnRslt_purc_typ_nm.setListListener(p);
		p.columnRslt_mfg_inst_no.addAllListener(p);
		p.columnRslt_mfg_inst_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_ret_rsn_cd.addAllListener(p);
		p.columnRslt_ret_rsn_cd.setListListener(p);
		p.columnRslt_ret_rsn_nm.addAllListener(p);
		p.columnRslt_ret_rsn_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_bd_dpt_cd.addAllListener(p);
		p.columnRslt_bd_dpt_cd.setListListener(p);
		p.columnRslt_bd_dpt_nm.addAllListener(p);
		p.columnRslt_bd_dpt_nm.setListListener(p);
		p.columnRslt_bd_lot_no.addAllListener(p);
		p.columnRslt_bd_lot_no.setListListener(p);
		p.columnRslt_bd_sublot_no.addAllListener(p);
		p.columnRslt_bd_sublot_no.setListListener(p);
		p.columnRslt_bd_loc_cd.addAllListener(p);
		p.columnRslt_bd_loc_cd.setListListener(p);
		p.columnRslt_bd_loc_nm.addAllListener(p);
		p.columnRslt_bd_loc_nm.setListListener(p);
		p.columnRslt_bd_ctg_cd.addAllListener(p);
		p.columnRslt_bd_ctg_cd.setListListener(p);
		p.columnRslt_bd_ctg_nm.addAllListener(p);
		p.columnRslt_bd_ctg_nm.setListListener(p);
		p.columnRslt_bd_oper_cd.addAllListener(p);
		p.columnRslt_bd_oper_cd.setListListener(p);
		p.columnRslt_bd_oper_nm.addAllListener(p);
		p.columnRslt_bd_oper_nm.setListListener(p);
		p.columnRslt_bd_iv_no.addAllListener(p);
		p.columnRslt_bd_iv_no.setListListener(p);
		p.columnRslt_bd_slo_no.addAllListener(p);
		p.columnRslt_bd_slo_no.setListListener(p);
		p.columnRslt_bd_po_no.addAllListener(p);
		p.columnRslt_bd_po_no.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_tterm_cd1.addAllListener(p);
		p.columnRslt_tterm_cd1.setListListener(p);
		p.columnRslt_tterm_nm1.addAllListener(p);
		p.columnRslt_tterm_nm1.setListListener(p);
		p.columnRslt_tterm_rmrks1.addAllListener(p);
		p.columnRslt_tterm_rmrks1.setListListener(p);
		p.columnRslt_tterm_cd2.addAllListener(p);
		p.columnRslt_tterm_cd2.setListListener(p);
		p.columnRslt_tterm_nm2.addAllListener(p);
		p.columnRslt_tterm_nm2.setListListener(p);
		p.columnRslt_tterm_rmrks2.addAllListener(p);
		p.columnRslt_tterm_rmrks2.setListListener(p);
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_tterm_nm3.addAllListener(p);
		p.columnRslt_tterm_nm3.setListListener(p);
		p.columnRslt_tterm_rmrks3.addAllListener(p);
		p.columnRslt_tterm_rmrks3.setListListener(p);
		p.columnRslt_purc_ret_print_rmrks.addAllListener(p);
		p.columnRslt_purc_ret_print_rmrks.setListListener(p);
		p.columnRslt_purc_ret_print_d_rmrks.addAllListener(p);
		p.columnRslt_purc_ret_print_d_rmrks.setListListener(p);
		p.columnRslt_schd_trd_rmrks.addAllListener(p);
		p.columnRslt_schd_trd_rmrks.setListListener(p);
		p.columnRslt_schd_trd_d_rmrks.addAllListener(p);
		p.columnRslt_schd_trd_d_rmrks.setListListener(p);
		p.columnRslt_schd_intr_rmrks.addAllListener(p);
		p.columnRslt_schd_intr_rmrks.setListListener(p);
		p.columnRslt_schd_intr_d_rmrks.addAllListener(p);
		p.columnRslt_schd_intr_d_rmrks.setListListener(p);
		p.columnRslt_act_trd_rmrks.addAllListener(p);
		p.columnRslt_act_trd_rmrks.setListListener(p);
		p.columnRslt_act_trd_d_rmrks.addAllListener(p);
		p.columnRslt_act_trd_d_rmrks.setListListener(p);
		p.columnRslt_act_intr_rmrks.addAllListener(p);
		p.columnRslt_act_intr_rmrks.setListListener(p);
		p.columnRslt_act_intr_d_rmrks.addAllListener(p);
		p.columnRslt_act_intr_d_rmrks.setListListener(p);
		p.columnRslt_purc_act_no.addAllListener(p);
		p.columnRslt_purc_act_no.setListListener(p);
		p.columnRslt_purc_act_d_no.addAllListener(p);
		p.columnRslt_purc_act_d_no.setListListener(p);
		p.columnRslt_purc_ret_act_no.addAllListener(p);
		p.columnRslt_purc_ret_act_no.setListListener(p);
		p.columnRslt_purc_ret_act_rev.addAllListener(p);
		p.columnRslt_purc_ret_act_rev.setListListener(p);
		p.columnRslt_purc_ret_act_d_no.addAllListener(p);
		p.columnRslt_purc_ret_act_d_no.setListListener(p);
		p.columnRslt_purc_ret_act_io_no.addAllListener(p);
		p.columnRslt_purc_ret_act_io_no.setListListener(p);
		p.columnRslt_purc_ret_schd_no.addAllListener(p);
		p.columnRslt_purc_ret_schd_no.setListListener(p);
		p.columnRslt_purc_ret_schd_d_no.addAllListener(p);
		p.columnRslt_purc_ret_schd_d_no.setListListener(p);
		p.columnRslt_purc_ret_schd_io_no.addAllListener(p);
		p.columnRslt_purc_ret_schd_io_no.setListListener(p);
		p.columnRslt_ref_purc_act_no.addAllListener(p);
		p.columnRslt_ref_purc_act_no.setListListener(p);
		p.columnRslt_ref_purc_act_d_no.addAllListener(p);
		p.columnRslt_ref_purc_act_d_no.setListListener(p);
		p.columnRslt_base_purc_ac_dt.addAllListener(p);
		p.columnRslt_base_purc_ac_dt.setListListener(p);
		p.columnRslt_schd_sub_char1.addAllListener(p);
		p.columnRslt_schd_sub_char1.setListListener(p);
		p.columnRslt_schd_sub_char2.addAllListener(p);
		p.columnRslt_schd_sub_char2.setListListener(p);
		p.columnRslt_schd_sub_char3.addAllListener(p);
		p.columnRslt_schd_sub_char3.setListListener(p);
		p.columnRslt_schd_d_sub_char1.addAllListener(p);
		p.columnRslt_schd_d_sub_char1.setListListener(p);
		p.columnRslt_schd_d_sub_char2.addAllListener(p);
		p.columnRslt_schd_d_sub_char2.setListListener(p);
		p.columnRslt_schd_d_sub_char3.addAllListener(p);
		p.columnRslt_schd_d_sub_char3.setListListener(p);
		p.columnRslt_schd_io_sub_char1.addAllListener(p);
		p.columnRslt_schd_io_sub_char1.setListListener(p);
		p.columnRslt_schd_io_sub_char2.addAllListener(p);
		p.columnRslt_schd_io_sub_char2.setListListener(p);
		p.columnRslt_schd_io_sub_char3.addAllListener(p);
		p.columnRslt_schd_io_sub_char3.setListListener(p);
		p.columnRslt_act_sub_char1.addAllListener(p);
		p.columnRslt_act_sub_char1.setListListener(p);
		p.columnRslt_act_sub_char2.addAllListener(p);
		p.columnRslt_act_sub_char2.setListListener(p);
		p.columnRslt_act_sub_char3.addAllListener(p);
		p.columnRslt_act_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBDP_PurcRetSrch p) {
		p.Btn_open_MSBDP0150.addAllListener(p);
		p.Btn_open_MSBDP0150.setAPMethodName("doBtn_open_MSBDP0150");
		p.Btn_open_MSBDP0160.addAllListener(p);
		p.Btn_open_MSBDP0160.setAPMethodName("doBtn_open_MSBDP0160");
		p.Btn_open_MSBDP0180.addAllListener(p);
		p.Btn_open_MSBDP0180.setAPMethodName("doBtn_open_MSBDP0180");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_transt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_transt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_sret_schd_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_transt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_all_transt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_issue_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_LST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__LST_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__SCHD__LST_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD_LST, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_SCHD_LST, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_transt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_all_transt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_issue_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__DTL_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_purc_typ.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__SCHD__DTL_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_SCHD_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SCHD_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SCHD_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SCHD__HDR_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SCHD_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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
	protected static void statusInitSRCH__SCHD__HDR_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SCHD_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_SCHD_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_LST, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_LST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__LST_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__ACT__LST_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT_LST, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_ACT_LST, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__DTL_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_purc_typ.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH__ACT__DTL_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_ACT_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_RPnl(MSBDP_PurcRetSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_ACT_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ACT__HDR_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, SRCH_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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
	protected static void statusInitSRCH__ACT__HDR_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_ACT_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_ACT_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_part_transt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_all_transt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_sret_abort_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_not_issue_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_LST, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__LST_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_LST, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitREF__SCHD__LST_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD_LST, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SCHD_LST, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_part_transt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_all_transt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_sret_abort_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_not_issue_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_DTL, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_act_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.ENABLE);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__DTL_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_purc_typ.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_DTL, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitREF__SCHD__DTL_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SCHD_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_issue_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_SCHD_HDR, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_dt_fr.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.ENABLE);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_SCHD_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD__HDR_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_dt.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_xrate_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_SCHD_HDR, MCMode.INVISIBLE);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_SCHD_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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
	protected static void statusInitREF__SCHD__HDR_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SCHD_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_LST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_LST, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_LST, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_LST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_LST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__LST_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_LST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitREF__ACT__LST_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT_LST, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_ACT_LST, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_DTL, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_itm_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_DTL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__DTL_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_purc_typ.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_typ_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_bd_lot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_sublot_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_loc_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_cd.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_oper_nm.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_iv_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_slo_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_bd_po_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_DTL, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
	protected static void statusInitREF__ACT__DTL_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_ACT_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ScreenOpe(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_SrchMode(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Top(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Fold(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab1(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Trnst]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Trnst(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ProcTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ProcTyp(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Iv]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Iv(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab2(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Tab3(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[SpplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_SpplCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_ItmCnd(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Cnd(MSBDP_PurcRetSrch p){
		p.Cnd_ope_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_not_transt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_part_transt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_all_transt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sret_abort_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_not_issue_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_issue_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_trgt_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_ACT_HDR, MCMode.REQUIRED);
		p.Cnd_purc_ret_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_schd_dt_fr.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_dt_to.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ret_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_loc_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sublot_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_itm_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_iv_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_gd_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_wg_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_schd_no.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_schd_d_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_print_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_intr_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_intr_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_schd_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_sub_char1.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char2.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_sub_char3.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_act_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_act_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_ret_dscnt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_ACT_HDR, MCMode.ENABLE);
		p.Cnd_sppl_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Ctrl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_RPnl(MSBDP_PurcRetSrch p){

	}

	/**
	 * [REF_ACT_HDR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT__HDR_Rslt(MSBDP_PurcRetSrch p){
		p.columnRslt_check.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sret_schd_sts_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sret_schd_sts_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ret_sppl_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_sppl_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_sppl_cntct_psn_title.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ref_rcpt_iv_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.columnItm_itm_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sundry_itm_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_loc_wg_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_loc_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sublot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ver_no_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Rslt_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_maker_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_print_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_trd_qty_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_qty_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ret_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_abort_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnRslt_interim_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_dscnt_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_dscnt_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_tax_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_pay_crryovr_times.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ptax_dt.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_ptax_xrate_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_wtax_rate.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_purc_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_mfg_inst_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_gd_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ret_rsn_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_dpt_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_itm_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_bd_lot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_bd_sno_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_loc_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_ctg_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_cd.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_oper_nm.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_iv_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_slo_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_bd_po_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.Rslt_purc_cont_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Rslt_purc_cont_fctr_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.columnRslt_tterm_cd1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_print_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_intr_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_trd_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_trd_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_intr_rmrks.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_intr_d_rmrks.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_rev.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_act_io_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_no.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_purc_ret_schd_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_purc_ret_schd_io_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_ref_purc_act_d_no.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_base_purc_ac_dt.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_schd_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_sub_char1.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char2.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_sub_char3.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.columnRslt_act_d_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_d_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char1.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char2.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_act_io_sub_char3.putMode(p, REF_ACT_HDR, MCMode.INVISIBLE);
		p.columnRslt_can_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);
		p.Rslt_sppl_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ACT_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.INVISIBLE);
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
	protected static void statusInitREF__ACT__HDR_Btn(MSBDP_PurcRetSrch p){
		p.Btn_open_MSBDP0150.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0160.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_open_MSBDP0180.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_ACT_HDR, MCMode.READ_ONLY);

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
		MSBDP_PurcRetSrch_MC.setTableConfigRslt((MSBDP_PurcRetSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBDP_PurcRetSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_sret_schd_sts_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sret_schd_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_schd_sts_typ);
		p.columnRslt_sret_schd_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sret_schd_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sret_schd_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_ret_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ret_sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_sppl_nm);
		p.RsltTable.addTable(p.Rslt_ret_sppl_addr_p_PPanel.AddrTable);
		p.columnRslt_ret_sppl_cntct_psn_title.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ret_sppl_cntct_psn_title_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_sppl_cntct_psn_title);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_ref_rcpt_iv_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ref_rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_rcpt_iv_no);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_purc_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_cd);
		p.columnRslt_purc_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_ver_flg, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_ver_flg, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_ver_flg, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_ver_flg);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_cd);
		p.columnRslt_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.loc_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_wg_nm);
		p.columnRslt_purc_ret_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_loc_cd);
		p.columnRslt_purc_ret_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_str_ln_cd_none_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd_none_flg);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sppl_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_cd);
		p.columnRslt_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.sppl_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_nm);
		p.columnRslt_purc_id_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ);
		p.columnRslt_purc_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ_nm);
		p.columnRslt_purc_ret_print_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_print_dt_META);
		p.columnRslt_purc_ret_print_dt.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_print_dt);
		p.columnRslt_purc_ret_print_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_print_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_print_flg);
		p.columnRslt_purc_ret_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_dt_META);
		p.columnRslt_purc_ret_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_dt);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_dt_META);
		p.columnRslt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_dt);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_qty_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_qty_dec_place);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_qty_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_qty_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_qty_dec_place);
		p.RsltTable.addTable(p.Rslt_ret_qty_p_PPanel.QtyTable);
		p.columnRslt_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.abort_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_abort_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_inc_tax_cur_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.pay_crryovr_times_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_crryovr_times);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.columnRslt_trd_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.trd_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_upri_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_inc_tax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_amt_dec_place);
		p.columnRslt_base_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_upri_dec_place);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_amt_dec_place);
		p.columnRslt_ptax_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_upri_dec_place);
		p.columnRslt_ptax_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_dt_META);
		p.columnRslt_ptax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_dt);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.RsltTable.addTable(p.Rslt_ptax_xrate_p_PPanel.XrateTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_purc_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_typ);
		p.columnRslt_purc_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_typ_nm);
		p.columnRslt_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_inst_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_ret_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ret_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_rsn_cd);
		p.columnRslt_ret_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ret_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ret_rsn_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_bd_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_cd);
		p.columnRslt_bd_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_dpt_nm);
		p.RsltTable.addTable(p.Rslt_bd_itm_p_PPanel.ItmTable);
		p.columnRslt_bd_lot_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_lot_no);
		p.columnRslt_bd_sublot_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sublot_no);
		p.RsltTable.addTable(p.Rslt_bd_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_bd_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_loc_cd);
		p.columnRslt_bd_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_loc_nm);
		p.columnRslt_bd_ctg_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_ctg_cd);
		p.columnRslt_bd_ctg_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_ctg_nm);
		p.columnRslt_bd_oper_cd.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_oper_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_oper_cd);
		p.columnRslt_bd_oper_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_oper_nm);
		p.columnRslt_bd_iv_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_iv_no);
		p.columnRslt_bd_slo_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_slo_no);
		p.columnRslt_bd_po_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.bd_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_po_no);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.RsltTable.addTable(p.Rslt_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.RsltTable.addTable(p.Rslt_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_nm1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm1);
		p.columnRslt_tterm_rmrks1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_nm2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm2);
		p.columnRslt_tterm_rmrks2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks2);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_tterm_nm3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm3);
		p.columnRslt_tterm_rmrks3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks3);
		p.columnRslt_purc_ret_print_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_print_rmrks);
		p.columnRslt_purc_ret_print_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_print_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_print_d_rmrks);
		p.columnRslt_schd_trd_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_trd_rmrks);
		p.columnRslt_schd_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_trd_d_rmrks);
		p.columnRslt_schd_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_intr_rmrks);
		p.columnRslt_schd_intr_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_intr_d_rmrks);
		p.columnRslt_act_trd_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_trd_rmrks);
		p.columnRslt_act_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_trd_d_rmrks);
		p.columnRslt_act_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_rmrks);
		p.columnRslt_act_intr_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_intr_d_rmrks);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.columnRslt_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_d_no);
		p.columnRslt_purc_ret_act_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_no);
		p.columnRslt_purc_ret_act_rev.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_rev);
		p.columnRslt_purc_ret_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_d_no);
		p.columnRslt_purc_ret_act_io_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_act_io_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_act_io_no);
		p.columnRslt_purc_ret_schd_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_schd_no);
		p.columnRslt_purc_ret_schd_d_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_schd_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_schd_d_no);
		p.columnRslt_purc_ret_schd_io_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.purc_ret_schd_io_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ret_schd_io_no);
		p.columnRslt_ref_purc_act_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ref_purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_purc_act_no);
		p.columnRslt_ref_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ref_purc_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ref_purc_act_d_no);
		p.columnRslt_base_purc_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.base_purc_ac_dt_META);
		p.columnRslt_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_purc_ac_dt);
		p.columnRslt_schd_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char1);
		p.columnRslt_schd_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char2);
		p.columnRslt_schd_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_sub_char3);
		p.columnRslt_schd_d_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char1);
		p.columnRslt_schd_d_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char2);
		p.columnRslt_schd_d_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_d_sub_char3);
		p.columnRslt_schd_io_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_io_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_io_sub_char1);
		p.columnRslt_schd_io_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_io_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_io_sub_char2);
		p.columnRslt_schd_io_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.schd_io_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_io_sub_char3);
		p.columnRslt_act_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char1);
		p.columnRslt_act_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char2);
		p.columnRslt_act_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_sub_char3);
		p.columnRslt_act_d_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_d_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char1);
		p.columnRslt_act_d_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_d_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char2);
		p.columnRslt_act_d_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_d_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_sub_char3);
		p.columnRslt_act_io_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_io_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char1);
		p.columnRslt_act_io_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_io_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char2);
		p.columnRslt_act_io_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.act_io_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_io_sub_char3);
		p.columnRslt_can_flg.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.RsltTable.addTable(p.Rslt_sppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0170.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_wg_cd.getListConfig().setPutter(getCnd_loc_wg_cd_ListPutter());
		Cnd_purc_ret_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_ret_loc_cd.getListConfig().setPutter(getCnd_purc_ret_loc_cd_ListPutter());
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
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_purc_dpt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_dpt_wg_cd.getListConfig().setPutter(getCnd_purc_dpt_wg_cd_ListPutter());
		Cnd_purc_usr_cd.getListConfig().setPutter(getCnd_purc_usr_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRNTStatus() {
		status = SRCH_PRNT;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
		setAllStatus(status);
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
		if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
		else if (SRCH_SCHD_LST.equals(status)) {
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
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * [Cnd_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_ret_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_ret_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_dpt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_dpt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_loc_wg_cd) return getCnd_loc_wg_cd(row, info);
		if(combo == Cnd_purc_ret_loc_cd) return getCnd_purc_ret_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_purc_dpt_wg_cd) return getCnd_purc_dpt_wg_cd(row, info);
		if(combo == Cnd_purc_usr_cd) return getCnd_purc_usr_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
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
		else if (ap == Btn_open_MSBDP0150) doBtn_open_MSBDP0150(info);
		else if (ap == Btn_open_MSBDP0160) doBtn_open_MSBDP0160(info);
		else if (ap == Btn_open_MSBDP0180) doBtn_open_MSBDP0180(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
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
	 * [Btn]パネルの[open_MSBDP0150]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0150(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0160(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0180]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0180(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == Cnd_mode_Group) return doCnd_mode_VC(info);
		if (vc == Cnd_not_transt_flg) return doCnd_not_transt_flg_VC(info);
		if (vc == Cnd_part_transt_flg) return doCnd_part_transt_flg_VC(info);
		if (vc == Cnd_all_transt_flg) return doCnd_all_transt_flg_VC(info);
		if (vc == Cnd_sret_abort_flg) return doCnd_sret_abort_flg_VC(info);
		if (vc == Cnd_not_issue_flg) return doCnd_not_issue_flg_VC(info);
		if (vc == Cnd_issue_flg) return doCnd_issue_flg_VC(info);
		if (vc == Cnd_iv_trgt_flg) return doCnd_iv_trgt_flg_VC(info);
		if (vc == Cnd_iv_not_trgt_flg) return doCnd_iv_not_trgt_flg_VC(info);
		if (vc == Cnd_purc_ret_dt_fr) return doCnd_purc_ret_dt_fr_VC(info);
		if (vc == Cnd_purc_ret_dt_to) return doCnd_purc_ret_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_schd_dt_fr) return doCnd_schd_dt_fr_VC(info);
		if (vc == Cnd_schd_dt_to) return doCnd_schd_dt_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_ret_sppl_nm) return doCnd_ret_sppl_nm_VC(info);
		if (vc == Cnd_loc_wg_cd) return doCnd_loc_wg_cd_VC(info);
		if (vc == Cnd_loc_wg_nm) return doCnd_loc_wg_nm_VC(info);
		if (vc == Cnd_purc_ret_loc_cd) return doCnd_purc_ret_loc_cd_VC(info);
		if (vc == Cnd_purc_ret_loc_nm) return doCnd_purc_ret_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_iv_itm_nm) return doCnd_iv_itm_nm_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_purc_dpt_wg_cd) return doCnd_purc_dpt_wg_cd_VC(info);
		if (vc == Cnd_purc_dpt_wg_nm) return doCnd_purc_dpt_wg_nm_VC(info);
		if (vc == Cnd_purc_usr_cd) return doCnd_purc_usr_cd_VC(info);
		if (vc == Cnd_purc_usr_nm) return doCnd_purc_usr_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_purc_ret_act_no) return doCnd_purc_ret_act_no_VC(info);
		if (vc == Cnd_purc_ret_act_d_no) return doCnd_purc_ret_act_d_no_VC(info);
		if (vc == Cnd_purc_ret_schd_no) return doCnd_purc_ret_schd_no_VC(info);
		if (vc == Cnd_purc_ret_schd_d_no) return doCnd_purc_ret_schd_d_no_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_purc_ret_print_rmrks) return doCnd_purc_ret_print_rmrks_VC(info);
		if (vc == Cnd_purc_ret_print_d_rmrks) return doCnd_purc_ret_print_d_rmrks_VC(info);
		if (vc == Cnd_schd_trd_rmrks) return doCnd_schd_trd_rmrks_VC(info);
		if (vc == Cnd_schd_trd_d_rmrks) return doCnd_schd_trd_d_rmrks_VC(info);
		if (vc == Cnd_schd_intr_rmrks) return doCnd_schd_intr_rmrks_VC(info);
		if (vc == Cnd_schd_intr_d_rmrks) return doCnd_schd_intr_d_rmrks_VC(info);
		if (vc == Cnd_act_trd_rmrks) return doCnd_act_trd_rmrks_VC(info);
		if (vc == Cnd_act_trd_d_rmrks) return doCnd_act_trd_d_rmrks_VC(info);
		if (vc == Cnd_act_intr_rmrks) return doCnd_act_intr_rmrks_VC(info);
		if (vc == Cnd_act_intr_d_rmrks) return doCnd_act_intr_d_rmrks_VC(info);
		if (vc == Cnd_schd_sub_char1) return doCnd_schd_sub_char1_VC(info);
		if (vc == Cnd_schd_sub_char2) return doCnd_schd_sub_char2_VC(info);
		if (vc == Cnd_schd_sub_char3) return doCnd_schd_sub_char3_VC(info);
		if (vc == Cnd_schd_d_sub_char1) return doCnd_schd_d_sub_char1_VC(info);
		if (vc == Cnd_schd_d_sub_char2) return doCnd_schd_d_sub_char2_VC(info);
		if (vc == Cnd_schd_d_sub_char3) return doCnd_schd_d_sub_char3_VC(info);
		if (vc == Cnd_schd_io_sub_char1) return doCnd_schd_io_sub_char1_VC(info);
		if (vc == Cnd_schd_io_sub_char2) return doCnd_schd_io_sub_char2_VC(info);
		if (vc == Cnd_schd_io_sub_char3) return doCnd_schd_io_sub_char3_VC(info);
		if (vc == Cnd_act_sub_char1) return doCnd_act_sub_char1_VC(info);
		if (vc == Cnd_act_sub_char2) return doCnd_act_sub_char2_VC(info);
		if (vc == Cnd_act_sub_char3) return doCnd_act_sub_char3_VC(info);
		if (vc == Cnd_act_d_sub_char1) return doCnd_act_d_sub_char1_VC(info);
		if (vc == Cnd_act_d_sub_char2) return doCnd_act_d_sub_char2_VC(info);
		if (vc == Cnd_act_d_sub_char3) return doCnd_act_d_sub_char3_VC(info);
		if (vc == Cnd_act_io_sub_char1) return doCnd_act_io_sub_char1_VC(info);
		if (vc == Cnd_act_io_sub_char2) return doCnd_act_io_sub_char2_VC(info);
		if (vc == Cnd_act_io_sub_char3) return doCnd_act_io_sub_char3_VC(info);
		if (vc == Cnd_inc_ret_dscnt_flg) return doCnd_inc_ret_dscnt_flg_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_sret_schd_sts_typ) return doRslt_sret_schd_sts_typ_VC(info);
		if (vc == columnRslt_sret_schd_sts_typ_nm) return doRslt_sret_schd_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_ret_sppl_nm) return doRslt_ret_sppl_nm_VC(info);
		if (vc == columnRslt_ret_sppl_cntct_psn_title) return doRslt_ret_sppl_cntct_psn_title_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_ref_rcpt_iv_no) return doRslt_ref_rcpt_iv_no_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_purc_usr_cd) return doRslt_purc_usr_cd_VC(info);
		if (vc == columnRslt_purc_usr_nm) return doRslt_purc_usr_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_loc_wg_cd) return doRslt_loc_wg_cd_VC(info);
		if (vc == columnRslt_loc_wg_nm) return doRslt_loc_wg_nm_VC(info);
		if (vc == columnRslt_purc_ret_loc_cd) return doRslt_purc_ret_loc_cd_VC(info);
		if (vc == columnRslt_purc_ret_loc_nm) return doRslt_purc_ret_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_str_ln_cd_none_flg) return doRslt_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_sppl_itm_cd) return doRslt_sppl_itm_cd_VC(info);
		if (vc == columnRslt_sppl_itm_nm) return doRslt_sppl_itm_nm_VC(info);
		if (vc == columnRslt_purc_id_typ) return doRslt_purc_id_typ_VC(info);
		if (vc == columnRslt_purc_id_typ_nm) return doRslt_purc_id_typ_nm_VC(info);
		if (vc == columnRslt_purc_ret_print_dt) return doRslt_purc_ret_print_dt_VC(info);
		if (vc == columnRslt_purc_ret_print_flg) return doRslt_purc_ret_print_flg_VC(info);
		if (vc == columnRslt_purc_ret_dt) return doRslt_purc_ret_dt_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_schd_dt) return doRslt_schd_dt_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_qty_dec_place) return doRslt_trd_qty_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_qty_dec_place) return doRslt_base_qty_dec_place_VC(info);
		if (vc == columnRslt_abort_flg) return doRslt_abort_flg_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_pay_crryovr_times) return doRslt_pay_crryovr_times_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_upri_dec_place) return doRslt_trd_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_amt_dec_place) return doRslt_base_amt_dec_place_VC(info);
		if (vc == columnRslt_base_upri_dec_place) return doRslt_base_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_amt_dec_place) return doRslt_ptax_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_upri_dec_place) return doRslt_ptax_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_dt) return doRslt_ptax_dt_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_purc_typ) return doRslt_purc_typ_VC(info);
		if (vc == columnRslt_purc_typ_nm) return doRslt_purc_typ_nm_VC(info);
		if (vc == columnRslt_mfg_inst_no) return doRslt_mfg_inst_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_ret_rsn_cd) return doRslt_ret_rsn_cd_VC(info);
		if (vc == columnRslt_ret_rsn_nm) return doRslt_ret_rsn_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_bd_dpt_cd) return doRslt_bd_dpt_cd_VC(info);
		if (vc == columnRslt_bd_dpt_nm) return doRslt_bd_dpt_nm_VC(info);
		if (vc == columnRslt_bd_lot_no) return doRslt_bd_lot_no_VC(info);
		if (vc == columnRslt_bd_sublot_no) return doRslt_bd_sublot_no_VC(info);
		if (vc == columnRslt_bd_loc_cd) return doRslt_bd_loc_cd_VC(info);
		if (vc == columnRslt_bd_loc_nm) return doRslt_bd_loc_nm_VC(info);
		if (vc == columnRslt_bd_ctg_cd) return doRslt_bd_ctg_cd_VC(info);
		if (vc == columnRslt_bd_ctg_nm) return doRslt_bd_ctg_nm_VC(info);
		if (vc == columnRslt_bd_oper_cd) return doRslt_bd_oper_cd_VC(info);
		if (vc == columnRslt_bd_oper_nm) return doRslt_bd_oper_nm_VC(info);
		if (vc == columnRslt_bd_iv_no) return doRslt_bd_iv_no_VC(info);
		if (vc == columnRslt_bd_slo_no) return doRslt_bd_slo_no_VC(info);
		if (vc == columnRslt_bd_po_no) return doRslt_bd_po_no_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_nm1) return doRslt_tterm_nm1_VC(info);
		if (vc == columnRslt_tterm_rmrks1) return doRslt_tterm_rmrks1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_nm2) return doRslt_tterm_nm2_VC(info);
		if (vc == columnRslt_tterm_rmrks2) return doRslt_tterm_rmrks2_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_tterm_nm3) return doRslt_tterm_nm3_VC(info);
		if (vc == columnRslt_tterm_rmrks3) return doRslt_tterm_rmrks3_VC(info);
		if (vc == columnRslt_purc_ret_print_rmrks) return doRslt_purc_ret_print_rmrks_VC(info);
		if (vc == columnRslt_purc_ret_print_d_rmrks) return doRslt_purc_ret_print_d_rmrks_VC(info);
		if (vc == columnRslt_schd_trd_rmrks) return doRslt_schd_trd_rmrks_VC(info);
		if (vc == columnRslt_schd_trd_d_rmrks) return doRslt_schd_trd_d_rmrks_VC(info);
		if (vc == columnRslt_schd_intr_rmrks) return doRslt_schd_intr_rmrks_VC(info);
		if (vc == columnRslt_schd_intr_d_rmrks) return doRslt_schd_intr_d_rmrks_VC(info);
		if (vc == columnRslt_act_trd_rmrks) return doRslt_act_trd_rmrks_VC(info);
		if (vc == columnRslt_act_trd_d_rmrks) return doRslt_act_trd_d_rmrks_VC(info);
		if (vc == columnRslt_act_intr_rmrks) return doRslt_act_intr_rmrks_VC(info);
		if (vc == columnRslt_act_intr_d_rmrks) return doRslt_act_intr_d_rmrks_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_purc_act_d_no) return doRslt_purc_act_d_no_VC(info);
		if (vc == columnRslt_purc_ret_act_no) return doRslt_purc_ret_act_no_VC(info);
		if (vc == columnRslt_purc_ret_act_rev) return doRslt_purc_ret_act_rev_VC(info);
		if (vc == columnRslt_purc_ret_act_d_no) return doRslt_purc_ret_act_d_no_VC(info);
		if (vc == columnRslt_purc_ret_act_io_no) return doRslt_purc_ret_act_io_no_VC(info);
		if (vc == columnRslt_purc_ret_schd_no) return doRslt_purc_ret_schd_no_VC(info);
		if (vc == columnRslt_purc_ret_schd_d_no) return doRslt_purc_ret_schd_d_no_VC(info);
		if (vc == columnRslt_purc_ret_schd_io_no) return doRslt_purc_ret_schd_io_no_VC(info);
		if (vc == columnRslt_ref_purc_act_no) return doRslt_ref_purc_act_no_VC(info);
		if (vc == columnRslt_ref_purc_act_d_no) return doRslt_ref_purc_act_d_no_VC(info);
		if (vc == columnRslt_base_purc_ac_dt) return doRslt_base_purc_ac_dt_VC(info);
		if (vc == columnRslt_schd_sub_char1) return doRslt_schd_sub_char1_VC(info);
		if (vc == columnRslt_schd_sub_char2) return doRslt_schd_sub_char2_VC(info);
		if (vc == columnRslt_schd_sub_char3) return doRslt_schd_sub_char3_VC(info);
		if (vc == columnRslt_schd_d_sub_char1) return doRslt_schd_d_sub_char1_VC(info);
		if (vc == columnRslt_schd_d_sub_char2) return doRslt_schd_d_sub_char2_VC(info);
		if (vc == columnRslt_schd_d_sub_char3) return doRslt_schd_d_sub_char3_VC(info);
		if (vc == columnRslt_schd_io_sub_char1) return doRslt_schd_io_sub_char1_VC(info);
		if (vc == columnRslt_schd_io_sub_char2) return doRslt_schd_io_sub_char2_VC(info);
		if (vc == columnRslt_schd_io_sub_char3) return doRslt_schd_io_sub_char3_VC(info);
		if (vc == columnRslt_act_sub_char1) return doRslt_act_sub_char1_VC(info);
		if (vc == columnRslt_act_sub_char2) return doRslt_act_sub_char2_VC(info);
		if (vc == columnRslt_act_sub_char3) return doRslt_act_sub_char3_VC(info);
		if (vc == columnRslt_act_d_sub_char1) return doRslt_act_d_sub_char1_VC(info);
		if (vc == columnRslt_act_d_sub_char2) return doRslt_act_d_sub_char2_VC(info);
		if (vc == columnRslt_act_d_sub_char3) return doRslt_act_d_sub_char3_VC(info);
		if (vc == columnRslt_act_io_sub_char1) return doRslt_act_io_sub_char1_VC(info);
		if (vc == columnRslt_act_io_sub_char2) return doRslt_act_io_sub_char2_VC(info);
		if (vc == columnRslt_act_io_sub_char3) return doRslt_act_io_sub_char3_VC(info);
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
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_transt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_transt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_transt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_transt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[all_transt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_all_transt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sret_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sret_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_issue_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_issue_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_sppl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_loc_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_itm_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_ret_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_ret_print_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_trd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[act_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_io_sub_char3_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_ret_dscnt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_past_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_past_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ret_sppl_cntct_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ret_sppl_cntct_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_print_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_print_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_repurc_obli_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bd_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_po_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_print_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_trd_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[act_intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_act_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ret_schd_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ref_purc_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_io_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_io_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_io_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_io_sub_char3_VC(MCEventInfo info){
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
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_not_transt_flg) doCnd_not_transt_flg_NC(info);
		else if (nc == Cnd_part_transt_flg) doCnd_part_transt_flg_NC(info);
		else if (nc == Cnd_all_transt_flg) doCnd_all_transt_flg_NC(info);
		else if (nc == Cnd_sret_abort_flg) doCnd_sret_abort_flg_NC(info);
		else if (nc == Cnd_not_issue_flg) doCnd_not_issue_flg_NC(info);
		else if (nc == Cnd_issue_flg) doCnd_issue_flg_NC(info);
		else if (nc == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NC(info);
		else if (nc == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NC(info);
		else if (nc == Cnd_purc_ret_dt_fr) doCnd_purc_ret_dt_fr_NC(info);
		else if (nc == Cnd_purc_ret_dt_to) doCnd_purc_ret_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NC(info);
		else if (nc == Cnd_schd_dt_to) doCnd_schd_dt_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_ret_sppl_nm) doCnd_ret_sppl_nm_NC(info);
		else if (nc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NC(info);
		else if (nc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NC(info);
		else if (nc == Cnd_purc_ret_loc_cd) doCnd_purc_ret_loc_cd_NC(info);
		else if (nc == Cnd_purc_ret_loc_nm) doCnd_purc_ret_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_purc_dpt_wg_cd) doCnd_purc_dpt_wg_cd_NC(info);
		else if (nc == Cnd_purc_dpt_wg_nm) doCnd_purc_dpt_wg_nm_NC(info);
		else if (nc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NC(info);
		else if (nc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NC(info);
		else if (nc == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NC(info);
		else if (nc == Cnd_purc_ret_schd_no) doCnd_purc_ret_schd_no_NC(info);
		else if (nc == Cnd_purc_ret_schd_d_no) doCnd_purc_ret_schd_d_no_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_purc_ret_print_rmrks) doCnd_purc_ret_print_rmrks_NC(info);
		else if (nc == Cnd_purc_ret_print_d_rmrks) doCnd_purc_ret_print_d_rmrks_NC(info);
		else if (nc == Cnd_schd_trd_rmrks) doCnd_schd_trd_rmrks_NC(info);
		else if (nc == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NC(info);
		else if (nc == Cnd_schd_intr_d_rmrks) doCnd_schd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NC(info);
		else if (nc == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NC(info);
		else if (nc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NC(info);
		else if (nc == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NC(info);
		else if (nc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NC(info);
		else if (nc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NC(info);
		else if (nc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NC(info);
		else if (nc == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NC(info);
		else if (nc == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NC(info);
		else if (nc == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NC(info);
		else if (nc == Cnd_schd_io_sub_char1) doCnd_schd_io_sub_char1_NC(info);
		else if (nc == Cnd_schd_io_sub_char2) doCnd_schd_io_sub_char2_NC(info);
		else if (nc == Cnd_schd_io_sub_char3) doCnd_schd_io_sub_char3_NC(info);
		else if (nc == Cnd_act_sub_char1) doCnd_act_sub_char1_NC(info);
		else if (nc == Cnd_act_sub_char2) doCnd_act_sub_char2_NC(info);
		else if (nc == Cnd_act_sub_char3) doCnd_act_sub_char3_NC(info);
		else if (nc == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NC(info);
		else if (nc == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NC(info);
		else if (nc == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NC(info);
		else if (nc == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NC(info);
		else if (nc == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NC(info);
		else if (nc == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NC(info);
		else if (nc == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NC(info);
		else if (nc == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_ret_sppl_nm) doRslt_ret_sppl_nm_NC(info);
		else if (nc == columnRslt_ret_sppl_cntct_psn_title) doRslt_ret_sppl_cntct_psn_title_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_ref_rcpt_iv_no) doRslt_ref_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NC(info);
		else if (nc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NC(info);
		else if (nc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NC(info);
		else if (nc == columnRslt_purc_ret_loc_cd) doRslt_purc_ret_loc_cd_NC(info);
		else if (nc == columnRslt_purc_ret_loc_nm) doRslt_purc_ret_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NC(info);
		else if (nc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NC(info);
		else if (nc == columnRslt_purc_id_typ) doRslt_purc_id_typ_NC(info);
		else if (nc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NC(info);
		else if (nc == columnRslt_purc_ret_print_dt) doRslt_purc_ret_print_dt_NC(info);
		else if (nc == columnRslt_purc_ret_print_flg) doRslt_purc_ret_print_flg_NC(info);
		else if (nc == columnRslt_purc_ret_dt) doRslt_purc_ret_dt_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_schd_dt) doRslt_schd_dt_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NC(info);
		else if (nc == columnRslt_abort_flg) doRslt_abort_flg_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_dt) doRslt_ptax_dt_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_purc_typ) doRslt_purc_typ_NC(info);
		else if (nc == columnRslt_purc_typ_nm) doRslt_purc_typ_nm_NC(info);
		else if (nc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NC(info);
		else if (nc == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NC(info);
		else if (nc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_lot_no) doRslt_bd_lot_no_NC(info);
		else if (nc == columnRslt_bd_sublot_no) doRslt_bd_sublot_no_NC(info);
		else if (nc == columnRslt_bd_loc_cd) doRslt_bd_loc_cd_NC(info);
		else if (nc == columnRslt_bd_loc_nm) doRslt_bd_loc_nm_NC(info);
		else if (nc == columnRslt_bd_ctg_cd) doRslt_bd_ctg_cd_NC(info);
		else if (nc == columnRslt_bd_ctg_nm) doRslt_bd_ctg_nm_NC(info);
		else if (nc == columnRslt_bd_oper_cd) doRslt_bd_oper_cd_NC(info);
		else if (nc == columnRslt_bd_oper_nm) doRslt_bd_oper_nm_NC(info);
		else if (nc == columnRslt_bd_iv_no) doRslt_bd_iv_no_NC(info);
		else if (nc == columnRslt_bd_slo_no) doRslt_bd_slo_no_NC(info);
		else if (nc == columnRslt_bd_po_no) doRslt_bd_po_no_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_nm1) doRslt_tterm_nm1_NC(info);
		else if (nc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_nm2) doRslt_tterm_nm2_NC(info);
		else if (nc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_tterm_nm3) doRslt_tterm_nm3_NC(info);
		else if (nc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_purc_ret_print_rmrks) doRslt_purc_ret_print_rmrks_NC(info);
		else if (nc == columnRslt_purc_ret_print_d_rmrks) doRslt_purc_ret_print_d_rmrks_NC(info);
		else if (nc == columnRslt_schd_trd_rmrks) doRslt_schd_trd_rmrks_NC(info);
		else if (nc == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NC(info);
		else if (nc == columnRslt_schd_intr_d_rmrks) doRslt_schd_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NC(info);
		else if (nc == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NC(info);
		else if (nc == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NC(info);
		else if (nc == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NC(info);
		else if (nc == columnRslt_purc_ret_act_rev) doRslt_purc_ret_act_rev_NC(info);
		else if (nc == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NC(info);
		else if (nc == columnRslt_purc_ret_act_io_no) doRslt_purc_ret_act_io_no_NC(info);
		else if (nc == columnRslt_purc_ret_schd_no) doRslt_purc_ret_schd_no_NC(info);
		else if (nc == columnRslt_purc_ret_schd_d_no) doRslt_purc_ret_schd_d_no_NC(info);
		else if (nc == columnRslt_purc_ret_schd_io_no) doRslt_purc_ret_schd_io_no_NC(info);
		else if (nc == columnRslt_ref_purc_act_no) doRslt_ref_purc_act_no_NC(info);
		else if (nc == columnRslt_ref_purc_act_d_no) doRslt_ref_purc_act_d_no_NC(info);
		else if (nc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NC(info);
		else if (nc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NC(info);
		else if (nc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NC(info);
		else if (nc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NC(info);
		else if (nc == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NC(info);
		else if (nc == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NC(info);
		else if (nc == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NC(info);
		else if (nc == columnRslt_schd_io_sub_char1) doRslt_schd_io_sub_char1_NC(info);
		else if (nc == columnRslt_schd_io_sub_char2) doRslt_schd_io_sub_char2_NC(info);
		else if (nc == columnRslt_schd_io_sub_char3) doRslt_schd_io_sub_char3_NC(info);
		else if (nc == columnRslt_act_sub_char1) doRslt_act_sub_char1_NC(info);
		else if (nc == columnRslt_act_sub_char2) doRslt_act_sub_char2_NC(info);
		else if (nc == columnRslt_act_sub_char3) doRslt_act_sub_char3_NC(info);
		else if (nc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NC(info);
		else if (nc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NC(info);
		else if (nc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NC(info);
		else if (nc == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NC(info);
		else if (nc == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NC(info);
		else if (nc == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NC(info);
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
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_transt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_transt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_transt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_transt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_transt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_transt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sret_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sret_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_issue_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_issue_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_sppl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char3_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_cntct_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_cntct_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bd_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_po_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_io_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char3_NC(MCEventInfo info){
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
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_not_transt_flg) doCnd_not_transt_flg_NE(info);
		else if (ne == Cnd_part_transt_flg) doCnd_part_transt_flg_NE(info);
		else if (ne == Cnd_all_transt_flg) doCnd_all_transt_flg_NE(info);
		else if (ne == Cnd_sret_abort_flg) doCnd_sret_abort_flg_NE(info);
		else if (ne == Cnd_not_issue_flg) doCnd_not_issue_flg_NE(info);
		else if (ne == Cnd_issue_flg) doCnd_issue_flg_NE(info);
		else if (ne == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NE(info);
		else if (ne == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NE(info);
		else if (ne == Cnd_purc_ret_dt_fr) doCnd_purc_ret_dt_fr_NE(info);
		else if (ne == Cnd_purc_ret_dt_to) doCnd_purc_ret_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NE(info);
		else if (ne == Cnd_schd_dt_to) doCnd_schd_dt_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_ret_sppl_nm) doCnd_ret_sppl_nm_NE(info);
		else if (ne == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NE(info);
		else if (ne == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NE(info);
		else if (ne == Cnd_purc_ret_loc_cd) doCnd_purc_ret_loc_cd_NE(info);
		else if (ne == Cnd_purc_ret_loc_nm) doCnd_purc_ret_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_purc_dpt_wg_cd) doCnd_purc_dpt_wg_cd_NE(info);
		else if (ne == Cnd_purc_dpt_wg_nm) doCnd_purc_dpt_wg_nm_NE(info);
		else if (ne == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NE(info);
		else if (ne == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NE(info);
		else if (ne == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NE(info);
		else if (ne == Cnd_purc_ret_schd_no) doCnd_purc_ret_schd_no_NE(info);
		else if (ne == Cnd_purc_ret_schd_d_no) doCnd_purc_ret_schd_d_no_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_purc_ret_print_rmrks) doCnd_purc_ret_print_rmrks_NE(info);
		else if (ne == Cnd_purc_ret_print_d_rmrks) doCnd_purc_ret_print_d_rmrks_NE(info);
		else if (ne == Cnd_schd_trd_rmrks) doCnd_schd_trd_rmrks_NE(info);
		else if (ne == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NE(info);
		else if (ne == Cnd_schd_intr_d_rmrks) doCnd_schd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NE(info);
		else if (ne == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NE(info);
		else if (ne == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NE(info);
		else if (ne == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NE(info);
		else if (ne == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NE(info);
		else if (ne == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NE(info);
		else if (ne == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NE(info);
		else if (ne == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NE(info);
		else if (ne == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NE(info);
		else if (ne == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NE(info);
		else if (ne == Cnd_schd_io_sub_char1) doCnd_schd_io_sub_char1_NE(info);
		else if (ne == Cnd_schd_io_sub_char2) doCnd_schd_io_sub_char2_NE(info);
		else if (ne == Cnd_schd_io_sub_char3) doCnd_schd_io_sub_char3_NE(info);
		else if (ne == Cnd_act_sub_char1) doCnd_act_sub_char1_NE(info);
		else if (ne == Cnd_act_sub_char2) doCnd_act_sub_char2_NE(info);
		else if (ne == Cnd_act_sub_char3) doCnd_act_sub_char3_NE(info);
		else if (ne == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NE(info);
		else if (ne == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NE(info);
		else if (ne == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NE(info);
		else if (ne == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NE(info);
		else if (ne == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NE(info);
		else if (ne == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NE(info);
		else if (ne == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NE(info);
		else if (ne == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_ret_sppl_nm) doRslt_ret_sppl_nm_NE(info);
		else if (ne == columnRslt_ret_sppl_cntct_psn_title) doRslt_ret_sppl_cntct_psn_title_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_ref_rcpt_iv_no) doRslt_ref_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NE(info);
		else if (ne == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NE(info);
		else if (ne == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NE(info);
		else if (ne == columnRslt_purc_ret_loc_cd) doRslt_purc_ret_loc_cd_NE(info);
		else if (ne == columnRslt_purc_ret_loc_nm) doRslt_purc_ret_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NE(info);
		else if (ne == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NE(info);
		else if (ne == columnRslt_purc_id_typ) doRslt_purc_id_typ_NE(info);
		else if (ne == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NE(info);
		else if (ne == columnRslt_purc_ret_print_dt) doRslt_purc_ret_print_dt_NE(info);
		else if (ne == columnRslt_purc_ret_print_flg) doRslt_purc_ret_print_flg_NE(info);
		else if (ne == columnRslt_purc_ret_dt) doRslt_purc_ret_dt_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_schd_dt) doRslt_schd_dt_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NE(info);
		else if (ne == columnRslt_abort_flg) doRslt_abort_flg_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_dt) doRslt_ptax_dt_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_purc_typ) doRslt_purc_typ_NE(info);
		else if (ne == columnRslt_purc_typ_nm) doRslt_purc_typ_nm_NE(info);
		else if (ne == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NE(info);
		else if (ne == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NE(info);
		else if (ne == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_lot_no) doRslt_bd_lot_no_NE(info);
		else if (ne == columnRslt_bd_sublot_no) doRslt_bd_sublot_no_NE(info);
		else if (ne == columnRslt_bd_loc_cd) doRslt_bd_loc_cd_NE(info);
		else if (ne == columnRslt_bd_loc_nm) doRslt_bd_loc_nm_NE(info);
		else if (ne == columnRslt_bd_ctg_cd) doRslt_bd_ctg_cd_NE(info);
		else if (ne == columnRslt_bd_ctg_nm) doRslt_bd_ctg_nm_NE(info);
		else if (ne == columnRslt_bd_oper_cd) doRslt_bd_oper_cd_NE(info);
		else if (ne == columnRslt_bd_oper_nm) doRslt_bd_oper_nm_NE(info);
		else if (ne == columnRslt_bd_iv_no) doRslt_bd_iv_no_NE(info);
		else if (ne == columnRslt_bd_slo_no) doRslt_bd_slo_no_NE(info);
		else if (ne == columnRslt_bd_po_no) doRslt_bd_po_no_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_nm1) doRslt_tterm_nm1_NE(info);
		else if (ne == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_nm2) doRslt_tterm_nm2_NE(info);
		else if (ne == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_tterm_nm3) doRslt_tterm_nm3_NE(info);
		else if (ne == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_purc_ret_print_rmrks) doRslt_purc_ret_print_rmrks_NE(info);
		else if (ne == columnRslt_purc_ret_print_d_rmrks) doRslt_purc_ret_print_d_rmrks_NE(info);
		else if (ne == columnRslt_schd_trd_rmrks) doRslt_schd_trd_rmrks_NE(info);
		else if (ne == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NE(info);
		else if (ne == columnRslt_schd_intr_d_rmrks) doRslt_schd_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NE(info);
		else if (ne == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NE(info);
		else if (ne == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NE(info);
		else if (ne == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NE(info);
		else if (ne == columnRslt_purc_ret_act_rev) doRslt_purc_ret_act_rev_NE(info);
		else if (ne == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NE(info);
		else if (ne == columnRslt_purc_ret_act_io_no) doRslt_purc_ret_act_io_no_NE(info);
		else if (ne == columnRslt_purc_ret_schd_no) doRslt_purc_ret_schd_no_NE(info);
		else if (ne == columnRslt_purc_ret_schd_d_no) doRslt_purc_ret_schd_d_no_NE(info);
		else if (ne == columnRslt_purc_ret_schd_io_no) doRslt_purc_ret_schd_io_no_NE(info);
		else if (ne == columnRslt_ref_purc_act_no) doRslt_ref_purc_act_no_NE(info);
		else if (ne == columnRslt_ref_purc_act_d_no) doRslt_ref_purc_act_d_no_NE(info);
		else if (ne == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NE(info);
		else if (ne == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NE(info);
		else if (ne == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NE(info);
		else if (ne == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NE(info);
		else if (ne == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NE(info);
		else if (ne == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NE(info);
		else if (ne == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NE(info);
		else if (ne == columnRslt_schd_io_sub_char1) doRslt_schd_io_sub_char1_NE(info);
		else if (ne == columnRslt_schd_io_sub_char2) doRslt_schd_io_sub_char2_NE(info);
		else if (ne == columnRslt_schd_io_sub_char3) doRslt_schd_io_sub_char3_NE(info);
		else if (ne == columnRslt_act_sub_char1) doRslt_act_sub_char1_NE(info);
		else if (ne == columnRslt_act_sub_char2) doRslt_act_sub_char2_NE(info);
		else if (ne == columnRslt_act_sub_char3) doRslt_act_sub_char3_NE(info);
		else if (ne == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NE(info);
		else if (ne == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NE(info);
		else if (ne == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NE(info);
		else if (ne == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NE(info);
		else if (ne == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NE(info);
		else if (ne == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NE(info);
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
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_transt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_transt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_transt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_transt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_transt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_transt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sret_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sret_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_issue_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_issue_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_sppl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char3_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_cntct_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_cntct_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bd_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_po_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_io_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char3_NE(MCEventInfo info){
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
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_not_transt_flg) doCnd_not_transt_flg_NX(info);
		else if (nx == Cnd_part_transt_flg) doCnd_part_transt_flg_NX(info);
		else if (nx == Cnd_all_transt_flg) doCnd_all_transt_flg_NX(info);
		else if (nx == Cnd_sret_abort_flg) doCnd_sret_abort_flg_NX(info);
		else if (nx == Cnd_not_issue_flg) doCnd_not_issue_flg_NX(info);
		else if (nx == Cnd_issue_flg) doCnd_issue_flg_NX(info);
		else if (nx == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NX(info);
		else if (nx == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NX(info);
		else if (nx == Cnd_purc_ret_dt_fr) doCnd_purc_ret_dt_fr_NX(info);
		else if (nx == Cnd_purc_ret_dt_to) doCnd_purc_ret_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NX(info);
		else if (nx == Cnd_schd_dt_to) doCnd_schd_dt_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_ret_sppl_nm) doCnd_ret_sppl_nm_NX(info);
		else if (nx == Cnd_loc_wg_cd) doCnd_loc_wg_cd_NX(info);
		else if (nx == Cnd_loc_wg_nm) doCnd_loc_wg_nm_NX(info);
		else if (nx == Cnd_purc_ret_loc_cd) doCnd_purc_ret_loc_cd_NX(info);
		else if (nx == Cnd_purc_ret_loc_nm) doCnd_purc_ret_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_iv_itm_nm) doCnd_iv_itm_nm_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_purc_dpt_wg_cd) doCnd_purc_dpt_wg_cd_NX(info);
		else if (nx == Cnd_purc_dpt_wg_nm) doCnd_purc_dpt_wg_nm_NX(info);
		else if (nx == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NX(info);
		else if (nx == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NX(info);
		else if (nx == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NX(info);
		else if (nx == Cnd_purc_ret_schd_no) doCnd_purc_ret_schd_no_NX(info);
		else if (nx == Cnd_purc_ret_schd_d_no) doCnd_purc_ret_schd_d_no_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_purc_ret_print_rmrks) doCnd_purc_ret_print_rmrks_NX(info);
		else if (nx == Cnd_purc_ret_print_d_rmrks) doCnd_purc_ret_print_d_rmrks_NX(info);
		else if (nx == Cnd_schd_trd_rmrks) doCnd_schd_trd_rmrks_NX(info);
		else if (nx == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_NX(info);
		else if (nx == Cnd_schd_intr_d_rmrks) doCnd_schd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_NX(info);
		else if (nx == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_NX(info);
		else if (nx == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_NX(info);
		else if (nx == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_NX(info);
		else if (nx == Cnd_schd_sub_char1) doCnd_schd_sub_char1_NX(info);
		else if (nx == Cnd_schd_sub_char2) doCnd_schd_sub_char2_NX(info);
		else if (nx == Cnd_schd_sub_char3) doCnd_schd_sub_char3_NX(info);
		else if (nx == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_NX(info);
		else if (nx == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_NX(info);
		else if (nx == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_NX(info);
		else if (nx == Cnd_schd_io_sub_char1) doCnd_schd_io_sub_char1_NX(info);
		else if (nx == Cnd_schd_io_sub_char2) doCnd_schd_io_sub_char2_NX(info);
		else if (nx == Cnd_schd_io_sub_char3) doCnd_schd_io_sub_char3_NX(info);
		else if (nx == Cnd_act_sub_char1) doCnd_act_sub_char1_NX(info);
		else if (nx == Cnd_act_sub_char2) doCnd_act_sub_char2_NX(info);
		else if (nx == Cnd_act_sub_char3) doCnd_act_sub_char3_NX(info);
		else if (nx == Cnd_act_d_sub_char1) doCnd_act_d_sub_char1_NX(info);
		else if (nx == Cnd_act_d_sub_char2) doCnd_act_d_sub_char2_NX(info);
		else if (nx == Cnd_act_d_sub_char3) doCnd_act_d_sub_char3_NX(info);
		else if (nx == Cnd_act_io_sub_char1) doCnd_act_io_sub_char1_NX(info);
		else if (nx == Cnd_act_io_sub_char2) doCnd_act_io_sub_char2_NX(info);
		else if (nx == Cnd_act_io_sub_char3) doCnd_act_io_sub_char3_NX(info);
		else if (nx == Cnd_inc_ret_dscnt_flg) doCnd_inc_ret_dscnt_flg_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_sret_schd_sts_typ) doRslt_sret_schd_sts_typ_NX(info);
		else if (nx == columnRslt_sret_schd_sts_typ_nm) doRslt_sret_schd_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_ret_sppl_nm) doRslt_ret_sppl_nm_NX(info);
		else if (nx == columnRslt_ret_sppl_cntct_psn_title) doRslt_ret_sppl_cntct_psn_title_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_ref_rcpt_iv_no) doRslt_ref_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NX(info);
		else if (nx == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_NX(info);
		else if (nx == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_NX(info);
		else if (nx == columnRslt_purc_ret_loc_cd) doRslt_purc_ret_loc_cd_NX(info);
		else if (nx == columnRslt_purc_ret_loc_nm) doRslt_purc_ret_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NX(info);
		else if (nx == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NX(info);
		else if (nx == columnRslt_purc_id_typ) doRslt_purc_id_typ_NX(info);
		else if (nx == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NX(info);
		else if (nx == columnRslt_purc_ret_print_dt) doRslt_purc_ret_print_dt_NX(info);
		else if (nx == columnRslt_purc_ret_print_flg) doRslt_purc_ret_print_flg_NX(info);
		else if (nx == columnRslt_purc_ret_dt) doRslt_purc_ret_dt_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_schd_dt) doRslt_schd_dt_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_qty_dec_place) doRslt_trd_qty_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_qty_dec_place) doRslt_base_qty_dec_place_NX(info);
		else if (nx == columnRslt_abort_flg) doRslt_abort_flg_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_dt) doRslt_ptax_dt_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_purc_typ) doRslt_purc_typ_NX(info);
		else if (nx == columnRslt_purc_typ_nm) doRslt_purc_typ_nm_NX(info);
		else if (nx == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_NX(info);
		else if (nx == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_NX(info);
		else if (nx == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_lot_no) doRslt_bd_lot_no_NX(info);
		else if (nx == columnRslt_bd_sublot_no) doRslt_bd_sublot_no_NX(info);
		else if (nx == columnRslt_bd_loc_cd) doRslt_bd_loc_cd_NX(info);
		else if (nx == columnRslt_bd_loc_nm) doRslt_bd_loc_nm_NX(info);
		else if (nx == columnRslt_bd_ctg_cd) doRslt_bd_ctg_cd_NX(info);
		else if (nx == columnRslt_bd_ctg_nm) doRslt_bd_ctg_nm_NX(info);
		else if (nx == columnRslt_bd_oper_cd) doRslt_bd_oper_cd_NX(info);
		else if (nx == columnRslt_bd_oper_nm) doRslt_bd_oper_nm_NX(info);
		else if (nx == columnRslt_bd_iv_no) doRslt_bd_iv_no_NX(info);
		else if (nx == columnRslt_bd_slo_no) doRslt_bd_slo_no_NX(info);
		else if (nx == columnRslt_bd_po_no) doRslt_bd_po_no_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_nm1) doRslt_tterm_nm1_NX(info);
		else if (nx == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_nm2) doRslt_tterm_nm2_NX(info);
		else if (nx == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_tterm_nm3) doRslt_tterm_nm3_NX(info);
		else if (nx == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_purc_ret_print_rmrks) doRslt_purc_ret_print_rmrks_NX(info);
		else if (nx == columnRslt_purc_ret_print_d_rmrks) doRslt_purc_ret_print_d_rmrks_NX(info);
		else if (nx == columnRslt_schd_trd_rmrks) doRslt_schd_trd_rmrks_NX(info);
		else if (nx == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_NX(info);
		else if (nx == columnRslt_schd_intr_d_rmrks) doRslt_schd_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_NX(info);
		else if (nx == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_NX(info);
		else if (nx == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_NX(info);
		else if (nx == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_NX(info);
		else if (nx == columnRslt_purc_ret_act_rev) doRslt_purc_ret_act_rev_NX(info);
		else if (nx == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_NX(info);
		else if (nx == columnRslt_purc_ret_act_io_no) doRslt_purc_ret_act_io_no_NX(info);
		else if (nx == columnRslt_purc_ret_schd_no) doRslt_purc_ret_schd_no_NX(info);
		else if (nx == columnRslt_purc_ret_schd_d_no) doRslt_purc_ret_schd_d_no_NX(info);
		else if (nx == columnRslt_purc_ret_schd_io_no) doRslt_purc_ret_schd_io_no_NX(info);
		else if (nx == columnRslt_ref_purc_act_no) doRslt_ref_purc_act_no_NX(info);
		else if (nx == columnRslt_ref_purc_act_d_no) doRslt_ref_purc_act_d_no_NX(info);
		else if (nx == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_NX(info);
		else if (nx == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_NX(info);
		else if (nx == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_NX(info);
		else if (nx == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_NX(info);
		else if (nx == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_NX(info);
		else if (nx == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_NX(info);
		else if (nx == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_NX(info);
		else if (nx == columnRslt_schd_io_sub_char1) doRslt_schd_io_sub_char1_NX(info);
		else if (nx == columnRslt_schd_io_sub_char2) doRslt_schd_io_sub_char2_NX(info);
		else if (nx == columnRslt_schd_io_sub_char3) doRslt_schd_io_sub_char3_NX(info);
		else if (nx == columnRslt_act_sub_char1) doRslt_act_sub_char1_NX(info);
		else if (nx == columnRslt_act_sub_char2) doRslt_act_sub_char2_NX(info);
		else if (nx == columnRslt_act_sub_char3) doRslt_act_sub_char3_NX(info);
		else if (nx == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_NX(info);
		else if (nx == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_NX(info);
		else if (nx == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_NX(info);
		else if (nx == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_NX(info);
		else if (nx == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_NX(info);
		else if (nx == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_NX(info);
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
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_transt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_transt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_transt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_transt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[all_transt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_all_transt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sret_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sret_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_issue_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_issue_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_sppl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char3_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_ret_dscnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_ret_dscnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_cntct_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_cntct_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bd_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_po_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_io_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char3_NX(MCEventInfo info){
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
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_purc_ret_dt_fr) doCnd_purc_ret_dt_fr_LC(info);
		else if (lc == Cnd_purc_ret_dt_to) doCnd_purc_ret_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_LC(info);
		else if (lc == Cnd_schd_dt_to) doCnd_schd_dt_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_ret_sppl_nm) doCnd_ret_sppl_nm_LC(info);
		else if (lc == Cnd_loc_wg_cd) doCnd_loc_wg_cd_LC(info);
		else if (lc == Cnd_loc_wg_nm) doCnd_loc_wg_nm_LC(info);
		else if (lc == Cnd_purc_ret_loc_cd) doCnd_purc_ret_loc_cd_LC(info);
		else if (lc == Cnd_purc_ret_loc_nm) doCnd_purc_ret_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_iv_itm_nm) doCnd_iv_itm_nm_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_purc_dpt_wg_cd) doCnd_purc_dpt_wg_cd_LC(info);
		else if (lc == Cnd_purc_dpt_wg_nm) doCnd_purc_dpt_wg_nm_LC(info);
		else if (lc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_LC(info);
		else if (lc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_LC(info);
		else if (lc == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_LC(info);
		else if (lc == Cnd_purc_ret_schd_no) doCnd_purc_ret_schd_no_LC(info);
		else if (lc == Cnd_purc_ret_schd_d_no) doCnd_purc_ret_schd_d_no_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_purc_ret_print_rmrks) doCnd_purc_ret_print_rmrks_LC(info);
		else if (lc == Cnd_purc_ret_print_d_rmrks) doCnd_purc_ret_print_d_rmrks_LC(info);
		else if (lc == Cnd_schd_trd_rmrks) doCnd_schd_trd_rmrks_LC(info);
		else if (lc == Cnd_schd_trd_d_rmrks) doCnd_schd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_schd_intr_rmrks) doCnd_schd_intr_rmrks_LC(info);
		else if (lc == Cnd_schd_intr_d_rmrks) doCnd_schd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_act_trd_rmrks) doCnd_act_trd_rmrks_LC(info);
		else if (lc == Cnd_act_trd_d_rmrks) doCnd_act_trd_d_rmrks_LC(info);
		else if (lc == Cnd_act_intr_rmrks) doCnd_act_intr_rmrks_LC(info);
		else if (lc == Cnd_act_intr_d_rmrks) doCnd_act_intr_d_rmrks_LC(info);
		else if (lc == Cnd_schd_sub_char1) doCnd_schd_sub_char1_LC(info);
		else if (lc == Cnd_schd_sub_char2) doCnd_schd_sub_char2_LC(info);
		else if (lc == Cnd_schd_sub_char3) doCnd_schd_sub_char3_LC(info);
		else if (lc == Cnd_schd_d_sub_char1) doCnd_schd_d_sub_char1_LC(info);
		else if (lc == Cnd_schd_d_sub_char2) doCnd_schd_d_sub_char2_LC(info);
		else if (lc == Cnd_schd_d_sub_char3) doCnd_schd_d_sub_char3_LC(info);
		else if (lc == Cnd_schd_io_sub_char1) doCnd_schd_io_sub_char1_LC(info);
		else if (lc == Cnd_schd_io_sub_char2) doCnd_schd_io_sub_char2_LC(info);
		else if (lc == Cnd_schd_io_sub_char3) doCnd_schd_io_sub_char3_LC(info);
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
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_ret_sppl_nm) doRslt_ret_sppl_nm_LC(info);
		else if (lc == columnRslt_ret_sppl_cntct_psn_title) doRslt_ret_sppl_cntct_psn_title_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_ref_rcpt_iv_no) doRslt_ref_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_LC(info);
		else if (lc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_loc_wg_cd) doRslt_loc_wg_cd_LC(info);
		else if (lc == columnRslt_loc_wg_nm) doRslt_loc_wg_nm_LC(info);
		else if (lc == columnRslt_purc_ret_loc_cd) doRslt_purc_ret_loc_cd_LC(info);
		else if (lc == columnRslt_purc_ret_loc_nm) doRslt_purc_ret_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_LC(info);
		else if (lc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_LC(info);
		else if (lc == columnRslt_purc_id_typ) doRslt_purc_id_typ_LC(info);
		else if (lc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_LC(info);
		else if (lc == columnRslt_purc_ret_print_dt) doRslt_purc_ret_print_dt_LC(info);
		else if (lc == columnRslt_purc_ret_dt) doRslt_purc_ret_dt_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_schd_dt) doRslt_schd_dt_LC(info);
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
		else if (lc == columnRslt_pay_crryovr_times) doRslt_pay_crryovr_times_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_dt) doRslt_ptax_dt_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_purc_typ) doRslt_purc_typ_LC(info);
		else if (lc == columnRslt_purc_typ_nm) doRslt_purc_typ_nm_LC(info);
		else if (lc == columnRslt_mfg_inst_no) doRslt_mfg_inst_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_ret_rsn_cd) doRslt_ret_rsn_cd_LC(info);
		else if (lc == columnRslt_ret_rsn_nm) doRslt_ret_rsn_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_dpt_cd) doRslt_bd_dpt_cd_LC(info);
		else if (lc == columnRslt_bd_dpt_nm) doRslt_bd_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_lot_no) doRslt_bd_lot_no_LC(info);
		else if (lc == columnRslt_bd_sublot_no) doRslt_bd_sublot_no_LC(info);
		else if (lc == columnRslt_bd_loc_cd) doRslt_bd_loc_cd_LC(info);
		else if (lc == columnRslt_bd_loc_nm) doRslt_bd_loc_nm_LC(info);
		else if (lc == columnRslt_bd_ctg_cd) doRslt_bd_ctg_cd_LC(info);
		else if (lc == columnRslt_bd_ctg_nm) doRslt_bd_ctg_nm_LC(info);
		else if (lc == columnRslt_bd_oper_cd) doRslt_bd_oper_cd_LC(info);
		else if (lc == columnRslt_bd_oper_nm) doRslt_bd_oper_nm_LC(info);
		else if (lc == columnRslt_bd_iv_no) doRslt_bd_iv_no_LC(info);
		else if (lc == columnRslt_bd_slo_no) doRslt_bd_slo_no_LC(info);
		else if (lc == columnRslt_bd_po_no) doRslt_bd_po_no_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_nm1) doRslt_tterm_nm1_LC(info);
		else if (lc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_nm2) doRslt_tterm_nm2_LC(info);
		else if (lc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_tterm_nm3) doRslt_tterm_nm3_LC(info);
		else if (lc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_purc_ret_print_rmrks) doRslt_purc_ret_print_rmrks_LC(info);
		else if (lc == columnRslt_purc_ret_print_d_rmrks) doRslt_purc_ret_print_d_rmrks_LC(info);
		else if (lc == columnRslt_schd_trd_rmrks) doRslt_schd_trd_rmrks_LC(info);
		else if (lc == columnRslt_schd_trd_d_rmrks) doRslt_schd_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_schd_intr_rmrks) doRslt_schd_intr_rmrks_LC(info);
		else if (lc == columnRslt_schd_intr_d_rmrks) doRslt_schd_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_act_trd_rmrks) doRslt_act_trd_rmrks_LC(info);
		else if (lc == columnRslt_act_trd_d_rmrks) doRslt_act_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_act_intr_rmrks) doRslt_act_intr_rmrks_LC(info);
		else if (lc == columnRslt_act_intr_d_rmrks) doRslt_act_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_purc_act_d_no) doRslt_purc_act_d_no_LC(info);
		else if (lc == columnRslt_purc_ret_act_no) doRslt_purc_ret_act_no_LC(info);
		else if (lc == columnRslt_purc_ret_act_rev) doRslt_purc_ret_act_rev_LC(info);
		else if (lc == columnRslt_purc_ret_act_d_no) doRslt_purc_ret_act_d_no_LC(info);
		else if (lc == columnRslt_purc_ret_act_io_no) doRslt_purc_ret_act_io_no_LC(info);
		else if (lc == columnRslt_purc_ret_schd_no) doRslt_purc_ret_schd_no_LC(info);
		else if (lc == columnRslt_purc_ret_schd_d_no) doRslt_purc_ret_schd_d_no_LC(info);
		else if (lc == columnRslt_purc_ret_schd_io_no) doRslt_purc_ret_schd_io_no_LC(info);
		else if (lc == columnRslt_ref_purc_act_no) doRslt_ref_purc_act_no_LC(info);
		else if (lc == columnRslt_ref_purc_act_d_no) doRslt_ref_purc_act_d_no_LC(info);
		else if (lc == columnRslt_base_purc_ac_dt) doRslt_base_purc_ac_dt_LC(info);
		else if (lc == columnRslt_schd_sub_char1) doRslt_schd_sub_char1_LC(info);
		else if (lc == columnRslt_schd_sub_char2) doRslt_schd_sub_char2_LC(info);
		else if (lc == columnRslt_schd_sub_char3) doRslt_schd_sub_char3_LC(info);
		else if (lc == columnRslt_schd_d_sub_char1) doRslt_schd_d_sub_char1_LC(info);
		else if (lc == columnRslt_schd_d_sub_char2) doRslt_schd_d_sub_char2_LC(info);
		else if (lc == columnRslt_schd_d_sub_char3) doRslt_schd_d_sub_char3_LC(info);
		else if (lc == columnRslt_schd_io_sub_char1) doRslt_schd_io_sub_char1_LC(info);
		else if (lc == columnRslt_schd_io_sub_char2) doRslt_schd_io_sub_char2_LC(info);
		else if (lc == columnRslt_schd_io_sub_char3) doRslt_schd_io_sub_char3_LC(info);
		else if (lc == columnRslt_act_sub_char1) doRslt_act_sub_char1_LC(info);
		else if (lc == columnRslt_act_sub_char2) doRslt_act_sub_char2_LC(info);
		else if (lc == columnRslt_act_sub_char3) doRslt_act_sub_char3_LC(info);
		else if (lc == columnRslt_act_d_sub_char1) doRslt_act_d_sub_char1_LC(info);
		else if (lc == columnRslt_act_d_sub_char2) doRslt_act_d_sub_char2_LC(info);
		else if (lc == columnRslt_act_d_sub_char3) doRslt_act_d_sub_char3_LC(info);
		else if (lc == columnRslt_act_io_sub_char1) doRslt_act_io_sub_char1_LC(info);
		else if (lc == columnRslt_act_io_sub_char2) doRslt_act_io_sub_char2_LC(info);
		else if (lc == columnRslt_act_io_sub_char3) doRslt_act_io_sub_char3_LC(info);
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
	 * [Cnd]パネルの[purc_ret_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ret_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_sppl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_loc_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_ret_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_ret_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_ret_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_intr_d_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[schd_io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_io_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ret_sppl_cntct_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ret_sppl_cntct_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_ret_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bd_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ret_schd_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ret_schd_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ref_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ref_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_purc_ac_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_io_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_io_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_io_sub_char3_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_ret_loc_cd]の作成メソッド
	 */
	public MCList getCnd_purc_ret_loc_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_wg_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_purc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
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
		if (id.equals("MS.MSBDL0170.Srch01")) {
			return new MS_MSBDL0170_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0170.Srch02")) {
			return new MS_MSBDL0170_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0170.Prnt01")) {
			return new MS_MSBDL0170_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0170_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0170_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0170_Srch01Bridge() {
			p_MS_MSBDL0170_Srch01 = new MCParam(PDef.MS_MSBDL0170_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0170_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0170.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class));

			p_MS_MSBDL0170_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0170_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0170_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0170_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0170_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0170.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0170.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0170_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0170_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0170.RsltR>)p_MS_MSBDL0170_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0170_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0170_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0170_Srch02Bridge() {
			p_MS_MSBDL0170_Srch02 = new MCParam(PDef.MS_MSBDL0170_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0170_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0170.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class));

			p_MS_MSBDL0170_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0170_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0170_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0170_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0170_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0170.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0170.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0170.RsltR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0170.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0170_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0170_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBD.MSBDP0170.RsltR>)p_MS_MSBDL0170_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0170_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0170_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0170_Prnt01;

		/** コンストラクタ */
		protected MS_MSBDL0170_Prnt01Bridge() {
			p_MS_MSBDL0170_Prnt01 = new MCParam(PDef.MS_MSBDL0170_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0170_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0170.RsltR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0170.BtnR.create());
			// Down

			p_MS_MSBDL0170_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0170_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0170_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBDL0170_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0170_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0170_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0170.RsltR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0170.RsltR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0170.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0170.BtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0170_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}