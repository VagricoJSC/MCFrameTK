package mcframe.clientMSBE.MSBEP1710;

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
import mcframe.clientMSBE.MSBEP1710.MSBEP_IvTrgtSel_MC.MS_MSBEL1710_Srch01Caller;

/**
 * 画面"MSBEP_IvTrgtSel"パネルクラスです。<p>
 *
 * インボイス登録対象の出荷予定を選択し、インボイス登録画面に初期表示します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_IvTrgtSel_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1710";

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
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SHIP_SCHD,Shipping schedule,0;SHIP_INST,Shipping order,1;SHIP_ACT,Shipping result,2 SHIP_SCHD,出荷予定,0;SHIP_INST,出荷指図,1;SHIP_ACT,出荷実績,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_srch_mode_Group = null;
	public MCRadioButton Cnd_srch_mode_SHIP_SCHD = null;
	public MCRadioButton Cnd_srch_mode_SHIP_INST = null;
	public MCRadioButton Cnd_srch_mode_SHIP_ACT = null;
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
	 * Unshipped 未出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ship_flg = null;
	/**
	 * Partial shipment 一部出荷.<p>
	 *
	 */
	public MCCheckBox Cnd_part_ship_flg = null;
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_flg = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_schd_dt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ship_schd_dt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ship_schd_dt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ship_schd_dt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ship_schd_dt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_inst_dt_p_PPanel;
	public MCDateField Cnd_ship_inst_dt_fr;	// [Cnd]の[ship_inst_dt_p.ymd_fr]を[Cnd_ship_inst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_fr;	// [Cnd]の[ship_inst_dt_p.hm_fr]を[Cnd_ship_inst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_dt_to;	// [Cnd]の[ship_inst_dt_p.ymd_to]を[Cnd_ship_inst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_inst_hm_to;	// [Cnd]の[ship_inst_dt_p.hm_to]を[Cnd_ship_inst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_dt_p_PPanel;
	public MCDateField Cnd_ship_dt_fr;	// [Cnd]の[ship_dt_p.ymd_fr]を[Cnd_ship_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_fr;	// [Cnd]の[ship_dt_p.hm_fr]を[Cnd_ship_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_dt_to;	// [Cnd]の[ship_dt_p.ymd_to]を[Cnd_ship_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_to;	// [Cnd]の[ship_dt_p.hm_to]を[Cnd_ship_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_dt_p_PPanel;
	public MCDateField Cnd_dlv_dt_fr;	// [Cnd]の[dlv_dt_p.ymd_fr]を[Cnd_dlv_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_hm_fr;	// [Cnd]の[dlv_dt_p.hm_fr]を[Cnd_dlv_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_dt_to;	// [Cnd]の[dlv_dt_p.ymd_to]を[Cnd_dlv_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_hm_to;	// [Cnd]の[dlv_dt_p.hm_to]を[Cnd_dlv_hm_to]としてエイリアス定義。
	public MCLabel Cnd_etd_dt_fr_Label = null;
	/**
	 * Estimated date of loading FROM 船積予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_etd_dt_fr = null;
	public MCLabel Cnd_etd_dt_to_Label = null;
	/**
	 * Estimated date of loading TO 船積予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_etd_dt_to = null;
	public MCLabel Cnd_eta_dt_fr_Label = null;
	/**
	 * Estimated date of unloading FROM 船卸予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_eta_dt_fr = null;
	public MCLabel Cnd_eta_dt_to_Label = null;
	/**
	 * Estimated date of unloading TO 船卸予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_eta_dt_to = null;
	public MCLabel Cnd_via_schd_dt_fr_Label = null;
	/**
	 * Estimated stopover date FROM 経由予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_via_schd_dt_fr = null;
	public MCLabel Cnd_via_schd_dt_to_Label = null;
	/**
	 * Estimated stopover date TO 経由予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_via_schd_dt_to = null;
	public MCLabel Cnd_ship_fr_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_fr_lg_grp_nm = null;
	public MCLabel Cnd_tdlv_cd_Label = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCTextField Cnd_tdlv_nm = null;
	public MCLabel Cnd_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_typ_nm = null;
	public MCLabel Cnd_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_cd = null;
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_id_nm = null;
	public MCLabel Cnd_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_typ_nm = null;
	public MCLabel Cnd_dlv_id_cd_Label = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_id_nm = null;
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
	public MCLabel Cnd_ship_schd_no_Label = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_schd_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_ship_rqst_no_Label = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_rqst_no = null;
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
	public MCLabel Cnd_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_no = null;
	public MCLabel Cnd_ship_inst_d_no_Label = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_d_no = null;
	public MCLabel Cnd_ship_act_no_Label = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_act_no = null;
	public MCLabel Cnd_ship_act_d_no_Label = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_act_d_no = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_ship_rqst_id_grp_p_PPanel;
	public MCLabel Cnd_ship_rqst_id_grp_lab1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab1]を[Cnd_ship_rqst_id_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg1]を[Cnd_ship_rqst_id_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd1]を[Cnd_ship_rqst_id_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm1;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm1]を[Cnd_ship_rqst_id_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab2]を[Cnd_ship_rqst_id_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg2]を[Cnd_ship_rqst_id_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd2]を[Cnd_ship_rqst_id_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm2;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm2]を[Cnd_ship_rqst_id_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab3]を[Cnd_ship_rqst_id_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg3]を[Cnd_ship_rqst_id_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd3]を[Cnd_ship_rqst_id_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm3;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm3]を[Cnd_ship_rqst_id_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab4]を[Cnd_ship_rqst_id_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg4]を[Cnd_ship_rqst_id_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd4]を[Cnd_ship_rqst_id_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm4;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm4]を[Cnd_ship_rqst_id_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab5]を[Cnd_ship_rqst_id_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg5]を[Cnd_ship_rqst_id_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd5]を[Cnd_ship_rqst_id_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm5;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm5]を[Cnd_ship_rqst_id_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab6]を[Cnd_ship_rqst_id_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg6]を[Cnd_ship_rqst_id_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd6]を[Cnd_ship_rqst_id_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm6;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm6]を[Cnd_ship_rqst_id_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab7]を[Cnd_ship_rqst_id_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg7]を[Cnd_ship_rqst_id_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd7]を[Cnd_ship_rqst_id_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm7;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm7]を[Cnd_ship_rqst_id_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab8]を[Cnd_ship_rqst_id_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg8]を[Cnd_ship_rqst_id_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd8]を[Cnd_ship_rqst_id_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm8;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm8]を[Cnd_ship_rqst_id_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab9]を[Cnd_ship_rqst_id_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg9]を[Cnd_ship_rqst_id_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd9]を[Cnd_ship_rqst_id_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm9;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm9]を[Cnd_ship_rqst_id_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_ship_rqst_id_grp_lab10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_lab10]を[Cnd_ship_rqst_id_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_ship_rqst_id_grp_flg10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_flg10]を[Cnd_ship_rqst_id_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_ship_rqst_id_grp_cd10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_cd10]を[Cnd_ship_rqst_id_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_ship_rqst_id_grp_nm10;	// [Cnd]の[ship_rqst_id_grp_p.bp_grp_nm10]を[Cnd_ship_rqst_id_grp_nm10]としてエイリアス定義。
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
	// [ShipRqstIdCnd]ブロック関連のField定義
	public MCPanel ShipRqstIdCndPanel = null;
	// [ShipRqstIdCnd]ブロックの項目のField定義
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1710.RsltR> RsltTable = null;
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Shipping request No. 出荷依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * Shipping re-schedule flg. 再出荷予定ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_re_ship_schd_flg = null;
	/**
	 * Sales order invoice No. 受注インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_iv_no = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_d_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_act_d_no = null;
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
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
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri_not_tgt_flg = null;
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
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_iv_upri_p_PPanel;
	public MCColumnConfig columnRslt_iv_upri;// [Rslt]の[iv_upri_p.upri]を[columnRslt_iv_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_iv_amt_p_PPanel;
	public MCColumnConfig columnRslt_iv_amt;// [Rslt]の[iv_amt_p.amt]を[columnRslt_iv_amt]としてエイリアス定義。
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
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inc_tax_flg = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_dlv_p_PPanel;
	public MCColumnConfig columnRslt_dlv_show_dtl;// [Rslt]の[dlv_p.show_dtl]を[columnRslt_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_cd;// [Rslt]の[dlv_p.bp_cd]を[columnRslt_dlv_id_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_id_nm;// [Rslt]の[dlv_p.bp_nm]を[columnRslt_dlv_id_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_sundry_flg;// [Rslt]の[dlv_p.dlv_sundry_flg]を[columnRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_pri_prnt_flg;// [Rslt]の[dlv_p.pri_prnt_flg]を[columnRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_lg_grp_cd;// [Rslt]の[dlv_p.lg_grp_cd]を[columnRslt_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_lg_grp_nm;// [Rslt]の[dlv_p.lg_grp_nm]を[columnRslt_dlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_cd;// [Rslt]の[dlv_p.cntry_cd]を[columnRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntry_nm;// [Rslt]の[dlv_p.cntry_nm]を[columnRslt_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_zip_cd;// [Rslt]の[dlv_p.zip_cd]を[columnRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr1;// [Rslt]の[dlv_p.addr1]を[columnRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr2;// [Rslt]の[dlv_p.addr2]を[columnRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr3;// [Rslt]の[dlv_p.addr3]を[columnRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_addr4;// [Rslt]の[dlv_p.addr4]を[columnRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_tel;// [Rslt]の[dlv_p.tel]を[columnRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_fax;// [Rslt]の[dlv_p.fax]を[columnRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_dpt;// [Rslt]の[dlv_p.dlv_cntct_dpt]を[columnRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_cntct_psn;// [Rslt]の[dlv_p.dlv_cntct_psn]を[columnRslt_dlv_cntct_psn]としてエイリアス定義。
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_typ_nm = null;
	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_cd = null;
	/**
	 * Shipping requested alias name 出荷依頼先識別名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_rqst_id_nm = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_upri_cng_flg = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_hm = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_rqst_hm = null;
	/**
	 * Shipping order date 出荷指図日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_dt = null;
	/**
	 * Shipping order time 出荷指図時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_inst_hm = null;
	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dt = null;
	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_hm = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_dt = null;
	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_hm = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_dlv_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Rslt_tdlv_p_PPanel;
	public MCColumnConfig columnRslt_tdlv_show_dtl;// [Rslt]の[tdlv_p.show_dtl]を[columnRslt_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cd;// [Rslt]の[tdlv_p.bp_cd]を[columnRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_nm;// [Rslt]の[tdlv_p.bp_nm]を[columnRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_sundry_flg;// [Rslt]の[tdlv_p.dlv_sundry_flg]を[columnRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_pri_prnt_flg;// [Rslt]の[tdlv_p.pri_prnt_flg]を[columnRslt_tdlv_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_lg_grp_cd;// [Rslt]の[tdlv_p.lg_grp_cd]を[columnRslt_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_lg_grp_nm;// [Rslt]の[tdlv_p.lg_grp_nm]を[columnRslt_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntry_cd;// [Rslt]の[tdlv_p.cntry_cd]を[columnRslt_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntry_nm;// [Rslt]の[tdlv_p.cntry_nm]を[columnRslt_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_zip_cd;// [Rslt]の[tdlv_p.zip_cd]を[columnRslt_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr1;// [Rslt]の[tdlv_p.addr1]を[columnRslt_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr2;// [Rslt]の[tdlv_p.addr2]を[columnRslt_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr3;// [Rslt]の[tdlv_p.addr3]を[columnRslt_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_addr4;// [Rslt]の[tdlv_p.addr4]を[columnRslt_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_tel;// [Rslt]の[tdlv_p.tel]を[columnRslt_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_fax;// [Rslt]の[tdlv_p.fax]を[columnRslt_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntct_dpt;// [Rslt]の[tdlv_p.dlv_cntct_dpt]を[columnRslt_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnRslt_tdlv_cntct_psn;// [Rslt]の[tdlv_p.dlv_cntct_psn]を[columnRslt_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_cststk_flg = null;
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
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prov_basis_typ_nm = null;
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
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_typ = null;
	/**
	 * Direct delivery flg. 仕入直送ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_ddlv_flg = null;
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_typ = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lnk_ar_dpt_cd = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_lcl_cd = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_ship_rqst_id_grp_p_PPanel;
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd1;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd1]を[columnRslt_ship_rqst_id_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm1;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm1]を[columnRslt_ship_rqst_id_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd2;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd2]を[columnRslt_ship_rqst_id_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm2;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm2]を[columnRslt_ship_rqst_id_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd3;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd3]を[columnRslt_ship_rqst_id_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm3;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm3]を[columnRslt_ship_rqst_id_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd4;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd4]を[columnRslt_ship_rqst_id_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm4;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm4]を[columnRslt_ship_rqst_id_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd5;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd5]を[columnRslt_ship_rqst_id_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm5;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm5]を[columnRslt_ship_rqst_id_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd6;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd6]を[columnRslt_ship_rqst_id_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm6;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm6]を[columnRslt_ship_rqst_id_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd7;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd7]を[columnRslt_ship_rqst_id_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm7;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm7]を[columnRslt_ship_rqst_id_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd8;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd8]を[columnRslt_ship_rqst_id_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm8;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm8]を[columnRslt_ship_rqst_id_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd9;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd9]を[columnRslt_ship_rqst_id_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm9;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm9]を[columnRslt_ship_rqst_id_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_cd10;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_cd10]を[columnRslt_ship_rqst_id_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_rqst_id_grp_nm10;// [Rslt]の[ship_rqst_id_grp_p.bp_grp_nm10]を[columnRslt_ship_rqst_id_grp_nm10]としてエイリアス定義。
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
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
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
	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_qty = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion rounding type 取引単位換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri_dec_place = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_rnd_typ = null;
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upri_rnd_typ = null;
	/**
	 * Tax rounding type 税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_rnd_typ = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Print sales invoice インボイス登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1730 = null;
	/**
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public MCCheckBox Btn_chk_by_grp_no_flg = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_SHIP_INST]モードを表す定数 */
	public static final String SRCH_SHIP_INST = "SRCH_SHIP_INST";
	/** [SRCH_SHIP_ACT]モードを表す定数 */
	public static final String SRCH_SHIP_ACT = "SRCH_SHIP_ACT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_SHIP_INST, SRCH_SHIP_ACT};
	
	/** [MS_MSBEL1710_Srch01]のCallerの作成 */
	protected MSBEP_IvTrgtSel_MC.MS_MSBEL1710_Srch01Caller createMS_MSBEL1710_Srch01() {
		MSBEP_IvTrgtSel_MC.MS_MSBEL1710_Srch01Caller<MSBEP_IvTrgtSel, MS_MSBEL1710_Srch01Bridge>
		caller = ((MSBEP_IvTrgtSel_MC)this).new MS_MSBEL1710_Srch01Caller<MSBEP_IvTrgtSel, MS_MSBEL1710_Srch01Bridge>(
					(MSBEP_IvTrgtSel)this, new MS_MSBEL1710_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1710_Srch01]の呼び出し */
	protected void callMS_MSBEL1710_Srch01() {
		MCCaller caller = createMS_MSBEL1710_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1710.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1710.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1710.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1710.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1710.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1710.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1710.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1710.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1710.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1710.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1710.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1710.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1710.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP1710.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1710.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1710.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1710.BtnR.create();
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
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(ShipRqstIdCndPanel);
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
	public MSBEP_IvTrgtSel_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IvTrgtSel_MC_A(String name) {
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
		MSBEP_IvTrgtSel_MC.jbCreateSrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreatePrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateTop((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateFold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateTab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateTab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateTab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateTab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateDlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateCtrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateRPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateRslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbCreateBtn((MSBEP_IvTrgtSel)this);
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [PrStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePrStsTyp(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_IvTrgtSel p) {
		p.Cnd_ship_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_schd_dt_p());
		p.Cnd_ship_schd_dt_p_PPanel.setName("Cnd.ship_schd_dt_p");
		p.Cnd_ship_schd_dt_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_schd_dt_fr.addAliasName("Cnd.ship_schd_dt_fr", p);
		p.Cnd_ship_schd_hm_fr = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_schd_hm_fr.addAliasName("Cnd.ship_schd_hm_fr", p);
		p.Cnd_ship_schd_dt_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_schd_dt_to.addAliasName("Cnd.ship_schd_dt_to", p);
		p.Cnd_ship_schd_hm_to = p.Cnd_ship_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_schd_hm_to.addAliasName("Cnd.ship_schd_hm_to", p);
		p.Cnd_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_rqst_dt_p());
		p.Cnd_dlv_rqst_dt_p_PPanel.setName("Cnd.dlv_rqst_dt_p");
		p.Cnd_dlv_rqst_dt_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_rqst_dt_fr.addAliasName("Cnd.dlv_rqst_dt_fr", p);
		p.Cnd_dlv_rqst_hm_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_rqst_hm_fr.addAliasName("Cnd.dlv_rqst_hm_fr", p);
		p.Cnd_dlv_rqst_dt_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_rqst_dt_to.addAliasName("Cnd.dlv_rqst_dt_to", p);
		p.Cnd_dlv_rqst_hm_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_rqst_hm_to.addAliasName("Cnd.dlv_rqst_hm_to", p);
		p.Cnd_ship_inst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_inst_dt_p());
		p.Cnd_ship_inst_dt_p_PPanel.setName("Cnd.ship_inst_dt_p");
		p.Cnd_ship_inst_dt_fr = p.Cnd_ship_inst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_inst_dt_fr.addAliasName("Cnd.ship_inst_dt_fr", p);
		p.Cnd_ship_inst_hm_fr = p.Cnd_ship_inst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_inst_hm_fr.addAliasName("Cnd.ship_inst_hm_fr", p);
		p.Cnd_ship_inst_dt_to = p.Cnd_ship_inst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_inst_dt_to.addAliasName("Cnd.ship_inst_dt_to", p);
		p.Cnd_ship_inst_hm_to = p.Cnd_ship_inst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_inst_hm_to.addAliasName("Cnd.ship_inst_hm_to", p);
		p.Cnd_ship_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_dt_p());
		p.Cnd_ship_dt_p_PPanel.setName("Cnd.ship_dt_p");
		p.Cnd_ship_dt_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_dt_fr.addAliasName("Cnd.ship_dt_fr", p);
		p.Cnd_ship_hm_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_hm_fr.addAliasName("Cnd.ship_hm_fr", p);
		p.Cnd_ship_dt_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_dt_to.addAliasName("Cnd.ship_dt_to", p);
		p.Cnd_ship_hm_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_hm_to.addAliasName("Cnd.ship_hm_to", p);
		p.Cnd_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_dt_p());
		p.Cnd_dlv_dt_p_PPanel.setName("Cnd.dlv_dt_p");
		p.Cnd_dlv_dt_fr = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_dt_fr.addAliasName("Cnd.dlv_dt_fr", p);
		p.Cnd_dlv_hm_fr = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_hm_fr.addAliasName("Cnd.dlv_hm_fr", p);
		p.Cnd_dlv_dt_to = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_dt_to.addAliasName("Cnd.dlv_dt_to", p);
		p.Cnd_dlv_hm_to = p.Cnd_dlv_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_hm_to.addAliasName("Cnd.dlv_hm_to", p);
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
		p.Cnd_ship_rqst_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().ship_rqst_id_grp_p());
		p.Cnd_ship_rqst_id_grp_p_PPanel.setName("Cnd.ship_rqst_id_grp_p");
		p.Cnd_ship_rqst_id_grp_lab1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_ship_rqst_id_grp_lab1.addAliasName("Cnd.ship_rqst_id_grp_lab1", p);
		p.Cnd_ship_rqst_id_grp_flg1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_ship_rqst_id_grp_flg1.addAliasName("Cnd.ship_rqst_id_grp_flg1", p);
		p.Cnd_ship_rqst_id_grp_cd1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_ship_rqst_id_grp_cd1.addAliasName("Cnd.ship_rqst_id_grp_cd1", p);
		p.Cnd_ship_rqst_id_grp_nm1 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_ship_rqst_id_grp_nm1.addAliasName("Cnd.ship_rqst_id_grp_nm1", p);
		p.Cnd_ship_rqst_id_grp_lab2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_ship_rqst_id_grp_lab2.addAliasName("Cnd.ship_rqst_id_grp_lab2", p);
		p.Cnd_ship_rqst_id_grp_flg2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_ship_rqst_id_grp_flg2.addAliasName("Cnd.ship_rqst_id_grp_flg2", p);
		p.Cnd_ship_rqst_id_grp_cd2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_ship_rqst_id_grp_cd2.addAliasName("Cnd.ship_rqst_id_grp_cd2", p);
		p.Cnd_ship_rqst_id_grp_nm2 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_ship_rqst_id_grp_nm2.addAliasName("Cnd.ship_rqst_id_grp_nm2", p);
		p.Cnd_ship_rqst_id_grp_lab3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_ship_rqst_id_grp_lab3.addAliasName("Cnd.ship_rqst_id_grp_lab3", p);
		p.Cnd_ship_rqst_id_grp_flg3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_ship_rqst_id_grp_flg3.addAliasName("Cnd.ship_rqst_id_grp_flg3", p);
		p.Cnd_ship_rqst_id_grp_cd3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_ship_rqst_id_grp_cd3.addAliasName("Cnd.ship_rqst_id_grp_cd3", p);
		p.Cnd_ship_rqst_id_grp_nm3 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_ship_rqst_id_grp_nm3.addAliasName("Cnd.ship_rqst_id_grp_nm3", p);
		p.Cnd_ship_rqst_id_grp_lab4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_ship_rqst_id_grp_lab4.addAliasName("Cnd.ship_rqst_id_grp_lab4", p);
		p.Cnd_ship_rqst_id_grp_flg4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_ship_rqst_id_grp_flg4.addAliasName("Cnd.ship_rqst_id_grp_flg4", p);
		p.Cnd_ship_rqst_id_grp_cd4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_ship_rqst_id_grp_cd4.addAliasName("Cnd.ship_rqst_id_grp_cd4", p);
		p.Cnd_ship_rqst_id_grp_nm4 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_ship_rqst_id_grp_nm4.addAliasName("Cnd.ship_rqst_id_grp_nm4", p);
		p.Cnd_ship_rqst_id_grp_lab5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_ship_rqst_id_grp_lab5.addAliasName("Cnd.ship_rqst_id_grp_lab5", p);
		p.Cnd_ship_rqst_id_grp_flg5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_ship_rqst_id_grp_flg5.addAliasName("Cnd.ship_rqst_id_grp_flg5", p);
		p.Cnd_ship_rqst_id_grp_cd5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_ship_rqst_id_grp_cd5.addAliasName("Cnd.ship_rqst_id_grp_cd5", p);
		p.Cnd_ship_rqst_id_grp_nm5 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_ship_rqst_id_grp_nm5.addAliasName("Cnd.ship_rqst_id_grp_nm5", p);
		p.Cnd_ship_rqst_id_grp_lab6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_ship_rqst_id_grp_lab6.addAliasName("Cnd.ship_rqst_id_grp_lab6", p);
		p.Cnd_ship_rqst_id_grp_flg6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_ship_rqst_id_grp_flg6.addAliasName("Cnd.ship_rqst_id_grp_flg6", p);
		p.Cnd_ship_rqst_id_grp_cd6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_ship_rqst_id_grp_cd6.addAliasName("Cnd.ship_rqst_id_grp_cd6", p);
		p.Cnd_ship_rqst_id_grp_nm6 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_ship_rqst_id_grp_nm6.addAliasName("Cnd.ship_rqst_id_grp_nm6", p);
		p.Cnd_ship_rqst_id_grp_lab7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_ship_rqst_id_grp_lab7.addAliasName("Cnd.ship_rqst_id_grp_lab7", p);
		p.Cnd_ship_rqst_id_grp_flg7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_ship_rqst_id_grp_flg7.addAliasName("Cnd.ship_rqst_id_grp_flg7", p);
		p.Cnd_ship_rqst_id_grp_cd7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_ship_rqst_id_grp_cd7.addAliasName("Cnd.ship_rqst_id_grp_cd7", p);
		p.Cnd_ship_rqst_id_grp_nm7 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_ship_rqst_id_grp_nm7.addAliasName("Cnd.ship_rqst_id_grp_nm7", p);
		p.Cnd_ship_rqst_id_grp_lab8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_ship_rqst_id_grp_lab8.addAliasName("Cnd.ship_rqst_id_grp_lab8", p);
		p.Cnd_ship_rqst_id_grp_flg8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_ship_rqst_id_grp_flg8.addAliasName("Cnd.ship_rqst_id_grp_flg8", p);
		p.Cnd_ship_rqst_id_grp_cd8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_ship_rqst_id_grp_cd8.addAliasName("Cnd.ship_rqst_id_grp_cd8", p);
		p.Cnd_ship_rqst_id_grp_nm8 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_ship_rqst_id_grp_nm8.addAliasName("Cnd.ship_rqst_id_grp_nm8", p);
		p.Cnd_ship_rqst_id_grp_lab9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_ship_rqst_id_grp_lab9.addAliasName("Cnd.ship_rqst_id_grp_lab9", p);
		p.Cnd_ship_rqst_id_grp_flg9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_ship_rqst_id_grp_flg9.addAliasName("Cnd.ship_rqst_id_grp_flg9", p);
		p.Cnd_ship_rqst_id_grp_cd9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_ship_rqst_id_grp_cd9.addAliasName("Cnd.ship_rqst_id_grp_cd9", p);
		p.Cnd_ship_rqst_id_grp_nm9 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_ship_rqst_id_grp_nm9.addAliasName("Cnd.ship_rqst_id_grp_nm9", p);
		p.Cnd_ship_rqst_id_grp_lab10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_ship_rqst_id_grp_lab10.addAliasName("Cnd.ship_rqst_id_grp_lab10", p);
		p.Cnd_ship_rqst_id_grp_flg10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_ship_rqst_id_grp_flg10.addAliasName("Cnd.ship_rqst_id_grp_flg10", p);
		p.Cnd_ship_rqst_id_grp_cd10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_ship_rqst_id_grp_cd10.addAliasName("Cnd.ship_rqst_id_grp_cd10", p);
		p.Cnd_ship_rqst_id_grp_nm10 = p.Cnd_ship_rqst_id_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_ship_rqst_id_grp_nm10.addAliasName("Cnd.ship_rqst_id_grp_nm10", p);
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
	 * [ShipRqstIdCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipRqstIdCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [DlvCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [ItmCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_IvTrgtSel p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_IvTrgtSel p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_IvTrgtSel p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$itm_p);
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
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$sno_wrk_no_p);
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
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_iv_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$iv_upri_p);
		p.Rslt_iv_upri_p_PPanel.setName("Rslt.iv_upri_p");
		p.columnRslt_iv_upri = p.Rslt_iv_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_iv_upri.addAliasName("Rslt.iv_upri", p);
		p.Rslt_iv_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$iv_amt_p);
		p.Rslt_iv_amt_p_PPanel.setName("Rslt.iv_amt_p");
		p.columnRslt_iv_amt = p.Rslt_iv_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_iv_amt.addAliasName("Rslt.iv_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$dlv_p);
		p.Rslt_dlv_p_PPanel.setName("Rslt.dlv_p");
		p.columnRslt_dlv_show_dtl = p.Rslt_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_dlv_show_dtl.addAliasName("Rslt.dlv_show_dtl", p);
		p.columnRslt_dlv_id_cd = p.Rslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_dlv_id_cd.addAliasName("Rslt.dlv_id_cd", p);
		p.columnRslt_dlv_id_nm = p.Rslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_dlv_id_nm.addAliasName("Rslt.dlv_id_nm", p);
		p.columnRslt_dlv_sundry_flg = p.Rslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_dlv_sundry_flg.addAliasName("Rslt.dlv_sundry_flg", p);
		p.columnRslt_pri_prnt_flg = p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_pri_prnt_flg.addAliasName("Rslt.pri_prnt_flg", p);
		p.columnRslt_dlv_lg_grp_cd = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_dlv_lg_grp_cd.addAliasName("Rslt.dlv_lg_grp_cd", p);
		p.columnRslt_dlv_lg_grp_nm = p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_dlv_lg_grp_nm.addAliasName("Rslt.dlv_lg_grp_nm", p);
		p.columnRslt_dlv_cntry_cd = p.Rslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_dlv_cntry_cd.addAliasName("Rslt.dlv_cntry_cd", p);
		p.columnRslt_dlv_cntry_nm = p.Rslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_dlv_cntry_nm.addAliasName("Rslt.dlv_cntry_nm", p);
		p.columnRslt_dlv_zip_cd = p.Rslt_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt_dlv_zip_cd.addAliasName("Rslt.dlv_zip_cd", p);
		p.columnRslt_dlv_addr1 = p.Rslt_dlv_p_PPanel.columnDlv_addr1;
		p.columnRslt_dlv_addr1.addAliasName("Rslt.dlv_addr1", p);
		p.columnRslt_dlv_addr2 = p.Rslt_dlv_p_PPanel.columnDlv_addr2;
		p.columnRslt_dlv_addr2.addAliasName("Rslt.dlv_addr2", p);
		p.columnRslt_dlv_addr3 = p.Rslt_dlv_p_PPanel.columnDlv_addr3;
		p.columnRslt_dlv_addr3.addAliasName("Rslt.dlv_addr3", p);
		p.columnRslt_dlv_addr4 = p.Rslt_dlv_p_PPanel.columnDlv_addr4;
		p.columnRslt_dlv_addr4.addAliasName("Rslt.dlv_addr4", p);
		p.columnRslt_dlv_tel = p.Rslt_dlv_p_PPanel.columnDlv_tel;
		p.columnRslt_dlv_tel.addAliasName("Rslt.dlv_tel", p);
		p.columnRslt_dlv_fax = p.Rslt_dlv_p_PPanel.columnDlv_fax;
		p.columnRslt_dlv_fax.addAliasName("Rslt.dlv_fax", p);
		p.columnRslt_dlv_cntct_dpt = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_dlv_cntct_dpt.addAliasName("Rslt.dlv_cntct_dpt", p);
		p.columnRslt_dlv_cntct_psn = p.Rslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_dlv_cntct_psn.addAliasName("Rslt.dlv_cntct_psn", p);
		p.Rslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$tdlv_p);
		p.Rslt_tdlv_p_PPanel.setName("Rslt.tdlv_p");
		p.columnRslt_tdlv_show_dtl = p.Rslt_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnRslt_tdlv_show_dtl.addAliasName("Rslt.tdlv_show_dtl", p);
		p.columnRslt_tdlv_cd = p.Rslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnRslt_tdlv_cd.addAliasName("Rslt.tdlv_cd", p);
		p.columnRslt_tdlv_nm = p.Rslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnRslt_tdlv_nm.addAliasName("Rslt.tdlv_nm", p);
		p.columnRslt_tdlv_sundry_flg = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnRslt_tdlv_sundry_flg.addAliasName("Rslt.tdlv_sundry_flg", p);
		p.columnRslt_tdlv_pri_prnt_flg = p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnRslt_tdlv_pri_prnt_flg.addAliasName("Rslt.tdlv_pri_prnt_flg", p);
		p.columnRslt_tdlv_lg_grp_cd = p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnRslt_tdlv_lg_grp_cd.addAliasName("Rslt.tdlv_lg_grp_cd", p);
		p.columnRslt_tdlv_lg_grp_nm = p.Rslt_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnRslt_tdlv_lg_grp_nm.addAliasName("Rslt.tdlv_lg_grp_nm", p);
		p.columnRslt_tdlv_cntry_cd = p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnRslt_tdlv_cntry_cd.addAliasName("Rslt.tdlv_cntry_cd", p);
		p.columnRslt_tdlv_cntry_nm = p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnRslt_tdlv_cntry_nm.addAliasName("Rslt.tdlv_cntry_nm", p);
		p.columnRslt_tdlv_zip_cd = p.Rslt_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnRslt_tdlv_zip_cd.addAliasName("Rslt.tdlv_zip_cd", p);
		p.columnRslt_tdlv_addr1 = p.Rslt_tdlv_p_PPanel.columnDlv_addr1;
		p.columnRslt_tdlv_addr1.addAliasName("Rslt.tdlv_addr1", p);
		p.columnRslt_tdlv_addr2 = p.Rslt_tdlv_p_PPanel.columnDlv_addr2;
		p.columnRslt_tdlv_addr2.addAliasName("Rslt.tdlv_addr2", p);
		p.columnRslt_tdlv_addr3 = p.Rslt_tdlv_p_PPanel.columnDlv_addr3;
		p.columnRslt_tdlv_addr3.addAliasName("Rslt.tdlv_addr3", p);
		p.columnRslt_tdlv_addr4 = p.Rslt_tdlv_p_PPanel.columnDlv_addr4;
		p.columnRslt_tdlv_addr4.addAliasName("Rslt.tdlv_addr4", p);
		p.columnRslt_tdlv_tel = p.Rslt_tdlv_p_PPanel.columnDlv_tel;
		p.columnRslt_tdlv_tel.addAliasName("Rslt.tdlv_tel", p);
		p.columnRslt_tdlv_fax = p.Rslt_tdlv_p_PPanel.columnDlv_fax;
		p.columnRslt_tdlv_fax.addAliasName("Rslt.tdlv_fax", p);
		p.columnRslt_tdlv_cntct_dpt = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnRslt_tdlv_cntct_dpt.addAliasName("Rslt.tdlv_cntct_dpt", p);
		p.columnRslt_tdlv_cntct_psn = p.Rslt_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnRslt_tdlv_cntct_psn.addAliasName("Rslt.tdlv_cntct_psn", p);
		p.Rslt_ship_rqst_id_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$ship_rqst_id_grp_p);
		p.Rslt_ship_rqst_id_grp_p_PPanel.setName("Rslt.ship_rqst_id_grp_p");
		p.columnRslt_ship_rqst_id_grp_cd1 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_ship_rqst_id_grp_cd1.addAliasName("Rslt.ship_rqst_id_grp_cd1", p);
		p.columnRslt_ship_rqst_id_grp_nm1 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_ship_rqst_id_grp_nm1.addAliasName("Rslt.ship_rqst_id_grp_nm1", p);
		p.columnRslt_ship_rqst_id_grp_cd2 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_ship_rqst_id_grp_cd2.addAliasName("Rslt.ship_rqst_id_grp_cd2", p);
		p.columnRslt_ship_rqst_id_grp_nm2 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_ship_rqst_id_grp_nm2.addAliasName("Rslt.ship_rqst_id_grp_nm2", p);
		p.columnRslt_ship_rqst_id_grp_cd3 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_ship_rqst_id_grp_cd3.addAliasName("Rslt.ship_rqst_id_grp_cd3", p);
		p.columnRslt_ship_rqst_id_grp_nm3 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_ship_rqst_id_grp_nm3.addAliasName("Rslt.ship_rqst_id_grp_nm3", p);
		p.columnRslt_ship_rqst_id_grp_cd4 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_ship_rqst_id_grp_cd4.addAliasName("Rslt.ship_rqst_id_grp_cd4", p);
		p.columnRslt_ship_rqst_id_grp_nm4 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_ship_rqst_id_grp_nm4.addAliasName("Rslt.ship_rqst_id_grp_nm4", p);
		p.columnRslt_ship_rqst_id_grp_cd5 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_ship_rqst_id_grp_cd5.addAliasName("Rslt.ship_rqst_id_grp_cd5", p);
		p.columnRslt_ship_rqst_id_grp_nm5 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_ship_rqst_id_grp_nm5.addAliasName("Rslt.ship_rqst_id_grp_nm5", p);
		p.columnRslt_ship_rqst_id_grp_cd6 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_ship_rqst_id_grp_cd6.addAliasName("Rslt.ship_rqst_id_grp_cd6", p);
		p.columnRslt_ship_rqst_id_grp_nm6 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_ship_rqst_id_grp_nm6.addAliasName("Rslt.ship_rqst_id_grp_nm6", p);
		p.columnRslt_ship_rqst_id_grp_cd7 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_ship_rqst_id_grp_cd7.addAliasName("Rslt.ship_rqst_id_grp_cd7", p);
		p.columnRslt_ship_rqst_id_grp_nm7 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_ship_rqst_id_grp_nm7.addAliasName("Rslt.ship_rqst_id_grp_nm7", p);
		p.columnRslt_ship_rqst_id_grp_cd8 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_ship_rqst_id_grp_cd8.addAliasName("Rslt.ship_rqst_id_grp_cd8", p);
		p.columnRslt_ship_rqst_id_grp_nm8 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_ship_rqst_id_grp_nm8.addAliasName("Rslt.ship_rqst_id_grp_nm8", p);
		p.columnRslt_ship_rqst_id_grp_cd9 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_ship_rqst_id_grp_cd9.addAliasName("Rslt.ship_rqst_id_grp_cd9", p);
		p.columnRslt_ship_rqst_id_grp_nm9 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_ship_rqst_id_grp_nm9.addAliasName("Rslt.ship_rqst_id_grp_nm9", p);
		p.columnRslt_ship_rqst_id_grp_cd10 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_ship_rqst_id_grp_cd10.addAliasName("Rslt.ship_rqst_id_grp_cd10", p);
		p.columnRslt_ship_rqst_id_grp_nm10 = p.Rslt_ship_rqst_id_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_ship_rqst_id_grp_nm10.addAliasName("Rslt.ship_rqst_id_grp_nm10", p);
		p.Rslt_dlv_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$dlv_grp_p);
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
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP1710.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBEP_IvTrgtSel p) {
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

	
	/** [Cnd_ship_fr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_fr_lg_grp_cd_p = null;

	/**
	 * [Cnd_ship_fr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_fr_lg_grp_cd_ListPutter() {
		if (Cnd_ship_fr_lg_grp_cd_p == null) {
			Cnd_ship_fr_lg_grp_cd_p = createCnd_ship_fr_lg_grp_cd_ListPutter(Cnd_ship_fr_lg_grp_cd, "ship_fr_lg_grp_cd", "ship_fr_lg_grp_nm");

		}
		return Cnd_ship_fr_lg_grp_cd_p;
	}
	
	
	/** [Cnd_tdlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tdlv_cd_p = null;

	/**
	 * [Cnd_tdlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tdlv_cd_ListPutter() {
		if (Cnd_tdlv_cd_p == null) {
			Cnd_tdlv_cd_p = createCnd_tdlv_cd_ListPutter(Cnd_tdlv_cd, "tdlv_cd", "tdlv_nm");

		}
		return Cnd_tdlv_cd_p;
	}
	
	
	/** [Cnd_ship_rqst_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_typ_p = null;

	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_typ_ListPutter() {
		if (Cnd_ship_rqst_id_typ_p == null) {
			Cnd_ship_rqst_id_typ_p = createCnd_ship_rqst_id_typ_ListPutter(Cnd_ship_rqst_id_typ, "ship_rqst_id_typ", "ship_rqst_id_typ_nm");

		}
		return Cnd_ship_rqst_id_typ_p;
	}
	
	
	/** [Cnd_ship_rqst_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_rqst_id_cd_p = null;

	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_rqst_id_cd_ListPutter() {
		if (Cnd_ship_rqst_id_cd_p == null) {
			Cnd_ship_rqst_id_cd_p = createCnd_ship_rqst_id_cd_ListPutter(Cnd_ship_rqst_id_cd, "ship_rqst_id_cd", "ship_rqst_id_nm");

		}
		return Cnd_ship_rqst_id_cd_p;
	}
	
	
	/** [Cnd_dlv_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_typ_p = null;

	/**
	 * [Cnd_dlv_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_typ_ListPutter() {
		if (Cnd_dlv_id_typ_p == null) {
			Cnd_dlv_id_typ_p = createCnd_dlv_id_typ_ListPutter(Cnd_dlv_id_typ, "dlv_id_typ", "dlv_id_typ_nm");

		}
		return Cnd_dlv_id_typ_p;
	}
	
	
	/** [Cnd_dlv_id_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_id_cd_p = null;

	/**
	 * [Cnd_dlv_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_id_cd_ListPutter() {
		if (Cnd_dlv_id_cd_p == null) {
			Cnd_dlv_id_cd_p = createCnd_dlv_id_cd_ListPutter(Cnd_dlv_id_cd, "dlv_id_cd", "dlv_id_nm");

		}
		return Cnd_dlv_id_cd_p;
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
	public static MSBEP_IvTrgtSel create(){
		MSBEP_IvTrgtSel p = new MSBEP_IvTrgtSel();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IvTrgtSel create(String name){
		MSBEP_IvTrgtSel p = new MSBEP_IvTrgtSel(name);
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
		MSBEP_IvTrgtSel_MC.jbfInitSrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitPrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitTop((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitFold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitTab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitTab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitTab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitTab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitDlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitCtrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitRPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitRslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbfInitBtn((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitSrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitPrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitTop((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitFold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitTab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitTab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitTab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitTab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitDlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitCtrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitRPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitRslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.jbInitBtn((MSBEP_IvTrgtSel)this);
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PrStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPrStsTyp(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.PrStsTypPanel = p.beansFactory.createPanel("PrStsTyp");
		p.PrStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_IvTrgtSel p) {
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
	protected static void jbfInitTab1(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_srch_mode_Group = p.beansFactory.createButtonGroup("Cnd.srch_mode");
		p.Cnd_srch_mode_SHIP_SCHD = p.beansFactory.createRadioButton("Cnd.srch_mode_SHIP_SCHD");
		p.Cnd_srch_mode_SHIP_INST = p.beansFactory.createRadioButton("Cnd.srch_mode_SHIP_INST");
		p.Cnd_srch_mode_SHIP_ACT = p.beansFactory.createRadioButton("Cnd.srch_mode_SHIP_ACT");
		p.Cnd_not_inst_flg = p.beansFactory.createCheckBox("Cnd.not_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_not_ship_flg = p.beansFactory.createCheckBox("Cnd.not_ship_flg");
		p.Cnd_part_ship_flg = p.beansFactory.createCheckBox("Cnd.part_ship_flg");
		p.Cnd_ship_flg = p.beansFactory.createCheckBox("Cnd.ship_flg");
		p.Cnd_etd_dt_fr_Label = p.beansFactory.createLabel("Cnd.etd_dt_fr_Label");
		p.Cnd_etd_dt_fr = p.beansFactory.createDateField("Cnd.etd_dt_fr");
		p.Cnd_etd_dt_fr.setLabel(p.Cnd_etd_dt_fr_Label);
		p.Cnd_etd_dt_to_Label = p.beansFactory.createLabel("Cnd.etd_dt_to_Label");
		p.Cnd_etd_dt_to = p.beansFactory.createDateField("Cnd.etd_dt_to");
		p.Cnd_etd_dt_to.setLabel(p.Cnd_etd_dt_to_Label);
		p.Cnd_eta_dt_fr_Label = p.beansFactory.createLabel("Cnd.eta_dt_fr_Label");
		p.Cnd_eta_dt_fr = p.beansFactory.createDateField("Cnd.eta_dt_fr");
		p.Cnd_eta_dt_fr.setLabel(p.Cnd_eta_dt_fr_Label);
		p.Cnd_eta_dt_to_Label = p.beansFactory.createLabel("Cnd.eta_dt_to_Label");
		p.Cnd_eta_dt_to = p.beansFactory.createDateField("Cnd.eta_dt_to");
		p.Cnd_eta_dt_to.setLabel(p.Cnd_eta_dt_to_Label);
		p.Cnd_via_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.via_schd_dt_fr_Label");
		p.Cnd_via_schd_dt_fr = p.beansFactory.createDateField("Cnd.via_schd_dt_fr");
		p.Cnd_via_schd_dt_fr.setLabel(p.Cnd_via_schd_dt_fr_Label);
		p.Cnd_via_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.via_schd_dt_to_Label");
		p.Cnd_via_schd_dt_to = p.beansFactory.createDateField("Cnd.via_schd_dt_to");
		p.Cnd_via_schd_dt_to.setLabel(p.Cnd_via_schd_dt_to_Label);
		p.Cnd_ship_fr_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_fr_lg_grp_cd_Label");
		p.Cnd_ship_fr_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_fr_lg_grp_cd");
		p.Cnd_ship_fr_lg_grp_cd.setLabel(p.Cnd_ship_fr_lg_grp_cd_Label);
		p.Cnd_ship_fr_lg_grp_nm = p.beansFactory.createTextField("Cnd.ship_fr_lg_grp_nm");
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_typ_Label");
		p.Cnd_ship_rqst_id_typ = p.beansFactory.createTextComboBox("Cnd.ship_rqst_id_typ");
		p.Cnd_ship_rqst_id_typ.setLabel(p.Cnd_ship_rqst_id_typ_Label);
		p.Cnd_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_typ_nm");
		p.Cnd_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Cnd.ship_rqst_id_cd_Label");
		p.Cnd_ship_rqst_id_cd = p.beansFactory.createTextField("Cnd.ship_rqst_id_cd");
		p.Cnd_ship_rqst_id_cd.setLabel(p.Cnd_ship_rqst_id_cd_Label);
		p.Cnd_ship_rqst_id_nm = p.beansFactory.createTextField("Cnd.ship_rqst_id_nm");
		p.Cnd_dlv_id_typ_Label = p.beansFactory.createLabel("Cnd.dlv_id_typ_Label");
		p.Cnd_dlv_id_typ = p.beansFactory.createTextComboBox("Cnd.dlv_id_typ");
		p.Cnd_dlv_id_typ.setLabel(p.Cnd_dlv_id_typ_Label);
		p.Cnd_dlv_id_typ_nm = p.beansFactory.createTextField("Cnd.dlv_id_typ_nm");
		p.Cnd_dlv_id_cd_Label = p.beansFactory.createLabel("Cnd.dlv_id_cd_Label");
		p.Cnd_dlv_id_cd = p.beansFactory.createTextField("Cnd.dlv_id_cd");
		p.Cnd_dlv_id_cd.setLabel(p.Cnd_dlv_id_cd_Label);
		p.Cnd_dlv_id_nm = p.beansFactory.createTextField("Cnd.dlv_id_nm");
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_ship_schd_no_Label = p.beansFactory.createLabel("Cnd.ship_schd_no_Label");
		p.Cnd_ship_schd_no = p.beansFactory.createTextField("Cnd.ship_schd_no");
		p.Cnd_ship_schd_no.setLabel(p.Cnd_ship_schd_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_ship_rqst_no_Label = p.beansFactory.createLabel("Cnd.ship_rqst_no_Label");
		p.Cnd_ship_rqst_no = p.beansFactory.createTextField("Cnd.ship_rqst_no");
		p.Cnd_ship_rqst_no.setLabel(p.Cnd_ship_rqst_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_ship_inst_d_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_d_no_Label");
		p.Cnd_ship_inst_d_no = p.beansFactory.createTextField("Cnd.ship_inst_d_no");
		p.Cnd_ship_inst_d_no.setLabel(p.Cnd_ship_inst_d_no_Label);
		p.Cnd_ship_act_no_Label = p.beansFactory.createLabel("Cnd.ship_act_no_Label");
		p.Cnd_ship_act_no = p.beansFactory.createTextField("Cnd.ship_act_no");
		p.Cnd_ship_act_no.setLabel(p.Cnd_ship_act_no_Label);
		p.Cnd_ship_act_d_no_Label = p.beansFactory.createLabel("Cnd.ship_act_d_no_Label");
		p.Cnd_ship_act_d_no = p.beansFactory.createTextField("Cnd.ship_act_d_no");
		p.Cnd_ship_act_d_no.setLabel(p.Cnd_ship_act_d_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
	}

	/**
	 * [ShipRqstIdCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipRqstIdCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.ShipRqstIdCndPanel = p.beansFactory.createPanel("ShipRqstIdCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.DlvCndPanel = p.beansFactory.createPanel("DlvCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.ItmCndPanel = p.beansFactory.createPanel("ItmCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_sim_cnd_grp_no = p.beansFactory.createTableColumn("Rslt.sim_cnd_grp_no", MCColumnType.NUMBER);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_no = p.beansFactory.createTableColumn("Rslt.ship_rqst_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_re_ship_schd_flg = p.beansFactory.createTableColumn("Rslt.re_ship_schd_flg", MCColumnType.CHECK);
		p.columnRslt_slo_iv_no = p.beansFactory.createTableColumn("Rslt.slo_iv_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_no = p.beansFactory.createTableColumn("Rslt.ship_inst_no", MCColumnType.TEXT);
		p.columnRslt_ship_inst_d_no = p.beansFactory.createTableColumn("Rslt.ship_inst_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_no = p.beansFactory.createTableColumn("Rslt.ship_act_no", MCColumnType.TEXT);
		p.columnRslt_ship_act_d_no = p.beansFactory.createTableColumn("Rslt.ship_act_d_no", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_qty = p.beansFactory.createTableColumn("Rslt.base_unit_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_upri_not_tgt_flg = p.beansFactory.createTableColumn("Rslt.upri_not_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_dscnt_rsn_cd = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_dscnt_rsn_nm = p.beansFactory.createTableColumn("Rslt.dscnt_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_tax_fix_flg = p.beansFactory.createTableColumn("Rslt.tax_fix_flg", MCColumnType.CHECK);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_tax_rate = p.beansFactory.createTableColumn("Rslt.tax_rate", MCColumnType.NUMBER);
		p.columnRslt_inc_tax_flg = p.beansFactory.createTableColumn("Rslt.inc_tax_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_typ_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_cd = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_cd", MCColumnType.TEXT);
		p.columnRslt_ship_rqst_id_nm = p.beansFactory.createTableColumn("Rslt.ship_rqst_id_nm", MCColumnType.TEXT);
		p.columnRslt_sls_upri_cng_flg = p.beansFactory.createTableColumn("Rslt.sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnRslt_ship_schd_dt = p.beansFactory.createTableColumn("Rslt.ship_schd_dt", MCColumnType.DATE);
		p.columnRslt_ship_schd_hm = p.beansFactory.createTableColumn("Rslt.ship_schd_hm", MCColumnType.DATE);
		p.columnRslt_dlv_rqst_dt = p.beansFactory.createTableColumn("Rslt.dlv_rqst_dt", MCColumnType.DATE);
		p.columnRslt_dlv_rqst_hm = p.beansFactory.createTableColumn("Rslt.dlv_rqst_hm", MCColumnType.DATE);
		p.columnRslt_ship_inst_dt = p.beansFactory.createTableColumn("Rslt.ship_inst_dt", MCColumnType.DATE);
		p.columnRslt_ship_inst_hm = p.beansFactory.createTableColumn("Rslt.ship_inst_hm", MCColumnType.DATE);
		p.columnRslt_ship_dt = p.beansFactory.createTableColumn("Rslt.ship_dt", MCColumnType.DATE);
		p.columnRslt_ship_hm = p.beansFactory.createTableColumn("Rslt.ship_hm", MCColumnType.DATE);
		p.columnRslt_dlv_dt = p.beansFactory.createTableColumn("Rslt.dlv_dt", MCColumnType.DATE);
		p.columnRslt_dlv_hm = p.beansFactory.createTableColumn("Rslt.dlv_hm", MCColumnType.DATE);
		p.columnRslt_via_dlv_typ = p.beansFactory.createTableColumn("Rslt.via_dlv_typ", MCColumnType.TEXT);
		p.columnRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("Rslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sls_cststk_flg = p.beansFactory.createTableColumn("Rslt.sls_cststk_flg", MCColumnType.CHECK);
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
		p.columnRslt_sls_basis_typ = p.beansFactory.createTableColumn("Rslt.sls_basis_typ", MCColumnType.TEXT);
		p.columnRslt_sls_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.sls_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_prov_basis_typ = p.beansFactory.createTableColumn("Rslt.prov_basis_typ", MCColumnType.TEXT);
		p.columnRslt_prov_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_bill_cl_typ = p.beansFactory.createTableColumn("Rslt.bill_cl_typ", MCColumnType.TEXT);
		p.columnRslt_purc_ddlv_flg = p.beansFactory.createTableColumn("Rslt.purc_ddlv_flg", MCColumnType.CHECK);
		p.columnRslt_ar_dpt_typ = p.beansFactory.createTableColumn("Rslt.ar_dpt_typ", MCColumnType.TEXT);
		p.columnRslt_lnk_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.lnk_ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_prnt_lcl_cd = p.beansFactory.createTableColumn("Rslt.prnt_lcl_cd", MCColumnType.TEXT);
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
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_upri_dec_place = p.beansFactory.createTableColumn("Rslt.upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_upri_rnd_typ = p.beansFactory.createTableColumn("Rslt.upri_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.tax_rnd_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730 = p.beansFactory.createButton("Btn.open_MSBEP1730", "open");
		p.Btn_chk_by_grp_no_flg = p.beansFactory.createCheckBox("Btn.chk_by_grp_no_flg");
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitPrStsTyp(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitTop(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitFold(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitTab1(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitTab2(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ShipRqstIdCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ShipRqstIdCndPanel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.DlvCndPanel, null);
		p.Tab3Panel.setLastBeans(p.DlvCndPanel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.ItmCndPanel, null);
		p.Tab4Panel.setLastBeans(p.ItmCndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.SrchModePanel.setLastBeans(p.Cnd_srch_mode_Group);
		p.Cnd_srch_mode_Group.setFirstBeans(p.Cnd_srch_mode_SHIP_SCHD);
		p.Cnd_srch_mode_SHIP_SCHD.setActionCommand("0");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SHIP_SCHD);
		p.SrchModePanel.add(p.Cnd_srch_mode_SHIP_SCHD);
		p.Cnd_srch_mode_SHIP_SCHD.setNextBeans(p.Cnd_srch_mode_SHIP_INST);
		p.Cnd_srch_mode_SHIP_INST.setActionCommand("1");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SHIP_INST);
		p.SrchModePanel.add(p.Cnd_srch_mode_SHIP_INST);
		p.Cnd_srch_mode_SHIP_INST.setNextBeans(p.Cnd_srch_mode_SHIP_ACT);
		p.Cnd_srch_mode_SHIP_ACT.setActionCommand("2");
		p.Cnd_srch_mode_Group.add(p.Cnd_srch_mode_SHIP_ACT);
		p.SrchModePanel.add(p.Cnd_srch_mode_SHIP_ACT);
		p.Cnd_srch_mode_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.srch_mode_META);
		p.PrStsTypPanel.add(p.Cnd_not_inst_flg);
		p.PrStsTypPanel.setLastBeans(p.Cnd_not_inst_flg);
		p.Cnd_not_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_not_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.not_inst_flg_META);
		p.PrStsTypPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_not_ship_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.inst_flg_META);
		p.PrStsTypPanel.add(p.Cnd_not_ship_flg);
		p.Cnd_not_ship_flg.setNextBeans(p.Cnd_part_ship_flg);
		p.Cnd_not_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.not_ship_flg_META);
		p.PrStsTypPanel.add(p.Cnd_part_ship_flg);
		p.Cnd_part_ship_flg.setNextBeans(p.Cnd_ship_flg);
		p.Cnd_part_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.part_ship_flg_META);
		p.PrStsTypPanel.add(p.Cnd_ship_flg);
		p.Cnd_ship_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_flg_META);
		p.CndPanel.add(p.Cnd_ship_schd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_ship_schd_dt_p_PPanel);
		p.Cnd_ship_schd_dt_p_PPanel.setNextBeans(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.Cnd_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_ship_inst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_inst_dt_p_PPanel);
		p.Cnd_ship_inst_dt_p_PPanel.setNextBeans(p.Cnd_ship_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ship_dt_p_PPanel.setNextBeans(p.Cnd_dlv_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_dt_p_PPanel);
		p.Cnd_dlv_dt_p_PPanel.setNextBeans(p.Cnd_etd_dt_fr);
		p.CndPanel.add(p.Cnd_etd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_etd_dt_fr);
		p.Cnd_etd_dt_fr.setNextBeans(p.Cnd_etd_dt_to);
		p.Cnd_etd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.etd_dt_fr_META);
		p.Cnd_etd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_etd_dt_to_Label);
		p.CndPanel.add(p.Cnd_etd_dt_to);
		p.Cnd_etd_dt_to.setNextBeans(p.Cnd_eta_dt_fr);
		p.Cnd_etd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.etd_dt_to_META);
		p.Cnd_etd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_eta_dt_fr_Label);
		p.CndPanel.add(p.Cnd_eta_dt_fr);
		p.Cnd_eta_dt_fr.setNextBeans(p.Cnd_eta_dt_to);
		p.Cnd_eta_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.eta_dt_fr_META);
		p.Cnd_eta_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_eta_dt_to_Label);
		p.CndPanel.add(p.Cnd_eta_dt_to);
		p.Cnd_eta_dt_to.setNextBeans(p.Cnd_via_schd_dt_fr);
		p.Cnd_eta_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.eta_dt_to_META);
		p.Cnd_eta_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_via_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_via_schd_dt_fr);
		p.Cnd_via_schd_dt_fr.setNextBeans(p.Cnd_via_schd_dt_to);
		p.Cnd_via_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.via_schd_dt_fr_META);
		p.Cnd_via_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_via_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_via_schd_dt_to);
		p.Cnd_via_schd_dt_to.setNextBeans(p.Cnd_ship_fr_lg_grp_cd);
		p.Cnd_via_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.via_schd_dt_to_META);
		p.Cnd_via_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_ship_fr_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_fr_lg_grp_cd, true);
		p.Cnd_ship_fr_lg_grp_cd.setLinkBeans(p.Cnd_ship_fr_lg_grp_nm);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_cd);
		p.Cnd_ship_fr_lg_grp_cd.setNextBeans(p.Cnd_ship_fr_lg_grp_nm);
		p.Cnd_ship_fr_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_fr_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_fr_lg_grp_nm);
		p.Cnd_ship_fr_lg_grp_nm.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_ship_fr_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_fr_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_fr_lg_grp_nm, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_ship_rqst_id_typ);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.Cnd_ship_rqst_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_typ, true);
		p.Cnd_ship_rqst_id_typ.setLinkBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ);
		p.Cnd_ship_rqst_id_typ.setNextBeans(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_rqst_id_typ_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_typ_nm);
		p.Cnd_ship_rqst_id_typ_nm.setNextBeans(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_rqst_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_id_cd);
		p.Cnd_ship_rqst_id_cd.setNextBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_rqst_id_cd_META);
		p.Cnd_ship_rqst_id_cd.addLinkBeans(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_cd, true);
		p.CndPanel.add(p.Cnd_ship_rqst_id_nm);
		p.Cnd_ship_rqst_id_nm.setNextBeans(p.Cnd_dlv_id_typ);
		p.Cnd_ship_rqst_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_rqst_id_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_id_nm, true);
		p.Cnd_dlv_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_typ, true);
		p.Cnd_dlv_id_typ.setLinkBeans(p.Cnd_dlv_id_typ_nm);
		p.CndPanel.add(p.Cnd_dlv_id_typ_Label);
		p.CndPanel.add(p.Cnd_dlv_id_typ);
		p.Cnd_dlv_id_typ.setNextBeans(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.dlv_id_typ_META);
		p.CndPanel.add(p.Cnd_dlv_id_typ_nm);
		p.Cnd_dlv_id_typ_nm.setNextBeans(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.dlv_id_typ_nm_META);
		p.CndPanel.add(p.Cnd_dlv_id_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_id_cd);
		p.Cnd_dlv_id_cd.setNextBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.dlv_id_cd_META);
		p.Cnd_dlv_id_cd.addLinkBeans(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_id_cd, true);
		p.CndPanel.add(p.Cnd_dlv_id_nm);
		p.Cnd_dlv_id_nm.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_dlv_id_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.dlv_id_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_id_nm, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_ship_schd_no);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_ship_schd_no_Label);
		p.CndPanel.add(p.Cnd_ship_schd_no);
		p.Cnd_ship_schd_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_ship_schd_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_schd_no_META);
		p.setPluralValueEnable(p.Cnd_ship_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_ship_rqst_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_ship_rqst_no_Label);
		p.CndPanel.add(p.Cnd_ship_rqst_no);
		p.Cnd_ship_rqst_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_ship_rqst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_rqst_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_ship_inst_no);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_ship_inst_d_no);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_inst_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_no, true);
		p.CndPanel.add(p.Cnd_ship_inst_d_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_d_no);
		p.Cnd_ship_inst_d_no.setNextBeans(p.Cnd_ship_act_no);
		p.Cnd_ship_inst_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_inst_d_no_META);
		p.setPluralValueEnable(p.Cnd_ship_inst_d_no, true);
		p.CndPanel.add(p.Cnd_ship_act_no_Label);
		p.CndPanel.add(p.Cnd_ship_act_no);
		p.Cnd_ship_act_no.setNextBeans(p.Cnd_ship_act_d_no);
		p.Cnd_ship_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_act_no_META);
		p.setPluralValueEnable(p.Cnd_ship_act_no, true);
		p.CndPanel.add(p.Cnd_ship_act_d_no_Label);
		p.CndPanel.add(p.Cnd_ship_act_d_no);
		p.Cnd_ship_act_d_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ship_act_d_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.ship_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_ship_act_d_no, true);
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
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1710.CndR.cst_itm_nm_META);
		p.ShipRqstIdCndPanel.add(p.Cnd_ship_rqst_id_grp_p_PPanel);
		p.ShipRqstIdCndPanel.setLastBeans(p.Cnd_ship_rqst_id_grp_p_PPanel);
		p.DlvCndPanel.add(p.Cnd_dlv_grp_p_PPanel);
		p.DlvCndPanel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.ItmCndPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmCndPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [ShipRqstIdCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipRqstIdCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.ShipRqstIdCndPanel.setValueCheck(false);
		p.ShipRqstIdCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ShipRqstIdCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.DlvCndPanel.setValueCheck(false);
		p.DlvCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DlvCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmCnd(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.ItmCndPanel.setValueCheck(false);
		p.ItmCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitRPnl(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_IvTrgtSel p) {
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
	protected static void jbInitBtn(MSBEP_IvTrgtSel p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP1730.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP1730);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP1730);
		p.Btn_open_MSBEP1730.setNextBeans(p.Btn_chk_by_grp_no_flg);
		p.BtnPanel.add(p.Btn_chk_by_grp_no_flg);
		p.Btn_chk_by_grp_no_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1710.BtnR.chk_by_grp_no_flg_META);
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
		MSBEP_IvTrgtSel_MC.mcInitSrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitPrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitTop((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitFold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitTab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitTab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitTab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitTab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitDlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitCtrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitRPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitRslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.mcInitBtn((MSBEP_IvTrgtSel)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_IvTrgtSel_MC.statusInitSRCH_SrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_PrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Top((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Fold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Tab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Tab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Tab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Tab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Cnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_ShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_DlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_ItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Ctrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_RPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Rslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH_Btn((MSBEP_IvTrgtSel)this);

		// [SRCH_SHIP_INST]ステータスのモードの設定
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_SrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_PrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Top((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Fold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Tab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Tab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Tab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Tab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Cnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_ShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_DlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_ItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Ctrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_RPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Rslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__INST_Btn((MSBEP_IvTrgtSel)this);

		// [SRCH_SHIP_ACT]ステータスのモードの設定
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_SrchMode((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_PrStsTyp((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Top((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Fold((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Tab1((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Tab2((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Tab3((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Tab4((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Cnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_ShipRqstIdCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_DlvCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_ItmCnd((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Ctrl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_RPnl((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Rslt((MSBEP_IvTrgtSel)this);
		MSBEP_IvTrgtSel_MC.statusInitSRCH__SHIP__ACT_Btn((MSBEP_IvTrgtSel)this);

	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [PrStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPrStsTyp(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_IvTrgtSel p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_IvTrgtSel p) {
		p.Cnd_srch_mode_Group.addAllListener(p);
		p.Cnd_srch_mode_SHIP_SCHD.addAllListener(p);
		p.Cnd_srch_mode_SHIP_INST.addAllListener(p);
		p.Cnd_srch_mode_SHIP_ACT.addAllListener(p);
		p.Cnd_not_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_not_ship_flg.addAllListener(p);
		p.Cnd_part_ship_flg.addAllListener(p);
		p.Cnd_ship_flg.addAllListener(p);
		p.Cnd_etd_dt_fr.setListListener(p);
		p.Cnd_etd_dt_fr.addAllListener(p);
		p.Cnd_etd_dt_to.setListListener(p);
		p.Cnd_etd_dt_to.addAllListener(p);
		p.Cnd_eta_dt_fr.setListListener(p);
		p.Cnd_eta_dt_fr.addAllListener(p);
		p.Cnd_eta_dt_to.setListListener(p);
		p.Cnd_eta_dt_to.addAllListener(p);
		p.Cnd_via_schd_dt_fr.setListListener(p);
		p.Cnd_via_schd_dt_fr.addAllListener(p);
		p.Cnd_via_schd_dt_to.setListListener(p);
		p.Cnd_via_schd_dt_to.addAllListener(p);
		p.Cnd_ship_fr_lg_grp_cd.setListListener(p);
		p.Cnd_ship_fr_lg_grp_cd.addAllListener(p);
		p.Cnd_ship_fr_lg_grp_nm.setListListener(p);
		p.Cnd_ship_fr_lg_grp_nm.addAllListener(p);
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_typ.setListListener(p);
		p.Cnd_ship_rqst_id_typ.addAllListener(p);
		p.Cnd_ship_rqst_id_typ_nm.setListListener(p);
		p.Cnd_ship_rqst_id_typ_nm.addAllListener(p);
		p.Cnd_ship_rqst_id_cd.setListListener(p);
		p.Cnd_ship_rqst_id_cd.addAllListener(p);
		p.Cnd_ship_rqst_id_nm.setListListener(p);
		p.Cnd_ship_rqst_id_nm.addAllListener(p);
		p.Cnd_dlv_id_typ.setListListener(p);
		p.Cnd_dlv_id_typ.addAllListener(p);
		p.Cnd_dlv_id_typ_nm.setListListener(p);
		p.Cnd_dlv_id_typ_nm.addAllListener(p);
		p.Cnd_dlv_id_cd.setListListener(p);
		p.Cnd_dlv_id_cd.addAllListener(p);
		p.Cnd_dlv_id_nm.setListListener(p);
		p.Cnd_dlv_id_nm.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_ship_schd_no.setListListener(p);
		p.Cnd_ship_schd_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_ship_rqst_no.setListListener(p);
		p.Cnd_ship_rqst_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_ship_inst_d_no.setListListener(p);
		p.Cnd_ship_inst_d_no.addAllListener(p);
		p.Cnd_ship_act_no.setListListener(p);
		p.Cnd_ship_act_no.addAllListener(p);
		p.Cnd_ship_act_d_no.setListListener(p);
		p.Cnd_ship_act_d_no.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
	}

	/**
	 *  [ShipRqstIdCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipRqstIdCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [DlvCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [ItmCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmCnd(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_IvTrgtSel p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_IvTrgtSel p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_IvTrgtSel p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_sim_cnd_grp_no.addAllListener(p);
		p.columnRslt_sim_cnd_grp_no.setListListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_ship_rqst_no.addAllListener(p);
		p.columnRslt_ship_rqst_no.setListListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_re_ship_schd_flg.addAllListener(p);
		p.columnRslt_slo_iv_no.addAllListener(p);
		p.columnRslt_slo_iv_no.setListListener(p);
		p.columnRslt_ship_inst_no.addAllListener(p);
		p.columnRslt_ship_inst_no.setListListener(p);
		p.columnRslt_ship_inst_d_no.addAllListener(p);
		p.columnRslt_ship_inst_d_no.setListListener(p);
		p.columnRslt_ship_act_no.addAllListener(p);
		p.columnRslt_ship_act_no.setListListener(p);
		p.columnRslt_ship_act_d_no.addAllListener(p);
		p.columnRslt_ship_act_d_no.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_base_unit_qty.addAllListener(p);
		p.columnRslt_base_unit_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_upri_not_tgt_flg.addAllListener(p);
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
		p.columnRslt_inc_tax_flg.addAllListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_typ.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ.setListListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_typ_nm.setListListener(p);
		p.columnRslt_ship_rqst_id_cd.addAllListener(p);
		p.columnRslt_ship_rqst_id_cd.setListListener(p);
		p.columnRslt_ship_rqst_id_nm.addAllListener(p);
		p.columnRslt_ship_rqst_id_nm.setListListener(p);
		p.columnRslt_sls_upri_cng_flg.addAllListener(p);
		p.columnRslt_ship_schd_dt.addAllListener(p);
		p.columnRslt_ship_schd_dt.setListListener(p);
		p.columnRslt_ship_schd_hm.addAllListener(p);
		p.columnRslt_ship_schd_hm.setListListener(p);
		p.columnRslt_dlv_rqst_dt.addAllListener(p);
		p.columnRslt_dlv_rqst_dt.setListListener(p);
		p.columnRslt_dlv_rqst_hm.addAllListener(p);
		p.columnRslt_dlv_rqst_hm.setListListener(p);
		p.columnRslt_ship_inst_dt.addAllListener(p);
		p.columnRslt_ship_inst_dt.setListListener(p);
		p.columnRslt_ship_inst_hm.addAllListener(p);
		p.columnRslt_ship_inst_hm.setListListener(p);
		p.columnRslt_ship_dt.addAllListener(p);
		p.columnRslt_ship_dt.setListListener(p);
		p.columnRslt_ship_hm.addAllListener(p);
		p.columnRslt_ship_hm.setListListener(p);
		p.columnRslt_dlv_dt.addAllListener(p);
		p.columnRslt_dlv_dt.setListListener(p);
		p.columnRslt_dlv_hm.addAllListener(p);
		p.columnRslt_dlv_hm.setListListener(p);
		p.columnRslt_via_dlv_typ.addAllListener(p);
		p.columnRslt_via_dlv_typ.setListListener(p);
		p.columnRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnRslt_via_dlv_typ_nm.setListListener(p);
		p.columnRslt_sls_cststk_flg.addAllListener(p);
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
		p.columnRslt_sls_basis_typ.addAllListener(p);
		p.columnRslt_sls_basis_typ.setListListener(p);
		p.columnRslt_sls_basis_typ_nm.addAllListener(p);
		p.columnRslt_sls_basis_typ_nm.setListListener(p);
		p.columnRslt_prov_basis_typ.addAllListener(p);
		p.columnRslt_prov_basis_typ.setListListener(p);
		p.columnRslt_prov_basis_typ_nm.addAllListener(p);
		p.columnRslt_prov_basis_typ_nm.setListListener(p);
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
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_tterm_cd3.addAllListener(p);
		p.columnRslt_tterm_cd3.setListListener(p);
		p.columnRslt_tterm_nm3.addAllListener(p);
		p.columnRslt_tterm_nm3.setListListener(p);
		p.columnRslt_tterm_rmrks3.addAllListener(p);
		p.columnRslt_tterm_rmrks3.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnRslt_bill_cl_typ.addAllListener(p);
		p.columnRslt_bill_cl_typ.setListListener(p);
		p.columnRslt_purc_ddlv_flg.addAllListener(p);
		p.columnRslt_ar_dpt_typ.addAllListener(p);
		p.columnRslt_ar_dpt_typ.setListListener(p);
		p.columnRslt_lnk_ar_dpt_cd.addAllListener(p);
		p.columnRslt_lnk_ar_dpt_cd.setListListener(p);
		p.columnRslt_prnt_lcl_cd.addAllListener(p);
		p.columnRslt_prnt_lcl_cd.setListListener(p);
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
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_upri_dec_place.addAllListener(p);
		p.columnRslt_upri_dec_place.setListListener(p);
		p.columnRslt_amt_rnd_typ.addAllListener(p);
		p.columnRslt_amt_rnd_typ.setListListener(p);
		p.columnRslt_upri_rnd_typ.addAllListener(p);
		p.columnRslt_upri_rnd_typ.setListListener(p);
		p.columnRslt_tax_rnd_typ.addAllListener(p);
		p.columnRslt_tax_rnd_typ.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_IvTrgtSel p) {
		p.Btn_open_MSBEP1730.addAllListener(p);
		p.Btn_open_MSBEP1730.setAPMethodName("doBtn_open_MSBEP1730");
		p.Btn_chk_by_grp_no_flg.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchMode(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_PrStsTyp(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_IvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_part_ship_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_etd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_etd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_eta_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_eta_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_via_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_via_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ship_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipRqstIdCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ItmCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_IvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_IvTrgtSel p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_re_ship_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_iv_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_iv_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_inc_tax_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ship_hm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dlv_hm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnRslt_sls_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lnk_ar_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upri_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_IvTrgtSel p){
		p.Btn_open_MSBEP1730.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_SrchMode(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_PrStsTyp(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Top(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Fold(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Tab1(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Tab2(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Tab3(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Tab4(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Cnd(MSBEP_IvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, SRCH_SHIP_INST, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_SHIP_INST, MCMode.REQUIRED);
		p.Cnd_not_ship_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SRCH_SHIP_INST, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, SRCH_SHIP_INST, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_etd_dt_fr.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_etd_dt_to.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_eta_dt_fr.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_eta_dt_to.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_via_schd_dt_fr.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_via_schd_dt_to.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_ShipRqstIdCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_DlvCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_ItmCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Ctrl(MSBEP_IvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_RPnl(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Rslt(MSBEP_IvTrgtSel p){
		p.columnRslt_check.putMode(p, SRCH_SHIP_INST, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_re_ship_schd_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_slo_iv_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_upri_not_tgt_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_iv_upri_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_iv_amt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_inc_tax_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_upri_cng_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_hm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_hm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_dt.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ship_hm.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_dt.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_dlv_hm.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_lnk_ar_dpt_cd.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SHIP_INST, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SHIP_INST, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_upri_dec_place.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_amt_rnd_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_upri_rnd_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);
		p.columnRslt_tax_rnd_typ.putMode(p, SRCH_SHIP_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SHIP_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__INST_Btn(MSBEP_IvTrgtSel p){
		p.Btn_open_MSBEP1730.putMode(p, SRCH_SHIP_INST, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH_SHIP_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_SrchMode(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[PrStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_PrStsTyp(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Top(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Fold(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Tab1(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Tab2(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Tab3(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Tab4(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Cnd(MSBEP_IvTrgtSel p){
		p.Cnd_srch_mode_Group.putMode(p, SRCH_SHIP_ACT, MCMode.REQUIRED);
		p.Cnd_not_inst_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_not_ship_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_part_ship_flg.putMode(p, SRCH_SHIP_ACT, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, SRCH_SHIP_ACT, MCMode.REQUIRED);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_inst_dt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_dt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_dt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_etd_dt_fr.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_etd_dt_to.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_eta_dt_fr.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_eta_dt_to.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_via_schd_dt_fr.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_via_schd_dt_to.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_fr_lg_grp_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_ship_rqst_id_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Cnd_dlv_id_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_dlv_id_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_schd_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_inst_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_inst_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_act_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_act_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);
		p.Cnd_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[ShipRqstIdCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_ShipRqstIdCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[DlvCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_DlvCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[ItmCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_ItmCnd(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Ctrl(MSBEP_IvTrgtSel p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_RPnl(MSBEP_IvTrgtSel p){

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Rslt(MSBEP_IvTrgtSel p){
		p.columnRslt_check.putMode(p, SRCH_SHIP_ACT, MCMode.REQUIRED);
		p.columnRslt_sim_cnd_grp_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_re_ship_schd_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_slo_iv_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_act_d_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_qty.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_upri_not_tgt_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_dscnt_rsn_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dscnt_rsn_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_iv_upri_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_iv_amt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_tax_fix_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tax_rate.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_inc_tax_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_dlv_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_rqst_id_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_rqst_id_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_upri_cng_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ship_schd_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_hm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_rqst_hm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_inst_hm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_hm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dlv_hm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_dlv_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Rslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_cd.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_tdlv_p_PPanel.columnDlv_cntry_nm.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sls_cststk_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_prov_basis_typ_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd1.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm1.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks1.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd2.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm2.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks2.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_cd3.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_nm3.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_tterm_rmrks3.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_cd.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ship_fr_lg_grp_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_purc_ddlv_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_ar_dpt_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_lnk_ar_dpt_cd.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_prnt_lcl_cd.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.Rslt_ship_rqst_id_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_dlv_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SHIP_ACT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SHIP_ACT, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_upri_dec_place.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_amt_rnd_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_upri_rnd_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);
		p.columnRslt_tax_rnd_typ.putMode(p, SRCH_SHIP_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SHIP_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SHIP__ACT_Btn(MSBEP_IvTrgtSel p){
		p.Btn_open_MSBEP1730.putMode(p, SRCH_SHIP_ACT, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH_SHIP_ACT, MCMode.ENABLE);

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
		MSBEP_IvTrgtSel_MC.setTableConfigRslt((MSBEP_IvTrgtSel)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_IvTrgtSel p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_sim_cnd_grp_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sim_cnd_grp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sim_cnd_grp_no);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_ship_rqst_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_rqst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_no);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_re_ship_schd_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.re_ship_schd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_re_ship_schd_flg);
		p.columnRslt_slo_iv_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.slo_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_iv_no);
		p.columnRslt_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_no);
		p.columnRslt_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_inst_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_d_no);
		p.columnRslt_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_no);
		p.columnRslt_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_act_d_no);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_qty.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.base_unit_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_upri_not_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upri_not_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri_not_tgt_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.UpriTable);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_dscnt_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dscnt_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_cd);
		p.columnRslt_dscnt_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dscnt_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_rsn_nm);
		p.RsltTable.addTable(p.Rslt_iv_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_iv_amt_p_PPanel.AmtTable);
		p.columnRslt_tax_fix_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tax_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_fix_flg);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_tax_rate.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rate);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.columnRslt_inc_tax_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.inc_tax_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inc_tax_flg);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.RsltTable.addTable(p.Rslt_dlv_p_PPanel.DlvTable);
		p.columnRslt_ship_rqst_id_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_rqst_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ);
		p.columnRslt_ship_rqst_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_rqst_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_typ_nm);
		p.columnRslt_ship_rqst_id_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_rqst_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_cd);
		p.columnRslt_ship_rqst_id_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_rqst_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_rqst_id_nm);
		p.columnRslt_sls_upri_cng_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sls_upri_cng_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_upri_cng_flg);
		p.columnRslt_ship_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_schd_dt_META);
		p.columnRslt_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_dt);
		p.columnRslt_ship_schd_hm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_schd_hm_META);
		p.columnRslt_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_hm);
		p.columnRslt_dlv_rqst_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_rqst_dt_META);
		p.columnRslt_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_dt);
		p.columnRslt_dlv_rqst_hm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_rqst_hm_META);
		p.columnRslt_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_rqst_hm);
		p.columnRslt_ship_inst_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_inst_dt_META);
		p.columnRslt_ship_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_dt);
		p.columnRslt_ship_inst_hm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_inst_hm_META);
		p.columnRslt_ship_inst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_inst_hm);
		p.columnRslt_ship_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_dt_META);
		p.columnRslt_ship_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dt);
		p.columnRslt_ship_hm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_hm_META);
		p.columnRslt_ship_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_hm);
		p.columnRslt_dlv_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_dt_META);
		p.columnRslt_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_dt);
		p.columnRslt_dlv_hm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dlv_hm_META);
		p.columnRslt_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_hm);
		p.columnRslt_via_dlv_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.via_dlv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ);
		p.columnRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.via_dlv_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_dlv_typ_nm);
		p.RsltTable.addTable(p.Rslt_tdlv_p_PPanel.DlvTable);
		p.columnRslt_sls_cststk_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sls_cststk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_cststk_flg);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_dschrg_port_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dschrg_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_cd);
		p.columnRslt_dschrg_port_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.dschrg_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_nm);
		p.columnRslt_eta_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.eta_dt_META);
		p.columnRslt_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_eta_dt);
		p.columnRslt_via_port_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.via_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_cd);
		p.columnRslt_via_port_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.via_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_nm);
		p.columnRslt_via_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.via_schd_dt_META);
		p.columnRslt_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_via_schd_dt);
		p.columnRslt_sls_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sls_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ);
		p.columnRslt_sls_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sls_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ_nm);
		p.columnRslt_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.prov_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_basis_typ);
		p.columnRslt_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.prov_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prov_basis_typ_nm);
		p.columnRslt_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd1);
		p.columnRslt_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm1);
		p.columnRslt_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks1);
		p.columnRslt_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd2);
		p.columnRslt_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm2);
		p.columnRslt_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks2);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_cd3);
		p.columnRslt_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_nm3);
		p.columnRslt_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tterm_rmrks3);
		p.columnRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_fr_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_cd);
		p.columnRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ship_fr_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_fr_lg_grp_nm);
		p.columnRslt_bill_cl_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.bill_cl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_typ);
		p.columnRslt_purc_ddlv_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.purc_ddlv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_ddlv_flg);
		p.columnRslt_ar_dpt_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ar_dpt_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_typ);
		p.columnRslt_lnk_ar_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.lnk_ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lnk_ar_dpt_cd);
		p.columnRslt_prnt_lcl_cd.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.prnt_lcl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_lcl_cd);
		p.RsltTable.addTable(p.Rslt_ship_rqst_id_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_dlv_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.columnRslt_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri_dec_place);
		p.columnRslt_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_rnd_typ);
		p.columnRslt_upri_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.upri_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upri_rnd_typ);
		p.columnRslt_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1710.RsltR.tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_rnd_typ);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_sim_cnd_grp_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ship_fr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_fr_lg_grp_cd.getListConfig().setPutter(getCnd_ship_fr_lg_grp_cd_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_ship_rqst_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_rqst_id_typ.getListConfig().setPutter(getCnd_ship_rqst_id_typ_ListPutter());
		Cnd_ship_rqst_id_cd.getListConfig().setPutter(getCnd_ship_rqst_id_cd_ListPutter());
		Cnd_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_id_typ.getListConfig().setPutter(getCnd_dlv_id_typ_ListPutter());
		Cnd_dlv_id_cd.getListConfig().setPutter(getCnd_dlv_id_cd_ListPutter());
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
	 * この画面を[SRCH_SHIP_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SHIP_INSTStatus() {
		status = SRCH_SHIP_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SHIP_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SHIP_ACTStatus() {
		status = SRCH_SHIP_ACT;
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
		else if (SRCH_SHIP_INST.equals(status)) {
			setSRCH_SHIP_INSTStatus();
		}
		else if (SRCH_SHIP_ACT.equals(status)) {
			setSRCH_SHIP_ACTStatus();
		}
	}

	/**
	 * [Cnd_ship_fr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_fr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_tdlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tdlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_rqst_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipRqstIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_rqst_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_rqst_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipRqstId");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DlvIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.DlvId");
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
		if(combo == Cnd_ship_fr_lg_grp_cd) return getCnd_ship_fr_lg_grp_cd(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_ship_rqst_id_typ) return getCnd_ship_rqst_id_typ(row, info);
		if(combo == Cnd_ship_rqst_id_cd) return getCnd_ship_rqst_id_cd(row, info);
		if(combo == Cnd_dlv_id_typ) return getCnd_dlv_id_typ(row, info);
		if(combo == Cnd_dlv_id_cd) return getCnd_dlv_id_cd(row, info);
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
		else if (ap == Btn_open_MSBEP1730) doBtn_open_MSBEP1730(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1730]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1730(MCEventInfo info);

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
		if (vc == Cnd_not_inst_flg) return doCnd_not_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_not_ship_flg) return doCnd_not_ship_flg_VC(info);
		if (vc == Cnd_part_ship_flg) return doCnd_part_ship_flg_VC(info);
		if (vc == Cnd_ship_flg) return doCnd_ship_flg_VC(info);
		if (vc == Cnd_etd_dt_fr) return doCnd_etd_dt_fr_VC(info);
		if (vc == Cnd_etd_dt_to) return doCnd_etd_dt_to_VC(info);
		if (vc == Cnd_eta_dt_fr) return doCnd_eta_dt_fr_VC(info);
		if (vc == Cnd_eta_dt_to) return doCnd_eta_dt_to_VC(info);
		if (vc == Cnd_via_schd_dt_fr) return doCnd_via_schd_dt_fr_VC(info);
		if (vc == Cnd_via_schd_dt_to) return doCnd_via_schd_dt_to_VC(info);
		if (vc == Cnd_ship_fr_lg_grp_cd) return doCnd_ship_fr_lg_grp_cd_VC(info);
		if (vc == Cnd_ship_fr_lg_grp_nm) return doCnd_ship_fr_lg_grp_nm_VC(info);
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_typ) return doCnd_ship_rqst_id_typ_VC(info);
		if (vc == Cnd_ship_rqst_id_typ_nm) return doCnd_ship_rqst_id_typ_nm_VC(info);
		if (vc == Cnd_ship_rqst_id_cd) return doCnd_ship_rqst_id_cd_VC(info);
		if (vc == Cnd_ship_rqst_id_nm) return doCnd_ship_rqst_id_nm_VC(info);
		if (vc == Cnd_dlv_id_typ) return doCnd_dlv_id_typ_VC(info);
		if (vc == Cnd_dlv_id_typ_nm) return doCnd_dlv_id_typ_nm_VC(info);
		if (vc == Cnd_dlv_id_cd) return doCnd_dlv_id_cd_VC(info);
		if (vc == Cnd_dlv_id_nm) return doCnd_dlv_id_nm_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_ship_schd_no) return doCnd_ship_schd_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_ship_rqst_no) return doCnd_ship_rqst_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_ship_inst_d_no) return doCnd_ship_inst_d_no_VC(info);
		if (vc == Cnd_ship_act_no) return doCnd_ship_act_no_VC(info);
		if (vc == Cnd_ship_act_d_no) return doCnd_ship_act_d_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_sim_cnd_grp_no) return doRslt_sim_cnd_grp_no_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_ship_rqst_no) return doRslt_ship_rqst_no_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_re_ship_schd_flg) return doRslt_re_ship_schd_flg_VC(info);
		if (vc == columnRslt_slo_iv_no) return doRslt_slo_iv_no_VC(info);
		if (vc == columnRslt_ship_inst_no) return doRslt_ship_inst_no_VC(info);
		if (vc == columnRslt_ship_inst_d_no) return doRslt_ship_inst_d_no_VC(info);
		if (vc == columnRslt_ship_act_no) return doRslt_ship_act_no_VC(info);
		if (vc == columnRslt_ship_act_d_no) return doRslt_ship_act_d_no_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_qty) return doRslt_base_unit_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_upri_not_tgt_flg) return doRslt_upri_not_tgt_flg_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_dscnt_rsn_cd) return doRslt_dscnt_rsn_cd_VC(info);
		if (vc == columnRslt_dscnt_rsn_nm) return doRslt_dscnt_rsn_nm_VC(info);
		if (vc == columnRslt_tax_fix_flg) return doRslt_tax_fix_flg_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_tax_rate) return doRslt_tax_rate_VC(info);
		if (vc == columnRslt_inc_tax_flg) return doRslt_inc_tax_flg_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ) return doRslt_ship_rqst_id_typ_VC(info);
		if (vc == columnRslt_ship_rqst_id_typ_nm) return doRslt_ship_rqst_id_typ_nm_VC(info);
		if (vc == columnRslt_ship_rqst_id_cd) return doRslt_ship_rqst_id_cd_VC(info);
		if (vc == columnRslt_ship_rqst_id_nm) return doRslt_ship_rqst_id_nm_VC(info);
		if (vc == columnRslt_sls_upri_cng_flg) return doRslt_sls_upri_cng_flg_VC(info);
		if (vc == columnRslt_ship_schd_dt) return doRslt_ship_schd_dt_VC(info);
		if (vc == columnRslt_ship_schd_hm) return doRslt_ship_schd_hm_VC(info);
		if (vc == columnRslt_dlv_rqst_dt) return doRslt_dlv_rqst_dt_VC(info);
		if (vc == columnRslt_dlv_rqst_hm) return doRslt_dlv_rqst_hm_VC(info);
		if (vc == columnRslt_ship_inst_dt) return doRslt_ship_inst_dt_VC(info);
		if (vc == columnRslt_ship_inst_hm) return doRslt_ship_inst_hm_VC(info);
		if (vc == columnRslt_ship_dt) return doRslt_ship_dt_VC(info);
		if (vc == columnRslt_ship_hm) return doRslt_ship_hm_VC(info);
		if (vc == columnRslt_dlv_dt) return doRslt_dlv_dt_VC(info);
		if (vc == columnRslt_dlv_hm) return doRslt_dlv_hm_VC(info);
		if (vc == columnRslt_via_dlv_typ) return doRslt_via_dlv_typ_VC(info);
		if (vc == columnRslt_via_dlv_typ_nm) return doRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnRslt_sls_cststk_flg) return doRslt_sls_cststk_flg_VC(info);
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
		if (vc == columnRslt_sls_basis_typ) return doRslt_sls_basis_typ_VC(info);
		if (vc == columnRslt_sls_basis_typ_nm) return doRslt_sls_basis_typ_nm_VC(info);
		if (vc == columnRslt_prov_basis_typ) return doRslt_prov_basis_typ_VC(info);
		if (vc == columnRslt_prov_basis_typ_nm) return doRslt_prov_basis_typ_nm_VC(info);
		if (vc == columnRslt_tterm_cd1) return doRslt_tterm_cd1_VC(info);
		if (vc == columnRslt_tterm_nm1) return doRslt_tterm_nm1_VC(info);
		if (vc == columnRslt_tterm_rmrks1) return doRslt_tterm_rmrks1_VC(info);
		if (vc == columnRslt_tterm_cd2) return doRslt_tterm_cd2_VC(info);
		if (vc == columnRslt_tterm_nm2) return doRslt_tterm_nm2_VC(info);
		if (vc == columnRslt_tterm_rmrks2) return doRslt_tterm_rmrks2_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_tterm_cd3) return doRslt_tterm_cd3_VC(info);
		if (vc == columnRslt_tterm_nm3) return doRslt_tterm_nm3_VC(info);
		if (vc == columnRslt_tterm_rmrks3) return doRslt_tterm_rmrks3_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_cd) return doRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnRslt_ship_fr_lg_grp_nm) return doRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnRslt_bill_cl_typ) return doRslt_bill_cl_typ_VC(info);
		if (vc == columnRslt_purc_ddlv_flg) return doRslt_purc_ddlv_flg_VC(info);
		if (vc == columnRslt_ar_dpt_typ) return doRslt_ar_dpt_typ_VC(info);
		if (vc == columnRslt_lnk_ar_dpt_cd) return doRslt_lnk_ar_dpt_cd_VC(info);
		if (vc == columnRslt_prnt_lcl_cd) return doRslt_prnt_lcl_cd_VC(info);
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
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_upri_dec_place) return doRslt_upri_dec_place_VC(info);
		if (vc == columnRslt_amt_rnd_typ) return doRslt_amt_rnd_typ_VC(info);
		if (vc == columnRslt_upri_rnd_typ) return doRslt_upri_rnd_typ_VC(info);
		if (vc == columnRslt_tax_rnd_typ) return doRslt_tax_rnd_typ_VC(info);
		if (vc == Btn_chk_by_grp_no_flg) return doBtn_chk_by_grp_no_flg_VC(info);
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
	 * [Cnd]パネルの[not_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[etd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_etd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[etd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_etd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[eta_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_eta_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[eta_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_eta_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_via_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_via_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_id_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_rqst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[re_ship_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_re_ship_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri_not_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri_not_tgt_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_inst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_inst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_cststk_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prov_basis_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_ddlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lnk_ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lnk_ar_dpt_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upri_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upri_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_rnd_typ_VC(MCEventInfo info){
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
		else if (nc == Cnd_not_inst_flg) doCnd_not_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_not_ship_flg) doCnd_not_ship_flg_NC(info);
		else if (nc == Cnd_part_ship_flg) doCnd_part_ship_flg_NC(info);
		else if (nc == Cnd_ship_flg) doCnd_ship_flg_NC(info);
		else if (nc == Cnd_etd_dt_fr) doCnd_etd_dt_fr_NC(info);
		else if (nc == Cnd_etd_dt_to) doCnd_etd_dt_to_NC(info);
		else if (nc == Cnd_eta_dt_fr) doCnd_eta_dt_fr_NC(info);
		else if (nc == Cnd_eta_dt_to) doCnd_eta_dt_to_NC(info);
		else if (nc == Cnd_via_schd_dt_fr) doCnd_via_schd_dt_fr_NC(info);
		else if (nc == Cnd_via_schd_dt_to) doCnd_via_schd_dt_to_NC(info);
		else if (nc == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NC(info);
		else if (nc == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NC(info);
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NC(info);
		else if (nc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NC(info);
		else if (nc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NC(info);
		else if (nc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NC(info);
		else if (nc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NC(info);
		else if (nc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NC(info);
		else if (nc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_ship_schd_no) doCnd_ship_schd_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NC(info);
		else if (nc == Cnd_ship_act_no) doCnd_ship_act_no_NC(info);
		else if (nc == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_re_ship_schd_flg) doRslt_re_ship_schd_flg_NC(info);
		else if (nc == columnRslt_slo_iv_no) doRslt_slo_iv_no_NC(info);
		else if (nc == columnRslt_ship_inst_no) doRslt_ship_inst_no_NC(info);
		else if (nc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NC(info);
		else if (nc == columnRslt_ship_act_no) doRslt_ship_act_no_NC(info);
		else if (nc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_qty) doRslt_base_unit_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_upri_not_tgt_flg) doRslt_upri_not_tgt_flg_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NC(info);
		else if (nc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NC(info);
		else if (nc == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_tax_rate) doRslt_tax_rate_NC(info);
		else if (nc == columnRslt_inc_tax_flg) doRslt_inc_tax_flg_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NC(info);
		else if (nc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NC(info);
		else if (nc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NC(info);
		else if (nc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NC(info);
		else if (nc == columnRslt_sls_upri_cng_flg) doRslt_sls_upri_cng_flg_NC(info);
		else if (nc == columnRslt_ship_schd_dt) doRslt_ship_schd_dt_NC(info);
		else if (nc == columnRslt_ship_schd_hm) doRslt_ship_schd_hm_NC(info);
		else if (nc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NC(info);
		else if (nc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NC(info);
		else if (nc == columnRslt_ship_inst_dt) doRslt_ship_inst_dt_NC(info);
		else if (nc == columnRslt_ship_inst_hm) doRslt_ship_inst_hm_NC(info);
		else if (nc == columnRslt_ship_dt) doRslt_ship_dt_NC(info);
		else if (nc == columnRslt_ship_hm) doRslt_ship_hm_NC(info);
		else if (nc == columnRslt_dlv_dt) doRslt_dlv_dt_NC(info);
		else if (nc == columnRslt_dlv_hm) doRslt_dlv_hm_NC(info);
		else if (nc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NC(info);
		else if (nc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NC(info);
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
		else if (nc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NC(info);
		else if (nc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NC(info);
		else if (nc == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NC(info);
		else if (nc == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NC(info);
		else if (nc == columnRslt_tterm_cd1) doRslt_tterm_cd1_NC(info);
		else if (nc == columnRslt_tterm_nm1) doRslt_tterm_nm1_NC(info);
		else if (nc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_tterm_cd2) doRslt_tterm_cd2_NC(info);
		else if (nc == columnRslt_tterm_nm2) doRslt_tterm_nm2_NC(info);
		else if (nc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_tterm_cd3) doRslt_tterm_cd3_NC(info);
		else if (nc == columnRslt_tterm_nm3) doRslt_tterm_nm3_NC(info);
		else if (nc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NC(info);
		else if (nc == columnRslt_purc_ddlv_flg) doRslt_purc_ddlv_flg_NC(info);
		else if (nc == columnRslt_ar_dpt_typ) doRslt_ar_dpt_typ_NC(info);
		else if (nc == columnRslt_lnk_ar_dpt_cd) doRslt_lnk_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NC(info);
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
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_upri_dec_place) doRslt_upri_dec_place_NC(info);
		else if (nc == columnRslt_amt_rnd_typ) doRslt_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_upri_rnd_typ) doRslt_upri_rnd_typ_NC(info);
		else if (nc == columnRslt_tax_rnd_typ) doRslt_tax_rnd_typ_NC(info);
		else if (nc == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NC(info);
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
	 * [Cnd]パネルの[not_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_ship_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_ship_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upri_not_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_not_tgt_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lnk_ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lnk_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_not_inst_flg) doCnd_not_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_not_ship_flg) doCnd_not_ship_flg_NE(info);
		else if (ne == Cnd_part_ship_flg) doCnd_part_ship_flg_NE(info);
		else if (ne == Cnd_ship_flg) doCnd_ship_flg_NE(info);
		else if (ne == Cnd_etd_dt_fr) doCnd_etd_dt_fr_NE(info);
		else if (ne == Cnd_etd_dt_to) doCnd_etd_dt_to_NE(info);
		else if (ne == Cnd_eta_dt_fr) doCnd_eta_dt_fr_NE(info);
		else if (ne == Cnd_eta_dt_to) doCnd_eta_dt_to_NE(info);
		else if (ne == Cnd_via_schd_dt_fr) doCnd_via_schd_dt_fr_NE(info);
		else if (ne == Cnd_via_schd_dt_to) doCnd_via_schd_dt_to_NE(info);
		else if (ne == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NE(info);
		else if (ne == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NE(info);
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NE(info);
		else if (ne == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NE(info);
		else if (ne == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NE(info);
		else if (ne == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NE(info);
		else if (ne == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NE(info);
		else if (ne == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NE(info);
		else if (ne == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_ship_schd_no) doCnd_ship_schd_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NE(info);
		else if (ne == Cnd_ship_act_no) doCnd_ship_act_no_NE(info);
		else if (ne == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_re_ship_schd_flg) doRslt_re_ship_schd_flg_NE(info);
		else if (ne == columnRslt_slo_iv_no) doRslt_slo_iv_no_NE(info);
		else if (ne == columnRslt_ship_inst_no) doRslt_ship_inst_no_NE(info);
		else if (ne == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NE(info);
		else if (ne == columnRslt_ship_act_no) doRslt_ship_act_no_NE(info);
		else if (ne == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_qty) doRslt_base_unit_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_upri_not_tgt_flg) doRslt_upri_not_tgt_flg_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NE(info);
		else if (ne == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NE(info);
		else if (ne == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_tax_rate) doRslt_tax_rate_NE(info);
		else if (ne == columnRslt_inc_tax_flg) doRslt_inc_tax_flg_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NE(info);
		else if (ne == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NE(info);
		else if (ne == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NE(info);
		else if (ne == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NE(info);
		else if (ne == columnRslt_sls_upri_cng_flg) doRslt_sls_upri_cng_flg_NE(info);
		else if (ne == columnRslt_ship_schd_dt) doRslt_ship_schd_dt_NE(info);
		else if (ne == columnRslt_ship_schd_hm) doRslt_ship_schd_hm_NE(info);
		else if (ne == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NE(info);
		else if (ne == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NE(info);
		else if (ne == columnRslt_ship_inst_dt) doRslt_ship_inst_dt_NE(info);
		else if (ne == columnRslt_ship_inst_hm) doRslt_ship_inst_hm_NE(info);
		else if (ne == columnRslt_ship_dt) doRslt_ship_dt_NE(info);
		else if (ne == columnRslt_ship_hm) doRslt_ship_hm_NE(info);
		else if (ne == columnRslt_dlv_dt) doRslt_dlv_dt_NE(info);
		else if (ne == columnRslt_dlv_hm) doRslt_dlv_hm_NE(info);
		else if (ne == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NE(info);
		else if (ne == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NE(info);
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
		else if (ne == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NE(info);
		else if (ne == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NE(info);
		else if (ne == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NE(info);
		else if (ne == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NE(info);
		else if (ne == columnRslt_tterm_cd1) doRslt_tterm_cd1_NE(info);
		else if (ne == columnRslt_tterm_nm1) doRslt_tterm_nm1_NE(info);
		else if (ne == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_tterm_cd2) doRslt_tterm_cd2_NE(info);
		else if (ne == columnRslt_tterm_nm2) doRslt_tterm_nm2_NE(info);
		else if (ne == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_tterm_cd3) doRslt_tterm_cd3_NE(info);
		else if (ne == columnRslt_tterm_nm3) doRslt_tterm_nm3_NE(info);
		else if (ne == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NE(info);
		else if (ne == columnRslt_purc_ddlv_flg) doRslt_purc_ddlv_flg_NE(info);
		else if (ne == columnRslt_ar_dpt_typ) doRslt_ar_dpt_typ_NE(info);
		else if (ne == columnRslt_lnk_ar_dpt_cd) doRslt_lnk_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NE(info);
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
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_upri_dec_place) doRslt_upri_dec_place_NE(info);
		else if (ne == columnRslt_amt_rnd_typ) doRslt_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_upri_rnd_typ) doRslt_upri_rnd_typ_NE(info);
		else if (ne == columnRslt_tax_rnd_typ) doRslt_tax_rnd_typ_NE(info);
		else if (ne == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NE(info);
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
	 * [Cnd]パネルの[not_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_ship_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_ship_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upri_not_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_not_tgt_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lnk_ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lnk_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_not_inst_flg) doCnd_not_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_not_ship_flg) doCnd_not_ship_flg_NX(info);
		else if (nx == Cnd_part_ship_flg) doCnd_part_ship_flg_NX(info);
		else if (nx == Cnd_ship_flg) doCnd_ship_flg_NX(info);
		else if (nx == Cnd_etd_dt_fr) doCnd_etd_dt_fr_NX(info);
		else if (nx == Cnd_etd_dt_to) doCnd_etd_dt_to_NX(info);
		else if (nx == Cnd_eta_dt_fr) doCnd_eta_dt_fr_NX(info);
		else if (nx == Cnd_eta_dt_to) doCnd_eta_dt_to_NX(info);
		else if (nx == Cnd_via_schd_dt_fr) doCnd_via_schd_dt_fr_NX(info);
		else if (nx == Cnd_via_schd_dt_to) doCnd_via_schd_dt_to_NX(info);
		else if (nx == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_NX(info);
		else if (nx == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_NX(info);
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_NX(info);
		else if (nx == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_NX(info);
		else if (nx == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_NX(info);
		else if (nx == Cnd_dlv_id_typ) doCnd_dlv_id_typ_NX(info);
		else if (nx == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_NX(info);
		else if (nx == Cnd_dlv_id_cd) doCnd_dlv_id_cd_NX(info);
		else if (nx == Cnd_dlv_id_nm) doCnd_dlv_id_nm_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_ship_schd_no) doCnd_ship_schd_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_ship_rqst_no) doCnd_ship_rqst_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_NX(info);
		else if (nx == Cnd_ship_act_no) doCnd_ship_act_no_NX(info);
		else if (nx == Cnd_ship_act_d_no) doCnd_ship_act_d_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_re_ship_schd_flg) doRslt_re_ship_schd_flg_NX(info);
		else if (nx == columnRslt_slo_iv_no) doRslt_slo_iv_no_NX(info);
		else if (nx == columnRslt_ship_inst_no) doRslt_ship_inst_no_NX(info);
		else if (nx == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_NX(info);
		else if (nx == columnRslt_ship_act_no) doRslt_ship_act_no_NX(info);
		else if (nx == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_qty) doRslt_base_unit_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_upri_not_tgt_flg) doRslt_upri_not_tgt_flg_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_NX(info);
		else if (nx == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_NX(info);
		else if (nx == columnRslt_tax_fix_flg) doRslt_tax_fix_flg_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_tax_rate) doRslt_tax_rate_NX(info);
		else if (nx == columnRslt_inc_tax_flg) doRslt_inc_tax_flg_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_NX(info);
		else if (nx == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_NX(info);
		else if (nx == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_NX(info);
		else if (nx == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_NX(info);
		else if (nx == columnRslt_sls_upri_cng_flg) doRslt_sls_upri_cng_flg_NX(info);
		else if (nx == columnRslt_ship_schd_dt) doRslt_ship_schd_dt_NX(info);
		else if (nx == columnRslt_ship_schd_hm) doRslt_ship_schd_hm_NX(info);
		else if (nx == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_NX(info);
		else if (nx == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_NX(info);
		else if (nx == columnRslt_ship_inst_dt) doRslt_ship_inst_dt_NX(info);
		else if (nx == columnRslt_ship_inst_hm) doRslt_ship_inst_hm_NX(info);
		else if (nx == columnRslt_ship_dt) doRslt_ship_dt_NX(info);
		else if (nx == columnRslt_ship_hm) doRslt_ship_hm_NX(info);
		else if (nx == columnRslt_dlv_dt) doRslt_dlv_dt_NX(info);
		else if (nx == columnRslt_dlv_hm) doRslt_dlv_hm_NX(info);
		else if (nx == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_NX(info);
		else if (nx == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnRslt_sls_cststk_flg) doRslt_sls_cststk_flg_NX(info);
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
		else if (nx == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NX(info);
		else if (nx == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NX(info);
		else if (nx == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_NX(info);
		else if (nx == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_NX(info);
		else if (nx == columnRslt_tterm_cd1) doRslt_tterm_cd1_NX(info);
		else if (nx == columnRslt_tterm_nm1) doRslt_tterm_nm1_NX(info);
		else if (nx == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_tterm_cd2) doRslt_tterm_cd2_NX(info);
		else if (nx == columnRslt_tterm_nm2) doRslt_tterm_nm2_NX(info);
		else if (nx == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_tterm_cd3) doRslt_tterm_cd3_NX(info);
		else if (nx == columnRslt_tterm_nm3) doRslt_tterm_nm3_NX(info);
		else if (nx == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_NX(info);
		else if (nx == columnRslt_purc_ddlv_flg) doRslt_purc_ddlv_flg_NX(info);
		else if (nx == columnRslt_ar_dpt_typ) doRslt_ar_dpt_typ_NX(info);
		else if (nx == columnRslt_lnk_ar_dpt_cd) doRslt_lnk_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_NX(info);
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
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_upri_dec_place) doRslt_upri_dec_place_NX(info);
		else if (nx == columnRslt_amt_rnd_typ) doRslt_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_upri_rnd_typ) doRslt_upri_rnd_typ_NX(info);
		else if (nx == columnRslt_tax_rnd_typ) doRslt_tax_rnd_typ_NX(info);
		else if (nx == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NX(info);
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
	 * [Cnd]パネルの[not_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[re_ship_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_re_ship_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upri_not_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_not_tgt_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_cststk_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_ddlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_ddlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lnk_ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lnk_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_etd_dt_fr) doCnd_etd_dt_fr_LC(info);
		else if (lc == Cnd_etd_dt_to) doCnd_etd_dt_to_LC(info);
		else if (lc == Cnd_eta_dt_fr) doCnd_eta_dt_fr_LC(info);
		else if (lc == Cnd_eta_dt_to) doCnd_eta_dt_to_LC(info);
		else if (lc == Cnd_via_schd_dt_fr) doCnd_via_schd_dt_fr_LC(info);
		else if (lc == Cnd_via_schd_dt_to) doCnd_via_schd_dt_to_LC(info);
		else if (lc == Cnd_ship_fr_lg_grp_cd) doCnd_ship_fr_lg_grp_cd_LC(info);
		else if (lc == Cnd_ship_fr_lg_grp_nm) doCnd_ship_fr_lg_grp_nm_LC(info);
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ) doCnd_ship_rqst_id_typ_LC(info);
		else if (lc == Cnd_ship_rqst_id_typ_nm) doCnd_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Cnd_ship_rqst_id_cd) doCnd_ship_rqst_id_cd_LC(info);
		else if (lc == Cnd_ship_rqst_id_nm) doCnd_ship_rqst_id_nm_LC(info);
		else if (lc == Cnd_dlv_id_typ) doCnd_dlv_id_typ_LC(info);
		else if (lc == Cnd_dlv_id_typ_nm) doCnd_dlv_id_typ_nm_LC(info);
		else if (lc == Cnd_dlv_id_cd) doCnd_dlv_id_cd_LC(info);
		else if (lc == Cnd_dlv_id_nm) doCnd_dlv_id_nm_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_ship_schd_no) doCnd_ship_schd_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_ship_rqst_no) doCnd_ship_rqst_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_ship_inst_d_no) doCnd_ship_inst_d_no_LC(info);
		else if (lc == Cnd_ship_act_no) doCnd_ship_act_no_LC(info);
		else if (lc == Cnd_ship_act_d_no) doCnd_ship_act_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == columnRslt_sim_cnd_grp_no) doRslt_sim_cnd_grp_no_LC(info);
		else if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_ship_rqst_no) doRslt_ship_rqst_no_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_slo_iv_no) doRslt_slo_iv_no_LC(info);
		else if (lc == columnRslt_ship_inst_no) doRslt_ship_inst_no_LC(info);
		else if (lc == columnRslt_ship_inst_d_no) doRslt_ship_inst_d_no_LC(info);
		else if (lc == columnRslt_ship_act_no) doRslt_ship_act_no_LC(info);
		else if (lc == columnRslt_ship_act_d_no) doRslt_ship_act_d_no_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_qty) doRslt_base_unit_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_dscnt_rsn_cd) doRslt_dscnt_rsn_cd_LC(info);
		else if (lc == columnRslt_dscnt_rsn_nm) doRslt_dscnt_rsn_nm_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_tax_rate) doRslt_tax_rate_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ) doRslt_ship_rqst_id_typ_LC(info);
		else if (lc == columnRslt_ship_rqst_id_typ_nm) doRslt_ship_rqst_id_typ_nm_LC(info);
		else if (lc == columnRslt_ship_rqst_id_cd) doRslt_ship_rqst_id_cd_LC(info);
		else if (lc == columnRslt_ship_rqst_id_nm) doRslt_ship_rqst_id_nm_LC(info);
		else if (lc == columnRslt_ship_schd_dt) doRslt_ship_schd_dt_LC(info);
		else if (lc == columnRslt_ship_schd_hm) doRslt_ship_schd_hm_LC(info);
		else if (lc == columnRslt_dlv_rqst_dt) doRslt_dlv_rqst_dt_LC(info);
		else if (lc == columnRslt_dlv_rqst_hm) doRslt_dlv_rqst_hm_LC(info);
		else if (lc == columnRslt_ship_inst_dt) doRslt_ship_inst_dt_LC(info);
		else if (lc == columnRslt_ship_inst_hm) doRslt_ship_inst_hm_LC(info);
		else if (lc == columnRslt_ship_dt) doRslt_ship_dt_LC(info);
		else if (lc == columnRslt_ship_hm) doRslt_ship_hm_LC(info);
		else if (lc == columnRslt_dlv_dt) doRslt_dlv_dt_LC(info);
		else if (lc == columnRslt_dlv_hm) doRslt_dlv_hm_LC(info);
		else if (lc == columnRslt_via_dlv_typ) doRslt_via_dlv_typ_LC(info);
		else if (lc == columnRslt_via_dlv_typ_nm) doRslt_via_dlv_typ_nm_LC(info);
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
		else if (lc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_LC(info);
		else if (lc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_LC(info);
		else if (lc == columnRslt_prov_basis_typ) doRslt_prov_basis_typ_LC(info);
		else if (lc == columnRslt_prov_basis_typ_nm) doRslt_prov_basis_typ_nm_LC(info);
		else if (lc == columnRslt_tterm_cd1) doRslt_tterm_cd1_LC(info);
		else if (lc == columnRslt_tterm_nm1) doRslt_tterm_nm1_LC(info);
		else if (lc == columnRslt_tterm_rmrks1) doRslt_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_tterm_cd2) doRslt_tterm_cd2_LC(info);
		else if (lc == columnRslt_tterm_nm2) doRslt_tterm_nm2_LC(info);
		else if (lc == columnRslt_tterm_rmrks2) doRslt_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_tterm_cd3) doRslt_tterm_cd3_LC(info);
		else if (lc == columnRslt_tterm_nm3) doRslt_tterm_nm3_LC(info);
		else if (lc == columnRslt_tterm_rmrks3) doRslt_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_cd) doRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnRslt_ship_fr_lg_grp_nm) doRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnRslt_bill_cl_typ) doRslt_bill_cl_typ_LC(info);
		else if (lc == columnRslt_ar_dpt_typ) doRslt_ar_dpt_typ_LC(info);
		else if (lc == columnRslt_lnk_ar_dpt_cd) doRslt_lnk_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_prnt_lcl_cd) doRslt_prnt_lcl_cd_LC(info);
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
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_upri_dec_place) doRslt_upri_dec_place_LC(info);
		else if (lc == columnRslt_amt_rnd_typ) doRslt_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_upri_rnd_typ) doRslt_upri_rnd_typ_LC(info);
		else if (lc == columnRslt_tax_rnd_typ) doRslt_tax_rnd_typ_LC(info);
	}

	/**
	 * [Cnd]パネルの[etd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[etd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_etd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[eta_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_eta_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[via_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_via_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_id_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_rqst_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_act_d_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_inst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_inst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_dlv_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prov_basis_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lnk_ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lnk_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_lcl_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upri_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upri_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_fr_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_fr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_typ]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipRqstIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_rqst_id_cd]の作成メソッド
	 */
	public MCList getCnd_ship_rqst_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipRqstId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_typ]の作成メソッド
	 */
	public MCList getCnd_dlv_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDlvIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_id_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getDlvId(row, info);
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
		if (id.equals("MS.MSBEL1710.Srch01")) {
			return new MS_MSBEL1710_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1710_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1710_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1710_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1710_Srch01Bridge() {
			p_MS_MSBEL1710_Srch01 = new MCParam(PDef.MS_MSBEL1710_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1710_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1710.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1710.RsltR.class));

			p_MS_MSBEL1710_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1710_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1710_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1710_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1710_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1710.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1710.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1710.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1710.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1710_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1710.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1710_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1710.RsltR>)p_MS_MSBEL1710_Srch01.getContainerParam().getDownBlock(0));
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