package mcframe.clientMSBE.MSBEP2200;

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
import mcframe.clientMSBE.MSBEP2200.MSBEP_RcptIvTrgtSel_MC.MS_MSBEL2200_Srch01Caller;

/**
 * 画面"MSBEP_RcptIvTrgtSel"パネルクラスです。<p>
 *
 * 受領対象の仕入予定を発注先の受領インボイス単位にまとめる。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_RcptIvTrgtSel_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP2200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SrchMode]ブロック関連のField定義
	public MCPanel SrchModePanel = null;
	public MCTitledBorder SrchModeTitledBorder = null;
	// [SrchMode]ブロックの項目のField定義
	// [PrStsTyp]ブロック関連のField定義
	public MCPanel PrStsTypPanel = null;
	public MCTitledBorder PrStsTypTitledBorder = null;
	// [PrStsTyp]ブロックの項目のField定義
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
	// [SpplBpCnd]ブロック関連のField定義
	public MCPanel SpplBpCndPanel = null;
	// [SpplBpCnd]ブロックの項目のField定義
	// [ItmCnd]ブロック関連のField定義
	public MCPanel ItmCndPanel = null;
	// [ItmCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * ARR_SCHD,Receipt schedule,0;ARR_ACT,Receipt result,1 ARR_SCHD,入荷予定,0;ARR_ACT,入荷実績,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_mode_Group = null;
	public MCRadioButton Cnd_srch_mode_ARR_SCHD = null;
	public MCRadioButton Cnd_srch_mode_ARR_ACT = null;
	/**
	 * Unreceived 未入荷.<p>
	 *
	 */
	public MCCheckBox Cnd_not_arr_flg = null;
	/**
	 * Partial receipt 一部入荷.<p>
	 *
	 */
	public MCCheckBox Cnd_part_arr_flg = null;
	/**
	 * Received 入荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_arr_flg = null;
	public MCLabel Cnd_purc_schd_dt_fr_Label = null;
	/**
	 * Scheduled purchase date FROM 仕入予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_schd_dt_fr = null;
	public MCLabel Cnd_purc_schd_dt_to_Label = null;
	/**
	 * Scheduled purchase date TO 仕入予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_schd_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_arr_schd_dt_p_PPanel;
	public MCDateField Cnd_arr_schd_dt_fr;	// [Cnd]の[arr_schd_dt_p.ymd_fr]を[Cnd_arr_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_fr;	// [Cnd]の[arr_schd_dt_p.hm_fr]を[Cnd_arr_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_dt_to;	// [Cnd]の[arr_schd_dt_p.ymd_to]を[Cnd_arr_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_arr_schd_hm_to;	// [Cnd]の[arr_schd_dt_p.hm_to]を[Cnd_arr_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_arr_dt_p_PPanel;
	public MCDateField Cnd_arr_dt_fr;	// [Cnd]の[arr_dt_p.ymd_fr]を[Cnd_arr_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_hm_fr;	// [Cnd]の[arr_dt_p.hm_fr]を[Cnd_arr_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_arr_dt_to;	// [Cnd]の[arr_dt_p.ymd_to]を[Cnd_arr_dt_to]としてエイリアス定義。
	public MCDateField Cnd_arr_hm_to;	// [Cnd]の[arr_dt_p.hm_to]を[Cnd_arr_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_in_to_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_id_typ = null;
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_id_typ_nm = null;
	public MCLabel Cnd_in_to_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_id_cd = null;
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_id_nm = null;
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
	public MCLabel Cnd_purc_schd_no_Label = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_schd_no = null;
	public MCLabel Cnd_arr_schd_no_Label = null;
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_arr_schd_no = null;
	public MCLabel Cnd_arr_act_no_Label = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_arr_act_no = null;
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_po_d_no_Label = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_d_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_slo_d_no_Label = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_d_no = null;
	/**
	 * Include unapproved PO 発注未承認含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_not_aprv_flg = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
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
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2200.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sim_cnd_grp_no = null;
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bndl_tgt_flg = null;
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
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_no = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_act_no = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_arr_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_arr_schd_dt;// [Rslt]の[arr_schd_dt_p.ymd]を[columnRslt_arr_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_arr_schd_hm;// [Rslt]の[arr_schd_dt_p.hm]を[columnRslt_arr_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_arr_dt_p_PPanel;
	public MCColumnConfig columnRslt_arr_dt;// [Rslt]の[arr_dt_p.ymd]を[columnRslt_arr_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_arr_hm;// [Rslt]の[arr_dt_p.hm]を[columnRslt_arr_hm]としてエイリアス定義。
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
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tax_rnd_typ = null;
	/**
	 * Report locale cd. 帳票ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_lcl_cd = null;
	/**
	 * Delivery destination identification type 納入先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_typ = null;
	/**
	 * Delivery destination identification type name 納入先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納入先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_cd = null;
	/**
	 * Delivery destination identification name 納入先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_id_nm = null;
	/**
	 * Dept. 部署.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_cntct_dpt = null;
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_cntct_psn = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_fax = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_to_cntry_nm = null;
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
	 * Invoice target qty. インボイス対象数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_qty = null;
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
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty = null;
	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_qty = null;
	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_act_qty = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_amt;// [Rslt]の[trd_cur_proc_amt_p.amt]を[columnRslt_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.amt]を[columnRslt_trd_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_inc_ctax_amt;// [Rslt]の[inc_ctax_amt_p.amt]を[columnRslt_inc_ctax_amt]としてエイリアス定義。
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
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_upri_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_ctax_amt;// [Rslt]の[base_cur_inc_ctax_amt_p.amt]を[columnRslt_base_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_amt;// [Rslt]の[base_cur_proc_amt_p.amt]を[columnRslt_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_amt;// [Rslt]の[base_cur_onr_prov_amt_p.amt]を[columnRslt_base_cur_onr_prov_amt]としてエイリアス定義。
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_upri_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_ctax_amt;// [Rslt]の[ptax_cur_inc_ctax_amt_p.amt]を[columnRslt_ptax_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_amt;// [Rslt]の[ptax_cur_proc_amt_p.amt]を[columnRslt_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_amt;// [Rslt]の[ptax_cur_onr_prov_amt_p.amt]を[columnRslt_ptax_cur_onr_prov_amt]としてエイリアス定義。
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
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
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
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_nm = null;
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vssl_flght = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_nm = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_etd_dt = null;
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_cd = null;
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_nm = null;
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_eta_dt = null;
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_cd = null;
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_nm = null;
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_schd_dt = null;
	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd1 = null;
	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm1 = null;
	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks1 = null;
	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd2 = null;
	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm2 = null;
	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks2 = null;
	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd3 = null;
	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm3 = null;
	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks3 = null;
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
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_print_rmrks = null;
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
	 * Sales order transaction pattern type 受注取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_trd_ptn_typ = null;
	/**
	 * Sales order transaction pattern type name 受注取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_trd_ptn_typ_nm = null;
	/**
	 * Sales order currency cd. 受注通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_cur_cd = null;
	/**
	 * Sales order currency name 受注通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_cur_nm = null;
	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_xrate = null;
	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_ptax_xrate = null;
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_typ = null;
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_typ_nm = null;
	/**
	 * Sales order transaction terms cd. 1 受注取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_cd1 = null;
	/**
	 * Sales order transaction terms name 1 受注取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_nm1 = null;
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks1 = null;
	/**
	 * Sales order transaction terms cd. 2 受注取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_cd2 = null;
	/**
	 * Sales order transaction terms name 2 受注取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_nm2 = null;
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks2 = null;
	/**
	 * Sales order transaction terms cd. 3 受注取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_cd3 = null;
	/**
	 * Sales order transaction terms name 3 受注取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_nm3 = null;
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks3 = null;
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_basis_typ = null;
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_basis_typ_nm = null;
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
	 * Selectable 選択可能.<p>
	 *
	 */
	public MCColumnConfig columnRslt_selectable_flg = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_spot_flg = null;
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bp_grp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[bp_grp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[bp_grp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[bp_grp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[bp_grp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[bp_grp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[bp_grp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[bp_grp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[bp_grp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[bp_grp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[bp_grp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[bp_grp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[bp_grp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[bp_grp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[bp_grp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[bp_grp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[bp_grp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[bp_grp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[bp_grp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[bp_grp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[bp_grp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
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
	 * Purchase invoice entry 受領インボイス登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2210 = null;
	/**
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public MCCheckBox Btn_chk_by_grp_no_flg = null;
	/**
	 * Select same details in bulk 同一明細まとめ選択.<p>
	 *
	 */
	public MCCheckBox Btn_select_bndl_grp = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_ARR_ACT]モードを表す定数 */
	public static final String SRCH_ARR_ACT = "SRCH_ARR_ACT";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [REF_ARR_ACT]モードを表す定数 */
	public static final String REF_ARR_ACT = "REF_ARR_ACT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_ARR_ACT, REF, REF_ARR_ACT};
	
	/** [MS_MSBEL2200_Srch01]のCallerの作成 */
	protected MSBEP_RcptIvTrgtSel_MC.MS_MSBEL2200_Srch01Caller createMS_MSBEL2200_Srch01() {
		MSBEP_RcptIvTrgtSel_MC.MS_MSBEL2200_Srch01Caller<MSBEP_RcptIvTrgtSel, MS_MSBEL2200_Srch01Bridge>
		caller = ((MSBEP_RcptIvTrgtSel_MC)this).new MS_MSBEL2200_Srch01Caller<MSBEP_RcptIvTrgtSel, MS_MSBEL2200_Srch01Bridge>(
					(MSBEP_RcptIvTrgtSel)this, new MS_MSBEL2200_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2200_Srch01]の呼び出し */
	protected void callMS_MSBEL2200_Srch01() {
		MCCaller caller = createMS_MSBEL2200_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2200.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2200.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2200.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2200.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2200.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2200.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2200.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2200.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2200.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2200.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2200.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP2200.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2200.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2200.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP2200.BtnR.create();
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
		ret.add(SrchModePanel);
		ret.add(PrStsTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(SpplBpCndPanel);
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
	public MSBEP_RcptIvTrgtSel_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_RcptIvTrgtSel_MC_A(String name) {
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
		MSBEP_RcptIvTrgtSel_MC.jbCreateSrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreatePrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateTop((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateFold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateTab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateTab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateTab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateSpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateCtrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateRPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateRslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbCreateBtn((MSBEP_RcptIvTrgtSel)this);
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [PrStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrStsTyp(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [SpplBpCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplBpCnd(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_RcptIvTrgtSel p) {
		p.Cnd_arr_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().arr_schd_dt_p());
		p.Cnd_arr_schd_dt_p_PPanel.setName("Cnd.arr_schd_dt_p");
		p.Cnd_arr_schd_dt_fr = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_arr_schd_dt_fr.addAliasName("Cnd.arr_schd_dt_fr", p);
		p.Cnd_arr_schd_hm_fr = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_arr_schd_hm_fr.addAliasName("Cnd.arr_schd_hm_fr", p);
		p.Cnd_arr_schd_dt_to = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_arr_schd_dt_to.addAliasName("Cnd.arr_schd_dt_to", p);
		p.Cnd_arr_schd_hm_to = p.Cnd_arr_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_arr_schd_hm_to.addAliasName("Cnd.arr_schd_hm_to", p);
		p.Cnd_arr_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().arr_dt_p());
		p.Cnd_arr_dt_p_PPanel.setName("Cnd.arr_dt_p");
		p.Cnd_arr_dt_fr = p.Cnd_arr_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_arr_dt_fr.addAliasName("Cnd.arr_dt_fr", p);
		p.Cnd_arr_hm_fr = p.Cnd_arr_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_arr_hm_fr.addAliasName("Cnd.arr_hm_fr", p);
		p.Cnd_arr_dt_to = p.Cnd_arr_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_arr_dt_to.addAliasName("Cnd.arr_dt_to", p);
		p.Cnd_arr_hm_to = p.Cnd_arr_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_arr_hm_to.addAliasName("Cnd.arr_hm_to", p);
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
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_bp_grp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_RcptIvTrgtSel p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_RcptIvTrgtSel p) {
		p.Rslt_arr_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$arr_schd_dt_p);
		p.Rslt_arr_schd_dt_p_PPanel.setName("Rslt.arr_schd_dt_p");
		p.columnRslt_arr_schd_dt = p.Rslt_arr_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_arr_schd_dt.addAliasName("Rslt.arr_schd_dt", p);
		p.columnRslt_arr_schd_hm = p.Rslt_arr_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_arr_schd_hm.addAliasName("Rslt.arr_schd_hm", p);
		p.Rslt_arr_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$arr_dt_p);
		p.Rslt_arr_dt_p_PPanel.setName("Rslt.arr_dt_p");
		p.columnRslt_arr_dt = p.Rslt_arr_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_arr_dt.addAliasName("Rslt.arr_dt", p);
		p.columnRslt_arr_hm = p.Rslt_arr_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_arr_hm.addAliasName("Rslt.arr_hm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$itm_p);
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
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_proc_upri_p);
		p.Rslt_trd_cur_proc_upri_p_PPanel.setName("Rslt.trd_cur_proc_upri_p");
		p.columnRslt_trd_cur_proc_upri = p.Rslt_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_proc_upri.addAliasName("Rslt.trd_cur_proc_upri", p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_onr_prov_upri_p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.setName("Rslt.trd_cur_onr_prov_upri_p");
		p.columnRslt_trd_cur_onr_prov_upri = p.Rslt_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_onr_prov_upri.addAliasName("Rslt.trd_cur_onr_prov_upri", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_proc_amt_p);
		p.Rslt_trd_cur_proc_amt_p_PPanel.setName("Rslt.trd_cur_proc_amt_p");
		p.columnRslt_trd_cur_proc_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_proc_amt.addAliasName("Rslt.trd_cur_proc_amt", p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_onr_prov_amt_p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.setName("Rslt.trd_cur_onr_prov_amt_p");
		p.columnRslt_trd_cur_onr_prov_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_onr_prov_amt.addAliasName("Rslt.trd_cur_onr_prov_amt", p);
		p.Rslt_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$inc_ctax_amt_p);
		p.Rslt_inc_ctax_amt_p_PPanel.setName("Rslt.inc_ctax_amt_p");
		p.columnRslt_inc_ctax_amt = p.Rslt_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_inc_ctax_amt.addAliasName("Rslt.inc_ctax_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_proc_upri_p);
		p.Rslt_base_cur_proc_upri_p_PPanel.setName("Rslt.base_cur_proc_upri_p");
		p.columnRslt_base_cur_proc_upri = p.Rslt_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_proc_upri.addAliasName("Rslt.base_cur_proc_upri", p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_onr_prov_upri_p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.setName("Rslt.base_cur_onr_prov_upri_p");
		p.columnRslt_base_cur_onr_prov_upri = p.Rslt_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_onr_prov_upri.addAliasName("Rslt.base_cur_onr_prov_upri", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_inc_ctax_amt_p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.setName("Rslt.base_cur_inc_ctax_amt_p");
		p.columnRslt_base_cur_inc_ctax_amt = p.Rslt_base_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_ctax_amt.addAliasName("Rslt.base_cur_inc_ctax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_proc_amt_p);
		p.Rslt_base_cur_proc_amt_p_PPanel.setName("Rslt.base_cur_proc_amt_p");
		p.columnRslt_base_cur_proc_amt = p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_proc_amt.addAliasName("Rslt.base_cur_proc_amt", p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$base_cur_onr_prov_amt_p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.setName("Rslt.base_cur_onr_prov_amt_p");
		p.columnRslt_base_cur_onr_prov_amt = p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_onr_prov_amt.addAliasName("Rslt.base_cur_onr_prov_amt", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_proc_upri_p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.setName("Rslt.ptax_cur_proc_upri_p");
		p.columnRslt_ptax_cur_proc_upri = p.Rslt_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_proc_upri.addAliasName("Rslt.ptax_cur_proc_upri", p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_onr_prov_upri_p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.setName("Rslt.ptax_cur_onr_prov_upri_p");
		p.columnRslt_ptax_cur_onr_prov_upri = p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_onr_prov_upri.addAliasName("Rslt.ptax_cur_onr_prov_upri", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_inc_ctax_amt_p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_ctax_amt_p");
		p.columnRslt_ptax_cur_inc_ctax_amt = p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_ctax_amt.addAliasName("Rslt.ptax_cur_inc_ctax_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_proc_amt_p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.setName("Rslt.ptax_cur_proc_amt_p");
		p.columnRslt_ptax_cur_proc_amt = p.Rslt_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_proc_amt.addAliasName("Rslt.ptax_cur_proc_amt", p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$ptax_cur_onr_prov_amt_p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.setName("Rslt.ptax_cur_onr_prov_amt_p");
		p.columnRslt_ptax_cur_onr_prov_amt = p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_onr_prov_amt.addAliasName("Rslt.ptax_cur_onr_prov_amt", p);
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_wrk_no_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_wrk_no_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_wrk_no_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_wrk_no_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$itm_grp_p);
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
		p.Rslt_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP2200.RsltR.$bp_grp_p);
		p.Rslt_bp_grp_p_PPanel.setName("Rslt.bp_grp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_RcptIvTrgtSel p) {
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
	
	
	/** [Cnd_in_to_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_id_typ_p = null;

	/**
	 * [Cnd_in_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_id_typ_ListPutter() {
		if (Cnd_in_to_id_typ_p == null) {
			Cnd_in_to_id_typ_p = createCnd_in_to_id_typ_ListPutter(Cnd_in_to_id_typ, "in_to_id_typ", "in_to_id_typ_nm");

		}
		return Cnd_in_to_id_typ_p;
	}
	
	
	/** [Cnd_in_to_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_id_cd_p = null;

	/**
	 * [Cnd_in_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_id_cd_ListPutter() {
		if (Cnd_in_to_id_cd_p == null) {
			Cnd_in_to_id_cd_p = createCnd_in_to_id_cd_ListPutter(Cnd_in_to_id_cd, "in_to_id_cd", "in_to_id_nm");

		}
		return Cnd_in_to_id_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvTrgtSel create(){
		MSBEP_RcptIvTrgtSel p = new MSBEP_RcptIvTrgtSel();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvTrgtSel create(String name){
		MSBEP_RcptIvTrgtSel p = new MSBEP_RcptIvTrgtSel(name);
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
		MSBEP_RcptIvTrgtSel_MC.jbfInitSrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitPrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitTop((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitFold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitTab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitTab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitTab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitSpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitCtrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitRPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitRslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbfInitBtn((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitSrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitPrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitTop((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitFold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitTab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitTab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitTab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitSpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitCtrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitRPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitRslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.jbInitBtn((MSBEP_RcptIvTrgtSel)this);
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrStsTyp(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.PrStsTypPanel = p.beansFactory.createPanel("PrStsTyp");
		p.PrStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_RcptIvTrgtSel p) {
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
	protected static void jbfInitTab1(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplBpCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplBpCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.SpplBpCndPanel = p.beansFactory.createPanel("SpplBpCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_srch_mode_Group = p.beansFactory.createButtonGroup("Cnd.srch_mode");
		p.Cnd_srch_mode_ARR_SCHD = p.beansFactory.createRadioButton("Cnd.srch_mode_ARR_SCHD");
		p.Cnd_srch_mode_ARR_ACT = p.beansFactory.createRadioButton("Cnd.srch_mode_ARR_ACT");
		p.Cnd_not_arr_flg = p.beansFactory.createCheckBox("Cnd.not_arr_flg");
		p.Cnd_part_arr_flg = p.beansFactory.createCheckBox("Cnd.part_arr_flg");
		p.Cnd_arr_flg = p.beansFactory.createCheckBox("Cnd.arr_flg");
		p.Cnd_purc_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_fr_Label");
		p.Cnd_purc_schd_dt_fr = p.beansFactory.createDateField("Cnd.purc_schd_dt_fr");
		p.Cnd_purc_schd_dt_fr.setLabel(p.Cnd_purc_schd_dt_fr_Label);
		p.Cnd_purc_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_to_Label");
		p.Cnd_purc_schd_dt_to = p.beansFactory.createDateField("Cnd.purc_schd_dt_to");
		p.Cnd_purc_schd_dt_to.setLabel(p.Cnd_purc_schd_dt_to_Label);
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_in_to_id_typ_Label = p.beansFactory.createLabel("Cnd.in_to_id_typ_Label");
		p.Cnd_in_to_id_typ = p.beansFactory.createTextComboBox("Cnd.in_to_id_typ");
		p.Cnd_in_to_id_typ.setLabel(p.Cnd_in_to_id_typ_Label);
		p.Cnd_in_to_id_typ_nm = p.beansFactory.createTextField("Cnd.in_to_id_typ_nm");
		p.Cnd_in_to_id_cd_Label = p.beansFactory.createLabel("Cnd.in_to_id_cd_Label");
		p.Cnd_in_to_id_cd = p.beansFactory.createTextComboBox("Cnd.in_to_id_cd");
		p.Cnd_in_to_id_cd.setLabel(p.Cnd_in_to_id_cd_Label);
		p.Cnd_in_to_id_nm = p.beansFactory.createTextField("Cnd.in_to_id_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_purc_schd_no_Label = p.beansFactory.createLabel("Cnd.purc_schd_no_Label");
		p.Cnd_purc_schd_no = p.beansFactory.createTextField("Cnd.purc_schd_no");
		p.Cnd_purc_schd_no.setLabel(p.Cnd_purc_schd_no_Label);
		p.Cnd_arr_schd_no_Label = p.beansFactory.createLabel("Cnd.arr_schd_no_Label");
		p.Cnd_arr_schd_no = p.beansFactory.createTextField("Cnd.arr_schd_no");
		p.Cnd_arr_schd_no.setLabel(p.Cnd_arr_schd_no_Label);
		p.Cnd_arr_act_no_Label = p.beansFactory.createLabel("Cnd.arr_act_no_Label");
		p.Cnd_arr_act_no = p.beansFactory.createTextField("Cnd.arr_act_no");
		p.Cnd_arr_act_no.setLabel(p.Cnd_arr_act_no_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_incl_not_aprv_flg = p.beansFactory.createCheckBox("Cnd.incl_not_aprv_flg");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
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
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_sim_cnd_grp_no = p.beansFactory.createTableColumn("Rslt.sim_cnd_grp_no", MCColumnType.NUMBER);
		p.columnRslt_bndl_tgt_flg = p.beansFactory.createTableColumn("Rslt.bndl_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_schd_no = p.beansFactory.createTableColumn("Rslt.arr_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_act_no = p.beansFactory.createTableColumn("Rslt.arr_act_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_dt = p.beansFactory.createTableColumn("Rslt.purc_schd_dt", MCColumnType.DATE);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_prnt_lcl_cd = p.beansFactory.createTableColumn("Rslt.prnt_lcl_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_id_typ = p.beansFactory.createTableColumn("Rslt.in_to_id_typ", MCColumnType.TEXT);
		p.columnRslt_in_to_id_typ_nm = p.beansFactory.createTableColumn("Rslt.in_to_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_in_to_id_cd = p.beansFactory.createTableColumn("Rslt.in_to_id_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_id_nm = p.beansFactory.createTableColumn("Rslt.in_to_id_nm", MCColumnType.TEXT);
		p.columnRslt_in_to_cntct_dpt = p.beansFactory.createTableColumn("Rslt.in_to_cntct_dpt", MCColumnType.TEXT);
		p.columnRslt_in_to_cntct_psn = p.beansFactory.createTableColumn("Rslt.in_to_cntct_psn", MCColumnType.TEXT);
		p.columnRslt_in_to_zip_cd = p.beansFactory.createTableColumn("Rslt.in_to_zip_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_addr1 = p.beansFactory.createTableColumn("Rslt.in_to_addr1", MCColumnType.TEXT);
		p.columnRslt_in_to_addr2 = p.beansFactory.createTableColumn("Rslt.in_to_addr2", MCColumnType.TEXT);
		p.columnRslt_in_to_addr3 = p.beansFactory.createTableColumn("Rslt.in_to_addr3", MCColumnType.TEXT);
		p.columnRslt_in_to_addr4 = p.beansFactory.createTableColumn("Rslt.in_to_addr4", MCColumnType.TEXT);
		p.columnRslt_in_to_tel = p.beansFactory.createTableColumn("Rslt.in_to_tel", MCColumnType.TEXT);
		p.columnRslt_in_to_fax = p.beansFactory.createTableColumn("Rslt.in_to_fax", MCColumnType.TEXT);
		p.columnRslt_in_to_cntry_cd = p.beansFactory.createTableColumn("Rslt.in_to_cntry_cd", MCColumnType.TEXT);
		p.columnRslt_in_to_cntry_nm = p.beansFactory.createTableColumn("Rslt.in_to_cntry_nm", MCColumnType.TEXT);
		p.columnRslt_purc_usr_cd = p.beansFactory.createTableColumn("Rslt.purc_usr_cd", MCColumnType.TEXT);
		p.columnRslt_purc_usr_nm = p.beansFactory.createTableColumn("Rslt.purc_usr_nm", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_qty = p.beansFactory.createTableColumn("Rslt.base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_arr_schd_qty = p.beansFactory.createTableColumn("Rslt.arr_schd_qty", MCColumnType.NUMBER);
		p.columnRslt_arr_act_qty = p.beansFactory.createTableColumn("Rslt.arr_act_qty", MCColumnType.NUMBER);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_sppl_itm_cd = p.beansFactory.createTableColumn("Rslt.sppl_itm_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_nm = p.beansFactory.createTableColumn("Rslt.sppl_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_vssl_flght = p.beansFactory.createTableColumn("Rslt.vssl_flght", MCColumnType.TEXT);
		p.columnRslt_load_port_cd = p.beansFactory.createTableColumn("Rslt.load_port_cd", MCColumnType.TEXT);
		p.columnRslt_load_port_nm = p.beansFactory.createTableColumn("Rslt.load_port_nm", MCColumnType.TEXT);
		p.columnRslt_etd_dt = p.beansFactory.createTableColumn("Rslt.etd_dt", MCColumnType.DATE);
		p.columnRslt_dschrg_port_cd = p.beansFactory.createTableColumn("Rslt.dschrg_port_cd", MCColumnType.TEXT);
		p.columnRslt_dschrg_port_nm = p.beansFactory.createTableColumn("Rslt.dschrg_port_nm", MCColumnType.TEXT);
		p.columnRslt_eta_dt = p.beansFactory.createTableColumn("Rslt.eta_dt", MCColumnType.DATE);
		p.columnRslt_via_port_cd = p.beansFactory.createTableColumn("Rslt.via_port_cd", MCColumnType.TEXT);
		p.columnRslt_via_port_nm = p.beansFactory.createTableColumn("Rslt.via_port_nm", MCColumnType.TEXT);
		p.columnRslt_via_schd_dt = p.beansFactory.createTableColumn("Rslt.via_schd_dt", MCColumnType.DATE);
		p.columnRslt_purc_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_aprv_no = p.beansFactory.createTableColumn("Rslt.aprv_no", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_po_print_rmrks = p.beansFactory.createTableColumn("Rslt.po_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_slo_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.slo_trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_slo_trd_ptn_typ_nm = p.beansFactory.createTableColumn("Rslt.slo_trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slo_cur_cd = p.beansFactory.createTableColumn("Rslt.slo_cur_cd", MCColumnType.TEXT);
		p.columnRslt_slo_cur_nm = p.beansFactory.createTableColumn("Rslt.slo_cur_nm", MCColumnType.TEXT);
		p.columnRslt_slo_xrate = p.beansFactory.createTableColumn("Rslt.slo_xrate", MCColumnType.NUMBER);
		p.columnRslt_slo_ptax_xrate = p.beansFactory.createTableColumn("Rslt.slo_ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_sls_basis_typ = p.beansFactory.createTableColumn("Rslt.sls_basis_typ", MCColumnType.TEXT);
		p.columnRslt_sls_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.sls_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.slo_tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.slo_tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.slo_tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.slo_tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.slo_tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.slo_tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_purc_basis_typ = p.beansFactory.createTableColumn("Rslt.purc_basis_typ", MCColumnType.TEXT);
		p.columnRslt_purc_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_selectable_flg = p.beansFactory.createTableColumn("Rslt.selectable_flg", MCColumnType.CHECK);
		p.columnRslt_pay_spot_flg = p.beansFactory.createTableColumn("Rslt.pay_spot_flg", MCColumnType.CHECK);
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
	protected static void jbfInitBtn(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2210 = p.beansFactory.createButton("Btn.open_MSBEP2210", "open");
		p.Btn_chk_by_grp_no_flg = p.beansFactory.createCheckBox("Btn.chk_by_grp_no_flg");
		p.Btn_select_bndl_grp = p.beansFactory.createCheckBox("Btn.select_bndl_grp");
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.setLastBeans(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.PrStsTypPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [PrStsTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPrStsTyp(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.PrStsTypPanel.setBorder(p.PrStsTypTitledBorder);
		p.add(p.PrStsTypPanel);
		p.PrStsTypPanel.setNextBeans(p.TopPanel);
		p.PrStsTypPanel.setValueCheck(false);
		p.PrStsTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PrStsTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_RcptIvTrgtSel p) {
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
	protected static void jbInitFold(MSBEP_RcptIvTrgtSel p) {
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
	protected static void jbInitTab1(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SpplBpCndPanel, null);
		p.Tab2Panel.setLastBeans(p.SpplBpCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.ItmCndPanel, null);
		p.Tab3Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [SpplBpCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplBpCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.SpplBpCndPanel.setValueCheck(false);
		p.SpplBpCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SpplBpCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.SrchModePanel.setLastBeans(p.Cnd_srch_mode_Group);
		p.Cnd_srch_mode_Group.setFirstBeans(p.Cnd_srch_mode_ARR_SCHD);
		p.Cnd_srch_mode_ARR_SCHD.setActionCommand("0");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_ARR_SCHD);
		p.SrchModePanel.add(p.Cnd_srch_mode_ARR_SCHD);
		p.Cnd_srch_mode_ARR_SCHD.setNextBeans(p.Cnd_srch_mode_ARR_ACT);
		p.Cnd_srch_mode_ARR_ACT.setActionCommand("1");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_ARR_ACT);
		p.SrchModePanel.add(p.Cnd_srch_mode_ARR_ACT);
		p.Cnd_srch_mode_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.srch_mode_META);
		p.PrStsTypPanel.add(p.Cnd_not_arr_flg);
		p.PrStsTypPanel.setLastBeans(p.Cnd_not_arr_flg);
		p.Cnd_not_arr_flg.setNextBeans(p.Cnd_part_arr_flg);
		p.Cnd_not_arr_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.not_arr_flg_META);
		p.PrStsTypPanel.add(p.Cnd_part_arr_flg);
		p.Cnd_part_arr_flg.setNextBeans(p.Cnd_arr_flg);
		p.Cnd_part_arr_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.part_arr_flg_META);
		p.PrStsTypPanel.add(p.Cnd_arr_flg);
		p.Cnd_arr_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.arr_flg_META);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_purc_schd_dt_fr);
		p.Cnd_purc_schd_dt_fr.setNextBeans(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.purc_schd_dt_fr_META);
		p.Cnd_purc_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_to.setNextBeans(p.Cnd_arr_schd_dt_p_PPanel);
		p.Cnd_purc_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.purc_schd_dt_to_META);
		p.Cnd_purc_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_arr_schd_dt_p_PPanel);
		p.Cnd_arr_schd_dt_p_PPanel.setNextBeans(p.Cnd_arr_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_arr_dt_p_PPanel);
		p.Cnd_arr_dt_p_PPanel.setNextBeans(p.Cnd_sppl_cd);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_in_to_id_typ);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.sppl_nm_META);
		p.Cnd_in_to_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_id_typ, true);
		p.Cnd_in_to_id_typ.setLinkBeans(p.Cnd_in_to_id_typ_nm);
		p.CndPanel.add(p.Cnd_in_to_id_typ_Label);
		p.CndPanel.add(p.Cnd_in_to_id_typ);
		p.Cnd_in_to_id_typ.setNextBeans(p.Cnd_in_to_id_typ_nm);
		p.Cnd_in_to_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.in_to_id_typ_META);
		p.CndPanel.add(p.Cnd_in_to_id_typ_nm);
		p.Cnd_in_to_id_typ_nm.setNextBeans(p.Cnd_in_to_id_cd);
		p.Cnd_in_to_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.in_to_id_typ_nm_META);
		p.Cnd_in_to_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_id_cd, true);
		p.Cnd_in_to_id_cd.setLinkBeans(p.Cnd_in_to_id_nm);
		p.CndPanel.add(p.Cnd_in_to_id_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_id_cd);
		p.Cnd_in_to_id_cd.setNextBeans(p.Cnd_in_to_id_nm);
		p.Cnd_in_to_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.in_to_id_cd_META);
		p.CndPanel.add(p.Cnd_in_to_id_nm);
		p.Cnd_in_to_id_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_in_to_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.in_to_id_nm_META);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_purc_schd_no);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.trd_nm_META);
		p.CndPanel.add(p.Cnd_purc_schd_no_Label);
		p.CndPanel.add(p.Cnd_purc_schd_no);
		p.Cnd_purc_schd_no.setNextBeans(p.Cnd_arr_schd_no);
		p.Cnd_purc_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.purc_schd_no_META);
		p.CndPanel.add(p.Cnd_arr_schd_no_Label);
		p.CndPanel.add(p.Cnd_arr_schd_no);
		p.Cnd_arr_schd_no.setNextBeans(p.Cnd_arr_act_no);
		p.Cnd_arr_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.arr_schd_no_META);
		p.setPluralValueEnable(p.Cnd_arr_schd_no, true);
		p.CndPanel.add(p.Cnd_arr_act_no_Label);
		p.CndPanel.add(p.Cnd_arr_act_no);
		p.Cnd_arr_act_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_arr_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.arr_act_no_META);
		p.setPluralValueEnable(p.Cnd_arr_act_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_incl_not_aprv_flg);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.slo_d_no_META);
		p.CndPanel.add(p.Cnd_incl_not_aprv_flg);
		p.Cnd_incl_not_aprv_flg.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_incl_not_aprv_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.incl_not_aprv_flg_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
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
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2200.CndR.sub_char3_META);
		p.SpplBpCndPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.SpplBpCndPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_RcptIvTrgtSel p) {
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
	protected static void jbInitRPnl(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_RcptIvTrgtSel p) {
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
	protected static void jbInitBtn(MSBEP_RcptIvTrgtSel p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2210.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP2210);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP2210);
		p.Btn_open_MSBEP2210.setNextBeans(p.Btn_chk_by_grp_no_flg);
		p.BtnPanel.add(p.Btn_chk_by_grp_no_flg);
		p.Btn_chk_by_grp_no_flg.setNextBeans(p.Btn_select_bndl_grp);
		p.Btn_chk_by_grp_no_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2200.BtnR.chk_by_grp_no_flg_META);
		p.BtnPanel.add(p.Btn_select_bndl_grp);
		p.Btn_select_bndl_grp.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2200.BtnR.select_bndl_grp_META);
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
		MSBEP_RcptIvTrgtSel_MC.mcInitSrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitPrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitTop((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitFold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitTab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitTab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitTab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitSpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitCtrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitRPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitRslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.mcInitBtn((MSBEP_RcptIvTrgtSel)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_SrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_PrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Top((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Fold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Tab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Tab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Tab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_SpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_ItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Cnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Ctrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_RPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Rslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH_Btn((MSBEP_RcptIvTrgtSel)this);

		// [SRCH_ARR_ACT]ステータスのモードの設定
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_SrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_PrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Top((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Fold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Tab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Tab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Tab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_SpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_ItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Cnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Ctrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_RPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Rslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitSRCH__ARR__ACT_Btn((MSBEP_RcptIvTrgtSel)this);

		// [REF]ステータスのモードの設定
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_SrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_PrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Top((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Fold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Tab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Tab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Tab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_SpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_ItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Cnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Ctrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_RPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Rslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF_Btn((MSBEP_RcptIvTrgtSel)this);

		// [REF_ARR_ACT]ステータスのモードの設定
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_SrchMode((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_PrStsTyp((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Top((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Fold((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Tab1((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Tab2((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Tab3((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_SpplBpCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_ItmCnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Cnd((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Ctrl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_RPnl((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Rslt((MSBEP_RcptIvTrgtSel)this);
		MSBEP_RcptIvTrgtSel_MC.statusInitREF__ARR__ACT_Btn((MSBEP_RcptIvTrgtSel)this);

	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [PrStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrStsTyp(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_RcptIvTrgtSel p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [SpplBpCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplBpCnd(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_RcptIvTrgtSel p) {
		p.Cnd_srch_mode_Group.addAllListener(p);
		p.Cnd_srch_mode_ARR_SCHD.addAllListener(p);
		p.Cnd_srch_mode_ARR_ACT.addAllListener(p);
		p.Cnd_not_arr_flg.addAllListener(p);
		p.Cnd_part_arr_flg.addAllListener(p);
		p.Cnd_arr_flg.addAllListener(p);
		p.Cnd_purc_schd_dt_fr.setListListener(p);
		p.Cnd_purc_schd_dt_fr.addAllListener(p);
		p.Cnd_purc_schd_dt_to.setListListener(p);
		p.Cnd_purc_schd_dt_to.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_in_to_id_typ.setListListener(p);
		p.Cnd_in_to_id_typ.addAllListener(p);
		p.Cnd_in_to_id_typ_nm.setListListener(p);
		p.Cnd_in_to_id_typ_nm.addAllListener(p);
		p.Cnd_in_to_id_cd.setListListener(p);
		p.Cnd_in_to_id_cd.addAllListener(p);
		p.Cnd_in_to_id_nm.setListListener(p);
		p.Cnd_in_to_id_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_purc_schd_no.setListListener(p);
		p.Cnd_purc_schd_no.addAllListener(p);
		p.Cnd_arr_schd_no.setListListener(p);
		p.Cnd_arr_schd_no.addAllListener(p);
		p.Cnd_arr_act_no.setListListener(p);
		p.Cnd_arr_act_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_incl_not_aprv_flg.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_RcptIvTrgtSel p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_RcptIvTrgtSel p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_RcptIvTrgtSel p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_sim_cnd_grp_no.addAllListener(p);
		p.columnRslt_sim_cnd_grp_no.setListListener(p);
		p.columnRslt_bndl_tgt_flg.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_arr_schd_no.addAllListener(p);
		p.columnRslt_arr_schd_no.setListListener(p);
		p.columnRslt_arr_act_no.addAllListener(p);
		p.columnRslt_arr_act_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_purc_schd_dt.addAllListener(p);
		p.columnRslt_purc_schd_dt.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_purc_amt_rnd_typ.addAllListener(p);
		p.columnRslt_purc_amt_rnd_typ.setListListener(p);
		p.columnRslt_purc_tax_rnd_typ.addAllListener(p);
		p.columnRslt_purc_tax_rnd_typ.setListListener(p);
		p.columnRslt_prnt_lcl_cd.addAllListener(p);
		p.columnRslt_prnt_lcl_cd.setListListener(p);
		p.columnRslt_in_to_id_typ.addAllListener(p);
		p.columnRslt_in_to_id_typ.setListListener(p);
		p.columnRslt_in_to_id_typ_nm.addAllListener(p);
		p.columnRslt_in_to_id_typ_nm.setListListener(p);
		p.columnRslt_in_to_id_cd.addAllListener(p);
		p.columnRslt_in_to_id_cd.setListListener(p);
		p.columnRslt_in_to_id_nm.addAllListener(p);
		p.columnRslt_in_to_id_nm.setListListener(p);
		p.columnRslt_in_to_cntct_dpt.addAllListener(p);
		p.columnRslt_in_to_cntct_dpt.setListListener(p);
		p.columnRslt_in_to_cntct_psn.addAllListener(p);
		p.columnRslt_in_to_cntct_psn.setListListener(p);
		p.columnRslt_in_to_zip_cd.addAllListener(p);
		p.columnRslt_in_to_zip_cd.setListListener(p);
		p.columnRslt_in_to_addr1.addAllListener(p);
		p.columnRslt_in_to_addr1.setListListener(p);
		p.columnRslt_in_to_addr2.addAllListener(p);
		p.columnRslt_in_to_addr2.setListListener(p);
		p.columnRslt_in_to_addr3.addAllListener(p);
		p.columnRslt_in_to_addr3.setListListener(p);
		p.columnRslt_in_to_addr4.addAllListener(p);
		p.columnRslt_in_to_addr4.setListListener(p);
		p.columnRslt_in_to_tel.addAllListener(p);
		p.columnRslt_in_to_tel.setListListener(p);
		p.columnRslt_in_to_fax.addAllListener(p);
		p.columnRslt_in_to_fax.setListListener(p);
		p.columnRslt_in_to_cntry_cd.addAllListener(p);
		p.columnRslt_in_to_cntry_cd.setListListener(p);
		p.columnRslt_in_to_cntry_nm.addAllListener(p);
		p.columnRslt_in_to_cntry_nm.setListListener(p);
		p.columnRslt_purc_usr_cd.addAllListener(p);
		p.columnRslt_purc_usr_cd.setListListener(p);
		p.columnRslt_purc_usr_nm.addAllListener(p);
		p.columnRslt_purc_usr_nm.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_qty.addAllListener(p);
		p.columnRslt_trd_unit_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_qty.addAllListener(p);
		p.columnRslt_base_unit_qty.setListListener(p);
		p.columnRslt_arr_schd_qty.addAllListener(p);
		p.columnRslt_arr_schd_qty.setListListener(p);
		p.columnRslt_arr_act_qty.addAllListener(p);
		p.columnRslt_arr_act_qty.setListListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_tax_rate.addAllListener(p);
		p.columnRslt_tax_rate.setListListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_trd_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_upri_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
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
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_sppl_itm_cd.addAllListener(p);
		p.columnRslt_sppl_itm_cd.setListListener(p);
		p.columnRslt_sppl_itm_nm.addAllListener(p);
		p.columnRslt_sppl_itm_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
		p.columnRslt_vssl_flght.addAllListener(p);
		p.columnRslt_vssl_flght.setListListener(p);
		p.columnRslt_load_port_cd.addAllListener(p);
		p.columnRslt_load_port_cd.setListListener(p);
		p.columnRslt_load_port_nm.addAllListener(p);
		p.columnRslt_load_port_nm.setListListener(p);
		p.columnRslt_etd_dt.addAllListener(p);
		p.columnRslt_etd_dt.setListListener(p);
		p.columnRslt_dschrg_port_cd.addAllListener(p);
		p.columnRslt_dschrg_port_cd.setListListener(p);
		p.columnRslt_dschrg_port_nm.addAllListener(p);
		p.columnRslt_dschrg_port_nm.setListListener(p);
		p.columnRslt_eta_dt.addAllListener(p);
		p.columnRslt_eta_dt.setListListener(p);
		p.columnRslt_via_port_cd.addAllListener(p);
		p.columnRslt_via_port_cd.setListListener(p);
		p.columnRslt_via_port_nm.addAllListener(p);
		p.columnRslt_via_port_nm.setListListener(p);
		p.columnRslt_via_schd_dt.addAllListener(p);
		p.columnRslt_via_schd_dt.setListListener(p);
		p.columnRslt_purc_tterm_cd1.addAllListener(p);
		p.columnRslt_purc_tterm_cd1.setListListener(p);
		p.columnRslt_purc_tterm_nm1.addAllListener(p);
		p.columnRslt_purc_tterm_nm1.setListListener(p);
		p.columnRslt_purc_tterm_rmrks1.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks1.setListListener(p);
		p.columnRslt_purc_tterm_cd2.addAllListener(p);
		p.columnRslt_purc_tterm_cd2.setListListener(p);
		p.columnRslt_purc_tterm_nm2.addAllListener(p);
		p.columnRslt_purc_tterm_nm2.setListListener(p);
		p.columnRslt_purc_tterm_rmrks2.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks2.setListListener(p);
		p.columnRslt_purc_tterm_cd3.addAllListener(p);
		p.columnRslt_purc_tterm_cd3.setListListener(p);
		p.columnRslt_purc_tterm_nm3.addAllListener(p);
		p.columnRslt_purc_tterm_nm3.setListListener(p);
		p.columnRslt_purc_tterm_rmrks3.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks3.setListListener(p);
		p.columnRslt_aprv_no.addAllListener(p);
		p.columnRslt_aprv_no.setListListener(p);
		p.columnRslt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_aprv_sts_typ.setListListener(p);
		p.columnRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_po_print_rmrks.addAllListener(p);
		p.columnRslt_po_print_rmrks.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_slo_trd_ptn_typ.addAllListener(p);
		p.columnRslt_slo_trd_ptn_typ.setListListener(p);
		p.columnRslt_slo_trd_ptn_typ_nm.addAllListener(p);
		p.columnRslt_slo_trd_ptn_typ_nm.setListListener(p);
		p.columnRslt_slo_cur_cd.addAllListener(p);
		p.columnRslt_slo_cur_cd.setListListener(p);
		p.columnRslt_slo_cur_nm.addAllListener(p);
		p.columnRslt_slo_cur_nm.setListListener(p);
		p.columnRslt_slo_xrate.addAllListener(p);
		p.columnRslt_slo_xrate.setListListener(p);
		p.columnRslt_slo_ptax_xrate.addAllListener(p);
		p.columnRslt_slo_ptax_xrate.setListListener(p);
		p.columnRslt_sls_basis_typ.addAllListener(p);
		p.columnRslt_sls_basis_typ.setListListener(p);
		p.columnRslt_sls_basis_typ_nm.addAllListener(p);
		p.columnRslt_sls_basis_typ_nm.setListListener(p);
		p.columnRslt_slo_tterm_cd1.addAllListener(p);
		p.columnRslt_slo_tterm_cd1.setListListener(p);
		p.columnRslt_slo_tterm_nm1.addAllListener(p);
		p.columnRslt_slo_tterm_nm1.setListListener(p);
		p.columnRslt_slo_tterm_rmrks1.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks1.setListListener(p);
		p.columnRslt_slo_tterm_cd2.addAllListener(p);
		p.columnRslt_slo_tterm_cd2.setListListener(p);
		p.columnRslt_slo_tterm_nm2.addAllListener(p);
		p.columnRslt_slo_tterm_nm2.setListListener(p);
		p.columnRslt_slo_tterm_rmrks2.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks2.setListListener(p);
		p.columnRslt_slo_tterm_cd3.addAllListener(p);
		p.columnRslt_slo_tterm_cd3.setListListener(p);
		p.columnRslt_slo_tterm_nm3.addAllListener(p);
		p.columnRslt_slo_tterm_nm3.setListListener(p);
		p.columnRslt_slo_tterm_rmrks3.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks3.setListListener(p);
		p.columnRslt_purc_basis_typ.addAllListener(p);
		p.columnRslt_purc_basis_typ.setListListener(p);
		p.columnRslt_purc_basis_typ_nm.addAllListener(p);
		p.columnRslt_purc_basis_typ_nm.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_selectable_flg.addAllListener(p);
		p.columnRslt_pay_spot_flg.addAllListener(p);
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
	protected static void mcInitBtn(MSBEP_RcptIvTrgtSel p) {
		p.Btn_open_MSBEP2210.addAllListener(p);
		p.Btn_open_MSBEP2210.setAPMethodName("doBtn_open_MSBEP2210");
		p.Btn_chk_by_grp_no_flg.addAllListener(p);
		p.Btn_select_bndl_grp.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchMode(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PrStsTyp(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SpplBpCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_RcptIvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_not_arr_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_part_arr_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_not_aprv_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_RcptIvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_RcptIvTrgtSel p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bndl_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_in_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_inc_ctax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_selectable_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_RcptIvTrgtSel p){
		p.Btn_open_MSBEP2210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_bndl_grp.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_SrchMode(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_PrStsTyp(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Top(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Fold(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Tab1(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Tab2(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Tab3(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_SpplBpCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_ItmCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Cnd(MSBEP_RcptIvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_not_arr_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_flg.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_schd_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_incl_not_aprv_flg.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_ARR_ACT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Ctrl(MSBEP_RcptIvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_RPnl(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Rslt(MSBEP_RcptIvTrgtSel p){
		p.columnRslt_check.putMode(p, SRCH_ARR_ACT, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_bndl_tgt_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_in_to_id_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_dpt.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_psn.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_zip_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr4.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_tel.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_fax.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_qty.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_inc_ctax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_cd.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_selectable_flg.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_pay_spot_flg.putMode(p, SRCH_ARR_ACT, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH_ARR_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_ARR_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_ARR_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__ARR__ACT_Btn(MSBEP_RcptIvTrgtSel p){
		p.Btn_open_MSBEP2210.putMode(p, SRCH_ARR_ACT, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH_ARR_ACT, MCMode.DISABLE);
		p.Btn_select_bndl_grp.putMode(p, SRCH_ARR_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchMode(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_PrStsTyp(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_SpplBpCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_RcptIvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_arr_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_part_arr_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_arr_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_arr_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_not_aprv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_RcptIvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_RcptIvTrgtSel p){
		p.columnRslt_check.putMode(p, REF, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bndl_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_in_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_inc_ctax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_selectable_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pay_spot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_RcptIvTrgtSel p){
		p.Btn_open_MSBEP2210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_bndl_grp.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF_ARR_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_SrchMode(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_PrStsTyp(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Top(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Fold(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Tab1(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Tab2(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Tab3(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[SpplBpCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_SpplBpCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_ItmCnd(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Cnd(MSBEP_RcptIvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_not_arr_flg.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Cnd_part_arr_flg.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_flg.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_schd_dt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_typ.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Cnd_in_to_id_cd.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_in_to_id_nm.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_purc_schd_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_schd_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_incl_not_aprv_flg.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Ctrl(MSBEP_RcptIvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_ARR_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_ARR_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_RPnl(MSBEP_RcptIvTrgtSel p){

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Rslt(MSBEP_RcptIvTrgtSel p){
		p.columnRslt_check.putMode(p, REF_ARR_ACT, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_bndl_tgt_flg.putMode(p, REF_ARR_ACT, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_in_to_id_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_id_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_dpt.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntct_psn.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_zip_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_addr4.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_tel.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_fax.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_in_to_cntry_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_qty.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_repurc_obli_flg.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_inc_ctax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_aprv_sts_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_trd_ptn_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_cd.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_cur_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_cd3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_nm3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_selectable_flg.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.columnRslt_pay_spot_flg.putMode(p, REF_ARR_ACT, MCMode.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF_ARR_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ARR_ACT, MCMode.READ_ONLY);

	}

	/**
	 * [REF_ARR_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ARR__ACT_Btn(MSBEP_RcptIvTrgtSel p){
		p.Btn_open_MSBEP2210.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, REF_ARR_ACT, MCMode.ENABLE);
		p.Btn_select_bndl_grp.putMode(p, REF_ARR_ACT, MCMode.ENABLE);

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
		MSBEP_RcptIvTrgtSel_MC.setTableConfigRslt((MSBEP_RcptIvTrgtSel)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_RcptIvTrgtSel p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_sim_cnd_grp_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sim_cnd_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sim_cnd_grp_no);
		p.columnRslt_bndl_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.bndl_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bndl_tgt_flg);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_arr_schd_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.arr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_no);
		p.columnRslt_arr_act_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.arr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_act_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_purc_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_schd_dt_META);
		p.columnRslt_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_dt);
		p.RsltTable.addTable(p.Rslt_arr_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_arr_dt_p_PPanel.YmdHmTable);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_purc_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_amt_rnd_typ);
		p.columnRslt_purc_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tax_rnd_typ);
		p.columnRslt_prnt_lcl_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.prnt_lcl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_lcl_cd);
		p.columnRslt_in_to_id_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_typ);
		p.columnRslt_in_to_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_typ_nm);
		p.columnRslt_in_to_id_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_cd);
		p.columnRslt_in_to_id_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_id_nm);
		p.columnRslt_in_to_cntct_dpt.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_cntct_dpt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_cntct_dpt);
		p.columnRslt_in_to_cntct_psn.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_cntct_psn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_cntct_psn);
		p.columnRslt_in_to_zip_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_zip_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_zip_cd);
		p.columnRslt_in_to_addr1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_addr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_addr1);
		p.columnRslt_in_to_addr2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_addr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_addr2);
		p.columnRslt_in_to_addr3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_addr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_addr3);
		p.columnRslt_in_to_addr4.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_addr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_addr4);
		p.columnRslt_in_to_tel.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_tel_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_tel);
		p.columnRslt_in_to_fax.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_fax_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_fax);
		p.columnRslt_in_to_cntry_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_cntry_cd);
		p.columnRslt_in_to_cntry_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.in_to_cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_to_cntry_nm);
		p.columnRslt_purc_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_cd);
		p.columnRslt_purc_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_nm);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_qty.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty);
		p.columnRslt_arr_schd_qty.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.arr_schd_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_qty);
		p.columnRslt_arr_act_qty.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.arr_act_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_act_qty);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_inc_ctax_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.columnRslt_trd_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_upri_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_amt_dec_place);
		p.columnRslt_base_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.base_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_upri_dec_place);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_amt_dec_place);
		p.columnRslt_ptax_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_upri_dec_place);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_sppl_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sppl_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_cd);
		p.columnRslt_sppl_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sppl_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_nm);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.SnoTable);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_dschrg_port_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.dschrg_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_cd);
		p.columnRslt_dschrg_port_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.dschrg_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_nm);
		p.columnRslt_eta_dt.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.eta_dt_META);
		p.columnRslt_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_eta_dt);
		p.columnRslt_via_port_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.via_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_cd);
		p.columnRslt_via_port_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.via_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_nm);
		p.columnRslt_via_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.via_schd_dt_META);
		p.columnRslt_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_via_schd_dt);
		p.columnRslt_purc_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd1);
		p.columnRslt_purc_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm1);
		p.columnRslt_purc_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks1);
		p.columnRslt_purc_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd2);
		p.columnRslt_purc_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm2);
		p.columnRslt_purc_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks2);
		p.columnRslt_purc_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd3);
		p.columnRslt_purc_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm3);
		p.columnRslt_purc_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks3);
		p.columnRslt_aprv_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.aprv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_no);
		p.columnRslt_aprv_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ);
		p.columnRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_aprv_sts_typ_nm);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_po_print_rmrks.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.po_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_print_rmrks);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_slo_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_trd_ptn_typ);
		p.columnRslt_slo_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_trd_ptn_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_trd_ptn_typ_nm);
		p.columnRslt_slo_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_cur_cd);
		p.columnRslt_slo_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_cur_nm);
		p.columnRslt_slo_xrate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_xrate);
		p.columnRslt_slo_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_ptax_xrate);
		p.columnRslt_sls_basis_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sls_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ);
		p.columnRslt_sls_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sls_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ_nm);
		p.columnRslt_slo_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_cd1);
		p.columnRslt_slo_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_nm1);
		p.columnRslt_slo_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks1);
		p.columnRslt_slo_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_cd2);
		p.columnRslt_slo_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_nm2);
		p.columnRslt_slo_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks2);
		p.columnRslt_slo_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_cd3);
		p.columnRslt_slo_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_nm3);
		p.columnRslt_slo_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.slo_tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks3);
		p.columnRslt_purc_basis_typ.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_basis_typ);
		p.columnRslt_purc_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.purc_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_basis_typ_nm);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_selectable_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.selectable_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_selectable_flg);
		p.columnRslt_pay_spot_flg.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.pay_spot_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_spot_flg);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.RsltTable.addTable(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2200.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_in_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_id_typ.getListConfig().setPutter(getCnd_in_to_id_typ_ListPutter());
		Cnd_in_to_id_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_id_cd.getListConfig().setPutter(getCnd_in_to_id_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
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
	 * この画面を[SRCH_ARR_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_ARR_ACTStatus() {
		status = SRCH_ARR_ACT;
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
	 * この画面を[REF_ARR_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ARR_ACTStatus() {
		status = REF_ARR_ACT;
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
		else if (SRCH_ARR_ACT.equals(status)) {
			setSRCH_ARR_ACTStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (REF_ARR_ACT.equals(status)) {
			setREF_ARR_ACTStatus();
		}
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
	 * [Cnd_in_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InToIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_in_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.InToId");
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
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_in_to_id_typ) return getCnd_in_to_id_typ(row, info);
		if(combo == Cnd_in_to_id_cd) return getCnd_in_to_id_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
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
		else if (ap == Btn_open_MSBEP2210) doBtn_open_MSBEP2210(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2210(MCEventInfo info);

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
		if (vc == Cnd_srch_mode_Group) return doCnd_srch_mode_VC(info);
		if (vc == Cnd_not_arr_flg) return doCnd_not_arr_flg_VC(info);
		if (vc == Cnd_part_arr_flg) return doCnd_part_arr_flg_VC(info);
		if (vc == Cnd_arr_flg) return doCnd_arr_flg_VC(info);
		if (vc == Cnd_purc_schd_dt_fr) return doCnd_purc_schd_dt_fr_VC(info);
		if (vc == Cnd_purc_schd_dt_to) return doCnd_purc_schd_dt_to_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_in_to_id_typ) return doCnd_in_to_id_typ_VC(info);
		if (vc == Cnd_in_to_id_typ_nm) return doCnd_in_to_id_typ_nm_VC(info);
		if (vc == Cnd_in_to_id_cd) return doCnd_in_to_id_cd_VC(info);
		if (vc == Cnd_in_to_id_nm) return doCnd_in_to_id_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_purc_schd_no) return doCnd_purc_schd_no_VC(info);
		if (vc == Cnd_arr_schd_no) return doCnd_arr_schd_no_VC(info);
		if (vc == Cnd_arr_act_no) return doCnd_arr_act_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_incl_not_aprv_flg) return doCnd_incl_not_aprv_flg_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_sim_cnd_grp_no) return doRslt_sim_cnd_grp_no_VC(info);
		if (vc == columnRslt_bndl_tgt_flg) return doRslt_bndl_tgt_flg_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_arr_schd_no) return doRslt_arr_schd_no_VC(info);
		if (vc == columnRslt_arr_act_no) return doRslt_arr_act_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_purc_schd_dt) return doRslt_purc_schd_dt_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_purc_amt_rnd_typ) return doRslt_purc_amt_rnd_typ_VC(info);
		if (vc == columnRslt_purc_tax_rnd_typ) return doRslt_purc_tax_rnd_typ_VC(info);
		if (vc == columnRslt_prnt_lcl_cd) return doRslt_prnt_lcl_cd_VC(info);
		if (vc == columnRslt_in_to_id_typ) return doRslt_in_to_id_typ_VC(info);
		if (vc == columnRslt_in_to_id_typ_nm) return doRslt_in_to_id_typ_nm_VC(info);
		if (vc == columnRslt_in_to_id_cd) return doRslt_in_to_id_cd_VC(info);
		if (vc == columnRslt_in_to_id_nm) return doRslt_in_to_id_nm_VC(info);
		if (vc == columnRslt_in_to_cntct_dpt) return doRslt_in_to_cntct_dpt_VC(info);
		if (vc == columnRslt_in_to_cntct_psn) return doRslt_in_to_cntct_psn_VC(info);
		if (vc == columnRslt_in_to_zip_cd) return doRslt_in_to_zip_cd_VC(info);
		if (vc == columnRslt_in_to_addr1) return doRslt_in_to_addr1_VC(info);
		if (vc == columnRslt_in_to_addr2) return doRslt_in_to_addr2_VC(info);
		if (vc == columnRslt_in_to_addr3) return doRslt_in_to_addr3_VC(info);
		if (vc == columnRslt_in_to_addr4) return doRslt_in_to_addr4_VC(info);
		if (vc == columnRslt_in_to_tel) return doRslt_in_to_tel_VC(info);
		if (vc == columnRslt_in_to_fax) return doRslt_in_to_fax_VC(info);
		if (vc == columnRslt_in_to_cntry_cd) return doRslt_in_to_cntry_cd_VC(info);
		if (vc == columnRslt_in_to_cntry_nm) return doRslt_in_to_cntry_nm_VC(info);
		if (vc == columnRslt_purc_usr_cd) return doRslt_purc_usr_cd_VC(info);
		if (vc == columnRslt_purc_usr_nm) return doRslt_purc_usr_nm_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_qty) return doRslt_trd_unit_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_qty) return doRslt_base_unit_qty_VC(info);
		if (vc == columnRslt_arr_schd_qty) return doRslt_arr_schd_qty_VC(info);
		if (vc == columnRslt_arr_act_qty) return doRslt_arr_act_qty_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_upri_dec_place) return doRslt_trd_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_amt_dec_place) return doRslt_base_amt_dec_place_VC(info);
		if (vc == columnRslt_base_upri_dec_place) return doRslt_base_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_amt_dec_place) return doRslt_ptax_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_upri_dec_place) return doRslt_ptax_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_sppl_itm_cd) return doRslt_sppl_itm_cd_VC(info);
		if (vc == columnRslt_sppl_itm_nm) return doRslt_sppl_itm_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_vssl_flght) return doRslt_vssl_flght_VC(info);
		if (vc == columnRslt_load_port_cd) return doRslt_load_port_cd_VC(info);
		if (vc == columnRslt_load_port_nm) return doRslt_load_port_nm_VC(info);
		if (vc == columnRslt_etd_dt) return doRslt_etd_dt_VC(info);
		if (vc == columnRslt_dschrg_port_cd) return doRslt_dschrg_port_cd_VC(info);
		if (vc == columnRslt_dschrg_port_nm) return doRslt_dschrg_port_nm_VC(info);
		if (vc == columnRslt_eta_dt) return doRslt_eta_dt_VC(info);
		if (vc == columnRslt_via_port_cd) return doRslt_via_port_cd_VC(info);
		if (vc == columnRslt_via_port_nm) return doRslt_via_port_nm_VC(info);
		if (vc == columnRslt_via_schd_dt) return doRslt_via_schd_dt_VC(info);
		if (vc == columnRslt_purc_tterm_cd1) return doRslt_purc_tterm_cd1_VC(info);
		if (vc == columnRslt_purc_tterm_nm1) return doRslt_purc_tterm_nm1_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks1) return doRslt_purc_tterm_rmrks1_VC(info);
		if (vc == columnRslt_purc_tterm_cd2) return doRslt_purc_tterm_cd2_VC(info);
		if (vc == columnRslt_purc_tterm_nm2) return doRslt_purc_tterm_nm2_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks2) return doRslt_purc_tterm_rmrks2_VC(info);
		if (vc == columnRslt_purc_tterm_cd3) return doRslt_purc_tterm_cd3_VC(info);
		if (vc == columnRslt_purc_tterm_nm3) return doRslt_purc_tterm_nm3_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks3) return doRslt_purc_tterm_rmrks3_VC(info);
		if (vc == columnRslt_aprv_no) return doRslt_aprv_no_VC(info);
		if (vc == columnRslt_aprv_sts_typ) return doRslt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_aprv_sts_typ_nm) return doRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_po_print_rmrks) return doRslt_po_print_rmrks_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_slo_trd_ptn_typ) return doRslt_slo_trd_ptn_typ_VC(info);
		if (vc == columnRslt_slo_trd_ptn_typ_nm) return doRslt_slo_trd_ptn_typ_nm_VC(info);
		if (vc == columnRslt_slo_cur_cd) return doRslt_slo_cur_cd_VC(info);
		if (vc == columnRslt_slo_cur_nm) return doRslt_slo_cur_nm_VC(info);
		if (vc == columnRslt_slo_xrate) return doRslt_slo_xrate_VC(info);
		if (vc == columnRslt_slo_ptax_xrate) return doRslt_slo_ptax_xrate_VC(info);
		if (vc == columnRslt_sls_basis_typ) return doRslt_sls_basis_typ_VC(info);
		if (vc == columnRslt_sls_basis_typ_nm) return doRslt_sls_basis_typ_nm_VC(info);
		if (vc == columnRslt_slo_tterm_cd1) return doRslt_slo_tterm_cd1_VC(info);
		if (vc == columnRslt_slo_tterm_nm1) return doRslt_slo_tterm_nm1_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks1) return doRslt_slo_tterm_rmrks1_VC(info);
		if (vc == columnRslt_slo_tterm_cd2) return doRslt_slo_tterm_cd2_VC(info);
		if (vc == columnRslt_slo_tterm_nm2) return doRslt_slo_tterm_nm2_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks2) return doRslt_slo_tterm_rmrks2_VC(info);
		if (vc == columnRslt_slo_tterm_cd3) return doRslt_slo_tterm_cd3_VC(info);
		if (vc == columnRslt_slo_tterm_nm3) return doRslt_slo_tterm_nm3_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks3) return doRslt_slo_tterm_rmrks3_VC(info);
		if (vc == columnRslt_purc_basis_typ) return doRslt_purc_basis_typ_VC(info);
		if (vc == columnRslt_purc_basis_typ_nm) return doRslt_purc_basis_typ_nm_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_selectable_flg) return doRslt_selectable_flg_VC(info);
		if (vc == columnRslt_pay_spot_flg) return doRslt_pay_spot_flg_VC(info);
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
		if (vc == Btn_chk_by_grp_no_flg) return doBtn_chk_by_grp_no_flg_VC(info);
		if (vc == Btn_select_bndl_grp) return doBtn_select_bndl_grp_VC(info);
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
	 * [Cnd]パネルの[srch_mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_arr_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_id_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[arr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_arr_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[incl_not_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_not_aprv_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sim_cnd_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sim_cnd_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bndl_tgt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_to_cntry_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_act_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_etd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[eta_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_eta_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_print_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[selectable_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_selectable_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_spot_flg_VC(MCEventInfo info){
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
	 * [Btn]パネルの[chk_by_grp_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_chk_by_grp_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_select_bndl_grp_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_mode_Group) doCnd_srch_mode_NC(info);
		else if (nc == Cnd_not_arr_flg) doCnd_not_arr_flg_NC(info);
		else if (nc == Cnd_part_arr_flg) doCnd_part_arr_flg_NC(info);
		else if (nc == Cnd_arr_flg) doCnd_arr_flg_NC(info);
		else if (nc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NC(info);
		else if (nc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NC(info);
		else if (nc == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NC(info);
		else if (nc == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NC(info);
		else if (nc == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_purc_schd_no) doCnd_purc_schd_no_NC(info);
		else if (nc == Cnd_arr_schd_no) doCnd_arr_schd_no_NC(info);
		else if (nc == Cnd_arr_act_no) doCnd_arr_act_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_incl_not_aprv_flg) doCnd_incl_not_aprv_flg_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NC(info);
		else if (nc == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_arr_schd_no) doRslt_arr_schd_no_NC(info);
		else if (nc == columnRslt_arr_act_no) doRslt_arr_act_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NC(info);
		else if (nc == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NC(info);
		else if (nc == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NC(info);
		else if (nc == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NC(info);
		else if (nc == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NC(info);
		else if (nc == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NC(info);
		else if (nc == columnRslt_in_to_cntct_dpt) doRslt_in_to_cntct_dpt_NC(info);
		else if (nc == columnRslt_in_to_cntct_psn) doRslt_in_to_cntct_psn_NC(info);
		else if (nc == columnRslt_in_to_zip_cd) doRslt_in_to_zip_cd_NC(info);
		else if (nc == columnRslt_in_to_addr1) doRslt_in_to_addr1_NC(info);
		else if (nc == columnRslt_in_to_addr2) doRslt_in_to_addr2_NC(info);
		else if (nc == columnRslt_in_to_addr3) doRslt_in_to_addr3_NC(info);
		else if (nc == columnRslt_in_to_addr4) doRslt_in_to_addr4_NC(info);
		else if (nc == columnRslt_in_to_tel) doRslt_in_to_tel_NC(info);
		else if (nc == columnRslt_in_to_fax) doRslt_in_to_fax_NC(info);
		else if (nc == columnRslt_in_to_cntry_cd) doRslt_in_to_cntry_cd_NC(info);
		else if (nc == columnRslt_in_to_cntry_nm) doRslt_in_to_cntry_nm_NC(info);
		else if (nc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NC(info);
		else if (nc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_qty) doRslt_trd_unit_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_qty) doRslt_base_unit_qty_NC(info);
		else if (nc == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NC(info);
		else if (nc == columnRslt_arr_act_qty) doRslt_arr_act_qty_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NC(info);
		else if (nc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_vssl_flght) doRslt_vssl_flght_NC(info);
		else if (nc == columnRslt_load_port_cd) doRslt_load_port_cd_NC(info);
		else if (nc == columnRslt_load_port_nm) doRslt_load_port_nm_NC(info);
		else if (nc == columnRslt_etd_dt) doRslt_etd_dt_NC(info);
		else if (nc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NC(info);
		else if (nc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NC(info);
		else if (nc == columnRslt_eta_dt) doRslt_eta_dt_NC(info);
		else if (nc == columnRslt_via_port_cd) doRslt_via_port_cd_NC(info);
		else if (nc == columnRslt_via_port_nm) doRslt_via_port_nm_NC(info);
		else if (nc == columnRslt_via_schd_dt) doRslt_via_schd_dt_NC(info);
		else if (nc == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NC(info);
		else if (nc == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NC(info);
		else if (nc == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NC(info);
		else if (nc == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_aprv_no) doRslt_aprv_no_NC(info);
		else if (nc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_slo_trd_ptn_typ) doRslt_slo_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_slo_trd_ptn_typ_nm) doRslt_slo_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRslt_slo_cur_cd) doRslt_slo_cur_cd_NC(info);
		else if (nc == columnRslt_slo_cur_nm) doRslt_slo_cur_nm_NC(info);
		else if (nc == columnRslt_slo_xrate) doRslt_slo_xrate_NC(info);
		else if (nc == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NC(info);
		else if (nc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NC(info);
		else if (nc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NC(info);
		else if (nc == columnRslt_slo_tterm_cd1) doRslt_slo_tterm_cd1_NC(info);
		else if (nc == columnRslt_slo_tterm_nm1) doRslt_slo_tterm_nm1_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_slo_tterm_cd2) doRslt_slo_tterm_cd2_NC(info);
		else if (nc == columnRslt_slo_tterm_nm2) doRslt_slo_tterm_nm2_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_slo_tterm_cd3) doRslt_slo_tterm_cd3_NC(info);
		else if (nc == columnRslt_slo_tterm_nm3) doRslt_slo_tterm_nm3_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NC(info);
		else if (nc == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_selectable_flg) doRslt_selectable_flg_NC(info);
		else if (nc == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NC(info);
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
		else if (nc == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NC(info);
		else if (nc == Btn_select_bndl_grp) doBtn_select_bndl_grp_NC(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_not_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_aprv_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_cnd_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_cnd_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_tel_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_fax_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[selectable_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_selectable_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NC(MCEventInfo info){
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
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_mode_Group) doCnd_srch_mode_NE(info);
		else if (ne == Cnd_not_arr_flg) doCnd_not_arr_flg_NE(info);
		else if (ne == Cnd_part_arr_flg) doCnd_part_arr_flg_NE(info);
		else if (ne == Cnd_arr_flg) doCnd_arr_flg_NE(info);
		else if (ne == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NE(info);
		else if (ne == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NE(info);
		else if (ne == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NE(info);
		else if (ne == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NE(info);
		else if (ne == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_purc_schd_no) doCnd_purc_schd_no_NE(info);
		else if (ne == Cnd_arr_schd_no) doCnd_arr_schd_no_NE(info);
		else if (ne == Cnd_arr_act_no) doCnd_arr_act_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_incl_not_aprv_flg) doCnd_incl_not_aprv_flg_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NE(info);
		else if (ne == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_arr_schd_no) doRslt_arr_schd_no_NE(info);
		else if (ne == columnRslt_arr_act_no) doRslt_arr_act_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NE(info);
		else if (ne == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NE(info);
		else if (ne == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NE(info);
		else if (ne == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NE(info);
		else if (ne == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NE(info);
		else if (ne == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NE(info);
		else if (ne == columnRslt_in_to_cntct_dpt) doRslt_in_to_cntct_dpt_NE(info);
		else if (ne == columnRslt_in_to_cntct_psn) doRslt_in_to_cntct_psn_NE(info);
		else if (ne == columnRslt_in_to_zip_cd) doRslt_in_to_zip_cd_NE(info);
		else if (ne == columnRslt_in_to_addr1) doRslt_in_to_addr1_NE(info);
		else if (ne == columnRslt_in_to_addr2) doRslt_in_to_addr2_NE(info);
		else if (ne == columnRslt_in_to_addr3) doRslt_in_to_addr3_NE(info);
		else if (ne == columnRslt_in_to_addr4) doRslt_in_to_addr4_NE(info);
		else if (ne == columnRslt_in_to_tel) doRslt_in_to_tel_NE(info);
		else if (ne == columnRslt_in_to_fax) doRslt_in_to_fax_NE(info);
		else if (ne == columnRslt_in_to_cntry_cd) doRslt_in_to_cntry_cd_NE(info);
		else if (ne == columnRslt_in_to_cntry_nm) doRslt_in_to_cntry_nm_NE(info);
		else if (ne == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NE(info);
		else if (ne == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_qty) doRslt_trd_unit_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_qty) doRslt_base_unit_qty_NE(info);
		else if (ne == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NE(info);
		else if (ne == columnRslt_arr_act_qty) doRslt_arr_act_qty_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NE(info);
		else if (ne == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_vssl_flght) doRslt_vssl_flght_NE(info);
		else if (ne == columnRslt_load_port_cd) doRslt_load_port_cd_NE(info);
		else if (ne == columnRslt_load_port_nm) doRslt_load_port_nm_NE(info);
		else if (ne == columnRslt_etd_dt) doRslt_etd_dt_NE(info);
		else if (ne == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NE(info);
		else if (ne == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NE(info);
		else if (ne == columnRslt_eta_dt) doRslt_eta_dt_NE(info);
		else if (ne == columnRslt_via_port_cd) doRslt_via_port_cd_NE(info);
		else if (ne == columnRslt_via_port_nm) doRslt_via_port_nm_NE(info);
		else if (ne == columnRslt_via_schd_dt) doRslt_via_schd_dt_NE(info);
		else if (ne == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NE(info);
		else if (ne == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NE(info);
		else if (ne == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NE(info);
		else if (ne == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_aprv_no) doRslt_aprv_no_NE(info);
		else if (ne == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_slo_trd_ptn_typ) doRslt_slo_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_slo_trd_ptn_typ_nm) doRslt_slo_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRslt_slo_cur_cd) doRslt_slo_cur_cd_NE(info);
		else if (ne == columnRslt_slo_cur_nm) doRslt_slo_cur_nm_NE(info);
		else if (ne == columnRslt_slo_xrate) doRslt_slo_xrate_NE(info);
		else if (ne == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NE(info);
		else if (ne == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NE(info);
		else if (ne == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NE(info);
		else if (ne == columnRslt_slo_tterm_cd1) doRslt_slo_tterm_cd1_NE(info);
		else if (ne == columnRslt_slo_tterm_nm1) doRslt_slo_tterm_nm1_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_slo_tterm_cd2) doRslt_slo_tterm_cd2_NE(info);
		else if (ne == columnRslt_slo_tterm_nm2) doRslt_slo_tterm_nm2_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_slo_tterm_cd3) doRslt_slo_tterm_cd3_NE(info);
		else if (ne == columnRslt_slo_tterm_nm3) doRslt_slo_tterm_nm3_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NE(info);
		else if (ne == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_selectable_flg) doRslt_selectable_flg_NE(info);
		else if (ne == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NE(info);
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
		else if (ne == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NE(info);
		else if (ne == Btn_select_bndl_grp) doBtn_select_bndl_grp_NE(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_not_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_aprv_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_cnd_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_cnd_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_tel_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_fax_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[selectable_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_selectable_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NE(MCEventInfo info){
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
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_mode_Group) doCnd_srch_mode_NX(info);
		else if (nx == Cnd_not_arr_flg) doCnd_not_arr_flg_NX(info);
		else if (nx == Cnd_part_arr_flg) doCnd_part_arr_flg_NX(info);
		else if (nx == Cnd_arr_flg) doCnd_arr_flg_NX(info);
		else if (nx == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NX(info);
		else if (nx == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_in_to_id_typ) doCnd_in_to_id_typ_NX(info);
		else if (nx == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_NX(info);
		else if (nx == Cnd_in_to_id_cd) doCnd_in_to_id_cd_NX(info);
		else if (nx == Cnd_in_to_id_nm) doCnd_in_to_id_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_purc_schd_no) doCnd_purc_schd_no_NX(info);
		else if (nx == Cnd_arr_schd_no) doCnd_arr_schd_no_NX(info);
		else if (nx == Cnd_arr_act_no) doCnd_arr_act_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_incl_not_aprv_flg) doCnd_incl_not_aprv_flg_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NX(info);
		else if (nx == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_arr_schd_no) doRslt_arr_schd_no_NX(info);
		else if (nx == columnRslt_arr_act_no) doRslt_arr_act_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NX(info);
		else if (nx == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NX(info);
		else if (nx == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_NX(info);
		else if (nx == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_NX(info);
		else if (nx == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_NX(info);
		else if (nx == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_NX(info);
		else if (nx == columnRslt_in_to_cntct_dpt) doRslt_in_to_cntct_dpt_NX(info);
		else if (nx == columnRslt_in_to_cntct_psn) doRslt_in_to_cntct_psn_NX(info);
		else if (nx == columnRslt_in_to_zip_cd) doRslt_in_to_zip_cd_NX(info);
		else if (nx == columnRslt_in_to_addr1) doRslt_in_to_addr1_NX(info);
		else if (nx == columnRslt_in_to_addr2) doRslt_in_to_addr2_NX(info);
		else if (nx == columnRslt_in_to_addr3) doRslt_in_to_addr3_NX(info);
		else if (nx == columnRslt_in_to_addr4) doRslt_in_to_addr4_NX(info);
		else if (nx == columnRslt_in_to_tel) doRslt_in_to_tel_NX(info);
		else if (nx == columnRslt_in_to_fax) doRslt_in_to_fax_NX(info);
		else if (nx == columnRslt_in_to_cntry_cd) doRslt_in_to_cntry_cd_NX(info);
		else if (nx == columnRslt_in_to_cntry_nm) doRslt_in_to_cntry_nm_NX(info);
		else if (nx == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NX(info);
		else if (nx == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_qty) doRslt_trd_unit_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_qty) doRslt_base_unit_qty_NX(info);
		else if (nx == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NX(info);
		else if (nx == columnRslt_arr_act_qty) doRslt_arr_act_qty_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NX(info);
		else if (nx == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_vssl_flght) doRslt_vssl_flght_NX(info);
		else if (nx == columnRslt_load_port_cd) doRslt_load_port_cd_NX(info);
		else if (nx == columnRslt_load_port_nm) doRslt_load_port_nm_NX(info);
		else if (nx == columnRslt_etd_dt) doRslt_etd_dt_NX(info);
		else if (nx == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NX(info);
		else if (nx == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NX(info);
		else if (nx == columnRslt_eta_dt) doRslt_eta_dt_NX(info);
		else if (nx == columnRslt_via_port_cd) doRslt_via_port_cd_NX(info);
		else if (nx == columnRslt_via_port_nm) doRslt_via_port_nm_NX(info);
		else if (nx == columnRslt_via_schd_dt) doRslt_via_schd_dt_NX(info);
		else if (nx == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NX(info);
		else if (nx == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NX(info);
		else if (nx == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NX(info);
		else if (nx == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_aprv_no) doRslt_aprv_no_NX(info);
		else if (nx == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_slo_trd_ptn_typ) doRslt_slo_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_slo_trd_ptn_typ_nm) doRslt_slo_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRslt_slo_cur_cd) doRslt_slo_cur_cd_NX(info);
		else if (nx == columnRslt_slo_cur_nm) doRslt_slo_cur_nm_NX(info);
		else if (nx == columnRslt_slo_xrate) doRslt_slo_xrate_NX(info);
		else if (nx == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NX(info);
		else if (nx == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NX(info);
		else if (nx == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NX(info);
		else if (nx == columnRslt_slo_tterm_cd1) doRslt_slo_tterm_cd1_NX(info);
		else if (nx == columnRslt_slo_tterm_nm1) doRslt_slo_tterm_nm1_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_slo_tterm_cd2) doRslt_slo_tterm_cd2_NX(info);
		else if (nx == columnRslt_slo_tterm_nm2) doRslt_slo_tterm_nm2_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_slo_tterm_cd3) doRslt_slo_tterm_cd3_NX(info);
		else if (nx == columnRslt_slo_tterm_nm3) doRslt_slo_tterm_nm3_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NX(info);
		else if (nx == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_selectable_flg) doRslt_selectable_flg_NX(info);
		else if (nx == columnRslt_pay_spot_flg) doRslt_pay_spot_flg_NX(info);
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
		else if (nx == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NX(info);
		else if (nx == Btn_select_bndl_grp) doBtn_select_bndl_grp_NX(info);
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
	 * [Cnd]パネルの[srch_mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_not_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_aprv_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_cnd_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_cnd_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_tel_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_fax_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[selectable_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_selectable_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_spot_flg_NX(MCEventInfo info){
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
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_LC(info);
		else if (lc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_in_to_id_typ) doCnd_in_to_id_typ_LC(info);
		else if (lc == Cnd_in_to_id_typ_nm) doCnd_in_to_id_typ_nm_LC(info);
		else if (lc == Cnd_in_to_id_cd) doCnd_in_to_id_cd_LC(info);
		else if (lc == Cnd_in_to_id_nm) doCnd_in_to_id_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_purc_schd_no) doCnd_purc_schd_no_LC(info);
		else if (lc == Cnd_arr_schd_no) doCnd_arr_schd_no_LC(info);
		else if (lc == Cnd_arr_act_no) doCnd_arr_act_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_arr_schd_no) doRslt_arr_schd_no_LC(info);
		else if (lc == columnRslt_arr_act_no) doRslt_arr_act_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_LC(info);
		else if (lc == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_LC(info);
		else if (lc == columnRslt_in_to_id_typ) doRslt_in_to_id_typ_LC(info);
		else if (lc == columnRslt_in_to_id_typ_nm) doRslt_in_to_id_typ_nm_LC(info);
		else if (lc == columnRslt_in_to_id_cd) doRslt_in_to_id_cd_LC(info);
		else if (lc == columnRslt_in_to_id_nm) doRslt_in_to_id_nm_LC(info);
		else if (lc == columnRslt_in_to_cntct_dpt) doRslt_in_to_cntct_dpt_LC(info);
		else if (lc == columnRslt_in_to_cntct_psn) doRslt_in_to_cntct_psn_LC(info);
		else if (lc == columnRslt_in_to_zip_cd) doRslt_in_to_zip_cd_LC(info);
		else if (lc == columnRslt_in_to_addr1) doRslt_in_to_addr1_LC(info);
		else if (lc == columnRslt_in_to_addr2) doRslt_in_to_addr2_LC(info);
		else if (lc == columnRslt_in_to_addr3) doRslt_in_to_addr3_LC(info);
		else if (lc == columnRslt_in_to_addr4) doRslt_in_to_addr4_LC(info);
		else if (lc == columnRslt_in_to_tel) doRslt_in_to_tel_LC(info);
		else if (lc == columnRslt_in_to_fax) doRslt_in_to_fax_LC(info);
		else if (lc == columnRslt_in_to_cntry_cd) doRslt_in_to_cntry_cd_LC(info);
		else if (lc == columnRslt_in_to_cntry_nm) doRslt_in_to_cntry_nm_LC(info);
		else if (lc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_LC(info);
		else if (lc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_qty) doRslt_trd_unit_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_qty) doRslt_base_unit_qty_LC(info);
		else if (lc == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_LC(info);
		else if (lc == columnRslt_arr_act_qty) doRslt_arr_act_qty_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_LC(info);
		else if (lc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_vssl_flght) doRslt_vssl_flght_LC(info);
		else if (lc == columnRslt_load_port_cd) doRslt_load_port_cd_LC(info);
		else if (lc == columnRslt_load_port_nm) doRslt_load_port_nm_LC(info);
		else if (lc == columnRslt_etd_dt) doRslt_etd_dt_LC(info);
		else if (lc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_LC(info);
		else if (lc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_LC(info);
		else if (lc == columnRslt_eta_dt) doRslt_eta_dt_LC(info);
		else if (lc == columnRslt_via_port_cd) doRslt_via_port_cd_LC(info);
		else if (lc == columnRslt_via_port_nm) doRslt_via_port_nm_LC(info);
		else if (lc == columnRslt_via_schd_dt) doRslt_via_schd_dt_LC(info);
		else if (lc == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_LC(info);
		else if (lc == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_LC(info);
		else if (lc == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_LC(info);
		else if (lc == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_aprv_no) doRslt_aprv_no_LC(info);
		else if (lc == columnRslt_aprv_sts_typ) doRslt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_aprv_sts_typ_nm) doRslt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_slo_trd_ptn_typ) doRslt_slo_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_slo_trd_ptn_typ_nm) doRslt_slo_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRslt_slo_cur_cd) doRslt_slo_cur_cd_LC(info);
		else if (lc == columnRslt_slo_cur_nm) doRslt_slo_cur_nm_LC(info);
		else if (lc == columnRslt_slo_xrate) doRslt_slo_xrate_LC(info);
		else if (lc == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_LC(info);
		else if (lc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_LC(info);
		else if (lc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_LC(info);
		else if (lc == columnRslt_slo_tterm_cd1) doRslt_slo_tterm_cd1_LC(info);
		else if (lc == columnRslt_slo_tterm_nm1) doRslt_slo_tterm_nm1_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_slo_tterm_cd2) doRslt_slo_tterm_cd2_LC(info);
		else if (lc == columnRslt_slo_tterm_nm2) doRslt_slo_tterm_nm2_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_slo_tterm_cd3) doRslt_slo_tterm_cd3_LC(info);
		else if (lc == columnRslt_slo_tterm_nm3) doRslt_slo_tterm_nm3_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_LC(info);
		else if (lc == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_LC(info);
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
	 * [Cnd]パネルの[purc_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_id_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[sim_cnd_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_cnd_grp_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_tel_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_fax_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[in_to_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_to_cntry_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_id_typ]の作成メソッド
	 */
	public MCList getCnd_in_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_id_cd]の作成メソッド
	 */
	public MCList getCnd_in_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getInToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
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
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2200.Srch01")) {
			return new MS_MSBEL2200_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2200_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2200_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2200_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2200_Srch01Bridge() {
			p_MS_MSBEL2200_Srch01 = new MCParam(PDef.MS_MSBEL2200_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2200_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2200.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2200.RsltR.class));

			p_MS_MSBEL2200_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2200_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2200_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2200_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2200_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2200.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2200.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2200.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2200.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2200_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2200.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2200_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2200.RsltR>)p_MS_MSBEL2200_Srch01.getContainerParam().getDownBlock(0));
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