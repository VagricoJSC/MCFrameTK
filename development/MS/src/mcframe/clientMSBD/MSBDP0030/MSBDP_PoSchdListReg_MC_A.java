package mcframe.clientMSBD.MSBDP0030;

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
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Srch01Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt01Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt02Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt03Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Imp01Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Ins01Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd01Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd02Caller;
import mcframe.clientMSBD.MSBDP0030.MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Del01Caller;

/**
 * 画面"MSBDP_PoSchdListReg"パネルクラスです。<p>
 *
 * 発注予定を一括で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PoSchdListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0030";

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
	// [PoSts]ブロック関連のField定義
	public MCPanel PoStsPanel = null;
	public MCTitledBorder PoStsTitledBorder = null;
	// [PoSts]ブロックの項目のField定義
	// [TOP]ブロック関連のField定義
	public MCPanel TOPPanel = null;
	// [TOP]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [SpplGrp]ブロック関連のField定義
	public MCPanel SpplGrpPanel = null;
	// [SpplGrp]ブロックの項目のField定義
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,0;UPD,Modify,1;UPD_CRCT,View (Edited by request source),4;SPLIT,Split,5;DEL,Cancel,2;REF,View,3; INS,登録する,0;UPD,訂正する,1;UPD_CRCT,依頼元訂正あり,4;SPLIT,分割する,5;DEL,取り消す,2;REF,参照する,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_UPD_CRCT = null;
	public MCRadioButton Cnd_ope_SPLIT = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * PO not placed 未発注.<p>
	 *
	 */
	public MCCheckBox Cnd_po_schd_flg = null;
	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_po_flg = null;
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
	 * Unit price 本単価.<p>
	 *
	 */
	public MCCheckBox Cnd_not_interim_flg = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCCheckBox Cnd_interim_flg = null;
	public MCLabel Cnd_po_schd_dt_fr_Label = null;
	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_po_schd_dt_fr = null;
	public MCLabel Cnd_po_schd_dt_to_Label = null;
	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_po_schd_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_frto_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_frto_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_frto_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_frto_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_frto_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_reg_dt_fr_Label = null;
	/**
	 * Entry date FROM 登録日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_reg_dt_fr = null;
	public MCLabel Cnd_reg_dt_to_Label = null;
	/**
	 * Entry date TO 登録日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_reg_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_rqst_dlv_rqst_dt_frto_p_PPanel;
	public MCDateField Cnd_rqst_dlv_rqst_dt_fr;	// [Cnd]の[rqst_dlv_rqst_dt_frto_p.ymd_fr]を[Cnd_rqst_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_hm_fr;	// [Cnd]の[rqst_dlv_rqst_dt_frto_p.hm_fr]を[Cnd_rqst_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_dt_to;	// [Cnd]の[rqst_dlv_rqst_dt_frto_p.ymd_to]を[Cnd_rqst_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_rqst_dlv_rqst_hm_to;	// [Cnd]の[rqst_dlv_rqst_dt_frto_p.hm_to]を[Cnd_rqst_dlv_rqst_hm_to]としてエイリアス定義。
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
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
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
	public MCLabel Cnd_in_to_loc_wg_cd_Label = null;
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_loc_wg_nm = null;
	public MCLabel Cnd_in_to_loc_cd_Label = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCTextField Cnd_in_to_loc_nm = null;
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_purc_usr_cd_Label = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCTextField Cnd_purc_usr_nm = null;
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
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * Purchasing dept. WG cd. 購買部門ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * Purchasing dept. WG name 購買部門ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_rqst_wg_cd_Label = null;
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_wg_nm = null;
	public MCLabel Cnd_rqst_fr_usr_cd_Label = null;
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_usr_nm = null;
	public MCLabel Cnd_rqst_fr_dpt_cd_Label = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_fr_dpt_nm = null;
	public MCLabel Cnd_po_schd_src_typ_Label = null;
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_po_schd_src_typ = null;
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_po_schd_src_typ_nm = null;
	public MCLabel Cnd_po_schd_src_no_Label = null;
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_schd_src_no = null;
	public MCLabel Cnd_wg_rqst_src_typ_Label = null;
	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_rqst_src_typ = null;
	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_src_typ_nm = null;
	public MCLabel Cnd_wg_rqst_src_no_Label = null;
	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_src_no = null;
	public MCLabel Cnd_po_schd_chg_typ_Label = null;
	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_po_schd_chg_typ = null;
	/**
	 * PO schedule change type name 発注予定変更区分名.<p>
	 *
	 */
	public MCTextField Cnd_po_schd_chg_typ_nm = null;
	public MCLabel Cnd_purc_sts_typ_Label = null;
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_sts_typ = null;
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_purc_sts_typ_nm = null;
	/**
	 * Include cancel remaining 打切含む.<p>
	 *
	 */
	public MCCheckBox Cnd_abort_flg = null;
	public MCLabel Cnd_po_schd_no_Label = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_schd_no = null;
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
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_wg_rqst_no_Label = null;
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_wg_rqst_no = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_po_cnt_rmrks_Label = null;
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_po_cnt_rmrks = null;
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
	public MCCheckBox Cnd_rqst_crrct_flg = null;
	// [IvTrgt]ブロック関連のField定義
	public MCPanel IvTrgtPanel = null;
	public MCTitledBorder IvTrgtTitledBorder = null;
	// [IvTrgt]ブロックの項目のField定義
	// [Interim]ブロック関連のField定義
	public MCPanel InterimPanel = null;
	public MCTitledBorder InterimTitledBorder = null;
	// [Interim]ブロックの項目のField定義
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
	public MCLabel BulkSet_reg_dt_Label = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDateField BulkSet_reg_dt = null;
	public MCLabel BulkSet_rqst_wg_cd_Label = null;
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox BulkSet_rqst_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCTextField BulkSet_rqst_wg_nm = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_rqst_fr_usr_dpt_p_PPanel;
	public MCTextField BulkSet_rqst_fr_usr_cd;	// [BulkSet]の[rqst_fr_usr_dpt_p.usr_cd]を[BulkSet_rqst_fr_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_fr_usr_nm;	// [BulkSet]の[rqst_fr_usr_dpt_p.usr_nm]を[BulkSet_rqst_fr_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_rqst_fr_dpt_cd;	// [BulkSet]の[rqst_fr_usr_dpt_p.dpt_cd]を[BulkSet_rqst_fr_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_rqst_fr_dpt_nm;	// [BulkSet]の[rqst_fr_usr_dpt_p.dpt_nm]を[BulkSet_rqst_fr_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_purc_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_purc_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_purc_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_purc_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_purc_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_purc_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_purc_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_purc_dpt_nm]としてエイリアス定義。
	public MCLabel BulkSet_purc_dpt_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField BulkSet_purc_dpt_wg_cd = null;
	public MCLabel BulkSet_purc_dpt_wg_nm_Label = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField BulkSet_purc_dpt_wg_nm = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0030.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Edited by request source 依頼元訂正.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_crrct_flg = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abort_flg = null;
	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_upd_stop_flg = null;
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_reg_dt = null;
	/**
	 * Delivery location 納入場所.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_nm = null;
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_nm = null;
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_drct_dlv_typ = null;
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_drct_dlv_typ_nm = null;
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_sppl_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_tgt_flg = null;
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cal_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_grp_cd = null;
	/**
	 * Available delivery location WG cd. (Before change) 変更前納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_in_to_loc_wg_cd = null;
	/**
	 * Distribution group cd. (Before change) 変更前物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_lg_grp_cd = null;
	/**
	 * Before change mfg. location group cd. 変更前製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_loc_grp_cd = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl_dlv_rqst_dt;// [Dtl]の[dlv_rqst_tm_p.ymd]を[columnDtl_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_rqst_hm;// [Dtl]の[dlv_rqst_tm_p.hm]を[columnDtl_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_str_ln_cd;// [Dtl]の[str_ln_p.str_ln_cd]を[columnDtl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_nm;// [Dtl]の[str_ln_p.str_ln_nm]を[columnDtl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_cd_none_flg;// [Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl_str_ln_cd_none_flg]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_purc_upri_cng_flg = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_inst_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_cont_qty;// [Dtl]の[inst_cont_qty_p.cont_qty]を[columnDtl_cont_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	/**
	 * Requesting WG cd. 依頼元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_wg_cd = null;
	/**
	 * Requesting WG name 依頼元ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_rqst_fr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_rqst_fr_usr_cd;// [Dtl]の[rqst_fr_dpt_p.usr_cd]を[columnDtl_rqst_fr_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_rqst_fr_usr_nm;// [Dtl]の[rqst_fr_dpt_p.usr_nm]を[columnDtl_rqst_fr_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_rqst_fr_dpt_cd;// [Dtl]の[rqst_fr_dpt_p.dpt_cd]を[columnDtl_rqst_fr_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_rqst_fr_dpt_nm;// [Dtl]の[rqst_fr_dpt_p.dpt_nm]を[columnDtl_rqst_fr_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_show_dtl;// [Dtl]の[dlv_p.show_dtl]を[columnDtl_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_lg_grp_cd;// [Dtl]の[dlv_p.lg_grp_cd]を[columnDtl_dlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_cd;// [Dtl]の[dlv_p.cntry_cd]を[columnDtl_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_nm;// [Dtl]の[dlv_p.cntry_nm]を[columnDtl_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_p.dlv_cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_p.dlv_cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cal_cd = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_tdlv_p_PPanel;
	public MCColumnConfig columnDtl_tdlv_cd;// [Dtl]の[tdlv_p.bp_cd]を[columnDtl_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_nm;// [Dtl]の[tdlv_p.bp_nm]を[columnDtl_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_sundry_flg;// [Dtl]の[tdlv_p.dlv_sundry_flg]を[columnDtl_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_show_dtl;// [Dtl]の[tdlv_p.show_dtl]を[columnDtl_tdlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_lg_grp_cd;// [Dtl]の[tdlv_p.lg_grp_cd]を[columnDtl_tdlv_lg_grp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntry_cd;// [Dtl]の[tdlv_p.cntry_cd]を[columnDtl_tdlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntry_nm;// [Dtl]の[tdlv_p.cntry_nm]を[columnDtl_tdlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_zip_cd;// [Dtl]の[tdlv_p.zip_cd]を[columnDtl_tdlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr1;// [Dtl]の[tdlv_p.addr1]を[columnDtl_tdlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr2;// [Dtl]の[tdlv_p.addr2]を[columnDtl_tdlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr3;// [Dtl]の[tdlv_p.addr3]を[columnDtl_tdlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_addr4;// [Dtl]の[tdlv_p.addr4]を[columnDtl_tdlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_tel;// [Dtl]の[tdlv_p.tel]を[columnDtl_tdlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_fax;// [Dtl]の[tdlv_p.fax]を[columnDtl_tdlv_fax]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntct_dpt;// [Dtl]の[tdlv_p.dlv_cntct_dpt]を[columnDtl_tdlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_cntct_psn;// [Dtl]の[tdlv_p.dlv_cntct_psn]を[columnDtl_tdlv_cntct_psn]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_iv_flg = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prnt_lcl_cd = null;
	/**
	 * Allow changing supplier purchasing unit price 発注先購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_purc_upri_cng_flg = null;
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cal_cd = null;
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_rnd_typ = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_nm = null;
	/**
	 * Supplier item 発注先品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_nm = null;
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_avl_rqst_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_rqst_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl_rqst_dlv_rqst_dt;// [Dtl]の[rqst_dlv_rqst_tm_p.ymd]を[columnDtl_rqst_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_rqst_dlv_rqst_hm;// [Dtl]の[rqst_dlv_rqst_tm_p.hm]を[columnDtl_rqst_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_dt = null;
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_dt = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_itm_ord_no = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_purc_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_purc_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_purc_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_purc_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_purc_dpt_nm]としてエイリアス定義。
	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_purc_usr_cd = null;
	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_purc_dpt_cd = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dpt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dpt_wg_nm = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_req_typ_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_nm = null;
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_amt_dec_place = null;
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_upri_not_tgt_flg;// [Dtl]の[trd_cur_upri_p.upri_not_tgt_flg]を[columnDtl_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_upri;// [Dtl]の[trd_cur_upri_p.trd_cur_upri]を[columnDtl_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl_interim_flg;// [Dtl]の[trd_cur_upri_p.interim_flg]を[columnDtl_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_amt]を[columnDtl_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_inc_tax_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_inc_tax_amt]を[columnDtl_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_fix_flg;// [Dtl]の[trd_cur_upri_p.tax_fix_flg]を[columnDtl_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_cd;// [Dtl]の[trd_cur_upri_p.tax_cd]を[columnDtl_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_nm;// [Dtl]の[trd_cur_upri_p.tax_nm]を[columnDtl_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_rate;// [Dtl]の[trd_cur_upri_p.tax_rate]を[columnDtl_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl_tax_typ;// [Dtl]の[trd_cur_upri_p.tax_typ]を[columnDtl_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_inc_tax_flg;// [Dtl]の[trd_cur_upri_p.inc_tax_flg]を[columnDtl_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_tax_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_tax_amt]を[columnDtl_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_trd_cur_dscnt_amt;// [Dtl]の[trd_cur_upri_p.trd_cur_dscnt_amt]を[columnDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_cd;// [Dtl]の[trd_cur_upri_p.dscnt_rsn_cd]を[columnDtl_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dscnt_rsn_nm;// [Dtl]の[trd_cur_upri_p.dscnt_rsn_nm]を[columnDtl_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl_repurc_obli_flg = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_proc_upri;// [Dtl]の[trd_cur_proc_upri_p.upri]を[columnDtl_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_proc_amt;// [Dtl]の[trd_cur_proc_amt_p.amt]を[columnDtl_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_onr_prov_upri;// [Dtl]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_trd_cur_onr_prov_amt;// [Dtl]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl_trd_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_upri = null;
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_proc_upri = null;
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_trd_cur_onr_prov_upri = null;
	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_old_interim_flg = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_cd = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_xrate_p_PPanel;
	public MCColumnConfig columnDtl_xrate;// [Dtl]の[xrate_p.xrate]を[columnDtl_xrate]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_nm = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_amt_dec_place = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_upri;// [Dtl]の[base_cur_proc_upri_p.upri]を[columnDtl_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_amt;// [Dtl]の[base_cur_proc_amt_p.amt]を[columnDtl_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_upri;// [Dtl]の[base_cur_onr_prov_upri_p.upri]を[columnDtl_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_amt;// [Dtl]の[base_cur_onr_prov_amt_p.amt]を[columnDtl_base_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_ptax_xrate_p_PPanel;
	public MCColumnConfig columnDtl_ptax_xrate;// [Dtl]の[ptax_xrate_p.xrate]を[columnDtl_ptax_xrate]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_nm = null;
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_upri;// [Dtl]の[ptax_cur_upri_p.upri]を[columnDtl_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_amt;// [Dtl]の[ptax_cur_amt_p.amt]を[columnDtl_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_upri;// [Dtl]の[ptax_cur_proc_upri_p.upri]を[columnDtl_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_amt;// [Dtl]の[ptax_cur_proc_amt_p.amt]を[columnDtl_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_upri;// [Dtl]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_amt;// [Dtl]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl_ptax_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_rsn_nm = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xpns_purc_flg = null;
	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_xpns_purc_flg = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Dtl_bditm_p_PPanel;
	public MCColumnConfig columnDtl_bd_dpt_cd;// [Dtl]の[bditm_p.bd_dpt_cd]を[columnDtl_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_dpt_nm;// [Dtl]の[bditm_p.bd_dpt_nm]を[columnDtl_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_cd;// [Dtl]の[bditm_p.bd_itm_cd]を[columnDtl_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub1;// [Dtl]の[bditm_p.bd_itm_sub1]を[columnDtl_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub2;// [Dtl]の[bditm_p.bd_itm_sub2]を[columnDtl_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_sub3;// [Dtl]の[bditm_p.bd_itm_sub3]を[columnDtl_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_itm_nm;// [Dtl]の[bditm_p.bd_itm_nm]を[columnDtl_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_sno4_mng_typ = null;
	public MCColumnConfig columnDtl_bd_lot_no;// [Dtl]の[bditm_p.bd_lot_no]を[columnDtl_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sublot_no;// [Dtl]の[bditm_p.bd_sublot_no]を[columnDtl_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno1;// [Dtl]の[bditm_p.bd_sno1]を[columnDtl_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno2;// [Dtl]の[bditm_p.bd_sno2]を[columnDtl_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno3;// [Dtl]の[bditm_p.bd_sno3]を[columnDtl_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_sno4;// [Dtl]の[bditm_p.bd_sno4]を[columnDtl_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_bp_cd;// [Dtl]の[bditm_p.bd_bp_cd]を[columnDtl_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_bp_nm;// [Dtl]の[bditm_p.bd_bp_nm]を[columnDtl_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_loc_cd;// [Dtl]の[bditm_p.bd_loc_cd]を[columnDtl_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_loc_nm;// [Dtl]の[bditm_p.bd_loc_nm]を[columnDtl_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_ctg_cd;// [Dtl]の[bditm_p.bd_ctg_cd]を[columnDtl_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_ctg_nm;// [Dtl]の[bditm_p.bd_ctg_nm]を[columnDtl_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_oper_cd;// [Dtl]の[bditm_p.bd_oper_cd]を[columnDtl_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_oper_nm;// [Dtl]の[bditm_p.bd_oper_nm]を[columnDtl_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_iv_no;// [Dtl]の[bditm_p.bd_iv_no]を[columnDtl_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_slo_no;// [Dtl]の[bditm_p.bd_slo_no]を[columnDtl_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_bd_po_no;// [Dtl]の[bditm_p.bd_po_no]を[columnDtl_bd_po_no]としてエイリアス定義。
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_cnt_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_flg = null;
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_sts_typ = null;
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_sts_typ_nm = null;
	/**
	 * PO schedule change type 発注予定変更区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_chg_typ = null;
	/**
	 * PO schedule change type name 発注予定変更区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_chg_typ_nm = null;
	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_split_src_schd_no = null;
	/**
	 * Source schedule 元予定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_org_flg = null;
	/**
	 * Add 追加.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_flg = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_flg = null;
	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_can_flg = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Inventory request from other WG creating source type ＷＧ間依頼作成元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_rqst_src_typ = null;
	/**
	 * Source type name of inventory request from other WG ＷＧ間依頼作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_rqst_src_typ_nm = null;
	/**
	 * Source of inventory request from other WG identification No. ＷＧ間依頼元識別ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_rqst_src_no = null;
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_rqst_no = null;
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_typ = null;
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_typ_nm = null;
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_src_no = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_d_no = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Dtl_itm_grp_p_PPanel;
	public MCColumnConfig columnDtl_itm_grp_cd1;// [Dtl]の[itm_grp_p.itm_grp_cd1]を[columnDtl_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm1;// [Dtl]の[itm_grp_p.itm_grp_nm1]を[columnDtl_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd2;// [Dtl]の[itm_grp_p.itm_grp_cd2]を[columnDtl_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm2;// [Dtl]の[itm_grp_p.itm_grp_nm2]を[columnDtl_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd3;// [Dtl]の[itm_grp_p.itm_grp_cd3]を[columnDtl_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm3;// [Dtl]の[itm_grp_p.itm_grp_nm3]を[columnDtl_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd4;// [Dtl]の[itm_grp_p.itm_grp_cd4]を[columnDtl_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm4;// [Dtl]の[itm_grp_p.itm_grp_nm4]を[columnDtl_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd5;// [Dtl]の[itm_grp_p.itm_grp_cd5]を[columnDtl_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm5;// [Dtl]の[itm_grp_p.itm_grp_nm5]を[columnDtl_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd6;// [Dtl]の[itm_grp_p.itm_grp_cd6]を[columnDtl_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm6;// [Dtl]の[itm_grp_p.itm_grp_nm6]を[columnDtl_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd7;// [Dtl]の[itm_grp_p.itm_grp_cd7]を[columnDtl_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm7;// [Dtl]の[itm_grp_p.itm_grp_nm7]を[columnDtl_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd8;// [Dtl]の[itm_grp_p.itm_grp_cd8]を[columnDtl_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm8;// [Dtl]の[itm_grp_p.itm_grp_nm8]を[columnDtl_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd9;// [Dtl]の[itm_grp_p.itm_grp_cd9]を[columnDtl_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm9;// [Dtl]の[itm_grp_p.itm_grp_nm9]を[columnDtl_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_cd10;// [Dtl]の[itm_grp_p.itm_grp_cd10]を[columnDtl_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_grp_nm10;// [Dtl]の[itm_grp_p.itm_grp_nm10]を[columnDtl_itm_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_bp_grp_p_PPanel;
	public MCColumnConfig columnDtl_bp_grp_cd1;// [Dtl]の[bp_grp_p.bp_grp_cd1]を[columnDtl_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm1;// [Dtl]の[bp_grp_p.bp_grp_nm1]を[columnDtl_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd2;// [Dtl]の[bp_grp_p.bp_grp_cd2]を[columnDtl_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm2;// [Dtl]の[bp_grp_p.bp_grp_nm2]を[columnDtl_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd3;// [Dtl]の[bp_grp_p.bp_grp_cd3]を[columnDtl_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm3;// [Dtl]の[bp_grp_p.bp_grp_nm3]を[columnDtl_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd4;// [Dtl]の[bp_grp_p.bp_grp_cd4]を[columnDtl_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm4;// [Dtl]の[bp_grp_p.bp_grp_nm4]を[columnDtl_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd5;// [Dtl]の[bp_grp_p.bp_grp_cd5]を[columnDtl_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm5;// [Dtl]の[bp_grp_p.bp_grp_nm5]を[columnDtl_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd6;// [Dtl]の[bp_grp_p.bp_grp_cd6]を[columnDtl_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm6;// [Dtl]の[bp_grp_p.bp_grp_nm6]を[columnDtl_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd7;// [Dtl]の[bp_grp_p.bp_grp_cd7]を[columnDtl_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm7;// [Dtl]の[bp_grp_p.bp_grp_nm7]を[columnDtl_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd8;// [Dtl]の[bp_grp_p.bp_grp_cd8]を[columnDtl_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm8;// [Dtl]の[bp_grp_p.bp_grp_nm8]を[columnDtl_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd9;// [Dtl]の[bp_grp_p.bp_grp_cd9]を[columnDtl_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm9;// [Dtl]の[bp_grp_p.bp_grp_nm9]を[columnDtl_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_cd10;// [Dtl]の[bp_grp_p.bp_grp_cd10]を[columnDtl_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_bp_grp_nm10;// [Dtl]の[bp_grp_p.bp_grp_nm10]を[columnDtl_bp_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_rtn_sts_typ_nm;// [Dtl]の[rts_msg_p.rtn_sts_typ_nm]を[columnDtl_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg_id;// [Dtl]の[rts_msg_p.msg_id]を[columnDtl_msg_id]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg;// [Dtl]の[rts_msg_p.msg]を[columnDtl_msg]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_schd_upd_cntr = null;
	/**
	 * Last cancel remaining 前回打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bef_abort_flg = null;
	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Split PO schedule 発注予定分割.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0040 = null;
	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public MCButton Btn_srch_schd_dt = null;
	/**
	 * Acquire unit price 単価取得.<p>
	 *
	 */
	public MCButton Btn_srch_upri = null;
	/**
	 * Delivery destination acquisition 納品先取得.<p>
	 *
	 */
	public MCButton Btn_srch_dlv = null;
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
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_crct = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [SRCH_UPD_CRCT]モードを表す定数 */
	public static final String SRCH_UPD_CRCT = "SRCH_UPD_CRCT";
	/** [SRCH_SPLIT]モードを表す定数 */
	public static final String SRCH_SPLIT = "SRCH_SPLIT";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_CRCT]モードを表す定数 */
	public static final String UPD_CRCT = "UPD_CRCT";
	/** [SPLIT]モードを表す定数 */
	public static final String SPLIT = "SPLIT";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_UPD, SRCH_UPD_CRCT, SRCH_SPLIT, SRCH_DEL, SRCH_REF, INS, UPD, UPD_CRCT, SPLIT, DEL, REF, FIX_I};
	
	/** [MS_MSBDL0030_Srch01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Srch01Caller createMS_MSBDL0030_Srch01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Srch01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Srch01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Srch01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Srch01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Srch01]の呼び出し */
	protected void callMS_MSBDL0030_Srch01() {
		MCCaller caller = createMS_MSBDL0030_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0030_Sprt01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt01Caller createMS_MSBDL0030_Sprt01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Sprt01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Sprt01]の呼び出し */
	protected void callMS_MSBDL0030_Sprt01() {
		MCCaller caller = createMS_MSBDL0030_Sprt01();
		caller.exec();
	}
	/** [MS_MSBDL0030_Sprt02]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt02Caller createMS_MSBDL0030_Sprt02() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt02Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt02Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Sprt02Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt02Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Sprt02]の呼び出し */
	protected void callMS_MSBDL0030_Sprt02() {
		MCCaller caller = createMS_MSBDL0030_Sprt02();
		caller.exec();
	}
	/** [MS_MSBDL0030_Sprt03]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt03Caller createMS_MSBDL0030_Sprt03() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Sprt03Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt03Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Sprt03Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Sprt03Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Sprt03]の呼び出し */
	protected void callMS_MSBDL0030_Sprt03() {
		MCCaller caller = createMS_MSBDL0030_Sprt03();
		caller.exec();
	}
	/** [MS_MSBDL0030_Imp01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Imp01Caller createMS_MSBDL0030_Imp01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Imp01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Imp01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Imp01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Imp01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Imp01]の呼び出し */
	protected void callMS_MSBDL0030_Imp01() {
		MCCaller caller = createMS_MSBDL0030_Imp01();
		caller.exec();
	}
	/** [MS_MSBDL0030_Ins01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Ins01Caller createMS_MSBDL0030_Ins01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Ins01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Ins01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Ins01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Ins01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Ins01]の呼び出し */
	protected void callMS_MSBDL0030_Ins01() {
		MCCaller caller = createMS_MSBDL0030_Ins01();
		caller.exec();
	}
	/** [MS_MSBDL0030_Upd01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd01Caller createMS_MSBDL0030_Upd01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Upd01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Upd01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Upd01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Upd01]の呼び出し */
	protected void callMS_MSBDL0030_Upd01() {
		MCCaller caller = createMS_MSBDL0030_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0030_Upd02]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd02Caller createMS_MSBDL0030_Upd02() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Upd02Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Upd02Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Upd02Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Upd02Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Upd02]の呼び出し */
	protected void callMS_MSBDL0030_Upd02() {
		MCCaller caller = createMS_MSBDL0030_Upd02();
		caller.exec();
	}
	/** [MS_MSBDL0030_Del01]のCallerの作成 */
	protected MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Del01Caller createMS_MSBDL0030_Del01() {
		MSBDP_PoSchdListReg_MC.MS_MSBDL0030_Del01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Del01Bridge>
		caller = ((MSBDP_PoSchdListReg_MC)this).new MS_MSBDL0030_Del01Caller<MSBDP_PoSchdListReg, MS_MSBDL0030_Del01Bridge>(
					(MSBDP_PoSchdListReg)this, new MS_MSBDL0030_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0030_Del01]の呼び出し */
	protected void callMS_MSBDL0030_Del01() {
		MCCaller caller = createMS_MSBDL0030_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0030.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0030.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0030.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0030.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0030.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBD.MSBDP0030.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0030.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBD.MSBDP0030.BulkSetR createBulkSetR() {
		return mcframe.clientMSBD.MSBDP0030.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0030.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0030.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0030.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0030.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0030.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
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
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(PoStsPanel);
		ret.add(TOPPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(SpplGrpPanel);
		ret.add(ItmGrpPanel);
		ret.add(CndPanel);
		ret.add(IvTrgtPanel);
		ret.add(InterimPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoSchdListReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PoSchdListReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PoSchdListReg_MC.jbCreateScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreatePoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateTOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateFold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateTab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateSpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateCnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateIvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateInterim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateCtrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateRPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateBulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateDtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateBtn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbCreateEastBtn((MSBDP_PoSchdListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [PoSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePoSts(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [SpplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplGrp(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PoSchdListReg p) {
		p.Cnd_dlv_rqst_dt_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_rqst_dt_frto_p());
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.setName("Cnd.dlv_rqst_dt_frto_p");
		p.Cnd_dlv_rqst_dt_fr = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_rqst_dt_fr.addAliasName("Cnd.dlv_rqst_dt_fr", p);
		p.Cnd_dlv_rqst_hm_fr = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_rqst_hm_fr.addAliasName("Cnd.dlv_rqst_hm_fr", p);
		p.Cnd_dlv_rqst_dt_to = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_rqst_dt_to.addAliasName("Cnd.dlv_rqst_dt_to", p);
		p.Cnd_dlv_rqst_hm_to = p.Cnd_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_rqst_hm_to.addAliasName("Cnd.dlv_rqst_hm_to", p);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().rqst_dlv_rqst_dt_frto_p());
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.setName("Cnd.rqst_dlv_rqst_dt_frto_p");
		p.Cnd_rqst_dlv_rqst_dt_fr = p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_rqst_dlv_rqst_dt_fr.addAliasName("Cnd.rqst_dlv_rqst_dt_fr", p);
		p.Cnd_rqst_dlv_rqst_hm_fr = p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_rqst_dlv_rqst_hm_fr.addAliasName("Cnd.rqst_dlv_rqst_hm_fr", p);
		p.Cnd_rqst_dlv_rqst_dt_to = p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_rqst_dlv_rqst_dt_to.addAliasName("Cnd.rqst_dlv_rqst_dt_to", p);
		p.Cnd_rqst_dlv_rqst_hm_to = p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_rqst_dlv_rqst_hm_to.addAliasName("Cnd.rqst_dlv_rqst_hm_to", p);
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
	 * [IvTrgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateIvTrgt(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [Interim]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInterim(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PoSchdListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBDP_PoSchdListReg p) {
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().rqst_fr_usr_dpt_p());
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.setName("BulkSet.rqst_fr_usr_dpt_p");
		p.BulkSet_rqst_fr_usr_cd = p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_rqst_fr_usr_cd.addAliasName("BulkSet.rqst_fr_usr_cd", p);
		p.BulkSet_rqst_fr_usr_nm = p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_rqst_fr_usr_nm.addAliasName("BulkSet.rqst_fr_usr_nm", p);
		p.BulkSet_rqst_fr_dpt_cd = p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_rqst_fr_dpt_cd.addAliasName("BulkSet.rqst_fr_dpt_cd", p);
		p.BulkSet_rqst_fr_dpt_nm = p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_rqst_fr_dpt_nm.addAliasName("BulkSet.rqst_fr_dpt_nm", p);
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_purc_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_purc_usr_cd.addAliasName("BulkSet.purc_usr_cd", p);
		p.BulkSet_purc_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_purc_usr_nm.addAliasName("BulkSet.purc_usr_nm", p);
		p.BulkSet_purc_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_purc_dpt_cd.addAliasName("BulkSet.purc_dpt_cd", p);
		p.BulkSet_purc_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_purc_dpt_nm.addAliasName("BulkSet.purc_dpt_nm", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBDP_PoSchdListReg p) {
		p.Dtl_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$dlv_rqst_tm_p);
		p.Dtl_dlv_rqst_tm_p_PPanel.setName("Dtl.dlv_rqst_tm_p");
		p.columnDtl_dlv_rqst_dt = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_dlv_rqst_dt.addAliasName("Dtl.dlv_rqst_dt", p);
		p.columnDtl_dlv_rqst_hm = p.Dtl_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_dlv_rqst_hm.addAliasName("Dtl.dlv_rqst_hm", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$str_ln_p);
		p.Dtl_str_ln_p_PPanel.setName("Dtl.str_ln_p");
		p.columnDtl_str_ln_cd = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_str_ln_cd.addAliasName("Dtl.str_ln_cd", p);
		p.columnDtl_str_ln_nm = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_str_ln_nm.addAliasName("Dtl.str_ln_nm", p);
		p.columnDtl_str_ln_cd_none_flg = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_str_ln_cd_none_flg.addAliasName("Dtl.str_ln_cd_none_flg", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$inst_cont_qty_p);
		p.Dtl_inst_cont_qty_p_PPanel.setName("Dtl.inst_cont_qty_p");
		p.columnDtl_cont_qty = p.Dtl_inst_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_cont_qty.addAliasName("Dtl.cont_qty", p);
		p.Dtl_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$cont_unit_p);
		p.Dtl_cont_unit_p_PPanel.setName("Dtl.cont_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$std_cont_p);
		p.Dtl_std_cont_p_PPanel.setName("Dtl.std_cont_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_rqst_fr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$rqst_fr_dpt_p);
		p.Dtl_rqst_fr_dpt_p_PPanel.setName("Dtl.rqst_fr_dpt_p");
		p.columnDtl_rqst_fr_usr_cd = p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_rqst_fr_usr_cd.addAliasName("Dtl.rqst_fr_usr_cd", p);
		p.columnDtl_rqst_fr_usr_nm = p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_rqst_fr_usr_nm.addAliasName("Dtl.rqst_fr_usr_nm", p);
		p.columnDtl_rqst_fr_dpt_cd = p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_rqst_fr_dpt_cd.addAliasName("Dtl.rqst_fr_dpt_cd", p);
		p.columnDtl_rqst_fr_dpt_nm = p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_rqst_fr_dpt_nm.addAliasName("Dtl.rqst_fr_dpt_nm", p);
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
		p.columnDtl_dlv_show_dtl = p.Dtl_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_dlv_show_dtl.addAliasName("Dtl.dlv_show_dtl", p);
		p.columnDtl_dlv_lg_grp_cd = p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDtl_dlv_lg_grp_cd.addAliasName("Dtl.dlv_lg_grp_cd", p);
		p.columnDtl_dlv_cntry_cd = p.Dtl_dlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_dlv_cntry_cd.addAliasName("Dtl.dlv_cntry_cd", p);
		p.columnDtl_dlv_cntry_nm = p.Dtl_dlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_dlv_cntry_nm.addAliasName("Dtl.dlv_cntry_nm", p);
		p.columnDtl_dlv_zip_cd = p.Dtl_dlv_p_PPanel.columnDlv_zip_cd;
		p.columnDtl_dlv_zip_cd.addAliasName("Dtl.dlv_zip_cd", p);
		p.columnDtl_dlv_addr1 = p.Dtl_dlv_p_PPanel.columnDlv_addr1;
		p.columnDtl_dlv_addr1.addAliasName("Dtl.dlv_addr1", p);
		p.columnDtl_dlv_addr2 = p.Dtl_dlv_p_PPanel.columnDlv_addr2;
		p.columnDtl_dlv_addr2.addAliasName("Dtl.dlv_addr2", p);
		p.columnDtl_dlv_addr3 = p.Dtl_dlv_p_PPanel.columnDlv_addr3;
		p.columnDtl_dlv_addr3.addAliasName("Dtl.dlv_addr3", p);
		p.columnDtl_dlv_addr4 = p.Dtl_dlv_p_PPanel.columnDlv_addr4;
		p.columnDtl_dlv_addr4.addAliasName("Dtl.dlv_addr4", p);
		p.columnDtl_dlv_tel = p.Dtl_dlv_p_PPanel.columnDlv_tel;
		p.columnDtl_dlv_tel.addAliasName("Dtl.dlv_tel", p);
		p.columnDtl_dlv_fax = p.Dtl_dlv_p_PPanel.columnDlv_fax;
		p.columnDtl_dlv_fax.addAliasName("Dtl.dlv_fax", p);
		p.columnDtl_dlv_cntct_dpt = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_dlv_cntct_dpt.addAliasName("Dtl.dlv_cntct_dpt", p);
		p.columnDtl_dlv_cntct_psn = p.Dtl_dlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_dlv_cntct_psn.addAliasName("Dtl.dlv_cntct_psn", p);
		p.Dtl_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$tdlv_p);
		p.Dtl_tdlv_p_PPanel.setName("Dtl.tdlv_p");
		p.columnDtl_tdlv_cd = p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_tdlv_cd.addAliasName("Dtl.tdlv_cd", p);
		p.columnDtl_tdlv_nm = p.Dtl_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_tdlv_nm.addAliasName("Dtl.tdlv_nm", p);
		p.columnDtl_tdlv_sundry_flg = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_tdlv_sundry_flg.addAliasName("Dtl.tdlv_sundry_flg", p);
		p.columnDtl_tdlv_show_dtl = p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_tdlv_show_dtl.addAliasName("Dtl.tdlv_show_dtl", p);
		p.columnDtl_tdlv_lg_grp_cd = p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd;
		p.columnDtl_tdlv_lg_grp_cd.addAliasName("Dtl.tdlv_lg_grp_cd", p);
		p.columnDtl_tdlv_cntry_cd = p.Dtl_tdlv_p_PPanel.columnDlv_cntry_cd;
		p.columnDtl_tdlv_cntry_cd.addAliasName("Dtl.tdlv_cntry_cd", p);
		p.columnDtl_tdlv_cntry_nm = p.Dtl_tdlv_p_PPanel.columnDlv_cntry_nm;
		p.columnDtl_tdlv_cntry_nm.addAliasName("Dtl.tdlv_cntry_nm", p);
		p.columnDtl_tdlv_zip_cd = p.Dtl_tdlv_p_PPanel.columnDlv_zip_cd;
		p.columnDtl_tdlv_zip_cd.addAliasName("Dtl.tdlv_zip_cd", p);
		p.columnDtl_tdlv_addr1 = p.Dtl_tdlv_p_PPanel.columnDlv_addr1;
		p.columnDtl_tdlv_addr1.addAliasName("Dtl.tdlv_addr1", p);
		p.columnDtl_tdlv_addr2 = p.Dtl_tdlv_p_PPanel.columnDlv_addr2;
		p.columnDtl_tdlv_addr2.addAliasName("Dtl.tdlv_addr2", p);
		p.columnDtl_tdlv_addr3 = p.Dtl_tdlv_p_PPanel.columnDlv_addr3;
		p.columnDtl_tdlv_addr3.addAliasName("Dtl.tdlv_addr3", p);
		p.columnDtl_tdlv_addr4 = p.Dtl_tdlv_p_PPanel.columnDlv_addr4;
		p.columnDtl_tdlv_addr4.addAliasName("Dtl.tdlv_addr4", p);
		p.columnDtl_tdlv_tel = p.Dtl_tdlv_p_PPanel.columnDlv_tel;
		p.columnDtl_tdlv_tel.addAliasName("Dtl.tdlv_tel", p);
		p.columnDtl_tdlv_fax = p.Dtl_tdlv_p_PPanel.columnDlv_fax;
		p.columnDtl_tdlv_fax.addAliasName("Dtl.tdlv_fax", p);
		p.columnDtl_tdlv_cntct_dpt = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_cntct_dpt;
		p.columnDtl_tdlv_cntct_dpt.addAliasName("Dtl.tdlv_cntct_dpt", p);
		p.columnDtl_tdlv_cntct_psn = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_cntct_psn;
		p.columnDtl_tdlv_cntct_psn.addAliasName("Dtl.tdlv_cntct_psn", p);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$rqst_dlv_rqst_tm_p);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.setName("Dtl.rqst_dlv_rqst_tm_p");
		p.columnDtl_rqst_dlv_rqst_dt = p.Dtl_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_rqst_dlv_rqst_dt.addAliasName("Dtl.rqst_dlv_rqst_dt", p);
		p.columnDtl_rqst_dlv_rqst_hm = p.Dtl_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_rqst_dlv_rqst_hm.addAliasName("Dtl.rqst_dlv_rqst_hm", p);
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_purc_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_purc_usr_cd.addAliasName("Dtl.purc_usr_cd", p);
		p.columnDtl_purc_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_purc_usr_nm.addAliasName("Dtl.purc_usr_nm", p);
		p.columnDtl_purc_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_purc_dpt_cd.addAliasName("Dtl.purc_dpt_cd", p);
		p.columnDtl_purc_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_purc_dpt_nm.addAliasName("Dtl.purc_dpt_nm", p);
		p.Dtl_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_cur_upri_p);
		p.Dtl_trd_cur_upri_p_PPanel.setName("Dtl.trd_cur_upri_p");
		p.columnDtl_upri_not_tgt_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl_upri_not_tgt_flg.addAliasName("Dtl.upri_not_tgt_flg", p);
		p.columnDtl_trd_cur_upri = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl_trd_cur_upri.addAliasName("Dtl.trd_cur_upri", p);
		p.columnDtl_interim_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl_interim_flg.addAliasName("Dtl.interim_flg", p);
		p.columnDtl_trd_cur_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl_trd_cur_amt.addAliasName("Dtl.trd_cur_amt", p);
		p.columnDtl_trd_cur_inc_tax_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl_trd_cur_inc_tax_amt.addAliasName("Dtl.trd_cur_inc_tax_amt", p);
		p.columnDtl_tax_fix_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl_tax_fix_flg.addAliasName("Dtl.tax_fix_flg", p);
		p.columnDtl_tax_cd = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl_tax_cd.addAliasName("Dtl.tax_cd", p);
		p.columnDtl_tax_nm = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl_tax_nm.addAliasName("Dtl.tax_nm", p);
		p.columnDtl_tax_rate = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl_tax_rate.addAliasName("Dtl.tax_rate", p);
		p.columnDtl_tax_typ = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl_tax_typ.addAliasName("Dtl.tax_typ", p);
		p.columnDtl_inc_tax_flg = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl_inc_tax_flg.addAliasName("Dtl.inc_tax_flg", p);
		p.columnDtl_trd_cur_tax_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl_trd_cur_tax_amt.addAliasName("Dtl.trd_cur_tax_amt", p);
		p.columnDtl_trd_cur_dscnt_amt = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl_trd_cur_dscnt_amt.addAliasName("Dtl.trd_cur_dscnt_amt", p);
		p.columnDtl_dscnt_rsn_cd = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl_dscnt_rsn_cd.addAliasName("Dtl.dscnt_rsn_cd", p);
		p.columnDtl_dscnt_rsn_nm = p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl_dscnt_rsn_nm.addAliasName("Dtl.dscnt_rsn_nm", p);
		p.Dtl_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_cur_proc_upri_p);
		p.Dtl_trd_cur_proc_upri_p_PPanel.setName("Dtl.trd_cur_proc_upri_p");
		p.columnDtl_trd_cur_proc_upri = p.Dtl_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_proc_upri.addAliasName("Dtl.trd_cur_proc_upri", p);
		p.Dtl_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_cur_proc_amt_p);
		p.Dtl_trd_cur_proc_amt_p_PPanel.setName("Dtl.trd_cur_proc_amt_p");
		p.columnDtl_trd_cur_proc_amt = p.Dtl_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_proc_amt.addAliasName("Dtl.trd_cur_proc_amt", p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_cur_onr_prov_upri_p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl.trd_cur_onr_prov_upri_p");
		p.columnDtl_trd_cur_onr_prov_upri = p.Dtl_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_onr_prov_upri.addAliasName("Dtl.trd_cur_onr_prov_upri", p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$trd_cur_onr_prov_amt_p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl.trd_cur_onr_prov_amt_p");
		p.columnDtl_trd_cur_onr_prov_amt = p.Dtl_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_onr_prov_amt.addAliasName("Dtl.trd_cur_onr_prov_amt", p);
		p.Dtl_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$xrate_p);
		p.Dtl_xrate_p_PPanel.setName("Dtl.xrate_p");
		p.columnDtl_xrate = p.Dtl_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_xrate.addAliasName("Dtl.xrate", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_proc_upri_p);
		p.Dtl_base_cur_proc_upri_p_PPanel.setName("Dtl.base_cur_proc_upri_p");
		p.columnDtl_base_cur_proc_upri = p.Dtl_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_proc_upri.addAliasName("Dtl.base_cur_proc_upri", p);
		p.Dtl_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_proc_amt_p);
		p.Dtl_base_cur_proc_amt_p_PPanel.setName("Dtl.base_cur_proc_amt_p");
		p.columnDtl_base_cur_proc_amt = p.Dtl_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_proc_amt.addAliasName("Dtl.base_cur_proc_amt", p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_onr_prov_upri_p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.setName("Dtl.base_cur_onr_prov_upri_p");
		p.columnDtl_base_cur_onr_prov_upri = p.Dtl_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_onr_prov_upri.addAliasName("Dtl.base_cur_onr_prov_upri", p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$base_cur_onr_prov_amt_p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.setName("Dtl.base_cur_onr_prov_amt_p");
		p.columnDtl_base_cur_onr_prov_amt = p.Dtl_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_onr_prov_amt.addAliasName("Dtl.base_cur_onr_prov_amt", p);
		p.Dtl_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_xrate_p);
		p.Dtl_ptax_xrate_p_PPanel.setName("Dtl.ptax_xrate_p");
		p.columnDtl_ptax_xrate = p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_ptax_xrate.addAliasName("Dtl.ptax_xrate", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_proc_upri_p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.setName("Dtl.ptax_cur_proc_upri_p");
		p.columnDtl_ptax_cur_proc_upri = p.Dtl_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_proc_upri.addAliasName("Dtl.ptax_cur_proc_upri", p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_proc_amt_p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.setName("Dtl.ptax_cur_proc_amt_p");
		p.columnDtl_ptax_cur_proc_amt = p.Dtl_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_proc_amt.addAliasName("Dtl.ptax_cur_proc_amt", p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_onr_prov_upri_p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl.ptax_cur_onr_prov_upri_p");
		p.columnDtl_ptax_cur_onr_prov_upri = p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_onr_prov_upri.addAliasName("Dtl.ptax_cur_onr_prov_upri", p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$ptax_cur_onr_prov_amt_p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl.ptax_cur_onr_prov_amt_p");
		p.columnDtl_ptax_cur_onr_prov_amt = p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_onr_prov_amt.addAliasName("Dtl.ptax_cur_onr_prov_amt", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$bditm_p);
		p.Dtl_bditm_p_PPanel.setName("Dtl.bditm_p");
		p.columnDtl_bd_dpt_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnDtl_bd_dpt_cd.addAliasName("Dtl.bd_dpt_cd", p);
		p.columnDtl_bd_dpt_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnDtl_bd_dpt_nm.addAliasName("Dtl.bd_dpt_nm", p);
		p.columnDtl_bd_itm_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnDtl_bd_itm_cd.addAliasName("Dtl.bd_itm_cd", p);
		p.columnDtl_bd_itm_sub1 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnDtl_bd_itm_sub1.addAliasName("Dtl.bd_itm_sub1", p);
		p.columnDtl_bd_itm_sub2 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnDtl_bd_itm_sub2.addAliasName("Dtl.bd_itm_sub2", p);
		p.columnDtl_bd_itm_sub3 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnDtl_bd_itm_sub3.addAliasName("Dtl.bd_itm_sub3", p);
		p.columnDtl_bd_itm_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnDtl_bd_itm_nm.addAliasName("Dtl.bd_itm_nm", p);
		p.columnDtl_bd_lot_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnDtl_bd_lot_no.addAliasName("Dtl.bd_lot_no", p);
		p.columnDtl_bd_sublot_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnDtl_bd_sublot_no.addAliasName("Dtl.bd_sublot_no", p);
		p.columnDtl_bd_sno1 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnDtl_bd_sno1.addAliasName("Dtl.bd_sno1", p);
		p.columnDtl_bd_sno2 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnDtl_bd_sno2.addAliasName("Dtl.bd_sno2", p);
		p.columnDtl_bd_sno3 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnDtl_bd_sno3.addAliasName("Dtl.bd_sno3", p);
		p.columnDtl_bd_sno4 = p.Dtl_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnDtl_bd_sno4.addAliasName("Dtl.bd_sno4", p);
		p.columnDtl_bd_bp_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnDtl_bd_bp_cd.addAliasName("Dtl.bd_bp_cd", p);
		p.columnDtl_bd_bp_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnDtl_bd_bp_nm.addAliasName("Dtl.bd_bp_nm", p);
		p.columnDtl_bd_loc_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnDtl_bd_loc_cd.addAliasName("Dtl.bd_loc_cd", p);
		p.columnDtl_bd_loc_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnDtl_bd_loc_nm.addAliasName("Dtl.bd_loc_nm", p);
		p.columnDtl_bd_ctg_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnDtl_bd_ctg_cd.addAliasName("Dtl.bd_ctg_cd", p);
		p.columnDtl_bd_ctg_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnDtl_bd_ctg_nm.addAliasName("Dtl.bd_ctg_nm", p);
		p.columnDtl_bd_oper_cd = p.Dtl_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnDtl_bd_oper_cd.addAliasName("Dtl.bd_oper_cd", p);
		p.columnDtl_bd_oper_nm = p.Dtl_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnDtl_bd_oper_nm.addAliasName("Dtl.bd_oper_nm", p);
		p.columnDtl_bd_iv_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnDtl_bd_iv_no.addAliasName("Dtl.bd_iv_no", p);
		p.columnDtl_bd_slo_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnDtl_bd_slo_no.addAliasName("Dtl.bd_slo_no", p);
		p.columnDtl_bd_po_no = p.Dtl_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnDtl_bd_po_no.addAliasName("Dtl.bd_po_no", p);
		p.Dtl_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$itm_grp_p);
		p.Dtl_itm_grp_p_PPanel.setName("Dtl.itm_grp_p");
		p.columnDtl_itm_grp_cd1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnDtl_itm_grp_cd1.addAliasName("Dtl.itm_grp_cd1", p);
		p.columnDtl_itm_grp_nm1 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnDtl_itm_grp_nm1.addAliasName("Dtl.itm_grp_nm1", p);
		p.columnDtl_itm_grp_cd2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnDtl_itm_grp_cd2.addAliasName("Dtl.itm_grp_cd2", p);
		p.columnDtl_itm_grp_nm2 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnDtl_itm_grp_nm2.addAliasName("Dtl.itm_grp_nm2", p);
		p.columnDtl_itm_grp_cd3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnDtl_itm_grp_cd3.addAliasName("Dtl.itm_grp_cd3", p);
		p.columnDtl_itm_grp_nm3 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnDtl_itm_grp_nm3.addAliasName("Dtl.itm_grp_nm3", p);
		p.columnDtl_itm_grp_cd4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnDtl_itm_grp_cd4.addAliasName("Dtl.itm_grp_cd4", p);
		p.columnDtl_itm_grp_nm4 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnDtl_itm_grp_nm4.addAliasName("Dtl.itm_grp_nm4", p);
		p.columnDtl_itm_grp_cd5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnDtl_itm_grp_cd5.addAliasName("Dtl.itm_grp_cd5", p);
		p.columnDtl_itm_grp_nm5 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnDtl_itm_grp_nm5.addAliasName("Dtl.itm_grp_nm5", p);
		p.columnDtl_itm_grp_cd6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnDtl_itm_grp_cd6.addAliasName("Dtl.itm_grp_cd6", p);
		p.columnDtl_itm_grp_nm6 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnDtl_itm_grp_nm6.addAliasName("Dtl.itm_grp_nm6", p);
		p.columnDtl_itm_grp_cd7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnDtl_itm_grp_cd7.addAliasName("Dtl.itm_grp_cd7", p);
		p.columnDtl_itm_grp_nm7 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnDtl_itm_grp_nm7.addAliasName("Dtl.itm_grp_nm7", p);
		p.columnDtl_itm_grp_cd8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnDtl_itm_grp_cd8.addAliasName("Dtl.itm_grp_cd8", p);
		p.columnDtl_itm_grp_nm8 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnDtl_itm_grp_nm8.addAliasName("Dtl.itm_grp_nm8", p);
		p.columnDtl_itm_grp_cd9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnDtl_itm_grp_cd9.addAliasName("Dtl.itm_grp_cd9", p);
		p.columnDtl_itm_grp_nm9 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnDtl_itm_grp_nm9.addAliasName("Dtl.itm_grp_nm9", p);
		p.columnDtl_itm_grp_cd10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnDtl_itm_grp_cd10.addAliasName("Dtl.itm_grp_cd10", p);
		p.columnDtl_itm_grp_nm10 = p.Dtl_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnDtl_itm_grp_nm10.addAliasName("Dtl.itm_grp_nm10", p);
		p.Dtl_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$bp_grp_p);
		p.Dtl_bp_grp_p_PPanel.setName("Dtl.bp_grp_p");
		p.columnDtl_bp_grp_cd1 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_bp_grp_cd1.addAliasName("Dtl.bp_grp_cd1", p);
		p.columnDtl_bp_grp_nm1 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_bp_grp_nm1.addAliasName("Dtl.bp_grp_nm1", p);
		p.columnDtl_bp_grp_cd2 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_bp_grp_cd2.addAliasName("Dtl.bp_grp_cd2", p);
		p.columnDtl_bp_grp_nm2 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_bp_grp_nm2.addAliasName("Dtl.bp_grp_nm2", p);
		p.columnDtl_bp_grp_cd3 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_bp_grp_cd3.addAliasName("Dtl.bp_grp_cd3", p);
		p.columnDtl_bp_grp_nm3 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_bp_grp_nm3.addAliasName("Dtl.bp_grp_nm3", p);
		p.columnDtl_bp_grp_cd4 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_bp_grp_cd4.addAliasName("Dtl.bp_grp_cd4", p);
		p.columnDtl_bp_grp_nm4 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_bp_grp_nm4.addAliasName("Dtl.bp_grp_nm4", p);
		p.columnDtl_bp_grp_cd5 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_bp_grp_cd5.addAliasName("Dtl.bp_grp_cd5", p);
		p.columnDtl_bp_grp_nm5 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_bp_grp_nm5.addAliasName("Dtl.bp_grp_nm5", p);
		p.columnDtl_bp_grp_cd6 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_bp_grp_cd6.addAliasName("Dtl.bp_grp_cd6", p);
		p.columnDtl_bp_grp_nm6 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_bp_grp_nm6.addAliasName("Dtl.bp_grp_nm6", p);
		p.columnDtl_bp_grp_cd7 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_bp_grp_cd7.addAliasName("Dtl.bp_grp_cd7", p);
		p.columnDtl_bp_grp_nm7 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_bp_grp_nm7.addAliasName("Dtl.bp_grp_nm7", p);
		p.columnDtl_bp_grp_cd8 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_bp_grp_cd8.addAliasName("Dtl.bp_grp_cd8", p);
		p.columnDtl_bp_grp_nm8 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_bp_grp_nm8.addAliasName("Dtl.bp_grp_nm8", p);
		p.columnDtl_bp_grp_cd9 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_bp_grp_cd9.addAliasName("Dtl.bp_grp_cd9", p);
		p.columnDtl_bp_grp_nm9 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_bp_grp_nm9.addAliasName("Dtl.bp_grp_nm9", p);
		p.columnDtl_bp_grp_cd10 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_bp_grp_cd10.addAliasName("Dtl.bp_grp_cd10", p);
		p.columnDtl_bp_grp_nm10 = p.Dtl_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_bp_grp_nm10.addAliasName("Dtl.bp_grp_nm10", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBD.MSBDP0030.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.columnDtl_rtn_sts_typ_nm = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnDtl_rtn_sts_typ_nm.addAliasName("Dtl.rtn_sts_typ_nm", p);
		p.columnDtl_msg_id = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnDtl_msg_id.addAliasName("Dtl.msg_id", p);
		p.columnDtl_msg = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnDtl_msg.addAliasName("Dtl.msg", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PoSchdListReg p) {
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
	
	
	/** [Cnd_in_to_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_loc_wg_cd_p = null;

	/**
	 * [Cnd_in_to_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_loc_wg_cd_ListPutter() {
		if (Cnd_in_to_loc_wg_cd_p == null) {
			Cnd_in_to_loc_wg_cd_p = createCnd_in_to_loc_wg_cd_ListPutter(Cnd_in_to_loc_wg_cd, "in_to_loc_wg_cd", "in_to_loc_wg_nm");

		}
		return Cnd_in_to_loc_wg_cd_p;
	}
	
	
	/** [Cnd_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_in_to_loc_cd_p = null;

	/**
	 * [Cnd_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_in_to_loc_cd_ListPutter() {
		if (Cnd_in_to_loc_cd_p == null) {
			Cnd_in_to_loc_cd_p = createCnd_in_to_loc_cd_ListPutter(Cnd_in_to_loc_cd, "in_to_loc_cd", "in_to_loc_nm");

		}
		return Cnd_in_to_loc_cd_p;
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
	
	
	/** [Cnd_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_wg_cd_p = null;

	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_wg_cd_ListPutter() {
		if (Cnd_rqst_wg_cd_p == null) {
			Cnd_rqst_wg_cd_p = createCnd_rqst_wg_cd_ListPutter(Cnd_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Cnd_rqst_wg_cd_p;
	}
	
	
	/** [Cnd_rqst_fr_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_fr_usr_cd_p = null;

	/**
	 * [Cnd_rqst_fr_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_fr_usr_cd_ListPutter() {
		if (Cnd_rqst_fr_usr_cd_p == null) {
			Cnd_rqst_fr_usr_cd_p = createCnd_rqst_fr_usr_cd_ListPutter(Cnd_rqst_fr_usr_cd, "rqst_fr_usr_cd", "rqst_fr_usr_nm");

		}
		return Cnd_rqst_fr_usr_cd_p;
	}
	
	
	/** [Cnd_rqst_fr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_fr_dpt_cd_p = null;

	/**
	 * [Cnd_rqst_fr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_fr_dpt_cd_ListPutter() {
		if (Cnd_rqst_fr_dpt_cd_p == null) {
			Cnd_rqst_fr_dpt_cd_p = createCnd_rqst_fr_dpt_cd_ListPutter(Cnd_rqst_fr_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");

		}
		return Cnd_rqst_fr_dpt_cd_p;
	}
	
	
	/** [Cnd_po_schd_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_po_schd_src_typ_p = null;

	/**
	 * [Cnd_po_schd_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_po_schd_src_typ_ListPutter() {
		if (Cnd_po_schd_src_typ_p == null) {
			Cnd_po_schd_src_typ_p = createCnd_po_schd_src_typ_ListPutter(Cnd_po_schd_src_typ, "po_schd_src_typ", "po_schd_src_typ_nm");

		}
		return Cnd_po_schd_src_typ_p;
	}
	
	
	/** [Cnd_wg_rqst_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_wg_rqst_src_typ_p = null;

	/**
	 * [Cnd_wg_rqst_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_rqst_src_typ_ListPutter() {
		if (Cnd_wg_rqst_src_typ_p == null) {
			Cnd_wg_rqst_src_typ_p = createCnd_wg_rqst_src_typ_ListPutter(Cnd_wg_rqst_src_typ, "wg_rqst_src_typ", "wg_rqst_src_typ_nm");

		}
		return Cnd_wg_rqst_src_typ_p;
	}
	
	
	/** [Cnd_po_schd_chg_typ_ListPutter]の定義 */
	private MCListPutter Cnd_po_schd_chg_typ_p = null;

	/**
	 * [Cnd_po_schd_chg_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_po_schd_chg_typ_ListPutter() {
		if (Cnd_po_schd_chg_typ_p == null) {
			Cnd_po_schd_chg_typ_p = createCnd_po_schd_chg_typ_ListPutter(Cnd_po_schd_chg_typ, "po_schd_chg_typ", "po_schd_chg_typ_nm");

		}
		return Cnd_po_schd_chg_typ_p;
	}
	
	
	/** [Cnd_purc_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_purc_sts_typ_p = null;

	/**
	 * [Cnd_purc_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_sts_typ_ListPutter() {
		if (Cnd_purc_sts_typ_p == null) {
			Cnd_purc_sts_typ_p = createCnd_purc_sts_typ_ListPutter(Cnd_purc_sts_typ, "purc_sts_typ", "purc_sts_typ_nm");

		}
		return Cnd_purc_sts_typ_p;
	}
	
	
	/** [BulkSet_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_rqst_wg_cd_p = null;

	/**
	 * [BulkSet_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_rqst_wg_cd_ListPutter() {
		if (BulkSet_rqst_wg_cd_p == null) {
			BulkSet_rqst_wg_cd_p = createBulkSet_rqst_wg_cd_ListPutter(BulkSet_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return BulkSet_rqst_wg_cd_p;
	}
	
	
	/** [BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");
		}
		return BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_trd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cd_p = null;

	/**
	 * [Dtl_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cd_ListPutter() {
		if (Dtl_trd_cd_p == null) {
			Dtl_trd_cd_p = createDtl_trd_cd_ListPutter(columnDtl_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Dtl_trd_cd_p;
	}
	
	
	/** [Dtl_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_in_to_loc_cd_p = null;

	/**
	 * [Dtl_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_in_to_loc_cd_ListPutter() {
		if (Dtl_in_to_loc_cd_p == null) {
			Dtl_in_to_loc_cd_p = createDtl_in_to_loc_cd_ListPutter(columnDtl_in_to_loc_cd, "in_to_loc_cd", "in_to_loc_nm","in_to_loc_wg_cd","in_to_loc_wg_nm","str_ln_tgt_flg","outsrc_sppl_cd","in_to_loc_cal_cd","site_cd","lg_grp_cd","loc_grp_cd","str_ln_cd","str_ln_cd_none_flg");

		}
		return Dtl_in_to_loc_cd_p;
	}
	
	
	/** [Dtl_drct_dlv_typ_ListPutter]の定義 */
	private MCListPutter Dtl_drct_dlv_typ_p = null;

	/**
	 * [Dtl_drct_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_drct_dlv_typ_ListPutter() {
		if (Dtl_drct_dlv_typ_p == null) {
			Dtl_drct_dlv_typ_p = createDtl_drct_dlv_typ_ListPutter(columnDtl_drct_dlv_typ, "drct_dlv_typ", "drct_dlv_typ_nm");

		}
		return Dtl_drct_dlv_typ_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sppl_nm","trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cd","maker_nm","maker_cd","bom_ptn","mfg_loc_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sppl_nm","trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cd","maker_nm","maker_cd","bom_ptn","mfg_loc_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sppl_nm","trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cd","maker_nm","maker_cd","bom_ptn","mfg_loc_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sundry_itm_flg","dscnt_itm_flg","asset_mng_typ","ver_flg","trd_unit_cd","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_dec_place","cont_fctr_rnd_typ","itm_purc_upri_cng_flg","tax_cd","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sppl_nm","trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cd","maker_nm","maker_cd","bom_ptn","mfg_loc_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rqst_wg_cd_p = null;

	/**
	 * [Dtl_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rqst_wg_cd_ListPutter() {
		if (Dtl_rqst_wg_cd_p == null) {
			Dtl_rqst_wg_cd_p = createDtl_rqst_wg_cd_ListPutter(columnDtl_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Dtl_rqst_wg_cd_p;
	}
	
	
	/** [Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "rqst_fr_dpt_cd", "rqst_fr_dpt_nm");
		}
		return Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sppl_cd_p = null;

	/**
	 * [Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sppl_cd_ListPutter() {
		if (Dtl_sppl_cd_p == null) {
			Dtl_sppl_cd_p = createDtl_sppl_cd_ListPutter(columnDtl_sppl_cd, "sppl_cd", "sppl_nm","trd_cur_cd","def_purc_usr_cd","def_purc_dpt_cd","sppl_iv_flg","prnt_lcl_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ");

		}
		return Dtl_sppl_cd_p;
	}
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl_maker_cd_p;
	}
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_purc_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_upri_req_typ_p = null;

	/**
	 * [Dtl_purc_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_upri_req_typ_ListPutter() {
		if (Dtl_purc_upri_req_typ_p == null) {
			Dtl_purc_upri_req_typ_p = createDtl_purc_upri_req_typ_ListPutter(columnDtl_purc_upri_req_typ, "purc_upri_req_typ", "purc_upri_req_typ_nm");

		}
		return Dtl_purc_upri_req_typ_p;
	}
	
	
	/** [Dtl_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_cd_p = null;

	/**
	 * [Dtl_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_cd_ListPutter() {
		if (Dtl_trd_cur_cd_p == null) {
			Dtl_trd_cur_cd_p = createDtl_trd_cur_cd_ListPutter(columnDtl_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place");

		}
		return Dtl_trd_cur_cd_p;
	}
	
	
	/** [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_typ","tax_rate","inc_tax_flg");
		}
		return Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_base_cur_cd_p = null;

	/**
	 * [Dtl_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_base_cur_cd_ListPutter() {
		if (Dtl_base_cur_cd_p == null) {
			Dtl_base_cur_cd_p = createDtl_base_cur_cd_ListPutter(columnDtl_base_cur_cd, "base_cur_cd", "base_cur_nm","base_cur_amt_dec_place","base_cur_upri_dec_place");

		}
		return Dtl_base_cur_cd_p;
	}
	
	
	/** [Dtl_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ptax_cur_cd_p = null;

	/**
	 * [Dtl_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ptax_cur_cd_ListPutter() {
		if (Dtl_ptax_cur_cd_p == null) {
			Dtl_ptax_cur_cd_p = createDtl_ptax_cur_cd_ListPutter(columnDtl_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm","ptax_cur_amt_dec_place","ptax_cur_upri_dec_place");

		}
		return Dtl_ptax_cur_cd_p;
	}
	
	
	/** [Dtl_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_rsn_cd_p = null;

	/**
	 * [Dtl_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_rsn_cd_ListPutter() {
		if (Dtl_purc_rsn_cd_p == null) {
			Dtl_purc_rsn_cd_p = createDtl_purc_rsn_cd_ListPutter(columnDtl_purc_rsn_cd, "purc_rsn_cd", "purc_rsn_nm","xpns_purc_flg");

		}
		return Dtl_purc_rsn_cd_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = createDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoSchdListReg create(){
		MSBDP_PoSchdListReg p = new MSBDP_PoSchdListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoSchdListReg create(String name){
		MSBDP_PoSchdListReg p = new MSBDP_PoSchdListReg(name);
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
		MSBDP_PoSchdListReg_MC.jbfInitScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitPoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitTOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitFold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitTab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitSpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitCnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitIvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitInterim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitCtrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitRPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitBulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitDtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitBtn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbfInitEastBtn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitPoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitTOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitFold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitTab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitSpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitCnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitIvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitInterim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitCtrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitRPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitBulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitDtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitBtn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.jbInitEastBtn((MSBDP_PoSchdListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PoSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPoSts(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.PoStsPanel = p.beansFactory.createPanel("PoSts");
		p.PoStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PoSchdListReg p) {
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
	protected static void jbfInitTab1(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplGrp(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel = p.beansFactory.createPanel("SpplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_UPD_CRCT = p.beansFactory.createRadioButton("Cnd.ope_UPD_CRCT");
		p.Cnd_ope_SPLIT = p.beansFactory.createRadioButton("Cnd.ope_SPLIT");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_po_schd_flg = p.beansFactory.createCheckBox("Cnd.po_schd_flg");
		p.Cnd_po_flg = p.beansFactory.createCheckBox("Cnd.po_flg");
		p.Cnd_iv_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_trgt_flg");
		p.Cnd_iv_not_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_trgt_flg");
		p.Cnd_not_interim_flg = p.beansFactory.createCheckBox("Cnd.not_interim_flg");
		p.Cnd_interim_flg = p.beansFactory.createCheckBox("Cnd.interim_flg");
		p.Cnd_po_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.po_schd_dt_fr_Label");
		p.Cnd_po_schd_dt_fr = p.beansFactory.createDateField("Cnd.po_schd_dt_fr");
		p.Cnd_po_schd_dt_fr.setLabel(p.Cnd_po_schd_dt_fr_Label);
		p.Cnd_po_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.po_schd_dt_to_Label");
		p.Cnd_po_schd_dt_to = p.beansFactory.createDateField("Cnd.po_schd_dt_to");
		p.Cnd_po_schd_dt_to.setLabel(p.Cnd_po_schd_dt_to_Label);
		p.Cnd_purc_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_fr_Label");
		p.Cnd_purc_schd_dt_fr = p.beansFactory.createDateField("Cnd.purc_schd_dt_fr");
		p.Cnd_purc_schd_dt_fr.setLabel(p.Cnd_purc_schd_dt_fr_Label);
		p.Cnd_purc_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_schd_dt_to_Label");
		p.Cnd_purc_schd_dt_to = p.beansFactory.createDateField("Cnd.purc_schd_dt_to");
		p.Cnd_purc_schd_dt_to.setLabel(p.Cnd_purc_schd_dt_to_Label);
		p.Cnd_reg_dt_fr_Label = p.beansFactory.createLabel("Cnd.reg_dt_fr_Label");
		p.Cnd_reg_dt_fr = p.beansFactory.createDateField("Cnd.reg_dt_fr");
		p.Cnd_reg_dt_fr.setLabel(p.Cnd_reg_dt_fr_Label);
		p.Cnd_reg_dt_to_Label = p.beansFactory.createLabel("Cnd.reg_dt_to_Label");
		p.Cnd_reg_dt_to = p.beansFactory.createDateField("Cnd.reg_dt_to");
		p.Cnd_reg_dt_to.setLabel(p.Cnd_reg_dt_to_Label);
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_in_to_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.in_to_loc_wg_cd_Label");
		p.Cnd_in_to_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.in_to_loc_wg_cd");
		p.Cnd_in_to_loc_wg_cd.setLabel(p.Cnd_in_to_loc_wg_cd_Label);
		p.Cnd_in_to_loc_wg_nm = p.beansFactory.createTextField("Cnd.in_to_loc_wg_nm");
		p.Cnd_in_to_loc_cd_Label = p.beansFactory.createLabel("Cnd.in_to_loc_cd_Label");
		p.Cnd_in_to_loc_cd = p.beansFactory.createTextField("Cnd.in_to_loc_cd");
		p.Cnd_in_to_loc_cd.setLabel(p.Cnd_in_to_loc_cd_Label);
		p.Cnd_in_to_loc_nm = p.beansFactory.createTextField("Cnd.in_to_loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextField("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_tdlv_cd_Label = p.beansFactory.createLabel("Cnd.tdlv_cd_Label");
		p.Cnd_tdlv_cd = p.beansFactory.createTextField("Cnd.tdlv_cd");
		p.Cnd_tdlv_cd.setLabel(p.Cnd_tdlv_cd_Label);
		p.Cnd_tdlv_nm = p.beansFactory.createTextField("Cnd.tdlv_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_purc_usr_cd_Label = p.beansFactory.createLabel("Cnd.purc_usr_cd_Label");
		p.Cnd_purc_usr_cd = p.beansFactory.createTextField("Cnd.purc_usr_cd");
		p.Cnd_purc_usr_cd.setLabel(p.Cnd_purc_usr_cd_Label);
		p.Cnd_purc_usr_nm = p.beansFactory.createTextField("Cnd.purc_usr_nm");
		p.Cnd_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.purc_dpt_cd_Label");
		p.Cnd_purc_dpt_cd = p.beansFactory.createTextField("Cnd.purc_dpt_cd");
		p.Cnd_purc_dpt_cd.setLabel(p.Cnd_purc_dpt_cd_Label);
		p.Cnd_purc_dpt_nm = p.beansFactory.createTextField("Cnd.purc_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_rqst_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_wg_cd_Label");
		p.Cnd_rqst_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_wg_cd");
		p.Cnd_rqst_wg_cd.setLabel(p.Cnd_rqst_wg_cd_Label);
		p.Cnd_rqst_wg_nm = p.beansFactory.createTextField("Cnd.rqst_wg_nm");
		p.Cnd_rqst_fr_usr_cd_Label = p.beansFactory.createLabel("Cnd.rqst_fr_usr_cd_Label");
		p.Cnd_rqst_fr_usr_cd = p.beansFactory.createTextField("Cnd.rqst_fr_usr_cd");
		p.Cnd_rqst_fr_usr_cd.setLabel(p.Cnd_rqst_fr_usr_cd_Label);
		p.Cnd_rqst_fr_usr_nm = p.beansFactory.createTextField("Cnd.rqst_fr_usr_nm");
		p.Cnd_rqst_fr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.rqst_fr_dpt_cd_Label");
		p.Cnd_rqst_fr_dpt_cd = p.beansFactory.createTextField("Cnd.rqst_fr_dpt_cd");
		p.Cnd_rqst_fr_dpt_cd.setLabel(p.Cnd_rqst_fr_dpt_cd_Label);
		p.Cnd_rqst_fr_dpt_nm = p.beansFactory.createTextField("Cnd.rqst_fr_dpt_nm");
		p.Cnd_po_schd_src_typ_Label = p.beansFactory.createLabel("Cnd.po_schd_src_typ_Label");
		p.Cnd_po_schd_src_typ = p.beansFactory.createTextComboBox("Cnd.po_schd_src_typ");
		p.Cnd_po_schd_src_typ.setLabel(p.Cnd_po_schd_src_typ_Label);
		p.Cnd_po_schd_src_typ_nm = p.beansFactory.createTextField("Cnd.po_schd_src_typ_nm");
		p.Cnd_po_schd_src_no_Label = p.beansFactory.createLabel("Cnd.po_schd_src_no_Label");
		p.Cnd_po_schd_src_no = p.beansFactory.createTextField("Cnd.po_schd_src_no");
		p.Cnd_po_schd_src_no.setLabel(p.Cnd_po_schd_src_no_Label);
		p.Cnd_wg_rqst_src_typ_Label = p.beansFactory.createLabel("Cnd.wg_rqst_src_typ_Label");
		p.Cnd_wg_rqst_src_typ = p.beansFactory.createTextComboBox("Cnd.wg_rqst_src_typ");
		p.Cnd_wg_rqst_src_typ.setLabel(p.Cnd_wg_rqst_src_typ_Label);
		p.Cnd_wg_rqst_src_typ_nm = p.beansFactory.createTextField("Cnd.wg_rqst_src_typ_nm");
		p.Cnd_wg_rqst_src_no_Label = p.beansFactory.createLabel("Cnd.wg_rqst_src_no_Label");
		p.Cnd_wg_rqst_src_no = p.beansFactory.createTextField("Cnd.wg_rqst_src_no");
		p.Cnd_wg_rqst_src_no.setLabel(p.Cnd_wg_rqst_src_no_Label);
		p.Cnd_po_schd_chg_typ_Label = p.beansFactory.createLabel("Cnd.po_schd_chg_typ_Label");
		p.Cnd_po_schd_chg_typ = p.beansFactory.createTextComboBox("Cnd.po_schd_chg_typ");
		p.Cnd_po_schd_chg_typ.setLabel(p.Cnd_po_schd_chg_typ_Label);
		p.Cnd_po_schd_chg_typ_nm = p.beansFactory.createTextField("Cnd.po_schd_chg_typ_nm");
		p.Cnd_purc_sts_typ_Label = p.beansFactory.createLabel("Cnd.purc_sts_typ_Label");
		p.Cnd_purc_sts_typ = p.beansFactory.createTextComboBox("Cnd.purc_sts_typ");
		p.Cnd_purc_sts_typ.setLabel(p.Cnd_purc_sts_typ_Label);
		p.Cnd_purc_sts_typ_nm = p.beansFactory.createTextField("Cnd.purc_sts_typ_nm");
		p.Cnd_abort_flg = p.beansFactory.createCheckBox("Cnd.abort_flg");
		p.Cnd_po_schd_no_Label = p.beansFactory.createLabel("Cnd.po_schd_no_Label");
		p.Cnd_po_schd_no = p.beansFactory.createTextField("Cnd.po_schd_no");
		p.Cnd_po_schd_no.setLabel(p.Cnd_po_schd_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_slo_d_no_Label = p.beansFactory.createLabel("Cnd.slo_d_no_Label");
		p.Cnd_slo_d_no = p.beansFactory.createTextField("Cnd.slo_d_no");
		p.Cnd_slo_d_no.setLabel(p.Cnd_slo_d_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_wg_rqst_no_Label = p.beansFactory.createLabel("Cnd.wg_rqst_no_Label");
		p.Cnd_wg_rqst_no = p.beansFactory.createTextField("Cnd.wg_rqst_no");
		p.Cnd_wg_rqst_no.setLabel(p.Cnd_wg_rqst_no_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_po_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.po_cnt_rmrks_Label");
		p.Cnd_po_cnt_rmrks = p.beansFactory.createTextField("Cnd.po_cnt_rmrks");
		p.Cnd_po_cnt_rmrks.setLabel(p.Cnd_po_cnt_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_rqst_crrct_flg = p.beansFactory.createCheckBox("Cnd.rqst_crrct_flg");
	}

	/**
	 * [IvTrgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIvTrgt(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.IvTrgtPanel = p.beansFactory.createPanel("IvTrgt");
		p.IvTrgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Interim]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInterim(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.InterimPanel = p.beansFactory.createPanel("Interim");
		p.InterimTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_reg_dt_Label = p.beansFactory.createLabel("BulkSet.reg_dt_Label");
		p.BulkSet_reg_dt = p.beansFactory.createDateField("BulkSet.reg_dt");
		p.BulkSet_reg_dt.setLabel(p.BulkSet_reg_dt_Label);
		p.BulkSet_rqst_wg_cd_Label = p.beansFactory.createLabel("BulkSet.rqst_wg_cd_Label");
		p.BulkSet_rqst_wg_cd = p.beansFactory.createTextComboBox("BulkSet.rqst_wg_cd");
		p.BulkSet_rqst_wg_cd.setLabel(p.BulkSet_rqst_wg_cd_Label);
		p.BulkSet_rqst_wg_nm = p.beansFactory.createTextField("BulkSet.rqst_wg_nm");
		p.BulkSet_purc_dpt_wg_cd_Label = p.beansFactory.createLabel("BulkSet.purc_dpt_wg_cd_Label");
		p.BulkSet_purc_dpt_wg_cd = p.beansFactory.createTextField("BulkSet.purc_dpt_wg_cd");
		p.BulkSet_purc_dpt_wg_cd.setLabel(p.BulkSet_purc_dpt_wg_cd_Label);
		p.BulkSet_purc_dpt_wg_nm_Label = p.beansFactory.createLabel("BulkSet.purc_dpt_wg_nm_Label");
		p.BulkSet_purc_dpt_wg_nm = p.beansFactory.createTextField("BulkSet.purc_dpt_wg_nm");
		p.BulkSet_purc_dpt_wg_nm.setLabel(p.BulkSet_purc_dpt_wg_nm_Label);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_rqst_crrct_flg = p.beansFactory.createTableColumn("Dtl.rqst_crrct_flg", MCColumnType.CHECK);
		p.columnDtl_abort_flg = p.beansFactory.createTableColumn("Dtl.abort_flg", MCColumnType.CHECK);
		p.columnDtl_rqst_upd_stop_flg = p.beansFactory.createTableColumn("Dtl.rqst_upd_stop_flg", MCColumnType.CHECK);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_reg_dt = p.beansFactory.createTableColumn("Dtl.reg_dt", MCColumnType.DATE);
		p.columnDtl_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_drct_dlv_typ = p.beansFactory.createTableColumn("Dtl.drct_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_drct_dlv_typ_nm = p.beansFactory.createTableColumn("Dtl.drct_dlv_typ_nm", MCColumnType.TEXT);
		p.columnDtl_outsrc_sppl_cd = p.beansFactory.createTableColumn("Dtl.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_bef_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.bef_in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_bef_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.bef_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_bef_loc_grp_cd = p.beansFactory.createTableColumn("Dtl.bef_loc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_itm_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.itm_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_rqst_wg_cd = p.beansFactory.createTableColumn("Dtl.rqst_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rqst_wg_nm = p.beansFactory.createTableColumn("Dtl.rqst_wg_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cal_cd = p.beansFactory.createTableColumn("Dtl.dlv_cal_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_iv_flg = p.beansFactory.createTableColumn("Dtl.sppl_iv_flg", MCColumnType.CHECK);
		p.columnDtl_prnt_lcl_cd = p.beansFactory.createTableColumn("Dtl.prnt_lcl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.sppl_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_sppl_cal_cd = p.beansFactory.createTableColumn("Dtl.sppl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_avl_rqst_dt = p.beansFactory.createTableColumn("Dtl.rqst_avl_rqst_dt", MCColumnType.DATE);
		p.columnDtl_purc_schd_dt = p.beansFactory.createTableColumn("Dtl.purc_schd_dt", MCColumnType.DATE);
		p.columnDtl_po_schd_dt = p.beansFactory.createTableColumn("Dtl.po_schd_dt", MCColumnType.DATE);
		p.columnDtl_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_outsrc_itm_ord_no = p.beansFactory.createTableColumn("Dtl.outsrc_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl_def_purc_usr_cd = p.beansFactory.createTableColumn("Dtl.def_purc_usr_cd", MCColumnType.TEXT);
		p.columnDtl_def_purc_dpt_cd = p.beansFactory.createTableColumn("Dtl.def_purc_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_purc_dpt_wg_cd = p.beansFactory.createTableColumn("Dtl.purc_dpt_wg_cd", MCColumnType.TEXT);
		p.columnDtl_purc_dpt_wg_nm = p.beansFactory.createTableColumn("Dtl.purc_dpt_wg_nm", MCColumnType.TEXT);
		p.columnDtl_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ", MCColumnType.TEXT);
		p.columnDtl_old_trd_cur_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtl_old_trd_cur_proc_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_proc_upri", MCColumnType.NUMBER);
		p.columnDtl_old_trd_cur_onr_prov_upri = p.beansFactory.createTableColumn("Dtl.old_trd_cur_onr_prov_upri", MCColumnType.NUMBER);
		p.columnDtl_old_interim_flg = p.beansFactory.createTableColumn("Dtl.old_interim_flg", MCColumnType.CHECK);
		p.columnDtl_xrate_cd = p.beansFactory.createTableColumn("Dtl.xrate_cd", MCColumnType.TEXT);
		p.columnDtl_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_base_cur_cd = p.beansFactory.createTableColumn("Dtl.base_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_base_cur_nm = p.beansFactory.createTableColumn("Dtl.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl.ptax_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_purc_rsn_cd = p.beansFactory.createTableColumn("Dtl.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_not_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.not_xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_po_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.po_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_po_flg = p.beansFactory.createTableColumn("Dtl.po_flg", MCColumnType.CHECK);
		p.columnDtl_purc_sts_typ = p.beansFactory.createTableColumn("Dtl.purc_sts_typ", MCColumnType.TEXT);
		p.columnDtl_purc_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_schd_chg_typ = p.beansFactory.createTableColumn("Dtl.po_schd_chg_typ", MCColumnType.TEXT);
		p.columnDtl_po_schd_chg_typ_nm = p.beansFactory.createTableColumn("Dtl.po_schd_chg_typ_nm", MCColumnType.TEXT);
		p.columnDtl_split_src_schd_no = p.beansFactory.createTableColumn("Dtl.split_src_schd_no", MCColumnType.TEXT);
		p.columnDtl_org_flg = p.beansFactory.createTableColumn("Dtl.org_flg", MCColumnType.CHECK);
		p.columnDtl_add_flg = p.beansFactory.createTableColumn("Dtl.add_flg", MCColumnType.CHECK);
		p.columnDtl_outsrc_flg = p.beansFactory.createTableColumn("Dtl.outsrc_flg", MCColumnType.CHECK);
		p.columnDtl_rqst_can_flg = p.beansFactory.createTableColumn("Dtl.rqst_can_flg", MCColumnType.CHECK);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_wg_rqst_src_typ = p.beansFactory.createTableColumn("Dtl.wg_rqst_src_typ", MCColumnType.TEXT);
		p.columnDtl_wg_rqst_src_typ_nm = p.beansFactory.createTableColumn("Dtl.wg_rqst_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_wg_rqst_src_no = p.beansFactory.createTableColumn("Dtl.wg_rqst_src_no", MCColumnType.TEXT);
		p.columnDtl_wg_rqst_no = p.beansFactory.createTableColumn("Dtl.wg_rqst_no", MCColumnType.TEXT);
		p.columnDtl_po_schd_src_typ = p.beansFactory.createTableColumn("Dtl.po_schd_src_typ", MCColumnType.TEXT);
		p.columnDtl_po_schd_src_typ_nm = p.beansFactory.createTableColumn("Dtl.po_schd_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_schd_src_no = p.beansFactory.createTableColumn("Dtl.po_schd_src_no", MCColumnType.TEXT);
		p.columnDtl_po_schd_no = p.beansFactory.createTableColumn("Dtl.po_schd_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_po_schd_upd_cntr = p.beansFactory.createTableColumn("Dtl.po_schd_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_bef_abort_flg = p.beansFactory.createTableColumn("Dtl.bef_abort_flg", MCColumnType.CHECK);
		p.columnDtl_base_dt = p.beansFactory.createTableColumn("Dtl.base_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0040 = p.beansFactory.createButton("Btn.open_MSBDP0040", "open");
		p.Btn_srch_schd_dt = p.beansFactory.createButton("Btn.srch_schd_dt");
		p.Btn_srch_upri = p.beansFactory.createButton("Btn.srch_upri");
		p.Btn_srch_dlv = p.beansFactory.createButton("Btn.srch_dlv");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_crct = p.beansFactory.createButton("Btn.upd_crct", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.PoStsPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [PoSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPoSts(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.PoStsPanel.setBorder(p.PoStsTitledBorder);
		p.add(p.PoStsPanel);
		p.PoStsPanel.setNextBeans(p.TOPPanel);
		p.PoStsPanel.setValueCheck(false);
		p.PoStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PoStsPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.add(p.TOPPanel);
		p.TOPPanel.setNextBeans(p.BulkSetPanel);
		p.TOPPanel.setValueCheck(false);
		p.TOPPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TOPPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TOPPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TOPPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TOPPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TOPPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.SpplGrpPanel);
		p.FoldTab.add(p.SpplGrpPanel, "Fold.tab2");
		p.SpplGrpPanel.setNextBeans(p.ItmGrpPanel);
		p.FoldTab.add(p.ItmGrpPanel, "Fold.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.SpplGrpPanel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.IvTrgtPanel, null);
		p.Tab1Panel.setLastBeans(p.IvTrgtPanel);
		p.IvTrgtPanel.setNextBeans(p.InterimPanel);
		p.Tab1Panel.add(p.InterimPanel, null);
		p.InterimPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplGrp(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel.setNextBeans(p.ItmGrpPanel);
		p.SpplGrpPanel.setValueCheck(false);
		p.SpplGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setValueCheck(false);
		p.ItmGrpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_UPD_CRCT);
		p.Cnd_ope_UPD_CRCT.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_CRCT);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_CRCT);
		p.Cnd_ope_UPD_CRCT.setNextBeans(p.Cnd_ope_SPLIT);
		p.Cnd_ope_SPLIT.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_SPLIT);
		p.ScreenOpePanel.add(p.Cnd_ope_SPLIT);
		p.Cnd_ope_SPLIT.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.ope_META);
		p.PoStsPanel.add(p.Cnd_po_schd_flg);
		p.PoStsPanel.setLastBeans(p.Cnd_po_schd_flg);
		p.Cnd_po_schd_flg.setNextBeans(p.Cnd_po_flg);
		p.Cnd_po_schd_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_flg_META);
		p.PoStsPanel.add(p.Cnd_po_flg);
		p.Cnd_po_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_flg_META);
		p.IvTrgtPanel.add(p.Cnd_iv_trgt_flg);
		p.IvTrgtPanel.setLastBeans(p.Cnd_iv_trgt_flg);
		p.Cnd_iv_trgt_flg.setNextBeans(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.iv_trgt_flg_META);
		p.IvTrgtPanel.add(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_not_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.iv_not_trgt_flg_META);
		p.InterimPanel.add(p.Cnd_not_interim_flg);
		p.InterimPanel.setLastBeans(p.Cnd_not_interim_flg);
		p.Cnd_not_interim_flg.setNextBeans(p.Cnd_interim_flg);
		p.Cnd_not_interim_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.not_interim_flg_META);
		p.InterimPanel.add(p.Cnd_interim_flg);
		p.Cnd_interim_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.interim_flg_META);
		p.CndPanel.add(p.Cnd_po_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_po_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_po_schd_dt_fr);
		p.Cnd_po_schd_dt_fr.setNextBeans(p.Cnd_po_schd_dt_to);
		p.Cnd_po_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_dt_fr_META);
		p.Cnd_po_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_po_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_po_schd_dt_to);
		p.Cnd_po_schd_dt_to.setNextBeans(p.Cnd_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_po_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_dt_to_META);
		p.Cnd_po_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.setNextBeans(p.Cnd_purc_schd_dt_fr);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_fr);
		p.Cnd_purc_schd_dt_fr.setNextBeans(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_schd_dt_fr_META);
		p.Cnd_purc_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_schd_dt_to);
		p.Cnd_purc_schd_dt_to.setNextBeans(p.Cnd_reg_dt_fr);
		p.Cnd_purc_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_schd_dt_to_META);
		p.Cnd_purc_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_reg_dt_fr_Label);
		p.CndPanel.add(p.Cnd_reg_dt_fr);
		p.Cnd_reg_dt_fr.setNextBeans(p.Cnd_reg_dt_to);
		p.Cnd_reg_dt_fr.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.reg_dt_fr_META);
		p.Cnd_reg_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_reg_dt_to_Label);
		p.CndPanel.add(p.Cnd_reg_dt_to);
		p.Cnd_reg_dt_to.setNextBeans(p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_reg_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.reg_dt_to_META);
		p.Cnd_reg_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.setNextBeans(p.Cnd_sppl_cd);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_in_to_loc_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_in_to_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_loc_wg_cd, true);
		p.Cnd_in_to_loc_wg_cd.setLinkBeans(p.Cnd_in_to_loc_wg_nm);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_cd);
		p.Cnd_in_to_loc_wg_cd.setNextBeans(p.Cnd_in_to_loc_wg_nm);
		p.Cnd_in_to_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.in_to_loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_nm);
		p.Cnd_in_to_loc_wg_nm.setNextBeans(p.Cnd_in_to_loc_cd);
		p.Cnd_in_to_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.in_to_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_in_to_loc_wg_nm, true);
		p.CndPanel.add(p.Cnd_in_to_loc_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_loc_cd);
		p.Cnd_in_to_loc_cd.setNextBeans(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.in_to_loc_cd_META);
		p.Cnd_in_to_loc_cd.addLinkBeans(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_loc_cd, true);
		p.CndPanel.add(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_in_to_loc_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.in_to_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_in_to_loc_nm, true);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.str_ln_cd_META);
		p.Cnd_str_ln_cd.addLinkBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_sno_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_purc_usr_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_purc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_purc_usr_cd);
		p.Cnd_purc_usr_cd.setNextBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_usr_cd_META);
		p.Cnd_purc_usr_cd.addLinkBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_usr_cd, true);
		p.CndPanel.add(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_nm.setNextBeans(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_usr_nm, true);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_dpt_cd_META);
		p.Cnd_purc_dpt_cd.addLinkBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_rqst_wg_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_rqst_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_wg_cd, true);
		p.Cnd_rqst_wg_cd.setLinkBeans(p.Cnd_rqst_wg_nm);
		p.CndPanel.add(p.Cnd_rqst_wg_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_wg_cd);
		p.Cnd_rqst_wg_cd.setNextBeans(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_wg_cd_META);
		p.CndPanel.add(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_nm.setNextBeans(p.Cnd_rqst_fr_usr_cd);
		p.Cnd_rqst_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_wg_nm, true);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_cd);
		p.Cnd_rqst_fr_usr_cd.setNextBeans(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_fr_usr_cd_META);
		p.Cnd_rqst_fr_usr_cd.addLinkBeans(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_fr_usr_cd, true);
		p.CndPanel.add(p.Cnd_rqst_fr_usr_nm);
		p.Cnd_rqst_fr_usr_nm.setNextBeans(p.Cnd_rqst_fr_dpt_cd);
		p.Cnd_rqst_fr_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_fr_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_fr_usr_nm, true);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_cd);
		p.Cnd_rqst_fr_dpt_cd.setNextBeans(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_fr_dpt_cd_META);
		p.Cnd_rqst_fr_dpt_cd.addLinkBeans(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_fr_dpt_cd, true);
		p.CndPanel.add(p.Cnd_rqst_fr_dpt_nm);
		p.Cnd_rqst_fr_dpt_nm.setNextBeans(p.Cnd_po_schd_src_typ);
		p.Cnd_rqst_fr_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_fr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_fr_dpt_nm, true);
		p.Cnd_po_schd_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_po_schd_src_typ, true);
		p.Cnd_po_schd_src_typ.setLinkBeans(p.Cnd_po_schd_src_typ_nm);
		p.CndPanel.add(p.Cnd_po_schd_src_typ_Label);
		p.CndPanel.add(p.Cnd_po_schd_src_typ);
		p.Cnd_po_schd_src_typ.setNextBeans(p.Cnd_po_schd_src_typ_nm);
		p.Cnd_po_schd_src_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_src_typ_META);
		p.CndPanel.add(p.Cnd_po_schd_src_typ_nm);
		p.Cnd_po_schd_src_typ_nm.setNextBeans(p.Cnd_po_schd_src_no);
		p.Cnd_po_schd_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_src_typ_nm_META);
		p.CndPanel.add(p.Cnd_po_schd_src_no_Label);
		p.CndPanel.add(p.Cnd_po_schd_src_no);
		p.Cnd_po_schd_src_no.setNextBeans(p.Cnd_wg_rqst_src_typ);
		p.Cnd_po_schd_src_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_src_no_META);
		p.setPluralValueEnable(p.Cnd_po_schd_src_no, true);
		p.Cnd_wg_rqst_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_rqst_src_typ, true);
		p.Cnd_wg_rqst_src_typ.setLinkBeans(p.Cnd_wg_rqst_src_typ_nm);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ);
		p.Cnd_wg_rqst_src_typ.setNextBeans(p.Cnd_wg_rqst_src_typ_nm);
		p.Cnd_wg_rqst_src_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_rqst_src_typ_META);
		p.CndPanel.add(p.Cnd_wg_rqst_src_typ_nm);
		p.Cnd_wg_rqst_src_typ_nm.setNextBeans(p.Cnd_wg_rqst_src_no);
		p.Cnd_wg_rqst_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_rqst_src_typ_nm_META);
		p.CndPanel.add(p.Cnd_wg_rqst_src_no_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_src_no);
		p.Cnd_wg_rqst_src_no.setNextBeans(p.Cnd_po_schd_chg_typ);
		p.Cnd_wg_rqst_src_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_rqst_src_no_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_src_no, true);
		p.Cnd_po_schd_chg_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_po_schd_chg_typ, true);
		p.Cnd_po_schd_chg_typ.setLinkBeans(p.Cnd_po_schd_chg_typ_nm);
		p.CndPanel.add(p.Cnd_po_schd_chg_typ_Label);
		p.CndPanel.add(p.Cnd_po_schd_chg_typ);
		p.Cnd_po_schd_chg_typ.setNextBeans(p.Cnd_po_schd_chg_typ_nm);
		p.Cnd_po_schd_chg_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_chg_typ_META);
		p.CndPanel.add(p.Cnd_po_schd_chg_typ_nm);
		p.Cnd_po_schd_chg_typ_nm.setNextBeans(p.Cnd_purc_sts_typ);
		p.Cnd_po_schd_chg_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_chg_typ_nm_META);
		p.Cnd_purc_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_sts_typ, true);
		p.Cnd_purc_sts_typ.setLinkBeans(p.Cnd_purc_sts_typ_nm);
		p.CndPanel.add(p.Cnd_purc_sts_typ_Label);
		p.CndPanel.add(p.Cnd_purc_sts_typ);
		p.Cnd_purc_sts_typ.setNextBeans(p.Cnd_purc_sts_typ_nm);
		p.Cnd_purc_sts_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_sts_typ_META);
		p.CndPanel.add(p.Cnd_purc_sts_typ_nm);
		p.Cnd_purc_sts_typ_nm.setNextBeans(p.Cnd_abort_flg);
		p.Cnd_purc_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.purc_sts_typ_nm_META);
		p.CndPanel.add(p.Cnd_abort_flg);
		p.Cnd_abort_flg.setNextBeans(p.Cnd_po_schd_no);
		p.Cnd_abort_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.abort_flg_META);
		p.CndPanel.add(p.Cnd_po_schd_no_Label);
		p.CndPanel.add(p.Cnd_po_schd_no);
		p.Cnd_po_schd_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_po_schd_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_schd_no_META);
		p.setPluralValueEnable(p.Cnd_po_schd_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_slo_d_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_slo_d_no_Label);
		p.CndPanel.add(p.Cnd_slo_d_no);
		p.Cnd_slo_d_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_slo_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.slo_d_no_META);
		p.setPluralValueEnable(p.Cnd_slo_d_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_wg_rqst_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_wg_rqst_no_Label);
		p.CndPanel.add(p.Cnd_wg_rqst_no);
		p.Cnd_wg_rqst_no.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_wg_rqst_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.wg_rqst_no_META);
		p.setPluralValueEnable(p.Cnd_wg_rqst_no, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_po_cnt_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_po_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_po_cnt_rmrks);
		p.Cnd_po_cnt_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_po_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.po_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_po_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_rqst_crrct_flg);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.SpplGrpPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.SpplGrpPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.CndPanel.add(p.Cnd_rqst_crrct_flg);
		p.Cnd_rqst_crrct_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0030.CndR.rqst_crrct_flg_META);
	}

	/**
	 * [IvTrgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIvTrgt(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.IvTrgtPanel.setBorder(p.IvTrgtTitledBorder);
		p.IvTrgtPanel.setValueCheck(false);
		p.IvTrgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvTrgtPanel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
	}

	/**
	 * [Interim]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInterim(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.InterimPanel.setBorder(p.InterimTitledBorder);
		p.InterimPanel.setValueCheck(false);
		p.InterimPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InterimPanel.setLayoutPosition("NSWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PoSchdListReg p) {
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
	protected static void jbInitRPnl(MSBDP_PoSchdListReg p) {
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
	protected static void jbInitBulkSet(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_reg_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_reg_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_reg_dt);
		p.BulkSet_reg_dt.setNextBeans(p.BulkSet_rqst_wg_cd);
		p.BulkSet_reg_dt.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0030.BulkSetR.reg_dt_META);
		p.BulkSet_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_rqst_wg_cd.setListType(MCListType.STRICT);
		p.BulkSet_rqst_wg_cd.setLinkBeans(p.BulkSet_rqst_wg_nm);
		p.BulkSetPanel.add(p.BulkSet_rqst_wg_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_rqst_wg_cd);
		p.BulkSet_rqst_wg_cd.setNextBeans(p.BulkSet_rqst_wg_nm);
		p.BulkSet_rqst_wg_cd.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0030.BulkSetR.rqst_wg_cd_META);
		p.BulkSetPanel.add(p.BulkSet_rqst_wg_nm);
		p.BulkSet_rqst_wg_nm.setNextBeans(p.BulkSet_rqst_fr_usr_dpt_p_PPanel);
		p.BulkSet_rqst_wg_nm.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0030.BulkSetR.rqst_wg_nm_META);
		p.BulkSetPanel.add(p.BulkSet_rqst_fr_usr_dpt_p_PPanel);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_rqst_fr_dpt_nm);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.setNextBeans(p.BulkSet_purc_dpt_wg_cd);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_purc_dpt_nm,p.BulkSet_purc_dpt_wg_cd,p.BulkSet_purc_dpt_wg_nm);
		p.BulkSetPanel.add(p.BulkSet_purc_dpt_wg_cd_Label);
		p.BulkSetPanel.add(p.BulkSet_purc_dpt_wg_cd);
		p.BulkSet_purc_dpt_wg_cd.setNextBeans(p.BulkSet_purc_dpt_wg_nm);
		p.BulkSet_purc_dpt_wg_cd.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0030.BulkSetR.purc_dpt_wg_cd_META);
		p.BulkSetPanel.add(p.BulkSet_purc_dpt_wg_nm_Label);
		p.BulkSetPanel.add(p.BulkSet_purc_dpt_wg_nm);
		p.BulkSet_purc_dpt_wg_nm.setRow(p.getBulkSetR(), mcframe.clientMSBD.MSBDP0030.BulkSetR.purc_dpt_wg_nm_META);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PoSchdListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBDP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBDP0040);
		p.Btn_open_MSBDP0040.setNextBeans(p.Btn_srch_schd_dt);
		p.Btn_srch_schd_dt.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_srch_schd_dt);
		p.Btn_srch_schd_dt.setNextBeans(p.Btn_srch_upri);
		p.Btn_srch_upri.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_srch_upri);
		p.Btn_srch_upri.setNextBeans(p.Btn_srch_dlv);
		p.Btn_srch_dlv.setFunctionKey(MCFunctionKey.F23);
		p.BtnPanel.add(p.Btn_srch_dlv);
		p.Btn_srch_dlv.setNextBeans(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_crct);
		p.Btn_upd_crct.setIcon("REGISTER");
		p.Btn_upd_crct.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_crct);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PoSchdListReg p) {
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
		MSBDP_PoSchdListReg_MC.mcInitScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitPoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitTOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitFold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitTab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitSpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitCnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitIvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitInterim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitCtrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitRPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitBulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitDtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitBtn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.mcInitEastBtn((MSBDP_PoSchdListReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD_EastBtn((MSBDP_PoSchdListReg)this);

		// [SRCH_UPD_CRCT]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__UPD__CRCT_EastBtn((MSBDP_PoSchdListReg)this);

		// [SRCH_SPLIT]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__SPLIT_EastBtn((MSBDP_PoSchdListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__DEL_EastBtn((MSBDP_PoSchdListReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSRCH__REF_EastBtn((MSBDP_PoSchdListReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitINS_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitINS_EastBtn((MSBDP_PoSchdListReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitUPD_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD_EastBtn((MSBDP_PoSchdListReg)this);

		// [UPD_CRCT]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitUPD__CRCT_EastBtn((MSBDP_PoSchdListReg)this);

		// [SPLIT]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitSPLIT_EastBtn((MSBDP_PoSchdListReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitDEL_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitDEL_EastBtn((MSBDP_PoSchdListReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitREF_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitREF_EastBtn((MSBDP_PoSchdListReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_PoSts((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_TOP((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Fold((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Tab1((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_SpplGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_ItmGrp((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Cnd((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_IvTrgt((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Interim((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Ctrl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_RPnl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_BulkSet((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Dtl((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_Btn((MSBDP_PoSchdListReg)this);
		MSBDP_PoSchdListReg_MC.statusInitFIX__I_EastBtn((MSBDP_PoSchdListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [PoSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPoSts(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PoSchdListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [SpplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplGrp(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PoSchdListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_UPD_CRCT.addAllListener(p);
		p.Cnd_ope_SPLIT.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_po_schd_flg.addAllListener(p);
		p.Cnd_po_flg.addAllListener(p);
		p.Cnd_iv_trgt_flg.addAllListener(p);
		p.Cnd_iv_not_trgt_flg.addAllListener(p);
		p.Cnd_not_interim_flg.addAllListener(p);
		p.Cnd_interim_flg.addAllListener(p);
		p.Cnd_po_schd_dt_fr.setListListener(p);
		p.Cnd_po_schd_dt_fr.addAllListener(p);
		p.Cnd_po_schd_dt_to.setListListener(p);
		p.Cnd_po_schd_dt_to.addAllListener(p);
		p.Cnd_purc_schd_dt_fr.setListListener(p);
		p.Cnd_purc_schd_dt_fr.addAllListener(p);
		p.Cnd_purc_schd_dt_to.setListListener(p);
		p.Cnd_purc_schd_dt_to.addAllListener(p);
		p.Cnd_reg_dt_fr.setListListener(p);
		p.Cnd_reg_dt_fr.addAllListener(p);
		p.Cnd_reg_dt_to.setListListener(p);
		p.Cnd_reg_dt_to.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_in_to_loc_wg_cd.setListListener(p);
		p.Cnd_in_to_loc_wg_cd.addAllListener(p);
		p.Cnd_in_to_loc_wg_nm.setListListener(p);
		p.Cnd_in_to_loc_wg_nm.addAllListener(p);
		p.Cnd_in_to_loc_cd.setListListener(p);
		p.Cnd_in_to_loc_cd.addAllListener(p);
		p.Cnd_in_to_loc_nm.setListListener(p);
		p.Cnd_in_to_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_tdlv_cd.setListListener(p);
		p.Cnd_tdlv_cd.addAllListener(p);
		p.Cnd_tdlv_nm.setListListener(p);
		p.Cnd_tdlv_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_purc_usr_cd.setListListener(p);
		p.Cnd_purc_usr_cd.addAllListener(p);
		p.Cnd_purc_usr_nm.setListListener(p);
		p.Cnd_purc_usr_nm.addAllListener(p);
		p.Cnd_purc_dpt_cd.setListListener(p);
		p.Cnd_purc_dpt_cd.addAllListener(p);
		p.Cnd_purc_dpt_nm.setListListener(p);
		p.Cnd_purc_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_rqst_wg_cd.setListListener(p);
		p.Cnd_rqst_wg_cd.addAllListener(p);
		p.Cnd_rqst_wg_nm.setListListener(p);
		p.Cnd_rqst_wg_nm.addAllListener(p);
		p.Cnd_rqst_fr_usr_cd.setListListener(p);
		p.Cnd_rqst_fr_usr_cd.addAllListener(p);
		p.Cnd_rqst_fr_usr_nm.setListListener(p);
		p.Cnd_rqst_fr_usr_nm.addAllListener(p);
		p.Cnd_rqst_fr_dpt_cd.setListListener(p);
		p.Cnd_rqst_fr_dpt_cd.addAllListener(p);
		p.Cnd_rqst_fr_dpt_nm.setListListener(p);
		p.Cnd_rqst_fr_dpt_nm.addAllListener(p);
		p.Cnd_po_schd_src_typ.setListListener(p);
		p.Cnd_po_schd_src_typ.addAllListener(p);
		p.Cnd_po_schd_src_typ_nm.setListListener(p);
		p.Cnd_po_schd_src_typ_nm.addAllListener(p);
		p.Cnd_po_schd_src_no.setListListener(p);
		p.Cnd_po_schd_src_no.addAllListener(p);
		p.Cnd_wg_rqst_src_typ.setListListener(p);
		p.Cnd_wg_rqst_src_typ.addAllListener(p);
		p.Cnd_wg_rqst_src_typ_nm.setListListener(p);
		p.Cnd_wg_rqst_src_typ_nm.addAllListener(p);
		p.Cnd_wg_rqst_src_no.setListListener(p);
		p.Cnd_wg_rqst_src_no.addAllListener(p);
		p.Cnd_po_schd_chg_typ.setListListener(p);
		p.Cnd_po_schd_chg_typ.addAllListener(p);
		p.Cnd_po_schd_chg_typ_nm.setListListener(p);
		p.Cnd_po_schd_chg_typ_nm.addAllListener(p);
		p.Cnd_purc_sts_typ.setListListener(p);
		p.Cnd_purc_sts_typ.addAllListener(p);
		p.Cnd_purc_sts_typ_nm.setListListener(p);
		p.Cnd_purc_sts_typ_nm.addAllListener(p);
		p.Cnd_abort_flg.addAllListener(p);
		p.Cnd_po_schd_no.setListListener(p);
		p.Cnd_po_schd_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_slo_d_no.setListListener(p);
		p.Cnd_slo_d_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_wg_rqst_no.setListListener(p);
		p.Cnd_wg_rqst_no.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_po_cnt_rmrks.setListListener(p);
		p.Cnd_po_cnt_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_rqst_crrct_flg.addAllListener(p);
	}

	/**
	 *  [IvTrgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIvTrgt(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [Interim]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInterim(MSBDP_PoSchdListReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PoSchdListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBDP_PoSchdListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBDP_PoSchdListReg p) {
		p.BulkSet_reg_dt.setListListener(p);
		p.BulkSet_reg_dt.addAllListener(p);
		p.BulkSet_rqst_wg_cd.setListListener(p);
		p.BulkSet_rqst_wg_cd.addAllListener(p);
		p.BulkSet_rqst_wg_nm.setListListener(p);
		p.BulkSet_rqst_wg_nm.addAllListener(p);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_usr_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.BulkSet_purc_dpt_wg_cd.setListListener(p);
		p.BulkSet_purc_dpt_wg_cd.addAllListener(p);
		p.BulkSet_purc_dpt_wg_nm.setListListener(p);
		p.BulkSet_purc_dpt_wg_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBDP_PoSchdListReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_rqst_crrct_flg.addAllListener(p);
		p.columnDtl_abort_flg.addAllListener(p);
		p.columnDtl_rqst_upd_stop_flg.addAllListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_reg_dt.addAllListener(p);
		p.columnDtl_reg_dt.setListListener(p);
		p.columnDtl_in_to_loc_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cd.setListListener(p);
		p.columnDtl_in_to_loc_nm.addAllListener(p);
		p.columnDtl_in_to_loc_nm.setListListener(p);
		p.columnDtl_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl_drct_dlv_typ.addAllListener(p);
		p.columnDtl_drct_dlv_typ.setListListener(p);
		p.columnDtl_drct_dlv_typ_nm.addAllListener(p);
		p.columnDtl_drct_dlv_typ_nm.setListListener(p);
		p.columnDtl_outsrc_sppl_cd.addAllListener(p);
		p.columnDtl_outsrc_sppl_cd.setListListener(p);
		p.columnDtl_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_in_to_loc_cal_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cal_cd.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_loc_grp_cd.addAllListener(p);
		p.columnDtl_loc_grp_cd.setListListener(p);
		p.columnDtl_bef_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_bef_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_bef_lg_grp_cd.addAllListener(p);
		p.columnDtl_bef_lg_grp_cd.setListListener(p);
		p.columnDtl_bef_loc_grp_cd.addAllListener(p);
		p.columnDtl_bef_loc_grp_cd.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_itm_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_rqst_wg_cd.addAllListener(p);
		p.columnDtl_rqst_wg_cd.setListListener(p);
		p.columnDtl_rqst_wg_nm.addAllListener(p);
		p.columnDtl_rqst_wg_nm.setListListener(p);
		p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_usr_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_dlv_cal_cd.addAllListener(p);
		p.columnDtl_dlv_cal_cd.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_sppl_iv_flg.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.addAllListener(p);
		p.columnDtl_prnt_lcl_cd.setListListener(p);
		p.columnDtl_sppl_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl_sppl_cal_cd.addAllListener(p);
		p.columnDtl_sppl_cal_cd.setListListener(p);
		p.columnDtl_purc_amt_rnd_typ.addAllListener(p);
		p.columnDtl_purc_amt_rnd_typ.setListListener(p);
		p.columnDtl_purc_tax_rnd_typ.addAllListener(p);
		p.columnDtl_purc_tax_rnd_typ.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_sppl_itm_cd.addAllListener(p);
		p.columnDtl_sppl_itm_cd.setListListener(p);
		p.columnDtl_sppl_itm_nm.addAllListener(p);
		p.columnDtl_sppl_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_rqst_avl_rqst_dt.addAllListener(p);
		p.columnDtl_rqst_avl_rqst_dt.setListListener(p);
		p.columnDtl_purc_schd_dt.addAllListener(p);
		p.columnDtl_purc_schd_dt.setListListener(p);
		p.columnDtl_po_schd_dt.addAllListener(p);
		p.columnDtl_po_schd_dt.setListListener(p);
		p.columnDtl_mfg_loc_cd.addAllListener(p);
		p.columnDtl_mfg_loc_cd.setListListener(p);
		p.columnDtl_mfg_loc_nm.addAllListener(p);
		p.columnDtl_mfg_loc_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_outsrc_itm_ord_no.addAllListener(p);
		p.columnDtl_outsrc_itm_ord_no.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_def_purc_usr_cd.addAllListener(p);
		p.columnDtl_def_purc_usr_cd.setListListener(p);
		p.columnDtl_def_purc_dpt_cd.addAllListener(p);
		p.columnDtl_def_purc_dpt_cd.setListListener(p);
		p.columnDtl_purc_dpt_wg_cd.addAllListener(p);
		p.columnDtl_purc_dpt_wg_cd.setListListener(p);
		p.columnDtl_purc_dpt_wg_nm.addAllListener(p);
		p.columnDtl_purc_dpt_wg_nm.setListListener(p);
		p.columnDtl_purc_upri_req_typ.addAllListener(p);
		p.columnDtl_purc_upri_req_typ.setListListener(p);
		p.columnDtl_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_purc_upri_req_typ_nm.setListListener(p);
		p.columnDtl_trd_cur_cd.addAllListener(p);
		p.columnDtl_trd_cur_cd.setListListener(p);
		p.columnDtl_trd_cur_nm.addAllListener(p);
		p.columnDtl_trd_cur_nm.setListListener(p);
		p.columnDtl_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_upri_dec_place.setListListener(p);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_repurc_obli_flg.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.setListListener(p);
		p.columnDtl_old_trd_cur_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_upri.setListListener(p);
		p.columnDtl_old_trd_cur_proc_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_proc_upri.setListListener(p);
		p.columnDtl_old_trd_cur_onr_prov_upri.addAllListener(p);
		p.columnDtl_old_trd_cur_onr_prov_upri.setListListener(p);
		p.columnDtl_old_interim_flg.addAllListener(p);
		p.columnDtl_xrate_cd.addAllListener(p);
		p.columnDtl_xrate_cd.setListListener(p);
		p.columnDtl_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_base_cur_cd.addAllListener(p);
		p.columnDtl_base_cur_cd.setListListener(p);
		p.columnDtl_base_cur_nm.addAllListener(p);
		p.columnDtl_base_cur_nm.setListListener(p);
		p.columnDtl_base_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_base_cur_amt_dec_place.setListListener(p);
		p.columnDtl_base_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_base_cur_upri_dec_place.setListListener(p);
		p.columnDtl_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_ptax_cur_cd.addAllListener(p);
		p.columnDtl_ptax_cur_cd.setListListener(p);
		p.columnDtl_ptax_cur_nm.addAllListener(p);
		p.columnDtl_ptax_cur_nm.setListListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.setListListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.setListListener(p);
		p.columnDtl_purc_rsn_cd.addAllListener(p);
		p.columnDtl_purc_rsn_cd.setListListener(p);
		p.columnDtl_purc_rsn_nm.addAllListener(p);
		p.columnDtl_purc_rsn_nm.setListListener(p);
		p.columnDtl_xpns_purc_flg.addAllListener(p);
		p.columnDtl_not_xpns_purc_flg.addAllListener(p);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_bd_lot_mng_typ.addAllListener(p);
		p.columnDtl_bd_lot_mng_typ.setListListener(p);
		p.columnDtl_bd_sublot_mng_typ.addAllListener(p);
		p.columnDtl_bd_sublot_mng_typ.setListListener(p);
		p.columnDtl_bd_lot_no_typ.addAllListener(p);
		p.columnDtl_bd_lot_no_typ.setListListener(p);
		p.columnDtl_bd_sublot_no_typ.addAllListener(p);
		p.columnDtl_bd_sublot_no_typ.setListListener(p);
		p.columnDtl_bd_sno1_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno1_mng_typ.setListListener(p);
		p.columnDtl_bd_sno2_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno2_mng_typ.setListListener(p);
		p.columnDtl_bd_sno3_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno3_mng_typ.setListListener(p);
		p.columnDtl_bd_sno4_mng_typ.addAllListener(p);
		p.columnDtl_bd_sno4_mng_typ.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_po_cnt_rmrks.addAllListener(p);
		p.columnDtl_po_cnt_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_po_flg.addAllListener(p);
		p.columnDtl_purc_sts_typ.addAllListener(p);
		p.columnDtl_purc_sts_typ.setListListener(p);
		p.columnDtl_purc_sts_typ_nm.addAllListener(p);
		p.columnDtl_purc_sts_typ_nm.setListListener(p);
		p.columnDtl_po_schd_chg_typ.addAllListener(p);
		p.columnDtl_po_schd_chg_typ.setListListener(p);
		p.columnDtl_po_schd_chg_typ_nm.addAllListener(p);
		p.columnDtl_po_schd_chg_typ_nm.setListListener(p);
		p.columnDtl_split_src_schd_no.addAllListener(p);
		p.columnDtl_split_src_schd_no.setListListener(p);
		p.columnDtl_org_flg.addAllListener(p);
		p.columnDtl_add_flg.addAllListener(p);
		p.columnDtl_outsrc_flg.addAllListener(p);
		p.columnDtl_rqst_can_flg.addAllListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_wg_rqst_src_typ.addAllListener(p);
		p.columnDtl_wg_rqst_src_typ.setListListener(p);
		p.columnDtl_wg_rqst_src_typ_nm.addAllListener(p);
		p.columnDtl_wg_rqst_src_typ_nm.setListListener(p);
		p.columnDtl_wg_rqst_src_no.addAllListener(p);
		p.columnDtl_wg_rqst_src_no.setListListener(p);
		p.columnDtl_wg_rqst_no.addAllListener(p);
		p.columnDtl_wg_rqst_no.setListListener(p);
		p.columnDtl_po_schd_src_typ.addAllListener(p);
		p.columnDtl_po_schd_src_typ.setListListener(p);
		p.columnDtl_po_schd_src_typ_nm.addAllListener(p);
		p.columnDtl_po_schd_src_typ_nm.setListListener(p);
		p.columnDtl_po_schd_src_no.addAllListener(p);
		p.columnDtl_po_schd_src_no.setListListener(p);
		p.columnDtl_po_schd_no.addAllListener(p);
		p.columnDtl_po_schd_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_po_schd_upd_cntr.addAllListener(p);
		p.columnDtl_po_schd_upd_cntr.setListListener(p);
		p.columnDtl_bef_abort_flg.addAllListener(p);
		p.columnDtl_base_dt.addAllListener(p);
		p.columnDtl_base_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PoSchdListReg p) {
		p.Btn_open_MSBDP0040.addAllListener(p);
		p.Btn_open_MSBDP0040.setAPMethodName("doBtn_open_MSBDP0040");
		p.Btn_srch_schd_dt.addAllListener(p);
		p.Btn_srch_schd_dt.setAPMethodName("doBtn_srch_schd_dt");
		p.Btn_srch_upri.addAllListener(p);
		p.Btn_srch_upri.setAPMethodName("doBtn_srch_upri");
		p.Btn_srch_dlv.addAllListener(p);
		p.Btn_srch_dlv.setAPMethodName("doBtn_srch_dlv");
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
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_crct.addAllListener(p);
		p.Btn_upd_crct.setAPMethodName("doBtn_upd_crct");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PoSchdListReg p) {
	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD_CRCT, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_UPD_CRCT, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_UPD_CRCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SRCH_UPD_CRCT, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_UPD_CRCT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD_CRCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD__CRCT_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_SPLIT, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SPLIT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_SPLIT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_SPLIT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitINS_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitINS_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitINS_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitINS_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_iv_not_trgt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_not_interim_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_interim_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_purc_schd_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_schd_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_reg_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_tdlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_purc_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_chg_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);
		p.Cnd_rqst_crrct_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitINS_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitINS_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_rqst_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_rqst_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_rqst_crrct_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_rqst_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_po_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_def_purc_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.ENABLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_purc_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.columnDtl_bd_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_po_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, INS, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch_upri.putMode(p, INS, MCMode.ENABLE);
		p.Btn_srch_dlv.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rqst_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqst_crrct_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.columnItm_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_purc_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.ENABLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.columnDtl_bd_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_srch_upri.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_srch_dlv.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_crct.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, UPD_CRCT, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [UPD_CRCT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_CRCT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, UPD_CRCT, MCMode.ENABLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, UPD_CRCT, MCMode.REQUIRED);
		p.columnDtl_rqst_crrct_flg.putMode(p, UPD_CRCT, MCMode.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD_CRCT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_CRCT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, UPD_CRCT, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_CRCT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_CRCT, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, UPD_CRCT, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_CRCT, MCMode.DISABLE);

	}

	/**
	 * [UPD_CRCT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CRCT_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, SPLIT, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(SPLIT, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SPLIT, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SPLIT]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [SPLIT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SPLIT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SPLIT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, SPLIT, MCMode.ENABLE);

	}

	/**
	 * [SPLIT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SPLIT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, SPLIT, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, SPLIT, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SPLIT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SPLIT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SPLIT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SPLIT, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SPLIT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, SPLIT, MCMode.ENABLE);
		p.Btn_srch_schd_dt.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SPLIT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, SPLIT, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SPLIT, MCMode.DISABLE);

	}

	/**
	 * [SPLIT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSPLIT_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_rqst_crrct_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, DEL, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitREF_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitREF_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, REF, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, REF, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, REF, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[PoSts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_PoSts(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_TOP(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SpplGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ItmGrp(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_PoSchdListReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_po_schd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_po_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_iv_trgt_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_not_interim_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_rqst_dt_frto_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_purc_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_reg_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_reg_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_dlv_rqst_dt_frto_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_cst_itm_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_purc_usr_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_fr_usr_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_fr_dpt_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_po_schd_src_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_rqst_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_wg_rqst_src_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_chg_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_purc_sts_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_purc_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_po_schd_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_slo_d_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_rqst_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_cnt_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_rqst_crrct_flg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_IvTrgt(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Interim]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Interim(MSBDP_PoSchdListReg p){

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MSBDP_PoSchdListReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_I, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RPnl(MSBDP_PoSchdListReg p){
		p.RPnl_dwnld.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BulkSet(MSBDP_PoSchdListReg p){
		p.BulkSet_reg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_rqst_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_rqst_fr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.BulkSet_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.BulkSet_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBDP_PoSchdListReg p){
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_crrct_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_rqst_upd_stop_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_reg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_drct_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_outsrc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_loc_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_loc_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_rqst_fr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_show_dtl.putMode(p, FIX_I, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl.putMode(p, FIX_I, MCMode.ENABLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sppl_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sppl_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_def_purc_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_def_purc_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_old_trd_cur_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_proc_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_trd_cur_onr_prov_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_old_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_xrate_p_PPanel.columnXrate_xrate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_purc_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_purc_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_chg_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_split_src_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_org_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_add_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_outsrc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rqst_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_src_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wg_rqst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_src_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.Dtl_bp_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_po_schd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bef_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_PoSchdListReg p){
		p.Btn_open_MSBDP0040.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_srch_schd_dt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_srch_upri.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_srch_dlv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd_crct.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBDP_PoSchdListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_PoSchdListReg_MC.setTableConfigDtl((MSBDP_PoSchdListReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBDP_PoSchdListReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_rqst_crrct_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_crrct_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_crrct_flg);
		p.columnDtl_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abort_flg);
		p.columnDtl_rqst_upd_stop_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_upd_stop_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_upd_stop_flg);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_cd_META);
		p.columnDtl_trd_cd.addLinkBeans(p.columnDtl_trd_nm,p.columnDtl_trd_ptn_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_reg_dt.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.reg_dt_META);
		p.columnDtl_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_reg_dt);
		p.columnDtl_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.in_to_loc_cd_META);
		p.columnDtl_in_to_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_in_to_loc_cd.addLinkBeans(p.columnDtl_in_to_loc_nm,p.columnDtl_in_to_loc_wg_cd,p.columnDtl_in_to_loc_wg_nm,p.columnDtl_str_ln_tgt_flg,p.columnDtl_outsrc_sppl_cd,p.columnDtl_in_to_loc_cal_cd,p.columnDtl_site_cd,p.columnDtl_lg_grp_cd,p.columnDtl_loc_grp_cd,p.columnDtl_str_ln_cd,p.columnDtl_str_ln_cd_none_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cd);
		p.columnDtl_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.in_to_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_nm);
		p.columnDtl_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_cd);
		p.columnDtl_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.in_to_loc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_nm);
		p.columnDtl_drct_dlv_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.drct_dlv_typ_META);
		p.columnDtl_drct_dlv_typ.addLinkBeans(p.columnDtl_drct_dlv_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_drct_dlv_typ);
		p.columnDtl_drct_dlv_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.drct_dlv_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_drct_dlv_typ_nm);
		p.columnDtl_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.outsrc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_sppl_cd);
		p.columnDtl_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_tgt_flg);
		p.columnDtl_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.in_to_loc_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cal_cd);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_loc_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_grp_cd);
		p.columnDtl_bef_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bef_in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_in_to_loc_wg_cd);
		p.columnDtl_bef_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bef_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_lg_grp_cd);
		p.columnDtl_bef_loc_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bef_loc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_loc_grp_cd);
		p.DtlTable.addTable(p.Dtl_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sppl_nm, p.columnDtl_trd_cur_nm, p.columnDtl_trd_cur_amt_dec_place, p.columnDtl_trd_cur_upri_dec_place, p.columnDtl_trd_cur_cd, p.columnDtl_def_purc_usr_cd, p.columnDtl_def_purc_dpt_cd, p.columnDtl_sppl_iv_flg, p.columnDtl_prnt_lcl_cd, p.columnDtl_sppl_purc_upri_cng_flg, p.columnDtl_purc_upri_req_typ, p.columnDtl_sppl_cal_cd, p.columnDtl_purc_amt_rnd_typ, p.columnDtl_purc_tax_rnd_typ, p.columnDtl_sppl_cd, p.columnDtl_maker_nm, p.columnDtl_maker_cd, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sppl_nm, p.columnDtl_trd_cur_nm, p.columnDtl_trd_cur_amt_dec_place, p.columnDtl_trd_cur_upri_dec_place, p.columnDtl_trd_cur_cd, p.columnDtl_def_purc_usr_cd, p.columnDtl_def_purc_dpt_cd, p.columnDtl_sppl_iv_flg, p.columnDtl_prnt_lcl_cd, p.columnDtl_sppl_purc_upri_cng_flg, p.columnDtl_purc_upri_req_typ, p.columnDtl_sppl_cal_cd, p.columnDtl_purc_amt_rnd_typ, p.columnDtl_purc_tax_rnd_typ, p.columnDtl_sppl_cd, p.columnDtl_maker_nm, p.columnDtl_maker_cd, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sppl_nm, p.columnDtl_trd_cur_nm, p.columnDtl_trd_cur_amt_dec_place, p.columnDtl_trd_cur_upri_dec_place, p.columnDtl_trd_cur_cd, p.columnDtl_def_purc_usr_cd, p.columnDtl_def_purc_dpt_cd, p.columnDtl_sppl_iv_flg, p.columnDtl_prnt_lcl_cd, p.columnDtl_sppl_purc_upri_cng_flg, p.columnDtl_purc_upri_req_typ, p.columnDtl_sppl_cal_cd, p.columnDtl_purc_amt_rnd_typ, p.columnDtl_purc_tax_rnd_typ, p.columnDtl_sppl_cd, p.columnDtl_maker_nm, p.columnDtl_maker_cd, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_trd_unit_cd, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_dec_place, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_itm_purc_upri_cng_flg, p.columnDtl_tax_cd, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_sppl_nm, p.columnDtl_trd_cur_nm, p.columnDtl_trd_cur_amt_dec_place, p.columnDtl_trd_cur_upri_dec_place, p.columnDtl_trd_cur_cd, p.columnDtl_def_purc_usr_cd, p.columnDtl_def_purc_dpt_cd, p.columnDtl_sppl_iv_flg, p.columnDtl_prnt_lcl_cd, p.columnDtl_sppl_purc_upri_cng_flg, p.columnDtl_purc_upri_req_typ, p.columnDtl_sppl_cal_cd, p.columnDtl_purc_amt_rnd_typ, p.columnDtl_purc_tax_rnd_typ, p.columnDtl_sppl_cd, p.columnDtl_maker_nm, p.columnDtl_maker_cd, p.columnDtl_bom_ptn, p.columnDtl_mfg_loc_cd);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.DtlTable.addTable(p.Dtl_str_ln_p_PPanel.StrLnTable);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnDtl_str_ln_nm);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_itm_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.itm_purc_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_purc_upri_cng_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_inst_cont_qty_p_PPanel.ContQtyTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.DtlTable.addTable(p.Dtl_cont_unit_p_PPanel.ContFctrUnitTable);
		p.DtlTable.addTable(p.Dtl_std_cont_p_PPanel.StdContFctrTable);
		p.columnDtl_rqst_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_wg_cd_META);
		p.columnDtl_rqst_wg_cd.addLinkBeans(p.columnDtl_rqst_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_wg_cd);
		p.columnDtl_rqst_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_wg_nm);
		p.DtlTable.addTable(p.Dtl_rqst_fr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_rqst_fr_dpt_nm);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.columnDtl_dlv_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.dlv_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cal_cd);
		p.DtlTable.addTable(p.Dtl_tdlv_p_PPanel.DlvTable);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_cd_META);
		p.columnDtl_sppl_cd.addLinkBeans(p.columnDtl_sppl_nm,p.columnDtl_trd_cur_cd,p.columnDtl_def_purc_usr_cd,p.columnDtl_def_purc_dpt_cd,p.columnDtl_sppl_iv_flg,p.columnDtl_prnt_lcl_cd,p.columnDtl_sppl_purc_upri_cng_flg,p.columnDtl_purc_upri_req_typ,p.columnDtl_sppl_cal_cd,p.columnDtl_purc_amt_rnd_typ,p.columnDtl_purc_tax_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_sppl_iv_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_iv_flg);
		p.columnDtl_prnt_lcl_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.prnt_lcl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prnt_lcl_cd);
		p.columnDtl_sppl_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_purc_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_purc_upri_cng_flg);
		p.columnDtl_sppl_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cal_cd);
		p.columnDtl_purc_amt_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_amt_rnd_typ);
		p.columnDtl_purc_tax_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_rnd_typ);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_cd);
		p.columnDtl_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sppl_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_rqst_avl_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_avl_rqst_dt_META);
		p.columnDtl_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_avl_rqst_dt);
		p.DtlTable.addTable(p.Dtl_rqst_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnDtl_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_schd_dt_META);
		p.columnDtl_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_dt);
		p.columnDtl_po_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_dt_META);
		p.columnDtl_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_dt);
		p.columnDtl_mfg_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.mfg_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_cd);
		p.columnDtl_mfg_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.mfg_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_outsrc_itm_ord_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.outsrc_itm_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_itm_ord_no);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_purc_dpt_nm, p.columnDtl_purc_dpt_wg_cd, p.columnDtl_purc_dpt_wg_nm);
		p.columnDtl_def_purc_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.def_purc_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_purc_usr_cd);
		p.columnDtl_def_purc_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.def_purc_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_purc_dpt_cd);
		p.columnDtl_purc_dpt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_dpt_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_wg_cd);
		p.columnDtl_purc_dpt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_dpt_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_wg_nm);
		p.columnDtl_purc_upri_req_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_upri_req_typ_META);
		p.columnDtl_purc_upri_req_typ.addLinkBeans(p.columnDtl_purc_upri_req_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ);
		p.columnDtl_purc_upri_req_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ_nm);
		p.columnDtl_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_cur_cd_META);
		p.columnDtl_trd_cur_cd.addLinkBeans(p.columnDtl_trd_cur_nm,p.columnDtl_trd_cur_amt_dec_place,p.columnDtl_trd_cur_upri_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_cd);
		p.columnDtl_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_nm);
		p.columnDtl_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_amt_dec_place);
		p.columnDtl_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_upri_dec_place);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_typ, p.columnDtl_tax_rate, p.columnDtl_inc_tax_flg);
		p.columnDtl_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.repurc_obli_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_repurc_obli_flg);
		p.columnDtl_outsrc_upri_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.outsrc_upri_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_old_trd_cur_upri.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.old_trd_cur_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_upri);
		p.columnDtl_old_trd_cur_proc_upri.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.old_trd_cur_proc_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_proc_upri);
		p.columnDtl_old_trd_cur_onr_prov_upri.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.old_trd_cur_onr_prov_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_trd_cur_onr_prov_upri);
		p.columnDtl_old_interim_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.old_interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_old_interim_flg);
		p.columnDtl_xrate_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_cd);
		p.columnDtl_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_xrate_p_PPanel.XrateTable);
		p.columnDtl_base_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_cur_cd_META);
		p.columnDtl_base_cur_cd.addLinkBeans(p.columnDtl_base_cur_nm,p.columnDtl_base_cur_amt_dec_place,p.columnDtl_base_cur_upri_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_cd);
		p.columnDtl_base_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_nm);
		p.columnDtl_base_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_amt_dec_place);
		p.columnDtl_base_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_upri_dec_place);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ptax_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_ptax_xrate_p_PPanel.XrateTable);
		p.columnDtl_ptax_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ptax_cur_cd_META);
		p.columnDtl_ptax_cur_cd.addLinkBeans(p.columnDtl_ptax_cur_nm,p.columnDtl_ptax_cur_amt_dec_place,p.columnDtl_ptax_cur_upri_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_cd);
		p.columnDtl_ptax_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ptax_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_nm);
		p.columnDtl_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ptax_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_amt_dec_place);
		p.columnDtl_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ptax_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_upri_dec_place);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_purc_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_rsn_cd_META);
		p.columnDtl_purc_rsn_cd.addLinkBeans(p.columnDtl_purc_rsn_nm,p.columnDtl_xpns_purc_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_cd);
		p.columnDtl_purc_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_nm);
		p.columnDtl_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_flg);
		p.columnDtl_not_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.not_xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_xpns_purc_flg);
		p.DtlTable.addTable(p.Dtl_bditm_p_PPanel.BdItemTable);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl_bd_dpt_nm);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl_bd_itm_sub1, p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_mng_typ);
		p.columnDtl_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_mng_typ);
		p.columnDtl_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_no_typ);
		p.columnDtl_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_no_typ);
		p.columnDtl_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno1_mng_typ);
		p.columnDtl_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno2_mng_typ);
		p.columnDtl_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno3_mng_typ);
		p.columnDtl_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_po_cnt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_cnt_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_po_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_flg);
		p.columnDtl_purc_sts_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_sts_typ);
		p.columnDtl_purc_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.purc_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_sts_typ_nm);
		p.columnDtl_po_schd_chg_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_chg_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_chg_typ);
		p.columnDtl_po_schd_chg_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_chg_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_chg_typ_nm);
		p.columnDtl_split_src_schd_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.split_src_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_split_src_schd_no);
		p.columnDtl_org_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.org_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_org_flg);
		p.columnDtl_add_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.add_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_flg);
		p.columnDtl_outsrc_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.outsrc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_flg);
		p.columnDtl_rqst_can_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.rqst_can_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_can_flg);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_wg_rqst_src_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.wg_rqst_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_rqst_src_typ);
		p.columnDtl_wg_rqst_src_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.wg_rqst_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_rqst_src_typ_nm);
		p.columnDtl_wg_rqst_src_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.wg_rqst_src_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_rqst_src_no);
		p.columnDtl_wg_rqst_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.wg_rqst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_rqst_no);
		p.columnDtl_po_schd_src_typ.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_typ);
		p.columnDtl_po_schd_src_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_typ_nm);
		p.columnDtl_po_schd_src_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_src_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_src_no);
		p.columnDtl_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.DtlTable.addTable(p.Dtl_itm_grp_p_PPanel.ItmGrpTable);
		p.DtlTable.addTable(p.Dtl_bp_grp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_po_schd_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.po_schd_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_schd_upd_cntr);
		p.columnDtl_bef_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.bef_abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bef_abort_flg);
		p.columnDtl_base_dt.setMeta(mcframe.clientMSBD.MSBDP0030.DtlR.base_dt_META);
		p.columnDtl_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dt);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_in_to_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_loc_wg_cd.getListConfig().setPutter(getCnd_in_to_loc_wg_cd_ListPutter());
		Cnd_in_to_loc_cd.getListConfig().setPutter(getCnd_in_to_loc_cd_ListPutter());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_purc_usr_cd.getListConfig().setPutter(getCnd_purc_usr_cd_ListPutter());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_wg_cd.getListConfig().setPutter(getCnd_rqst_wg_cd_ListPutter());
		Cnd_rqst_fr_usr_cd.getListConfig().setPutter(getCnd_rqst_fr_usr_cd_ListPutter());
		Cnd_rqst_fr_dpt_cd.getListConfig().setPutter(getCnd_rqst_fr_dpt_cd_ListPutter());
		Cnd_po_schd_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_po_schd_src_typ.getListConfig().setPutter(getCnd_po_schd_src_typ_ListPutter());
		Cnd_wg_rqst_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_rqst_src_typ.getListConfig().setPutter(getCnd_wg_rqst_src_typ_ListPutter());
		Cnd_po_schd_chg_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_po_schd_chg_typ.getListConfig().setPutter(getCnd_po_schd_chg_typ_ListPutter());
		Cnd_purc_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_sts_typ.getListConfig().setPutter(getCnd_purc_sts_typ_ListPutter());
		BulkSet_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_rqst_wg_cd.getListConfig().setPutter(getBulkSet_rqst_wg_cd_ListPutter());
		BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnDtl_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cd.getListConfig().setPutter(getDtl_trd_cd_ListPutter());
		columnDtl_in_to_loc_cd.getListConfig().setPutter(getDtl_in_to_loc_cd_ListPutter());
		columnDtl_drct_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_drct_dlv_typ.getListConfig().setPutter(getDtl_drct_dlv_typ_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rqst_wg_cd.getListConfig().setPutter(getDtl_rqst_wg_cd_ListPutter());
		Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sppl_cd.getListConfig().setPutter(getDtl_sppl_cd_ListPutter());
		columnDtl_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_purc_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_upri_req_typ.getListConfig().setPutter(getDtl_purc_upri_req_typ_ListPutter());
		columnDtl_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cur_cd.getListConfig().setPutter(getDtl_trd_cur_cd_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_base_cur_cd.getListConfig().setPutter(getDtl_base_cur_cd_ListPutter());
		columnDtl_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ptax_cur_cd.getListConfig().setPutter(getDtl_ptax_cur_cd_ListPutter());
		columnDtl_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_rsn_cd.getListConfig().setPutter(getDtl_purc_rsn_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_UPD_CRCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPD_CRCTStatus() {
		status = SRCH_UPD_CRCT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SPLIT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SPLITStatus() {
		status = SRCH_SPLIT;
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
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CRCT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CRCTStatus() {
		status = UPD_CRCT;
		setAllStatus(status);
	}

	/**
	 * この画面を[SPLIT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSPLITStatus() {
		status = SPLIT;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (SRCH_UPD_CRCT.equals(status)) {
			setSRCH_UPD_CRCTStatus();
		}
		else if (SRCH_SPLIT.equals(status)) {
			setSRCH_SPLITStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_CRCT.equals(status)) {
			setUPD_CRCTStatus();
		}
		else if (SPLIT.equals(status)) {
			setSPLITStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
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
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_in_to_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_purc_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_fr_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_fr_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_fr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_fr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_po_schd_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_po_schd_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PoSchdSrcTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_rqst_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_rqst_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.WgRqstSrcTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_po_schd_chg_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_po_schd_chg_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PoSchdChgTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PurcStsTyp");
		return lp;
	}
	 
	/**
	 * [BulkSet_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Dtl_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Dtl_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_drct_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_drct_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DrctDlvTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlWithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub1WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub2WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSub3WithSpplMaker");
		return lp;
	}

	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_purc_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_in_to_loc_wg_cd) return getCnd_in_to_loc_wg_cd(row, info);
		if(combo == Cnd_in_to_loc_cd) return getCnd_in_to_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_purc_usr_cd) return getCnd_purc_usr_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_rqst_wg_cd) return getCnd_rqst_wg_cd(row, info);
		if(combo == Cnd_rqst_fr_usr_cd) return getCnd_rqst_fr_usr_cd(row, info);
		if(combo == Cnd_rqst_fr_dpt_cd) return getCnd_rqst_fr_dpt_cd(row, info);
		if(combo == Cnd_po_schd_src_typ) return getCnd_po_schd_src_typ(row, info);
		if(combo == Cnd_wg_rqst_src_typ) return getCnd_wg_rqst_src_typ(row, info);
		if(combo == Cnd_po_schd_chg_typ) return getCnd_po_schd_chg_typ(row, info);
		if(combo == Cnd_purc_sts_typ) return getCnd_purc_sts_typ(row, info);
		if(combo == BulkSet_rqst_wg_cd) return getBulkSet_rqst_wg_cd(row, info);
		if(combo == BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_usr_cd) return getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_usr_cd(row, info);
		if(combo == BulkSet_rqst_fr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_usr_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_trd_cd) return getDtl_trd_cd(row, info);
		if(combo == columnDtl_in_to_loc_cd) return getDtl_in_to_loc_cd(row, info);
		if(combo == columnDtl_drct_dlv_typ) return getDtl_drct_dlv_typ(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == Dtl_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_rqst_wg_cd) return getDtl_rqst_wg_cd(row, info);
		if(combo == Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_usr_cd) return getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_usr_cd(row, info);
		if(combo == Dtl_rqst_fr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_sppl_cd) return getDtl_sppl_cd(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_usr_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_purc_upri_req_typ) return getDtl_purc_upri_req_typ(row, info);
		if(combo == columnDtl_trd_cur_cd) return getDtl_trd_cur_cd(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl_base_cur_cd) return getDtl_base_cur_cd(row, info);
		if(combo == columnDtl_ptax_cur_cd) return getDtl_ptax_cur_cd(row, info);
		if(combo == columnDtl_purc_rsn_cd) return getDtl_purc_rsn_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd) return getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3) return getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
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
		else if (ap == Btn_open_MSBDP0040) doBtn_open_MSBDP0040(info);
		else if (ap == Btn_srch_schd_dt) doBtn_srch_schd_dt(info);
		else if (ap == Btn_srch_upri) doBtn_srch_upri(info);
		else if (ap == Btn_srch_dlv) doBtn_srch_dlv(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_crct) doBtn_upd_crct(info);
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
	 * [Btn]パネルの[open_MSBDP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_schd_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_schd_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_upri(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch_dlv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch_dlv(MCEventInfo info);

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
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_crct]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_crct(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_po_schd_flg) return doCnd_po_schd_flg_VC(info);
		if (vc == Cnd_po_flg) return doCnd_po_flg_VC(info);
		if (vc == Cnd_iv_trgt_flg) return doCnd_iv_trgt_flg_VC(info);
		if (vc == Cnd_iv_not_trgt_flg) return doCnd_iv_not_trgt_flg_VC(info);
		if (vc == Cnd_not_interim_flg) return doCnd_not_interim_flg_VC(info);
		if (vc == Cnd_interim_flg) return doCnd_interim_flg_VC(info);
		if (vc == Cnd_po_schd_dt_fr) return doCnd_po_schd_dt_fr_VC(info);
		if (vc == Cnd_po_schd_dt_to) return doCnd_po_schd_dt_to_VC(info);
		if (vc == Cnd_purc_schd_dt_fr) return doCnd_purc_schd_dt_fr_VC(info);
		if (vc == Cnd_purc_schd_dt_to) return doCnd_purc_schd_dt_to_VC(info);
		if (vc == Cnd_reg_dt_fr) return doCnd_reg_dt_fr_VC(info);
		if (vc == Cnd_reg_dt_to) return doCnd_reg_dt_to_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_in_to_loc_wg_cd) return doCnd_in_to_loc_wg_cd_VC(info);
		if (vc == Cnd_in_to_loc_wg_nm) return doCnd_in_to_loc_wg_nm_VC(info);
		if (vc == Cnd_in_to_loc_cd) return doCnd_in_to_loc_cd_VC(info);
		if (vc == Cnd_in_to_loc_nm) return doCnd_in_to_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_tdlv_cd) return doCnd_tdlv_cd_VC(info);
		if (vc == Cnd_tdlv_nm) return doCnd_tdlv_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_purc_usr_cd) return doCnd_purc_usr_cd_VC(info);
		if (vc == Cnd_purc_usr_nm) return doCnd_purc_usr_nm_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_rqst_wg_cd) return doCnd_rqst_wg_cd_VC(info);
		if (vc == Cnd_rqst_wg_nm) return doCnd_rqst_wg_nm_VC(info);
		if (vc == Cnd_rqst_fr_usr_cd) return doCnd_rqst_fr_usr_cd_VC(info);
		if (vc == Cnd_rqst_fr_usr_nm) return doCnd_rqst_fr_usr_nm_VC(info);
		if (vc == Cnd_rqst_fr_dpt_cd) return doCnd_rqst_fr_dpt_cd_VC(info);
		if (vc == Cnd_rqst_fr_dpt_nm) return doCnd_rqst_fr_dpt_nm_VC(info);
		if (vc == Cnd_po_schd_src_typ) return doCnd_po_schd_src_typ_VC(info);
		if (vc == Cnd_po_schd_src_typ_nm) return doCnd_po_schd_src_typ_nm_VC(info);
		if (vc == Cnd_po_schd_src_no) return doCnd_po_schd_src_no_VC(info);
		if (vc == Cnd_wg_rqst_src_typ) return doCnd_wg_rqst_src_typ_VC(info);
		if (vc == Cnd_wg_rqst_src_typ_nm) return doCnd_wg_rqst_src_typ_nm_VC(info);
		if (vc == Cnd_wg_rqst_src_no) return doCnd_wg_rqst_src_no_VC(info);
		if (vc == Cnd_po_schd_chg_typ) return doCnd_po_schd_chg_typ_VC(info);
		if (vc == Cnd_po_schd_chg_typ_nm) return doCnd_po_schd_chg_typ_nm_VC(info);
		if (vc == Cnd_purc_sts_typ) return doCnd_purc_sts_typ_VC(info);
		if (vc == Cnd_purc_sts_typ_nm) return doCnd_purc_sts_typ_nm_VC(info);
		if (vc == Cnd_abort_flg) return doCnd_abort_flg_VC(info);
		if (vc == Cnd_po_schd_no) return doCnd_po_schd_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_slo_d_no) return doCnd_slo_d_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_wg_rqst_no) return doCnd_wg_rqst_no_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_po_cnt_rmrks) return doCnd_po_cnt_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_rqst_crrct_flg) return doCnd_rqst_crrct_flg_VC(info);
		if (vc == BulkSet_reg_dt) return doBulkSet_reg_dt_VC(info);
		if (vc == BulkSet_rqst_wg_cd) return doBulkSet_rqst_wg_cd_VC(info);
		if (vc == BulkSet_rqst_wg_nm) return doBulkSet_rqst_wg_nm_VC(info);
		if (vc == BulkSet_purc_dpt_wg_cd) return doBulkSet_purc_dpt_wg_cd_VC(info);
		if (vc == BulkSet_purc_dpt_wg_nm) return doBulkSet_purc_dpt_wg_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_rqst_crrct_flg) return doDtl_rqst_crrct_flg_VC(info);
		if (vc == columnDtl_abort_flg) return doDtl_abort_flg_VC(info);
		if (vc == columnDtl_rqst_upd_stop_flg) return doDtl_rqst_upd_stop_flg_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_reg_dt) return doDtl_reg_dt_VC(info);
		if (vc == columnDtl_in_to_loc_cd) return doDtl_in_to_loc_cd_VC(info);
		if (vc == columnDtl_in_to_loc_nm) return doDtl_in_to_loc_nm_VC(info);
		if (vc == columnDtl_in_to_loc_wg_cd) return doDtl_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_in_to_loc_wg_nm) return doDtl_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl_drct_dlv_typ) return doDtl_drct_dlv_typ_VC(info);
		if (vc == columnDtl_drct_dlv_typ_nm) return doDtl_drct_dlv_typ_nm_VC(info);
		if (vc == columnDtl_outsrc_sppl_cd) return doDtl_outsrc_sppl_cd_VC(info);
		if (vc == columnDtl_str_ln_tgt_flg) return doDtl_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_in_to_loc_cal_cd) return doDtl_in_to_loc_cal_cd_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_loc_grp_cd) return doDtl_loc_grp_cd_VC(info);
		if (vc == columnDtl_bef_in_to_loc_wg_cd) return doDtl_bef_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_bef_lg_grp_cd) return doDtl_bef_lg_grp_cd_VC(info);
		if (vc == columnDtl_bef_loc_grp_cd) return doDtl_bef_loc_grp_cd_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_itm_purc_upri_cng_flg) return doDtl_itm_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_rqst_wg_cd) return doDtl_rqst_wg_cd_VC(info);
		if (vc == columnDtl_rqst_wg_nm) return doDtl_rqst_wg_nm_VC(info);
		if (vc == columnDtl_dlv_cal_cd) return doDtl_dlv_cal_cd_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_sppl_iv_flg) return doDtl_sppl_iv_flg_VC(info);
		if (vc == columnDtl_prnt_lcl_cd) return doDtl_prnt_lcl_cd_VC(info);
		if (vc == columnDtl_sppl_purc_upri_cng_flg) return doDtl_sppl_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl_sppl_cal_cd) return doDtl_sppl_cal_cd_VC(info);
		if (vc == columnDtl_purc_amt_rnd_typ) return doDtl_purc_amt_rnd_typ_VC(info);
		if (vc == columnDtl_purc_tax_rnd_typ) return doDtl_purc_tax_rnd_typ_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_sppl_itm_cd) return doDtl_sppl_itm_cd_VC(info);
		if (vc == columnDtl_sppl_itm_nm) return doDtl_sppl_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_rqst_avl_rqst_dt) return doDtl_rqst_avl_rqst_dt_VC(info);
		if (vc == columnDtl_purc_schd_dt) return doDtl_purc_schd_dt_VC(info);
		if (vc == columnDtl_po_schd_dt) return doDtl_po_schd_dt_VC(info);
		if (vc == columnDtl_mfg_loc_cd) return doDtl_mfg_loc_cd_VC(info);
		if (vc == columnDtl_mfg_loc_nm) return doDtl_mfg_loc_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_outsrc_itm_ord_no) return doDtl_outsrc_itm_ord_no_VC(info);
		if (vc == columnDtl_def_purc_usr_cd) return doDtl_def_purc_usr_cd_VC(info);
		if (vc == columnDtl_def_purc_dpt_cd) return doDtl_def_purc_dpt_cd_VC(info);
		if (vc == columnDtl_purc_dpt_wg_cd) return doDtl_purc_dpt_wg_cd_VC(info);
		if (vc == columnDtl_purc_dpt_wg_nm) return doDtl_purc_dpt_wg_nm_VC(info);
		if (vc == columnDtl_purc_upri_req_typ) return doDtl_purc_upri_req_typ_VC(info);
		if (vc == columnDtl_purc_upri_req_typ_nm) return doDtl_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_trd_cur_cd) return doDtl_trd_cur_cd_VC(info);
		if (vc == columnDtl_trd_cur_nm) return doDtl_trd_cur_nm_VC(info);
		if (vc == columnDtl_trd_cur_amt_dec_place) return doDtl_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_trd_cur_upri_dec_place) return doDtl_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_repurc_obli_flg) return doDtl_repurc_obli_flg_VC(info);
		if (vc == columnDtl_outsrc_upri_typ) return doDtl_outsrc_upri_typ_VC(info);
		if (vc == columnDtl_old_trd_cur_upri) return doDtl_old_trd_cur_upri_VC(info);
		if (vc == columnDtl_old_trd_cur_proc_upri) return doDtl_old_trd_cur_proc_upri_VC(info);
		if (vc == columnDtl_old_trd_cur_onr_prov_upri) return doDtl_old_trd_cur_onr_prov_upri_VC(info);
		if (vc == columnDtl_old_interim_flg) return doDtl_old_interim_flg_VC(info);
		if (vc == columnDtl_xrate_cd) return doDtl_xrate_cd_VC(info);
		if (vc == columnDtl_xrate_inpt_flg) return doDtl_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_base_cur_cd) return doDtl_base_cur_cd_VC(info);
		if (vc == columnDtl_base_cur_nm) return doDtl_base_cur_nm_VC(info);
		if (vc == columnDtl_base_cur_amt_dec_place) return doDtl_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_base_cur_upri_dec_place) return doDtl_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_ptax_xrate_inpt_flg) return doDtl_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_ptax_cur_cd) return doDtl_ptax_cur_cd_VC(info);
		if (vc == columnDtl_ptax_cur_nm) return doDtl_ptax_cur_nm_VC(info);
		if (vc == columnDtl_ptax_cur_amt_dec_place) return doDtl_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_upri_dec_place) return doDtl_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_purc_rsn_cd) return doDtl_purc_rsn_cd_VC(info);
		if (vc == columnDtl_purc_rsn_nm) return doDtl_purc_rsn_nm_VC(info);
		if (vc == columnDtl_xpns_purc_flg) return doDtl_xpns_purc_flg_VC(info);
		if (vc == columnDtl_not_xpns_purc_flg) return doDtl_not_xpns_purc_flg_VC(info);
		if (vc == columnDtl_bd_lot_mng_typ) return doDtl_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl_bd_sublot_mng_typ) return doDtl_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl_bd_lot_no_typ) return doDtl_bd_lot_no_typ_VC(info);
		if (vc == columnDtl_bd_sublot_no_typ) return doDtl_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl_bd_sno1_mng_typ) return doDtl_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno2_mng_typ) return doDtl_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno3_mng_typ) return doDtl_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno4_mng_typ) return doDtl_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_po_cnt_rmrks) return doDtl_po_cnt_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_po_flg) return doDtl_po_flg_VC(info);
		if (vc == columnDtl_purc_sts_typ) return doDtl_purc_sts_typ_VC(info);
		if (vc == columnDtl_purc_sts_typ_nm) return doDtl_purc_sts_typ_nm_VC(info);
		if (vc == columnDtl_po_schd_chg_typ) return doDtl_po_schd_chg_typ_VC(info);
		if (vc == columnDtl_po_schd_chg_typ_nm) return doDtl_po_schd_chg_typ_nm_VC(info);
		if (vc == columnDtl_split_src_schd_no) return doDtl_split_src_schd_no_VC(info);
		if (vc == columnDtl_org_flg) return doDtl_org_flg_VC(info);
		if (vc == columnDtl_add_flg) return doDtl_add_flg_VC(info);
		if (vc == columnDtl_outsrc_flg) return doDtl_outsrc_flg_VC(info);
		if (vc == columnDtl_rqst_can_flg) return doDtl_rqst_can_flg_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_wg_rqst_src_typ) return doDtl_wg_rqst_src_typ_VC(info);
		if (vc == columnDtl_wg_rqst_src_typ_nm) return doDtl_wg_rqst_src_typ_nm_VC(info);
		if (vc == columnDtl_wg_rqst_src_no) return doDtl_wg_rqst_src_no_VC(info);
		if (vc == columnDtl_wg_rqst_no) return doDtl_wg_rqst_no_VC(info);
		if (vc == columnDtl_po_schd_src_typ) return doDtl_po_schd_src_typ_VC(info);
		if (vc == columnDtl_po_schd_src_typ_nm) return doDtl_po_schd_src_typ_nm_VC(info);
		if (vc == columnDtl_po_schd_src_no) return doDtl_po_schd_src_no_VC(info);
		if (vc == columnDtl_po_schd_no) return doDtl_po_schd_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_po_schd_upd_cntr) return doDtl_po_schd_upd_cntr_VC(info);
		if (vc == columnDtl_bef_abort_flg) return doDtl_bef_abort_flg_VC(info);
		if (vc == columnDtl_base_dt) return doDtl_base_dt_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_reg_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_reg_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_in_to_loc_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_fr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_chg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_chg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_rqst_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_crrct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_crrct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_crrct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_crrct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_upd_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_upd_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_drct_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_drct_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_to_loc_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_avl_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_trd_cur_onr_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_old_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_chg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_chg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[split_src_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_split_src_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[org_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_org_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_rqst_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_rqst_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_rqst_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_rqst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_rqst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bef_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_dt_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_po_schd_flg) doCnd_po_schd_flg_NC(info);
		else if (nc == Cnd_po_flg) doCnd_po_flg_NC(info);
		else if (nc == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NC(info);
		else if (nc == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NC(info);
		else if (nc == Cnd_not_interim_flg) doCnd_not_interim_flg_NC(info);
		else if (nc == Cnd_interim_flg) doCnd_interim_flg_NC(info);
		else if (nc == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NC(info);
		else if (nc == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NC(info);
		else if (nc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NC(info);
		else if (nc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NC(info);
		else if (nc == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NC(info);
		else if (nc == Cnd_reg_dt_to) doCnd_reg_dt_to_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_in_to_loc_wg_cd) doCnd_in_to_loc_wg_cd_NC(info);
		else if (nc == Cnd_in_to_loc_wg_nm) doCnd_in_to_loc_wg_nm_NC(info);
		else if (nc == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NC(info);
		else if (nc == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_tdlv_cd) doCnd_tdlv_cd_NC(info);
		else if (nc == Cnd_tdlv_nm) doCnd_tdlv_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NC(info);
		else if (nc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NC(info);
		else if (nc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NC(info);
		else if (nc == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NC(info);
		else if (nc == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NC(info);
		else if (nc == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NC(info);
		else if (nc == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NC(info);
		else if (nc == Cnd_po_schd_src_typ) doCnd_po_schd_src_typ_NC(info);
		else if (nc == Cnd_po_schd_src_typ_nm) doCnd_po_schd_src_typ_nm_NC(info);
		else if (nc == Cnd_po_schd_src_no) doCnd_po_schd_src_no_NC(info);
		else if (nc == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NC(info);
		else if (nc == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NC(info);
		else if (nc == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NC(info);
		else if (nc == Cnd_po_schd_chg_typ) doCnd_po_schd_chg_typ_NC(info);
		else if (nc == Cnd_po_schd_chg_typ_nm) doCnd_po_schd_chg_typ_nm_NC(info);
		else if (nc == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NC(info);
		else if (nc == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NC(info);
		else if (nc == Cnd_abort_flg) doCnd_abort_flg_NC(info);
		else if (nc == Cnd_po_schd_no) doCnd_po_schd_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_slo_d_no) doCnd_slo_d_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_po_cnt_rmrks) doCnd_po_cnt_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_rqst_crrct_flg) doCnd_rqst_crrct_flg_NC(info);
		else if (nc == BulkSet_reg_dt) doBulkSet_reg_dt_NC(info);
		else if (nc == BulkSet_rqst_wg_cd) doBulkSet_rqst_wg_cd_NC(info);
		else if (nc == BulkSet_rqst_wg_nm) doBulkSet_rqst_wg_nm_NC(info);
		else if (nc == BulkSet_purc_dpt_wg_cd) doBulkSet_purc_dpt_wg_cd_NC(info);
		else if (nc == BulkSet_purc_dpt_wg_nm) doBulkSet_purc_dpt_wg_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_rqst_crrct_flg) doDtl_rqst_crrct_flg_NC(info);
		else if (nc == columnDtl_abort_flg) doDtl_abort_flg_NC(info);
		else if (nc == columnDtl_rqst_upd_stop_flg) doDtl_rqst_upd_stop_flg_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_reg_dt) doDtl_reg_dt_NC(info);
		else if (nc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NC(info);
		else if (nc == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NC(info);
		else if (nc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NC(info);
		else if (nc == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NC(info);
		else if (nc == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NC(info);
		else if (nc == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NC(info);
		else if (nc == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NC(info);
		else if (nc == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NC(info);
		else if (nc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NC(info);
		else if (nc == columnDtl_sppl_purc_upri_cng_flg) doDtl_sppl_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NC(info);
		else if (nc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NC(info);
		else if (nc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NC(info);
		else if (nc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NC(info);
		else if (nc == columnDtl_po_schd_dt) doDtl_po_schd_dt_NC(info);
		else if (nc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NC(info);
		else if (nc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NC(info);
		else if (nc == columnDtl_def_purc_usr_cd) doDtl_def_purc_usr_cd_NC(info);
		else if (nc == columnDtl_def_purc_dpt_cd) doDtl_def_purc_dpt_cd_NC(info);
		else if (nc == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NC(info);
		else if (nc == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NC(info);
		else if (nc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NC(info);
		else if (nc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NC(info);
		else if (nc == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NC(info);
		else if (nc == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NC(info);
		else if (nc == columnDtl_old_interim_flg) doDtl_old_interim_flg_NC(info);
		else if (nc == columnDtl_xrate_cd) doDtl_xrate_cd_NC(info);
		else if (nc == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_base_cur_cd) doDtl_base_cur_cd_NC(info);
		else if (nc == columnDtl_base_cur_nm) doDtl_base_cur_nm_NC(info);
		else if (nc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NC(info);
		else if (nc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NC(info);
		else if (nc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NC(info);
		else if (nc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NC(info);
		else if (nc == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_po_flg) doDtl_po_flg_NC(info);
		else if (nc == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NC(info);
		else if (nc == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NC(info);
		else if (nc == columnDtl_po_schd_chg_typ) doDtl_po_schd_chg_typ_NC(info);
		else if (nc == columnDtl_po_schd_chg_typ_nm) doDtl_po_schd_chg_typ_nm_NC(info);
		else if (nc == columnDtl_split_src_schd_no) doDtl_split_src_schd_no_NC(info);
		else if (nc == columnDtl_org_flg) doDtl_org_flg_NC(info);
		else if (nc == columnDtl_add_flg) doDtl_add_flg_NC(info);
		else if (nc == columnDtl_outsrc_flg) doDtl_outsrc_flg_NC(info);
		else if (nc == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_wg_rqst_src_typ) doDtl_wg_rqst_src_typ_NC(info);
		else if (nc == columnDtl_wg_rqst_src_typ_nm) doDtl_wg_rqst_src_typ_nm_NC(info);
		else if (nc == columnDtl_wg_rqst_src_no) doDtl_wg_rqst_src_no_NC(info);
		else if (nc == columnDtl_wg_rqst_no) doDtl_wg_rqst_no_NC(info);
		else if (nc == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NC(info);
		else if (nc == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NC(info);
		else if (nc == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NC(info);
		else if (nc == columnDtl_po_schd_no) doDtl_po_schd_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_po_schd_upd_cntr) doDtl_po_schd_upd_cntr_NC(info);
		else if (nc == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NC(info);
		else if (nc == columnDtl_base_dt) doDtl_base_dt_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[not_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_crrct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_crrct_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_crrct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_crrct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_upd_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_upd_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[split_src_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_split_src_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[org_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_org_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_po_schd_flg) doCnd_po_schd_flg_NE(info);
		else if (ne == Cnd_po_flg) doCnd_po_flg_NE(info);
		else if (ne == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NE(info);
		else if (ne == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NE(info);
		else if (ne == Cnd_not_interim_flg) doCnd_not_interim_flg_NE(info);
		else if (ne == Cnd_interim_flg) doCnd_interim_flg_NE(info);
		else if (ne == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NE(info);
		else if (ne == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NE(info);
		else if (ne == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NE(info);
		else if (ne == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NE(info);
		else if (ne == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NE(info);
		else if (ne == Cnd_reg_dt_to) doCnd_reg_dt_to_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_in_to_loc_wg_cd) doCnd_in_to_loc_wg_cd_NE(info);
		else if (ne == Cnd_in_to_loc_wg_nm) doCnd_in_to_loc_wg_nm_NE(info);
		else if (ne == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NE(info);
		else if (ne == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_tdlv_cd) doCnd_tdlv_cd_NE(info);
		else if (ne == Cnd_tdlv_nm) doCnd_tdlv_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NE(info);
		else if (ne == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NE(info);
		else if (ne == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NE(info);
		else if (ne == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NE(info);
		else if (ne == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NE(info);
		else if (ne == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NE(info);
		else if (ne == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NE(info);
		else if (ne == Cnd_po_schd_src_typ) doCnd_po_schd_src_typ_NE(info);
		else if (ne == Cnd_po_schd_src_typ_nm) doCnd_po_schd_src_typ_nm_NE(info);
		else if (ne == Cnd_po_schd_src_no) doCnd_po_schd_src_no_NE(info);
		else if (ne == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NE(info);
		else if (ne == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NE(info);
		else if (ne == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NE(info);
		else if (ne == Cnd_po_schd_chg_typ) doCnd_po_schd_chg_typ_NE(info);
		else if (ne == Cnd_po_schd_chg_typ_nm) doCnd_po_schd_chg_typ_nm_NE(info);
		else if (ne == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NE(info);
		else if (ne == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NE(info);
		else if (ne == Cnd_abort_flg) doCnd_abort_flg_NE(info);
		else if (ne == Cnd_po_schd_no) doCnd_po_schd_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_slo_d_no) doCnd_slo_d_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_po_cnt_rmrks) doCnd_po_cnt_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_rqst_crrct_flg) doCnd_rqst_crrct_flg_NE(info);
		else if (ne == BulkSet_reg_dt) doBulkSet_reg_dt_NE(info);
		else if (ne == BulkSet_rqst_wg_cd) doBulkSet_rqst_wg_cd_NE(info);
		else if (ne == BulkSet_rqst_wg_nm) doBulkSet_rqst_wg_nm_NE(info);
		else if (ne == BulkSet_purc_dpt_wg_cd) doBulkSet_purc_dpt_wg_cd_NE(info);
		else if (ne == BulkSet_purc_dpt_wg_nm) doBulkSet_purc_dpt_wg_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_rqst_crrct_flg) doDtl_rqst_crrct_flg_NE(info);
		else if (ne == columnDtl_abort_flg) doDtl_abort_flg_NE(info);
		else if (ne == columnDtl_rqst_upd_stop_flg) doDtl_rqst_upd_stop_flg_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_reg_dt) doDtl_reg_dt_NE(info);
		else if (ne == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NE(info);
		else if (ne == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NE(info);
		else if (ne == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NE(info);
		else if (ne == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NE(info);
		else if (ne == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NE(info);
		else if (ne == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NE(info);
		else if (ne == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NE(info);
		else if (ne == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NE(info);
		else if (ne == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NE(info);
		else if (ne == columnDtl_sppl_purc_upri_cng_flg) doDtl_sppl_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NE(info);
		else if (ne == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NE(info);
		else if (ne == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NE(info);
		else if (ne == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NE(info);
		else if (ne == columnDtl_po_schd_dt) doDtl_po_schd_dt_NE(info);
		else if (ne == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NE(info);
		else if (ne == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NE(info);
		else if (ne == columnDtl_def_purc_usr_cd) doDtl_def_purc_usr_cd_NE(info);
		else if (ne == columnDtl_def_purc_dpt_cd) doDtl_def_purc_dpt_cd_NE(info);
		else if (ne == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NE(info);
		else if (ne == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NE(info);
		else if (ne == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NE(info);
		else if (ne == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NE(info);
		else if (ne == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NE(info);
		else if (ne == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NE(info);
		else if (ne == columnDtl_old_interim_flg) doDtl_old_interim_flg_NE(info);
		else if (ne == columnDtl_xrate_cd) doDtl_xrate_cd_NE(info);
		else if (ne == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_base_cur_cd) doDtl_base_cur_cd_NE(info);
		else if (ne == columnDtl_base_cur_nm) doDtl_base_cur_nm_NE(info);
		else if (ne == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NE(info);
		else if (ne == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NE(info);
		else if (ne == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NE(info);
		else if (ne == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NE(info);
		else if (ne == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_po_flg) doDtl_po_flg_NE(info);
		else if (ne == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NE(info);
		else if (ne == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NE(info);
		else if (ne == columnDtl_po_schd_chg_typ) doDtl_po_schd_chg_typ_NE(info);
		else if (ne == columnDtl_po_schd_chg_typ_nm) doDtl_po_schd_chg_typ_nm_NE(info);
		else if (ne == columnDtl_split_src_schd_no) doDtl_split_src_schd_no_NE(info);
		else if (ne == columnDtl_org_flg) doDtl_org_flg_NE(info);
		else if (ne == columnDtl_add_flg) doDtl_add_flg_NE(info);
		else if (ne == columnDtl_outsrc_flg) doDtl_outsrc_flg_NE(info);
		else if (ne == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_wg_rqst_src_typ) doDtl_wg_rqst_src_typ_NE(info);
		else if (ne == columnDtl_wg_rqst_src_typ_nm) doDtl_wg_rqst_src_typ_nm_NE(info);
		else if (ne == columnDtl_wg_rqst_src_no) doDtl_wg_rqst_src_no_NE(info);
		else if (ne == columnDtl_wg_rqst_no) doDtl_wg_rqst_no_NE(info);
		else if (ne == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NE(info);
		else if (ne == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NE(info);
		else if (ne == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NE(info);
		else if (ne == columnDtl_po_schd_no) doDtl_po_schd_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_po_schd_upd_cntr) doDtl_po_schd_upd_cntr_NE(info);
		else if (ne == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NE(info);
		else if (ne == columnDtl_base_dt) doDtl_base_dt_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[not_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_crrct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_crrct_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_crrct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_crrct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_upd_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_upd_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[split_src_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_split_src_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[org_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_org_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_po_schd_flg) doCnd_po_schd_flg_NX(info);
		else if (nx == Cnd_po_flg) doCnd_po_flg_NX(info);
		else if (nx == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NX(info);
		else if (nx == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NX(info);
		else if (nx == Cnd_not_interim_flg) doCnd_not_interim_flg_NX(info);
		else if (nx == Cnd_interim_flg) doCnd_interim_flg_NX(info);
		else if (nx == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NX(info);
		else if (nx == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NX(info);
		else if (nx == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_NX(info);
		else if (nx == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_NX(info);
		else if (nx == Cnd_reg_dt_fr) doCnd_reg_dt_fr_NX(info);
		else if (nx == Cnd_reg_dt_to) doCnd_reg_dt_to_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_in_to_loc_wg_cd) doCnd_in_to_loc_wg_cd_NX(info);
		else if (nx == Cnd_in_to_loc_wg_nm) doCnd_in_to_loc_wg_nm_NX(info);
		else if (nx == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_NX(info);
		else if (nx == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_tdlv_cd) doCnd_tdlv_cd_NX(info);
		else if (nx == Cnd_tdlv_nm) doCnd_tdlv_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NX(info);
		else if (nx == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NX(info);
		else if (nx == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NX(info);
		else if (nx == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_NX(info);
		else if (nx == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_NX(info);
		else if (nx == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_NX(info);
		else if (nx == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_NX(info);
		else if (nx == Cnd_po_schd_src_typ) doCnd_po_schd_src_typ_NX(info);
		else if (nx == Cnd_po_schd_src_typ_nm) doCnd_po_schd_src_typ_nm_NX(info);
		else if (nx == Cnd_po_schd_src_no) doCnd_po_schd_src_no_NX(info);
		else if (nx == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_NX(info);
		else if (nx == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_NX(info);
		else if (nx == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_NX(info);
		else if (nx == Cnd_po_schd_chg_typ) doCnd_po_schd_chg_typ_NX(info);
		else if (nx == Cnd_po_schd_chg_typ_nm) doCnd_po_schd_chg_typ_nm_NX(info);
		else if (nx == Cnd_purc_sts_typ) doCnd_purc_sts_typ_NX(info);
		else if (nx == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_NX(info);
		else if (nx == Cnd_abort_flg) doCnd_abort_flg_NX(info);
		else if (nx == Cnd_po_schd_no) doCnd_po_schd_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_slo_d_no) doCnd_slo_d_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_wg_rqst_no) doCnd_wg_rqst_no_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_po_cnt_rmrks) doCnd_po_cnt_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_rqst_crrct_flg) doCnd_rqst_crrct_flg_NX(info);
		else if (nx == BulkSet_reg_dt) doBulkSet_reg_dt_NX(info);
		else if (nx == BulkSet_rqst_wg_cd) doBulkSet_rqst_wg_cd_NX(info);
		else if (nx == BulkSet_rqst_wg_nm) doBulkSet_rqst_wg_nm_NX(info);
		else if (nx == BulkSet_purc_dpt_wg_cd) doBulkSet_purc_dpt_wg_cd_NX(info);
		else if (nx == BulkSet_purc_dpt_wg_nm) doBulkSet_purc_dpt_wg_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_rqst_crrct_flg) doDtl_rqst_crrct_flg_NX(info);
		else if (nx == columnDtl_abort_flg) doDtl_abort_flg_NX(info);
		else if (nx == columnDtl_rqst_upd_stop_flg) doDtl_rqst_upd_stop_flg_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_reg_dt) doDtl_reg_dt_NX(info);
		else if (nx == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_NX(info);
		else if (nx == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_NX(info);
		else if (nx == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NX(info);
		else if (nx == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_NX(info);
		else if (nx == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_NX(info);
		else if (nx == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_itm_purc_upri_cng_flg) doDtl_itm_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NX(info);
		else if (nx == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NX(info);
		else if (nx == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NX(info);
		else if (nx == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_NX(info);
		else if (nx == columnDtl_sppl_purc_upri_cng_flg) doDtl_sppl_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NX(info);
		else if (nx == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NX(info);
		else if (nx == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NX(info);
		else if (nx == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NX(info);
		else if (nx == columnDtl_po_schd_dt) doDtl_po_schd_dt_NX(info);
		else if (nx == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NX(info);
		else if (nx == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NX(info);
		else if (nx == columnDtl_def_purc_usr_cd) doDtl_def_purc_usr_cd_NX(info);
		else if (nx == columnDtl_def_purc_dpt_cd) doDtl_def_purc_dpt_cd_NX(info);
		else if (nx == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NX(info);
		else if (nx == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NX(info);
		else if (nx == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NX(info);
		else if (nx == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_NX(info);
		else if (nx == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_NX(info);
		else if (nx == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_NX(info);
		else if (nx == columnDtl_old_interim_flg) doDtl_old_interim_flg_NX(info);
		else if (nx == columnDtl_xrate_cd) doDtl_xrate_cd_NX(info);
		else if (nx == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_base_cur_cd) doDtl_base_cur_cd_NX(info);
		else if (nx == columnDtl_base_cur_nm) doDtl_base_cur_nm_NX(info);
		else if (nx == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NX(info);
		else if (nx == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NX(info);
		else if (nx == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_NX(info);
		else if (nx == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NX(info);
		else if (nx == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_po_flg) doDtl_po_flg_NX(info);
		else if (nx == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_NX(info);
		else if (nx == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_NX(info);
		else if (nx == columnDtl_po_schd_chg_typ) doDtl_po_schd_chg_typ_NX(info);
		else if (nx == columnDtl_po_schd_chg_typ_nm) doDtl_po_schd_chg_typ_nm_NX(info);
		else if (nx == columnDtl_split_src_schd_no) doDtl_split_src_schd_no_NX(info);
		else if (nx == columnDtl_org_flg) doDtl_org_flg_NX(info);
		else if (nx == columnDtl_add_flg) doDtl_add_flg_NX(info);
		else if (nx == columnDtl_outsrc_flg) doDtl_outsrc_flg_NX(info);
		else if (nx == columnDtl_rqst_can_flg) doDtl_rqst_can_flg_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_wg_rqst_src_typ) doDtl_wg_rqst_src_typ_NX(info);
		else if (nx == columnDtl_wg_rqst_src_typ_nm) doDtl_wg_rqst_src_typ_nm_NX(info);
		else if (nx == columnDtl_wg_rqst_src_no) doDtl_wg_rqst_src_no_NX(info);
		else if (nx == columnDtl_wg_rqst_no) doDtl_wg_rqst_no_NX(info);
		else if (nx == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_NX(info);
		else if (nx == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_NX(info);
		else if (nx == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_NX(info);
		else if (nx == columnDtl_po_schd_no) doDtl_po_schd_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_po_schd_upd_cntr) doDtl_po_schd_upd_cntr_NX(info);
		else if (nx == columnDtl_bef_abort_flg) doDtl_bef_abort_flg_NX(info);
		else if (nx == columnDtl_base_dt) doDtl_base_dt_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[not_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_crrct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_crrct_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_crrct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_crrct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_upd_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_upd_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[split_src_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_split_src_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[org_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_org_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_LC(info);
		else if (lc == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_LC(info);
		else if (lc == Cnd_purc_schd_dt_fr) doCnd_purc_schd_dt_fr_LC(info);
		else if (lc == Cnd_purc_schd_dt_to) doCnd_purc_schd_dt_to_LC(info);
		else if (lc == Cnd_reg_dt_fr) doCnd_reg_dt_fr_LC(info);
		else if (lc == Cnd_reg_dt_to) doCnd_reg_dt_to_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_in_to_loc_wg_cd) doCnd_in_to_loc_wg_cd_LC(info);
		else if (lc == Cnd_in_to_loc_wg_nm) doCnd_in_to_loc_wg_nm_LC(info);
		else if (lc == Cnd_in_to_loc_cd) doCnd_in_to_loc_cd_LC(info);
		else if (lc == Cnd_in_to_loc_nm) doCnd_in_to_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_tdlv_cd) doCnd_tdlv_cd_LC(info);
		else if (lc == Cnd_tdlv_nm) doCnd_tdlv_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_LC(info);
		else if (lc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_LC(info);
		else if (lc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_LC(info);
		else if (lc == Cnd_rqst_fr_usr_cd) doCnd_rqst_fr_usr_cd_LC(info);
		else if (lc == Cnd_rqst_fr_usr_nm) doCnd_rqst_fr_usr_nm_LC(info);
		else if (lc == Cnd_rqst_fr_dpt_cd) doCnd_rqst_fr_dpt_cd_LC(info);
		else if (lc == Cnd_rqst_fr_dpt_nm) doCnd_rqst_fr_dpt_nm_LC(info);
		else if (lc == Cnd_po_schd_src_typ) doCnd_po_schd_src_typ_LC(info);
		else if (lc == Cnd_po_schd_src_typ_nm) doCnd_po_schd_src_typ_nm_LC(info);
		else if (lc == Cnd_po_schd_src_no) doCnd_po_schd_src_no_LC(info);
		else if (lc == Cnd_wg_rqst_src_typ) doCnd_wg_rqst_src_typ_LC(info);
		else if (lc == Cnd_wg_rqst_src_typ_nm) doCnd_wg_rqst_src_typ_nm_LC(info);
		else if (lc == Cnd_wg_rqst_src_no) doCnd_wg_rqst_src_no_LC(info);
		else if (lc == Cnd_po_schd_chg_typ) doCnd_po_schd_chg_typ_LC(info);
		else if (lc == Cnd_po_schd_chg_typ_nm) doCnd_po_schd_chg_typ_nm_LC(info);
		else if (lc == Cnd_purc_sts_typ) doCnd_purc_sts_typ_LC(info);
		else if (lc == Cnd_purc_sts_typ_nm) doCnd_purc_sts_typ_nm_LC(info);
		else if (lc == Cnd_po_schd_no) doCnd_po_schd_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_slo_d_no) doCnd_slo_d_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_wg_rqst_no) doCnd_wg_rqst_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_po_cnt_rmrks) doCnd_po_cnt_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == BulkSet_reg_dt) doBulkSet_reg_dt_LC(info);
		else if (lc == BulkSet_rqst_wg_cd) doBulkSet_rqst_wg_cd_LC(info);
		else if (lc == BulkSet_rqst_wg_nm) doBulkSet_rqst_wg_nm_LC(info);
		else if (lc == BulkSet_purc_dpt_wg_cd) doBulkSet_purc_dpt_wg_cd_LC(info);
		else if (lc == BulkSet_purc_dpt_wg_nm) doBulkSet_purc_dpt_wg_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_reg_dt) doDtl_reg_dt_LC(info);
		else if (lc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl_drct_dlv_typ) doDtl_drct_dlv_typ_LC(info);
		else if (lc == columnDtl_drct_dlv_typ_nm) doDtl_drct_dlv_typ_nm_LC(info);
		else if (lc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_loc_grp_cd) doDtl_loc_grp_cd_LC(info);
		else if (lc == columnDtl_bef_in_to_loc_wg_cd) doDtl_bef_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_bef_lg_grp_cd) doDtl_bef_lg_grp_cd_LC(info);
		else if (lc == columnDtl_bef_loc_grp_cd) doDtl_bef_loc_grp_cd_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_LC(info);
		else if (lc == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_LC(info);
		else if (lc == columnDtl_dlv_cal_cd) doDtl_dlv_cal_cd_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_prnt_lcl_cd) doDtl_prnt_lcl_cd_LC(info);
		else if (lc == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_LC(info);
		else if (lc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_LC(info);
		else if (lc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_LC(info);
		else if (lc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_LC(info);
		else if (lc == columnDtl_po_schd_dt) doDtl_po_schd_dt_LC(info);
		else if (lc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_LC(info);
		else if (lc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_LC(info);
		else if (lc == columnDtl_def_purc_usr_cd) doDtl_def_purc_usr_cd_LC(info);
		else if (lc == columnDtl_def_purc_dpt_cd) doDtl_def_purc_dpt_cd_LC(info);
		else if (lc == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_LC(info);
		else if (lc == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_LC(info);
		else if (lc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_LC(info);
		else if (lc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl_old_trd_cur_upri) doDtl_old_trd_cur_upri_LC(info);
		else if (lc == columnDtl_old_trd_cur_proc_upri) doDtl_old_trd_cur_proc_upri_LC(info);
		else if (lc == columnDtl_old_trd_cur_onr_prov_upri) doDtl_old_trd_cur_onr_prov_upri_LC(info);
		else if (lc == columnDtl_xrate_cd) doDtl_xrate_cd_LC(info);
		else if (lc == columnDtl_base_cur_cd) doDtl_base_cur_cd_LC(info);
		else if (lc == columnDtl_base_cur_nm) doDtl_base_cur_nm_LC(info);
		else if (lc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_purc_rsn_cd) doDtl_purc_rsn_cd_LC(info);
		else if (lc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_po_cnt_rmrks) doDtl_po_cnt_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_purc_sts_typ) doDtl_purc_sts_typ_LC(info);
		else if (lc == columnDtl_purc_sts_typ_nm) doDtl_purc_sts_typ_nm_LC(info);
		else if (lc == columnDtl_po_schd_chg_typ) doDtl_po_schd_chg_typ_LC(info);
		else if (lc == columnDtl_po_schd_chg_typ_nm) doDtl_po_schd_chg_typ_nm_LC(info);
		else if (lc == columnDtl_split_src_schd_no) doDtl_split_src_schd_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_wg_rqst_src_typ) doDtl_wg_rqst_src_typ_LC(info);
		else if (lc == columnDtl_wg_rqst_src_typ_nm) doDtl_wg_rqst_src_typ_nm_LC(info);
		else if (lc == columnDtl_wg_rqst_src_no) doDtl_wg_rqst_src_no_LC(info);
		else if (lc == columnDtl_wg_rqst_no) doDtl_wg_rqst_no_LC(info);
		else if (lc == columnDtl_po_schd_src_typ) doDtl_po_schd_src_typ_LC(info);
		else if (lc == columnDtl_po_schd_src_typ_nm) doDtl_po_schd_src_typ_nm_LC(info);
		else if (lc == columnDtl_po_schd_src_no) doDtl_po_schd_src_no_LC(info);
		else if (lc == columnDtl_po_schd_no) doDtl_po_schd_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_po_schd_upd_cntr) doDtl_po_schd_upd_cntr_LC(info);
		else if (lc == columnDtl_base_dt) doDtl_base_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[reg_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[reg_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_reg_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_in_to_loc_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_fr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_fr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_chg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_chg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_cnt_rmrks_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[drct_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_drct_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bef_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bef_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[old_trd_cur_onr_prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_old_trd_cur_onr_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_chg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_chg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[split_src_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_split_src_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_rqst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_rqst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_in_to_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_in_to_loc_cd]の作成メソッド
	 */
	public MCList getCnd_in_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tdlv_cd]の作成メソッド
	 */
	public MCList getCnd_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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

	/**
	 * コンボ／リストのリスト[Cnd_purc_usr_cd]の作成メソッド
	 */
	public MCList getCnd_purc_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_fr_usr_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_fr_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_fr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_fr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_po_schd_src_typ]の作成メソッド
	 */
	public MCList getCnd_po_schd_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPoSchdSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_rqst_src_typ]の作成メソッド
	 */
	public MCList getCnd_wg_rqst_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getWgRqstSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_po_schd_chg_typ]の作成メソッド
	 */
	public MCList getCnd_po_schd_chg_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPoSchdChgTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_sts_typ]の作成メソッド
	 */
	public MCList getCnd_purc_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_rqst_wg_cd]の作成メソッド
	 */
	public MCList getBulkSet_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_rqst_fr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_to_loc_cd]の作成メソッド
	 */
	public MCList getDtl_in_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_drct_dlv_typ]の作成メソッド
	 */
	public MCList getDtl_drct_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDrctDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlWithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub1WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub2WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSub3WithSpplMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rqst_wg_cd]の作成メソッド
	 */
	public MCList getDtl_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_rqst_fr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sppl_cd]の作成メソッド
	 */
	public MCList getDtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_upri_req_typ]の作成メソッド
	 */
	public MCList getDtl_purc_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cur_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_base_cur_cd]の作成メソッド
	 */
	public MCList getDtl_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ptax_cur_cd]の作成メソッド
	 */
	public MCList getDtl_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_bditm_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0030.Srch01")) {
			return new MS_MSBDL0030_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0030.Sprt01")) {
			return new MS_MSBDL0030_Sprt01Bridge();
		}
		if (id.equals("MS.MSBDL0030.Sprt02")) {
			return new MS_MSBDL0030_Sprt02Bridge();
		}
		if (id.equals("MS.MSBDL0030.Sprt03")) {
			return new MS_MSBDL0030_Sprt03Bridge();
		}
		if (id.equals("MS.MSBDL0030.Imp01")) {
			return new MS_MSBDL0030_Imp01Bridge();
		}
		if (id.equals("MS.MSBDL0030.Ins01")) {
			return new MS_MSBDL0030_Ins01Bridge();
		}
		if (id.equals("MS.MSBDL0030.Upd01")) {
			return new MS_MSBDL0030_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0030.Upd02")) {
			return new MS_MSBDL0030_Upd02Bridge();
		}
		if (id.equals("MS.MSBDL0030.Del01")) {
			return new MS_MSBDL0030_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Srch01Bridge() {
			p_MS_MSBDL0030_Srch01 = new MCParam(PDef.MS_MSBDL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0030.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Sprt01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Sprt01Bridge() {
			p_MS_MSBDL0030_Sprt01 = new MCParam(PDef.MS_MSBDL0030_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Sprt02;

		/** コンストラクタ */
		protected MS_MSBDL0030_Sprt02Bridge() {
			p_MS_MSBDL0030_Sprt02 = new MCParam(PDef.MS_MSBDL0030_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Sprt02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Sprt02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Sprt03;

		/** コンストラクタ */
		protected MS_MSBDL0030_Sprt03Bridge() {
			p_MS_MSBDL0030_Sprt03 = new MCParam(PDef.MS_MSBDL0030_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Sprt03.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Sprt03.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Sprt03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Sprt03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Imp01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Imp01Bridge() {
			p_MS_MSBDL0030_Imp01 = new MCParam(PDef.MS_MSBDL0030_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Imp01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Imp01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Imp01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Ins01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Ins01Bridge() {
			p_MS_MSBDL0030_Ins01 = new MCParam(PDef.MS_MSBDL0030_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Ins01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Upd01Bridge() {
			p_MS_MSBDL0030_Upd01 = new MCParam(PDef.MS_MSBDL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Upd02;

		/** コンストラクタ */
		protected MS_MSBDL0030_Upd02Bridge() {
			p_MS_MSBDL0030_Upd02 = new MCParam(PDef.MS_MSBDL0030_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Upd02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Upd02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Upd02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0030_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0030_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0030_Del01Bridge() {
			p_MS_MSBDL0030_Del01 = new MCParam(PDef.MS_MSBDL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));

			p_MS_MSBDL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0030_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0030.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0030_Del01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0030_Del01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0030.DtlR>)p_MS_MSBDL0030_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}