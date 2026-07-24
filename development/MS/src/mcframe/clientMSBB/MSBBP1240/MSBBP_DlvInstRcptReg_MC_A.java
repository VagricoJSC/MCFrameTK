package mcframe.clientMSBB.MSBBP1240;

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
import mcframe.clientMSBB.MSBBP1240.MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Srch01Caller;
import mcframe.clientMSBB.MSBBP1240.MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Upd01Caller;

/**
 * 画面"MSBBP_DlvInstRcptReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_DlvInstRcptReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBBP1240";

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
	// [SlsStsTyp]ブロック関連のField定義
	public MCPanel SlsStsTypPanel = null;
	public MCTitledBorder SlsStsTypTitledBorder = null;
	// [SlsStsTyp]ブロックの項目のField定義
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
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
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
	 * UPD,Create/Modify,0;REF,View,1 UPD,登録・訂正する,0;REF,参照する,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Order received 注文受領済.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_flg = null;
	/**
	 * Completed order promising 納期回答済.<p>
	 *
	 */
	public MCCheckBox Cnd_prms_flg = null;
	/**
	 * Delivery order received 納入指示受領済.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_inst_rcpt_flg = null;
	/**
	 * Delivery order replied 納入指示回答済.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_inst_prms_flg = null;
	/**
	 * Sold 売上済.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_flg = null;
	/**
	 * Shipped 出荷済.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_compl_flg = null;
	/**
	 * Target 対象.<p>
	 *
	 */
	public MCCheckBox Cnd_edi_flg = null;
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_edi_flg = null;
	public MCLabel Cnd_slo_dt_fr_Label = null;
	/**
	 * Sales order date FROM 受注日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_fr = null;
	public MCLabel Cnd_slo_dt_to_Label = null;
	/**
	 * Sales order date TO 受注日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_slo_dt_to = null;
	public MCLabel Cnd_dlv_inst_rcpt_dt_fr_Label = null;
	/**
	 * Delivery order received date FROM 納入指示受領日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_inst_rcpt_dt_fr = null;
	public MCLabel Cnd_dlv_inst_rcpt_dt_to_Label = null;
	/**
	 * Delivery order received date TO 納入指示受領日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dlv_inst_rcpt_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_rqst_dt_p_PPanel;
	public MCDateField Cnd_ship_rqst_dt_fr;	// [Cnd]の[ship_rqst_dt_p.ymd_fr]を[Cnd_ship_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_hm_fr;	// [Cnd]の[ship_rqst_dt_p.hm_fr]を[Cnd_ship_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_dt_to;	// [Cnd]の[ship_rqst_dt_p.ymd_to]を[Cnd_ship_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_rqst_hm_to;	// [Cnd]の[ship_rqst_dt_p.hm_to]を[Cnd_ship_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_schd_dt_p_PPanel;
	public MCDateField Cnd_ship_schd_dt_fr;	// [Cnd]の[ship_schd_dt_p.ymd_fr]を[Cnd_ship_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_fr;	// [Cnd]の[ship_schd_dt_p.hm_fr]を[Cnd_ship_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_dt_to;	// [Cnd]の[ship_schd_dt_p.ymd_to]を[Cnd_ship_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_schd_hm_to;	// [Cnd]の[ship_schd_dt_p.hm_to]を[Cnd_ship_schd_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_schd_dt_p_PPanel;
	public MCDateField Cnd_dlv_schd_dt_fr;	// [Cnd]の[dlv_schd_dt_p.ymd_fr]を[Cnd_dlv_schd_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_fr;	// [Cnd]の[dlv_schd_dt_p.hm_fr]を[Cnd_dlv_schd_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_dt_to;	// [Cnd]の[dlv_schd_dt_p.ymd_to]を[Cnd_dlv_schd_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_schd_hm_to;	// [Cnd]の[dlv_schd_dt_p.hm_to]を[Cnd_dlv_schd_hm_to]としてエイリアス定義。
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
	 * Distribution channel name 1 仕向先１名.<p>
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
	 * Distribution channel name 2 仕向先２名.<p>
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
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_wg_rqst_cnt_rmrks_Label = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_cnt_rmrks = null;
	public MCLabel Cnd_ship_cnt_rmrks_Label = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_ship_cnt_rmrks = null;
	public MCLabel Cnd_cst_po_d_rmrks_Label = null;
	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public MCTextField Cnd_cst_po_d_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
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
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Cnd4]ブロック関連のField定義
	public MCPanel Cnd4Panel = null;
	// [Cnd4]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	// [Rslt]ブロックの項目のField定義
	// [Slo]ブロック関連のField定義
	public MCPanel SloPanel = null;
	// [Slo]ブロックの項目のField定義
	// [SloRslt]ブロック関連のField定義
	public MCPanel SloRsltPanel = null;
	public MCScrollPane SloRsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1240.SloRsltR> SloRsltTable = null;
	// [SloRslt]ブロックの項目のField定義
	/**
	 * Sales status type 販売状況区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_sts_typ = null;
	/**
	 * Sales status type name 販売状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_sts_typ_nm = null;
	/**
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_sts_typ = null;
	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_cd = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_ptn_typ = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_no = null;
	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_rev = null;
	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_typ = null;
	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_typ_nm = null;
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_aprv_flg = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_aprv_sts_typ_nm = null;
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_qtn_no = null;
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_qtn_rev = null;
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_dt = null;
	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dlv_inst_rcpt_dt = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_nm = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_wg_nm = null;
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_assort_typ = null;
	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_assort_typ_nm = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_po_no = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_wrk_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_intr_rmrks = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_d_no = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D SloRslt_itm_p_PPanel;
	public MCColumnConfig columnSloRslt_itm_cd;// [SloRslt]の[itm_p.itm_cd]を[columnSloRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_itm_sub1;// [SloRslt]の[itm_p.itm_sub1]を[columnSloRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_itm_sub2;// [SloRslt]の[itm_p.itm_sub2]を[columnSloRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_itm_sub3;// [SloRslt]の[itm_p.itm_sub3]を[columnSloRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_itm_nm;// [SloRslt]の[itm_p.itm_nm]を[columnSloRslt_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sundry_itm_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_stk_mng_typ_nm = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_asset_mng_typ_nm = null;
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_vmi_flg = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_trd_unit_qty;// [SloRslt]の[trd_unit_qty_p.qty]を[columnSloRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_set_itm_grp_no = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D SloRslt_dlv_p_PPanel;
	public MCColumnConfig columnSloRslt_dlv_cd;// [SloRslt]の[dlv_p.bp_cd]を[columnSloRslt_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_nm;// [SloRslt]の[dlv_p.bp_nm]を[columnSloRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_sundry_flg;// [SloRslt]の[dlv_p.dlv_sundry_flg]を[columnSloRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_pri_prnt_flg;// [SloRslt]の[dlv_p.pri_prnt_flg]を[columnSloRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_cntry_cd;// [SloRslt]の[dlv_p.cntry_cd]を[columnSloRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_cntry_nm;// [SloRslt]の[dlv_p.cntry_nm]を[columnSloRslt_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_zip_cd;// [SloRslt]の[dlv_p.zip_cd]を[columnSloRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_addr1;// [SloRslt]の[dlv_p.addr1]を[columnSloRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_addr2;// [SloRslt]の[dlv_p.addr2]を[columnSloRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_addr3;// [SloRslt]の[dlv_p.addr3]を[columnSloRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_addr4;// [SloRslt]の[dlv_p.addr4]を[columnSloRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_cntct_dpt;// [SloRslt]の[dlv_p.dlv_cntct_dpt]を[columnSloRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_cntct_psn;// [SloRslt]の[dlv_p.dlv_cntct_psn]を[columnSloRslt_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_tel;// [SloRslt]の[dlv_p.tel]を[columnSloRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_fax;// [SloRslt]の[dlv_p.fax]を[columnSloRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_lg_grp_cd;// [SloRslt]の[dlv_p.lg_grp_cd]を[columnSloRslt_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_dlv_lg_grp_nm;// [SloRslt]の[dlv_p.lg_grp_nm]を[columnSloRslt_dlv_lg_grp_nm]としてエイリアス定義。
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dest_nm3 = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D SloRslt_tdlv_p_PPanel;
	public MCColumnConfig columnSloRslt_tdlv_cd;// [SloRslt]の[tdlv_p.bp_cd]を[columnSloRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_nm;// [SloRslt]の[tdlv_p.bp_nm]を[columnSloRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_sundry_flg;// [SloRslt]の[tdlv_p.dlv_sundry_flg]を[columnSloRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_cntry_cd;// [SloRslt]の[tdlv_p.cntry_cd]を[columnSloRslt_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_cntry_nm;// [SloRslt]の[tdlv_p.cntry_nm]を[columnSloRslt_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_zip_cd;// [SloRslt]の[tdlv_p.zip_cd]を[columnSloRslt_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_addr1;// [SloRslt]の[tdlv_p.addr1]を[columnSloRslt_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_addr2;// [SloRslt]の[tdlv_p.addr2]を[columnSloRslt_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_addr3;// [SloRslt]の[tdlv_p.addr3]を[columnSloRslt_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_addr4;// [SloRslt]の[tdlv_p.addr4]を[columnSloRslt_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_tel;// [SloRslt]の[tdlv_p.tel]を[columnSloRslt_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_fax;// [SloRslt]の[tdlv_p.fax]を[columnSloRslt_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_cntct_dpt;// [SloRslt]の[tdlv_p.dlv_cntct_dpt]を[columnSloRslt_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_cntct_psn;// [SloRslt]の[tdlv_p.dlv_cntct_psn]を[columnSloRslt_tdlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_lg_grp_cd;// [SloRslt]の[tdlv_p.lg_grp_cd]を[columnSloRslt_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_tdlv_lg_grp_nm;// [SloRslt]の[tdlv_p.lg_grp_nm]を[columnSloRslt_tdlv_lg_grp_nm]としてエイリアス定義。
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_via_dlv_typ_nm = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_dlv_day_week_typ_nm = null;
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_cststk_flg = null;
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_proc_typ = null;
	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_proc_typ_nm = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_inst_typ = null;
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_inst_typ_nm = null;
	/**
	 * Split type 分割区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_schd_split_typ = null;
	/**
	 * Split type name 分割区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_schd_split_typ_nm = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_scope_typ = null;
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_scope_typ_nm = null;
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_typ = null;
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_typ_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_rqst_to_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_rqst_to_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_maker_nm = null;
	/**
	 * Request contact remarks 依頼連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_wg_rqst_cnt_rmrks = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D SloRslt_str_ln_p_PPanel;
	public MCColumnConfig columnSloRslt_str_ln_cd;// [SloRslt]の[str_ln_p.str_ln_cd]を[columnSloRslt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_str_ln_nm;// [SloRslt]の[str_ln_p.str_ln_nm]を[columnSloRslt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnSloRslt_str_ln_cd_none_flg;// [SloRslt]の[str_ln_p.str_ln_cd_none_flg]を[columnSloRslt_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_lg_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_alloc_grp_nm = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_term_nm = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_cnt_rmrks = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_po_d_no = null;
	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_cst_po_d_rmrks = null;
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_rsn_cd = null;
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_rsn_nm = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_intr_d_rmrks = null;
	/**
	 * Shipping completed 出荷完了.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_cmpl_flg = null;
	/**
	 * Sales completed 売上完了.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sls_cmpl_flg = null;
	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_schd_split_flg = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_base_unit_qty;// [SloRslt]の[base_unit_qty_p.qty]を[columnSloRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_prms_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_prms_qty;// [SloRslt]の[prms_qty_p.qty]を[columnSloRslt_prms_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_dlv_inst_rcpt_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_dlv_inst_rcpt_qty;// [SloRslt]の[dlv_inst_rcpt_qty_p.qty]を[columnSloRslt_dlv_inst_rcpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_dlv_inst_prms_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_dlv_inst_prms_qty;// [SloRslt]の[dlv_inst_prms_qty_p.qty]を[columnSloRslt_dlv_inst_prms_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_alloc_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_alloc_qty;// [SloRslt]の[alloc_qty_p.qty]を[columnSloRslt_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_wait_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_wait_qty;// [SloRslt]の[wait_qty_p.qty]を[columnSloRslt_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_ship_inst_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_ship_inst_qty;// [SloRslt]の[ship_inst_qty_p.qty]を[columnSloRslt_ship_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_ship_act_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_ship_act_qty;// [SloRslt]の[ship_act_qty_p.qty]を[columnSloRslt_ship_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_iv_schd_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_iv_schd_qty;// [SloRslt]の[iv_schd_qty_p.qty]を[columnSloRslt_iv_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_iv_act_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_iv_act_qty;// [SloRslt]の[iv_act_qty_p.qty]を[columnSloRslt_iv_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_sls_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_sls_qty;// [SloRslt]の[sls_qty_p.qty]を[columnSloRslt_sls_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_ship_ret_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_ship_ret_qty;// [SloRslt]の[ship_ret_qty_p.qty]を[columnSloRslt_ship_ret_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_re_ship_schd_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_re_ship_schd_qty;// [SloRslt]の[re_ship_schd_qty_p.qty]を[columnSloRslt_re_ship_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_ship_schd_abort_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_ship_schd_abort_qty;// [SloRslt]の[ship_schd_abort_qty_p.qty]を[columnSloRslt_ship_schd_abort_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D SloRslt_sls_schd_abort_qty_p_PPanel;
	public MCColumnConfig columnSloRslt_sls_schd_abort_qty;// [SloRslt]の[sls_schd_abort_qty_p.qty]を[columnSloRslt_sls_schd_abort_qty]としてエイリアス定義。
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_upd_srv_req_no = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_ship_pr_upd_cntr = null;
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnSloRslt_slo_upd_cntr = null;
	// [ShipSchd]ブロック関連のField定義
	public MCPanel ShipSchdPanel = null;
	public MCTitledBorder ShipSchdTitledBorder = null;
	// [ShipSchd]ブロックの項目のField定義
	// [ShipSchdRslt]ブロック関連のField定義
	public MCPanel ShipSchdRsltPanel = null;
	public MCScrollPane ShipSchdRsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> ShipSchdRsltTable = null;
	// [ShipSchdRslt]ブロックの項目のField定義
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_slo_d_no = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_pr_sts_typ_nm = null;
	/**
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_alloc_sts_typ = null;
	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_alloc_sts_typ_nm = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_trd_unit_qty;// [ShipSchdRslt]の[trd_unit_qty_p.qty]を[columnShipSchdRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_fix_flg = null;
	/**
	 * Reschedule shipment 再出荷予定.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_re_ship_schd_flg = null;
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_rqst_dt = null;
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_rqst_hm = null;
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_pd_inst_dlv_dt = null;
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_pd_inst_dlv_hm = null;
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_not_dt_calc_flg = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_wk_nm = null;
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_schd_dt = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_schd_hm = null;
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_dlv_schd_dt = null;
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_dlv_schd_hm = null;
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_block_flg = null;
	/**
	 * Shipping available 出荷可能.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_abl_flg = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_fr_lg_grp_nm = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_base_unit_qty;// [ShipSchdRslt]の[base_unit_qty_p.qty]を[columnShipSchdRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_alloc_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_alloc_qty;// [ShipSchdRslt]の[alloc_qty_p.qty]を[columnShipSchdRslt_alloc_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_wait_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_wait_qty;// [ShipSchdRslt]の[wait_qty_p.qty]を[columnShipSchdRslt_wait_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_ship_inst_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_ship_inst_qty;// [ShipSchdRslt]の[ship_inst_qty_p.qty]を[columnShipSchdRslt_ship_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_ship_act_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_ship_act_qty;// [ShipSchdRslt]の[ship_act_qty_p.qty]を[columnShipSchdRslt_ship_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_iv_schd_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_iv_schd_qty;// [ShipSchdRslt]の[iv_schd_qty_p.qty]を[columnShipSchdRslt_iv_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_iv_act_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_iv_act_qty;// [ShipSchdRslt]の[iv_act_qty_p.qty]を[columnShipSchdRslt_iv_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_sls_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_sls_qty;// [ShipSchdRslt]の[sls_qty_p.qty]を[columnShipSchdRslt_sls_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_ship_ret_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_ship_ret_qty;// [ShipSchdRslt]の[ship_ret_qty_p.qty]を[columnShipSchdRslt_ship_ret_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ShipSchdRslt_abort_qty_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_abort_qty;// [ShipSchdRslt]の[abort_qty_p.qty]を[columnShipSchdRslt_abort_qty]としてエイリアス定義。
	/**
	 * Cancel remaining shipping 出荷打切.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_abort_flg = null;
	/**
	 * Shipping completed 出荷完了.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_cmpl_flg = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_term_nm = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ship_schd_no = null;
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_dlv_inst_rcpt_no = null;
	/**
	 * Sales order promising No. 受注納期回答ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_slo_prms_no = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_sls_act_d_no = null;
	public mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D ShipSchdRslt_dlv_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_dlv_cd;// [ShipSchdRslt]の[dlv_p.bp_cd]を[columnShipSchdRslt_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_nm;// [ShipSchdRslt]の[dlv_p.bp_nm]を[columnShipSchdRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_sundry_flg;// [ShipSchdRslt]の[dlv_p.dlv_sundry_flg]を[columnShipSchdRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_pri_prnt_flg;// [ShipSchdRslt]の[dlv_p.pri_prnt_flg]を[columnShipSchdRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_show_dtl;// [ShipSchdRslt]の[dlv_p.show_dtl]を[columnShipSchdRslt_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_lg_grp_cd;// [ShipSchdRslt]の[dlv_p.lg_grp_cd]を[columnShipSchdRslt_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_lg_grp_nm;// [ShipSchdRslt]の[dlv_p.lg_grp_nm]を[columnShipSchdRslt_dlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_cntry_cd;// [ShipSchdRslt]の[dlv_p.cntry_cd]を[columnShipSchdRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_cntry_nm;// [ShipSchdRslt]の[dlv_p.cntry_nm]を[columnShipSchdRslt_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_zip_cd;// [ShipSchdRslt]の[dlv_p.zip_cd]を[columnShipSchdRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_addr1;// [ShipSchdRslt]の[dlv_p.addr1]を[columnShipSchdRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_addr2;// [ShipSchdRslt]の[dlv_p.addr2]を[columnShipSchdRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_addr3;// [ShipSchdRslt]の[dlv_p.addr3]を[columnShipSchdRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_addr4;// [ShipSchdRslt]の[dlv_p.addr4]を[columnShipSchdRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_tel;// [ShipSchdRslt]の[dlv_p.tel]を[columnShipSchdRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_fax;// [ShipSchdRslt]の[dlv_p.fax]を[columnShipSchdRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_cntct_dpt;// [ShipSchdRslt]の[dlv_p.dlv_cntct_dpt]を[columnShipSchdRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_dlv_cntct_psn;// [ShipSchdRslt]の[dlv_p.dlv_cntct_psn]を[columnShipSchdRslt_dlv_cntct_psn]としてエイリアス定義。
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_tdlv_req_flg = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D ShipSchdRslt_tdlv_p_PPanel;
	public MCColumnConfig columnShipSchdRslt_tdlv_cd;// [ShipSchdRslt]の[tdlv_p.bp_cd]を[columnShipSchdRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_nm;// [ShipSchdRslt]の[tdlv_p.bp_nm]を[columnShipSchdRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_sundry_flg;// [ShipSchdRslt]の[tdlv_p.dlv_sundry_flg]を[columnShipSchdRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_show_dtl;// [ShipSchdRslt]の[tdlv_p.show_dtl]を[columnShipSchdRslt_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_lg_grp_cd;// [ShipSchdRslt]の[tdlv_p.lg_grp_cd]を[columnShipSchdRslt_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_lg_grp_nm;// [ShipSchdRslt]の[tdlv_p.lg_grp_nm]を[columnShipSchdRslt_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_cntry_cd;// [ShipSchdRslt]の[tdlv_p.cntry_cd]を[columnShipSchdRslt_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_cntry_nm;// [ShipSchdRslt]の[tdlv_p.cntry_nm]を[columnShipSchdRslt_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_zip_cd;// [ShipSchdRslt]の[tdlv_p.zip_cd]を[columnShipSchdRslt_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_addr1;// [ShipSchdRslt]の[tdlv_p.addr1]を[columnShipSchdRslt_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_addr2;// [ShipSchdRslt]の[tdlv_p.addr2]を[columnShipSchdRslt_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_addr3;// [ShipSchdRslt]の[tdlv_p.addr3]を[columnShipSchdRslt_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_addr4;// [ShipSchdRslt]の[tdlv_p.addr4]を[columnShipSchdRslt_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_tel;// [ShipSchdRslt]の[tdlv_p.tel]を[columnShipSchdRslt_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_fax;// [ShipSchdRslt]の[tdlv_p.fax]を[columnShipSchdRslt_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_cntct_dpt;// [ShipSchdRslt]の[tdlv_p.dlv_cntct_dpt]を[columnShipSchdRslt_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnShipSchdRslt_tdlv_cntct_psn;// [ShipSchdRslt]の[tdlv_p.dlv_cntct_psn]を[columnShipSchdRslt_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_via_dlv_typ_nm = null;
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_dlv_day_week_typ_nm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnShipSchdRslt_upd_srv_req_no = null;
	// [DlvInstRcpt]ブロック関連のField定義
	public MCPanel DlvInstRcptPanel = null;
	public MCTitledBorder DlvInstRcptTitledBorder = null;
	// [DlvInstRcpt]ブロックの項目のField定義
	// [DlvInstRcptRslt]ブロック関連のField定義
	public MCPanel DlvInstRcptRsltPanel = null;
	public MCScrollPane DlvInstRcptRsltScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> DlvInstRcptRsltTable = null;
	// [DlvInstRcptRslt]ブロックの項目のField定義
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_slo_d_no = null;
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_cst_dlv_inst_no = null;
	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_cst_dlv_inst_rev = null;
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_cst_dlv_inst_d_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DlvInstRcptRslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_qty;// [DlvInstRcptRslt]の[trd_unit_qty_p.qty]を[columnDlvInstRcptRslt_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D DlvInstRcptRslt_dlv_rqst_dt_p_PPanel;
	public MCColumnConfig columnDlvInstRcptRslt_dlv_rqst_dt;// [DlvInstRcptRslt]の[dlv_rqst_dt_p.ymd]を[columnDlvInstRcptRslt_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_rqst_hm;// [DlvInstRcptRslt]の[dlv_rqst_dt_p.hm]を[columnDlvInstRcptRslt_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_cst_dlv_inst_rmrks = null;
	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_intr_rmrks = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_trd_unit_conv_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DlvInstRcptRslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDlvInstRcptRslt_base_unit_qty;// [DlvInstRcptRslt]の[base_unit_qty_p.qty]を[columnDlvInstRcptRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_edi_flg = null;
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_dlv_inst_rcpt_no = null;
	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_dlv_inst_rcpt_rev = null;
	public mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D DlvInstRcptRslt_dlv_p_PPanel;
	public MCColumnConfig columnDlvInstRcptRslt_dlv_cd;// [DlvInstRcptRslt]の[dlv_p.bp_cd]を[columnDlvInstRcptRslt_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_nm;// [DlvInstRcptRslt]の[dlv_p.bp_nm]を[columnDlvInstRcptRslt_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_sundry_flg;// [DlvInstRcptRslt]の[dlv_p.dlv_sundry_flg]を[columnDlvInstRcptRslt_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_pri_prnt_flg;// [DlvInstRcptRslt]の[dlv_p.pri_prnt_flg]を[columnDlvInstRcptRslt_pri_prnt_flg]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_show_dtl;// [DlvInstRcptRslt]の[dlv_p.show_dtl]を[columnDlvInstRcptRslt_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_lg_grp_cd;// [DlvInstRcptRslt]の[dlv_p.lg_grp_cd]を[columnDlvInstRcptRslt_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_lg_grp_nm;// [DlvInstRcptRslt]の[dlv_p.lg_grp_nm]を[columnDlvInstRcptRslt_dlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_cntry_cd;// [DlvInstRcptRslt]の[dlv_p.cntry_cd]を[columnDlvInstRcptRslt_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_cntry_nm;// [DlvInstRcptRslt]の[dlv_p.cntry_nm]を[columnDlvInstRcptRslt_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_zip_cd;// [DlvInstRcptRslt]の[dlv_p.zip_cd]を[columnDlvInstRcptRslt_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_addr1;// [DlvInstRcptRslt]の[dlv_p.addr1]を[columnDlvInstRcptRslt_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_addr2;// [DlvInstRcptRslt]の[dlv_p.addr2]を[columnDlvInstRcptRslt_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_addr3;// [DlvInstRcptRslt]の[dlv_p.addr3]を[columnDlvInstRcptRslt_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_addr4;// [DlvInstRcptRslt]の[dlv_p.addr4]を[columnDlvInstRcptRslt_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_tel;// [DlvInstRcptRslt]の[dlv_p.tel]を[columnDlvInstRcptRslt_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_fax;// [DlvInstRcptRslt]の[dlv_p.fax]を[columnDlvInstRcptRslt_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_cntct_dpt;// [DlvInstRcptRslt]の[dlv_p.dlv_cntct_dpt]を[columnDlvInstRcptRslt_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_dlv_cntct_psn;// [DlvInstRcptRslt]の[dlv_p.dlv_cntct_psn]を[columnDlvInstRcptRslt_dlv_cntct_psn]としてエイリアス定義。
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_req_flg = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D DlvInstRcptRslt_tdlv_p_PPanel;
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_cd;// [DlvInstRcptRslt]の[tdlv_p.bp_cd]を[columnDlvInstRcptRslt_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_nm;// [DlvInstRcptRslt]の[tdlv_p.bp_nm]を[columnDlvInstRcptRslt_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_sundry_flg;// [DlvInstRcptRslt]の[tdlv_p.dlv_sundry_flg]を[columnDlvInstRcptRslt_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_show_dtl;// [DlvInstRcptRslt]の[tdlv_p.show_dtl]を[columnDlvInstRcptRslt_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_lg_grp_cd;// [DlvInstRcptRslt]の[tdlv_p.lg_grp_cd]を[columnDlvInstRcptRslt_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_lg_grp_nm;// [DlvInstRcptRslt]の[tdlv_p.lg_grp_nm]を[columnDlvInstRcptRslt_tdlv_lg_grp_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_cntry_cd;// [DlvInstRcptRslt]の[tdlv_p.cntry_cd]を[columnDlvInstRcptRslt_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_cntry_nm;// [DlvInstRcptRslt]の[tdlv_p.cntry_nm]を[columnDlvInstRcptRslt_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_zip_cd;// [DlvInstRcptRslt]の[tdlv_p.zip_cd]を[columnDlvInstRcptRslt_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_addr1;// [DlvInstRcptRslt]の[tdlv_p.addr1]を[columnDlvInstRcptRslt_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_addr2;// [DlvInstRcptRslt]の[tdlv_p.addr2]を[columnDlvInstRcptRslt_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_addr3;// [DlvInstRcptRslt]の[tdlv_p.addr3]を[columnDlvInstRcptRslt_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_addr4;// [DlvInstRcptRslt]の[tdlv_p.addr4]を[columnDlvInstRcptRslt_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_tel;// [DlvInstRcptRslt]の[tdlv_p.tel]を[columnDlvInstRcptRslt_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_fax;// [DlvInstRcptRslt]の[tdlv_p.fax]を[columnDlvInstRcptRslt_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_cntct_dpt;// [DlvInstRcptRslt]の[tdlv_p.dlv_cntct_dpt]を[columnDlvInstRcptRslt_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDlvInstRcptRslt_tdlv_cntct_psn;// [DlvInstRcptRslt]の[tdlv_p.dlv_cntct_psn]を[columnDlvInstRcptRslt_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Receiving point stopover type (Master value) 配送先経由区分（マスタ値）.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_mst_via_dlv_typ = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_via_dlv_typ_nm = null;
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_dlv_day_week_typ = null;
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_dlv_day_week_typ_nm = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_upd_srv_req_no = null;
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_ship_pr_upd_cntr = null;
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDlvInstRcptRslt_slo_upd_cntr = null;
	// [DlvInstRcptBtn]ブロック関連のField定義
	public MCPanel DlvInstRcptBtnPanel = null;
	// [DlvInstRcptBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DlvInstRcptBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DlvInstRcptBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DlvInstRcptBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Sales order promising entry 販売納期調整登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1230 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH, REF};
	
	/** [MS_MSBBL1240_Srch01]のCallerの作成 */
	protected MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Srch01Caller createMS_MSBBL1240_Srch01() {
		MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Srch01Caller<MSBBP_DlvInstRcptReg, MS_MSBBL1240_Srch01Bridge>
		caller = ((MSBBP_DlvInstRcptReg_MC)this).new MS_MSBBL1240_Srch01Caller<MSBBP_DlvInstRcptReg, MS_MSBBL1240_Srch01Bridge>(
					(MSBBP_DlvInstRcptReg)this, new MS_MSBBL1240_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1240_Srch01]の呼び出し */
	protected void callMS_MSBBL1240_Srch01() {
		MCCaller caller = createMS_MSBBL1240_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1240_Upd01]のCallerの作成 */
	protected MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Upd01Caller createMS_MSBBL1240_Upd01() {
		MSBBP_DlvInstRcptReg_MC.MS_MSBBL1240_Upd01Caller<MSBBP_DlvInstRcptReg, MS_MSBBL1240_Upd01Bridge>
		caller = ((MSBBP_DlvInstRcptReg_MC)this).new MS_MSBBL1240_Upd01Caller<MSBBP_DlvInstRcptReg, MS_MSBBL1240_Upd01Bridge>(
					(MSBBP_DlvInstRcptReg)this, new MS_MSBBL1240_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBBL1240_Upd01]の呼び出し */
	protected void callMS_MSBBL1240_Upd01() {
		MCCaller caller = createMS_MSBBL1240_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1240.CndR aCndR;
	/** [SloRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR> aSloRsltL;
	/** [ShipSchdRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> aShipSchdRsltL;
	/** [DlvInstRcptRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> aDlvInstRcptRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1240.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1240.CndR.create();
	}

	/**
	 * コピーによってaSloRsltLを設定します。
	 *
	 * aSloRsltLのインスタンスは変更されません。
	 *
	 * @param dataset SloRsltL
	 */
	public void setSloRsltL(MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR> aList) {
		if (getSloRsltL() != aList) {
			getSloRsltL().setAll(aList);
		}
	}

	/**
	 * [SloRslt]ブロックのコンテナaSloRsltLを返します。
	 *
	 * @return SloRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR> getSloRsltL() {
		return aSloRsltL;
	}

	/**
	 * aSloRsltRを作成します。
	 *
	 * @return SloRsltR
	 */
	public mcframe.clientMSBB.MSBBP1240.SloRsltR createSloRsltR() {
		return mcframe.clientMSBB.MSBBP1240.SloRsltR.create();
	}

	/**
	 * aSloRsltLを作成します。
	 *
	 * @return SloRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR> createSloRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.class);
	}

	/**
	 * SloRsltTableを初期化します。
	 */
	protected void createSloRsltTable(){
		if(SloRsltTable == null){
			SloRsltTable = beansFactory.createTable2("SloRslt.table");
		}
	}

	/**
	 * コピーによってaShipSchdRsltLを設定します。
	 *
	 * aShipSchdRsltLのインスタンスは変更されません。
	 *
	 * @param dataset ShipSchdRsltL
	 */
	public void setShipSchdRsltL(MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> aList) {
		if (getShipSchdRsltL() != aList) {
			getShipSchdRsltL().setAll(aList);
		}
	}

	/**
	 * [ShipSchdRslt]ブロックのコンテナaShipSchdRsltLを返します。
	 *
	 * @return ShipSchdRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> getShipSchdRsltL() {
		return aShipSchdRsltL;
	}

	/**
	 * aShipSchdRsltRを作成します。
	 *
	 * @return ShipSchdRsltR
	 */
	public mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR createShipSchdRsltR() {
		return mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.create();
	}

	/**
	 * aShipSchdRsltLを作成します。
	 *
	 * @return ShipSchdRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> createShipSchdRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.class);
	}

	/**
	 * ShipSchdRsltTableを初期化します。
	 */
	protected void createShipSchdRsltTable(){
		if(ShipSchdRsltTable == null){
			ShipSchdRsltTable = beansFactory.createTable2("ShipSchdRslt.table");
		}
	}

	/**
	 * コピーによってaDlvInstRcptRsltLを設定します。
	 *
	 * aDlvInstRcptRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DlvInstRcptRsltL
	 */
	public void setDlvInstRcptRsltL(MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> aList) {
		if (getDlvInstRcptRsltL() != aList) {
			getDlvInstRcptRsltL().setAll(aList);
		}
	}

	/**
	 * [DlvInstRcptRslt]ブロックのコンテナaDlvInstRcptRsltLを返します。
	 *
	 * @return DlvInstRcptRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> getDlvInstRcptRsltL() {
		return aDlvInstRcptRsltL;
	}

	/**
	 * aDlvInstRcptRsltRを作成します。
	 *
	 * @return DlvInstRcptRsltR
	 */
	public mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR createDlvInstRcptRsltR() {
		return mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.create();
	}

	/**
	 * aDlvInstRcptRsltLを作成します。
	 *
	 * @return DlvInstRcptRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> createDlvInstRcptRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class);
	}

	/**
	 * DlvInstRcptRsltTableを初期化します。
	 */
	protected void createDlvInstRcptRsltTable(){
		if(DlvInstRcptRsltTable == null){
			DlvInstRcptRsltTable = beansFactory.createTable2("DlvInstRcptRslt.table");
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
		if(!MCCollectionUtil.contains(ret, getSloRsltL())) ret.add(getSloRsltL());
		if(!MCCollectionUtil.contains(ret, getShipSchdRsltL())) ret.add(getShipSchdRsltL());
		if(!MCCollectionUtil.contains(ret, getDlvInstRcptRsltL())) ret.add(getDlvInstRcptRsltL());
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
		if(aCnt == getSloRsltL()) return "SloRslt";
		if(aCnt == getShipSchdRsltL()) return "ShipSchdRslt";
		if(aCnt == getDlvInstRcptRsltL()) return "DlvInstRcptRslt";
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
		if(bId.equals("SloRslt")) return getSloRsltL();
		if(bId.equals("ShipSchdRslt")) return getShipSchdRsltL();
		if(bId.equals("DlvInstRcptRslt")) return getDlvInstRcptRsltL();
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
		ret.add(SlsStsTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(EdiPanel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(Cnd4Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(SloPanel);
		ret.add(SloRsltPanel);
		ret.add(ShipSchdPanel);
		ret.add(ShipSchdRsltPanel);
		ret.add(DlvInstRcptPanel);
		ret.add(DlvInstRcptRsltPanel);
		ret.add(DlvInstRcptBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_DlvInstRcptReg_MC_A() {
		aCndR = createCndR();
		aSloRsltL = createSloRsltL();
		aShipSchdRsltL = createShipSchdRsltL();
		aDlvInstRcptRsltL = createDlvInstRcptRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_DlvInstRcptReg_MC_A(String name) {
		aCndR = createCndR();
		aSloRsltL = createSloRsltL();
		createSloRsltTable();
		SloRsltTable.setRowName(name);
		aShipSchdRsltL = createShipSchdRsltL();
		createShipSchdRsltTable();
		ShipSchdRsltTable.setRowName(name);
		aDlvInstRcptRsltL = createDlvInstRcptRsltL();
		createDlvInstRcptRsltTable();
		DlvInstRcptRsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_DlvInstRcptReg_MC.jbCreateScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateSlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateTop((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateFold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateTab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateEdi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateTab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateTab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateTab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateCnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateCnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateCnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateCnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateCtrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateSlo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateSloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateDlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateDlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateDlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbCreateBtn((MSBBP_DlvInstRcptReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [SlsStsTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsStsTyp(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_DlvInstRcptReg p) {
		p.Cnd_ship_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_rqst_dt_p());
		p.Cnd_ship_rqst_dt_p_PPanel.setName("Cnd.ship_rqst_dt_p");
		p.Cnd_ship_rqst_dt_fr = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_rqst_dt_fr.addAliasName("Cnd.ship_rqst_dt_fr", p);
		p.Cnd_ship_rqst_hm_fr = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_rqst_hm_fr.addAliasName("Cnd.ship_rqst_hm_fr", p);
		p.Cnd_ship_rqst_dt_to = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_rqst_dt_to.addAliasName("Cnd.ship_rqst_dt_to", p);
		p.Cnd_ship_rqst_hm_to = p.Cnd_ship_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_rqst_hm_to.addAliasName("Cnd.ship_rqst_hm_to", p);
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
		p.Cnd_dlv_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_schd_dt_p());
		p.Cnd_dlv_schd_dt_p_PPanel.setName("Cnd.dlv_schd_dt_p");
		p.Cnd_dlv_schd_dt_fr = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_schd_dt_fr.addAliasName("Cnd.dlv_schd_dt_fr", p);
		p.Cnd_dlv_schd_hm_fr = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_schd_hm_fr.addAliasName("Cnd.dlv_schd_hm_fr", p);
		p.Cnd_dlv_schd_dt_to = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_schd_dt_to.addAliasName("Cnd.dlv_schd_dt_to", p);
		p.Cnd_dlv_schd_hm_to = p.Cnd_dlv_schd_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_schd_hm_to.addAliasName("Cnd.dlv_schd_hm_to", p);
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
	protected static void jbCreateCnd2(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Cnd4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd4(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBBP_DlvInstRcptReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Slo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlo(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [SloRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSloRslt(MSBBP_DlvInstRcptReg p) {
		p.SloRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$itm_p);
		p.SloRslt_itm_p_PPanel.setName("SloRslt.itm_p");
		p.columnSloRslt_itm_cd = p.SloRslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnSloRslt_itm_cd.addAliasName("SloRslt.itm_cd", p);
		p.columnSloRslt_itm_sub1 = p.SloRslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnSloRslt_itm_sub1.addAliasName("SloRslt.itm_sub1", p);
		p.columnSloRslt_itm_sub2 = p.SloRslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnSloRslt_itm_sub2.addAliasName("SloRslt.itm_sub2", p);
		p.columnSloRslt_itm_sub3 = p.SloRslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnSloRslt_itm_sub3.addAliasName("SloRslt.itm_sub3", p);
		p.columnSloRslt_itm_nm = p.SloRslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnSloRslt_itm_nm.addAliasName("SloRslt.itm_nm", p);
		p.SloRslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$trd_unit_qty_p);
		p.SloRslt_trd_unit_qty_p_PPanel.setName("SloRslt.trd_unit_qty_p");
		p.columnSloRslt_trd_unit_qty = p.SloRslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_trd_unit_qty.addAliasName("SloRslt.trd_unit_qty", p);
		p.SloRslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$dlv_p);
		p.SloRslt_dlv_p_PPanel.setName("SloRslt.dlv_p");
		p.columnSloRslt_dlv_cd = p.SloRslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnSloRslt_dlv_cd.addAliasName("SloRslt.dlv_cd", p);
		p.columnSloRslt_dlv_nm = p.SloRslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnSloRslt_dlv_nm.addAliasName("SloRslt.dlv_nm", p);
		p.columnSloRslt_dlv_sundry_flg = p.SloRslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnSloRslt_dlv_sundry_flg.addAliasName("SloRslt.dlv_sundry_flg", p);
		p.columnSloRslt_pri_prnt_flg = p.SloRslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnSloRslt_pri_prnt_flg.addAliasName("SloRslt.pri_prnt_flg", p);
		p.columnSloRslt_dlv_cntry_cd = p.SloRslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnSloRslt_dlv_cntry_cd.addAliasName("SloRslt.dlv_cntry_cd", p);
		p.columnSloRslt_dlv_cntry_nm = p.SloRslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnSloRslt_dlv_cntry_nm.addAliasName("SloRslt.dlv_cntry_nm", p);
		p.columnSloRslt_dlv_zip_cd = p.SloRslt_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnSloRslt_dlv_zip_cd.addAliasName("SloRslt.dlv_zip_cd", p);
		p.columnSloRslt_dlv_addr1 = p.SloRslt_dlv_p_PPanel.columnDlv_addr1;
		p.columnSloRslt_dlv_addr1.addAliasName("SloRslt.dlv_addr1", p);
		p.columnSloRslt_dlv_addr2 = p.SloRslt_dlv_p_PPanel.columnDlv_addr2;
		p.columnSloRslt_dlv_addr2.addAliasName("SloRslt.dlv_addr2", p);
		p.columnSloRslt_dlv_addr3 = p.SloRslt_dlv_p_PPanel.columnDlv_addr3;
		p.columnSloRslt_dlv_addr3.addAliasName("SloRslt.dlv_addr3", p);
		p.columnSloRslt_dlv_addr4 = p.SloRslt_dlv_p_PPanel.columnDlv_addr4;
		p.columnSloRslt_dlv_addr4.addAliasName("SloRslt.dlv_addr4", p);
		p.columnSloRslt_dlv_cntct_dpt = p.SloRslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnSloRslt_dlv_cntct_dpt.addAliasName("SloRslt.dlv_cntct_dpt", p);
		p.columnSloRslt_dlv_cntct_psn = p.SloRslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnSloRslt_dlv_cntct_psn.addAliasName("SloRslt.dlv_cntct_psn", p);
		p.columnSloRslt_dlv_tel = p.SloRslt_dlv_p_PPanel.columnDlv_tel;
		p.columnSloRslt_dlv_tel.addAliasName("SloRslt.dlv_tel", p);
		p.columnSloRslt_dlv_fax = p.SloRslt_dlv_p_PPanel.columnDlv_fax;
		p.columnSloRslt_dlv_fax.addAliasName("SloRslt.dlv_fax", p);
		p.columnSloRslt_dlv_lg_grp_cd = p.SloRslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnSloRslt_dlv_lg_grp_cd.addAliasName("SloRslt.dlv_lg_grp_cd", p);
		p.columnSloRslt_dlv_lg_grp_nm = p.SloRslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnSloRslt_dlv_lg_grp_nm.addAliasName("SloRslt.dlv_lg_grp_nm", p);
		p.SloRslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$tdlv_p);
		p.SloRslt_tdlv_p_PPanel.setName("SloRslt.tdlv_p");
		p.columnSloRslt_tdlv_cd = p.SloRslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnSloRslt_tdlv_cd.addAliasName("SloRslt.tdlv_cd", p);
		p.columnSloRslt_tdlv_nm = p.SloRslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnSloRslt_tdlv_nm.addAliasName("SloRslt.tdlv_nm", p);
		p.columnSloRslt_tdlv_sundry_flg = p.SloRslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnSloRslt_tdlv_sundry_flg.addAliasName("SloRslt.tdlv_sundry_flg", p);
		p.columnSloRslt_tdlv_cntry_cd = p.SloRslt_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnSloRslt_tdlv_cntry_cd.addAliasName("SloRslt.tdlv_cntry_cd", p);
		p.columnSloRslt_tdlv_cntry_nm = p.SloRslt_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnSloRslt_tdlv_cntry_nm.addAliasName("SloRslt.tdlv_cntry_nm", p);
		p.columnSloRslt_tdlv_zip_cd = p.SloRslt_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnSloRslt_tdlv_zip_cd.addAliasName("SloRslt.tdlv_zip_cd", p);
		p.columnSloRslt_tdlv_addr1 = p.SloRslt_tdlv_p_PPanel.columnDlv_addr1;
		p.columnSloRslt_tdlv_addr1.addAliasName("SloRslt.tdlv_addr1", p);
		p.columnSloRslt_tdlv_addr2 = p.SloRslt_tdlv_p_PPanel.columnDlv_addr2;
		p.columnSloRslt_tdlv_addr2.addAliasName("SloRslt.tdlv_addr2", p);
		p.columnSloRslt_tdlv_addr3 = p.SloRslt_tdlv_p_PPanel.columnDlv_addr3;
		p.columnSloRslt_tdlv_addr3.addAliasName("SloRslt.tdlv_addr3", p);
		p.columnSloRslt_tdlv_addr4 = p.SloRslt_tdlv_p_PPanel.columnDlv_addr4;
		p.columnSloRslt_tdlv_addr4.addAliasName("SloRslt.tdlv_addr4", p);
		p.columnSloRslt_tdlv_tel = p.SloRslt_tdlv_p_PPanel.columnDlv_tel;
		p.columnSloRslt_tdlv_tel.addAliasName("SloRslt.tdlv_tel", p);
		p.columnSloRslt_tdlv_fax = p.SloRslt_tdlv_p_PPanel.columnDlv_fax;
		p.columnSloRslt_tdlv_fax.addAliasName("SloRslt.tdlv_fax", p);
		p.columnSloRslt_tdlv_cntct_dpt = p.SloRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnSloRslt_tdlv_cntct_dpt.addAliasName("SloRslt.tdlv_cntct_dpt", p);
		p.columnSloRslt_tdlv_cntct_psn = p.SloRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnSloRslt_tdlv_cntct_psn.addAliasName("SloRslt.tdlv_cntct_psn", p);
		p.columnSloRslt_tdlv_lg_grp_cd = p.SloRslt_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnSloRslt_tdlv_lg_grp_cd.addAliasName("SloRslt.tdlv_lg_grp_cd", p);
		p.columnSloRslt_tdlv_lg_grp_nm = p.SloRslt_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnSloRslt_tdlv_lg_grp_nm.addAliasName("SloRslt.tdlv_lg_grp_nm", p);
		p.SloRslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$str_ln_p);
		p.SloRslt_str_ln_p_PPanel.setName("SloRslt.str_ln_p");
		p.columnSloRslt_str_ln_cd = p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnSloRslt_str_ln_cd.addAliasName("SloRslt.str_ln_cd", p);
		p.columnSloRslt_str_ln_nm = p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnSloRslt_str_ln_nm.addAliasName("SloRslt.str_ln_nm", p);
		p.columnSloRslt_str_ln_cd_none_flg = p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnSloRslt_str_ln_cd_none_flg.addAliasName("SloRslt.str_ln_cd_none_flg", p);
		p.SloRslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$base_unit_qty_p);
		p.SloRslt_base_unit_qty_p_PPanel.setName("SloRslt.base_unit_qty_p");
		p.columnSloRslt_base_unit_qty = p.SloRslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_base_unit_qty.addAliasName("SloRslt.base_unit_qty", p);
		p.SloRslt_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$prms_qty_p);
		p.SloRslt_prms_qty_p_PPanel.setName("SloRslt.prms_qty_p");
		p.columnSloRslt_prms_qty = p.SloRslt_prms_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_prms_qty.addAliasName("SloRslt.prms_qty", p);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$dlv_inst_rcpt_qty_p);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.setName("SloRslt.dlv_inst_rcpt_qty_p");
		p.columnSloRslt_dlv_inst_rcpt_qty = p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_dlv_inst_rcpt_qty.addAliasName("SloRslt.dlv_inst_rcpt_qty", p);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$dlv_inst_prms_qty_p);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel.setName("SloRslt.dlv_inst_prms_qty_p");
		p.columnSloRslt_dlv_inst_prms_qty = p.SloRslt_dlv_inst_prms_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_dlv_inst_prms_qty.addAliasName("SloRslt.dlv_inst_prms_qty", p);
		p.SloRslt_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$alloc_qty_p);
		p.SloRslt_alloc_qty_p_PPanel.setName("SloRslt.alloc_qty_p");
		p.columnSloRslt_alloc_qty = p.SloRslt_alloc_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_alloc_qty.addAliasName("SloRslt.alloc_qty", p);
		p.SloRslt_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$wait_qty_p);
		p.SloRslt_wait_qty_p_PPanel.setName("SloRslt.wait_qty_p");
		p.columnSloRslt_wait_qty = p.SloRslt_wait_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_wait_qty.addAliasName("SloRslt.wait_qty", p);
		p.SloRslt_ship_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$ship_inst_qty_p);
		p.SloRslt_ship_inst_qty_p_PPanel.setName("SloRslt.ship_inst_qty_p");
		p.columnSloRslt_ship_inst_qty = p.SloRslt_ship_inst_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_ship_inst_qty.addAliasName("SloRslt.ship_inst_qty", p);
		p.SloRslt_ship_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$ship_act_qty_p);
		p.SloRslt_ship_act_qty_p_PPanel.setName("SloRslt.ship_act_qty_p");
		p.columnSloRslt_ship_act_qty = p.SloRslt_ship_act_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_ship_act_qty.addAliasName("SloRslt.ship_act_qty", p);
		p.SloRslt_iv_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$iv_schd_qty_p);
		p.SloRslt_iv_schd_qty_p_PPanel.setName("SloRslt.iv_schd_qty_p");
		p.columnSloRslt_iv_schd_qty = p.SloRslt_iv_schd_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_iv_schd_qty.addAliasName("SloRslt.iv_schd_qty", p);
		p.SloRslt_iv_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$iv_act_qty_p);
		p.SloRslt_iv_act_qty_p_PPanel.setName("SloRslt.iv_act_qty_p");
		p.columnSloRslt_iv_act_qty = p.SloRslt_iv_act_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_iv_act_qty.addAliasName("SloRslt.iv_act_qty", p);
		p.SloRslt_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$sls_qty_p);
		p.SloRslt_sls_qty_p_PPanel.setName("SloRslt.sls_qty_p");
		p.columnSloRslt_sls_qty = p.SloRslt_sls_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_sls_qty.addAliasName("SloRslt.sls_qty", p);
		p.SloRslt_ship_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$ship_ret_qty_p);
		p.SloRslt_ship_ret_qty_p_PPanel.setName("SloRslt.ship_ret_qty_p");
		p.columnSloRslt_ship_ret_qty = p.SloRslt_ship_ret_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_ship_ret_qty.addAliasName("SloRslt.ship_ret_qty", p);
		p.SloRslt_re_ship_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$re_ship_schd_qty_p);
		p.SloRslt_re_ship_schd_qty_p_PPanel.setName("SloRslt.re_ship_schd_qty_p");
		p.columnSloRslt_re_ship_schd_qty = p.SloRslt_re_ship_schd_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_re_ship_schd_qty.addAliasName("SloRslt.re_ship_schd_qty", p);
		p.SloRslt_ship_schd_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$ship_schd_abort_qty_p);
		p.SloRslt_ship_schd_abort_qty_p_PPanel.setName("SloRslt.ship_schd_abort_qty_p");
		p.columnSloRslt_ship_schd_abort_qty = p.SloRslt_ship_schd_abort_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_ship_schd_abort_qty.addAliasName("SloRslt.ship_schd_abort_qty", p);
		p.SloRslt_sls_schd_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.$sls_schd_abort_qty_p);
		p.SloRslt_sls_schd_abort_qty_p_PPanel.setName("SloRslt.sls_schd_abort_qty_p");
		p.columnSloRslt_sls_schd_abort_qty = p.SloRslt_sls_schd_abort_qty_p_PPanel.columnQty_qty;
		p.columnSloRslt_sls_schd_abort_qty.addAliasName("SloRslt.sls_schd_abort_qty", p);
	}

	/**
	 * [ShipSchd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipSchd(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [ShipSchdRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipSchdRslt(MSBBP_DlvInstRcptReg p) {
		p.ShipSchdRslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$trd_unit_qty_p);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.setName("ShipSchdRslt.trd_unit_qty_p");
		p.columnShipSchdRslt_trd_unit_qty = p.ShipSchdRslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_trd_unit_qty.addAliasName("ShipSchdRslt.trd_unit_qty", p);
		p.ShipSchdRslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$base_unit_qty_p);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.setName("ShipSchdRslt.base_unit_qty_p");
		p.columnShipSchdRslt_base_unit_qty = p.ShipSchdRslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_base_unit_qty.addAliasName("ShipSchdRslt.base_unit_qty", p);
		p.ShipSchdRslt_alloc_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$alloc_qty_p);
		p.ShipSchdRslt_alloc_qty_p_PPanel.setName("ShipSchdRslt.alloc_qty_p");
		p.columnShipSchdRslt_alloc_qty = p.ShipSchdRslt_alloc_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_alloc_qty.addAliasName("ShipSchdRslt.alloc_qty", p);
		p.ShipSchdRslt_wait_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$wait_qty_p);
		p.ShipSchdRslt_wait_qty_p_PPanel.setName("ShipSchdRslt.wait_qty_p");
		p.columnShipSchdRslt_wait_qty = p.ShipSchdRslt_wait_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_wait_qty.addAliasName("ShipSchdRslt.wait_qty", p);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$ship_inst_qty_p);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel.setName("ShipSchdRslt.ship_inst_qty_p");
		p.columnShipSchdRslt_ship_inst_qty = p.ShipSchdRslt_ship_inst_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_ship_inst_qty.addAliasName("ShipSchdRslt.ship_inst_qty", p);
		p.ShipSchdRslt_ship_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$ship_act_qty_p);
		p.ShipSchdRslt_ship_act_qty_p_PPanel.setName("ShipSchdRslt.ship_act_qty_p");
		p.columnShipSchdRslt_ship_act_qty = p.ShipSchdRslt_ship_act_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_ship_act_qty.addAliasName("ShipSchdRslt.ship_act_qty", p);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$iv_schd_qty_p);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel.setName("ShipSchdRslt.iv_schd_qty_p");
		p.columnShipSchdRslt_iv_schd_qty = p.ShipSchdRslt_iv_schd_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_iv_schd_qty.addAliasName("ShipSchdRslt.iv_schd_qty", p);
		p.ShipSchdRslt_iv_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$iv_act_qty_p);
		p.ShipSchdRslt_iv_act_qty_p_PPanel.setName("ShipSchdRslt.iv_act_qty_p");
		p.columnShipSchdRslt_iv_act_qty = p.ShipSchdRslt_iv_act_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_iv_act_qty.addAliasName("ShipSchdRslt.iv_act_qty", p);
		p.ShipSchdRslt_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$sls_qty_p);
		p.ShipSchdRslt_sls_qty_p_PPanel.setName("ShipSchdRslt.sls_qty_p");
		p.columnShipSchdRslt_sls_qty = p.ShipSchdRslt_sls_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_sls_qty.addAliasName("ShipSchdRslt.sls_qty", p);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$ship_ret_qty_p);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel.setName("ShipSchdRslt.ship_ret_qty_p");
		p.columnShipSchdRslt_ship_ret_qty = p.ShipSchdRslt_ship_ret_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_ship_ret_qty.addAliasName("ShipSchdRslt.ship_ret_qty", p);
		p.ShipSchdRslt_abort_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$abort_qty_p);
		p.ShipSchdRslt_abort_qty_p_PPanel.setName("ShipSchdRslt.abort_qty_p");
		p.columnShipSchdRslt_abort_qty = p.ShipSchdRslt_abort_qty_p_PPanel.columnQty_qty;
		p.columnShipSchdRslt_abort_qty.addAliasName("ShipSchdRslt.abort_qty", p);
		p.ShipSchdRslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$dlv_p);
		p.ShipSchdRslt_dlv_p_PPanel.setName("ShipSchdRslt.dlv_p");
		p.columnShipSchdRslt_dlv_cd = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnShipSchdRslt_dlv_cd.addAliasName("ShipSchdRslt.dlv_cd", p);
		p.columnShipSchdRslt_dlv_nm = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnShipSchdRslt_dlv_nm.addAliasName("ShipSchdRslt.dlv_nm", p);
		p.columnShipSchdRslt_dlv_sundry_flg = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnShipSchdRslt_dlv_sundry_flg.addAliasName("ShipSchdRslt.dlv_sundry_flg", p);
		p.columnShipSchdRslt_pri_prnt_flg = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnShipSchdRslt_pri_prnt_flg.addAliasName("ShipSchdRslt.pri_prnt_flg", p);
		p.columnShipSchdRslt_dlv_show_dtl = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnShipSchdRslt_dlv_show_dtl.addAliasName("ShipSchdRslt.dlv_show_dtl", p);
		p.columnShipSchdRslt_dlv_lg_grp_cd = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnShipSchdRslt_dlv_lg_grp_cd.addAliasName("ShipSchdRslt.dlv_lg_grp_cd", p);
		p.columnShipSchdRslt_dlv_lg_grp_nm = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnShipSchdRslt_dlv_lg_grp_nm.addAliasName("ShipSchdRslt.dlv_lg_grp_nm", p);
		p.columnShipSchdRslt_dlv_cntry_cd = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnShipSchdRslt_dlv_cntry_cd.addAliasName("ShipSchdRslt.dlv_cntry_cd", p);
		p.columnShipSchdRslt_dlv_cntry_nm = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnShipSchdRslt_dlv_cntry_nm.addAliasName("ShipSchdRslt.dlv_cntry_nm", p);
		p.columnShipSchdRslt_dlv_zip_cd = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnShipSchdRslt_dlv_zip_cd.addAliasName("ShipSchdRslt.dlv_zip_cd", p);
		p.columnShipSchdRslt_dlv_addr1 = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_addr1;
		p.columnShipSchdRslt_dlv_addr1.addAliasName("ShipSchdRslt.dlv_addr1", p);
		p.columnShipSchdRslt_dlv_addr2 = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_addr2;
		p.columnShipSchdRslt_dlv_addr2.addAliasName("ShipSchdRslt.dlv_addr2", p);
		p.columnShipSchdRslt_dlv_addr3 = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_addr3;
		p.columnShipSchdRslt_dlv_addr3.addAliasName("ShipSchdRslt.dlv_addr3", p);
		p.columnShipSchdRslt_dlv_addr4 = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_addr4;
		p.columnShipSchdRslt_dlv_addr4.addAliasName("ShipSchdRslt.dlv_addr4", p);
		p.columnShipSchdRslt_dlv_tel = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_tel;
		p.columnShipSchdRslt_dlv_tel.addAliasName("ShipSchdRslt.dlv_tel", p);
		p.columnShipSchdRslt_dlv_fax = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_fax;
		p.columnShipSchdRslt_dlv_fax.addAliasName("ShipSchdRslt.dlv_fax", p);
		p.columnShipSchdRslt_dlv_cntct_dpt = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnShipSchdRslt_dlv_cntct_dpt.addAliasName("ShipSchdRslt.dlv_cntct_dpt", p);
		p.columnShipSchdRslt_dlv_cntct_psn = p.ShipSchdRslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnShipSchdRslt_dlv_cntct_psn.addAliasName("ShipSchdRslt.dlv_cntct_psn", p);
		p.ShipSchdRslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.$tdlv_p);
		p.ShipSchdRslt_tdlv_p_PPanel.setName("ShipSchdRslt.tdlv_p");
		p.columnShipSchdRslt_tdlv_cd = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnShipSchdRslt_tdlv_cd.addAliasName("ShipSchdRslt.tdlv_cd", p);
		p.columnShipSchdRslt_tdlv_nm = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnShipSchdRslt_tdlv_nm.addAliasName("ShipSchdRslt.tdlv_nm", p);
		p.columnShipSchdRslt_tdlv_sundry_flg = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnShipSchdRslt_tdlv_sundry_flg.addAliasName("ShipSchdRslt.tdlv_sundry_flg", p);
		p.columnShipSchdRslt_tdlv_show_dtl = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnShipSchdRslt_tdlv_show_dtl.addAliasName("ShipSchdRslt.tdlv_show_dtl", p);
		p.columnShipSchdRslt_tdlv_lg_grp_cd = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnShipSchdRslt_tdlv_lg_grp_cd.addAliasName("ShipSchdRslt.tdlv_lg_grp_cd", p);
		p.columnShipSchdRslt_tdlv_lg_grp_nm = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnShipSchdRslt_tdlv_lg_grp_nm.addAliasName("ShipSchdRslt.tdlv_lg_grp_nm", p);
		p.columnShipSchdRslt_tdlv_cntry_cd = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnShipSchdRslt_tdlv_cntry_cd.addAliasName("ShipSchdRslt.tdlv_cntry_cd", p);
		p.columnShipSchdRslt_tdlv_cntry_nm = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnShipSchdRslt_tdlv_cntry_nm.addAliasName("ShipSchdRslt.tdlv_cntry_nm", p);
		p.columnShipSchdRslt_tdlv_zip_cd = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnShipSchdRslt_tdlv_zip_cd.addAliasName("ShipSchdRslt.tdlv_zip_cd", p);
		p.columnShipSchdRslt_tdlv_addr1 = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_addr1;
		p.columnShipSchdRslt_tdlv_addr1.addAliasName("ShipSchdRslt.tdlv_addr1", p);
		p.columnShipSchdRslt_tdlv_addr2 = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_addr2;
		p.columnShipSchdRslt_tdlv_addr2.addAliasName("ShipSchdRslt.tdlv_addr2", p);
		p.columnShipSchdRslt_tdlv_addr3 = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_addr3;
		p.columnShipSchdRslt_tdlv_addr3.addAliasName("ShipSchdRslt.tdlv_addr3", p);
		p.columnShipSchdRslt_tdlv_addr4 = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_addr4;
		p.columnShipSchdRslt_tdlv_addr4.addAliasName("ShipSchdRslt.tdlv_addr4", p);
		p.columnShipSchdRslt_tdlv_tel = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_tel;
		p.columnShipSchdRslt_tdlv_tel.addAliasName("ShipSchdRslt.tdlv_tel", p);
		p.columnShipSchdRslt_tdlv_fax = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_fax;
		p.columnShipSchdRslt_tdlv_fax.addAliasName("ShipSchdRslt.tdlv_fax", p);
		p.columnShipSchdRslt_tdlv_cntct_dpt = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnShipSchdRslt_tdlv_cntct_dpt.addAliasName("ShipSchdRslt.tdlv_cntct_dpt", p);
		p.columnShipSchdRslt_tdlv_cntct_psn = p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnShipSchdRslt_tdlv_cntct_psn.addAliasName("ShipSchdRslt.tdlv_cntct_psn", p);
	}

	/**
	 * [DlvInstRcpt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvInstRcpt(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [DlvInstRcptRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvInstRcptRslt(MSBBP_DlvInstRcptReg p) {
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.$trd_unit_qty_p);
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.setName("DlvInstRcptRslt.trd_unit_qty_p");
		p.columnDlvInstRcptRslt_trd_unit_qty = p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDlvInstRcptRslt_trd_unit_qty.addAliasName("DlvInstRcptRslt.trd_unit_qty", p);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.$dlv_rqst_dt_p);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.setName("DlvInstRcptRslt.dlv_rqst_dt_p");
		p.columnDlvInstRcptRslt_dlv_rqst_dt = p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnDlvInstRcptRslt_dlv_rqst_dt.addAliasName("DlvInstRcptRslt.dlv_rqst_dt", p);
		p.columnDlvInstRcptRslt_dlv_rqst_hm = p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnDlvInstRcptRslt_dlv_rqst_hm.addAliasName("DlvInstRcptRslt.dlv_rqst_hm", p);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.$base_unit_qty_p);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel.setName("DlvInstRcptRslt.base_unit_qty_p");
		p.columnDlvInstRcptRslt_base_unit_qty = p.DlvInstRcptRslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDlvInstRcptRslt_base_unit_qty.addAliasName("DlvInstRcptRslt.base_unit_qty", p);
		p.DlvInstRcptRslt_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.$dlv_p);
		p.DlvInstRcptRslt_dlv_p_PPanel.setName("DlvInstRcptRslt.dlv_p");
		p.columnDlvInstRcptRslt_dlv_cd = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDlvInstRcptRslt_dlv_cd.addAliasName("DlvInstRcptRslt.dlv_cd", p);
		p.columnDlvInstRcptRslt_dlv_nm = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDlvInstRcptRslt_dlv_nm.addAliasName("DlvInstRcptRslt.dlv_nm", p);
		p.columnDlvInstRcptRslt_dlv_sundry_flg = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDlvInstRcptRslt_dlv_sundry_flg.addAliasName("DlvInstRcptRslt.dlv_sundry_flg", p);
		p.columnDlvInstRcptRslt_pri_prnt_flg = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_pri_prnt_flg;
		p.columnDlvInstRcptRslt_pri_prnt_flg.addAliasName("DlvInstRcptRslt.pri_prnt_flg", p);
		p.columnDlvInstRcptRslt_dlv_show_dtl = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnDlvInstRcptRslt_dlv_show_dtl.addAliasName("DlvInstRcptRslt.dlv_show_dtl", p);
		p.columnDlvInstRcptRslt_dlv_lg_grp_cd = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDlvInstRcptRslt_dlv_lg_grp_cd.addAliasName("DlvInstRcptRslt.dlv_lg_grp_cd", p);
		p.columnDlvInstRcptRslt_dlv_lg_grp_nm = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnDlvInstRcptRslt_dlv_lg_grp_nm.addAliasName("DlvInstRcptRslt.dlv_lg_grp_nm", p);
		p.columnDlvInstRcptRslt_dlv_cntry_cd = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDlvInstRcptRslt_dlv_cntry_cd.addAliasName("DlvInstRcptRslt.dlv_cntry_cd", p);
		p.columnDlvInstRcptRslt_dlv_cntry_nm = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDlvInstRcptRslt_dlv_cntry_nm.addAliasName("DlvInstRcptRslt.dlv_cntry_nm", p);
		p.columnDlvInstRcptRslt_dlv_zip_cd = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnDlvInstRcptRslt_dlv_zip_cd.addAliasName("DlvInstRcptRslt.dlv_zip_cd", p);
		p.columnDlvInstRcptRslt_dlv_addr1 = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_addr1;
		p.columnDlvInstRcptRslt_dlv_addr1.addAliasName("DlvInstRcptRslt.dlv_addr1", p);
		p.columnDlvInstRcptRslt_dlv_addr2 = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_addr2;
		p.columnDlvInstRcptRslt_dlv_addr2.addAliasName("DlvInstRcptRslt.dlv_addr2", p);
		p.columnDlvInstRcptRslt_dlv_addr3 = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_addr3;
		p.columnDlvInstRcptRslt_dlv_addr3.addAliasName("DlvInstRcptRslt.dlv_addr3", p);
		p.columnDlvInstRcptRslt_dlv_addr4 = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_addr4;
		p.columnDlvInstRcptRslt_dlv_addr4.addAliasName("DlvInstRcptRslt.dlv_addr4", p);
		p.columnDlvInstRcptRslt_dlv_tel = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_tel;
		p.columnDlvInstRcptRslt_dlv_tel.addAliasName("DlvInstRcptRslt.dlv_tel", p);
		p.columnDlvInstRcptRslt_dlv_fax = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_fax;
		p.columnDlvInstRcptRslt_dlv_fax.addAliasName("DlvInstRcptRslt.dlv_fax", p);
		p.columnDlvInstRcptRslt_dlv_cntct_dpt = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDlvInstRcptRslt_dlv_cntct_dpt.addAliasName("DlvInstRcptRslt.dlv_cntct_dpt", p);
		p.columnDlvInstRcptRslt_dlv_cntct_psn = p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDlvInstRcptRslt_dlv_cntct_psn.addAliasName("DlvInstRcptRslt.dlv_cntct_psn", p);
		p.DlvInstRcptRslt_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.$tdlv_p);
		p.DlvInstRcptRslt_tdlv_p_PPanel.setName("DlvInstRcptRslt.tdlv_p");
		p.columnDlvInstRcptRslt_tdlv_cd = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnDlvInstRcptRslt_tdlv_cd.addAliasName("DlvInstRcptRslt.tdlv_cd", p);
		p.columnDlvInstRcptRslt_tdlv_nm = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnDlvInstRcptRslt_tdlv_nm.addAliasName("DlvInstRcptRslt.tdlv_nm", p);
		p.columnDlvInstRcptRslt_tdlv_sundry_flg = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDlvInstRcptRslt_tdlv_sundry_flg.addAliasName("DlvInstRcptRslt.tdlv_sundry_flg", p);
		p.columnDlvInstRcptRslt_tdlv_show_dtl = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnDlvInstRcptRslt_tdlv_show_dtl.addAliasName("DlvInstRcptRslt.tdlv_show_dtl", p);
		p.columnDlvInstRcptRslt_tdlv_lg_grp_cd = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDlvInstRcptRslt_tdlv_lg_grp_cd.addAliasName("DlvInstRcptRslt.tdlv_lg_grp_cd", p);
		p.columnDlvInstRcptRslt_tdlv_lg_grp_nm = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_lg_grp_nm;
		p.columnDlvInstRcptRslt_tdlv_lg_grp_nm.addAliasName("DlvInstRcptRslt.tdlv_lg_grp_nm", p);
		p.columnDlvInstRcptRslt_tdlv_cntry_cd = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDlvInstRcptRslt_tdlv_cntry_cd.addAliasName("DlvInstRcptRslt.tdlv_cntry_cd", p);
		p.columnDlvInstRcptRslt_tdlv_cntry_nm = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDlvInstRcptRslt_tdlv_cntry_nm.addAliasName("DlvInstRcptRslt.tdlv_cntry_nm", p);
		p.columnDlvInstRcptRslt_tdlv_zip_cd = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnDlvInstRcptRslt_tdlv_zip_cd.addAliasName("DlvInstRcptRslt.tdlv_zip_cd", p);
		p.columnDlvInstRcptRslt_tdlv_addr1 = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_addr1;
		p.columnDlvInstRcptRslt_tdlv_addr1.addAliasName("DlvInstRcptRslt.tdlv_addr1", p);
		p.columnDlvInstRcptRslt_tdlv_addr2 = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_addr2;
		p.columnDlvInstRcptRslt_tdlv_addr2.addAliasName("DlvInstRcptRslt.tdlv_addr2", p);
		p.columnDlvInstRcptRslt_tdlv_addr3 = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_addr3;
		p.columnDlvInstRcptRslt_tdlv_addr3.addAliasName("DlvInstRcptRslt.tdlv_addr3", p);
		p.columnDlvInstRcptRslt_tdlv_addr4 = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_addr4;
		p.columnDlvInstRcptRslt_tdlv_addr4.addAliasName("DlvInstRcptRslt.tdlv_addr4", p);
		p.columnDlvInstRcptRslt_tdlv_tel = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_tel;
		p.columnDlvInstRcptRslt_tdlv_tel.addAliasName("DlvInstRcptRslt.tdlv_tel", p);
		p.columnDlvInstRcptRslt_tdlv_fax = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_fax;
		p.columnDlvInstRcptRslt_tdlv_fax.addAliasName("DlvInstRcptRslt.tdlv_fax", p);
		p.columnDlvInstRcptRslt_tdlv_cntct_dpt = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDlvInstRcptRslt_tdlv_cntct_dpt.addAliasName("DlvInstRcptRslt.tdlv_cntct_dpt", p);
		p.columnDlvInstRcptRslt_tdlv_cntct_psn = p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDlvInstRcptRslt_tdlv_cntct_psn.addAliasName("DlvInstRcptRslt.tdlv_cntct_psn", p);
	}

	/**
	 * [DlvInstRcptBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlvInstRcptBtn(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBBP_DlvInstRcptReg p) {
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
	
	
	/** [Cnd_cst_nm_ListPutter]の定義 */
	private MCListPutter Cnd_cst_nm_p = null;

	/**
	 * [Cnd_cst_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_nm_ListPutter() {
		if (Cnd_cst_nm_p == null) {
			Cnd_cst_nm_p = createCnd_cst_nm_ListPutter(Cnd_cst_nm, "cst_nm");

		}
		return Cnd_cst_nm_p;
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
	
	
	/** [Cnd_dlv_nm_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_nm_p = null;

	/**
	 * [Cnd_dlv_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_nm_ListPutter() {
		if (Cnd_dlv_nm_p == null) {
			Cnd_dlv_nm_p = createCnd_dlv_nm_ListPutter(Cnd_dlv_nm, "dlv_nm");

		}
		return Cnd_dlv_nm_p;
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
	
	
	/** [Cnd_dest_nm1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_nm1_p = null;

	/**
	 * [Cnd_dest_nm1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_nm1_ListPutter() {
		if (Cnd_dest_nm1_p == null) {
			Cnd_dest_nm1_p = createCnd_dest_nm1_ListPutter(Cnd_dest_nm1, "dest_nm1");

		}
		return Cnd_dest_nm1_p;
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
	
	
	/** [Cnd_dest_nm2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_nm2_p = null;

	/**
	 * [Cnd_dest_nm2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_nm2_ListPutter() {
		if (Cnd_dest_nm2_p == null) {
			Cnd_dest_nm2_p = createCnd_dest_nm2_ListPutter(Cnd_dest_nm2, "dest_nm2");

		}
		return Cnd_dest_nm2_p;
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
	
	
	/** [Cnd_dest_nm3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_nm3_p = null;

	/**
	 * [Cnd_dest_nm3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_nm3_ListPutter() {
		if (Cnd_dest_nm3_p == null) {
			Cnd_dest_nm3_p = createCnd_dest_nm3_ListPutter(Cnd_dest_nm3, "dest_nm3");

		}
		return Cnd_dest_nm3_p;
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
	
	
	/** [Cnd_tdlv_nm_ListPutter]の定義 */
	private MCListPutter Cnd_tdlv_nm_p = null;

	/**
	 * [Cnd_tdlv_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tdlv_nm_ListPutter() {
		if (Cnd_tdlv_nm_p == null) {
			Cnd_tdlv_nm_p = createCnd_tdlv_nm_ListPutter(Cnd_tdlv_nm, "tdlv_nm");

		}
		return Cnd_tdlv_nm_p;
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
	
	
	/** [ShipSchdRslt_via_dlv_typ_ListPutter]の定義 */
	private MCListPutter ShipSchdRslt_via_dlv_typ_p = null;

	/**
	 * [ShipSchdRslt_via_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getShipSchdRslt_via_dlv_typ_ListPutter() {
		if (ShipSchdRslt_via_dlv_typ_p == null) {
			ShipSchdRslt_via_dlv_typ_p = createShipSchdRslt_via_dlv_typ_ListPutter(columnShipSchdRslt_via_dlv_typ, "via_dlv_typ");

		}
		return ShipSchdRslt_via_dlv_typ_p;
	}
	
	
	/** [ShipSchdRslt_dlv_day_week_typ_nm_ListPutter]の定義 */
	private MCListPutter ShipSchdRslt_dlv_day_week_typ_nm_p = null;

	/**
	 * [ShipSchdRslt_dlv_day_week_typ_nm_ListPutter]の取得
	 */
	protected MCListPutter getShipSchdRslt_dlv_day_week_typ_nm_ListPutter() {
		if (ShipSchdRslt_dlv_day_week_typ_nm_p == null) {
			ShipSchdRslt_dlv_day_week_typ_nm_p = createShipSchdRslt_dlv_day_week_typ_nm_ListPutter(columnShipSchdRslt_dlv_day_week_typ_nm, "dlv_day_week_typ_nm");

		}
		return ShipSchdRslt_dlv_day_week_typ_nm_p;
	}
	
	
	/** [DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_p == null) {
			DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_p = createDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd, "dlv_cd", "dlv_nm","dlv_sundry_flg","pri_prnt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","dlv_cntry_cd","dlv_cntry_nm","dlv_tel","dlv_fax","dlv_cntct_dpt","dlv_cntct_psn","dlv_lg_grp_cd","tdlv_req_flg");
		}
		return DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_p;
	}
	
	
	/** [DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_p = null;

	/**
	 * [DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter() {
		if (DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_p == null) {
			DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_p = createDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter(DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd, "tdlv_cd", "tdlv_nm","tdlv_sundry_flg","tdlv_cntct_dpt","tdlv_cntct_psn","tdlv_zip_cd","tdlv_addr1","tdlv_addr2","tdlv_addr3","tdlv_addr4","tdlv_tel","tdlv_fax","tdlv_lg_grp_cd","mst_via_dlv_typ","tdlv_cntry_cd","tdlv_cntry_nm");
		}
		return DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_p;
	}
	
	
	/** [DlvInstRcptRslt_via_dlv_typ_ListPutter]の定義 */
	private MCListPutter DlvInstRcptRslt_via_dlv_typ_p = null;

	/**
	 * [DlvInstRcptRslt_via_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getDlvInstRcptRslt_via_dlv_typ_ListPutter() {
		if (DlvInstRcptRslt_via_dlv_typ_p == null) {
			DlvInstRcptRslt_via_dlv_typ_p = createDlvInstRcptRslt_via_dlv_typ_ListPutter(columnDlvInstRcptRslt_via_dlv_typ, "via_dlv_typ", "via_dlv_typ_nm");

		}
		return DlvInstRcptRslt_via_dlv_typ_p;
	}
	
	
	/** [DlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter]の定義 */
	private MCListPutter DlvInstRcptRslt_dlv_day_week_typ_nm_p = null;

	/**
	 * [DlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter]の取得
	 */
	protected MCListPutter getDlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter() {
		if (DlvInstRcptRslt_dlv_day_week_typ_nm_p == null) {
			DlvInstRcptRslt_dlv_day_week_typ_nm_p = createDlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter(columnDlvInstRcptRslt_dlv_day_week_typ_nm, "dlv_day_week_typ_nm", "dlv_day_week_typ");

		}
		return DlvInstRcptRslt_dlv_day_week_typ_nm_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_DlvInstRcptReg create(){
		MSBBP_DlvInstRcptReg p = new MSBBP_DlvInstRcptReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_DlvInstRcptReg create(String name){
		MSBBP_DlvInstRcptReg p = new MSBBP_DlvInstRcptReg(name);
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
		MSBBP_DlvInstRcptReg_MC.jbfInitScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitSlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitTop((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitFold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitTab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitEdi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitTab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitTab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitTab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitCnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitCnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitCnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitCnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitCtrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitSlo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitSloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitDlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitDlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitDlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbfInitBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitSlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitTop((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitFold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitTab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitEdi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitTab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitTab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitTab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitCnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitCnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitCnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitCnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitCtrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitSlo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitSloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitDlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitDlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitDlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.jbInitBtn((MSBBP_DlvInstRcptReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SlsStsTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsStsTyp(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SlsStsTypPanel = p.beansFactory.createPanel("SlsStsTyp");
		p.SlsStsTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBBP_DlvInstRcptReg p) {
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
	protected static void jbfInitTab1(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_slo_flg = p.beansFactory.createCheckBox("Cnd.slo_flg");
		p.Cnd_prms_flg = p.beansFactory.createCheckBox("Cnd.prms_flg");
		p.Cnd_dlv_inst_rcpt_flg = p.beansFactory.createCheckBox("Cnd.dlv_inst_rcpt_flg");
		p.Cnd_dlv_inst_prms_flg = p.beansFactory.createCheckBox("Cnd.dlv_inst_prms_flg");
		p.Cnd_sls_flg = p.beansFactory.createCheckBox("Cnd.sls_flg");
		p.Cnd_ship_flg = p.beansFactory.createCheckBox("Cnd.ship_flg");
		p.Cnd_compl_flg = p.beansFactory.createCheckBox("Cnd.compl_flg");
		p.Cnd_edi_flg = p.beansFactory.createCheckBox("Cnd.edi_flg");
		p.Cnd_not_edi_flg = p.beansFactory.createCheckBox("Cnd.not_edi_flg");
		p.Cnd_slo_dt_fr_Label = p.beansFactory.createLabel("Cnd.slo_dt_fr_Label");
		p.Cnd_slo_dt_fr = p.beansFactory.createDateField("Cnd.slo_dt_fr");
		p.Cnd_slo_dt_fr.setLabel(p.Cnd_slo_dt_fr_Label);
		p.Cnd_slo_dt_to_Label = p.beansFactory.createLabel("Cnd.slo_dt_to_Label");
		p.Cnd_slo_dt_to = p.beansFactory.createDateField("Cnd.slo_dt_to");
		p.Cnd_slo_dt_to.setLabel(p.Cnd_slo_dt_to_Label);
		p.Cnd_dlv_inst_rcpt_dt_fr_Label = p.beansFactory.createLabel("Cnd.dlv_inst_rcpt_dt_fr_Label");
		p.Cnd_dlv_inst_rcpt_dt_fr = p.beansFactory.createDateField("Cnd.dlv_inst_rcpt_dt_fr");
		p.Cnd_dlv_inst_rcpt_dt_fr.setLabel(p.Cnd_dlv_inst_rcpt_dt_fr_Label);
		p.Cnd_dlv_inst_rcpt_dt_to_Label = p.beansFactory.createLabel("Cnd.dlv_inst_rcpt_dt_to_Label");
		p.Cnd_dlv_inst_rcpt_dt_to = p.beansFactory.createDateField("Cnd.dlv_inst_rcpt_dt_to");
		p.Cnd_dlv_inst_rcpt_dt_to.setLabel(p.Cnd_dlv_inst_rcpt_dt_to_Label);
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
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_cst_po_no_Label = p.beansFactory.createLabel("Cnd.cst_po_no_Label");
		p.Cnd_cst_po_no = p.beansFactory.createTextField("Cnd.cst_po_no");
		p.Cnd_cst_po_no.setLabel(p.Cnd_cst_po_no_Label);
		p.Cnd_cst_po_d_no_Label = p.beansFactory.createLabel("Cnd.cst_po_d_no_Label");
		p.Cnd_cst_po_d_no = p.beansFactory.createTextField("Cnd.cst_po_d_no");
		p.Cnd_cst_po_d_no.setLabel(p.Cnd_cst_po_d_no_Label);
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_wg_rqst_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.wg_rqst_cnt_rmrks_Label");
		p.Cnd_wg_rqst_cnt_rmrks = p.beansFactory.createTextField("Cnd.wg_rqst_cnt_rmrks");
		p.Cnd_wg_rqst_cnt_rmrks.setLabel(p.Cnd_wg_rqst_cnt_rmrks_Label);
		p.Cnd_ship_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.ship_cnt_rmrks_Label");
		p.Cnd_ship_cnt_rmrks = p.beansFactory.createTextField("Cnd.ship_cnt_rmrks");
		p.Cnd_ship_cnt_rmrks.setLabel(p.Cnd_ship_cnt_rmrks_Label);
		p.Cnd_cst_po_d_rmrks_Label = p.beansFactory.createLabel("Cnd.cst_po_d_rmrks_Label");
		p.Cnd_cst_po_d_rmrks = p.beansFactory.createTextField("Cnd.cst_po_d_rmrks");
		p.Cnd_cst_po_d_rmrks.setLabel(p.Cnd_cst_po_d_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
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
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd4(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel = p.beansFactory.createPanel("Cnd4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		// ブロックの項目の初期化
	}

	/**
	 * [Slo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlo(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SloPanel = p.beansFactory.createPanel("Slo");
		// ブロックの項目の初期化
	}

	/**
	 * [SloRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSloRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SloRsltPanel = p.beansFactory.createPanel("SloRslt");
		p.SloRsltScrollPane = p.beansFactory.createScrollPane("SloRslt.scroll");
		p.createSloRsltTable();
		// ブロックの項目の初期化
		p.columnSloRslt_sls_sts_typ = p.beansFactory.createTableColumn("SloRslt.sls_sts_typ", MCColumnType.TEXT);
		p.columnSloRslt_sls_sts_typ_nm = p.beansFactory.createTableColumn("SloRslt.sls_sts_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_alloc_sts_typ = p.beansFactory.createTableColumn("SloRslt.alloc_sts_typ", MCColumnType.TEXT);
		p.columnSloRslt_alloc_sts_typ_nm = p.beansFactory.createTableColumn("SloRslt.alloc_sts_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_trd_cd = p.beansFactory.createTableColumn("SloRslt.trd_cd", MCColumnType.TEXT);
		p.columnSloRslt_trd_ptn_typ = p.beansFactory.createTableColumn("SloRslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnSloRslt_trd_nm = p.beansFactory.createTableColumn("SloRslt.trd_nm", MCColumnType.TEXT);
		p.columnSloRslt_slo_no = p.beansFactory.createTableColumn("SloRslt.slo_no", MCColumnType.TEXT);
		p.columnSloRslt_slo_rev = p.beansFactory.createTableColumn("SloRslt.slo_rev", MCColumnType.NUMBER);
		p.columnSloRslt_slo_typ = p.beansFactory.createTableColumn("SloRslt.slo_typ", MCColumnType.TEXT);
		p.columnSloRslt_slo_typ_nm = p.beansFactory.createTableColumn("SloRslt.slo_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_aprv_flg = p.beansFactory.createTableColumn("SloRslt.aprv_flg", MCColumnType.CHECK);
		p.columnSloRslt_aprv_no = p.beansFactory.createTableColumn("SloRslt.aprv_no", MCColumnType.TEXT);
		p.columnSloRslt_aprv_sts_typ = p.beansFactory.createTableColumn("SloRslt.aprv_sts_typ", MCColumnType.TEXT);
		p.columnSloRslt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("SloRslt.aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_qtn_no = p.beansFactory.createTableColumn("SloRslt.qtn_no", MCColumnType.TEXT);
		p.columnSloRslt_qtn_rev = p.beansFactory.createTableColumn("SloRslt.qtn_rev", MCColumnType.NUMBER);
		p.columnSloRslt_slo_dt = p.beansFactory.createTableColumn("SloRslt.slo_dt", MCColumnType.DATE);
		p.columnSloRslt_dlv_inst_rcpt_dt = p.beansFactory.createTableColumn("SloRslt.dlv_inst_rcpt_dt", MCColumnType.DATE);
		p.columnSloRslt_cst_cd = p.beansFactory.createTableColumn("SloRslt.cst_cd", MCColumnType.TEXT);
		p.columnSloRslt_cst_nm = p.beansFactory.createTableColumn("SloRslt.cst_nm", MCColumnType.TEXT);
		p.columnSloRslt_sls_usr_cd = p.beansFactory.createTableColumn("SloRslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnSloRslt_sls_usr_nm = p.beansFactory.createTableColumn("SloRslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnSloRslt_sls_dpt_cd = p.beansFactory.createTableColumn("SloRslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnSloRslt_sls_dpt_nm = p.beansFactory.createTableColumn("SloRslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnSloRslt_wg_cd = p.beansFactory.createTableColumn("SloRslt.wg_cd", MCColumnType.TEXT);
		p.columnSloRslt_wg_nm = p.beansFactory.createTableColumn("SloRslt.wg_nm", MCColumnType.TEXT);
		p.columnSloRslt_assort_typ = p.beansFactory.createTableColumn("SloRslt.assort_typ", MCColumnType.TEXT);
		p.columnSloRslt_assort_typ_nm = p.beansFactory.createTableColumn("SloRslt.assort_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_cst_po_no = p.beansFactory.createTableColumn("SloRslt.cst_po_no", MCColumnType.TEXT);
		p.columnSloRslt_wrk_no = p.beansFactory.createTableColumn("SloRslt.wrk_no", MCColumnType.TEXT);
		p.columnSloRslt_wrk_nm = p.beansFactory.createTableColumn("SloRslt.wrk_nm", MCColumnType.TEXT);
		p.columnSloRslt_trd_rmrks = p.beansFactory.createTableColumn("SloRslt.trd_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_intr_rmrks = p.beansFactory.createTableColumn("SloRslt.intr_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_slo_d_no = p.beansFactory.createTableColumn("SloRslt.slo_d_no", MCColumnType.TEXT);
		p.columnSloRslt_cst_itm_cd = p.beansFactory.createTableColumn("SloRslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnSloRslt_cst_itm_nm = p.beansFactory.createTableColumn("SloRslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnSloRslt_sundry_itm_flg = p.beansFactory.createTableColumn("SloRslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnSloRslt_stk_mng_typ = p.beansFactory.createTableColumn("SloRslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnSloRslt_stk_mng_typ_nm = p.beansFactory.createTableColumn("SloRslt.stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_asset_mng_typ = p.beansFactory.createTableColumn("SloRslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnSloRslt_asset_mng_typ_nm = p.beansFactory.createTableColumn("SloRslt.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_vmi_flg = p.beansFactory.createTableColumn("SloRslt.vmi_flg", MCColumnType.CHECK);
		p.columnSloRslt_trd_unit_cd = p.beansFactory.createTableColumn("SloRslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnSloRslt_trd_unit_nm = p.beansFactory.createTableColumn("SloRslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnSloRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("SloRslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnSloRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("SloRslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnSloRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("SloRslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnSloRslt_set_itm_grp_no = p.beansFactory.createTableColumn("SloRslt.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnSloRslt_dest_cd1 = p.beansFactory.createTableColumn("SloRslt.dest_cd1", MCColumnType.TEXT);
		p.columnSloRslt_dest_nm1 = p.beansFactory.createTableColumn("SloRslt.dest_nm1", MCColumnType.TEXT);
		p.columnSloRslt_dest_cd2 = p.beansFactory.createTableColumn("SloRslt.dest_cd2", MCColumnType.TEXT);
		p.columnSloRslt_dest_nm2 = p.beansFactory.createTableColumn("SloRslt.dest_nm2", MCColumnType.TEXT);
		p.columnSloRslt_dest_cd3 = p.beansFactory.createTableColumn("SloRslt.dest_cd3", MCColumnType.TEXT);
		p.columnSloRslt_dest_nm3 = p.beansFactory.createTableColumn("SloRslt.dest_nm3", MCColumnType.TEXT);
		p.columnSloRslt_via_dlv_typ = p.beansFactory.createTableColumn("SloRslt.via_dlv_typ", MCColumnType.TEXT);
		p.columnSloRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("SloRslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("SloRslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnSloRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("SloRslt.dlv_day_week_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_sls_cststk_flg = p.beansFactory.createTableColumn("SloRslt.sls_cststk_flg", MCColumnType.CHECK);
		p.columnSloRslt_proc_typ = p.beansFactory.createTableColumn("SloRslt.proc_typ", MCColumnType.TEXT);
		p.columnSloRslt_proc_typ_nm = p.beansFactory.createTableColumn("SloRslt.proc_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_ship_inst_typ = p.beansFactory.createTableColumn("SloRslt.ship_inst_typ", MCColumnType.TEXT);
		p.columnSloRslt_ship_inst_typ_nm = p.beansFactory.createTableColumn("SloRslt.ship_inst_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_ship_schd_split_typ = p.beansFactory.createTableColumn("SloRslt.ship_schd_split_typ", MCColumnType.TEXT);
		p.columnSloRslt_ship_schd_split_typ_nm = p.beansFactory.createTableColumn("SloRslt.ship_schd_split_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_alloc_scope_typ = p.beansFactory.createTableColumn("SloRslt.alloc_scope_typ", MCColumnType.TEXT);
		p.columnSloRslt_alloc_scope_typ_nm = p.beansFactory.createTableColumn("SloRslt.alloc_scope_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_alloc_typ = p.beansFactory.createTableColumn("SloRslt.alloc_typ", MCColumnType.TEXT);
		p.columnSloRslt_alloc_typ_nm = p.beansFactory.createTableColumn("SloRslt.alloc_typ_nm", MCColumnType.TEXT);
		p.columnSloRslt_rqst_to_loc_cd = p.beansFactory.createTableColumn("SloRslt.rqst_to_loc_cd", MCColumnType.TEXT);
		p.columnSloRslt_rqst_to_loc_nm = p.beansFactory.createTableColumn("SloRslt.rqst_to_loc_nm", MCColumnType.TEXT);
		p.columnSloRslt_sppl_cd = p.beansFactory.createTableColumn("SloRslt.sppl_cd", MCColumnType.TEXT);
		p.columnSloRslt_sppl_nm = p.beansFactory.createTableColumn("SloRslt.sppl_nm", MCColumnType.TEXT);
		p.columnSloRslt_maker_cd = p.beansFactory.createTableColumn("SloRslt.maker_cd", MCColumnType.TEXT);
		p.columnSloRslt_maker_nm = p.beansFactory.createTableColumn("SloRslt.maker_nm", MCColumnType.TEXT);
		p.columnSloRslt_wg_rqst_cnt_rmrks = p.beansFactory.createTableColumn("SloRslt.wg_rqst_cnt_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_loc_cd = p.beansFactory.createTableColumn("SloRslt.loc_cd", MCColumnType.TEXT);
		p.columnSloRslt_loc_nm = p.beansFactory.createTableColumn("SloRslt.loc_nm", MCColumnType.TEXT);
		p.columnSloRslt_ship_lg_grp_cd = p.beansFactory.createTableColumn("SloRslt.ship_lg_grp_cd", MCColumnType.TEXT);
		p.columnSloRslt_ship_lg_grp_nm = p.beansFactory.createTableColumn("SloRslt.ship_lg_grp_nm", MCColumnType.TEXT);
		p.columnSloRslt_alloc_grp_cd = p.beansFactory.createTableColumn("SloRslt.alloc_grp_cd", MCColumnType.TEXT);
		p.columnSloRslt_alloc_grp_nm = p.beansFactory.createTableColumn("SloRslt.alloc_grp_nm", MCColumnType.TEXT);
		p.columnSloRslt_ship_term_cd = p.beansFactory.createTableColumn("SloRslt.ship_term_cd", MCColumnType.TEXT);
		p.columnSloRslt_ship_term_nm = p.beansFactory.createTableColumn("SloRslt.ship_term_nm", MCColumnType.TEXT);
		p.columnSloRslt_ship_cnt_rmrks = p.beansFactory.createTableColumn("SloRslt.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_cst_po_d_no = p.beansFactory.createTableColumn("SloRslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnSloRslt_cst_po_d_rmrks = p.beansFactory.createTableColumn("SloRslt.cst_po_d_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_sls_rsn_cd = p.beansFactory.createTableColumn("SloRslt.sls_rsn_cd", MCColumnType.TEXT);
		p.columnSloRslt_sls_rsn_nm = p.beansFactory.createTableColumn("SloRslt.sls_rsn_nm", MCColumnType.TEXT);
		p.columnSloRslt_trd_d_rmrks = p.beansFactory.createTableColumn("SloRslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_intr_d_rmrks = p.beansFactory.createTableColumn("SloRslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnSloRslt_ship_cmpl_flg = p.beansFactory.createTableColumn("SloRslt.ship_cmpl_flg", MCColumnType.CHECK);
		p.columnSloRslt_sls_cmpl_flg = p.beansFactory.createTableColumn("SloRslt.sls_cmpl_flg", MCColumnType.CHECK);
		p.columnSloRslt_ship_schd_split_flg = p.beansFactory.createTableColumn("SloRslt.ship_schd_split_flg", MCColumnType.CHECK);
		p.columnSloRslt_base_unit_cd = p.beansFactory.createTableColumn("SloRslt.base_unit_cd", MCColumnType.TEXT);
		p.columnSloRslt_base_unit_nm = p.beansFactory.createTableColumn("SloRslt.base_unit_nm", MCColumnType.TEXT);
		p.columnSloRslt_base_unit_dec_place = p.beansFactory.createTableColumn("SloRslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnSloRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("SloRslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnSloRslt_sub_char1 = p.beansFactory.createTableColumn("SloRslt.sub_char1", MCColumnType.TEXT);
		p.columnSloRslt_sub_char2 = p.beansFactory.createTableColumn("SloRslt.sub_char2", MCColumnType.TEXT);
		p.columnSloRslt_sub_char3 = p.beansFactory.createTableColumn("SloRslt.sub_char3", MCColumnType.TEXT);
		p.columnSloRslt_ins_usr_id = p.beansFactory.createTableColumn("SloRslt.ins_usr_id", MCColumnType.TEXT);
		p.columnSloRslt_ins_usr_nm = p.beansFactory.createTableColumn("SloRslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnSloRslt_ins_func_id = p.beansFactory.createTableColumn("SloRslt.ins_func_id", MCColumnType.TEXT);
		p.columnSloRslt_ins_func_nm = p.beansFactory.createTableColumn("SloRslt.ins_func_nm", MCColumnType.TEXT);
		p.columnSloRslt_ins_ts = p.beansFactory.createTableColumn("SloRslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnSloRslt_upd_usr_id = p.beansFactory.createTableColumn("SloRslt.upd_usr_id", MCColumnType.TEXT);
		p.columnSloRslt_upd_usr_nm = p.beansFactory.createTableColumn("SloRslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnSloRslt_upd_func_id = p.beansFactory.createTableColumn("SloRslt.upd_func_id", MCColumnType.TEXT);
		p.columnSloRslt_upd_func_nm = p.beansFactory.createTableColumn("SloRslt.upd_func_nm", MCColumnType.TEXT);
		p.columnSloRslt_upd_ts = p.beansFactory.createTableColumn("SloRslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnSloRslt_upd_srv_req_no = p.beansFactory.createTableColumn("SloRslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnSloRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("SloRslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
		p.columnSloRslt_slo_upd_cntr = p.beansFactory.createTableColumn("SloRslt.slo_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [ShipSchd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipSchd(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ShipSchdPanel = p.beansFactory.createPanel("ShipSchd");
		p.ShipSchdTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSchdRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipSchdRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ShipSchdRsltPanel = p.beansFactory.createPanel("ShipSchdRslt");
		p.ShipSchdRsltScrollPane = p.beansFactory.createScrollPane("ShipSchdRslt.scroll");
		p.createShipSchdRsltTable();
		// ブロックの項目の初期化
		p.columnShipSchdRslt_slo_d_no = p.beansFactory.createTableColumn("ShipSchdRslt.slo_d_no", MCColumnType.TEXT);
		p.columnShipSchdRslt_pr_sts_typ = p.beansFactory.createTableColumn("ShipSchdRslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnShipSchdRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("ShipSchdRslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_alloc_sts_typ = p.beansFactory.createTableColumn("ShipSchdRslt.alloc_sts_typ", MCColumnType.TEXT);
		p.columnShipSchdRslt_alloc_sts_typ_nm = p.beansFactory.createTableColumn("ShipSchdRslt.alloc_sts_typ_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_trd_unit_cd = p.beansFactory.createTableColumn("ShipSchdRslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnShipSchdRslt_trd_unit_nm = p.beansFactory.createTableColumn("ShipSchdRslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("ShipSchdRslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnShipSchdRslt_fix_flg = p.beansFactory.createTableColumn("ShipSchdRslt.fix_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_re_ship_schd_flg = p.beansFactory.createTableColumn("ShipSchdRslt.re_ship_schd_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_ship_rqst_dt = p.beansFactory.createTableColumn("ShipSchdRslt.ship_rqst_dt", MCColumnType.DATE);
		p.columnShipSchdRslt_ship_rqst_hm = p.beansFactory.createTableColumn("ShipSchdRslt.ship_rqst_hm", MCColumnType.DATE);
		p.columnShipSchdRslt_pd_inst_dlv_dt = p.beansFactory.createTableColumn("ShipSchdRslt.pd_inst_dlv_dt", MCColumnType.DATE);
		p.columnShipSchdRslt_pd_inst_dlv_hm = p.beansFactory.createTableColumn("ShipSchdRslt.pd_inst_dlv_hm", MCColumnType.DATE);
		p.columnShipSchdRslt_not_dt_calc_flg = p.beansFactory.createTableColumn("ShipSchdRslt.not_dt_calc_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_ship_wk_cd = p.beansFactory.createTableColumn("ShipSchdRslt.ship_wk_cd", MCColumnType.TEXT);
		p.columnShipSchdRslt_ship_wk_nm = p.beansFactory.createTableColumn("ShipSchdRslt.ship_wk_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_ship_schd_dt = p.beansFactory.createTableColumn("ShipSchdRslt.ship_schd_dt", MCColumnType.DATE);
		p.columnShipSchdRslt_ship_schd_hm = p.beansFactory.createTableColumn("ShipSchdRslt.ship_schd_hm", MCColumnType.DATE);
		p.columnShipSchdRslt_dlv_schd_dt = p.beansFactory.createTableColumn("ShipSchdRslt.dlv_schd_dt", MCColumnType.DATE);
		p.columnShipSchdRslt_dlv_schd_hm = p.beansFactory.createTableColumn("ShipSchdRslt.dlv_schd_hm", MCColumnType.DATE);
		p.columnShipSchdRslt_ship_block_flg = p.beansFactory.createTableColumn("ShipSchdRslt.ship_block_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_ship_abl_flg = p.beansFactory.createTableColumn("ShipSchdRslt.ship_abl_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("ShipSchdRslt.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm = p.beansFactory.createTableColumn("ShipSchdRslt.ship_fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_base_unit_cd = p.beansFactory.createTableColumn("ShipSchdRslt.base_unit_cd", MCColumnType.TEXT);
		p.columnShipSchdRslt_base_unit_nm = p.beansFactory.createTableColumn("ShipSchdRslt.base_unit_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_base_unit_dec_place = p.beansFactory.createTableColumn("ShipSchdRslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnShipSchdRslt_abort_flg = p.beansFactory.createTableColumn("ShipSchdRslt.abort_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_cmpl_flg = p.beansFactory.createTableColumn("ShipSchdRslt.cmpl_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_ship_term_cd = p.beansFactory.createTableColumn("ShipSchdRslt.ship_term_cd", MCColumnType.TEXT);
		p.columnShipSchdRslt_ship_term_nm = p.beansFactory.createTableColumn("ShipSchdRslt.ship_term_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_ship_schd_no = p.beansFactory.createTableColumn("ShipSchdRslt.ship_schd_no", MCColumnType.TEXT);
		p.columnShipSchdRslt_dlv_inst_rcpt_no = p.beansFactory.createTableColumn("ShipSchdRslt.dlv_inst_rcpt_no", MCColumnType.TEXT);
		p.columnShipSchdRslt_slo_prms_no = p.beansFactory.createTableColumn("ShipSchdRslt.slo_prms_no", MCColumnType.TEXT);
		p.columnShipSchdRslt_sls_act_d_no = p.beansFactory.createTableColumn("ShipSchdRslt.sls_act_d_no", MCColumnType.TEXT);
		p.columnShipSchdRslt_tdlv_req_flg = p.beansFactory.createTableColumn("ShipSchdRslt.tdlv_req_flg", MCColumnType.CHECK);
		p.columnShipSchdRslt_via_dlv_typ = p.beansFactory.createTableColumn("ShipSchdRslt.via_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnShipSchdRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("ShipSchdRslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("ShipSchdRslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnShipSchdRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("ShipSchdRslt.dlv_day_week_typ_nm", MCColumnType.TEXT_COMBO);
		p.columnShipSchdRslt_ins_usr_id = p.beansFactory.createTableColumn("ShipSchdRslt.ins_usr_id", MCColumnType.TEXT);
		p.columnShipSchdRslt_ins_usr_nm = p.beansFactory.createTableColumn("ShipSchdRslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_ins_func_id = p.beansFactory.createTableColumn("ShipSchdRslt.ins_func_id", MCColumnType.TEXT);
		p.columnShipSchdRslt_ins_func_nm = p.beansFactory.createTableColumn("ShipSchdRslt.ins_func_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_ins_ts = p.beansFactory.createTableColumn("ShipSchdRslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnShipSchdRslt_upd_usr_id = p.beansFactory.createTableColumn("ShipSchdRslt.upd_usr_id", MCColumnType.TEXT);
		p.columnShipSchdRslt_upd_usr_nm = p.beansFactory.createTableColumn("ShipSchdRslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_upd_func_id = p.beansFactory.createTableColumn("ShipSchdRslt.upd_func_id", MCColumnType.TEXT);
		p.columnShipSchdRslt_upd_func_nm = p.beansFactory.createTableColumn("ShipSchdRslt.upd_func_nm", MCColumnType.TEXT);
		p.columnShipSchdRslt_upd_ts = p.beansFactory.createTableColumn("ShipSchdRslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnShipSchdRslt_upd_srv_req_no = p.beansFactory.createTableColumn("ShipSchdRslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [DlvInstRcpt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvInstRcpt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptPanel = p.beansFactory.createPanel("DlvInstRcpt");
		p.DlvInstRcptTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DlvInstRcptRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvInstRcptRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptRsltPanel = p.beansFactory.createPanel("DlvInstRcptRslt");
		p.DlvInstRcptRsltScrollPane = p.beansFactory.createScrollPane("DlvInstRcptRslt.scroll");
		p.createDlvInstRcptRsltTable();
		// ブロックの項目の初期化
		p.columnDlvInstRcptRslt_slo_d_no = p.beansFactory.createTableColumn("DlvInstRcptRslt.slo_d_no", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no = p.beansFactory.createTableColumn("DlvInstRcptRslt.cst_dlv_inst_no", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev = p.beansFactory.createTableColumn("DlvInstRcptRslt.cst_dlv_inst_rev", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no = p.beansFactory.createTableColumn("DlvInstRcptRslt.cst_dlv_inst_d_no", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks = p.beansFactory.createTableColumn("DlvInstRcptRslt.cst_dlv_inst_rmrks", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks = p.beansFactory.createTableColumn("DlvInstRcptRslt.cst_dlv_inst_d_rmrks", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_intr_rmrks = p.beansFactory.createTableColumn("DlvInstRcptRslt.intr_rmrks", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_trd_unit_cd = p.beansFactory.createTableColumn("DlvInstRcptRslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_trd_unit_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("DlvInstRcptRslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("DlvInstRcptRslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("DlvInstRcptRslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_base_unit_cd = p.beansFactory.createTableColumn("DlvInstRcptRslt.base_unit_cd", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_base_unit_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.base_unit_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_base_unit_dec_place = p.beansFactory.createTableColumn("DlvInstRcptRslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("DlvInstRcptRslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_edi_flg = p.beansFactory.createTableColumn("DlvInstRcptRslt.edi_flg", MCColumnType.CHECK);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no = p.beansFactory.createTableColumn("DlvInstRcptRslt.dlv_inst_rcpt_no", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev = p.beansFactory.createTableColumn("DlvInstRcptRslt.dlv_inst_rcpt_rev", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_tdlv_req_flg = p.beansFactory.createTableColumn("DlvInstRcptRslt.tdlv_req_flg", MCColumnType.CHECK);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ = p.beansFactory.createTableColumn("DlvInstRcptRslt.mst_via_dlv_typ", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_via_dlv_typ = p.beansFactory.createTableColumn("DlvInstRcptRslt.via_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.via_dlv_typ_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_dlv_day_week_typ = p.beansFactory.createTableColumn("DlvInstRcptRslt.dlv_day_week_typ", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.dlv_day_week_typ_nm", MCColumnType.TEXT_COMBO);
		p.columnDlvInstRcptRslt_sub_char1 = p.beansFactory.createTableColumn("DlvInstRcptRslt.sub_char1", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_sub_char2 = p.beansFactory.createTableColumn("DlvInstRcptRslt.sub_char2", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_sub_char3 = p.beansFactory.createTableColumn("DlvInstRcptRslt.sub_char3", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ins_usr_id = p.beansFactory.createTableColumn("DlvInstRcptRslt.ins_usr_id", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ins_usr_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ins_func_id = p.beansFactory.createTableColumn("DlvInstRcptRslt.ins_func_id", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ins_func_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.ins_func_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ins_ts = p.beansFactory.createTableColumn("DlvInstRcptRslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDlvInstRcptRslt_upd_usr_id = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_usr_id", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_upd_usr_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_upd_func_id = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_func_id", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_upd_func_nm = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_func_nm", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_upd_ts = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDlvInstRcptRslt_upd_srv_req_no = p.beansFactory.createTableColumn("DlvInstRcptRslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr = p.beansFactory.createTableColumn("DlvInstRcptRslt.ship_pr_upd_cntr", MCColumnType.NUMBER);
		p.columnDlvInstRcptRslt_slo_upd_cntr = p.beansFactory.createTableColumn("DlvInstRcptRslt.slo_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [DlvInstRcptBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlvInstRcptBtn(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptBtnPanel = p.beansFactory.createPanel("DlvInstRcptBtn");
		// ブロックの項目の初期化
		p.DlvInstRcptBtn_radd = p.beansFactory.createButton("DlvInstRcptBtn.radd", "no_border");
		p.DlvInstRcptBtn_rdel = p.beansFactory.createButton("DlvInstRcptBtn.rdel", "no_border");
		p.DlvInstRcptBtn_rcopy = p.beansFactory.createButton("DlvInstRcptBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1230 = p.beansFactory.createButton("Btn.open_MSBBP1230", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SlsStsTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SlsStsTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsStsTyp(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SlsStsTypPanel.setBorder(p.SlsStsTypTitledBorder);
		p.add(p.SlsStsTypPanel);
		p.SlsStsTypPanel.setNextBeans(p.TopPanel);
		p.SlsStsTypPanel.setValueCheck(false);
		p.SlsStsTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SlsStsTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBBP_DlvInstRcptReg p) {
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
	protected static void jbInitFold(MSBBP_DlvInstRcptReg p) {
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
	protected static void jbInitTab1(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.EdiPanel, null);
		p.Tab1Panel.setLastBeans(p.EdiPanel);
		p.EdiPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBBP_DlvInstRcptReg p) {
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
	protected static void jbInitTab3(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.Cnd4Panel, null);
		p.Tab4Panel.setLastBeans(p.Cnd4Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_DlvInstRcptReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.ope_META);
		p.SlsStsTypPanel.add(p.Cnd_slo_flg);
		p.SlsStsTypPanel.setLastBeans(p.Cnd_slo_flg);
		p.Cnd_slo_flg.setNextBeans(p.Cnd_prms_flg);
		p.Cnd_slo_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.slo_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_prms_flg);
		p.Cnd_prms_flg.setNextBeans(p.Cnd_dlv_inst_rcpt_flg);
		p.Cnd_prms_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.prms_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_dlv_inst_rcpt_flg);
		p.Cnd_dlv_inst_rcpt_flg.setNextBeans(p.Cnd_dlv_inst_prms_flg);
		p.Cnd_dlv_inst_rcpt_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_inst_rcpt_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_dlv_inst_prms_flg);
		p.Cnd_dlv_inst_prms_flg.setNextBeans(p.Cnd_sls_flg);
		p.Cnd_dlv_inst_prms_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_inst_prms_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_sls_flg);
		p.Cnd_sls_flg.setNextBeans(p.Cnd_ship_flg);
		p.Cnd_sls_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sls_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_ship_flg);
		p.Cnd_ship_flg.setNextBeans(p.Cnd_compl_flg);
		p.Cnd_ship_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.ship_flg_META);
		p.SlsStsTypPanel.add(p.Cnd_compl_flg);
		p.Cnd_compl_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.compl_flg_META);
		p.EdiPanel.add(p.Cnd_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_edi_flg);
		p.Cnd_edi_flg.setNextBeans(p.Cnd_not_edi_flg);
		p.Cnd_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.edi_flg_META);
		p.EdiPanel.add(p.Cnd_not_edi_flg);
		p.Cnd_not_edi_flg.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.not_edi_flg_META);
		p.CndPanel.add(p.Cnd_slo_dt_fr_Label);
		p.CndPanel.add(p.Cnd_slo_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_slo_dt_fr);
		p.Cnd_slo_dt_fr.setNextBeans(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.slo_dt_fr_META);
		p.Cnd_slo_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_slo_dt_to_Label);
		p.CndPanel.add(p.Cnd_slo_dt_to);
		p.Cnd_slo_dt_to.setNextBeans(p.Cnd_dlv_inst_rcpt_dt_fr);
		p.Cnd_slo_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.slo_dt_to_META);
		p.Cnd_slo_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_inst_rcpt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_rcpt_dt_fr);
		p.Cnd_dlv_inst_rcpt_dt_fr.setNextBeans(p.Cnd_dlv_inst_rcpt_dt_to);
		p.Cnd_dlv_inst_rcpt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_inst_rcpt_dt_fr_META);
		p.Cnd_dlv_inst_rcpt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_inst_rcpt_dt_to_Label);
		p.CndPanel.add(p.Cnd_dlv_inst_rcpt_dt_to);
		p.Cnd_dlv_inst_rcpt_dt_to.setNextBeans(p.Cnd_ship_rqst_dt_p_PPanel);
		p.Cnd_dlv_inst_rcpt_dt_to.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_inst_rcpt_dt_to_META);
		p.Cnd_dlv_inst_rcpt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ship_rqst_dt_p_PPanel);
		p.Cnd_ship_rqst_dt_p_PPanel.setNextBeans(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.Cnd_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_ship_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_ship_schd_dt_p_PPanel);
		p.Cnd_ship_schd_dt_p_PPanel.setNextBeans(p.Cnd_dlv_schd_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_schd_dt_p_PPanel);
		p.Cnd_dlv_schd_dt_p_PPanel.setNextBeans(p.Cnd_sls_usr_cd);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_cst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_cst_cd_Label);
		p.CndPanel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.CndPanel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_nm_META);
		p.Cnd_cst_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dlv_nm_META);
		p.Cnd_dlv_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_dest_cd1_Label);
		p.CndPanel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.CndPanel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_nm1_META);
		p.Cnd_dest_nm1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.CndPanel.add(p.Cnd_dest_cd2_Label);
		p.CndPanel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.CndPanel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_nm2_META);
		p.Cnd_dest_nm2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.CndPanel.add(p.Cnd_dest_cd3_Label);
		p.CndPanel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.CndPanel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.dest_nm3_META);
		p.Cnd_dest_nm3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_slo_no);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.tdlv_nm_META);
		p.Cnd_tdlv_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_cst_po_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_cst_po_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_no);
		p.Cnd_cst_po_no.setNextBeans(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_po_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_no, true);
		p.CndPanel.add(p.Cnd_cst_po_d_no_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_no);
		p.Cnd_cst_po_d_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_cst_po_d_no.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_po_d_no_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_no, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_trd_rmrks);
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
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_wg_rqst_cnt_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_wg_rqst_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_cnt_rmrks);
		p.Cnd_wg_rqst_cnt_rmrks.setNextBeans(p.Cnd_ship_cnt_rmrks);
		p.Cnd_wg_rqst_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.wg_rqst_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_ship_cnt_rmrks);
		p.Cnd_ship_cnt_rmrks.setNextBeans(p.Cnd_cst_po_d_rmrks);
		p.Cnd_ship_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.ship_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_ship_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_cst_po_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_cst_po_d_rmrks);
		p.Cnd_cst_po_d_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_cst_po_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.cst_po_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_cst_po_d_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1240.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_dlv_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_dlv_grp_p_PPanel);
		p.Cnd3Panel.add(p.Cnd_cst_grp_p_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_cst_grp_p_PPanel);
		p.Cnd4Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd4Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd4(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.Cnd4Panel.setValueCheck(false);
		p.Cnd4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd4Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBBP_DlvInstRcptReg p) {
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
	protected static void jbInitRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RsltPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.RsltPanel.add(p.SloPanel, null);
		p.RsltPanel.setLastBeans(p.SloPanel);
		p.SloPanel.setNextBeans(p.ShipSchdPanel);
		p.RsltPanel.add(p.ShipSchdPanel, null);
		p.ShipSchdPanel.setNextBeans(p.DlvInstRcptPanel);
		p.RsltPanel.add(p.DlvInstRcptPanel, null);
	}

	/**
	 * [Slo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlo(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SloPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.SloPanel.add(p.SloRsltPanel, null);
		p.SloPanel.setLastBeans(p.SloRsltPanel);
	}

	/**
	 * [SloRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSloRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.SloRsltPanel.add(p.SloRsltScrollPane);
		p.SloRsltPanel.setLastBeans(p.SloRsltTable);
		p.SloRsltScrollPane.setViewportView(p.SloRsltTable);
		p.SloRsltTable.setList(p.getSloRsltL());
		p.SloRsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ShipSchd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipSchd(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ShipSchdPanel.setBorder(p.ShipSchdTitledBorder);
		p.ShipSchdPanel.setLayoutPosition("CBCCT+");
		// ブロックの項目の初期化
		p.ShipSchdPanel.add(p.ShipSchdRsltPanel, null);
		p.ShipSchdPanel.setLastBeans(p.ShipSchdRsltPanel);
	}

	/**
	 * [ShipSchdRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipSchdRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.ShipSchdRsltPanel.add(p.ShipSchdRsltScrollPane);
		p.ShipSchdRsltPanel.setLastBeans(p.ShipSchdRsltTable);
		p.ShipSchdRsltScrollPane.setViewportView(p.ShipSchdRsltTable);
		p.ShipSchdRsltTable.setList(p.getShipSchdRsltL());
		p.ShipSchdRsltTable.setStatusColumnVisible(false);
		p.ShipSchdRsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvInstRcpt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvInstRcpt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptPanel.setBorder(p.DlvInstRcptTitledBorder);
		p.DlvInstRcptPanel.setLayoutPosition("CBCCBC+");
		// ブロックの項目の初期化
		p.DlvInstRcptPanel.add(p.DlvInstRcptRsltPanel, null);
		p.DlvInstRcptPanel.setLastBeans(p.DlvInstRcptRsltPanel);
		p.DlvInstRcptRsltPanel.setNextBeans(p.DlvInstRcptBtnPanel);
		p.DlvInstRcptPanel.add(p.DlvInstRcptBtnPanel, null);
	}

	/**
	 * [DlvInstRcptRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvInstRcptRslt(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptRsltPanel.add(p.DlvInstRcptRsltScrollPane);
		p.DlvInstRcptRsltPanel.setLastBeans(p.DlvInstRcptRsltTable);
		p.DlvInstRcptRsltScrollPane.setViewportView(p.DlvInstRcptRsltTable);
		p.DlvInstRcptRsltTable.setList(p.getDlvInstRcptRsltL());
		p.DlvInstRcptRsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DlvInstRcptBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlvInstRcptBtn(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.DlvInstRcptBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DlvInstRcptBtn_radd.setIcon("INSERT_RECORD");
		p.DlvInstRcptBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DlvInstRcptBtnPanel.add(p.DlvInstRcptBtn_radd);
		p.DlvInstRcptBtnPanel.setLastBeans(p.DlvInstRcptBtn_radd);
		p.DlvInstRcptBtn_radd.setNextBeans(p.DlvInstRcptBtn_rdel);
		p.DlvInstRcptBtn_rdel.setIcon("DELETE_RECORD");
		p.DlvInstRcptBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DlvInstRcptBtnPanel.add(p.DlvInstRcptBtn_rdel);
		p.DlvInstRcptBtn_rdel.setNextBeans(p.DlvInstRcptBtn_rcopy);
		p.DlvInstRcptBtn_rcopy.setIcon("COPY_RECORD");
		p.DlvInstRcptBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DlvInstRcptBtnPanel.add(p.DlvInstRcptBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBBP_DlvInstRcptReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBBP1230.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBBP1230);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBBP1230);
		p.Btn_open_MSBBP1230.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBBP_DlvInstRcptReg_MC.mcInitScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitSlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitTop((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitFold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitTab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitEdi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitTab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitTab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitTab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitCnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitCnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitCnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitCnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitCtrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitSlo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitSloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitDlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitDlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitDlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.mcInitBtn((MSBBP_DlvInstRcptReg)this);

		// [UPD]ステータスのモードの設定
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_ScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_SlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Top((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Fold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Tab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Edi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Tab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Tab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Tab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Cnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Cnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Cnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Cnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Ctrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Rslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Slo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_SloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_ShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_ShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_DlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_DlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_DlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitUPD_Btn((MSBBP_DlvInstRcptReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_ScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_SlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Top((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Fold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Tab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Edi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Tab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Tab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Tab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Cnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Cnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Cnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Cnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Ctrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Rslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Slo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_SloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_ShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_ShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_DlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_DlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_DlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitFIX__U_Btn((MSBBP_DlvInstRcptReg)this);

		// [SRCH]ステータスのモードの設定
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_ScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_SlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Top((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Fold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Tab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Edi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Tab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Tab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Tab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Cnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Cnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Cnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Cnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Ctrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Rslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Slo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_SloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_ShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_ShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_DlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_DlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_DlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitSRCH_Btn((MSBBP_DlvInstRcptReg)this);

		// [REF]ステータスのモードの設定
		MSBBP_DlvInstRcptReg_MC.statusInitREF_ScreenOpe((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_SlsStsTyp((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Top((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Fold((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Tab1((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Edi((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Tab2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Tab3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Tab4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Cnd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Cnd2((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Cnd3((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Cnd4((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Ctrl((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Rslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Slo((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_SloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_ShipSchd((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_ShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_DlvInstRcpt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_DlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_DlvInstRcptBtn((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.statusInitREF_Btn((MSBBP_DlvInstRcptReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [SlsStsTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsStsTyp(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBBP_DlvInstRcptReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_DlvInstRcptReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_slo_flg.addAllListener(p);
		p.Cnd_prms_flg.addAllListener(p);
		p.Cnd_dlv_inst_rcpt_flg.addAllListener(p);
		p.Cnd_dlv_inst_prms_flg.addAllListener(p);
		p.Cnd_sls_flg.addAllListener(p);
		p.Cnd_ship_flg.addAllListener(p);
		p.Cnd_compl_flg.addAllListener(p);
		p.Cnd_edi_flg.addAllListener(p);
		p.Cnd_not_edi_flg.addAllListener(p);
		p.Cnd_slo_dt_fr.setListListener(p);
		p.Cnd_slo_dt_fr.addAllListener(p);
		p.Cnd_slo_dt_to.setListListener(p);
		p.Cnd_slo_dt_to.addAllListener(p);
		p.Cnd_dlv_inst_rcpt_dt_fr.setListListener(p);
		p.Cnd_dlv_inst_rcpt_dt_fr.addAllListener(p);
		p.Cnd_dlv_inst_rcpt_dt_to.setListListener(p);
		p.Cnd_dlv_inst_rcpt_dt_to.addAllListener(p);
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
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_cst_po_no.setListListener(p);
		p.Cnd_cst_po_no.addAllListener(p);
		p.Cnd_cst_po_d_no.setListListener(p);
		p.Cnd_cst_po_d_no.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_wg_rqst_cnt_rmrks.setListListener(p);
		p.Cnd_wg_rqst_cnt_rmrks.addAllListener(p);
		p.Cnd_ship_cnt_rmrks.setListListener(p);
		p.Cnd_ship_cnt_rmrks.addAllListener(p);
		p.Cnd_cst_po_d_rmrks.setListListener(p);
		p.Cnd_cst_po_d_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Cnd4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd4(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBBP_DlvInstRcptReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [Slo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlo(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [SloRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSloRslt(MSBBP_DlvInstRcptReg p) {
		p.SloRsltTable.addAllListener(p);
		p.columnSloRslt_sls_sts_typ.addAllListener(p);
		p.columnSloRslt_sls_sts_typ.setListListener(p);
		p.columnSloRslt_sls_sts_typ_nm.addAllListener(p);
		p.columnSloRslt_sls_sts_typ_nm.setListListener(p);
		p.columnSloRslt_alloc_sts_typ.addAllListener(p);
		p.columnSloRslt_alloc_sts_typ.setListListener(p);
		p.columnSloRslt_alloc_sts_typ_nm.addAllListener(p);
		p.columnSloRslt_alloc_sts_typ_nm.setListListener(p);
		p.columnSloRslt_trd_cd.addAllListener(p);
		p.columnSloRslt_trd_cd.setListListener(p);
		p.columnSloRslt_trd_ptn_typ.addAllListener(p);
		p.columnSloRslt_trd_ptn_typ.setListListener(p);
		p.columnSloRslt_trd_nm.addAllListener(p);
		p.columnSloRslt_trd_nm.setListListener(p);
		p.columnSloRslt_slo_no.addAllListener(p);
		p.columnSloRslt_slo_no.setListListener(p);
		p.columnSloRslt_slo_rev.addAllListener(p);
		p.columnSloRslt_slo_rev.setListListener(p);
		p.columnSloRslt_slo_typ.addAllListener(p);
		p.columnSloRslt_slo_typ.setListListener(p);
		p.columnSloRslt_slo_typ_nm.addAllListener(p);
		p.columnSloRslt_slo_typ_nm.setListListener(p);
		p.columnSloRslt_aprv_flg.addAllListener(p);
		p.columnSloRslt_aprv_no.addAllListener(p);
		p.columnSloRslt_aprv_no.setListListener(p);
		p.columnSloRslt_aprv_sts_typ.addAllListener(p);
		p.columnSloRslt_aprv_sts_typ.setListListener(p);
		p.columnSloRslt_aprv_sts_typ_nm.addAllListener(p);
		p.columnSloRslt_aprv_sts_typ_nm.setListListener(p);
		p.columnSloRslt_qtn_no.addAllListener(p);
		p.columnSloRslt_qtn_no.setListListener(p);
		p.columnSloRslt_qtn_rev.addAllListener(p);
		p.columnSloRslt_qtn_rev.setListListener(p);
		p.columnSloRslt_slo_dt.addAllListener(p);
		p.columnSloRslt_slo_dt.setListListener(p);
		p.columnSloRslt_dlv_inst_rcpt_dt.addAllListener(p);
		p.columnSloRslt_dlv_inst_rcpt_dt.setListListener(p);
		p.columnSloRslt_cst_cd.addAllListener(p);
		p.columnSloRslt_cst_cd.setListListener(p);
		p.columnSloRslt_cst_nm.addAllListener(p);
		p.columnSloRslt_cst_nm.setListListener(p);
		p.columnSloRslt_sls_usr_cd.addAllListener(p);
		p.columnSloRslt_sls_usr_cd.setListListener(p);
		p.columnSloRslt_sls_usr_nm.addAllListener(p);
		p.columnSloRslt_sls_usr_nm.setListListener(p);
		p.columnSloRslt_sls_dpt_cd.addAllListener(p);
		p.columnSloRslt_sls_dpt_cd.setListListener(p);
		p.columnSloRslt_sls_dpt_nm.addAllListener(p);
		p.columnSloRslt_sls_dpt_nm.setListListener(p);
		p.columnSloRslt_wg_cd.addAllListener(p);
		p.columnSloRslt_wg_cd.setListListener(p);
		p.columnSloRslt_wg_nm.addAllListener(p);
		p.columnSloRslt_wg_nm.setListListener(p);
		p.columnSloRslt_assort_typ.addAllListener(p);
		p.columnSloRslt_assort_typ.setListListener(p);
		p.columnSloRslt_assort_typ_nm.addAllListener(p);
		p.columnSloRslt_assort_typ_nm.setListListener(p);
		p.columnSloRslt_cst_po_no.addAllListener(p);
		p.columnSloRslt_cst_po_no.setListListener(p);
		p.columnSloRslt_wrk_no.addAllListener(p);
		p.columnSloRslt_wrk_no.setListListener(p);
		p.columnSloRslt_wrk_nm.addAllListener(p);
		p.columnSloRslt_wrk_nm.setListListener(p);
		p.columnSloRslt_trd_rmrks.addAllListener(p);
		p.columnSloRslt_trd_rmrks.setListListener(p);
		p.columnSloRslt_intr_rmrks.addAllListener(p);
		p.columnSloRslt_intr_rmrks.setListListener(p);
		p.columnSloRslt_slo_d_no.addAllListener(p);
		p.columnSloRslt_slo_d_no.setListListener(p);
		p.columnSloRslt_cst_itm_cd.addAllListener(p);
		p.columnSloRslt_cst_itm_cd.setListListener(p);
		p.columnSloRslt_cst_itm_nm.addAllListener(p);
		p.columnSloRslt_cst_itm_nm.setListListener(p);
		p.columnSloRslt_sundry_itm_flg.addAllListener(p);
		p.columnSloRslt_stk_mng_typ.addAllListener(p);
		p.columnSloRslt_stk_mng_typ.setListListener(p);
		p.columnSloRslt_stk_mng_typ_nm.addAllListener(p);
		p.columnSloRslt_stk_mng_typ_nm.setListListener(p);
		p.columnSloRslt_asset_mng_typ.addAllListener(p);
		p.columnSloRslt_asset_mng_typ.setListListener(p);
		p.columnSloRslt_asset_mng_typ_nm.addAllListener(p);
		p.columnSloRslt_asset_mng_typ_nm.setListListener(p);
		p.columnSloRslt_vmi_flg.addAllListener(p);
		p.columnSloRslt_trd_unit_cd.addAllListener(p);
		p.columnSloRslt_trd_unit_cd.setListListener(p);
		p.columnSloRslt_trd_unit_nm.addAllListener(p);
		p.columnSloRslt_trd_unit_nm.setListListener(p);
		p.columnSloRslt_trd_unit_dec_place.addAllListener(p);
		p.columnSloRslt_trd_unit_dec_place.setListListener(p);
		p.columnSloRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnSloRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnSloRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnSloRslt_trd_unit_conv_qty.setListListener(p);
		p.columnSloRslt_set_itm_grp_no.addAllListener(p);
		p.columnSloRslt_set_itm_grp_no.setListListener(p);
		p.columnSloRslt_dest_cd1.addAllListener(p);
		p.columnSloRslt_dest_cd1.setListListener(p);
		p.columnSloRslt_dest_nm1.addAllListener(p);
		p.columnSloRslt_dest_nm1.setListListener(p);
		p.columnSloRslt_dest_cd2.addAllListener(p);
		p.columnSloRslt_dest_cd2.setListListener(p);
		p.columnSloRslt_dest_nm2.addAllListener(p);
		p.columnSloRslt_dest_nm2.setListListener(p);
		p.columnSloRslt_dest_cd3.addAllListener(p);
		p.columnSloRslt_dest_cd3.setListListener(p);
		p.columnSloRslt_dest_nm3.addAllListener(p);
		p.columnSloRslt_dest_nm3.setListListener(p);
		p.columnSloRslt_via_dlv_typ.addAllListener(p);
		p.columnSloRslt_via_dlv_typ.setListListener(p);
		p.columnSloRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnSloRslt_via_dlv_typ_nm.setListListener(p);
		p.columnSloRslt_dlv_day_week_typ.addAllListener(p);
		p.columnSloRslt_dlv_day_week_typ.setListListener(p);
		p.columnSloRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnSloRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnSloRslt_sls_cststk_flg.addAllListener(p);
		p.columnSloRslt_proc_typ.addAllListener(p);
		p.columnSloRslt_proc_typ.setListListener(p);
		p.columnSloRslt_proc_typ_nm.addAllListener(p);
		p.columnSloRslt_proc_typ_nm.setListListener(p);
		p.columnSloRslt_ship_inst_typ.addAllListener(p);
		p.columnSloRslt_ship_inst_typ.setListListener(p);
		p.columnSloRslt_ship_inst_typ_nm.addAllListener(p);
		p.columnSloRslt_ship_inst_typ_nm.setListListener(p);
		p.columnSloRslt_ship_schd_split_typ.addAllListener(p);
		p.columnSloRslt_ship_schd_split_typ.setListListener(p);
		p.columnSloRslt_ship_schd_split_typ_nm.addAllListener(p);
		p.columnSloRslt_ship_schd_split_typ_nm.setListListener(p);
		p.columnSloRslt_alloc_scope_typ.addAllListener(p);
		p.columnSloRslt_alloc_scope_typ.setListListener(p);
		p.columnSloRslt_alloc_scope_typ_nm.addAllListener(p);
		p.columnSloRslt_alloc_scope_typ_nm.setListListener(p);
		p.columnSloRslt_alloc_typ.addAllListener(p);
		p.columnSloRslt_alloc_typ.setListListener(p);
		p.columnSloRslt_alloc_typ_nm.addAllListener(p);
		p.columnSloRslt_alloc_typ_nm.setListListener(p);
		p.columnSloRslt_rqst_to_loc_cd.addAllListener(p);
		p.columnSloRslt_rqst_to_loc_cd.setListListener(p);
		p.columnSloRslt_rqst_to_loc_nm.addAllListener(p);
		p.columnSloRslt_rqst_to_loc_nm.setListListener(p);
		p.columnSloRslt_sppl_cd.addAllListener(p);
		p.columnSloRslt_sppl_cd.setListListener(p);
		p.columnSloRslt_sppl_nm.addAllListener(p);
		p.columnSloRslt_sppl_nm.setListListener(p);
		p.columnSloRslt_maker_cd.addAllListener(p);
		p.columnSloRslt_maker_cd.setListListener(p);
		p.columnSloRslt_maker_nm.addAllListener(p);
		p.columnSloRslt_maker_nm.setListListener(p);
		p.columnSloRslt_wg_rqst_cnt_rmrks.addAllListener(p);
		p.columnSloRslt_wg_rqst_cnt_rmrks.setListListener(p);
		p.columnSloRslt_loc_cd.addAllListener(p);
		p.columnSloRslt_loc_cd.setListListener(p);
		p.columnSloRslt_loc_nm.addAllListener(p);
		p.columnSloRslt_loc_nm.setListListener(p);
		p.columnSloRslt_ship_lg_grp_cd.addAllListener(p);
		p.columnSloRslt_ship_lg_grp_cd.setListListener(p);
		p.columnSloRslt_ship_lg_grp_nm.addAllListener(p);
		p.columnSloRslt_ship_lg_grp_nm.setListListener(p);
		p.columnSloRslt_alloc_grp_cd.addAllListener(p);
		p.columnSloRslt_alloc_grp_cd.setListListener(p);
		p.columnSloRslt_alloc_grp_nm.addAllListener(p);
		p.columnSloRslt_alloc_grp_nm.setListListener(p);
		p.columnSloRslt_ship_term_cd.addAllListener(p);
		p.columnSloRslt_ship_term_cd.setListListener(p);
		p.columnSloRslt_ship_term_nm.addAllListener(p);
		p.columnSloRslt_ship_term_nm.setListListener(p);
		p.columnSloRslt_ship_cnt_rmrks.addAllListener(p);
		p.columnSloRslt_ship_cnt_rmrks.setListListener(p);
		p.columnSloRslt_cst_po_d_no.addAllListener(p);
		p.columnSloRslt_cst_po_d_no.setListListener(p);
		p.columnSloRslt_cst_po_d_rmrks.addAllListener(p);
		p.columnSloRslt_cst_po_d_rmrks.setListListener(p);
		p.columnSloRslt_sls_rsn_cd.addAllListener(p);
		p.columnSloRslt_sls_rsn_cd.setListListener(p);
		p.columnSloRslt_sls_rsn_nm.addAllListener(p);
		p.columnSloRslt_sls_rsn_nm.setListListener(p);
		p.columnSloRslt_trd_d_rmrks.addAllListener(p);
		p.columnSloRslt_trd_d_rmrks.setListListener(p);
		p.columnSloRslt_intr_d_rmrks.addAllListener(p);
		p.columnSloRslt_intr_d_rmrks.setListListener(p);
		p.columnSloRslt_ship_cmpl_flg.addAllListener(p);
		p.columnSloRslt_sls_cmpl_flg.addAllListener(p);
		p.columnSloRslt_ship_schd_split_flg.addAllListener(p);
		p.columnSloRslt_base_unit_cd.addAllListener(p);
		p.columnSloRslt_base_unit_cd.setListListener(p);
		p.columnSloRslt_base_unit_nm.addAllListener(p);
		p.columnSloRslt_base_unit_nm.setListListener(p);
		p.columnSloRslt_base_unit_dec_place.addAllListener(p);
		p.columnSloRslt_base_unit_dec_place.setListListener(p);
		p.columnSloRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnSloRslt_base_unit_rnd_typ.setListListener(p);
		p.columnSloRslt_sub_char1.addAllListener(p);
		p.columnSloRslt_sub_char1.setListListener(p);
		p.columnSloRslt_sub_char2.addAllListener(p);
		p.columnSloRslt_sub_char2.setListListener(p);
		p.columnSloRslt_sub_char3.addAllListener(p);
		p.columnSloRslt_sub_char3.setListListener(p);
		p.columnSloRslt_ins_usr_id.addAllListener(p);
		p.columnSloRslt_ins_usr_id.setListListener(p);
		p.columnSloRslt_ins_usr_nm.addAllListener(p);
		p.columnSloRslt_ins_usr_nm.setListListener(p);
		p.columnSloRslt_ins_func_id.addAllListener(p);
		p.columnSloRslt_ins_func_id.setListListener(p);
		p.columnSloRslt_ins_func_nm.addAllListener(p);
		p.columnSloRslt_ins_func_nm.setListListener(p);
		p.columnSloRslt_ins_ts.addAllListener(p);
		p.columnSloRslt_ins_ts.setListListener(p);
		p.columnSloRslt_upd_usr_id.addAllListener(p);
		p.columnSloRslt_upd_usr_id.setListListener(p);
		p.columnSloRslt_upd_usr_nm.addAllListener(p);
		p.columnSloRslt_upd_usr_nm.setListListener(p);
		p.columnSloRslt_upd_func_id.addAllListener(p);
		p.columnSloRslt_upd_func_id.setListListener(p);
		p.columnSloRslt_upd_func_nm.addAllListener(p);
		p.columnSloRslt_upd_func_nm.setListListener(p);
		p.columnSloRslt_upd_ts.addAllListener(p);
		p.columnSloRslt_upd_ts.setListListener(p);
		p.columnSloRslt_upd_srv_req_no.addAllListener(p);
		p.columnSloRslt_upd_srv_req_no.setListListener(p);
		p.columnSloRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnSloRslt_ship_pr_upd_cntr.setListListener(p);
		p.columnSloRslt_slo_upd_cntr.addAllListener(p);
		p.columnSloRslt_slo_upd_cntr.setListListener(p);
	}

	/**
	 *  [ShipSchd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipSchd(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [ShipSchdRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipSchdRslt(MSBBP_DlvInstRcptReg p) {
		p.ShipSchdRsltTable.addAllListener(p);
		p.columnShipSchdRslt_slo_d_no.addAllListener(p);
		p.columnShipSchdRslt_slo_d_no.setListListener(p);
		p.columnShipSchdRslt_pr_sts_typ.addAllListener(p);
		p.columnShipSchdRslt_pr_sts_typ.setListListener(p);
		p.columnShipSchdRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnShipSchdRslt_pr_sts_typ_nm.setListListener(p);
		p.columnShipSchdRslt_alloc_sts_typ.addAllListener(p);
		p.columnShipSchdRslt_alloc_sts_typ.setListListener(p);
		p.columnShipSchdRslt_alloc_sts_typ_nm.addAllListener(p);
		p.columnShipSchdRslt_alloc_sts_typ_nm.setListListener(p);
		p.columnShipSchdRslt_trd_unit_cd.addAllListener(p);
		p.columnShipSchdRslt_trd_unit_cd.setListListener(p);
		p.columnShipSchdRslt_trd_unit_nm.addAllListener(p);
		p.columnShipSchdRslt_trd_unit_nm.setListListener(p);
		p.columnShipSchdRslt_trd_unit_dec_place.addAllListener(p);
		p.columnShipSchdRslt_trd_unit_dec_place.setListListener(p);
		p.columnShipSchdRslt_fix_flg.addAllListener(p);
		p.columnShipSchdRslt_re_ship_schd_flg.addAllListener(p);
		p.columnShipSchdRslt_ship_rqst_dt.addAllListener(p);
		p.columnShipSchdRslt_ship_rqst_dt.setListListener(p);
		p.columnShipSchdRslt_ship_rqst_hm.addAllListener(p);
		p.columnShipSchdRslt_ship_rqst_hm.setListListener(p);
		p.columnShipSchdRslt_pd_inst_dlv_dt.addAllListener(p);
		p.columnShipSchdRslt_pd_inst_dlv_dt.setListListener(p);
		p.columnShipSchdRslt_pd_inst_dlv_hm.addAllListener(p);
		p.columnShipSchdRslt_pd_inst_dlv_hm.setListListener(p);
		p.columnShipSchdRslt_not_dt_calc_flg.addAllListener(p);
		p.columnShipSchdRslt_ship_wk_cd.addAllListener(p);
		p.columnShipSchdRslt_ship_wk_cd.setListListener(p);
		p.columnShipSchdRslt_ship_wk_nm.addAllListener(p);
		p.columnShipSchdRslt_ship_wk_nm.setListListener(p);
		p.columnShipSchdRslt_ship_schd_dt.addAllListener(p);
		p.columnShipSchdRslt_ship_schd_dt.setListListener(p);
		p.columnShipSchdRslt_ship_schd_hm.addAllListener(p);
		p.columnShipSchdRslt_ship_schd_hm.setListListener(p);
		p.columnShipSchdRslt_dlv_schd_dt.addAllListener(p);
		p.columnShipSchdRslt_dlv_schd_dt.setListListener(p);
		p.columnShipSchdRslt_dlv_schd_hm.addAllListener(p);
		p.columnShipSchdRslt_dlv_schd_hm.setListListener(p);
		p.columnShipSchdRslt_ship_block_flg.addAllListener(p);
		p.columnShipSchdRslt_ship_abl_flg.addAllListener(p);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.setListListener(p);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.addAllListener(p);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.setListListener(p);
		p.columnShipSchdRslt_base_unit_cd.addAllListener(p);
		p.columnShipSchdRslt_base_unit_cd.setListListener(p);
		p.columnShipSchdRslt_base_unit_nm.addAllListener(p);
		p.columnShipSchdRslt_base_unit_nm.setListListener(p);
		p.columnShipSchdRslt_base_unit_dec_place.addAllListener(p);
		p.columnShipSchdRslt_base_unit_dec_place.setListListener(p);
		p.columnShipSchdRslt_abort_flg.addAllListener(p);
		p.columnShipSchdRslt_cmpl_flg.addAllListener(p);
		p.columnShipSchdRslt_ship_term_cd.addAllListener(p);
		p.columnShipSchdRslt_ship_term_cd.setListListener(p);
		p.columnShipSchdRslt_ship_term_nm.addAllListener(p);
		p.columnShipSchdRslt_ship_term_nm.setListListener(p);
		p.columnShipSchdRslt_ship_schd_no.addAllListener(p);
		p.columnShipSchdRslt_ship_schd_no.setListListener(p);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.addAllListener(p);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.setListListener(p);
		p.columnShipSchdRslt_slo_prms_no.addAllListener(p);
		p.columnShipSchdRslt_slo_prms_no.setListListener(p);
		p.columnShipSchdRslt_sls_act_d_no.addAllListener(p);
		p.columnShipSchdRslt_sls_act_d_no.setListListener(p);
		p.columnShipSchdRslt_tdlv_req_flg.addAllListener(p);
		p.columnShipSchdRslt_via_dlv_typ.addAllListener(p);
		p.columnShipSchdRslt_via_dlv_typ.setListListener(p);
		p.columnShipSchdRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnShipSchdRslt_via_dlv_typ_nm.setListListener(p);
		p.columnShipSchdRslt_dlv_day_week_typ.addAllListener(p);
		p.columnShipSchdRslt_dlv_day_week_typ.setListListener(p);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnShipSchdRslt_ins_usr_id.addAllListener(p);
		p.columnShipSchdRslt_ins_usr_id.setListListener(p);
		p.columnShipSchdRslt_ins_usr_nm.addAllListener(p);
		p.columnShipSchdRslt_ins_usr_nm.setListListener(p);
		p.columnShipSchdRslt_ins_func_id.addAllListener(p);
		p.columnShipSchdRslt_ins_func_id.setListListener(p);
		p.columnShipSchdRslt_ins_func_nm.addAllListener(p);
		p.columnShipSchdRslt_ins_func_nm.setListListener(p);
		p.columnShipSchdRslt_ins_ts.addAllListener(p);
		p.columnShipSchdRslt_ins_ts.setListListener(p);
		p.columnShipSchdRslt_upd_usr_id.addAllListener(p);
		p.columnShipSchdRslt_upd_usr_id.setListListener(p);
		p.columnShipSchdRslt_upd_usr_nm.addAllListener(p);
		p.columnShipSchdRslt_upd_usr_nm.setListListener(p);
		p.columnShipSchdRslt_upd_func_id.addAllListener(p);
		p.columnShipSchdRslt_upd_func_id.setListListener(p);
		p.columnShipSchdRslt_upd_func_nm.addAllListener(p);
		p.columnShipSchdRslt_upd_func_nm.setListListener(p);
		p.columnShipSchdRslt_upd_ts.addAllListener(p);
		p.columnShipSchdRslt_upd_ts.setListListener(p);
		p.columnShipSchdRslt_upd_srv_req_no.addAllListener(p);
		p.columnShipSchdRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [DlvInstRcpt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvInstRcpt(MSBBP_DlvInstRcptReg p) {
	}

	/**
	 *  [DlvInstRcptRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvInstRcptRslt(MSBBP_DlvInstRcptReg p) {
		p.DlvInstRcptRsltTable.addAllListener(p);
		p.columnDlvInstRcptRslt_slo_d_no.addAllListener(p);
		p.columnDlvInstRcptRslt_slo_d_no.setListListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.addAllListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.setListListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.addAllListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.setListListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.addAllListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.setListListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.addAllListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.setListListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.addAllListener(p);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.setListListener(p);
		p.columnDlvInstRcptRslt_intr_rmrks.addAllListener(p);
		p.columnDlvInstRcptRslt_intr_rmrks.setListListener(p);
		p.columnDlvInstRcptRslt_trd_unit_cd.addAllListener(p);
		p.columnDlvInstRcptRslt_trd_unit_cd.setListListener(p);
		p.columnDlvInstRcptRslt_trd_unit_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_trd_unit_nm.setListListener(p);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.addAllListener(p);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.setListListener(p);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.setListListener(p);
		p.columnDlvInstRcptRslt_base_unit_cd.addAllListener(p);
		p.columnDlvInstRcptRslt_base_unit_cd.setListListener(p);
		p.columnDlvInstRcptRslt_base_unit_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_base_unit_nm.setListListener(p);
		p.columnDlvInstRcptRslt_base_unit_dec_place.addAllListener(p);
		p.columnDlvInstRcptRslt_base_unit_dec_place.setListListener(p);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.setListListener(p);
		p.columnDlvInstRcptRslt_edi_flg.addAllListener(p);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.addAllListener(p);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.setListListener(p);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.addAllListener(p);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.setListListener(p);
		p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDlvInstRcptRslt_tdlv_req_flg.addAllListener(p);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.addAllListener(p);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.setListListener(p);
		p.columnDlvInstRcptRslt_via_dlv_typ.addAllListener(p);
		p.columnDlvInstRcptRslt_via_dlv_typ.setListListener(p);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.setListListener(p);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.addAllListener(p);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.setListListener(p);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.setListListener(p);
		p.columnDlvInstRcptRslt_sub_char1.addAllListener(p);
		p.columnDlvInstRcptRslt_sub_char1.setListListener(p);
		p.columnDlvInstRcptRslt_sub_char2.addAllListener(p);
		p.columnDlvInstRcptRslt_sub_char2.setListListener(p);
		p.columnDlvInstRcptRslt_sub_char3.addAllListener(p);
		p.columnDlvInstRcptRslt_sub_char3.setListListener(p);
		p.columnDlvInstRcptRslt_ins_usr_id.addAllListener(p);
		p.columnDlvInstRcptRslt_ins_usr_id.setListListener(p);
		p.columnDlvInstRcptRslt_ins_usr_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_ins_usr_nm.setListListener(p);
		p.columnDlvInstRcptRslt_ins_func_id.addAllListener(p);
		p.columnDlvInstRcptRslt_ins_func_id.setListListener(p);
		p.columnDlvInstRcptRslt_ins_func_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_ins_func_nm.setListListener(p);
		p.columnDlvInstRcptRslt_ins_ts.addAllListener(p);
		p.columnDlvInstRcptRslt_ins_ts.setListListener(p);
		p.columnDlvInstRcptRslt_upd_usr_id.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_usr_id.setListListener(p);
		p.columnDlvInstRcptRslt_upd_usr_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_usr_nm.setListListener(p);
		p.columnDlvInstRcptRslt_upd_func_id.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_func_id.setListListener(p);
		p.columnDlvInstRcptRslt_upd_func_nm.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_func_nm.setListListener(p);
		p.columnDlvInstRcptRslt_upd_ts.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_ts.setListListener(p);
		p.columnDlvInstRcptRslt_upd_srv_req_no.addAllListener(p);
		p.columnDlvInstRcptRslt_upd_srv_req_no.setListListener(p);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.addAllListener(p);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.setListListener(p);
		p.columnDlvInstRcptRslt_slo_upd_cntr.addAllListener(p);
		p.columnDlvInstRcptRslt_slo_upd_cntr.setListListener(p);
	}

	/**
	 *  [DlvInstRcptBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlvInstRcptBtn(MSBBP_DlvInstRcptReg p) {
		p.DlvInstRcptBtn_radd.addAllListener(p);
		p.DlvInstRcptBtn_radd.setAPMethodName("doDlvInstRcptBtn_radd");
		p.DlvInstRcptBtn_rdel.addAllListener(p);
		p.DlvInstRcptBtn_rdel.setAPMethodName("doDlvInstRcptBtn_rdel");
		p.DlvInstRcptBtn_rcopy.addAllListener(p);
		p.DlvInstRcptBtn_rcopy.setAPMethodName("doDlvInstRcptBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBBP_DlvInstRcptReg p) {
		p.Btn_open_MSBBP1230.addAllListener(p);
		p.Btn_open_MSBBP1230.setAPMethodName("doBtn_open_MSBBP1230");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[SlsStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SlsStsTyp(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Edi(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBBP_DlvInstRcptReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_prms_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dlv_inst_prms_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_compl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_not_edi_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_po_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[Slo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Slo(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[SloRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SloRslt(MSBBP_DlvInstRcptReg p){
		p.columnSloRslt_sls_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_inst_rcpt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SloRslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnSloRslt_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_vmi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.SloRslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_set_itm_grp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.SloRslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.columnSloRslt_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_via_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_day_week_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_dlv_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cststk_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_wg_rqst_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_ship_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_trd_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_intr_d_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.SloRslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_prms_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_alloc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_ret_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_re_ship_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_schd_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_schd_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSloRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSloRslt_slo_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ShipSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipSchd(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipSchdRslt(MSBBP_DlvInstRcptReg p){
		p.columnShipSchdRslt_slo_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipSchdRslt_pr_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pr_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_re_ship_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_not_dt_calc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_block_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_abl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_abort_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_abort_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_slo_prms_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_sls_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnShipSchdRslt_tdlv_req_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.ShipSchdRslt_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipSchdRslt_via_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_day_week_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DlvInstRcpt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvInstRcpt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [UPD]ステータスの[DlvInstRcptRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvInstRcptRslt(MSBBP_DlvInstRcptReg p){
		p.columnDlvInstRcptRslt_slo_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDlvInstRcptRslt_edi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.ENABLE);
		p.columnDlvInstRcptRslt_tdlv_req_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.ENABLE);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_via_dlv_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDlvInstRcptRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_slo_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DlvInstRcptBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DlvInstRcptBtn(MSBBP_DlvInstRcptReg p){
		p.DlvInstRcptBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DlvInstRcptBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DlvInstRcptBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBBP_DlvInstRcptReg p){
		p.Btn_open_MSBBP1230.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[SlsStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SlsStsTyp(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Edi(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBBP_DlvInstRcptReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_prms_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_dlv_inst_prms_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_compl_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_not_edi_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_slo_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_trd_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_cst_po_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[Slo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Slo(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[SloRslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SloRslt(MSBBP_DlvInstRcptReg p){
		p.columnSloRslt_sls_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_inst_rcpt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SloRslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnSloRslt_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_vmi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.SloRslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_set_itm_grp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SloRslt_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.columnSloRslt_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_day_week_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_dlv_day_week_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cststk_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_wg_rqst_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_ship_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.SloRslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_prms_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_alloc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_ret_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_re_ship_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_schd_abort_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_schd_abort_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSloRslt_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSloRslt_slo_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[ShipSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipSchd(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipSchdRslt(MSBBP_DlvInstRcptReg p){
		p.columnShipSchdRslt_slo_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipSchdRslt_pr_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_re_ship_schd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_not_dt_calc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_hm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_block_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_abl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_sls_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_abort_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_slo_prms_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_sls_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnShipSchdRslt_tdlv_req_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ShipSchdRslt_tdlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipSchdRslt_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_day_week_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[DlvInstRcpt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvInstRcpt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [FIX_U]ステータスの[DlvInstRcptRslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvInstRcptRslt(MSBBP_DlvInstRcptReg p){
		p.columnDlvInstRcptRslt_slo_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDlvInstRcptRslt_edi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_dlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnDlvInstRcptRslt_tdlv_req_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_tdlv_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_slo_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[DlvInstRcptBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DlvInstRcptBtn(MSBBP_DlvInstRcptReg p){
		p.DlvInstRcptBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.DlvInstRcptBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.DlvInstRcptBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBBP_DlvInstRcptReg p){
		p.Btn_open_MSBBP1230.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[SlsStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SlsStsTyp(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Edi(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBBP_DlvInstRcptReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_prms_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dlv_inst_prms_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_compl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_edi_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_slo_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_trd_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cst_po_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[Slo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Slo(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[SloRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SloRslt(MSBBP_DlvInstRcptReg p){
		p.columnSloRslt_sls_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_inst_rcpt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SloRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnSloRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_vmi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.SloRslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_set_itm_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SloRslt_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.columnSloRslt_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_day_week_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_dlv_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cststk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_wg_rqst_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_ship_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.SloRslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_prms_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_alloc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_ret_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_re_ship_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_schd_abort_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_schd_abort_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSloRslt_ship_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSloRslt_slo_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[ShipSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipSchd(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipSchdRslt(MSBBP_DlvInstRcptReg p){
		p.columnShipSchdRslt_slo_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipSchdRslt_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_re_ship_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_not_dt_calc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_hm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_block_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_abl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_sls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_abort_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_slo_prms_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_sls_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnShipSchdRslt_tdlv_req_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ShipSchdRslt_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipSchdRslt_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_day_week_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DlvInstRcpt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvInstRcpt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [SRCH]ステータスの[DlvInstRcptRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvInstRcptRslt(MSBBP_DlvInstRcptReg p){
		p.columnDlvInstRcptRslt_slo_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDlvInstRcptRslt_edi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_dlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnDlvInstRcptRslt_tdlv_req_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_tdlv_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_slo_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DlvInstRcptBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DlvInstRcptBtn(MSBBP_DlvInstRcptReg p){
		p.DlvInstRcptBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.DlvInstRcptBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.DlvInstRcptBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBBP_DlvInstRcptReg p){
		p.Btn_open_MSBBP1230.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[SlsStsTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_SlsStsTyp(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF_Edi(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBBP_DlvInstRcptReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prms_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_inst_rcpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dlv_inst_prms_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_compl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_edi_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_edi_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_inst_rcpt_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_ship_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_trd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_po_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_cst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Cnd4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd4(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[Slo]ブロックのモードの設定
	 */
	protected static void statusInitREF_Slo(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[SloRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_SloRslt(MSBBP_DlvInstRcptReg p){
		p.columnSloRslt_sls_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_qtn_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_inst_rcpt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_assort_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.SloRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnSloRslt_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_vmi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.SloRslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_set_itm_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.SloRslt_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.columnSloRslt_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.SloRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_dlv_day_week_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_dlv_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cststk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_inst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_scope_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_rqst_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_wg_rqst_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.SloRslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_ship_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_cst_po_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sls_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_schd_split_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.SloRslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_prms_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_dlv_inst_prms_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_alloc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_iv_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_ret_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_re_ship_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_ship_schd_abort_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.SloRslt_sls_schd_abort_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSloRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSloRslt_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSloRslt_slo_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ShipSchd]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipSchd(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[ShipSchdRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipSchdRslt(MSBBP_DlvInstRcptReg p){
		p.columnShipSchdRslt_slo_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipSchdRslt_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_alloc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_re_ship_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_rqst_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_pd_inst_dlv_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_not_dt_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_wk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_schd_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_block_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_abl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_alloc_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_wait_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_iv_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_sls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_ship_ret_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.ShipSchdRslt_abort_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnShipSchdRslt_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_slo_prms_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_sls_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ShipSchdRslt_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnShipSchdRslt_tdlv_req_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.ShipSchdRslt_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.ShipSchdRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipSchdRslt_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_dlv_day_week_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnShipSchdRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DlvInstRcpt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvInstRcpt(MSBBP_DlvInstRcptReg p){

	}

	/**
	 * [REF]ステータスの[DlvInstRcptRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvInstRcptRslt(MSBBP_DlvInstRcptReg p){
		p.columnDlvInstRcptRslt_slo_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDlvInstRcptRslt_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.DlvInstRcptRslt_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5400.MAUBP_DlvCombo_D.READ_ONLY);
		p.columnDlvInstRcptRslt_tdlv_req_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.DlvInstRcptRslt_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDlvInstRcptRslt_slo_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DlvInstRcptBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DlvInstRcptBtn(MSBBP_DlvInstRcptReg p){
		p.DlvInstRcptBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DlvInstRcptBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DlvInstRcptBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBBP_DlvInstRcptReg p){
		p.Btn_open_MSBBP1230.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
		MSBBP_DlvInstRcptReg_MC.setTableConfigSloRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.setTableConfigShipSchdRslt((MSBBP_DlvInstRcptReg)this);
		MSBBP_DlvInstRcptReg_MC.setTableConfigDlvInstRcptRslt((MSBBP_DlvInstRcptReg)this);
	}

	/**
	 * [SloRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigSloRslt(MSBBP_DlvInstRcptReg p) {
		p.columnSloRslt_sls_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_sts_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_sts_typ);
		p.columnSloRslt_sls_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_sts_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_sts_typ_nm);
		p.columnSloRslt_alloc_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_sts_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_sts_typ);
		p.columnSloRslt_alloc_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_sts_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_sts_typ_nm);
		p.columnSloRslt_trd_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_cd);
		p.columnSloRslt_trd_ptn_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_ptn_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_ptn_typ);
		p.columnSloRslt_trd_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_nm);
		p.columnSloRslt_slo_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_no);
		p.columnSloRslt_slo_rev.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_rev_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_rev);
		p.columnSloRslt_slo_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_typ);
		p.columnSloRslt_slo_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_typ_nm);
		p.columnSloRslt_aprv_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.aprv_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_aprv_flg);
		p.columnSloRslt_aprv_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.aprv_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_aprv_no);
		p.columnSloRslt_aprv_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.aprv_sts_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_aprv_sts_typ);
		p.columnSloRslt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.aprv_sts_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_aprv_sts_typ_nm);
		p.columnSloRslt_qtn_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.qtn_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_qtn_no);
		p.columnSloRslt_qtn_rev.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.qtn_rev_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_qtn_rev);
		p.columnSloRslt_slo_dt.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_dt_META);
		p.columnSloRslt_slo_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_dt);
		p.columnSloRslt_dlv_inst_rcpt_dt.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dlv_inst_rcpt_dt_META);
		p.columnSloRslt_dlv_inst_rcpt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dlv_inst_rcpt_dt);
		p.columnSloRslt_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_cd);
		p.columnSloRslt_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_nm);
		p.columnSloRslt_sls_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_usr_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_usr_cd);
		p.columnSloRslt_sls_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_usr_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_usr_nm);
		p.columnSloRslt_sls_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_dpt_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_dpt_cd);
		p.columnSloRslt_sls_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_dpt_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_dpt_nm);
		p.columnSloRslt_wg_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.wg_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_wg_cd);
		p.columnSloRslt_wg_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.wg_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_wg_nm);
		p.columnSloRslt_assort_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.assort_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_assort_typ);
		p.columnSloRslt_assort_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.assort_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_assort_typ_nm);
		p.columnSloRslt_cst_po_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_po_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_po_no);
		p.columnSloRslt_wrk_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.wrk_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_wrk_no);
		p.columnSloRslt_wrk_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.wrk_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_wrk_nm);
		p.columnSloRslt_trd_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_rmrks);
		p.columnSloRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.intr_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_intr_rmrks);
		p.columnSloRslt_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_d_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_d_no);
		p.columnSloRslt_cst_itm_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_itm_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_itm_cd);
		p.columnSloRslt_cst_itm_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_itm_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_itm_nm);
		p.SloRsltTable.addTable(p.SloRslt_itm_p_PPanel.ItmTable);
		p.columnSloRslt_sundry_itm_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sundry_itm_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sundry_itm_flg);
		p.columnSloRslt_stk_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.stk_mng_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_stk_mng_typ);
		p.columnSloRslt_stk_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.stk_mng_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_stk_mng_typ_nm);
		p.columnSloRslt_asset_mng_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.asset_mng_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_asset_mng_typ);
		p.columnSloRslt_asset_mng_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.asset_mng_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_asset_mng_typ_nm);
		p.columnSloRslt_vmi_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.vmi_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_vmi_flg);
		p.columnSloRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_unit_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_unit_cd);
		p.columnSloRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_unit_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_unit_nm);
		p.columnSloRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_unit_dec_place_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_unit_dec_place);
		p.columnSloRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_unit_conv_base_qty_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_unit_conv_base_qty);
		p.columnSloRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_unit_conv_qty_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_unit_conv_qty);
		p.SloRsltTable.addTable(p.SloRslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnSloRslt_set_itm_grp_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.set_itm_grp_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_set_itm_grp_no);
		p.SloRsltTable.addTable(p.SloRslt_dlv_p_PPanel.DlvTable);
		p.columnSloRslt_dest_cd1.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_cd1_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_cd1);
		p.columnSloRslt_dest_nm1.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_nm1_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_nm1);
		p.columnSloRslt_dest_cd2.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_cd2_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_cd2);
		p.columnSloRslt_dest_nm2.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_nm2_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_nm2);
		p.columnSloRslt_dest_cd3.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_cd3_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_cd3);
		p.columnSloRslt_dest_nm3.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dest_nm3_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dest_nm3);
		p.SloRsltTable.addTable(p.SloRslt_tdlv_p_PPanel.DlvTable);
		p.columnSloRslt_via_dlv_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.via_dlv_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_via_dlv_typ);
		p.columnSloRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.via_dlv_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_via_dlv_typ_nm);
		p.columnSloRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dlv_day_week_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dlv_day_week_typ);
		p.columnSloRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.dlv_day_week_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_dlv_day_week_typ_nm);
		p.columnSloRslt_sls_cststk_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_cststk_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_cststk_flg);
		p.columnSloRslt_proc_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.proc_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_proc_typ);
		p.columnSloRslt_proc_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.proc_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_proc_typ_nm);
		p.columnSloRslt_ship_inst_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_inst_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_inst_typ);
		p.columnSloRslt_ship_inst_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_inst_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_inst_typ_nm);
		p.columnSloRslt_ship_schd_split_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_schd_split_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_schd_split_typ);
		p.columnSloRslt_ship_schd_split_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_schd_split_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_schd_split_typ_nm);
		p.columnSloRslt_alloc_scope_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_scope_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_scope_typ);
		p.columnSloRslt_alloc_scope_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_scope_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_scope_typ_nm);
		p.columnSloRslt_alloc_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_typ);
		p.columnSloRslt_alloc_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_typ_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_typ_nm);
		p.columnSloRslt_rqst_to_loc_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.rqst_to_loc_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_rqst_to_loc_cd);
		p.columnSloRslt_rqst_to_loc_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.rqst_to_loc_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_rqst_to_loc_nm);
		p.columnSloRslt_sppl_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sppl_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sppl_cd);
		p.columnSloRslt_sppl_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sppl_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sppl_nm);
		p.columnSloRslt_maker_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.maker_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_maker_cd);
		p.columnSloRslt_maker_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.maker_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_maker_nm);
		p.columnSloRslt_wg_rqst_cnt_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.wg_rqst_cnt_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_wg_rqst_cnt_rmrks);
		p.columnSloRslt_loc_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.loc_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_loc_cd);
		p.columnSloRslt_loc_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.loc_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_loc_nm);
		p.SloRsltTable.addTable(p.SloRslt_str_ln_p_PPanel.StrLnTable);
		p.columnSloRslt_ship_lg_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_lg_grp_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_lg_grp_cd);
		p.columnSloRslt_ship_lg_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_lg_grp_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_lg_grp_nm);
		p.columnSloRslt_alloc_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_grp_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_grp_cd);
		p.columnSloRslt_alloc_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.alloc_grp_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_alloc_grp_nm);
		p.columnSloRslt_ship_term_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_term_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_term_cd);
		p.columnSloRslt_ship_term_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_term_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_term_nm);
		p.columnSloRslt_ship_cnt_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_cnt_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_cnt_rmrks);
		p.columnSloRslt_cst_po_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_po_d_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_po_d_no);
		p.columnSloRslt_cst_po_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.cst_po_d_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_cst_po_d_rmrks);
		p.columnSloRslt_sls_rsn_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_rsn_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_rsn_cd);
		p.columnSloRslt_sls_rsn_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_rsn_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_rsn_nm);
		p.columnSloRslt_trd_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.trd_d_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_trd_d_rmrks);
		p.columnSloRslt_intr_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.intr_d_rmrks_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_intr_d_rmrks);
		p.columnSloRslt_ship_cmpl_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_cmpl_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_cmpl_flg);
		p.columnSloRslt_sls_cmpl_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sls_cmpl_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sls_cmpl_flg);
		p.columnSloRslt_ship_schd_split_flg.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_schd_split_flg_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_schd_split_flg);
		p.columnSloRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.base_unit_cd_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_base_unit_cd);
		p.columnSloRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.base_unit_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_base_unit_nm);
		p.columnSloRslt_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.base_unit_dec_place_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_base_unit_dec_place);
		p.columnSloRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.base_unit_rnd_typ_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_base_unit_rnd_typ);
		p.SloRsltTable.addTable(p.SloRslt_base_unit_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_prms_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_dlv_inst_rcpt_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_dlv_inst_prms_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_alloc_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_wait_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_ship_inst_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_ship_act_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_iv_schd_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_iv_act_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_sls_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_ship_ret_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_re_ship_schd_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_ship_schd_abort_qty_p_PPanel.QtyTable);
		p.SloRsltTable.addTable(p.SloRslt_sls_schd_abort_qty_p_PPanel.QtyTable);
		p.columnSloRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sub_char1_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sub_char1);
		p.columnSloRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sub_char2_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sub_char2);
		p.columnSloRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.sub_char3_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_sub_char3);
		p.columnSloRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ins_usr_id_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ins_usr_id);
		p.columnSloRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ins_usr_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ins_usr_nm);
		p.columnSloRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ins_func_id_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ins_func_id);
		p.columnSloRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ins_func_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ins_func_nm);
		p.columnSloRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ins_ts_META);
		p.columnSloRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ins_ts);
		p.columnSloRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_usr_id_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_usr_id);
		p.columnSloRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_usr_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_usr_nm);
		p.columnSloRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_func_id_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_func_id);
		p.columnSloRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_func_nm_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_func_nm);
		p.columnSloRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_ts_META);
		p.columnSloRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_ts);
		p.columnSloRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.upd_srv_req_no_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_upd_srv_req_no);
		p.columnSloRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.ship_pr_upd_cntr_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_ship_pr_upd_cntr);
		p.columnSloRslt_slo_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1240.SloRsltR.slo_upd_cntr_META);
		p.SloRsltTable.addColumnConfig(p.columnSloRslt_slo_upd_cntr);
	}

	/**
	 * [ShipSchdRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigShipSchdRslt(MSBBP_DlvInstRcptReg p) {
		p.columnShipSchdRslt_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.slo_d_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_slo_d_no);
		p.columnShipSchdRslt_pr_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.pr_sts_typ_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_pr_sts_typ);
		p.columnShipSchdRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.pr_sts_typ_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_pr_sts_typ_nm);
		p.columnShipSchdRslt_alloc_sts_typ.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.alloc_sts_typ_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_alloc_sts_typ);
		p.columnShipSchdRslt_alloc_sts_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.alloc_sts_typ_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_alloc_sts_typ_nm);
		p.columnShipSchdRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.trd_unit_cd_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_trd_unit_cd);
		p.columnShipSchdRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.trd_unit_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_trd_unit_nm);
		p.columnShipSchdRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.trd_unit_dec_place_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_trd_unit_dec_place);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnShipSchdRslt_fix_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.fix_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_fix_flg);
		p.columnShipSchdRslt_re_ship_schd_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.re_ship_schd_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_re_ship_schd_flg);
		p.columnShipSchdRslt_ship_rqst_dt.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_rqst_dt_META);
		p.columnShipSchdRslt_ship_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_rqst_dt);
		p.columnShipSchdRslt_ship_rqst_hm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_rqst_hm_META);
		p.columnShipSchdRslt_ship_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_rqst_hm);
		p.columnShipSchdRslt_pd_inst_dlv_dt.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.pd_inst_dlv_dt_META);
		p.columnShipSchdRslt_pd_inst_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_pd_inst_dlv_dt);
		p.columnShipSchdRslt_pd_inst_dlv_hm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.pd_inst_dlv_hm_META);
		p.columnShipSchdRslt_pd_inst_dlv_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_pd_inst_dlv_hm);
		p.columnShipSchdRslt_not_dt_calc_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.not_dt_calc_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_not_dt_calc_flg);
		p.columnShipSchdRslt_ship_wk_cd.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_wk_cd_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_wk_cd);
		p.columnShipSchdRslt_ship_wk_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_wk_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_wk_nm);
		p.columnShipSchdRslt_ship_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_schd_dt_META);
		p.columnShipSchdRslt_ship_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_schd_dt);
		p.columnShipSchdRslt_ship_schd_hm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_schd_hm_META);
		p.columnShipSchdRslt_ship_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_schd_hm);
		p.columnShipSchdRslt_dlv_schd_dt.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.dlv_schd_dt_META);
		p.columnShipSchdRslt_dlv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_dlv_schd_dt);
		p.columnShipSchdRslt_dlv_schd_hm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.dlv_schd_hm_META);
		p.columnShipSchdRslt_dlv_schd_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_dlv_schd_hm);
		p.columnShipSchdRslt_ship_block_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_block_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_block_flg);
		p.columnShipSchdRslt_ship_abl_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_abl_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_abl_flg);
		p.columnShipSchdRslt_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_fr_lg_grp_cd_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_fr_lg_grp_cd);
		p.columnShipSchdRslt_ship_fr_lg_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_fr_lg_grp_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_fr_lg_grp_nm);
		p.columnShipSchdRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.base_unit_cd_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_base_unit_cd);
		p.columnShipSchdRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.base_unit_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_base_unit_nm);
		p.columnShipSchdRslt_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.base_unit_dec_place_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_base_unit_dec_place);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_base_unit_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_alloc_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_wait_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_ship_inst_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_ship_act_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_iv_schd_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_iv_act_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_sls_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_ship_ret_qty_p_PPanel.QtyTable);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_abort_qty_p_PPanel.QtyTable);
		p.columnShipSchdRslt_abort_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.abort_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_abort_flg);
		p.columnShipSchdRslt_cmpl_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.cmpl_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_cmpl_flg);
		p.columnShipSchdRslt_ship_term_cd.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_term_cd_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_term_cd);
		p.columnShipSchdRslt_ship_term_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_term_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_term_nm);
		p.columnShipSchdRslt_ship_schd_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ship_schd_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ship_schd_no);
		p.columnShipSchdRslt_dlv_inst_rcpt_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.dlv_inst_rcpt_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_dlv_inst_rcpt_no);
		p.columnShipSchdRslt_slo_prms_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.slo_prms_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_slo_prms_no);
		p.columnShipSchdRslt_sls_act_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.sls_act_d_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_sls_act_d_no);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_dlv_p_PPanel.DlvTable);
		p.columnShipSchdRslt_tdlv_req_flg.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.tdlv_req_flg_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_tdlv_req_flg);
		p.ShipSchdRsltTable.addTable(p.ShipSchdRslt_tdlv_p_PPanel.DlvTable);
		p.columnShipSchdRslt_via_dlv_typ.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.via_dlv_typ_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_via_dlv_typ);
		p.columnShipSchdRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.via_dlv_typ_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_via_dlv_typ_nm);
		p.columnShipSchdRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.dlv_day_week_typ_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_dlv_day_week_typ);
		p.columnShipSchdRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.dlv_day_week_typ_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_dlv_day_week_typ_nm);
		p.columnShipSchdRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ins_usr_id_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ins_usr_id);
		p.columnShipSchdRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ins_usr_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ins_usr_nm);
		p.columnShipSchdRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ins_func_id_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ins_func_id);
		p.columnShipSchdRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ins_func_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ins_func_nm);
		p.columnShipSchdRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.ins_ts_META);
		p.columnShipSchdRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_ins_ts);
		p.columnShipSchdRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_usr_id_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_usr_id);
		p.columnShipSchdRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_usr_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_usr_nm);
		p.columnShipSchdRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_func_id_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_func_id);
		p.columnShipSchdRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_func_nm_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_func_nm);
		p.columnShipSchdRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_ts_META);
		p.columnShipSchdRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_ts);
		p.columnShipSchdRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.upd_srv_req_no_META);
		p.ShipSchdRsltTable.addColumnConfig(p.columnShipSchdRslt_upd_srv_req_no);
	}

	/**
	 * [DlvInstRcptRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigDlvInstRcptRslt(MSBBP_DlvInstRcptReg p) {
		p.columnDlvInstRcptRslt_slo_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.slo_d_no_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_slo_d_no);
		p.columnDlvInstRcptRslt_cst_dlv_inst_no.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.cst_dlv_inst_no_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_cst_dlv_inst_no);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rev.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.cst_dlv_inst_rev_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_cst_dlv_inst_rev);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_no.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.cst_dlv_inst_d_no_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_cst_dlv_inst_d_no);
		p.DlvInstRcptRsltTable.addTable(p.DlvInstRcptRslt_trd_unit_qty_p_PPanel.QtyTable);
		p.DlvInstRcptRsltTable.addTable(p.DlvInstRcptRslt_dlv_rqst_dt_p_PPanel.YmdHmTable);
		p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.cst_dlv_inst_rmrks_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_cst_dlv_inst_rmrks);
		p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.cst_dlv_inst_d_rmrks_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks);
		p.columnDlvInstRcptRslt_intr_rmrks.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.intr_rmrks_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_intr_rmrks);
		p.columnDlvInstRcptRslt_trd_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.trd_unit_cd_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_trd_unit_cd);
		p.columnDlvInstRcptRslt_trd_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.trd_unit_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_trd_unit_nm);
		p.columnDlvInstRcptRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.trd_unit_dec_place_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_trd_unit_dec_place);
		p.columnDlvInstRcptRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.trd_unit_conv_base_qty_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_trd_unit_conv_base_qty);
		p.columnDlvInstRcptRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.trd_unit_conv_qty_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_trd_unit_conv_qty);
		p.columnDlvInstRcptRslt_base_unit_cd.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.base_unit_cd_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_base_unit_cd);
		p.columnDlvInstRcptRslt_base_unit_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.base_unit_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_base_unit_nm);
		p.columnDlvInstRcptRslt_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.base_unit_dec_place_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_base_unit_dec_place);
		p.columnDlvInstRcptRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.base_unit_rnd_typ_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_base_unit_rnd_typ);
		p.DlvInstRcptRsltTable.addTable(p.DlvInstRcptRslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnDlvInstRcptRslt_edi_flg.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.edi_flg_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_edi_flg);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_no.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.dlv_inst_rcpt_no_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_dlv_inst_rcpt_no);
		p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.dlv_inst_rcpt_rev_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_dlv_inst_rcpt_rev);
		p.DlvInstRcptRsltTable.addTable(p.DlvInstRcptRslt_dlv_p_PPanel.DlvTable);
		p.DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnDlvInstRcptRslt_dlv_nm, p.columnDlvInstRcptRslt_dlv_sundry_flg, p.columnDlvInstRcptRslt_pri_prnt_flg, p.columnDlvInstRcptRslt_dlv_zip_cd, p.columnDlvInstRcptRslt_dlv_addr1, p.columnDlvInstRcptRslt_dlv_addr2, p.columnDlvInstRcptRslt_dlv_addr3, p.columnDlvInstRcptRslt_dlv_addr4, p.columnDlvInstRcptRslt_dlv_cntry_cd, p.columnDlvInstRcptRslt_dlv_cntry_nm, p.columnDlvInstRcptRslt_dlv_tel, p.columnDlvInstRcptRslt_dlv_fax, p.columnDlvInstRcptRslt_dlv_cntct_dpt, p.columnDlvInstRcptRslt_dlv_cntct_psn, p.columnDlvInstRcptRslt_dlv_lg_grp_cd, p.columnDlvInstRcptRslt_tdlv_req_flg);
		p.columnDlvInstRcptRslt_tdlv_req_flg.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.tdlv_req_flg_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_tdlv_req_flg);
		p.DlvInstRcptRsltTable.addTable(p.DlvInstRcptRslt_tdlv_p_PPanel.DlvTable);
		p.DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd.setLinkBeans(p.columnDlvInstRcptRslt_tdlv_nm, p.columnDlvInstRcptRslt_tdlv_sundry_flg, p.columnDlvInstRcptRslt_tdlv_cntct_dpt, p.columnDlvInstRcptRslt_tdlv_cntct_psn, p.columnDlvInstRcptRslt_tdlv_zip_cd, p.columnDlvInstRcptRslt_tdlv_addr1, p.columnDlvInstRcptRslt_tdlv_addr2, p.columnDlvInstRcptRslt_tdlv_addr3, p.columnDlvInstRcptRslt_tdlv_addr4, p.columnDlvInstRcptRslt_tdlv_tel, p.columnDlvInstRcptRslt_tdlv_fax, p.columnDlvInstRcptRslt_tdlv_lg_grp_cd, p.columnDlvInstRcptRslt_mst_via_dlv_typ, p.columnDlvInstRcptRslt_tdlv_cntry_cd, p.columnDlvInstRcptRslt_tdlv_cntry_nm);
		p.columnDlvInstRcptRslt_mst_via_dlv_typ.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.mst_via_dlv_typ_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_mst_via_dlv_typ);
		p.columnDlvInstRcptRslt_via_dlv_typ.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.via_dlv_typ_META);
		p.columnDlvInstRcptRslt_via_dlv_typ.addLinkBeans(p.columnDlvInstRcptRslt_via_dlv_typ_nm);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_via_dlv_typ);
		p.columnDlvInstRcptRslt_via_dlv_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.via_dlv_typ_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_via_dlv_typ_nm);
		p.columnDlvInstRcptRslt_dlv_day_week_typ.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.dlv_day_week_typ_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_dlv_day_week_typ);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.dlv_day_week_typ_nm_META);
		p.columnDlvInstRcptRslt_dlv_day_week_typ_nm.addLinkBeans(p.columnDlvInstRcptRslt_dlv_day_week_typ);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_dlv_day_week_typ_nm);
		p.columnDlvInstRcptRslt_sub_char1.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.sub_char1_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_sub_char1);
		p.columnDlvInstRcptRslt_sub_char2.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.sub_char2_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_sub_char2);
		p.columnDlvInstRcptRslt_sub_char3.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.sub_char3_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_sub_char3);
		p.columnDlvInstRcptRslt_ins_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ins_usr_id_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ins_usr_id);
		p.columnDlvInstRcptRslt_ins_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ins_usr_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ins_usr_nm);
		p.columnDlvInstRcptRslt_ins_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ins_func_id_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ins_func_id);
		p.columnDlvInstRcptRslt_ins_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ins_func_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ins_func_nm);
		p.columnDlvInstRcptRslt_ins_ts.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ins_ts_META);
		p.columnDlvInstRcptRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ins_ts);
		p.columnDlvInstRcptRslt_upd_usr_id.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_usr_id_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_usr_id);
		p.columnDlvInstRcptRslt_upd_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_usr_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_usr_nm);
		p.columnDlvInstRcptRslt_upd_func_id.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_func_id_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_func_id);
		p.columnDlvInstRcptRslt_upd_func_nm.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_func_nm_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_func_nm);
		p.columnDlvInstRcptRslt_upd_ts.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_ts_META);
		p.columnDlvInstRcptRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_ts);
		p.columnDlvInstRcptRslt_upd_srv_req_no.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.upd_srv_req_no_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_upd_srv_req_no);
		p.columnDlvInstRcptRslt_ship_pr_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.ship_pr_upd_cntr_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_ship_pr_upd_cntr);
		p.columnDlvInstRcptRslt_slo_upd_cntr.setMeta(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.slo_upd_cntr_META);
		p.DlvInstRcptRsltTable.addColumnConfig(p.columnDlvInstRcptRslt_slo_upd_cntr);
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
		Cnd_cst_nm.getListConfig().setPutter(getCnd_cst_nm_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dlv_nm.getListConfig().setPutter(getCnd_dlv_nm_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_nm1.getListConfig().setPutter(getCnd_dest_nm1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_nm2.getListConfig().setPutter(getCnd_dest_nm2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_dest_nm3.getListConfig().setPutter(getCnd_dest_nm3_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_tdlv_nm.getListConfig().setPutter(getCnd_tdlv_nm_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		columnShipSchdRslt_via_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnShipSchdRslt_via_dlv_typ.getListConfig().setPutter(getShipSchdRslt_via_dlv_typ_ListPutter());
		columnShipSchdRslt_dlv_day_week_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnShipSchdRslt_dlv_day_week_typ_nm.getListConfig().setPutter(getShipSchdRslt_dlv_day_week_typ_nm_ListPutter());
		DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter());
		DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd.getListConfig().setPutter(getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter());
		columnDlvInstRcptRslt_via_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDlvInstRcptRslt_via_dlv_typ.getListConfig().setPutter(getDlvInstRcptRslt_via_dlv_typ_ListPutter());
		columnDlvInstRcptRslt_dlv_day_week_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDlvInstRcptRslt_dlv_day_week_typ_nm.getListConfig().setPutter(getDlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter());
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
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
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
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_cst_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_dlv_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_dest_nm1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_nm1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_dest_nm2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_nm2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_dest_nm3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_nm3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [Cnd_tdlv_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tdlv_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
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
	 * [ShipSchdRslt_via_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createShipSchdRslt_via_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ShipSchdRslt_dlv_day_week_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createShipSchdRslt_dlv_day_week_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	/**
	 * [DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}

	/**
	 * [DlvInstRcptRslt_via_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDlvInstRcptRslt_via_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ViaDlvTyp");
		return lp;
	}
	 
	/**
	 * [DlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createDlvInstRcptRslt_dlv_day_week_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DayWeekTyp");
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
		if(combo == Cnd_cst_nm) return getCnd_cst_nm(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dlv_nm) return getCnd_dlv_nm(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_nm1) return getCnd_dest_nm1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_nm2) return getCnd_dest_nm2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_dest_nm3) return getCnd_dest_nm3(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_tdlv_nm) return getCnd_tdlv_nm(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == columnShipSchdRslt_via_dlv_typ) return getShipSchdRslt_via_dlv_typ(row, info);
		if(combo == columnShipSchdRslt_dlv_day_week_typ_nm) return getShipSchdRslt_dlv_day_week_typ_nm(row, info);
		if(combo == DlvInstRcptRslt_dlv_p_PPanel.columnDlv_bp_cd) return getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd(row, info);
		if(combo == DlvInstRcptRslt_tdlv_p_PPanel.columnDlv_bp_cd) return getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd(row, info);
		if(combo == columnDlvInstRcptRslt_via_dlv_typ) return getDlvInstRcptRslt_via_dlv_typ(row, info);
		if(combo == columnDlvInstRcptRslt_dlv_day_week_typ_nm) return getDlvInstRcptRslt_dlv_day_week_typ_nm(row, info);
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
		else if (ap == DlvInstRcptBtn_radd) doDlvInstRcptBtn_radd(info);
		else if (ap == DlvInstRcptBtn_rdel) doDlvInstRcptBtn_rdel(info);
		else if (ap == DlvInstRcptBtn_rcopy) doDlvInstRcptBtn_rcopy(info);
		else if (ap == Btn_open_MSBBP1230) doBtn_open_MSBBP1230(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DlvInstRcptBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDlvInstRcptBtn_radd(MCEventInfo info);

	/**
	 * [DlvInstRcptBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDlvInstRcptBtn_rdel(MCEventInfo info);

	/**
	 * [DlvInstRcptBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDlvInstRcptBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1230]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1230(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == SloRsltTable) return doSloRslt_VC(info);
		if (vc == ShipSchdRsltTable) return doShipSchdRslt_VC(info);
		if (vc == DlvInstRcptRsltTable) return doDlvInstRcptRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_slo_flg) return doCnd_slo_flg_VC(info);
		if (vc == Cnd_prms_flg) return doCnd_prms_flg_VC(info);
		if (vc == Cnd_dlv_inst_rcpt_flg) return doCnd_dlv_inst_rcpt_flg_VC(info);
		if (vc == Cnd_dlv_inst_prms_flg) return doCnd_dlv_inst_prms_flg_VC(info);
		if (vc == Cnd_sls_flg) return doCnd_sls_flg_VC(info);
		if (vc == Cnd_ship_flg) return doCnd_ship_flg_VC(info);
		if (vc == Cnd_compl_flg) return doCnd_compl_flg_VC(info);
		if (vc == Cnd_edi_flg) return doCnd_edi_flg_VC(info);
		if (vc == Cnd_not_edi_flg) return doCnd_not_edi_flg_VC(info);
		if (vc == Cnd_slo_dt_fr) return doCnd_slo_dt_fr_VC(info);
		if (vc == Cnd_slo_dt_to) return doCnd_slo_dt_to_VC(info);
		if (vc == Cnd_dlv_inst_rcpt_dt_fr) return doCnd_dlv_inst_rcpt_dt_fr_VC(info);
		if (vc == Cnd_dlv_inst_rcpt_dt_to) return doCnd_dlv_inst_rcpt_dt_to_VC(info);
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
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_cst_po_no) return doCnd_cst_po_no_VC(info);
		if (vc == Cnd_cst_po_d_no) return doCnd_cst_po_d_no_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_wg_rqst_cnt_rmrks) return doCnd_wg_rqst_cnt_rmrks_VC(info);
		if (vc == Cnd_ship_cnt_rmrks) return doCnd_ship_cnt_rmrks_VC(info);
		if (vc == Cnd_cst_po_d_rmrks) return doCnd_cst_po_d_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnSloRslt_sls_sts_typ) return doSloRslt_sls_sts_typ_VC(info);
		if (vc == columnSloRslt_sls_sts_typ_nm) return doSloRslt_sls_sts_typ_nm_VC(info);
		if (vc == columnSloRslt_alloc_sts_typ) return doSloRslt_alloc_sts_typ_VC(info);
		if (vc == columnSloRslt_alloc_sts_typ_nm) return doSloRslt_alloc_sts_typ_nm_VC(info);
		if (vc == columnSloRslt_trd_cd) return doSloRslt_trd_cd_VC(info);
		if (vc == columnSloRslt_trd_ptn_typ) return doSloRslt_trd_ptn_typ_VC(info);
		if (vc == columnSloRslt_trd_nm) return doSloRslt_trd_nm_VC(info);
		if (vc == columnSloRslt_slo_no) return doSloRslt_slo_no_VC(info);
		if (vc == columnSloRslt_slo_rev) return doSloRslt_slo_rev_VC(info);
		if (vc == columnSloRslt_slo_typ) return doSloRslt_slo_typ_VC(info);
		if (vc == columnSloRslt_slo_typ_nm) return doSloRslt_slo_typ_nm_VC(info);
		if (vc == columnSloRslt_aprv_flg) return doSloRslt_aprv_flg_VC(info);
		if (vc == columnSloRslt_aprv_no) return doSloRslt_aprv_no_VC(info);
		if (vc == columnSloRslt_aprv_sts_typ) return doSloRslt_aprv_sts_typ_VC(info);
		if (vc == columnSloRslt_aprv_sts_typ_nm) return doSloRslt_aprv_sts_typ_nm_VC(info);
		if (vc == columnSloRslt_qtn_no) return doSloRslt_qtn_no_VC(info);
		if (vc == columnSloRslt_qtn_rev) return doSloRslt_qtn_rev_VC(info);
		if (vc == columnSloRslt_slo_dt) return doSloRslt_slo_dt_VC(info);
		if (vc == columnSloRslt_dlv_inst_rcpt_dt) return doSloRslt_dlv_inst_rcpt_dt_VC(info);
		if (vc == columnSloRslt_cst_cd) return doSloRslt_cst_cd_VC(info);
		if (vc == columnSloRslt_cst_nm) return doSloRslt_cst_nm_VC(info);
		if (vc == columnSloRslt_sls_usr_cd) return doSloRslt_sls_usr_cd_VC(info);
		if (vc == columnSloRslt_sls_usr_nm) return doSloRslt_sls_usr_nm_VC(info);
		if (vc == columnSloRslt_sls_dpt_cd) return doSloRslt_sls_dpt_cd_VC(info);
		if (vc == columnSloRslt_sls_dpt_nm) return doSloRslt_sls_dpt_nm_VC(info);
		if (vc == columnSloRslt_wg_cd) return doSloRslt_wg_cd_VC(info);
		if (vc == columnSloRslt_wg_nm) return doSloRslt_wg_nm_VC(info);
		if (vc == columnSloRslt_assort_typ) return doSloRslt_assort_typ_VC(info);
		if (vc == columnSloRslt_assort_typ_nm) return doSloRslt_assort_typ_nm_VC(info);
		if (vc == columnSloRslt_cst_po_no) return doSloRslt_cst_po_no_VC(info);
		if (vc == columnSloRslt_wrk_no) return doSloRslt_wrk_no_VC(info);
		if (vc == columnSloRslt_wrk_nm) return doSloRslt_wrk_nm_VC(info);
		if (vc == columnSloRslt_trd_rmrks) return doSloRslt_trd_rmrks_VC(info);
		if (vc == columnSloRslt_intr_rmrks) return doSloRslt_intr_rmrks_VC(info);
		if (vc == columnSloRslt_slo_d_no) return doSloRslt_slo_d_no_VC(info);
		if (vc == columnSloRslt_cst_itm_cd) return doSloRslt_cst_itm_cd_VC(info);
		if (vc == columnSloRslt_cst_itm_nm) return doSloRslt_cst_itm_nm_VC(info);
		if (vc == columnSloRslt_sundry_itm_flg) return doSloRslt_sundry_itm_flg_VC(info);
		if (vc == columnSloRslt_stk_mng_typ) return doSloRslt_stk_mng_typ_VC(info);
		if (vc == columnSloRslt_stk_mng_typ_nm) return doSloRslt_stk_mng_typ_nm_VC(info);
		if (vc == columnSloRslt_asset_mng_typ) return doSloRslt_asset_mng_typ_VC(info);
		if (vc == columnSloRslt_asset_mng_typ_nm) return doSloRslt_asset_mng_typ_nm_VC(info);
		if (vc == columnSloRslt_vmi_flg) return doSloRslt_vmi_flg_VC(info);
		if (vc == columnSloRslt_trd_unit_cd) return doSloRslt_trd_unit_cd_VC(info);
		if (vc == columnSloRslt_trd_unit_nm) return doSloRslt_trd_unit_nm_VC(info);
		if (vc == columnSloRslt_trd_unit_dec_place) return doSloRslt_trd_unit_dec_place_VC(info);
		if (vc == columnSloRslt_trd_unit_conv_base_qty) return doSloRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnSloRslt_trd_unit_conv_qty) return doSloRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnSloRslt_set_itm_grp_no) return doSloRslt_set_itm_grp_no_VC(info);
		if (vc == columnSloRslt_dest_cd1) return doSloRslt_dest_cd1_VC(info);
		if (vc == columnSloRslt_dest_nm1) return doSloRslt_dest_nm1_VC(info);
		if (vc == columnSloRslt_dest_cd2) return doSloRslt_dest_cd2_VC(info);
		if (vc == columnSloRslt_dest_nm2) return doSloRslt_dest_nm2_VC(info);
		if (vc == columnSloRslt_dest_cd3) return doSloRslt_dest_cd3_VC(info);
		if (vc == columnSloRslt_dest_nm3) return doSloRslt_dest_nm3_VC(info);
		if (vc == columnSloRslt_via_dlv_typ) return doSloRslt_via_dlv_typ_VC(info);
		if (vc == columnSloRslt_via_dlv_typ_nm) return doSloRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnSloRslt_dlv_day_week_typ) return doSloRslt_dlv_day_week_typ_VC(info);
		if (vc == columnSloRslt_dlv_day_week_typ_nm) return doSloRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnSloRslt_sls_cststk_flg) return doSloRslt_sls_cststk_flg_VC(info);
		if (vc == columnSloRslt_proc_typ) return doSloRslt_proc_typ_VC(info);
		if (vc == columnSloRslt_proc_typ_nm) return doSloRslt_proc_typ_nm_VC(info);
		if (vc == columnSloRslt_ship_inst_typ) return doSloRslt_ship_inst_typ_VC(info);
		if (vc == columnSloRslt_ship_inst_typ_nm) return doSloRslt_ship_inst_typ_nm_VC(info);
		if (vc == columnSloRslt_ship_schd_split_typ) return doSloRslt_ship_schd_split_typ_VC(info);
		if (vc == columnSloRslt_ship_schd_split_typ_nm) return doSloRslt_ship_schd_split_typ_nm_VC(info);
		if (vc == columnSloRslt_alloc_scope_typ) return doSloRslt_alloc_scope_typ_VC(info);
		if (vc == columnSloRslt_alloc_scope_typ_nm) return doSloRslt_alloc_scope_typ_nm_VC(info);
		if (vc == columnSloRslt_alloc_typ) return doSloRslt_alloc_typ_VC(info);
		if (vc == columnSloRslt_alloc_typ_nm) return doSloRslt_alloc_typ_nm_VC(info);
		if (vc == columnSloRslt_rqst_to_loc_cd) return doSloRslt_rqst_to_loc_cd_VC(info);
		if (vc == columnSloRslt_rqst_to_loc_nm) return doSloRslt_rqst_to_loc_nm_VC(info);
		if (vc == columnSloRslt_sppl_cd) return doSloRslt_sppl_cd_VC(info);
		if (vc == columnSloRslt_sppl_nm) return doSloRslt_sppl_nm_VC(info);
		if (vc == columnSloRslt_maker_cd) return doSloRslt_maker_cd_VC(info);
		if (vc == columnSloRslt_maker_nm) return doSloRslt_maker_nm_VC(info);
		if (vc == columnSloRslt_wg_rqst_cnt_rmrks) return doSloRslt_wg_rqst_cnt_rmrks_VC(info);
		if (vc == columnSloRslt_loc_cd) return doSloRslt_loc_cd_VC(info);
		if (vc == columnSloRslt_loc_nm) return doSloRslt_loc_nm_VC(info);
		if (vc == columnSloRslt_ship_lg_grp_cd) return doSloRslt_ship_lg_grp_cd_VC(info);
		if (vc == columnSloRslt_ship_lg_grp_nm) return doSloRslt_ship_lg_grp_nm_VC(info);
		if (vc == columnSloRslt_alloc_grp_cd) return doSloRslt_alloc_grp_cd_VC(info);
		if (vc == columnSloRslt_alloc_grp_nm) return doSloRslt_alloc_grp_nm_VC(info);
		if (vc == columnSloRslt_ship_term_cd) return doSloRslt_ship_term_cd_VC(info);
		if (vc == columnSloRslt_ship_term_nm) return doSloRslt_ship_term_nm_VC(info);
		if (vc == columnSloRslt_ship_cnt_rmrks) return doSloRslt_ship_cnt_rmrks_VC(info);
		if (vc == columnSloRslt_cst_po_d_no) return doSloRslt_cst_po_d_no_VC(info);
		if (vc == columnSloRslt_cst_po_d_rmrks) return doSloRslt_cst_po_d_rmrks_VC(info);
		if (vc == columnSloRslt_sls_rsn_cd) return doSloRslt_sls_rsn_cd_VC(info);
		if (vc == columnSloRslt_sls_rsn_nm) return doSloRslt_sls_rsn_nm_VC(info);
		if (vc == columnSloRslt_trd_d_rmrks) return doSloRslt_trd_d_rmrks_VC(info);
		if (vc == columnSloRslt_intr_d_rmrks) return doSloRslt_intr_d_rmrks_VC(info);
		if (vc == columnSloRslt_ship_cmpl_flg) return doSloRslt_ship_cmpl_flg_VC(info);
		if (vc == columnSloRslt_sls_cmpl_flg) return doSloRslt_sls_cmpl_flg_VC(info);
		if (vc == columnSloRslt_ship_schd_split_flg) return doSloRslt_ship_schd_split_flg_VC(info);
		if (vc == columnSloRslt_base_unit_cd) return doSloRslt_base_unit_cd_VC(info);
		if (vc == columnSloRslt_base_unit_nm) return doSloRslt_base_unit_nm_VC(info);
		if (vc == columnSloRslt_base_unit_dec_place) return doSloRslt_base_unit_dec_place_VC(info);
		if (vc == columnSloRslt_base_unit_rnd_typ) return doSloRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnSloRslt_sub_char1) return doSloRslt_sub_char1_VC(info);
		if (vc == columnSloRslt_sub_char2) return doSloRslt_sub_char2_VC(info);
		if (vc == columnSloRslt_sub_char3) return doSloRslt_sub_char3_VC(info);
		if (vc == columnSloRslt_ins_usr_id) return doSloRslt_ins_usr_id_VC(info);
		if (vc == columnSloRslt_ins_usr_nm) return doSloRslt_ins_usr_nm_VC(info);
		if (vc == columnSloRslt_ins_func_id) return doSloRslt_ins_func_id_VC(info);
		if (vc == columnSloRslt_ins_func_nm) return doSloRslt_ins_func_nm_VC(info);
		if (vc == columnSloRslt_ins_ts) return doSloRslt_ins_ts_VC(info);
		if (vc == columnSloRslt_upd_usr_id) return doSloRslt_upd_usr_id_VC(info);
		if (vc == columnSloRslt_upd_usr_nm) return doSloRslt_upd_usr_nm_VC(info);
		if (vc == columnSloRslt_upd_func_id) return doSloRslt_upd_func_id_VC(info);
		if (vc == columnSloRslt_upd_func_nm) return doSloRslt_upd_func_nm_VC(info);
		if (vc == columnSloRslt_upd_ts) return doSloRslt_upd_ts_VC(info);
		if (vc == columnSloRslt_upd_srv_req_no) return doSloRslt_upd_srv_req_no_VC(info);
		if (vc == columnSloRslt_ship_pr_upd_cntr) return doSloRslt_ship_pr_upd_cntr_VC(info);
		if (vc == columnSloRslt_slo_upd_cntr) return doSloRslt_slo_upd_cntr_VC(info);
		if (vc == columnShipSchdRslt_slo_d_no) return doShipSchdRslt_slo_d_no_VC(info);
		if (vc == columnShipSchdRslt_pr_sts_typ) return doShipSchdRslt_pr_sts_typ_VC(info);
		if (vc == columnShipSchdRslt_pr_sts_typ_nm) return doShipSchdRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnShipSchdRslt_alloc_sts_typ) return doShipSchdRslt_alloc_sts_typ_VC(info);
		if (vc == columnShipSchdRslt_alloc_sts_typ_nm) return doShipSchdRslt_alloc_sts_typ_nm_VC(info);
		if (vc == columnShipSchdRslt_trd_unit_cd) return doShipSchdRslt_trd_unit_cd_VC(info);
		if (vc == columnShipSchdRslt_trd_unit_nm) return doShipSchdRslt_trd_unit_nm_VC(info);
		if (vc == columnShipSchdRslt_trd_unit_dec_place) return doShipSchdRslt_trd_unit_dec_place_VC(info);
		if (vc == columnShipSchdRslt_fix_flg) return doShipSchdRslt_fix_flg_VC(info);
		if (vc == columnShipSchdRslt_re_ship_schd_flg) return doShipSchdRslt_re_ship_schd_flg_VC(info);
		if (vc == columnShipSchdRslt_ship_rqst_dt) return doShipSchdRslt_ship_rqst_dt_VC(info);
		if (vc == columnShipSchdRslt_ship_rqst_hm) return doShipSchdRslt_ship_rqst_hm_VC(info);
		if (vc == columnShipSchdRslt_pd_inst_dlv_dt) return doShipSchdRslt_pd_inst_dlv_dt_VC(info);
		if (vc == columnShipSchdRslt_pd_inst_dlv_hm) return doShipSchdRslt_pd_inst_dlv_hm_VC(info);
		if (vc == columnShipSchdRslt_not_dt_calc_flg) return doShipSchdRslt_not_dt_calc_flg_VC(info);
		if (vc == columnShipSchdRslt_ship_wk_cd) return doShipSchdRslt_ship_wk_cd_VC(info);
		if (vc == columnShipSchdRslt_ship_wk_nm) return doShipSchdRslt_ship_wk_nm_VC(info);
		if (vc == columnShipSchdRslt_ship_schd_dt) return doShipSchdRslt_ship_schd_dt_VC(info);
		if (vc == columnShipSchdRslt_ship_schd_hm) return doShipSchdRslt_ship_schd_hm_VC(info);
		if (vc == columnShipSchdRslt_dlv_schd_dt) return doShipSchdRslt_dlv_schd_dt_VC(info);
		if (vc == columnShipSchdRslt_dlv_schd_hm) return doShipSchdRslt_dlv_schd_hm_VC(info);
		if (vc == columnShipSchdRslt_ship_block_flg) return doShipSchdRslt_ship_block_flg_VC(info);
		if (vc == columnShipSchdRslt_ship_abl_flg) return doShipSchdRslt_ship_abl_flg_VC(info);
		if (vc == columnShipSchdRslt_ship_fr_lg_grp_cd) return doShipSchdRslt_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnShipSchdRslt_ship_fr_lg_grp_nm) return doShipSchdRslt_ship_fr_lg_grp_nm_VC(info);
		if (vc == columnShipSchdRslt_base_unit_cd) return doShipSchdRslt_base_unit_cd_VC(info);
		if (vc == columnShipSchdRslt_base_unit_nm) return doShipSchdRslt_base_unit_nm_VC(info);
		if (vc == columnShipSchdRslt_base_unit_dec_place) return doShipSchdRslt_base_unit_dec_place_VC(info);
		if (vc == columnShipSchdRslt_abort_flg) return doShipSchdRslt_abort_flg_VC(info);
		if (vc == columnShipSchdRslt_cmpl_flg) return doShipSchdRslt_cmpl_flg_VC(info);
		if (vc == columnShipSchdRslt_ship_term_cd) return doShipSchdRslt_ship_term_cd_VC(info);
		if (vc == columnShipSchdRslt_ship_term_nm) return doShipSchdRslt_ship_term_nm_VC(info);
		if (vc == columnShipSchdRslt_ship_schd_no) return doShipSchdRslt_ship_schd_no_VC(info);
		if (vc == columnShipSchdRslt_dlv_inst_rcpt_no) return doShipSchdRslt_dlv_inst_rcpt_no_VC(info);
		if (vc == columnShipSchdRslt_slo_prms_no) return doShipSchdRslt_slo_prms_no_VC(info);
		if (vc == columnShipSchdRslt_sls_act_d_no) return doShipSchdRslt_sls_act_d_no_VC(info);
		if (vc == columnShipSchdRslt_tdlv_req_flg) return doShipSchdRslt_tdlv_req_flg_VC(info);
		if (vc == columnShipSchdRslt_via_dlv_typ) return doShipSchdRslt_via_dlv_typ_VC(info);
		if (vc == columnShipSchdRslt_via_dlv_typ_nm) return doShipSchdRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnShipSchdRslt_dlv_day_week_typ) return doShipSchdRslt_dlv_day_week_typ_VC(info);
		if (vc == columnShipSchdRslt_dlv_day_week_typ_nm) return doShipSchdRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnShipSchdRslt_ins_usr_id) return doShipSchdRslt_ins_usr_id_VC(info);
		if (vc == columnShipSchdRslt_ins_usr_nm) return doShipSchdRslt_ins_usr_nm_VC(info);
		if (vc == columnShipSchdRslt_ins_func_id) return doShipSchdRslt_ins_func_id_VC(info);
		if (vc == columnShipSchdRslt_ins_func_nm) return doShipSchdRslt_ins_func_nm_VC(info);
		if (vc == columnShipSchdRslt_ins_ts) return doShipSchdRslt_ins_ts_VC(info);
		if (vc == columnShipSchdRslt_upd_usr_id) return doShipSchdRslt_upd_usr_id_VC(info);
		if (vc == columnShipSchdRslt_upd_usr_nm) return doShipSchdRslt_upd_usr_nm_VC(info);
		if (vc == columnShipSchdRslt_upd_func_id) return doShipSchdRslt_upd_func_id_VC(info);
		if (vc == columnShipSchdRslt_upd_func_nm) return doShipSchdRslt_upd_func_nm_VC(info);
		if (vc == columnShipSchdRslt_upd_ts) return doShipSchdRslt_upd_ts_VC(info);
		if (vc == columnShipSchdRslt_upd_srv_req_no) return doShipSchdRslt_upd_srv_req_no_VC(info);
		if (vc == columnDlvInstRcptRslt_slo_d_no) return doDlvInstRcptRslt_slo_d_no_VC(info);
		if (vc == columnDlvInstRcptRslt_cst_dlv_inst_no) return doDlvInstRcptRslt_cst_dlv_inst_no_VC(info);
		if (vc == columnDlvInstRcptRslt_cst_dlv_inst_rev) return doDlvInstRcptRslt_cst_dlv_inst_rev_VC(info);
		if (vc == columnDlvInstRcptRslt_cst_dlv_inst_d_no) return doDlvInstRcptRslt_cst_dlv_inst_d_no_VC(info);
		if (vc == columnDlvInstRcptRslt_cst_dlv_inst_rmrks) return doDlvInstRcptRslt_cst_dlv_inst_rmrks_VC(info);
		if (vc == columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks) return doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_VC(info);
		if (vc == columnDlvInstRcptRslt_intr_rmrks) return doDlvInstRcptRslt_intr_rmrks_VC(info);
		if (vc == columnDlvInstRcptRslt_trd_unit_cd) return doDlvInstRcptRslt_trd_unit_cd_VC(info);
		if (vc == columnDlvInstRcptRslt_trd_unit_nm) return doDlvInstRcptRslt_trd_unit_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_trd_unit_dec_place) return doDlvInstRcptRslt_trd_unit_dec_place_VC(info);
		if (vc == columnDlvInstRcptRslt_trd_unit_conv_base_qty) return doDlvInstRcptRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDlvInstRcptRslt_trd_unit_conv_qty) return doDlvInstRcptRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnDlvInstRcptRslt_base_unit_cd) return doDlvInstRcptRslt_base_unit_cd_VC(info);
		if (vc == columnDlvInstRcptRslt_base_unit_nm) return doDlvInstRcptRslt_base_unit_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_base_unit_dec_place) return doDlvInstRcptRslt_base_unit_dec_place_VC(info);
		if (vc == columnDlvInstRcptRslt_base_unit_rnd_typ) return doDlvInstRcptRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnDlvInstRcptRslt_edi_flg) return doDlvInstRcptRslt_edi_flg_VC(info);
		if (vc == columnDlvInstRcptRslt_dlv_inst_rcpt_no) return doDlvInstRcptRslt_dlv_inst_rcpt_no_VC(info);
		if (vc == columnDlvInstRcptRslt_dlv_inst_rcpt_rev) return doDlvInstRcptRslt_dlv_inst_rcpt_rev_VC(info);
		if (vc == columnDlvInstRcptRslt_tdlv_req_flg) return doDlvInstRcptRslt_tdlv_req_flg_VC(info);
		if (vc == columnDlvInstRcptRslt_mst_via_dlv_typ) return doDlvInstRcptRslt_mst_via_dlv_typ_VC(info);
		if (vc == columnDlvInstRcptRslt_via_dlv_typ) return doDlvInstRcptRslt_via_dlv_typ_VC(info);
		if (vc == columnDlvInstRcptRslt_via_dlv_typ_nm) return doDlvInstRcptRslt_via_dlv_typ_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_dlv_day_week_typ) return doDlvInstRcptRslt_dlv_day_week_typ_VC(info);
		if (vc == columnDlvInstRcptRslt_dlv_day_week_typ_nm) return doDlvInstRcptRslt_dlv_day_week_typ_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_sub_char1) return doDlvInstRcptRslt_sub_char1_VC(info);
		if (vc == columnDlvInstRcptRslt_sub_char2) return doDlvInstRcptRslt_sub_char2_VC(info);
		if (vc == columnDlvInstRcptRslt_sub_char3) return doDlvInstRcptRslt_sub_char3_VC(info);
		if (vc == columnDlvInstRcptRslt_ins_usr_id) return doDlvInstRcptRslt_ins_usr_id_VC(info);
		if (vc == columnDlvInstRcptRslt_ins_usr_nm) return doDlvInstRcptRslt_ins_usr_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_ins_func_id) return doDlvInstRcptRslt_ins_func_id_VC(info);
		if (vc == columnDlvInstRcptRslt_ins_func_nm) return doDlvInstRcptRslt_ins_func_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_ins_ts) return doDlvInstRcptRslt_ins_ts_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_usr_id) return doDlvInstRcptRslt_upd_usr_id_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_usr_nm) return doDlvInstRcptRslt_upd_usr_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_func_id) return doDlvInstRcptRslt_upd_func_id_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_func_nm) return doDlvInstRcptRslt_upd_func_nm_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_ts) return doDlvInstRcptRslt_upd_ts_VC(info);
		if (vc == columnDlvInstRcptRslt_upd_srv_req_no) return doDlvInstRcptRslt_upd_srv_req_no_VC(info);
		if (vc == columnDlvInstRcptRslt_ship_pr_upd_cntr) return doDlvInstRcptRslt_ship_pr_upd_cntr_VC(info);
		if (vc == columnDlvInstRcptRslt_slo_upd_cntr) return doDlvInstRcptRslt_slo_upd_cntr_VC(info);
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
	 * [SloRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_rcpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_prms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[compl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_compl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_rcpt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_inst_rcpt_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_po_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_po_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [SloRslt]パネルの[sls_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[qtn_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_qtn_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[qtn_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_qtn_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dlv_inst_rcpt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dlv_inst_rcpt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[assort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_assort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[assort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_assort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[vmi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_vmi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_set_itm_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dlv_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_dlv_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_cststk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_inst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_schd_split_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_schd_split_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_scope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_rqst_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_rqst_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[wg_rqst_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_wg_rqst_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_cst_po_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sls_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sls_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_schd_split_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloRslt]パネルの[slo_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloRslt_slo_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_alloc_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[re_ship_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_re_ship_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_rqst_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_pd_inst_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_pd_inst_dlv_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[not_dt_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_not_dt_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_schd_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_block_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_block_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_abl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_abl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_inst_rcpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_prms_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_slo_prms_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[sls_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_sls_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[tdlv_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_tdlv_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_dlv_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doShipSchdRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_cst_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_cst_dlv_inst_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_cst_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_cst_dlv_inst_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_dlv_inst_rcpt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_dlv_inst_rcpt_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[tdlv_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_tdlv_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[mst_via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_mst_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_dlv_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_dlv_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ship_pr_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_ship_pr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlvInstRcptRslt_slo_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == SloRsltTable) doSloRslt_NC(info);
		else if (nc == ShipSchdRsltTable) doShipSchdRslt_NC(info);
		else if (nc == DlvInstRcptRsltTable) doDlvInstRcptRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_slo_flg) doCnd_slo_flg_NC(info);
		else if (nc == Cnd_prms_flg) doCnd_prms_flg_NC(info);
		else if (nc == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NC(info);
		else if (nc == Cnd_dlv_inst_prms_flg) doCnd_dlv_inst_prms_flg_NC(info);
		else if (nc == Cnd_sls_flg) doCnd_sls_flg_NC(info);
		else if (nc == Cnd_ship_flg) doCnd_ship_flg_NC(info);
		else if (nc == Cnd_compl_flg) doCnd_compl_flg_NC(info);
		else if (nc == Cnd_edi_flg) doCnd_edi_flg_NC(info);
		else if (nc == Cnd_not_edi_flg) doCnd_not_edi_flg_NC(info);
		else if (nc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NC(info);
		else if (nc == Cnd_slo_dt_to) doCnd_slo_dt_to_NC(info);
		else if (nc == Cnd_dlv_inst_rcpt_dt_fr) doCnd_dlv_inst_rcpt_dt_fr_NC(info);
		else if (nc == Cnd_dlv_inst_rcpt_dt_to) doCnd_dlv_inst_rcpt_dt_to_NC(info);
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
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_cst_po_no) doCnd_cst_po_no_NC(info);
		else if (nc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NC(info);
		else if (nc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NC(info);
		else if (nc == Cnd_cst_po_d_rmrks) doCnd_cst_po_d_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnSloRslt_sls_sts_typ) doSloRslt_sls_sts_typ_NC(info);
		else if (nc == columnSloRslt_sls_sts_typ_nm) doSloRslt_sls_sts_typ_nm_NC(info);
		else if (nc == columnSloRslt_alloc_sts_typ) doSloRslt_alloc_sts_typ_NC(info);
		else if (nc == columnSloRslt_alloc_sts_typ_nm) doSloRslt_alloc_sts_typ_nm_NC(info);
		else if (nc == columnSloRslt_trd_cd) doSloRslt_trd_cd_NC(info);
		else if (nc == columnSloRslt_trd_ptn_typ) doSloRslt_trd_ptn_typ_NC(info);
		else if (nc == columnSloRslt_trd_nm) doSloRslt_trd_nm_NC(info);
		else if (nc == columnSloRslt_slo_no) doSloRslt_slo_no_NC(info);
		else if (nc == columnSloRslt_slo_rev) doSloRslt_slo_rev_NC(info);
		else if (nc == columnSloRslt_slo_typ) doSloRslt_slo_typ_NC(info);
		else if (nc == columnSloRslt_slo_typ_nm) doSloRslt_slo_typ_nm_NC(info);
		else if (nc == columnSloRslt_aprv_flg) doSloRslt_aprv_flg_NC(info);
		else if (nc == columnSloRslt_aprv_no) doSloRslt_aprv_no_NC(info);
		else if (nc == columnSloRslt_aprv_sts_typ) doSloRslt_aprv_sts_typ_NC(info);
		else if (nc == columnSloRslt_aprv_sts_typ_nm) doSloRslt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnSloRslt_qtn_no) doSloRslt_qtn_no_NC(info);
		else if (nc == columnSloRslt_qtn_rev) doSloRslt_qtn_rev_NC(info);
		else if (nc == columnSloRslt_slo_dt) doSloRslt_slo_dt_NC(info);
		else if (nc == columnSloRslt_dlv_inst_rcpt_dt) doSloRslt_dlv_inst_rcpt_dt_NC(info);
		else if (nc == columnSloRslt_cst_cd) doSloRslt_cst_cd_NC(info);
		else if (nc == columnSloRslt_cst_nm) doSloRslt_cst_nm_NC(info);
		else if (nc == columnSloRslt_sls_usr_cd) doSloRslt_sls_usr_cd_NC(info);
		else if (nc == columnSloRslt_sls_usr_nm) doSloRslt_sls_usr_nm_NC(info);
		else if (nc == columnSloRslt_sls_dpt_cd) doSloRslt_sls_dpt_cd_NC(info);
		else if (nc == columnSloRslt_sls_dpt_nm) doSloRslt_sls_dpt_nm_NC(info);
		else if (nc == columnSloRslt_wg_cd) doSloRslt_wg_cd_NC(info);
		else if (nc == columnSloRslt_wg_nm) doSloRslt_wg_nm_NC(info);
		else if (nc == columnSloRslt_assort_typ) doSloRslt_assort_typ_NC(info);
		else if (nc == columnSloRslt_assort_typ_nm) doSloRslt_assort_typ_nm_NC(info);
		else if (nc == columnSloRslt_cst_po_no) doSloRslt_cst_po_no_NC(info);
		else if (nc == columnSloRslt_wrk_no) doSloRslt_wrk_no_NC(info);
		else if (nc == columnSloRslt_wrk_nm) doSloRslt_wrk_nm_NC(info);
		else if (nc == columnSloRslt_trd_rmrks) doSloRslt_trd_rmrks_NC(info);
		else if (nc == columnSloRslt_intr_rmrks) doSloRslt_intr_rmrks_NC(info);
		else if (nc == columnSloRslt_slo_d_no) doSloRslt_slo_d_no_NC(info);
		else if (nc == columnSloRslt_cst_itm_cd) doSloRslt_cst_itm_cd_NC(info);
		else if (nc == columnSloRslt_cst_itm_nm) doSloRslt_cst_itm_nm_NC(info);
		else if (nc == columnSloRslt_sundry_itm_flg) doSloRslt_sundry_itm_flg_NC(info);
		else if (nc == columnSloRslt_stk_mng_typ) doSloRslt_stk_mng_typ_NC(info);
		else if (nc == columnSloRslt_stk_mng_typ_nm) doSloRslt_stk_mng_typ_nm_NC(info);
		else if (nc == columnSloRslt_asset_mng_typ) doSloRslt_asset_mng_typ_NC(info);
		else if (nc == columnSloRslt_asset_mng_typ_nm) doSloRslt_asset_mng_typ_nm_NC(info);
		else if (nc == columnSloRslt_vmi_flg) doSloRslt_vmi_flg_NC(info);
		else if (nc == columnSloRslt_trd_unit_cd) doSloRslt_trd_unit_cd_NC(info);
		else if (nc == columnSloRslt_trd_unit_nm) doSloRslt_trd_unit_nm_NC(info);
		else if (nc == columnSloRslt_trd_unit_dec_place) doSloRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnSloRslt_trd_unit_conv_base_qty) doSloRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnSloRslt_trd_unit_conv_qty) doSloRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnSloRslt_set_itm_grp_no) doSloRslt_set_itm_grp_no_NC(info);
		else if (nc == columnSloRslt_dest_cd1) doSloRslt_dest_cd1_NC(info);
		else if (nc == columnSloRslt_dest_nm1) doSloRslt_dest_nm1_NC(info);
		else if (nc == columnSloRslt_dest_cd2) doSloRslt_dest_cd2_NC(info);
		else if (nc == columnSloRslt_dest_nm2) doSloRslt_dest_nm2_NC(info);
		else if (nc == columnSloRslt_dest_cd3) doSloRslt_dest_cd3_NC(info);
		else if (nc == columnSloRslt_dest_nm3) doSloRslt_dest_nm3_NC(info);
		else if (nc == columnSloRslt_via_dlv_typ) doSloRslt_via_dlv_typ_NC(info);
		else if (nc == columnSloRslt_via_dlv_typ_nm) doSloRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnSloRslt_dlv_day_week_typ) doSloRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnSloRslt_dlv_day_week_typ_nm) doSloRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnSloRslt_sls_cststk_flg) doSloRslt_sls_cststk_flg_NC(info);
		else if (nc == columnSloRslt_proc_typ) doSloRslt_proc_typ_NC(info);
		else if (nc == columnSloRslt_proc_typ_nm) doSloRslt_proc_typ_nm_NC(info);
		else if (nc == columnSloRslt_ship_inst_typ) doSloRslt_ship_inst_typ_NC(info);
		else if (nc == columnSloRslt_ship_inst_typ_nm) doSloRslt_ship_inst_typ_nm_NC(info);
		else if (nc == columnSloRslt_ship_schd_split_typ) doSloRslt_ship_schd_split_typ_NC(info);
		else if (nc == columnSloRslt_ship_schd_split_typ_nm) doSloRslt_ship_schd_split_typ_nm_NC(info);
		else if (nc == columnSloRslt_alloc_scope_typ) doSloRslt_alloc_scope_typ_NC(info);
		else if (nc == columnSloRslt_alloc_scope_typ_nm) doSloRslt_alloc_scope_typ_nm_NC(info);
		else if (nc == columnSloRslt_alloc_typ) doSloRslt_alloc_typ_NC(info);
		else if (nc == columnSloRslt_alloc_typ_nm) doSloRslt_alloc_typ_nm_NC(info);
		else if (nc == columnSloRslt_rqst_to_loc_cd) doSloRslt_rqst_to_loc_cd_NC(info);
		else if (nc == columnSloRslt_rqst_to_loc_nm) doSloRslt_rqst_to_loc_nm_NC(info);
		else if (nc == columnSloRslt_sppl_cd) doSloRslt_sppl_cd_NC(info);
		else if (nc == columnSloRslt_sppl_nm) doSloRslt_sppl_nm_NC(info);
		else if (nc == columnSloRslt_maker_cd) doSloRslt_maker_cd_NC(info);
		else if (nc == columnSloRslt_maker_nm) doSloRslt_maker_nm_NC(info);
		else if (nc == columnSloRslt_wg_rqst_cnt_rmrks) doSloRslt_wg_rqst_cnt_rmrks_NC(info);
		else if (nc == columnSloRslt_loc_cd) doSloRslt_loc_cd_NC(info);
		else if (nc == columnSloRslt_loc_nm) doSloRslt_loc_nm_NC(info);
		else if (nc == columnSloRslt_ship_lg_grp_cd) doSloRslt_ship_lg_grp_cd_NC(info);
		else if (nc == columnSloRslt_ship_lg_grp_nm) doSloRslt_ship_lg_grp_nm_NC(info);
		else if (nc == columnSloRslt_alloc_grp_cd) doSloRslt_alloc_grp_cd_NC(info);
		else if (nc == columnSloRslt_alloc_grp_nm) doSloRslt_alloc_grp_nm_NC(info);
		else if (nc == columnSloRslt_ship_term_cd) doSloRslt_ship_term_cd_NC(info);
		else if (nc == columnSloRslt_ship_term_nm) doSloRslt_ship_term_nm_NC(info);
		else if (nc == columnSloRslt_ship_cnt_rmrks) doSloRslt_ship_cnt_rmrks_NC(info);
		else if (nc == columnSloRslt_cst_po_d_no) doSloRslt_cst_po_d_no_NC(info);
		else if (nc == columnSloRslt_cst_po_d_rmrks) doSloRslt_cst_po_d_rmrks_NC(info);
		else if (nc == columnSloRslt_sls_rsn_cd) doSloRslt_sls_rsn_cd_NC(info);
		else if (nc == columnSloRslt_sls_rsn_nm) doSloRslt_sls_rsn_nm_NC(info);
		else if (nc == columnSloRslt_trd_d_rmrks) doSloRslt_trd_d_rmrks_NC(info);
		else if (nc == columnSloRslt_intr_d_rmrks) doSloRslt_intr_d_rmrks_NC(info);
		else if (nc == columnSloRslt_ship_cmpl_flg) doSloRslt_ship_cmpl_flg_NC(info);
		else if (nc == columnSloRslt_sls_cmpl_flg) doSloRslt_sls_cmpl_flg_NC(info);
		else if (nc == columnSloRslt_ship_schd_split_flg) doSloRslt_ship_schd_split_flg_NC(info);
		else if (nc == columnSloRslt_base_unit_cd) doSloRslt_base_unit_cd_NC(info);
		else if (nc == columnSloRslt_base_unit_nm) doSloRslt_base_unit_nm_NC(info);
		else if (nc == columnSloRslt_base_unit_dec_place) doSloRslt_base_unit_dec_place_NC(info);
		else if (nc == columnSloRslt_base_unit_rnd_typ) doSloRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnSloRslt_sub_char1) doSloRslt_sub_char1_NC(info);
		else if (nc == columnSloRslt_sub_char2) doSloRslt_sub_char2_NC(info);
		else if (nc == columnSloRslt_sub_char3) doSloRslt_sub_char3_NC(info);
		else if (nc == columnSloRslt_ins_usr_id) doSloRslt_ins_usr_id_NC(info);
		else if (nc == columnSloRslt_ins_usr_nm) doSloRslt_ins_usr_nm_NC(info);
		else if (nc == columnSloRslt_ins_func_id) doSloRslt_ins_func_id_NC(info);
		else if (nc == columnSloRslt_ins_func_nm) doSloRslt_ins_func_nm_NC(info);
		else if (nc == columnSloRslt_ins_ts) doSloRslt_ins_ts_NC(info);
		else if (nc == columnSloRslt_upd_usr_id) doSloRslt_upd_usr_id_NC(info);
		else if (nc == columnSloRslt_upd_usr_nm) doSloRslt_upd_usr_nm_NC(info);
		else if (nc == columnSloRslt_upd_func_id) doSloRslt_upd_func_id_NC(info);
		else if (nc == columnSloRslt_upd_func_nm) doSloRslt_upd_func_nm_NC(info);
		else if (nc == columnSloRslt_upd_ts) doSloRslt_upd_ts_NC(info);
		else if (nc == columnSloRslt_upd_srv_req_no) doSloRslt_upd_srv_req_no_NC(info);
		else if (nc == columnSloRslt_ship_pr_upd_cntr) doSloRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == columnSloRslt_slo_upd_cntr) doSloRslt_slo_upd_cntr_NC(info);
		else if (nc == columnShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NC(info);
		else if (nc == columnShipSchdRslt_pr_sts_typ) doShipSchdRslt_pr_sts_typ_NC(info);
		else if (nc == columnShipSchdRslt_pr_sts_typ_nm) doShipSchdRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnShipSchdRslt_alloc_sts_typ) doShipSchdRslt_alloc_sts_typ_NC(info);
		else if (nc == columnShipSchdRslt_alloc_sts_typ_nm) doShipSchdRslt_alloc_sts_typ_nm_NC(info);
		else if (nc == columnShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NC(info);
		else if (nc == columnShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NC(info);
		else if (nc == columnShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnShipSchdRslt_fix_flg) doShipSchdRslt_fix_flg_NC(info);
		else if (nc == columnShipSchdRslt_re_ship_schd_flg) doShipSchdRslt_re_ship_schd_flg_NC(info);
		else if (nc == columnShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NC(info);
		else if (nc == columnShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NC(info);
		else if (nc == columnShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NC(info);
		else if (nc == columnShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NC(info);
		else if (nc == columnShipSchdRslt_not_dt_calc_flg) doShipSchdRslt_not_dt_calc_flg_NC(info);
		else if (nc == columnShipSchdRslt_ship_wk_cd) doShipSchdRslt_ship_wk_cd_NC(info);
		else if (nc == columnShipSchdRslt_ship_wk_nm) doShipSchdRslt_ship_wk_nm_NC(info);
		else if (nc == columnShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NC(info);
		else if (nc == columnShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NC(info);
		else if (nc == columnShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NC(info);
		else if (nc == columnShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NC(info);
		else if (nc == columnShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NC(info);
		else if (nc == columnShipSchdRslt_ship_abl_flg) doShipSchdRslt_ship_abl_flg_NC(info);
		else if (nc == columnShipSchdRslt_ship_fr_lg_grp_cd) doShipSchdRslt_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnShipSchdRslt_ship_fr_lg_grp_nm) doShipSchdRslt_ship_fr_lg_grp_nm_NC(info);
		else if (nc == columnShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NC(info);
		else if (nc == columnShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NC(info);
		else if (nc == columnShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NC(info);
		else if (nc == columnShipSchdRslt_abort_flg) doShipSchdRslt_abort_flg_NC(info);
		else if (nc == columnShipSchdRslt_cmpl_flg) doShipSchdRslt_cmpl_flg_NC(info);
		else if (nc == columnShipSchdRslt_ship_term_cd) doShipSchdRslt_ship_term_cd_NC(info);
		else if (nc == columnShipSchdRslt_ship_term_nm) doShipSchdRslt_ship_term_nm_NC(info);
		else if (nc == columnShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NC(info);
		else if (nc == columnShipSchdRslt_dlv_inst_rcpt_no) doShipSchdRslt_dlv_inst_rcpt_no_NC(info);
		else if (nc == columnShipSchdRslt_slo_prms_no) doShipSchdRslt_slo_prms_no_NC(info);
		else if (nc == columnShipSchdRslt_sls_act_d_no) doShipSchdRslt_sls_act_d_no_NC(info);
		else if (nc == columnShipSchdRslt_tdlv_req_flg) doShipSchdRslt_tdlv_req_flg_NC(info);
		else if (nc == columnShipSchdRslt_via_dlv_typ) doShipSchdRslt_via_dlv_typ_NC(info);
		else if (nc == columnShipSchdRslt_via_dlv_typ_nm) doShipSchdRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnShipSchdRslt_dlv_day_week_typ) doShipSchdRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnShipSchdRslt_dlv_day_week_typ_nm) doShipSchdRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnShipSchdRslt_ins_usr_id) doShipSchdRslt_ins_usr_id_NC(info);
		else if (nc == columnShipSchdRslt_ins_usr_nm) doShipSchdRslt_ins_usr_nm_NC(info);
		else if (nc == columnShipSchdRslt_ins_func_id) doShipSchdRslt_ins_func_id_NC(info);
		else if (nc == columnShipSchdRslt_ins_func_nm) doShipSchdRslt_ins_func_nm_NC(info);
		else if (nc == columnShipSchdRslt_ins_ts) doShipSchdRslt_ins_ts_NC(info);
		else if (nc == columnShipSchdRslt_upd_usr_id) doShipSchdRslt_upd_usr_id_NC(info);
		else if (nc == columnShipSchdRslt_upd_usr_nm) doShipSchdRslt_upd_usr_nm_NC(info);
		else if (nc == columnShipSchdRslt_upd_func_id) doShipSchdRslt_upd_func_id_NC(info);
		else if (nc == columnShipSchdRslt_upd_func_nm) doShipSchdRslt_upd_func_nm_NC(info);
		else if (nc == columnShipSchdRslt_upd_ts) doShipSchdRslt_upd_ts_NC(info);
		else if (nc == columnShipSchdRslt_upd_srv_req_no) doShipSchdRslt_upd_srv_req_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_slo_d_no) doDlvInstRcptRslt_slo_d_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_cst_dlv_inst_no) doDlvInstRcptRslt_cst_dlv_inst_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_cst_dlv_inst_rev) doDlvInstRcptRslt_cst_dlv_inst_rev_NC(info);
		else if (nc == columnDlvInstRcptRslt_cst_dlv_inst_d_no) doDlvInstRcptRslt_cst_dlv_inst_d_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_cst_dlv_inst_rmrks) doDlvInstRcptRslt_cst_dlv_inst_rmrks_NC(info);
		else if (nc == columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks) doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NC(info);
		else if (nc == columnDlvInstRcptRslt_intr_rmrks) doDlvInstRcptRslt_intr_rmrks_NC(info);
		else if (nc == columnDlvInstRcptRslt_trd_unit_cd) doDlvInstRcptRslt_trd_unit_cd_NC(info);
		else if (nc == columnDlvInstRcptRslt_trd_unit_nm) doDlvInstRcptRslt_trd_unit_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_trd_unit_dec_place) doDlvInstRcptRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnDlvInstRcptRslt_trd_unit_conv_base_qty) doDlvInstRcptRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDlvInstRcptRslt_trd_unit_conv_qty) doDlvInstRcptRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnDlvInstRcptRslt_base_unit_cd) doDlvInstRcptRslt_base_unit_cd_NC(info);
		else if (nc == columnDlvInstRcptRslt_base_unit_nm) doDlvInstRcptRslt_base_unit_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_base_unit_dec_place) doDlvInstRcptRslt_base_unit_dec_place_NC(info);
		else if (nc == columnDlvInstRcptRslt_base_unit_rnd_typ) doDlvInstRcptRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnDlvInstRcptRslt_edi_flg) doDlvInstRcptRslt_edi_flg_NC(info);
		else if (nc == columnDlvInstRcptRslt_dlv_inst_rcpt_no) doDlvInstRcptRslt_dlv_inst_rcpt_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_dlv_inst_rcpt_rev) doDlvInstRcptRslt_dlv_inst_rcpt_rev_NC(info);
		else if (nc == columnDlvInstRcptRslt_tdlv_req_flg) doDlvInstRcptRslt_tdlv_req_flg_NC(info);
		else if (nc == columnDlvInstRcptRslt_mst_via_dlv_typ) doDlvInstRcptRslt_mst_via_dlv_typ_NC(info);
		else if (nc == columnDlvInstRcptRslt_via_dlv_typ) doDlvInstRcptRslt_via_dlv_typ_NC(info);
		else if (nc == columnDlvInstRcptRslt_via_dlv_typ_nm) doDlvInstRcptRslt_via_dlv_typ_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_dlv_day_week_typ) doDlvInstRcptRslt_dlv_day_week_typ_NC(info);
		else if (nc == columnDlvInstRcptRslt_dlv_day_week_typ_nm) doDlvInstRcptRslt_dlv_day_week_typ_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_sub_char1) doDlvInstRcptRslt_sub_char1_NC(info);
		else if (nc == columnDlvInstRcptRslt_sub_char2) doDlvInstRcptRslt_sub_char2_NC(info);
		else if (nc == columnDlvInstRcptRslt_sub_char3) doDlvInstRcptRslt_sub_char3_NC(info);
		else if (nc == columnDlvInstRcptRslt_ins_usr_id) doDlvInstRcptRslt_ins_usr_id_NC(info);
		else if (nc == columnDlvInstRcptRslt_ins_usr_nm) doDlvInstRcptRslt_ins_usr_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_ins_func_id) doDlvInstRcptRslt_ins_func_id_NC(info);
		else if (nc == columnDlvInstRcptRslt_ins_func_nm) doDlvInstRcptRslt_ins_func_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_ins_ts) doDlvInstRcptRslt_ins_ts_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_usr_id) doDlvInstRcptRslt_upd_usr_id_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_usr_nm) doDlvInstRcptRslt_upd_usr_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_func_id) doDlvInstRcptRslt_upd_func_id_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_func_nm) doDlvInstRcptRslt_upd_func_nm_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_ts) doDlvInstRcptRslt_upd_ts_NC(info);
		else if (nc == columnDlvInstRcptRslt_upd_srv_req_no) doDlvInstRcptRslt_upd_srv_req_no_NC(info);
		else if (nc == columnDlvInstRcptRslt_ship_pr_upd_cntr) doDlvInstRcptRslt_ship_pr_upd_cntr_NC(info);
		else if (nc == columnDlvInstRcptRslt_slo_upd_cntr) doDlvInstRcptRslt_slo_upd_cntr_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
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
	 * [SloRslt]パネルの[sls_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_rev_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_rev_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_dt_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_inst_rcpt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_inst_rcpt_dt_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[vmi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_vmi_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_set_itm_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_rqst_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_rqst_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[re_ship_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_re_ship_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_dt_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_dt_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_hm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_block_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_block_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_abl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_abl_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_prms_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_prms_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sls_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sls_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[tdlv_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_tdlv_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_rev_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[tdlv_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_tdlv_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[mst_via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_mst_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ship_pr_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ship_pr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == SloRsltTable) doSloRslt_NE(info);
		else if (ne == ShipSchdRsltTable) doShipSchdRslt_NE(info);
		else if (ne == DlvInstRcptRsltTable) doDlvInstRcptRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_slo_flg) doCnd_slo_flg_NE(info);
		else if (ne == Cnd_prms_flg) doCnd_prms_flg_NE(info);
		else if (ne == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NE(info);
		else if (ne == Cnd_dlv_inst_prms_flg) doCnd_dlv_inst_prms_flg_NE(info);
		else if (ne == Cnd_sls_flg) doCnd_sls_flg_NE(info);
		else if (ne == Cnd_ship_flg) doCnd_ship_flg_NE(info);
		else if (ne == Cnd_compl_flg) doCnd_compl_flg_NE(info);
		else if (ne == Cnd_edi_flg) doCnd_edi_flg_NE(info);
		else if (ne == Cnd_not_edi_flg) doCnd_not_edi_flg_NE(info);
		else if (ne == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NE(info);
		else if (ne == Cnd_slo_dt_to) doCnd_slo_dt_to_NE(info);
		else if (ne == Cnd_dlv_inst_rcpt_dt_fr) doCnd_dlv_inst_rcpt_dt_fr_NE(info);
		else if (ne == Cnd_dlv_inst_rcpt_dt_to) doCnd_dlv_inst_rcpt_dt_to_NE(info);
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
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_cst_po_no) doCnd_cst_po_no_NE(info);
		else if (ne == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NE(info);
		else if (ne == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NE(info);
		else if (ne == Cnd_cst_po_d_rmrks) doCnd_cst_po_d_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnSloRslt_sls_sts_typ) doSloRslt_sls_sts_typ_NE(info);
		else if (ne == columnSloRslt_sls_sts_typ_nm) doSloRslt_sls_sts_typ_nm_NE(info);
		else if (ne == columnSloRslt_alloc_sts_typ) doSloRslt_alloc_sts_typ_NE(info);
		else if (ne == columnSloRslt_alloc_sts_typ_nm) doSloRslt_alloc_sts_typ_nm_NE(info);
		else if (ne == columnSloRslt_trd_cd) doSloRslt_trd_cd_NE(info);
		else if (ne == columnSloRslt_trd_ptn_typ) doSloRslt_trd_ptn_typ_NE(info);
		else if (ne == columnSloRslt_trd_nm) doSloRslt_trd_nm_NE(info);
		else if (ne == columnSloRslt_slo_no) doSloRslt_slo_no_NE(info);
		else if (ne == columnSloRslt_slo_rev) doSloRslt_slo_rev_NE(info);
		else if (ne == columnSloRslt_slo_typ) doSloRslt_slo_typ_NE(info);
		else if (ne == columnSloRslt_slo_typ_nm) doSloRslt_slo_typ_nm_NE(info);
		else if (ne == columnSloRslt_aprv_flg) doSloRslt_aprv_flg_NE(info);
		else if (ne == columnSloRslt_aprv_no) doSloRslt_aprv_no_NE(info);
		else if (ne == columnSloRslt_aprv_sts_typ) doSloRslt_aprv_sts_typ_NE(info);
		else if (ne == columnSloRslt_aprv_sts_typ_nm) doSloRslt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnSloRslt_qtn_no) doSloRslt_qtn_no_NE(info);
		else if (ne == columnSloRslt_qtn_rev) doSloRslt_qtn_rev_NE(info);
		else if (ne == columnSloRslt_slo_dt) doSloRslt_slo_dt_NE(info);
		else if (ne == columnSloRslt_dlv_inst_rcpt_dt) doSloRslt_dlv_inst_rcpt_dt_NE(info);
		else if (ne == columnSloRslt_cst_cd) doSloRslt_cst_cd_NE(info);
		else if (ne == columnSloRslt_cst_nm) doSloRslt_cst_nm_NE(info);
		else if (ne == columnSloRslt_sls_usr_cd) doSloRslt_sls_usr_cd_NE(info);
		else if (ne == columnSloRslt_sls_usr_nm) doSloRslt_sls_usr_nm_NE(info);
		else if (ne == columnSloRslt_sls_dpt_cd) doSloRslt_sls_dpt_cd_NE(info);
		else if (ne == columnSloRslt_sls_dpt_nm) doSloRslt_sls_dpt_nm_NE(info);
		else if (ne == columnSloRslt_wg_cd) doSloRslt_wg_cd_NE(info);
		else if (ne == columnSloRslt_wg_nm) doSloRslt_wg_nm_NE(info);
		else if (ne == columnSloRslt_assort_typ) doSloRslt_assort_typ_NE(info);
		else if (ne == columnSloRslt_assort_typ_nm) doSloRslt_assort_typ_nm_NE(info);
		else if (ne == columnSloRslt_cst_po_no) doSloRslt_cst_po_no_NE(info);
		else if (ne == columnSloRslt_wrk_no) doSloRslt_wrk_no_NE(info);
		else if (ne == columnSloRslt_wrk_nm) doSloRslt_wrk_nm_NE(info);
		else if (ne == columnSloRslt_trd_rmrks) doSloRslt_trd_rmrks_NE(info);
		else if (ne == columnSloRslt_intr_rmrks) doSloRslt_intr_rmrks_NE(info);
		else if (ne == columnSloRslt_slo_d_no) doSloRslt_slo_d_no_NE(info);
		else if (ne == columnSloRslt_cst_itm_cd) doSloRslt_cst_itm_cd_NE(info);
		else if (ne == columnSloRslt_cst_itm_nm) doSloRslt_cst_itm_nm_NE(info);
		else if (ne == columnSloRslt_sundry_itm_flg) doSloRslt_sundry_itm_flg_NE(info);
		else if (ne == columnSloRslt_stk_mng_typ) doSloRslt_stk_mng_typ_NE(info);
		else if (ne == columnSloRslt_stk_mng_typ_nm) doSloRslt_stk_mng_typ_nm_NE(info);
		else if (ne == columnSloRslt_asset_mng_typ) doSloRslt_asset_mng_typ_NE(info);
		else if (ne == columnSloRslt_asset_mng_typ_nm) doSloRslt_asset_mng_typ_nm_NE(info);
		else if (ne == columnSloRslt_vmi_flg) doSloRslt_vmi_flg_NE(info);
		else if (ne == columnSloRslt_trd_unit_cd) doSloRslt_trd_unit_cd_NE(info);
		else if (ne == columnSloRslt_trd_unit_nm) doSloRslt_trd_unit_nm_NE(info);
		else if (ne == columnSloRslt_trd_unit_dec_place) doSloRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnSloRslt_trd_unit_conv_base_qty) doSloRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnSloRslt_trd_unit_conv_qty) doSloRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnSloRslt_set_itm_grp_no) doSloRslt_set_itm_grp_no_NE(info);
		else if (ne == columnSloRslt_dest_cd1) doSloRslt_dest_cd1_NE(info);
		else if (ne == columnSloRslt_dest_nm1) doSloRslt_dest_nm1_NE(info);
		else if (ne == columnSloRslt_dest_cd2) doSloRslt_dest_cd2_NE(info);
		else if (ne == columnSloRslt_dest_nm2) doSloRslt_dest_nm2_NE(info);
		else if (ne == columnSloRslt_dest_cd3) doSloRslt_dest_cd3_NE(info);
		else if (ne == columnSloRslt_dest_nm3) doSloRslt_dest_nm3_NE(info);
		else if (ne == columnSloRslt_via_dlv_typ) doSloRslt_via_dlv_typ_NE(info);
		else if (ne == columnSloRslt_via_dlv_typ_nm) doSloRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnSloRslt_dlv_day_week_typ) doSloRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnSloRslt_dlv_day_week_typ_nm) doSloRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnSloRslt_sls_cststk_flg) doSloRslt_sls_cststk_flg_NE(info);
		else if (ne == columnSloRslt_proc_typ) doSloRslt_proc_typ_NE(info);
		else if (ne == columnSloRslt_proc_typ_nm) doSloRslt_proc_typ_nm_NE(info);
		else if (ne == columnSloRslt_ship_inst_typ) doSloRslt_ship_inst_typ_NE(info);
		else if (ne == columnSloRslt_ship_inst_typ_nm) doSloRslt_ship_inst_typ_nm_NE(info);
		else if (ne == columnSloRslt_ship_schd_split_typ) doSloRslt_ship_schd_split_typ_NE(info);
		else if (ne == columnSloRslt_ship_schd_split_typ_nm) doSloRslt_ship_schd_split_typ_nm_NE(info);
		else if (ne == columnSloRslt_alloc_scope_typ) doSloRslt_alloc_scope_typ_NE(info);
		else if (ne == columnSloRslt_alloc_scope_typ_nm) doSloRslt_alloc_scope_typ_nm_NE(info);
		else if (ne == columnSloRslt_alloc_typ) doSloRslt_alloc_typ_NE(info);
		else if (ne == columnSloRslt_alloc_typ_nm) doSloRslt_alloc_typ_nm_NE(info);
		else if (ne == columnSloRslt_rqst_to_loc_cd) doSloRslt_rqst_to_loc_cd_NE(info);
		else if (ne == columnSloRslt_rqst_to_loc_nm) doSloRslt_rqst_to_loc_nm_NE(info);
		else if (ne == columnSloRslt_sppl_cd) doSloRslt_sppl_cd_NE(info);
		else if (ne == columnSloRslt_sppl_nm) doSloRslt_sppl_nm_NE(info);
		else if (ne == columnSloRslt_maker_cd) doSloRslt_maker_cd_NE(info);
		else if (ne == columnSloRslt_maker_nm) doSloRslt_maker_nm_NE(info);
		else if (ne == columnSloRslt_wg_rqst_cnt_rmrks) doSloRslt_wg_rqst_cnt_rmrks_NE(info);
		else if (ne == columnSloRslt_loc_cd) doSloRslt_loc_cd_NE(info);
		else if (ne == columnSloRslt_loc_nm) doSloRslt_loc_nm_NE(info);
		else if (ne == columnSloRslt_ship_lg_grp_cd) doSloRslt_ship_lg_grp_cd_NE(info);
		else if (ne == columnSloRslt_ship_lg_grp_nm) doSloRslt_ship_lg_grp_nm_NE(info);
		else if (ne == columnSloRslt_alloc_grp_cd) doSloRslt_alloc_grp_cd_NE(info);
		else if (ne == columnSloRslt_alloc_grp_nm) doSloRslt_alloc_grp_nm_NE(info);
		else if (ne == columnSloRslt_ship_term_cd) doSloRslt_ship_term_cd_NE(info);
		else if (ne == columnSloRslt_ship_term_nm) doSloRslt_ship_term_nm_NE(info);
		else if (ne == columnSloRslt_ship_cnt_rmrks) doSloRslt_ship_cnt_rmrks_NE(info);
		else if (ne == columnSloRslt_cst_po_d_no) doSloRslt_cst_po_d_no_NE(info);
		else if (ne == columnSloRslt_cst_po_d_rmrks) doSloRslt_cst_po_d_rmrks_NE(info);
		else if (ne == columnSloRslt_sls_rsn_cd) doSloRslt_sls_rsn_cd_NE(info);
		else if (ne == columnSloRslt_sls_rsn_nm) doSloRslt_sls_rsn_nm_NE(info);
		else if (ne == columnSloRslt_trd_d_rmrks) doSloRslt_trd_d_rmrks_NE(info);
		else if (ne == columnSloRslt_intr_d_rmrks) doSloRslt_intr_d_rmrks_NE(info);
		else if (ne == columnSloRslt_ship_cmpl_flg) doSloRslt_ship_cmpl_flg_NE(info);
		else if (ne == columnSloRslt_sls_cmpl_flg) doSloRslt_sls_cmpl_flg_NE(info);
		else if (ne == columnSloRslt_ship_schd_split_flg) doSloRslt_ship_schd_split_flg_NE(info);
		else if (ne == columnSloRslt_base_unit_cd) doSloRslt_base_unit_cd_NE(info);
		else if (ne == columnSloRslt_base_unit_nm) doSloRslt_base_unit_nm_NE(info);
		else if (ne == columnSloRslt_base_unit_dec_place) doSloRslt_base_unit_dec_place_NE(info);
		else if (ne == columnSloRslt_base_unit_rnd_typ) doSloRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnSloRslt_sub_char1) doSloRslt_sub_char1_NE(info);
		else if (ne == columnSloRslt_sub_char2) doSloRslt_sub_char2_NE(info);
		else if (ne == columnSloRslt_sub_char3) doSloRslt_sub_char3_NE(info);
		else if (ne == columnSloRslt_ins_usr_id) doSloRslt_ins_usr_id_NE(info);
		else if (ne == columnSloRslt_ins_usr_nm) doSloRslt_ins_usr_nm_NE(info);
		else if (ne == columnSloRslt_ins_func_id) doSloRslt_ins_func_id_NE(info);
		else if (ne == columnSloRslt_ins_func_nm) doSloRslt_ins_func_nm_NE(info);
		else if (ne == columnSloRslt_ins_ts) doSloRslt_ins_ts_NE(info);
		else if (ne == columnSloRslt_upd_usr_id) doSloRslt_upd_usr_id_NE(info);
		else if (ne == columnSloRslt_upd_usr_nm) doSloRslt_upd_usr_nm_NE(info);
		else if (ne == columnSloRslt_upd_func_id) doSloRslt_upd_func_id_NE(info);
		else if (ne == columnSloRslt_upd_func_nm) doSloRslt_upd_func_nm_NE(info);
		else if (ne == columnSloRslt_upd_ts) doSloRslt_upd_ts_NE(info);
		else if (ne == columnSloRslt_upd_srv_req_no) doSloRslt_upd_srv_req_no_NE(info);
		else if (ne == columnSloRslt_ship_pr_upd_cntr) doSloRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == columnSloRslt_slo_upd_cntr) doSloRslt_slo_upd_cntr_NE(info);
		else if (ne == columnShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NE(info);
		else if (ne == columnShipSchdRslt_pr_sts_typ) doShipSchdRslt_pr_sts_typ_NE(info);
		else if (ne == columnShipSchdRslt_pr_sts_typ_nm) doShipSchdRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnShipSchdRslt_alloc_sts_typ) doShipSchdRslt_alloc_sts_typ_NE(info);
		else if (ne == columnShipSchdRslt_alloc_sts_typ_nm) doShipSchdRslt_alloc_sts_typ_nm_NE(info);
		else if (ne == columnShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NE(info);
		else if (ne == columnShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NE(info);
		else if (ne == columnShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnShipSchdRslt_fix_flg) doShipSchdRslt_fix_flg_NE(info);
		else if (ne == columnShipSchdRslt_re_ship_schd_flg) doShipSchdRslt_re_ship_schd_flg_NE(info);
		else if (ne == columnShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NE(info);
		else if (ne == columnShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NE(info);
		else if (ne == columnShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NE(info);
		else if (ne == columnShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NE(info);
		else if (ne == columnShipSchdRslt_not_dt_calc_flg) doShipSchdRslt_not_dt_calc_flg_NE(info);
		else if (ne == columnShipSchdRslt_ship_wk_cd) doShipSchdRslt_ship_wk_cd_NE(info);
		else if (ne == columnShipSchdRslt_ship_wk_nm) doShipSchdRslt_ship_wk_nm_NE(info);
		else if (ne == columnShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NE(info);
		else if (ne == columnShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NE(info);
		else if (ne == columnShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NE(info);
		else if (ne == columnShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NE(info);
		else if (ne == columnShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NE(info);
		else if (ne == columnShipSchdRslt_ship_abl_flg) doShipSchdRslt_ship_abl_flg_NE(info);
		else if (ne == columnShipSchdRslt_ship_fr_lg_grp_cd) doShipSchdRslt_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnShipSchdRslt_ship_fr_lg_grp_nm) doShipSchdRslt_ship_fr_lg_grp_nm_NE(info);
		else if (ne == columnShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NE(info);
		else if (ne == columnShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NE(info);
		else if (ne == columnShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NE(info);
		else if (ne == columnShipSchdRslt_abort_flg) doShipSchdRslt_abort_flg_NE(info);
		else if (ne == columnShipSchdRslt_cmpl_flg) doShipSchdRslt_cmpl_flg_NE(info);
		else if (ne == columnShipSchdRslt_ship_term_cd) doShipSchdRslt_ship_term_cd_NE(info);
		else if (ne == columnShipSchdRslt_ship_term_nm) doShipSchdRslt_ship_term_nm_NE(info);
		else if (ne == columnShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NE(info);
		else if (ne == columnShipSchdRslt_dlv_inst_rcpt_no) doShipSchdRslt_dlv_inst_rcpt_no_NE(info);
		else if (ne == columnShipSchdRslt_slo_prms_no) doShipSchdRslt_slo_prms_no_NE(info);
		else if (ne == columnShipSchdRslt_sls_act_d_no) doShipSchdRslt_sls_act_d_no_NE(info);
		else if (ne == columnShipSchdRslt_tdlv_req_flg) doShipSchdRslt_tdlv_req_flg_NE(info);
		else if (ne == columnShipSchdRslt_via_dlv_typ) doShipSchdRslt_via_dlv_typ_NE(info);
		else if (ne == columnShipSchdRslt_via_dlv_typ_nm) doShipSchdRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnShipSchdRslt_dlv_day_week_typ) doShipSchdRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnShipSchdRslt_dlv_day_week_typ_nm) doShipSchdRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnShipSchdRslt_ins_usr_id) doShipSchdRslt_ins_usr_id_NE(info);
		else if (ne == columnShipSchdRslt_ins_usr_nm) doShipSchdRslt_ins_usr_nm_NE(info);
		else if (ne == columnShipSchdRslt_ins_func_id) doShipSchdRslt_ins_func_id_NE(info);
		else if (ne == columnShipSchdRslt_ins_func_nm) doShipSchdRslt_ins_func_nm_NE(info);
		else if (ne == columnShipSchdRslt_ins_ts) doShipSchdRslt_ins_ts_NE(info);
		else if (ne == columnShipSchdRslt_upd_usr_id) doShipSchdRslt_upd_usr_id_NE(info);
		else if (ne == columnShipSchdRslt_upd_usr_nm) doShipSchdRslt_upd_usr_nm_NE(info);
		else if (ne == columnShipSchdRslt_upd_func_id) doShipSchdRslt_upd_func_id_NE(info);
		else if (ne == columnShipSchdRslt_upd_func_nm) doShipSchdRslt_upd_func_nm_NE(info);
		else if (ne == columnShipSchdRslt_upd_ts) doShipSchdRslt_upd_ts_NE(info);
		else if (ne == columnShipSchdRslt_upd_srv_req_no) doShipSchdRslt_upd_srv_req_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_slo_d_no) doDlvInstRcptRslt_slo_d_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_cst_dlv_inst_no) doDlvInstRcptRslt_cst_dlv_inst_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_cst_dlv_inst_rev) doDlvInstRcptRslt_cst_dlv_inst_rev_NE(info);
		else if (ne == columnDlvInstRcptRslt_cst_dlv_inst_d_no) doDlvInstRcptRslt_cst_dlv_inst_d_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_cst_dlv_inst_rmrks) doDlvInstRcptRslt_cst_dlv_inst_rmrks_NE(info);
		else if (ne == columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks) doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NE(info);
		else if (ne == columnDlvInstRcptRslt_intr_rmrks) doDlvInstRcptRslt_intr_rmrks_NE(info);
		else if (ne == columnDlvInstRcptRslt_trd_unit_cd) doDlvInstRcptRslt_trd_unit_cd_NE(info);
		else if (ne == columnDlvInstRcptRslt_trd_unit_nm) doDlvInstRcptRslt_trd_unit_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_trd_unit_dec_place) doDlvInstRcptRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnDlvInstRcptRslt_trd_unit_conv_base_qty) doDlvInstRcptRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDlvInstRcptRslt_trd_unit_conv_qty) doDlvInstRcptRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnDlvInstRcptRslt_base_unit_cd) doDlvInstRcptRslt_base_unit_cd_NE(info);
		else if (ne == columnDlvInstRcptRslt_base_unit_nm) doDlvInstRcptRslt_base_unit_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_base_unit_dec_place) doDlvInstRcptRslt_base_unit_dec_place_NE(info);
		else if (ne == columnDlvInstRcptRslt_base_unit_rnd_typ) doDlvInstRcptRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnDlvInstRcptRslt_edi_flg) doDlvInstRcptRslt_edi_flg_NE(info);
		else if (ne == columnDlvInstRcptRslt_dlv_inst_rcpt_no) doDlvInstRcptRslt_dlv_inst_rcpt_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_dlv_inst_rcpt_rev) doDlvInstRcptRslt_dlv_inst_rcpt_rev_NE(info);
		else if (ne == columnDlvInstRcptRslt_tdlv_req_flg) doDlvInstRcptRslt_tdlv_req_flg_NE(info);
		else if (ne == columnDlvInstRcptRslt_mst_via_dlv_typ) doDlvInstRcptRslt_mst_via_dlv_typ_NE(info);
		else if (ne == columnDlvInstRcptRslt_via_dlv_typ) doDlvInstRcptRslt_via_dlv_typ_NE(info);
		else if (ne == columnDlvInstRcptRslt_via_dlv_typ_nm) doDlvInstRcptRslt_via_dlv_typ_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_dlv_day_week_typ) doDlvInstRcptRslt_dlv_day_week_typ_NE(info);
		else if (ne == columnDlvInstRcptRslt_dlv_day_week_typ_nm) doDlvInstRcptRslt_dlv_day_week_typ_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_sub_char1) doDlvInstRcptRslt_sub_char1_NE(info);
		else if (ne == columnDlvInstRcptRslt_sub_char2) doDlvInstRcptRslt_sub_char2_NE(info);
		else if (ne == columnDlvInstRcptRslt_sub_char3) doDlvInstRcptRslt_sub_char3_NE(info);
		else if (ne == columnDlvInstRcptRslt_ins_usr_id) doDlvInstRcptRslt_ins_usr_id_NE(info);
		else if (ne == columnDlvInstRcptRslt_ins_usr_nm) doDlvInstRcptRslt_ins_usr_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_ins_func_id) doDlvInstRcptRslt_ins_func_id_NE(info);
		else if (ne == columnDlvInstRcptRslt_ins_func_nm) doDlvInstRcptRslt_ins_func_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_ins_ts) doDlvInstRcptRslt_ins_ts_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_usr_id) doDlvInstRcptRslt_upd_usr_id_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_usr_nm) doDlvInstRcptRslt_upd_usr_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_func_id) doDlvInstRcptRslt_upd_func_id_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_func_nm) doDlvInstRcptRslt_upd_func_nm_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_ts) doDlvInstRcptRslt_upd_ts_NE(info);
		else if (ne == columnDlvInstRcptRslt_upd_srv_req_no) doDlvInstRcptRslt_upd_srv_req_no_NE(info);
		else if (ne == columnDlvInstRcptRslt_ship_pr_upd_cntr) doDlvInstRcptRslt_ship_pr_upd_cntr_NE(info);
		else if (ne == columnDlvInstRcptRslt_slo_upd_cntr) doDlvInstRcptRslt_slo_upd_cntr_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
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
	 * [SloRslt]パネルの[sls_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_rev_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_rev_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_dt_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_inst_rcpt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_inst_rcpt_dt_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[vmi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_vmi_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_set_itm_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_rqst_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_rqst_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[re_ship_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_re_ship_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_dt_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_dt_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_hm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_block_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_block_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_abl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_abl_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_prms_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_prms_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sls_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sls_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[tdlv_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_tdlv_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_rev_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[tdlv_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_tdlv_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[mst_via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_mst_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ship_pr_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ship_pr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == SloRsltTable) doSloRslt_NX(info);
		else if (nx == ShipSchdRsltTable) doShipSchdRslt_NX(info);
		else if (nx == DlvInstRcptRsltTable) doDlvInstRcptRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_slo_flg) doCnd_slo_flg_NX(info);
		else if (nx == Cnd_prms_flg) doCnd_prms_flg_NX(info);
		else if (nx == Cnd_dlv_inst_rcpt_flg) doCnd_dlv_inst_rcpt_flg_NX(info);
		else if (nx == Cnd_dlv_inst_prms_flg) doCnd_dlv_inst_prms_flg_NX(info);
		else if (nx == Cnd_sls_flg) doCnd_sls_flg_NX(info);
		else if (nx == Cnd_ship_flg) doCnd_ship_flg_NX(info);
		else if (nx == Cnd_compl_flg) doCnd_compl_flg_NX(info);
		else if (nx == Cnd_edi_flg) doCnd_edi_flg_NX(info);
		else if (nx == Cnd_not_edi_flg) doCnd_not_edi_flg_NX(info);
		else if (nx == Cnd_slo_dt_fr) doCnd_slo_dt_fr_NX(info);
		else if (nx == Cnd_slo_dt_to) doCnd_slo_dt_to_NX(info);
		else if (nx == Cnd_dlv_inst_rcpt_dt_fr) doCnd_dlv_inst_rcpt_dt_fr_NX(info);
		else if (nx == Cnd_dlv_inst_rcpt_dt_to) doCnd_dlv_inst_rcpt_dt_to_NX(info);
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
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_cst_po_no) doCnd_cst_po_no_NX(info);
		else if (nx == Cnd_cst_po_d_no) doCnd_cst_po_d_no_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_NX(info);
		else if (nx == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_NX(info);
		else if (nx == Cnd_cst_po_d_rmrks) doCnd_cst_po_d_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnSloRslt_sls_sts_typ) doSloRslt_sls_sts_typ_NX(info);
		else if (nx == columnSloRslt_sls_sts_typ_nm) doSloRslt_sls_sts_typ_nm_NX(info);
		else if (nx == columnSloRslt_alloc_sts_typ) doSloRslt_alloc_sts_typ_NX(info);
		else if (nx == columnSloRslt_alloc_sts_typ_nm) doSloRslt_alloc_sts_typ_nm_NX(info);
		else if (nx == columnSloRslt_trd_cd) doSloRslt_trd_cd_NX(info);
		else if (nx == columnSloRslt_trd_ptn_typ) doSloRslt_trd_ptn_typ_NX(info);
		else if (nx == columnSloRslt_trd_nm) doSloRslt_trd_nm_NX(info);
		else if (nx == columnSloRslt_slo_no) doSloRslt_slo_no_NX(info);
		else if (nx == columnSloRslt_slo_rev) doSloRslt_slo_rev_NX(info);
		else if (nx == columnSloRslt_slo_typ) doSloRslt_slo_typ_NX(info);
		else if (nx == columnSloRslt_slo_typ_nm) doSloRslt_slo_typ_nm_NX(info);
		else if (nx == columnSloRslt_aprv_flg) doSloRslt_aprv_flg_NX(info);
		else if (nx == columnSloRslt_aprv_no) doSloRslt_aprv_no_NX(info);
		else if (nx == columnSloRslt_aprv_sts_typ) doSloRslt_aprv_sts_typ_NX(info);
		else if (nx == columnSloRslt_aprv_sts_typ_nm) doSloRslt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnSloRslt_qtn_no) doSloRslt_qtn_no_NX(info);
		else if (nx == columnSloRslt_qtn_rev) doSloRslt_qtn_rev_NX(info);
		else if (nx == columnSloRslt_slo_dt) doSloRslt_slo_dt_NX(info);
		else if (nx == columnSloRslt_dlv_inst_rcpt_dt) doSloRslt_dlv_inst_rcpt_dt_NX(info);
		else if (nx == columnSloRslt_cst_cd) doSloRslt_cst_cd_NX(info);
		else if (nx == columnSloRslt_cst_nm) doSloRslt_cst_nm_NX(info);
		else if (nx == columnSloRslt_sls_usr_cd) doSloRslt_sls_usr_cd_NX(info);
		else if (nx == columnSloRslt_sls_usr_nm) doSloRslt_sls_usr_nm_NX(info);
		else if (nx == columnSloRslt_sls_dpt_cd) doSloRslt_sls_dpt_cd_NX(info);
		else if (nx == columnSloRslt_sls_dpt_nm) doSloRslt_sls_dpt_nm_NX(info);
		else if (nx == columnSloRslt_wg_cd) doSloRslt_wg_cd_NX(info);
		else if (nx == columnSloRslt_wg_nm) doSloRslt_wg_nm_NX(info);
		else if (nx == columnSloRslt_assort_typ) doSloRslt_assort_typ_NX(info);
		else if (nx == columnSloRslt_assort_typ_nm) doSloRslt_assort_typ_nm_NX(info);
		else if (nx == columnSloRslt_cst_po_no) doSloRslt_cst_po_no_NX(info);
		else if (nx == columnSloRslt_wrk_no) doSloRslt_wrk_no_NX(info);
		else if (nx == columnSloRslt_wrk_nm) doSloRslt_wrk_nm_NX(info);
		else if (nx == columnSloRslt_trd_rmrks) doSloRslt_trd_rmrks_NX(info);
		else if (nx == columnSloRslt_intr_rmrks) doSloRslt_intr_rmrks_NX(info);
		else if (nx == columnSloRslt_slo_d_no) doSloRslt_slo_d_no_NX(info);
		else if (nx == columnSloRslt_cst_itm_cd) doSloRslt_cst_itm_cd_NX(info);
		else if (nx == columnSloRslt_cst_itm_nm) doSloRslt_cst_itm_nm_NX(info);
		else if (nx == columnSloRslt_sundry_itm_flg) doSloRslt_sundry_itm_flg_NX(info);
		else if (nx == columnSloRslt_stk_mng_typ) doSloRslt_stk_mng_typ_NX(info);
		else if (nx == columnSloRslt_stk_mng_typ_nm) doSloRslt_stk_mng_typ_nm_NX(info);
		else if (nx == columnSloRslt_asset_mng_typ) doSloRslt_asset_mng_typ_NX(info);
		else if (nx == columnSloRslt_asset_mng_typ_nm) doSloRslt_asset_mng_typ_nm_NX(info);
		else if (nx == columnSloRslt_vmi_flg) doSloRslt_vmi_flg_NX(info);
		else if (nx == columnSloRslt_trd_unit_cd) doSloRslt_trd_unit_cd_NX(info);
		else if (nx == columnSloRslt_trd_unit_nm) doSloRslt_trd_unit_nm_NX(info);
		else if (nx == columnSloRslt_trd_unit_dec_place) doSloRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnSloRslt_trd_unit_conv_base_qty) doSloRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnSloRslt_trd_unit_conv_qty) doSloRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnSloRslt_set_itm_grp_no) doSloRslt_set_itm_grp_no_NX(info);
		else if (nx == columnSloRslt_dest_cd1) doSloRslt_dest_cd1_NX(info);
		else if (nx == columnSloRslt_dest_nm1) doSloRslt_dest_nm1_NX(info);
		else if (nx == columnSloRslt_dest_cd2) doSloRslt_dest_cd2_NX(info);
		else if (nx == columnSloRslt_dest_nm2) doSloRslt_dest_nm2_NX(info);
		else if (nx == columnSloRslt_dest_cd3) doSloRslt_dest_cd3_NX(info);
		else if (nx == columnSloRslt_dest_nm3) doSloRslt_dest_nm3_NX(info);
		else if (nx == columnSloRslt_via_dlv_typ) doSloRslt_via_dlv_typ_NX(info);
		else if (nx == columnSloRslt_via_dlv_typ_nm) doSloRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnSloRslt_dlv_day_week_typ) doSloRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnSloRslt_dlv_day_week_typ_nm) doSloRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnSloRslt_sls_cststk_flg) doSloRslt_sls_cststk_flg_NX(info);
		else if (nx == columnSloRslt_proc_typ) doSloRslt_proc_typ_NX(info);
		else if (nx == columnSloRslt_proc_typ_nm) doSloRslt_proc_typ_nm_NX(info);
		else if (nx == columnSloRslt_ship_inst_typ) doSloRslt_ship_inst_typ_NX(info);
		else if (nx == columnSloRslt_ship_inst_typ_nm) doSloRslt_ship_inst_typ_nm_NX(info);
		else if (nx == columnSloRslt_ship_schd_split_typ) doSloRslt_ship_schd_split_typ_NX(info);
		else if (nx == columnSloRslt_ship_schd_split_typ_nm) doSloRslt_ship_schd_split_typ_nm_NX(info);
		else if (nx == columnSloRslt_alloc_scope_typ) doSloRslt_alloc_scope_typ_NX(info);
		else if (nx == columnSloRslt_alloc_scope_typ_nm) doSloRslt_alloc_scope_typ_nm_NX(info);
		else if (nx == columnSloRslt_alloc_typ) doSloRslt_alloc_typ_NX(info);
		else if (nx == columnSloRslt_alloc_typ_nm) doSloRslt_alloc_typ_nm_NX(info);
		else if (nx == columnSloRslt_rqst_to_loc_cd) doSloRslt_rqst_to_loc_cd_NX(info);
		else if (nx == columnSloRslt_rqst_to_loc_nm) doSloRslt_rqst_to_loc_nm_NX(info);
		else if (nx == columnSloRslt_sppl_cd) doSloRslt_sppl_cd_NX(info);
		else if (nx == columnSloRslt_sppl_nm) doSloRslt_sppl_nm_NX(info);
		else if (nx == columnSloRslt_maker_cd) doSloRslt_maker_cd_NX(info);
		else if (nx == columnSloRslt_maker_nm) doSloRslt_maker_nm_NX(info);
		else if (nx == columnSloRslt_wg_rqst_cnt_rmrks) doSloRslt_wg_rqst_cnt_rmrks_NX(info);
		else if (nx == columnSloRslt_loc_cd) doSloRslt_loc_cd_NX(info);
		else if (nx == columnSloRslt_loc_nm) doSloRslt_loc_nm_NX(info);
		else if (nx == columnSloRslt_ship_lg_grp_cd) doSloRslt_ship_lg_grp_cd_NX(info);
		else if (nx == columnSloRslt_ship_lg_grp_nm) doSloRslt_ship_lg_grp_nm_NX(info);
		else if (nx == columnSloRslt_alloc_grp_cd) doSloRslt_alloc_grp_cd_NX(info);
		else if (nx == columnSloRslt_alloc_grp_nm) doSloRslt_alloc_grp_nm_NX(info);
		else if (nx == columnSloRslt_ship_term_cd) doSloRslt_ship_term_cd_NX(info);
		else if (nx == columnSloRslt_ship_term_nm) doSloRslt_ship_term_nm_NX(info);
		else if (nx == columnSloRslt_ship_cnt_rmrks) doSloRslt_ship_cnt_rmrks_NX(info);
		else if (nx == columnSloRslt_cst_po_d_no) doSloRslt_cst_po_d_no_NX(info);
		else if (nx == columnSloRslt_cst_po_d_rmrks) doSloRslt_cst_po_d_rmrks_NX(info);
		else if (nx == columnSloRslt_sls_rsn_cd) doSloRslt_sls_rsn_cd_NX(info);
		else if (nx == columnSloRslt_sls_rsn_nm) doSloRslt_sls_rsn_nm_NX(info);
		else if (nx == columnSloRslt_trd_d_rmrks) doSloRslt_trd_d_rmrks_NX(info);
		else if (nx == columnSloRslt_intr_d_rmrks) doSloRslt_intr_d_rmrks_NX(info);
		else if (nx == columnSloRslt_ship_cmpl_flg) doSloRslt_ship_cmpl_flg_NX(info);
		else if (nx == columnSloRslt_sls_cmpl_flg) doSloRslt_sls_cmpl_flg_NX(info);
		else if (nx == columnSloRslt_ship_schd_split_flg) doSloRslt_ship_schd_split_flg_NX(info);
		else if (nx == columnSloRslt_base_unit_cd) doSloRslt_base_unit_cd_NX(info);
		else if (nx == columnSloRslt_base_unit_nm) doSloRslt_base_unit_nm_NX(info);
		else if (nx == columnSloRslt_base_unit_dec_place) doSloRslt_base_unit_dec_place_NX(info);
		else if (nx == columnSloRslt_base_unit_rnd_typ) doSloRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnSloRslt_sub_char1) doSloRslt_sub_char1_NX(info);
		else if (nx == columnSloRslt_sub_char2) doSloRslt_sub_char2_NX(info);
		else if (nx == columnSloRslt_sub_char3) doSloRslt_sub_char3_NX(info);
		else if (nx == columnSloRslt_ins_usr_id) doSloRslt_ins_usr_id_NX(info);
		else if (nx == columnSloRslt_ins_usr_nm) doSloRslt_ins_usr_nm_NX(info);
		else if (nx == columnSloRslt_ins_func_id) doSloRslt_ins_func_id_NX(info);
		else if (nx == columnSloRslt_ins_func_nm) doSloRslt_ins_func_nm_NX(info);
		else if (nx == columnSloRslt_ins_ts) doSloRslt_ins_ts_NX(info);
		else if (nx == columnSloRslt_upd_usr_id) doSloRslt_upd_usr_id_NX(info);
		else if (nx == columnSloRslt_upd_usr_nm) doSloRslt_upd_usr_nm_NX(info);
		else if (nx == columnSloRslt_upd_func_id) doSloRslt_upd_func_id_NX(info);
		else if (nx == columnSloRslt_upd_func_nm) doSloRslt_upd_func_nm_NX(info);
		else if (nx == columnSloRslt_upd_ts) doSloRslt_upd_ts_NX(info);
		else if (nx == columnSloRslt_upd_srv_req_no) doSloRslt_upd_srv_req_no_NX(info);
		else if (nx == columnSloRslt_ship_pr_upd_cntr) doSloRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == columnSloRslt_slo_upd_cntr) doSloRslt_slo_upd_cntr_NX(info);
		else if (nx == columnShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_NX(info);
		else if (nx == columnShipSchdRslt_pr_sts_typ) doShipSchdRslt_pr_sts_typ_NX(info);
		else if (nx == columnShipSchdRslt_pr_sts_typ_nm) doShipSchdRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnShipSchdRslt_alloc_sts_typ) doShipSchdRslt_alloc_sts_typ_NX(info);
		else if (nx == columnShipSchdRslt_alloc_sts_typ_nm) doShipSchdRslt_alloc_sts_typ_nm_NX(info);
		else if (nx == columnShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_NX(info);
		else if (nx == columnShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_NX(info);
		else if (nx == columnShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnShipSchdRslt_fix_flg) doShipSchdRslt_fix_flg_NX(info);
		else if (nx == columnShipSchdRslt_re_ship_schd_flg) doShipSchdRslt_re_ship_schd_flg_NX(info);
		else if (nx == columnShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_NX(info);
		else if (nx == columnShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_NX(info);
		else if (nx == columnShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_NX(info);
		else if (nx == columnShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_NX(info);
		else if (nx == columnShipSchdRslt_not_dt_calc_flg) doShipSchdRslt_not_dt_calc_flg_NX(info);
		else if (nx == columnShipSchdRslt_ship_wk_cd) doShipSchdRslt_ship_wk_cd_NX(info);
		else if (nx == columnShipSchdRslt_ship_wk_nm) doShipSchdRslt_ship_wk_nm_NX(info);
		else if (nx == columnShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_NX(info);
		else if (nx == columnShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_NX(info);
		else if (nx == columnShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_NX(info);
		else if (nx == columnShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_NX(info);
		else if (nx == columnShipSchdRslt_ship_block_flg) doShipSchdRslt_ship_block_flg_NX(info);
		else if (nx == columnShipSchdRslt_ship_abl_flg) doShipSchdRslt_ship_abl_flg_NX(info);
		else if (nx == columnShipSchdRslt_ship_fr_lg_grp_cd) doShipSchdRslt_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnShipSchdRslt_ship_fr_lg_grp_nm) doShipSchdRslt_ship_fr_lg_grp_nm_NX(info);
		else if (nx == columnShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_NX(info);
		else if (nx == columnShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_NX(info);
		else if (nx == columnShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_NX(info);
		else if (nx == columnShipSchdRslt_abort_flg) doShipSchdRslt_abort_flg_NX(info);
		else if (nx == columnShipSchdRslt_cmpl_flg) doShipSchdRslt_cmpl_flg_NX(info);
		else if (nx == columnShipSchdRslt_ship_term_cd) doShipSchdRslt_ship_term_cd_NX(info);
		else if (nx == columnShipSchdRslt_ship_term_nm) doShipSchdRslt_ship_term_nm_NX(info);
		else if (nx == columnShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_NX(info);
		else if (nx == columnShipSchdRslt_dlv_inst_rcpt_no) doShipSchdRslt_dlv_inst_rcpt_no_NX(info);
		else if (nx == columnShipSchdRslt_slo_prms_no) doShipSchdRslt_slo_prms_no_NX(info);
		else if (nx == columnShipSchdRslt_sls_act_d_no) doShipSchdRslt_sls_act_d_no_NX(info);
		else if (nx == columnShipSchdRslt_tdlv_req_flg) doShipSchdRslt_tdlv_req_flg_NX(info);
		else if (nx == columnShipSchdRslt_via_dlv_typ) doShipSchdRslt_via_dlv_typ_NX(info);
		else if (nx == columnShipSchdRslt_via_dlv_typ_nm) doShipSchdRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnShipSchdRslt_dlv_day_week_typ) doShipSchdRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnShipSchdRslt_dlv_day_week_typ_nm) doShipSchdRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnShipSchdRslt_ins_usr_id) doShipSchdRslt_ins_usr_id_NX(info);
		else if (nx == columnShipSchdRslt_ins_usr_nm) doShipSchdRslt_ins_usr_nm_NX(info);
		else if (nx == columnShipSchdRslt_ins_func_id) doShipSchdRslt_ins_func_id_NX(info);
		else if (nx == columnShipSchdRslt_ins_func_nm) doShipSchdRslt_ins_func_nm_NX(info);
		else if (nx == columnShipSchdRslt_ins_ts) doShipSchdRslt_ins_ts_NX(info);
		else if (nx == columnShipSchdRslt_upd_usr_id) doShipSchdRslt_upd_usr_id_NX(info);
		else if (nx == columnShipSchdRslt_upd_usr_nm) doShipSchdRslt_upd_usr_nm_NX(info);
		else if (nx == columnShipSchdRslt_upd_func_id) doShipSchdRslt_upd_func_id_NX(info);
		else if (nx == columnShipSchdRslt_upd_func_nm) doShipSchdRslt_upd_func_nm_NX(info);
		else if (nx == columnShipSchdRslt_upd_ts) doShipSchdRslt_upd_ts_NX(info);
		else if (nx == columnShipSchdRslt_upd_srv_req_no) doShipSchdRslt_upd_srv_req_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_slo_d_no) doDlvInstRcptRslt_slo_d_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_cst_dlv_inst_no) doDlvInstRcptRslt_cst_dlv_inst_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_cst_dlv_inst_rev) doDlvInstRcptRslt_cst_dlv_inst_rev_NX(info);
		else if (nx == columnDlvInstRcptRslt_cst_dlv_inst_d_no) doDlvInstRcptRslt_cst_dlv_inst_d_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_cst_dlv_inst_rmrks) doDlvInstRcptRslt_cst_dlv_inst_rmrks_NX(info);
		else if (nx == columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks) doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NX(info);
		else if (nx == columnDlvInstRcptRslt_intr_rmrks) doDlvInstRcptRslt_intr_rmrks_NX(info);
		else if (nx == columnDlvInstRcptRslt_trd_unit_cd) doDlvInstRcptRslt_trd_unit_cd_NX(info);
		else if (nx == columnDlvInstRcptRslt_trd_unit_nm) doDlvInstRcptRslt_trd_unit_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_trd_unit_dec_place) doDlvInstRcptRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnDlvInstRcptRslt_trd_unit_conv_base_qty) doDlvInstRcptRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDlvInstRcptRslt_trd_unit_conv_qty) doDlvInstRcptRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnDlvInstRcptRslt_base_unit_cd) doDlvInstRcptRslt_base_unit_cd_NX(info);
		else if (nx == columnDlvInstRcptRslt_base_unit_nm) doDlvInstRcptRslt_base_unit_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_base_unit_dec_place) doDlvInstRcptRslt_base_unit_dec_place_NX(info);
		else if (nx == columnDlvInstRcptRslt_base_unit_rnd_typ) doDlvInstRcptRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnDlvInstRcptRslt_edi_flg) doDlvInstRcptRslt_edi_flg_NX(info);
		else if (nx == columnDlvInstRcptRslt_dlv_inst_rcpt_no) doDlvInstRcptRslt_dlv_inst_rcpt_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_dlv_inst_rcpt_rev) doDlvInstRcptRslt_dlv_inst_rcpt_rev_NX(info);
		else if (nx == columnDlvInstRcptRslt_tdlv_req_flg) doDlvInstRcptRslt_tdlv_req_flg_NX(info);
		else if (nx == columnDlvInstRcptRslt_mst_via_dlv_typ) doDlvInstRcptRslt_mst_via_dlv_typ_NX(info);
		else if (nx == columnDlvInstRcptRslt_via_dlv_typ) doDlvInstRcptRslt_via_dlv_typ_NX(info);
		else if (nx == columnDlvInstRcptRslt_via_dlv_typ_nm) doDlvInstRcptRslt_via_dlv_typ_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_dlv_day_week_typ) doDlvInstRcptRslt_dlv_day_week_typ_NX(info);
		else if (nx == columnDlvInstRcptRslt_dlv_day_week_typ_nm) doDlvInstRcptRslt_dlv_day_week_typ_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_sub_char1) doDlvInstRcptRslt_sub_char1_NX(info);
		else if (nx == columnDlvInstRcptRslt_sub_char2) doDlvInstRcptRslt_sub_char2_NX(info);
		else if (nx == columnDlvInstRcptRslt_sub_char3) doDlvInstRcptRslt_sub_char3_NX(info);
		else if (nx == columnDlvInstRcptRslt_ins_usr_id) doDlvInstRcptRslt_ins_usr_id_NX(info);
		else if (nx == columnDlvInstRcptRslt_ins_usr_nm) doDlvInstRcptRslt_ins_usr_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_ins_func_id) doDlvInstRcptRslt_ins_func_id_NX(info);
		else if (nx == columnDlvInstRcptRslt_ins_func_nm) doDlvInstRcptRslt_ins_func_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_ins_ts) doDlvInstRcptRslt_ins_ts_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_usr_id) doDlvInstRcptRslt_upd_usr_id_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_usr_nm) doDlvInstRcptRslt_upd_usr_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_func_id) doDlvInstRcptRslt_upd_func_id_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_func_nm) doDlvInstRcptRslt_upd_func_nm_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_ts) doDlvInstRcptRslt_upd_ts_NX(info);
		else if (nx == columnDlvInstRcptRslt_upd_srv_req_no) doDlvInstRcptRslt_upd_srv_req_no_NX(info);
		else if (nx == columnDlvInstRcptRslt_ship_pr_upd_cntr) doDlvInstRcptRslt_ship_pr_upd_cntr_NX(info);
		else if (nx == columnDlvInstRcptRslt_slo_upd_cntr) doDlvInstRcptRslt_slo_upd_cntr_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_prms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_prms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[compl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_compl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
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
	 * [SloRslt]パネルの[sls_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_rev_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_rev_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_dt_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_inst_rcpt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_inst_rcpt_dt_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[vmi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_vmi_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_set_itm_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_rqst_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_rqst_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[re_ship_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_re_ship_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[not_dt_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_not_dt_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_hm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_block_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_block_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_abl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_abl_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_prms_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_prms_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sls_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sls_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[tdlv_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_tdlv_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_rev_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[tdlv_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_tdlv_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[mst_via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_mst_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ship_pr_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ship_pr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_slo_dt_fr) doCnd_slo_dt_fr_LC(info);
		else if (lc == Cnd_slo_dt_to) doCnd_slo_dt_to_LC(info);
		else if (lc == Cnd_dlv_inst_rcpt_dt_fr) doCnd_dlv_inst_rcpt_dt_fr_LC(info);
		else if (lc == Cnd_dlv_inst_rcpt_dt_to) doCnd_dlv_inst_rcpt_dt_to_LC(info);
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
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_cst_po_no) doCnd_cst_po_no_LC(info);
		else if (lc == Cnd_cst_po_d_no) doCnd_cst_po_d_no_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_wg_rqst_cnt_rmrks) doCnd_wg_rqst_cnt_rmrks_LC(info);
		else if (lc == Cnd_ship_cnt_rmrks) doCnd_ship_cnt_rmrks_LC(info);
		else if (lc == Cnd_cst_po_d_rmrks) doCnd_cst_po_d_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnSloRslt_sls_sts_typ) doSloRslt_sls_sts_typ_LC(info);
		else if (lc == columnSloRslt_sls_sts_typ_nm) doSloRslt_sls_sts_typ_nm_LC(info);
		else if (lc == columnSloRslt_alloc_sts_typ) doSloRslt_alloc_sts_typ_LC(info);
		else if (lc == columnSloRslt_alloc_sts_typ_nm) doSloRslt_alloc_sts_typ_nm_LC(info);
		else if (lc == columnSloRslt_trd_cd) doSloRslt_trd_cd_LC(info);
		else if (lc == columnSloRslt_trd_ptn_typ) doSloRslt_trd_ptn_typ_LC(info);
		else if (lc == columnSloRslt_trd_nm) doSloRslt_trd_nm_LC(info);
		else if (lc == columnSloRslt_slo_no) doSloRslt_slo_no_LC(info);
		else if (lc == columnSloRslt_slo_rev) doSloRslt_slo_rev_LC(info);
		else if (lc == columnSloRslt_slo_typ) doSloRslt_slo_typ_LC(info);
		else if (lc == columnSloRslt_slo_typ_nm) doSloRslt_slo_typ_nm_LC(info);
		else if (lc == columnSloRslt_aprv_no) doSloRslt_aprv_no_LC(info);
		else if (lc == columnSloRslt_aprv_sts_typ) doSloRslt_aprv_sts_typ_LC(info);
		else if (lc == columnSloRslt_aprv_sts_typ_nm) doSloRslt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnSloRslt_qtn_no) doSloRslt_qtn_no_LC(info);
		else if (lc == columnSloRslt_qtn_rev) doSloRslt_qtn_rev_LC(info);
		else if (lc == columnSloRslt_slo_dt) doSloRslt_slo_dt_LC(info);
		else if (lc == columnSloRslt_dlv_inst_rcpt_dt) doSloRslt_dlv_inst_rcpt_dt_LC(info);
		else if (lc == columnSloRslt_cst_cd) doSloRslt_cst_cd_LC(info);
		else if (lc == columnSloRslt_cst_nm) doSloRslt_cst_nm_LC(info);
		else if (lc == columnSloRslt_sls_usr_cd) doSloRslt_sls_usr_cd_LC(info);
		else if (lc == columnSloRslt_sls_usr_nm) doSloRslt_sls_usr_nm_LC(info);
		else if (lc == columnSloRslt_sls_dpt_cd) doSloRslt_sls_dpt_cd_LC(info);
		else if (lc == columnSloRslt_sls_dpt_nm) doSloRslt_sls_dpt_nm_LC(info);
		else if (lc == columnSloRslt_wg_cd) doSloRslt_wg_cd_LC(info);
		else if (lc == columnSloRslt_wg_nm) doSloRslt_wg_nm_LC(info);
		else if (lc == columnSloRslt_assort_typ) doSloRslt_assort_typ_LC(info);
		else if (lc == columnSloRslt_assort_typ_nm) doSloRslt_assort_typ_nm_LC(info);
		else if (lc == columnSloRslt_cst_po_no) doSloRslt_cst_po_no_LC(info);
		else if (lc == columnSloRslt_wrk_no) doSloRslt_wrk_no_LC(info);
		else if (lc == columnSloRslt_wrk_nm) doSloRslt_wrk_nm_LC(info);
		else if (lc == columnSloRslt_trd_rmrks) doSloRslt_trd_rmrks_LC(info);
		else if (lc == columnSloRslt_intr_rmrks) doSloRslt_intr_rmrks_LC(info);
		else if (lc == columnSloRslt_slo_d_no) doSloRslt_slo_d_no_LC(info);
		else if (lc == columnSloRslt_cst_itm_cd) doSloRslt_cst_itm_cd_LC(info);
		else if (lc == columnSloRslt_cst_itm_nm) doSloRslt_cst_itm_nm_LC(info);
		else if (lc == columnSloRslt_stk_mng_typ) doSloRslt_stk_mng_typ_LC(info);
		else if (lc == columnSloRslt_stk_mng_typ_nm) doSloRslt_stk_mng_typ_nm_LC(info);
		else if (lc == columnSloRslt_asset_mng_typ) doSloRslt_asset_mng_typ_LC(info);
		else if (lc == columnSloRslt_asset_mng_typ_nm) doSloRslt_asset_mng_typ_nm_LC(info);
		else if (lc == columnSloRslt_trd_unit_cd) doSloRslt_trd_unit_cd_LC(info);
		else if (lc == columnSloRslt_trd_unit_nm) doSloRslt_trd_unit_nm_LC(info);
		else if (lc == columnSloRslt_trd_unit_dec_place) doSloRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnSloRslt_trd_unit_conv_base_qty) doSloRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnSloRslt_trd_unit_conv_qty) doSloRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnSloRslt_set_itm_grp_no) doSloRslt_set_itm_grp_no_LC(info);
		else if (lc == columnSloRslt_dest_cd1) doSloRslt_dest_cd1_LC(info);
		else if (lc == columnSloRslt_dest_nm1) doSloRslt_dest_nm1_LC(info);
		else if (lc == columnSloRslt_dest_cd2) doSloRslt_dest_cd2_LC(info);
		else if (lc == columnSloRslt_dest_nm2) doSloRslt_dest_nm2_LC(info);
		else if (lc == columnSloRslt_dest_cd3) doSloRslt_dest_cd3_LC(info);
		else if (lc == columnSloRslt_dest_nm3) doSloRslt_dest_nm3_LC(info);
		else if (lc == columnSloRslt_via_dlv_typ) doSloRslt_via_dlv_typ_LC(info);
		else if (lc == columnSloRslt_via_dlv_typ_nm) doSloRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnSloRslt_dlv_day_week_typ) doSloRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnSloRslt_dlv_day_week_typ_nm) doSloRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnSloRslt_proc_typ) doSloRslt_proc_typ_LC(info);
		else if (lc == columnSloRslt_proc_typ_nm) doSloRslt_proc_typ_nm_LC(info);
		else if (lc == columnSloRslt_ship_inst_typ) doSloRslt_ship_inst_typ_LC(info);
		else if (lc == columnSloRslt_ship_inst_typ_nm) doSloRslt_ship_inst_typ_nm_LC(info);
		else if (lc == columnSloRslt_ship_schd_split_typ) doSloRslt_ship_schd_split_typ_LC(info);
		else if (lc == columnSloRslt_ship_schd_split_typ_nm) doSloRslt_ship_schd_split_typ_nm_LC(info);
		else if (lc == columnSloRslt_alloc_scope_typ) doSloRslt_alloc_scope_typ_LC(info);
		else if (lc == columnSloRslt_alloc_scope_typ_nm) doSloRslt_alloc_scope_typ_nm_LC(info);
		else if (lc == columnSloRslt_alloc_typ) doSloRslt_alloc_typ_LC(info);
		else if (lc == columnSloRslt_alloc_typ_nm) doSloRslt_alloc_typ_nm_LC(info);
		else if (lc == columnSloRslt_rqst_to_loc_cd) doSloRslt_rqst_to_loc_cd_LC(info);
		else if (lc == columnSloRslt_rqst_to_loc_nm) doSloRslt_rqst_to_loc_nm_LC(info);
		else if (lc == columnSloRslt_sppl_cd) doSloRslt_sppl_cd_LC(info);
		else if (lc == columnSloRslt_sppl_nm) doSloRslt_sppl_nm_LC(info);
		else if (lc == columnSloRslt_maker_cd) doSloRslt_maker_cd_LC(info);
		else if (lc == columnSloRslt_maker_nm) doSloRslt_maker_nm_LC(info);
		else if (lc == columnSloRslt_wg_rqst_cnt_rmrks) doSloRslt_wg_rqst_cnt_rmrks_LC(info);
		else if (lc == columnSloRslt_loc_cd) doSloRslt_loc_cd_LC(info);
		else if (lc == columnSloRslt_loc_nm) doSloRslt_loc_nm_LC(info);
		else if (lc == columnSloRslt_ship_lg_grp_cd) doSloRslt_ship_lg_grp_cd_LC(info);
		else if (lc == columnSloRslt_ship_lg_grp_nm) doSloRslt_ship_lg_grp_nm_LC(info);
		else if (lc == columnSloRslt_alloc_grp_cd) doSloRslt_alloc_grp_cd_LC(info);
		else if (lc == columnSloRslt_alloc_grp_nm) doSloRslt_alloc_grp_nm_LC(info);
		else if (lc == columnSloRslt_ship_term_cd) doSloRslt_ship_term_cd_LC(info);
		else if (lc == columnSloRslt_ship_term_nm) doSloRslt_ship_term_nm_LC(info);
		else if (lc == columnSloRslt_ship_cnt_rmrks) doSloRslt_ship_cnt_rmrks_LC(info);
		else if (lc == columnSloRslt_cst_po_d_no) doSloRslt_cst_po_d_no_LC(info);
		else if (lc == columnSloRslt_cst_po_d_rmrks) doSloRslt_cst_po_d_rmrks_LC(info);
		else if (lc == columnSloRslt_sls_rsn_cd) doSloRslt_sls_rsn_cd_LC(info);
		else if (lc == columnSloRslt_sls_rsn_nm) doSloRslt_sls_rsn_nm_LC(info);
		else if (lc == columnSloRslt_trd_d_rmrks) doSloRslt_trd_d_rmrks_LC(info);
		else if (lc == columnSloRslt_intr_d_rmrks) doSloRslt_intr_d_rmrks_LC(info);
		else if (lc == columnSloRslt_base_unit_cd) doSloRslt_base_unit_cd_LC(info);
		else if (lc == columnSloRslt_base_unit_nm) doSloRslt_base_unit_nm_LC(info);
		else if (lc == columnSloRslt_base_unit_dec_place) doSloRslt_base_unit_dec_place_LC(info);
		else if (lc == columnSloRslt_base_unit_rnd_typ) doSloRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnSloRslt_sub_char1) doSloRslt_sub_char1_LC(info);
		else if (lc == columnSloRslt_sub_char2) doSloRslt_sub_char2_LC(info);
		else if (lc == columnSloRslt_sub_char3) doSloRslt_sub_char3_LC(info);
		else if (lc == columnSloRslt_ins_usr_id) doSloRslt_ins_usr_id_LC(info);
		else if (lc == columnSloRslt_ins_usr_nm) doSloRslt_ins_usr_nm_LC(info);
		else if (lc == columnSloRslt_ins_func_id) doSloRslt_ins_func_id_LC(info);
		else if (lc == columnSloRslt_ins_func_nm) doSloRslt_ins_func_nm_LC(info);
		else if (lc == columnSloRslt_ins_ts) doSloRslt_ins_ts_LC(info);
		else if (lc == columnSloRslt_upd_usr_id) doSloRslt_upd_usr_id_LC(info);
		else if (lc == columnSloRslt_upd_usr_nm) doSloRslt_upd_usr_nm_LC(info);
		else if (lc == columnSloRslt_upd_func_id) doSloRslt_upd_func_id_LC(info);
		else if (lc == columnSloRslt_upd_func_nm) doSloRslt_upd_func_nm_LC(info);
		else if (lc == columnSloRslt_upd_ts) doSloRslt_upd_ts_LC(info);
		else if (lc == columnSloRslt_upd_srv_req_no) doSloRslt_upd_srv_req_no_LC(info);
		else if (lc == columnSloRslt_ship_pr_upd_cntr) doSloRslt_ship_pr_upd_cntr_LC(info);
		else if (lc == columnSloRslt_slo_upd_cntr) doSloRslt_slo_upd_cntr_LC(info);
		else if (lc == columnShipSchdRslt_slo_d_no) doShipSchdRslt_slo_d_no_LC(info);
		else if (lc == columnShipSchdRslt_pr_sts_typ) doShipSchdRslt_pr_sts_typ_LC(info);
		else if (lc == columnShipSchdRslt_pr_sts_typ_nm) doShipSchdRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnShipSchdRslt_alloc_sts_typ) doShipSchdRslt_alloc_sts_typ_LC(info);
		else if (lc == columnShipSchdRslt_alloc_sts_typ_nm) doShipSchdRslt_alloc_sts_typ_nm_LC(info);
		else if (lc == columnShipSchdRslt_trd_unit_cd) doShipSchdRslt_trd_unit_cd_LC(info);
		else if (lc == columnShipSchdRslt_trd_unit_nm) doShipSchdRslt_trd_unit_nm_LC(info);
		else if (lc == columnShipSchdRslt_trd_unit_dec_place) doShipSchdRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnShipSchdRslt_ship_rqst_dt) doShipSchdRslt_ship_rqst_dt_LC(info);
		else if (lc == columnShipSchdRslt_ship_rqst_hm) doShipSchdRslt_ship_rqst_hm_LC(info);
		else if (lc == columnShipSchdRslt_pd_inst_dlv_dt) doShipSchdRslt_pd_inst_dlv_dt_LC(info);
		else if (lc == columnShipSchdRslt_pd_inst_dlv_hm) doShipSchdRslt_pd_inst_dlv_hm_LC(info);
		else if (lc == columnShipSchdRslt_ship_wk_cd) doShipSchdRslt_ship_wk_cd_LC(info);
		else if (lc == columnShipSchdRslt_ship_wk_nm) doShipSchdRslt_ship_wk_nm_LC(info);
		else if (lc == columnShipSchdRslt_ship_schd_dt) doShipSchdRslt_ship_schd_dt_LC(info);
		else if (lc == columnShipSchdRslt_ship_schd_hm) doShipSchdRslt_ship_schd_hm_LC(info);
		else if (lc == columnShipSchdRslt_dlv_schd_dt) doShipSchdRslt_dlv_schd_dt_LC(info);
		else if (lc == columnShipSchdRslt_dlv_schd_hm) doShipSchdRslt_dlv_schd_hm_LC(info);
		else if (lc == columnShipSchdRslt_ship_fr_lg_grp_cd) doShipSchdRslt_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnShipSchdRslt_ship_fr_lg_grp_nm) doShipSchdRslt_ship_fr_lg_grp_nm_LC(info);
		else if (lc == columnShipSchdRslt_base_unit_cd) doShipSchdRslt_base_unit_cd_LC(info);
		else if (lc == columnShipSchdRslt_base_unit_nm) doShipSchdRslt_base_unit_nm_LC(info);
		else if (lc == columnShipSchdRslt_base_unit_dec_place) doShipSchdRslt_base_unit_dec_place_LC(info);
		else if (lc == columnShipSchdRslt_ship_term_cd) doShipSchdRslt_ship_term_cd_LC(info);
		else if (lc == columnShipSchdRslt_ship_term_nm) doShipSchdRslt_ship_term_nm_LC(info);
		else if (lc == columnShipSchdRslt_ship_schd_no) doShipSchdRslt_ship_schd_no_LC(info);
		else if (lc == columnShipSchdRslt_dlv_inst_rcpt_no) doShipSchdRslt_dlv_inst_rcpt_no_LC(info);
		else if (lc == columnShipSchdRslt_slo_prms_no) doShipSchdRslt_slo_prms_no_LC(info);
		else if (lc == columnShipSchdRslt_sls_act_d_no) doShipSchdRslt_sls_act_d_no_LC(info);
		else if (lc == columnShipSchdRslt_via_dlv_typ) doShipSchdRslt_via_dlv_typ_LC(info);
		else if (lc == columnShipSchdRslt_via_dlv_typ_nm) doShipSchdRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnShipSchdRslt_dlv_day_week_typ) doShipSchdRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnShipSchdRslt_dlv_day_week_typ_nm) doShipSchdRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnShipSchdRslt_ins_usr_id) doShipSchdRslt_ins_usr_id_LC(info);
		else if (lc == columnShipSchdRslt_ins_usr_nm) doShipSchdRslt_ins_usr_nm_LC(info);
		else if (lc == columnShipSchdRslt_ins_func_id) doShipSchdRslt_ins_func_id_LC(info);
		else if (lc == columnShipSchdRslt_ins_func_nm) doShipSchdRslt_ins_func_nm_LC(info);
		else if (lc == columnShipSchdRslt_ins_ts) doShipSchdRslt_ins_ts_LC(info);
		else if (lc == columnShipSchdRslt_upd_usr_id) doShipSchdRslt_upd_usr_id_LC(info);
		else if (lc == columnShipSchdRslt_upd_usr_nm) doShipSchdRslt_upd_usr_nm_LC(info);
		else if (lc == columnShipSchdRslt_upd_func_id) doShipSchdRslt_upd_func_id_LC(info);
		else if (lc == columnShipSchdRslt_upd_func_nm) doShipSchdRslt_upd_func_nm_LC(info);
		else if (lc == columnShipSchdRslt_upd_ts) doShipSchdRslt_upd_ts_LC(info);
		else if (lc == columnShipSchdRslt_upd_srv_req_no) doShipSchdRslt_upd_srv_req_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_slo_d_no) doDlvInstRcptRslt_slo_d_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_cst_dlv_inst_no) doDlvInstRcptRslt_cst_dlv_inst_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_cst_dlv_inst_rev) doDlvInstRcptRslt_cst_dlv_inst_rev_LC(info);
		else if (lc == columnDlvInstRcptRslt_cst_dlv_inst_d_no) doDlvInstRcptRslt_cst_dlv_inst_d_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_cst_dlv_inst_rmrks) doDlvInstRcptRslt_cst_dlv_inst_rmrks_LC(info);
		else if (lc == columnDlvInstRcptRslt_cst_dlv_inst_d_rmrks) doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_LC(info);
		else if (lc == columnDlvInstRcptRslt_intr_rmrks) doDlvInstRcptRslt_intr_rmrks_LC(info);
		else if (lc == columnDlvInstRcptRslt_trd_unit_cd) doDlvInstRcptRslt_trd_unit_cd_LC(info);
		else if (lc == columnDlvInstRcptRslt_trd_unit_nm) doDlvInstRcptRslt_trd_unit_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_trd_unit_dec_place) doDlvInstRcptRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnDlvInstRcptRslt_trd_unit_conv_base_qty) doDlvInstRcptRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDlvInstRcptRslt_trd_unit_conv_qty) doDlvInstRcptRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnDlvInstRcptRslt_base_unit_cd) doDlvInstRcptRslt_base_unit_cd_LC(info);
		else if (lc == columnDlvInstRcptRslt_base_unit_nm) doDlvInstRcptRslt_base_unit_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_base_unit_dec_place) doDlvInstRcptRslt_base_unit_dec_place_LC(info);
		else if (lc == columnDlvInstRcptRslt_base_unit_rnd_typ) doDlvInstRcptRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnDlvInstRcptRslt_dlv_inst_rcpt_no) doDlvInstRcptRslt_dlv_inst_rcpt_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_dlv_inst_rcpt_rev) doDlvInstRcptRslt_dlv_inst_rcpt_rev_LC(info);
		else if (lc == columnDlvInstRcptRslt_mst_via_dlv_typ) doDlvInstRcptRslt_mst_via_dlv_typ_LC(info);
		else if (lc == columnDlvInstRcptRslt_via_dlv_typ) doDlvInstRcptRslt_via_dlv_typ_LC(info);
		else if (lc == columnDlvInstRcptRslt_via_dlv_typ_nm) doDlvInstRcptRslt_via_dlv_typ_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_dlv_day_week_typ) doDlvInstRcptRslt_dlv_day_week_typ_LC(info);
		else if (lc == columnDlvInstRcptRslt_dlv_day_week_typ_nm) doDlvInstRcptRslt_dlv_day_week_typ_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_sub_char1) doDlvInstRcptRslt_sub_char1_LC(info);
		else if (lc == columnDlvInstRcptRslt_sub_char2) doDlvInstRcptRslt_sub_char2_LC(info);
		else if (lc == columnDlvInstRcptRslt_sub_char3) doDlvInstRcptRslt_sub_char3_LC(info);
		else if (lc == columnDlvInstRcptRslt_ins_usr_id) doDlvInstRcptRslt_ins_usr_id_LC(info);
		else if (lc == columnDlvInstRcptRslt_ins_usr_nm) doDlvInstRcptRslt_ins_usr_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_ins_func_id) doDlvInstRcptRslt_ins_func_id_LC(info);
		else if (lc == columnDlvInstRcptRslt_ins_func_nm) doDlvInstRcptRslt_ins_func_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_ins_ts) doDlvInstRcptRslt_ins_ts_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_usr_id) doDlvInstRcptRslt_upd_usr_id_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_usr_nm) doDlvInstRcptRslt_upd_usr_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_func_id) doDlvInstRcptRslt_upd_func_id_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_func_nm) doDlvInstRcptRslt_upd_func_nm_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_ts) doDlvInstRcptRslt_upd_ts_LC(info);
		else if (lc == columnDlvInstRcptRslt_upd_srv_req_no) doDlvInstRcptRslt_upd_srv_req_no_LC(info);
		else if (lc == columnDlvInstRcptRslt_ship_pr_upd_cntr) doDlvInstRcptRslt_ship_pr_upd_cntr_LC(info);
		else if (lc == columnDlvInstRcptRslt_slo_upd_cntr) doDlvInstRcptRslt_slo_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[slo_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_inst_rcpt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_inst_rcpt_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_po_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_po_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
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
	 * [SloRslt]パネルの[sls_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_rev_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[qtn_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_qtn_rev_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_dt_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_inst_rcpt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_inst_rcpt_dt_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[assort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_assort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_set_itm_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_via_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[dlv_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_dlv_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_inst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_schd_split_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_schd_split_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_scope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_scope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[rqst_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_rqst_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[wg_rqst_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_wg_rqst_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[cst_po_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_cst_po_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sls_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sls_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [SloRslt]パネルの[slo_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloRslt_slo_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[alloc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_alloc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[pd_inst_dlv_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_pd_inst_dlv_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_schd_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_schd_hm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_inst_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_inst_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[slo_prms_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_slo_prms_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[sls_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_sls_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_via_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[dlv_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_dlv_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ShipSchdRslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doShipSchdRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[cst_dlv_inst_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_cst_dlv_inst_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_inst_rcpt_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_inst_rcpt_rev_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[mst_via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_mst_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_via_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[dlv_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_dlv_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[ship_pr_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_ship_pr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DlvInstRcptRslt]パネルの[slo_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlvInstRcptRslt_slo_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cst_nm]の作成メソッド
	 */
	public MCList getCnd_cst_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_nm]の作成メソッド
	 */
	public MCList getCnd_dlv_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_nm1]の作成メソッド
	 */
	public MCList getCnd_dest_nm1(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_nm2]の作成メソッド
	 */
	public MCList getCnd_dest_nm2(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_nm3]の作成メソッド
	 */
	public MCList getCnd_dest_nm3(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_nm]の作成メソッド
	 */
	public MCList getCnd_tdlv_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
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
	 * コンボ／リストのリスト[columnShipSchdRslt_via_dlv_typ]の作成メソッド
	 */
	public MCList getShipSchdRslt_via_dlv_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnShipSchdRslt_dlv_day_week_typ_nm]の作成メソッド
	 */
	public MCList getShipSchdRslt_dlv_day_week_typ_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[DlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd]の作成メソッド
	 */
	public MCList getDlvInstRcptRslt_dlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[DlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd]の作成メソッド
	 */
	public MCList getDlvInstRcptRslt_tdlv_p_PPanel_columnDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDlvInstRcptRslt_via_dlv_typ]の作成メソッド
	 */
	public MCList getDlvInstRcptRslt_via_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getViaDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDlvInstRcptRslt_dlv_day_week_typ_nm]の作成メソッド
	 */
	public MCList getDlvInstRcptRslt_dlv_day_week_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDayWeekTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1240.Srch01")) {
			return new MS_MSBBL1240_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1240.Upd01")) {
			return new MS_MSBBL1240_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1240_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1240_Srch01Bridge() {
			p_MS_MSBBL1240_Srch01 = new MCParam(PDef.MS_MSBBL1240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class));

			p_MS_MSBBL1240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1240_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1240.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1240.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR>)down(1);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> down2() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1240_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.SloRsltR.class));
			p_MS_MSBBL1240_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.class));
			p_MS_MSBBL1240_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1240_Srch01;
		}

		protected void show() {
			setSloRsltL((MCList<mcframe.clientMSBB.MSBBP1240.SloRsltR>)p_MS_MSBBL1240_Srch01.getContainerParam().getDownBlock(0));
			setShipSchdRsltL((MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR>)p_MS_MSBBL1240_Srch01.getContainerParam().getDownBlock(1));
			setDlvInstRcptRsltL((MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR>)p_MS_MSBBL1240_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getSloRsltL().clear();
			getShipSchdRsltL().clear();
			getDlvInstRcptRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSloRsltL());
			result.add(getShipSchdRsltL());
			result.add(getDlvInstRcptRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1240_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1240_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1240_Upd01;

		/** コンストラクタ */
		protected MS_MSBBL1240_Upd01Bridge() {
			p_MS_MSBBL1240_Upd01 = new MCParam(PDef.MS_MSBBL1240_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1240_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.class));

			p_MS_MSBBL1240_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1240_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1240_Upd01.addUpBlock(getDlvInstRcptRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1240_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1240_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> up0() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR> down1() {
			return (MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1240_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR.class));
			p_MS_MSBBL1240_Upd01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1240_Upd01;
		}

		protected void show() {
			setDlvInstRcptRsltL((MCList<mcframe.clientMSBB.MSBBP1240.DlvInstRcptRsltR>)p_MS_MSBBL1240_Upd01.getContainerParam().getDownBlock(0));
			setShipSchdRsltL((MCList<mcframe.clientMSBB.MSBBP1240.ShipSchdRsltR>)p_MS_MSBBL1240_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDlvInstRcptRsltL().clear();
			getShipSchdRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDlvInstRcptRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDlvInstRcptRsltL());
			result.add(getShipSchdRsltL());
			return result;
		}
	}
}