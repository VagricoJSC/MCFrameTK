package mcframe.clientMSBD.MSBDP0190;

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
import mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Srch01Caller;
import mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Upd01Caller;
import mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt01Caller;
import mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt02Caller;
import mcframe.clientMSBD.MSBDP0190.MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt03Caller;

/**
 * 画面"MSBDP_PurcDtlModReg"パネルクラスです。<p>
 *
 * 仕入の金額や税、為替レートなどを一括で訂正します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcDtlModReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0190";

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
	// [SelectOpe]ブロック関連のField定義
	public MCPanel SelectOpePanel = null;
	public MCTitledBorder SelectOpeTitledBorder = null;
	// [SelectOpe]ブロックの項目のField定義
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
	// [AspplGrp]ブロック関連のField定義
	public MCPanel AspplGrpPanel = null;
	// [AspplGrp]ブロックの項目のField定義
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Modify,0;REF,View,1; UPD,訂正する,0;REF,参照する,1;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Perti,Breakdown of details;Dtl,Details;Hdr,Header Perti,詳細;Dtl,明細;Hdr,ヘッダ.<p>
	 *
	 */
	public MCButtonGroup Cnd_disp_unit_Group = null;
	public MCRadioButton Cnd_disp_unit_Perti = null;
	public MCRadioButton Cnd_disp_unit_Dtl = null;
	public MCRadioButton Cnd_disp_unit_Hdr = null;
	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_flg = null;
	/**
	 * Return 返品.<p>
	 *
	 */
	public MCCheckBox Cnd_ret_flg = null;
	/**
	 * Discount 値引.<p>
	 *
	 */
	public MCCheckBox Cnd_dscnt_flg = null;
	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_trgt_flg = null;
	/**
	 * Not for invoice transaction インボイス取引対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_iv_not_trgt_flg = null;
	/**
	 * Unit price 本単価.<p>
	 *
	 */
	public MCCheckBox Cnd_upri_flg = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCCheckBox Cnd_interim_flg = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCCheckBox Cnd_subcon_flg = null;
	/**
	 * Not for subcontract 下請対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_subcon_flg = null;
	public MCLabel Cnd_purc_dt_from_Label = null;
	/**
	 * Purchase date FROM 仕入日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_from = null;
	public MCLabel Cnd_purc_dt_to_Label = null;
	/**
	 * Purchase date TO 仕入日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_dt_to = null;
	public MCLabel Cnd_ac_ym_from_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_from = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
	public MCLabel Cnd_ac_dt_from_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_from = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
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
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
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
	public MCTextComboBox Cnd_str_ln_cd = null;
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
	public MCLabel Cnd_asppl_cd_Label = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCTextField Cnd_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Cnd_asppl_nm = null;
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
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
	public MCLabel Cnd_sppl_itm_cd_Label = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_itm_nm = null;
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
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	public MCLabel Cnd_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_lot_no = null;
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
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_rcpt_iv_d_no_Label = null;
	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_d_no = null;
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
	public MCLabel Cnd_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_no = null;
	public MCLabel Cnd_purc_act_d_no_Label = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_d_no = null;
	public MCLabel Cnd_purc_src_typ_Label = null;
	/**
	 * Purchase source type 仕入作成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_src_typ = null;
	/**
	 * Purchase create source type name 仕入作成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_purc_src_typ_nm = null;
	public MCLabel Cnd_purc_src_no_Label = null;
	/**
	 * Purchase source No. 仕入作成元ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_src_no = null;
	public MCLabel Cnd_arr_act_no_Label = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_arr_act_no = null;
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
	public MCLabel Cnd_edi_bp_dlv_slip_no_Label = null;
	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_edi_bp_dlv_slip_no = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	/**
	 * Foreign currency only 外貨のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_foreign_flg = null;
	public MCLabel Cnd_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Cnd_tax_nm = null;
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
	public MCLabel Cnd_dtl_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_trd_d_rmrks = null;
	public MCLabel Cnd_dtl_intr_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_dtl_intr_rmrks = null;
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
	public MCLabel Cnd_dtl_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char1 = null;
	public MCLabel Cnd_dtl_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char2 = null;
	public MCLabel Cnd_dtl_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char3 = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_dis_can_disp_flg = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
	/**
	 * Include temporary AP 暫定買掛含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_temp_ap_flg = null;
	/**
	 * Reverse the sign of the return/discount amount 返品・値引金額の符号を反転する.<p>
	 *
	 */
	public MCCheckBox Cnd_sign_rev_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_spplgrp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_spplgrp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_spplgrp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_spplgrp_cd1]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_spplgrp_nm1]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_spplgrp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_spplgrp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_spplgrp_cd2]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_spplgrp_nm2]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_spplgrp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_spplgrp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_spplgrp_cd3]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_spplgrp_nm3]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_spplgrp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_spplgrp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_spplgrp_cd4]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_spplgrp_nm4]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_spplgrp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_spplgrp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_spplgrp_cd5]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_spplgrp_nm5]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_spplgrp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_spplgrp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_spplgrp_cd6]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_spplgrp_nm6]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_spplgrp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_spplgrp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_spplgrp_cd7]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_spplgrp_nm7]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_spplgrp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_spplgrp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_spplgrp_cd8]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_spplgrp_nm8]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_spplgrp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_spplgrp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_spplgrp_cd9]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_spplgrp_nm9]としてエイリアス定義。
	public MCLabel Cnd_spplgrp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_spplgrp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_spplgrp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_spplgrp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_spplgrp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_spplgrp_cd10]としてエイリアス定義。
	public MCTextField Cnd_spplgrp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_spplgrp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_asppl_grp_p_PPanel;
	public MCLabel Cnd_asppl_grp_lab1;	// [Cnd]の[asppl_grp_p.bp_grp_lab1]を[Cnd_asppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg1;	// [Cnd]の[asppl_grp_p.bp_grp_flg1]を[Cnd_asppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd1;	// [Cnd]の[asppl_grp_p.bp_grp_cd1]を[Cnd_asppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm1;	// [Cnd]の[asppl_grp_p.bp_grp_nm1]を[Cnd_asppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab2;	// [Cnd]の[asppl_grp_p.bp_grp_lab2]を[Cnd_asppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg2;	// [Cnd]の[asppl_grp_p.bp_grp_flg2]を[Cnd_asppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd2;	// [Cnd]の[asppl_grp_p.bp_grp_cd2]を[Cnd_asppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm2;	// [Cnd]の[asppl_grp_p.bp_grp_nm2]を[Cnd_asppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab3;	// [Cnd]の[asppl_grp_p.bp_grp_lab3]を[Cnd_asppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg3;	// [Cnd]の[asppl_grp_p.bp_grp_flg3]を[Cnd_asppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd3;	// [Cnd]の[asppl_grp_p.bp_grp_cd3]を[Cnd_asppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm3;	// [Cnd]の[asppl_grp_p.bp_grp_nm3]を[Cnd_asppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab4;	// [Cnd]の[asppl_grp_p.bp_grp_lab4]を[Cnd_asppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg4;	// [Cnd]の[asppl_grp_p.bp_grp_flg4]を[Cnd_asppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd4;	// [Cnd]の[asppl_grp_p.bp_grp_cd4]を[Cnd_asppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm4;	// [Cnd]の[asppl_grp_p.bp_grp_nm4]を[Cnd_asppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab5;	// [Cnd]の[asppl_grp_p.bp_grp_lab5]を[Cnd_asppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg5;	// [Cnd]の[asppl_grp_p.bp_grp_flg5]を[Cnd_asppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd5;	// [Cnd]の[asppl_grp_p.bp_grp_cd5]を[Cnd_asppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm5;	// [Cnd]の[asppl_grp_p.bp_grp_nm5]を[Cnd_asppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab6;	// [Cnd]の[asppl_grp_p.bp_grp_lab6]を[Cnd_asppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg6;	// [Cnd]の[asppl_grp_p.bp_grp_flg6]を[Cnd_asppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd6;	// [Cnd]の[asppl_grp_p.bp_grp_cd6]を[Cnd_asppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm6;	// [Cnd]の[asppl_grp_p.bp_grp_nm6]を[Cnd_asppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab7;	// [Cnd]の[asppl_grp_p.bp_grp_lab7]を[Cnd_asppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg7;	// [Cnd]の[asppl_grp_p.bp_grp_flg7]を[Cnd_asppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd7;	// [Cnd]の[asppl_grp_p.bp_grp_cd7]を[Cnd_asppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm7;	// [Cnd]の[asppl_grp_p.bp_grp_nm7]を[Cnd_asppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab8;	// [Cnd]の[asppl_grp_p.bp_grp_lab8]を[Cnd_asppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg8;	// [Cnd]の[asppl_grp_p.bp_grp_flg8]を[Cnd_asppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd8;	// [Cnd]の[asppl_grp_p.bp_grp_cd8]を[Cnd_asppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm8;	// [Cnd]の[asppl_grp_p.bp_grp_nm8]を[Cnd_asppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab9;	// [Cnd]の[asppl_grp_p.bp_grp_lab9]を[Cnd_asppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg9;	// [Cnd]の[asppl_grp_p.bp_grp_flg9]を[Cnd_asppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd9;	// [Cnd]の[asppl_grp_p.bp_grp_cd9]を[Cnd_asppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm9;	// [Cnd]の[asppl_grp_p.bp_grp_nm9]を[Cnd_asppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab10;	// [Cnd]の[asppl_grp_p.bp_grp_lab10]を[Cnd_asppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg10;	// [Cnd]の[asppl_grp_p.bp_grp_flg10]を[Cnd_asppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd10;	// [Cnd]の[asppl_grp_p.bp_grp_cd10]を[Cnd_asppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm10;	// [Cnd]の[asppl_grp_p.bp_grp_nm10]を[Cnd_asppl_grp_nm10]としてエイリアス定義。
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
	// [IvTrgt]ブロック関連のField定義
	public MCPanel IvTrgtPanel = null;
	public MCTitledBorder IvTrgtTitledBorder = null;
	// [IvTrgt]ブロックの項目のField定義
	// [UpriSts]ブロック関連のField定義
	public MCPanel UpriStsPanel = null;
	public MCTitledBorder UpriStsTitledBorder = null;
	// [UpriSts]ブロックの項目のField定義
	// [SubconSts]ブロック関連のField定義
	public MCPanel SubconStsPanel = null;
	public MCTitledBorder SubconStsTitledBorder = null;
	// [SubconSts]ブロックの項目のField定義
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
	// [Fold2]ブロック関連のField定義
	public MCPanel Fold2Panel = null;
	public MCTabbedPane Fold2Tab = null;
	// [Fold2]ブロックの項目のField定義
	// [MidTab1]ブロック関連のField定義
	public MCPanel MidTab1Panel = null;
	// [MidTab1]ブロックの項目のField定義
	// [UpriReq]ブロック関連のField定義
	public MCPanel UpriReqPanel = null;
	public MCTitledBorder UpriReqTitledBorder = null;
	// [UpriReq]ブロックの項目のField定義
	public MCLabel UpriReq_upri_dt_Label = null;
	/**
	 * Adoption date of unit price 単価採用日.<p>
	 *
	 */
	public MCDateField UpriReq_upri_dt = null;
	/**
	 * Bulk acquisition 一括取得.<p>
	 *
	 */
	public MCButton UpriReq_uprireq = null;
	/**
	 * Temporary unit price bulk setting 仮単価一括設定.<p>
	 *
	 */
	public MCLabel UpriReq_label_interim_flg = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCButton UpriReq_tag_flg = null;
	/**
	 * Deselect 選択解除.<p>
	 *
	 */
	public MCButton UpriReq_not_tag_flg = null;
	// [XrateReq]ブロック関連のField定義
	public MCPanel XrateReqPanel = null;
	public MCTitledBorder XrateReqTitledBorder = null;
	// [XrateReq]ブロックの項目のField定義
	public MCLabel XrateReq_xrate_dt_Label = null;
	/**
	 * Adoption date of exchange rate 為替レート採用日.<p>
	 *
	 */
	public MCDateField XrateReq_xrate_dt = null;
	/**
	 * Bulk acquisition 一括取得.<p>
	 *
	 */
	public MCButton XrateReq_xratereq = null;
	// [MidTab2]ブロック関連のField定義
	public MCPanel MidTab2Panel = null;
	// [MidTab2]ブロックの項目のField定義
	// [TaxReq]ブロック関連のField定義
	public MCPanel TaxReqPanel = null;
	public MCTitledBorder TaxReqTitledBorder = null;
	// [TaxReq]ブロックの項目のField定義
	public MCLabel TaxReq_tax_dt_Label = null;
	/**
	 * Tax adoption date 税採用日.<p>
	 *
	 */
	public MCDateField TaxReq_tax_dt = null;
	/**
	 * Bulk acquisition 一括取得.<p>
	 *
	 */
	public MCButton TaxReq_taxreq = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0190.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Slip status type name 伝票状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
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
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dt = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dt = null;
	/**
	 * Purchase closing month 仕入締年月.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_cl_ym = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_basis_dt = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_schd_dt = null;
	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_dt = null;
	/**
	 * Receipt time 入荷時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_hm = null;
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
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_purc_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_purc_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_purc_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_purc_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_purc_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_purc_dpt_nm]としてエイリアス定義。
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_flg = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ_nm = null;
	/**
	 * Transaction unit 取引単位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
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
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Dtl_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_cont_qty;// [Dtl]の[purc_cont_qty_p.purc_cont_qty]を[columnDtl_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Dtl_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_purc_cont_fctr;// [Dtl]の[purc_cont_fctr_p.purc_cont_fctr]を[columnDtl_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_qty;// [Dtl]の[std_cont_qty_p.cont_qty]を[columnDtl_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_nm = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_amt_dec_place = null;
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cur_upri_dec_place = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
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
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_upri;// [Dtl]の[old_trd_cur_upri_p.upri]を[columnDtl_old_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_proc_upri;// [Dtl]の[old_trd_cur_proc_upri_p.upri]を[columnDtl_old_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_old_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_old_trd_cur_onr_prov_upri;// [Dtl]の[old_trd_cur_onr_prov_upri_p.upri]を[columnDtl_old_trd_cur_onr_prov_upri]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_amt = null;
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rnd_typ = null;
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
	 * PO date 発注日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_dt = null;
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_rqst_dt = null;
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_rqst_hm = null;
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_dt = null;
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
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_xrate_p_PPanel;
	public MCColumnConfig columnDtl_xrate;// [Dtl]の[xrate_p.xrate]を[columnDtl_xrate]としてエイリアス定義。
	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_upri;// [Dtl]の[base_cur_upri_p.upri]を[columnDtl_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_amt;// [Dtl]の[base_cur_amt_p.amt]を[columnDtl_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_inc_tax_amt;// [Dtl]の[base_cur_inc_tax_amt_p.amt]を[columnDtl_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_tax_amt;// [Dtl]の[base_cur_tax_amt_p.amt]を[columnDtl_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_dscnt_amt;// [Dtl]の[base_cur_dscnt_amt_p.amt]を[columnDtl_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_upri;// [Dtl]の[base_cur_proc_upri_p.upri]を[columnDtl_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_proc_amt;// [Dtl]の[base_cur_proc_amt_p.amt]を[columnDtl_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_upri;// [Dtl]の[base_cur_onr_prov_upri_p.upri]を[columnDtl_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_base_cur_onr_prov_amt;// [Dtl]の[base_cur_onr_prov_amt_p.amt]を[columnDtl_base_cur_onr_prov_amt]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl_ptax_xrate_p_PPanel;
	public MCColumnConfig columnDtl_ptax_xrate;// [Dtl]の[ptax_xrate_p.xrate]を[columnDtl_ptax_xrate]としてエイリアス定義。
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_xrate_inpt_flg = null;
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ptax_dt = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_inc_tax_amt;// [Dtl]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_tax_amt;// [Dtl]の[ptax_cur_tax_amt_p.amt]を[columnDtl_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_dscnt_amt;// [Dtl]の[ptax_cur_dscnt_amt_p.amt]を[columnDtl_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_upri;// [Dtl]の[ptax_cur_proc_upri_p.upri]を[columnDtl_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_proc_amt;// [Dtl]の[ptax_cur_proc_amt_p.amt]を[columnDtl_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_upri;// [Dtl]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl_ptax_cur_onr_prov_amt;// [Dtl]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl_ptax_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ_nm = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_nm = null;
	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_wg_nm = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd_none_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_to_loc_cal_cd = null;
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_sppl_cd = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_tgt_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_cd = null;
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
	 * Return-to name 返品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_sppl_nm = null;
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
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_calc_typ = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_spot_flg = null;
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_iv_flg = null;
	/**
	 * Transaction unit cd. for unit price acquisition 単価取得用取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_trd_unit_cd = null;
	/**
	 * Name for transaction unit for unit price acquisition 単価取得用取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places for unit price acquisition 単価取得用取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_trd_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_trd_unit_qty;// [Dtl]の[base_trd_unit_qty_p.qty]を[columnDtl_base_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_base_unit_qty;// [Dtl]の[base_base_unit_qty_p.qty]を[columnDtl_base_base_unit_qty]としてエイリアス定義。
	/**
	 * Acquire unit price transaction currency cd. 単価取得用取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_trd_cur_cd = null;
	/**
	 * Acquire unit price transaction currency name 単価取得用取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_trd_cur_nm = null;
	/**
	 * Delivery location for acquire unit price of WG cd. 単価取得用納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_in_to_loc_wg_cd = null;
	/**
	 * Delivery location for transaction unit acquisition WG name 単価取得用納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_in_to_loc_wg_nm = null;
	/**
	 * Delivery location cd. for acquire unit price 単価取得用納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_in_to_loc_cd = null;
	/**
	 * Delivery location name for acquire unit price 単価取得用納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_in_to_loc_nm = null;
	/**
	 * Base date for acquire unit price 単価取得用基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sbst_dt = null;
	/**
	 * Base date for acquire unit price 単価取得用基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_dt = null;
	/**
	 * Tax cd. for acquire unit price 単価取得用税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_tax_cd = null;
	/**
	 * Tax name for acquire unit price 単価取得用税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_tax_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_itm_ord_no = null;
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_avl_rqst_dt = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_dlv_p_PPanel;
	public MCColumnConfig columnDtl_dlv_cd;// [Dtl]の[dlv_p.bp_cd]を[columnDtl_dlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_nm;// [Dtl]の[dlv_p.bp_nm]を[columnDtl_dlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_sundry_flg;// [Dtl]の[dlv_p.dlv_sundry_flg]を[columnDtl_dlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_show_dt;// [Dtl]の[dlv_p.show_dtl]を[columnDtl_dlv_show_dt]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D Dtl_tdlv_p_PPanel;
	public MCColumnConfig columnDtl_tdlv_cd;// [Dtl]の[tdlv_p.bp_cd]を[columnDtl_tdlv_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_nm;// [Dtl]の[tdlv_p.bp_nm]を[columnDtl_tdlv_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_sundry_flg;// [Dtl]の[tdlv_p.dlv_sundry_flg]を[columnDtl_tdlv_sundry_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_tdlv_show_dt;// [Dtl]の[tdlv_p.show_dtl]を[columnDtl_tdlv_show_dt]としてエイリアス定義。
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_nm = null;
	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_ap_dpt_cd = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_nm = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_dlv_slip_d_no = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_no = null;
	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_seq = null;
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_rev = null;
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_no = null;
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_seq = null;
	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_io_no = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_purc_ac_dt = null;
	/**
	 * Purchase source type 仕入作成元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_src_typ = null;
	/**
	 * Purchase create source type name 仕入作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_src_typ_nm = null;
	/**
	 * Purchase source No. 仕入作成元ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_src_no = null;
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
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_no = null;
	/**
	 * Purchase invoice details No. 受領インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcpt_iv_d_no = null;
	/**
	 * Corresponding purchase I/V No. 対応受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_rcpt_iv_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_schd_no = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_act_no = null;
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_act_no = null;
	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_act_rev = null;
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_act_d_no = null;
	/**
	 * Purchase return result GR/GI No. 仕入返品実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_act_io_no = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_lot_no = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
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
	 * Free of charge 無償.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ncv_flg = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_edi_flg = null;
	/**
	 * Receipt simultaneously recording 入荷同時計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sync_flg = null;
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public MCColumnConfig columnDtl_temp_ap_flg = null;
	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public MCColumnConfig columnDtl_accpt_dfct_flg = null;
	/**
	 * Re-receipt 再入荷.<p>
	 *
	 */
	public MCColumnConfig columnDtl_re_arr_flg = null;
	/**
	 * Transaction terms 1 取引条件１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_nm1 = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_rmrks1 = null;
	/**
	 * Transaction terms 2 取引条件２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_nm2 = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_rmrks2 = null;
	/**
	 * Transaction terms 3 取引条件３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_nm3 = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tterm_rmrks3 = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_itm_nm = null;
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
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_crryovr_times = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
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
	/**
	 * Purchase adjustment controlling site type 仕入調整管轄区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dscnt_loc_mng_typ = null;
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
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_sub_char3 = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_act_d_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_rtn_sts_typ_nm;// [Dtl]の[rts_msg_p.rtn_sts_typ_nm]を[columnDtl_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg_id;// [Dtl]の[rts_msg_p.msg_id]を[columnDtl_msg_id]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg;// [Dtl]の[rts_msg_p.msg]を[columnDtl_msg]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_sppl_grp_p_PPanel;
	public MCColumnConfig columnDtl_sppl_grp_cd1;// [Dtl]の[sppl_grp_p.bp_grp_cd1]を[columnDtl_sppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm1;// [Dtl]の[sppl_grp_p.bp_grp_nm1]を[columnDtl_sppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd2;// [Dtl]の[sppl_grp_p.bp_grp_cd2]を[columnDtl_sppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm2;// [Dtl]の[sppl_grp_p.bp_grp_nm2]を[columnDtl_sppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd3;// [Dtl]の[sppl_grp_p.bp_grp_cd3]を[columnDtl_sppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm3;// [Dtl]の[sppl_grp_p.bp_grp_nm3]を[columnDtl_sppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd4;// [Dtl]の[sppl_grp_p.bp_grp_cd4]を[columnDtl_sppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm4;// [Dtl]の[sppl_grp_p.bp_grp_nm4]を[columnDtl_sppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd5;// [Dtl]の[sppl_grp_p.bp_grp_cd5]を[columnDtl_sppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm5;// [Dtl]の[sppl_grp_p.bp_grp_nm5]を[columnDtl_sppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd6;// [Dtl]の[sppl_grp_p.bp_grp_cd6]を[columnDtl_sppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm6;// [Dtl]の[sppl_grp_p.bp_grp_nm6]を[columnDtl_sppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd7;// [Dtl]の[sppl_grp_p.bp_grp_cd7]を[columnDtl_sppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm7;// [Dtl]の[sppl_grp_p.bp_grp_nm7]を[columnDtl_sppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd8;// [Dtl]の[sppl_grp_p.bp_grp_cd8]を[columnDtl_sppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm8;// [Dtl]の[sppl_grp_p.bp_grp_nm8]を[columnDtl_sppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd9;// [Dtl]の[sppl_grp_p.bp_grp_cd9]を[columnDtl_sppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm9;// [Dtl]の[sppl_grp_p.bp_grp_nm9]を[columnDtl_sppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_cd10;// [Dtl]の[sppl_grp_p.bp_grp_cd10]を[columnDtl_sppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_sppl_grp_nm10;// [Dtl]の[sppl_grp_p.bp_grp_nm10]を[columnDtl_sppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl_asppl_grp_p_PPanel;
	public MCColumnConfig columnDtl_asppl_grp_cd1;// [Dtl]の[asppl_grp_p.bp_grp_cd1]を[columnDtl_asppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm1;// [Dtl]の[asppl_grp_p.bp_grp_nm1]を[columnDtl_asppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd2;// [Dtl]の[asppl_grp_p.bp_grp_cd2]を[columnDtl_asppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm2;// [Dtl]の[asppl_grp_p.bp_grp_nm2]を[columnDtl_asppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd3;// [Dtl]の[asppl_grp_p.bp_grp_cd3]を[columnDtl_asppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm3;// [Dtl]の[asppl_grp_p.bp_grp_nm3]を[columnDtl_asppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd4;// [Dtl]の[asppl_grp_p.bp_grp_cd4]を[columnDtl_asppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm4;// [Dtl]の[asppl_grp_p.bp_grp_nm4]を[columnDtl_asppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd5;// [Dtl]の[asppl_grp_p.bp_grp_cd5]を[columnDtl_asppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm5;// [Dtl]の[asppl_grp_p.bp_grp_nm5]を[columnDtl_asppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd6;// [Dtl]の[asppl_grp_p.bp_grp_cd6]を[columnDtl_asppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm6;// [Dtl]の[asppl_grp_p.bp_grp_nm6]を[columnDtl_asppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd7;// [Dtl]の[asppl_grp_p.bp_grp_cd7]を[columnDtl_asppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm7;// [Dtl]の[asppl_grp_p.bp_grp_nm7]を[columnDtl_asppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd8;// [Dtl]の[asppl_grp_p.bp_grp_cd8]を[columnDtl_asppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm8;// [Dtl]の[asppl_grp_p.bp_grp_nm8]を[columnDtl_asppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd9;// [Dtl]の[asppl_grp_p.bp_grp_cd9]を[columnDtl_asppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm9;// [Dtl]の[asppl_grp_p.bp_grp_nm9]を[columnDtl_asppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_cd10;// [Dtl]の[asppl_grp_p.bp_grp_cd10]を[columnDtl_asppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl_asppl_grp_nm10;// [Dtl]の[asppl_grp_p.bp_grp_nm10]を[columnDtl_asppl_grp_nm10]としてエイリアス定義。
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
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Header column editable ヘッダ項目編集可能.<p>
	 *
	 */
	public MCColumnConfig columnDtl_hdr_edit_flg = null;
	/**
	 * Purchase result update counter 仕入実績更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upd_cntr = null;
	/**
	 * Purchase return result update counter 仕入返品実績更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_upd_cntr = null;
	/**
	 * Exchange rate acquisition base date 為替レート取得基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xrate_base_dt = null;
	/**
	 * Tax acquisition base date 税取得基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tax_base_dt = null;
	/**
	 * Purchase return date 仕入返品日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ret_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_dtl = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_HDR]モードを表す定数 */
	public static final String SRCH_HDR = "SRCH_HDR";
	/** [REF_HDR]モードを表す定数 */
	public static final String REF_HDR = "REF_HDR";
	/** [SRCH_DTL]モードを表す定数 */
	public static final String SRCH_DTL = "SRCH_DTL";
	/** [REF_DTL]モードを表す定数 */
	public static final String REF_DTL = "REF_DTL";
	/** [SRCH_IO]モードを表す定数 */
	public static final String SRCH_IO = "SRCH_IO";
	/** [REF_IO]モードを表す定数 */
	public static final String REF_IO = "REF_IO";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH_HDR, REF_HDR, SRCH_DTL, REF_DTL, SRCH_IO, REF_IO};
	
	/** [MS_MSBDL0190_Srch01]のCallerの作成 */
	protected MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Srch01Caller createMS_MSBDL0190_Srch01() {
		MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Srch01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Srch01Bridge>
		caller = ((MSBDP_PurcDtlModReg_MC)this).new MS_MSBDL0190_Srch01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Srch01Bridge>(
					(MSBDP_PurcDtlModReg)this, new MS_MSBDL0190_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0190_Srch01]の呼び出し */
	protected void callMS_MSBDL0190_Srch01() {
		MCCaller caller = createMS_MSBDL0190_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0190_Upd01]のCallerの作成 */
	protected MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Upd01Caller createMS_MSBDL0190_Upd01() {
		MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Upd01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Upd01Bridge>
		caller = ((MSBDP_PurcDtlModReg_MC)this).new MS_MSBDL0190_Upd01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Upd01Bridge>(
					(MSBDP_PurcDtlModReg)this, new MS_MSBDL0190_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0190_Upd01]の呼び出し */
	protected void callMS_MSBDL0190_Upd01() {
		MCCaller caller = createMS_MSBDL0190_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0190_Sprt01]のCallerの作成 */
	protected MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt01Caller createMS_MSBDL0190_Sprt01() {
		MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt01Bridge>
		caller = ((MSBDP_PurcDtlModReg_MC)this).new MS_MSBDL0190_Sprt01Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt01Bridge>(
					(MSBDP_PurcDtlModReg)this, new MS_MSBDL0190_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0190_Sprt01]の呼び出し */
	protected void callMS_MSBDL0190_Sprt01() {
		MCCaller caller = createMS_MSBDL0190_Sprt01();
		caller.exec();
	}
	/** [MS_MSBDL0190_Sprt02]のCallerの作成 */
	protected MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt02Caller createMS_MSBDL0190_Sprt02() {
		MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt02Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt02Bridge>
		caller = ((MSBDP_PurcDtlModReg_MC)this).new MS_MSBDL0190_Sprt02Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt02Bridge>(
					(MSBDP_PurcDtlModReg)this, new MS_MSBDL0190_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBDL0190_Sprt02]の呼び出し */
	protected void callMS_MSBDL0190_Sprt02() {
		MCCaller caller = createMS_MSBDL0190_Sprt02();
		caller.exec();
	}
	/** [MS_MSBDL0190_Sprt03]のCallerの作成 */
	protected MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt03Caller createMS_MSBDL0190_Sprt03() {
		MSBDP_PurcDtlModReg_MC.MS_MSBDL0190_Sprt03Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt03Bridge>
		caller = ((MSBDP_PurcDtlModReg_MC)this).new MS_MSBDL0190_Sprt03Caller<MSBDP_PurcDtlModReg, MS_MSBDL0190_Sprt03Bridge>(
					(MSBDP_PurcDtlModReg)this, new MS_MSBDL0190_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBDL0190_Sprt03]の呼び出し */
	protected void callMS_MSBDL0190_Sprt03() {
		MCCaller caller = createMS_MSBDL0190_Sprt03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0190.CndR aCndR;
	/** [UpriReq]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0190.UpriReqR aUpriReqR;
	/** [XrateReq]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0190.XrateReqR aXrateReqR;
	/** [TaxReq]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0190.TaxReqR aTaxReqR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0190.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0190.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0190.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0190.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0190.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0190.CndR.create();
	}

	/**
	 * 項目コピーによってaUpriReqRを設定します。
	 *
	 * aUpriReqRのインスタンスは変更されません。
	 *
	 * @param row UpriReqR
	 */
	public void setUpriReqR(mcframe.clientMSBD.MSBDP0190.UpriReqR row) {
		if (row != null) {
			MCRow.copyall(getUpriReqR(), row);
		}
	}

	/**
	 * [UpriReq]ブロックのコンテナaUpriReqRを返します。
	 *
	 * @return UpriReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.UpriReqR getUpriReqR() {
		return aUpriReqR;
	}

	/**
	 * aUpriReqRを作成します。
	 *
	 * @return UpriReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.UpriReqR createUpriReqR() {
		return mcframe.clientMSBD.MSBDP0190.UpriReqR.create();
	}

	/**
	 * 項目コピーによってaXrateReqRを設定します。
	 *
	 * aXrateReqRのインスタンスは変更されません。
	 *
	 * @param row XrateReqR
	 */
	public void setXrateReqR(mcframe.clientMSBD.MSBDP0190.XrateReqR row) {
		if (row != null) {
			MCRow.copyall(getXrateReqR(), row);
		}
	}

	/**
	 * [XrateReq]ブロックのコンテナaXrateReqRを返します。
	 *
	 * @return XrateReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.XrateReqR getXrateReqR() {
		return aXrateReqR;
	}

	/**
	 * aXrateReqRを作成します。
	 *
	 * @return XrateReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.XrateReqR createXrateReqR() {
		return mcframe.clientMSBD.MSBDP0190.XrateReqR.create();
	}

	/**
	 * 項目コピーによってaTaxReqRを設定します。
	 *
	 * aTaxReqRのインスタンスは変更されません。
	 *
	 * @param row TaxReqR
	 */
	public void setTaxReqR(mcframe.clientMSBD.MSBDP0190.TaxReqR row) {
		if (row != null) {
			MCRow.copyall(getTaxReqR(), row);
		}
	}

	/**
	 * [TaxReq]ブロックのコンテナaTaxReqRを返します。
	 *
	 * @return TaxReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.TaxReqR getTaxReqR() {
		return aTaxReqR;
	}

	/**
	 * aTaxReqRを作成します。
	 *
	 * @return TaxReqR
	 */
	public mcframe.clientMSBD.MSBDP0190.TaxReqR createTaxReqR() {
		return mcframe.clientMSBD.MSBDP0190.TaxReqR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBD.MSBDP0190.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0190.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBD.MSBDP0190.DtlR createDtlR() {
		return mcframe.clientMSBD.MSBDP0190.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBD.MSBDP0190.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBD.MSBDP0190.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0190.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBD.MSBDP0190.BtnR createBtnR() {
		return mcframe.clientMSBD.MSBDP0190.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getUpriReqR())) ret.add(getUpriReqR());
		if(!MCCollectionUtil.contains(ret, getXrateReqR())) ret.add(getXrateReqR());
		if(!MCCollectionUtil.contains(ret, getTaxReqR())) ret.add(getTaxReqR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getUpriReqR()) return "UpriReq";
		if(aCnt == getXrateReqR()) return "XrateReq";
		if(aCnt == getTaxReqR()) return "TaxReq";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("UpriReq")) return getUpriReqR();
		if(bId.equals("XrateReq")) return getXrateReqR();
		if(bId.equals("TaxReq")) return getTaxReqR();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(DispUnitPanel);
		ret.add(SelectOpePanel);
		ret.add(TOPPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(SpplGrpPanel);
		ret.add(AspplGrpPanel);
		ret.add(ItmGrpPanel);
		ret.add(CndPanel);
		ret.add(IvTrgtPanel);
		ret.add(UpriStsPanel);
		ret.add(SubconStsPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(Fold2Panel);
		ret.add(MidTab1Panel);
		ret.add(UpriReqPanel);
		ret.add(XrateReqPanel);
		ret.add(MidTab2Panel);
		ret.add(TaxReqPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDtlModReg_MC_A() {
		aCndR = createCndR();
		aUpriReqR = createUpriReqR();
		aXrateReqR = createXrateReqR();
		aTaxReqR = createTaxReqR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcDtlModReg_MC_A(String name) {
		aCndR = createCndR();
		aUpriReqR = createUpriReqR();
		aXrateReqR = createXrateReqR();
		aTaxReqR = createTaxReqR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PurcDtlModReg_MC.jbCreateScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateDispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateSelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateTOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateFold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateSpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateAspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateCnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateIvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateUpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateSubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateCtrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateRPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateBulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateFold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateMidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateUpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateXrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateMidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateTaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateDtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateBtn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbCreateEastBtn((MSBDP_PurcDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [DispUnit]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDispUnit(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [SelectOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSelectOpe(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [TOP]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTOP(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [SpplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpplGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [AspplGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAspplGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcDtlModReg p) {
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
		p.Cnd_spplgrp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_spplgrp_lab1.addAliasName("Cnd.spplgrp_lab1", p);
		p.Cnd_spplgrp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_spplgrp_flg1.addAliasName("Cnd.spplgrp_flg1", p);
		p.Cnd_spplgrp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_spplgrp_cd1.addAliasName("Cnd.spplgrp_cd1", p);
		p.Cnd_spplgrp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_spplgrp_nm1.addAliasName("Cnd.spplgrp_nm1", p);
		p.Cnd_spplgrp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_spplgrp_lab2.addAliasName("Cnd.spplgrp_lab2", p);
		p.Cnd_spplgrp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_spplgrp_flg2.addAliasName("Cnd.spplgrp_flg2", p);
		p.Cnd_spplgrp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_spplgrp_cd2.addAliasName("Cnd.spplgrp_cd2", p);
		p.Cnd_spplgrp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_spplgrp_nm2.addAliasName("Cnd.spplgrp_nm2", p);
		p.Cnd_spplgrp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_spplgrp_lab3.addAliasName("Cnd.spplgrp_lab3", p);
		p.Cnd_spplgrp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_spplgrp_flg3.addAliasName("Cnd.spplgrp_flg3", p);
		p.Cnd_spplgrp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_spplgrp_cd3.addAliasName("Cnd.spplgrp_cd3", p);
		p.Cnd_spplgrp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_spplgrp_nm3.addAliasName("Cnd.spplgrp_nm3", p);
		p.Cnd_spplgrp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_spplgrp_lab4.addAliasName("Cnd.spplgrp_lab4", p);
		p.Cnd_spplgrp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_spplgrp_flg4.addAliasName("Cnd.spplgrp_flg4", p);
		p.Cnd_spplgrp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_spplgrp_cd4.addAliasName("Cnd.spplgrp_cd4", p);
		p.Cnd_spplgrp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_spplgrp_nm4.addAliasName("Cnd.spplgrp_nm4", p);
		p.Cnd_spplgrp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_spplgrp_lab5.addAliasName("Cnd.spplgrp_lab5", p);
		p.Cnd_spplgrp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_spplgrp_flg5.addAliasName("Cnd.spplgrp_flg5", p);
		p.Cnd_spplgrp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_spplgrp_cd5.addAliasName("Cnd.spplgrp_cd5", p);
		p.Cnd_spplgrp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_spplgrp_nm5.addAliasName("Cnd.spplgrp_nm5", p);
		p.Cnd_spplgrp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_spplgrp_lab6.addAliasName("Cnd.spplgrp_lab6", p);
		p.Cnd_spplgrp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_spplgrp_flg6.addAliasName("Cnd.spplgrp_flg6", p);
		p.Cnd_spplgrp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_spplgrp_cd6.addAliasName("Cnd.spplgrp_cd6", p);
		p.Cnd_spplgrp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_spplgrp_nm6.addAliasName("Cnd.spplgrp_nm6", p);
		p.Cnd_spplgrp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_spplgrp_lab7.addAliasName("Cnd.spplgrp_lab7", p);
		p.Cnd_spplgrp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_spplgrp_flg7.addAliasName("Cnd.spplgrp_flg7", p);
		p.Cnd_spplgrp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_spplgrp_cd7.addAliasName("Cnd.spplgrp_cd7", p);
		p.Cnd_spplgrp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_spplgrp_nm7.addAliasName("Cnd.spplgrp_nm7", p);
		p.Cnd_spplgrp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_spplgrp_lab8.addAliasName("Cnd.spplgrp_lab8", p);
		p.Cnd_spplgrp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_spplgrp_flg8.addAliasName("Cnd.spplgrp_flg8", p);
		p.Cnd_spplgrp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_spplgrp_cd8.addAliasName("Cnd.spplgrp_cd8", p);
		p.Cnd_spplgrp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_spplgrp_nm8.addAliasName("Cnd.spplgrp_nm8", p);
		p.Cnd_spplgrp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_spplgrp_lab9.addAliasName("Cnd.spplgrp_lab9", p);
		p.Cnd_spplgrp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_spplgrp_flg9.addAliasName("Cnd.spplgrp_flg9", p);
		p.Cnd_spplgrp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_spplgrp_cd9.addAliasName("Cnd.spplgrp_cd9", p);
		p.Cnd_spplgrp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_spplgrp_nm9.addAliasName("Cnd.spplgrp_nm9", p);
		p.Cnd_spplgrp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_spplgrp_lab10.addAliasName("Cnd.spplgrp_lab10", p);
		p.Cnd_spplgrp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_spplgrp_flg10.addAliasName("Cnd.spplgrp_flg10", p);
		p.Cnd_spplgrp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_spplgrp_cd10.addAliasName("Cnd.spplgrp_cd10", p);
		p.Cnd_spplgrp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_spplgrp_nm10.addAliasName("Cnd.spplgrp_nm10", p);
		p.Cnd_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().asppl_grp_p());
		p.Cnd_asppl_grp_p_PPanel.setName("Cnd.asppl_grp_p");
		p.Cnd_asppl_grp_lab1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_asppl_grp_lab1.addAliasName("Cnd.asppl_grp_lab1", p);
		p.Cnd_asppl_grp_flg1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_asppl_grp_flg1.addAliasName("Cnd.asppl_grp_flg1", p);
		p.Cnd_asppl_grp_cd1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_asppl_grp_cd1.addAliasName("Cnd.asppl_grp_cd1", p);
		p.Cnd_asppl_grp_nm1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_asppl_grp_nm1.addAliasName("Cnd.asppl_grp_nm1", p);
		p.Cnd_asppl_grp_lab2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_asppl_grp_lab2.addAliasName("Cnd.asppl_grp_lab2", p);
		p.Cnd_asppl_grp_flg2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_asppl_grp_flg2.addAliasName("Cnd.asppl_grp_flg2", p);
		p.Cnd_asppl_grp_cd2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_asppl_grp_cd2.addAliasName("Cnd.asppl_grp_cd2", p);
		p.Cnd_asppl_grp_nm2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_asppl_grp_nm2.addAliasName("Cnd.asppl_grp_nm2", p);
		p.Cnd_asppl_grp_lab3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_asppl_grp_lab3.addAliasName("Cnd.asppl_grp_lab3", p);
		p.Cnd_asppl_grp_flg3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_asppl_grp_flg3.addAliasName("Cnd.asppl_grp_flg3", p);
		p.Cnd_asppl_grp_cd3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_asppl_grp_cd3.addAliasName("Cnd.asppl_grp_cd3", p);
		p.Cnd_asppl_grp_nm3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_asppl_grp_nm3.addAliasName("Cnd.asppl_grp_nm3", p);
		p.Cnd_asppl_grp_lab4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_asppl_grp_lab4.addAliasName("Cnd.asppl_grp_lab4", p);
		p.Cnd_asppl_grp_flg4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_asppl_grp_flg4.addAliasName("Cnd.asppl_grp_flg4", p);
		p.Cnd_asppl_grp_cd4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_asppl_grp_cd4.addAliasName("Cnd.asppl_grp_cd4", p);
		p.Cnd_asppl_grp_nm4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_asppl_grp_nm4.addAliasName("Cnd.asppl_grp_nm4", p);
		p.Cnd_asppl_grp_lab5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_asppl_grp_lab5.addAliasName("Cnd.asppl_grp_lab5", p);
		p.Cnd_asppl_grp_flg5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_asppl_grp_flg5.addAliasName("Cnd.asppl_grp_flg5", p);
		p.Cnd_asppl_grp_cd5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_asppl_grp_cd5.addAliasName("Cnd.asppl_grp_cd5", p);
		p.Cnd_asppl_grp_nm5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_asppl_grp_nm5.addAliasName("Cnd.asppl_grp_nm5", p);
		p.Cnd_asppl_grp_lab6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_asppl_grp_lab6.addAliasName("Cnd.asppl_grp_lab6", p);
		p.Cnd_asppl_grp_flg6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_asppl_grp_flg6.addAliasName("Cnd.asppl_grp_flg6", p);
		p.Cnd_asppl_grp_cd6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_asppl_grp_cd6.addAliasName("Cnd.asppl_grp_cd6", p);
		p.Cnd_asppl_grp_nm6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_asppl_grp_nm6.addAliasName("Cnd.asppl_grp_nm6", p);
		p.Cnd_asppl_grp_lab7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_asppl_grp_lab7.addAliasName("Cnd.asppl_grp_lab7", p);
		p.Cnd_asppl_grp_flg7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_asppl_grp_flg7.addAliasName("Cnd.asppl_grp_flg7", p);
		p.Cnd_asppl_grp_cd7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_asppl_grp_cd7.addAliasName("Cnd.asppl_grp_cd7", p);
		p.Cnd_asppl_grp_nm7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_asppl_grp_nm7.addAliasName("Cnd.asppl_grp_nm7", p);
		p.Cnd_asppl_grp_lab8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_asppl_grp_lab8.addAliasName("Cnd.asppl_grp_lab8", p);
		p.Cnd_asppl_grp_flg8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_asppl_grp_flg8.addAliasName("Cnd.asppl_grp_flg8", p);
		p.Cnd_asppl_grp_cd8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_asppl_grp_cd8.addAliasName("Cnd.asppl_grp_cd8", p);
		p.Cnd_asppl_grp_nm8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_asppl_grp_nm8.addAliasName("Cnd.asppl_grp_nm8", p);
		p.Cnd_asppl_grp_lab9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_asppl_grp_lab9.addAliasName("Cnd.asppl_grp_lab9", p);
		p.Cnd_asppl_grp_flg9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_asppl_grp_flg9.addAliasName("Cnd.asppl_grp_flg9", p);
		p.Cnd_asppl_grp_cd9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_asppl_grp_cd9.addAliasName("Cnd.asppl_grp_cd9", p);
		p.Cnd_asppl_grp_nm9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_asppl_grp_nm9.addAliasName("Cnd.asppl_grp_nm9", p);
		p.Cnd_asppl_grp_lab10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_asppl_grp_lab10.addAliasName("Cnd.asppl_grp_lab10", p);
		p.Cnd_asppl_grp_flg10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_asppl_grp_flg10.addAliasName("Cnd.asppl_grp_flg10", p);
		p.Cnd_asppl_grp_cd10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_asppl_grp_cd10.addAliasName("Cnd.asppl_grp_cd10", p);
		p.Cnd_asppl_grp_nm10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_asppl_grp_nm10.addAliasName("Cnd.asppl_grp_nm10", p);
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
	protected static void jbCreateIvTrgt(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [UpriSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriSts(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [SubconSts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSubconSts(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBDP_PurcDtlModReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Fold2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold2(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [MidTab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMidTab1(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [UpriReq]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateUpriReq(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [XrateReq]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateXrateReq(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [MidTab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMidTab2(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [TaxReq]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTaxReq(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBDP_PurcDtlModReg p) {
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_purc_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_purc_usr_cd.addAliasName("Dtl.purc_usr_cd", p);
		p.columnDtl_purc_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_purc_usr_nm.addAliasName("Dtl.purc_usr_nm", p);
		p.columnDtl_purc_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_purc_dpt_cd.addAliasName("Dtl.purc_dpt_cd", p);
		p.columnDtl_purc_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_purc_dpt_nm.addAliasName("Dtl.purc_dpt_nm", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$itm_p);
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
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$purc_cont_qty_p);
		p.Dtl_purc_cont_qty_p_PPanel.setName("Dtl.purc_cont_qty_p");
		p.columnDtl_purc_cont_qty = p.Dtl_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnDtl_purc_cont_qty.addAliasName("Dtl.purc_cont_qty", p);
		p.Dtl_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$purc_cont_fctr_p);
		p.Dtl_purc_cont_fctr_p_PPanel.setName("Dtl.purc_cont_fctr_p");
		p.columnDtl_purc_cont_fctr = p.Dtl_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnDtl_purc_cont_fctr.addAliasName("Dtl.purc_cont_fctr", p);
		p.Dtl_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$std_cont_qty_p);
		p.Dtl_std_cont_qty_p_PPanel.setName("Dtl.std_cont_qty_p");
		p.columnDtl_std_cont_qty = p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_std_cont_qty.addAliasName("Dtl.std_cont_qty", p);
		p.Dtl_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$std_cont_fctr_p);
		p.Dtl_std_cont_fctr_p_PPanel.setName("Dtl.std_cont_fctr_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$cont_fctr_unit_p);
		p.Dtl_cont_fctr_unit_p_PPanel.setName("Dtl.cont_fctr_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_cur_upri_p);
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
		p.Dtl_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_cur_proc_upri_p);
		p.Dtl_trd_cur_proc_upri_p_PPanel.setName("Dtl.trd_cur_proc_upri_p");
		p.columnDtl_trd_cur_proc_upri = p.Dtl_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_proc_upri.addAliasName("Dtl.trd_cur_proc_upri", p);
		p.Dtl_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_cur_proc_amt_p);
		p.Dtl_trd_cur_proc_amt_p_PPanel.setName("Dtl.trd_cur_proc_amt_p");
		p.columnDtl_trd_cur_proc_amt = p.Dtl_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_proc_amt.addAliasName("Dtl.trd_cur_proc_amt", p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_cur_onr_prov_upri_p);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl.trd_cur_onr_prov_upri_p");
		p.columnDtl_trd_cur_onr_prov_upri = p.Dtl_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_trd_cur_onr_prov_upri.addAliasName("Dtl.trd_cur_onr_prov_upri", p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$trd_cur_onr_prov_amt_p);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl.trd_cur_onr_prov_amt_p");
		p.columnDtl_trd_cur_onr_prov_amt = p.Dtl_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_trd_cur_onr_prov_amt.addAliasName("Dtl.trd_cur_onr_prov_amt", p);
		p.Dtl_old_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$old_trd_cur_upri_p);
		p.Dtl_old_trd_cur_upri_p_PPanel.setName("Dtl.old_trd_cur_upri_p");
		p.columnDtl_old_trd_cur_upri = p.Dtl_old_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_upri.addAliasName("Dtl.old_trd_cur_upri", p);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$old_trd_cur_proc_upri_p);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.setName("Dtl.old_trd_cur_proc_upri_p");
		p.columnDtl_old_trd_cur_proc_upri = p.Dtl_old_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_proc_upri.addAliasName("Dtl.old_trd_cur_proc_upri", p);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$old_trd_cur_onr_prov_upri_p);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl.old_trd_cur_onr_prov_upri_p");
		p.columnDtl_old_trd_cur_onr_prov_upri = p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_old_trd_cur_onr_prov_upri.addAliasName("Dtl.old_trd_cur_onr_prov_upri", p);
		p.Dtl_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$xrate_p);
		p.Dtl_xrate_p_PPanel.setName("Dtl.xrate_p");
		p.columnDtl_xrate = p.Dtl_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_xrate.addAliasName("Dtl.xrate", p);
		p.Dtl_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_upri_p);
		p.Dtl_base_cur_upri_p_PPanel.setName("Dtl.base_cur_upri_p");
		p.columnDtl_base_cur_upri = p.Dtl_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_upri.addAliasName("Dtl.base_cur_upri", p);
		p.Dtl_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_amt_p);
		p.Dtl_base_cur_amt_p_PPanel.setName("Dtl.base_cur_amt_p");
		p.columnDtl_base_cur_amt = p.Dtl_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_amt.addAliasName("Dtl.base_cur_amt", p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_inc_tax_amt_p);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.setName("Dtl.base_cur_inc_tax_amt_p");
		p.columnDtl_base_cur_inc_tax_amt = p.Dtl_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_inc_tax_amt.addAliasName("Dtl.base_cur_inc_tax_amt", p);
		p.Dtl_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_tax_amt_p);
		p.Dtl_base_cur_tax_amt_p_PPanel.setName("Dtl.base_cur_tax_amt_p");
		p.columnDtl_base_cur_tax_amt = p.Dtl_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_tax_amt.addAliasName("Dtl.base_cur_tax_amt", p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_dscnt_amt_p);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.setName("Dtl.base_cur_dscnt_amt_p");
		p.columnDtl_base_cur_dscnt_amt = p.Dtl_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_dscnt_amt.addAliasName("Dtl.base_cur_dscnt_amt", p);
		p.Dtl_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_proc_upri_p);
		p.Dtl_base_cur_proc_upri_p_PPanel.setName("Dtl.base_cur_proc_upri_p");
		p.columnDtl_base_cur_proc_upri = p.Dtl_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_proc_upri.addAliasName("Dtl.base_cur_proc_upri", p);
		p.Dtl_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_proc_amt_p);
		p.Dtl_base_cur_proc_amt_p_PPanel.setName("Dtl.base_cur_proc_amt_p");
		p.columnDtl_base_cur_proc_amt = p.Dtl_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_proc_amt.addAliasName("Dtl.base_cur_proc_amt", p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_onr_prov_upri_p);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.setName("Dtl.base_cur_onr_prov_upri_p");
		p.columnDtl_base_cur_onr_prov_upri = p.Dtl_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_base_cur_onr_prov_upri.addAliasName("Dtl.base_cur_onr_prov_upri", p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_cur_onr_prov_amt_p);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.setName("Dtl.base_cur_onr_prov_amt_p");
		p.columnDtl_base_cur_onr_prov_amt = p.Dtl_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_base_cur_onr_prov_amt.addAliasName("Dtl.base_cur_onr_prov_amt", p);
		p.Dtl_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_xrate_p);
		p.Dtl_ptax_xrate_p_PPanel.setName("Dtl.ptax_xrate_p");
		p.columnDtl_ptax_xrate = p.Dtl_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl_ptax_xrate.addAliasName("Dtl.ptax_xrate", p);
		p.Dtl_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_upri_p);
		p.Dtl_ptax_cur_upri_p_PPanel.setName("Dtl.ptax_cur_upri_p");
		p.columnDtl_ptax_cur_upri = p.Dtl_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_upri.addAliasName("Dtl.ptax_cur_upri", p);
		p.Dtl_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_amt_p);
		p.Dtl_ptax_cur_amt_p_PPanel.setName("Dtl.ptax_cur_amt_p");
		p.columnDtl_ptax_cur_amt = p.Dtl_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_amt.addAliasName("Dtl.ptax_cur_amt", p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_inc_tax_amt_p);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl.ptax_cur_inc_tax_amt_p");
		p.columnDtl_ptax_cur_inc_tax_amt = p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_inc_tax_amt.addAliasName("Dtl.ptax_cur_inc_tax_amt", p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_tax_amt_p);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.setName("Dtl.ptax_cur_tax_amt_p");
		p.columnDtl_ptax_cur_tax_amt = p.Dtl_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_tax_amt.addAliasName("Dtl.ptax_cur_tax_amt", p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_dscnt_amt_p);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl.ptax_cur_dscnt_amt_p");
		p.columnDtl_ptax_cur_dscnt_amt = p.Dtl_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_dscnt_amt.addAliasName("Dtl.ptax_cur_dscnt_amt", p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_proc_upri_p);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.setName("Dtl.ptax_cur_proc_upri_p");
		p.columnDtl_ptax_cur_proc_upri = p.Dtl_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_proc_upri.addAliasName("Dtl.ptax_cur_proc_upri", p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_proc_amt_p);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.setName("Dtl.ptax_cur_proc_amt_p");
		p.columnDtl_ptax_cur_proc_amt = p.Dtl_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_proc_amt.addAliasName("Dtl.ptax_cur_proc_amt", p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_onr_prov_upri_p);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl.ptax_cur_onr_prov_upri_p");
		p.columnDtl_ptax_cur_onr_prov_upri = p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl_ptax_cur_onr_prov_upri.addAliasName("Dtl.ptax_cur_onr_prov_upri", p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ptax_cur_onr_prov_amt_p);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl.ptax_cur_onr_prov_amt_p");
		p.columnDtl_ptax_cur_onr_prov_amt = p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl_ptax_cur_onr_prov_amt.addAliasName("Dtl.ptax_cur_onr_prov_amt", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_base_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_trd_unit_qty_p);
		p.Dtl_base_trd_unit_qty_p_PPanel.setName("Dtl.base_trd_unit_qty_p");
		p.columnDtl_base_trd_unit_qty = p.Dtl_base_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_trd_unit_qty.addAliasName("Dtl.base_trd_unit_qty", p);
		p.Dtl_base_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$base_base_unit_qty_p);
		p.Dtl_base_base_unit_qty_p_PPanel.setName("Dtl.base_base_unit_qty_p");
		p.columnDtl_base_base_unit_qty = p.Dtl_base_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_base_unit_qty.addAliasName("Dtl.base_base_unit_qty", p);
		p.Dtl_dlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$dlv_p);
		p.Dtl_dlv_p_PPanel.setName("Dtl.dlv_p");
		p.columnDtl_dlv_cd = p.Dtl_dlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_dlv_cd.addAliasName("Dtl.dlv_cd", p);
		p.columnDtl_dlv_nm = p.Dtl_dlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_dlv_nm.addAliasName("Dtl.dlv_nm", p);
		p.columnDtl_dlv_sundry_flg = p.Dtl_dlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_dlv_sundry_flg.addAliasName("Dtl.dlv_sundry_flg", p);
		p.columnDtl_dlv_show_dt = p.Dtl_dlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_dlv_show_dt.addAliasName("Dtl.dlv_show_dt", p);
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
		p.Dtl_tdlv_p_PPanel = mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$tdlv_p);
		p.Dtl_tdlv_p_PPanel.setName("Dtl.tdlv_p");
		p.columnDtl_tdlv_cd = p.Dtl_tdlv_p_PPanel.columnDlv_bp_cd;
		p.columnDtl_tdlv_cd.addAliasName("Dtl.tdlv_cd", p);
		p.columnDtl_tdlv_nm = p.Dtl_tdlv_p_PPanel.columnDlv_bp_nm;
		p.columnDtl_tdlv_nm.addAliasName("Dtl.tdlv_nm", p);
		p.columnDtl_tdlv_sundry_flg = p.Dtl_tdlv_p_PPanel.columnDlv_dlv_sundry_flg;
		p.columnDtl_tdlv_sundry_flg.addAliasName("Dtl.tdlv_sundry_flg", p);
		p.columnDtl_tdlv_show_dt = p.Dtl_tdlv_p_PPanel.columnDlv_show_dtl;
		p.columnDtl_tdlv_show_dt.addAliasName("Dtl.tdlv_show_dt", p);
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
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$sno_wrk_no_p);
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
		p.Dtl_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$bditm_p);
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
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.columnDtl_rtn_sts_typ_nm = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnDtl_rtn_sts_typ_nm.addAliasName("Dtl.rtn_sts_typ_nm", p);
		p.columnDtl_msg_id = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnDtl_msg_id.addAliasName("Dtl.msg_id", p);
		p.columnDtl_msg = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnDtl_msg.addAliasName("Dtl.msg", p);
		p.Dtl_sppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$sppl_grp_p);
		p.Dtl_sppl_grp_p_PPanel.setName("Dtl.sppl_grp_p");
		p.columnDtl_sppl_grp_cd1 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_sppl_grp_cd1.addAliasName("Dtl.sppl_grp_cd1", p);
		p.columnDtl_sppl_grp_nm1 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_sppl_grp_nm1.addAliasName("Dtl.sppl_grp_nm1", p);
		p.columnDtl_sppl_grp_cd2 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_sppl_grp_cd2.addAliasName("Dtl.sppl_grp_cd2", p);
		p.columnDtl_sppl_grp_nm2 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_sppl_grp_nm2.addAliasName("Dtl.sppl_grp_nm2", p);
		p.columnDtl_sppl_grp_cd3 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_sppl_grp_cd3.addAliasName("Dtl.sppl_grp_cd3", p);
		p.columnDtl_sppl_grp_nm3 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_sppl_grp_nm3.addAliasName("Dtl.sppl_grp_nm3", p);
		p.columnDtl_sppl_grp_cd4 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_sppl_grp_cd4.addAliasName("Dtl.sppl_grp_cd4", p);
		p.columnDtl_sppl_grp_nm4 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_sppl_grp_nm4.addAliasName("Dtl.sppl_grp_nm4", p);
		p.columnDtl_sppl_grp_cd5 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_sppl_grp_cd5.addAliasName("Dtl.sppl_grp_cd5", p);
		p.columnDtl_sppl_grp_nm5 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_sppl_grp_nm5.addAliasName("Dtl.sppl_grp_nm5", p);
		p.columnDtl_sppl_grp_cd6 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_sppl_grp_cd6.addAliasName("Dtl.sppl_grp_cd6", p);
		p.columnDtl_sppl_grp_nm6 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_sppl_grp_nm6.addAliasName("Dtl.sppl_grp_nm6", p);
		p.columnDtl_sppl_grp_cd7 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_sppl_grp_cd7.addAliasName("Dtl.sppl_grp_cd7", p);
		p.columnDtl_sppl_grp_nm7 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_sppl_grp_nm7.addAliasName("Dtl.sppl_grp_nm7", p);
		p.columnDtl_sppl_grp_cd8 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_sppl_grp_cd8.addAliasName("Dtl.sppl_grp_cd8", p);
		p.columnDtl_sppl_grp_nm8 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_sppl_grp_nm8.addAliasName("Dtl.sppl_grp_nm8", p);
		p.columnDtl_sppl_grp_cd9 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_sppl_grp_cd9.addAliasName("Dtl.sppl_grp_cd9", p);
		p.columnDtl_sppl_grp_nm9 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_sppl_grp_nm9.addAliasName("Dtl.sppl_grp_nm9", p);
		p.columnDtl_sppl_grp_cd10 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_sppl_grp_cd10.addAliasName("Dtl.sppl_grp_cd10", p);
		p.columnDtl_sppl_grp_nm10 = p.Dtl_sppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_sppl_grp_nm10.addAliasName("Dtl.sppl_grp_nm10", p);
		p.Dtl_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$asppl_grp_p);
		p.Dtl_asppl_grp_p_PPanel.setName("Dtl.asppl_grp_p");
		p.columnDtl_asppl_grp_cd1 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl_asppl_grp_cd1.addAliasName("Dtl.asppl_grp_cd1", p);
		p.columnDtl_asppl_grp_nm1 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl_asppl_grp_nm1.addAliasName("Dtl.asppl_grp_nm1", p);
		p.columnDtl_asppl_grp_cd2 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl_asppl_grp_cd2.addAliasName("Dtl.asppl_grp_cd2", p);
		p.columnDtl_asppl_grp_nm2 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl_asppl_grp_nm2.addAliasName("Dtl.asppl_grp_nm2", p);
		p.columnDtl_asppl_grp_cd3 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl_asppl_grp_cd3.addAliasName("Dtl.asppl_grp_cd3", p);
		p.columnDtl_asppl_grp_nm3 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl_asppl_grp_nm3.addAliasName("Dtl.asppl_grp_nm3", p);
		p.columnDtl_asppl_grp_cd4 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl_asppl_grp_cd4.addAliasName("Dtl.asppl_grp_cd4", p);
		p.columnDtl_asppl_grp_nm4 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl_asppl_grp_nm4.addAliasName("Dtl.asppl_grp_nm4", p);
		p.columnDtl_asppl_grp_cd5 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl_asppl_grp_cd5.addAliasName("Dtl.asppl_grp_cd5", p);
		p.columnDtl_asppl_grp_nm5 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl_asppl_grp_nm5.addAliasName("Dtl.asppl_grp_nm5", p);
		p.columnDtl_asppl_grp_cd6 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl_asppl_grp_cd6.addAliasName("Dtl.asppl_grp_cd6", p);
		p.columnDtl_asppl_grp_nm6 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl_asppl_grp_nm6.addAliasName("Dtl.asppl_grp_nm6", p);
		p.columnDtl_asppl_grp_cd7 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl_asppl_grp_cd7.addAliasName("Dtl.asppl_grp_cd7", p);
		p.columnDtl_asppl_grp_nm7 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl_asppl_grp_nm7.addAliasName("Dtl.asppl_grp_nm7", p);
		p.columnDtl_asppl_grp_cd8 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl_asppl_grp_cd8.addAliasName("Dtl.asppl_grp_cd8", p);
		p.columnDtl_asppl_grp_nm8 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl_asppl_grp_nm8.addAliasName("Dtl.asppl_grp_nm8", p);
		p.columnDtl_asppl_grp_cd9 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl_asppl_grp_cd9.addAliasName("Dtl.asppl_grp_cd9", p);
		p.columnDtl_asppl_grp_nm9 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl_asppl_grp_nm9.addAliasName("Dtl.asppl_grp_nm9", p);
		p.columnDtl_asppl_grp_cd10 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl_asppl_grp_cd10.addAliasName("Dtl.asppl_grp_cd10", p);
		p.columnDtl_asppl_grp_nm10 = p.Dtl_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl_asppl_grp_nm10.addAliasName("Dtl.asppl_grp_nm10", p);
		p.Dtl_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBD.MSBDP0190.DtlR.$itm_grp_p);
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
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PurcDtlModReg p) {
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
	
	
	/** [Cnd_asppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_asppl_cd_p = null;

	/**
	 * [Cnd_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asppl_cd_ListPutter() {
		if (Cnd_asppl_cd_p == null) {
			Cnd_asppl_cd_p = createCnd_asppl_cd_ListPutter(Cnd_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Cnd_asppl_cd_p;
	}
	
	
	/** [Cnd_bsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_cd_p = null;

	/**
	 * [Cnd_bsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_cd_ListPutter() {
		if (Cnd_bsppl_cd_p == null) {
			Cnd_bsppl_cd_p = createCnd_bsppl_cd_ListPutter(Cnd_bsppl_cd, "bsppl_cd", "bsppl_nm");

		}
		return Cnd_bsppl_cd_p;
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
	
	
	/** [Cnd_purc_src_typ_ListPutter]の定義 */
	private MCListPutter Cnd_purc_src_typ_p = null;

	/**
	 * [Cnd_purc_src_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_src_typ_ListPutter() {
		if (Cnd_purc_src_typ_p == null) {
			Cnd_purc_src_typ_p = createCnd_purc_src_typ_ListPutter(Cnd_purc_src_typ, "purc_src_typ", "purc_src_typ_nm");

		}
		return Cnd_purc_src_typ_p;
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
	
	
	/** [Cnd_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tax_cd_p = null;

	/**
	 * [Cnd_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tax_cd_ListPutter() {
		if (Cnd_tax_cd_p == null) {
			Cnd_tax_cd_p = createCnd_tax_cd_ListPutter(Cnd_tax_cd, "tax_cd", "tax_nm");

		}
		return Cnd_tax_cd_p;
	}
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm","ap_dpt_flg");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
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
	
	
	/** [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_base_cur_cd_p = null;

	/**
	 * [Dtl_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_base_cur_cd_ListPutter() {
		if (Dtl_base_cur_cd_p == null) {
			Dtl_base_cur_cd_p = createDtl_base_cur_cd_ListPutter(columnDtl_base_cur_cd, "base_cur_cd");

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
			Dtl_ptax_cur_cd_p = createDtl_ptax_cur_cd_ListPutter(columnDtl_ptax_cur_cd, "ptax_cur_cd");

		}
		return Dtl_ptax_cur_cd_p;
	}
	
	
	/** [Dtl_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ap_dpt_cd_p = null;

	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_dpt_cd_ListPutter() {
		if (Dtl_ap_dpt_cd_p == null) {
			Dtl_ap_dpt_cd_p = createDtl_ap_dpt_cd_ListPutter(columnDtl_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Dtl_ap_dpt_cd_p;
	}
	
	
	/** [Dtl_tterm_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_tterm_cd1_p = null;

	/**
	 * [Dtl_tterm_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_tterm_cd1_ListPutter() {
		if (Dtl_tterm_cd1_p == null) {
			Dtl_tterm_cd1_p = createDtl_tterm_cd1_ListPutter(columnDtl_tterm_cd1, "tterm_cd1", "tterm_nm1");

		}
		return Dtl_tterm_cd1_p;
	}
	
	
	/** [Dtl_tterm_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_tterm_cd2_p = null;

	/**
	 * [Dtl_tterm_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_tterm_cd2_ListPutter() {
		if (Dtl_tterm_cd2_p == null) {
			Dtl_tterm_cd2_p = createDtl_tterm_cd2_ListPutter(columnDtl_tterm_cd2, "tterm_cd2", "tterm_nm2");

		}
		return Dtl_tterm_cd2_p;
	}
	
	
	/** [Dtl_tterm_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_tterm_cd3_p = null;

	/**
	 * [Dtl_tterm_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_tterm_cd3_ListPutter() {
		if (Dtl_tterm_cd3_p == null) {
			Dtl_tterm_cd3_p = createDtl_tterm_cd3_ListPutter(columnDtl_tterm_cd3, "tterm_cd3", "tterm_nm3");

		}
		return Dtl_tterm_cd3_p;
	}
	
	
	/** [Dtl_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rsn_cd_p = null;

	/**
	 * [Dtl_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsn_cd_ListPutter() {
		if (Dtl_rsn_cd_p == null) {
			Dtl_rsn_cd_p = createDtl_rsn_cd_ListPutter(columnDtl_rsn_cd, "rsn_cd", "purc_rsn_nm");

		}
		return Dtl_rsn_cd_p;
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
	public static MSBDP_PurcDtlModReg create(){
		MSBDP_PurcDtlModReg p = new MSBDP_PurcDtlModReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcDtlModReg create(String name){
		MSBDP_PurcDtlModReg p = new MSBDP_PurcDtlModReg(name);
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
		MSBDP_PurcDtlModReg_MC.jbfInitScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitDispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitSelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitTOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitFold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitSpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitAspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitCnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitIvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitUpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitSubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitCtrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitRPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitBulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitFold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitMidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitUpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitXrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitMidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitTaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitDtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitBtn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbfInitEastBtn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitDispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitSelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitTOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitFold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitSpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitAspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitCnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitIvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitUpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitSubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitCtrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitRPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitBulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitFold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitMidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitUpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitXrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitMidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitTaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitDtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitBtn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.jbInitEastBtn((MSBDP_PurcDtlModReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [DispUnit]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDispUnit(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel = p.beansFactory.createPanel("DispUnit");
		p.DispUnitTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SelectOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSelectOpe(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SelectOpePanel = p.beansFactory.createPanel("SelectOpe");
		p.SelectOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTOP(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.TOPPanel = p.beansFactory.createPanel("TOP");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcDtlModReg p) {
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
	protected static void jbfInitTab1(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpplGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel = p.beansFactory.createPanel("SpplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [AspplGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAspplGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.AspplGrpPanel = p.beansFactory.createPanel("AspplGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_disp_unit_Group = p.beansFactory.createButtonGroup("Cnd.disp_unit");
		p.Cnd_disp_unit_Perti = p.beansFactory.createRadioButton("Cnd.disp_unit_Perti");
		p.Cnd_disp_unit_Dtl = p.beansFactory.createRadioButton("Cnd.disp_unit_Dtl");
		p.Cnd_disp_unit_Hdr = p.beansFactory.createRadioButton("Cnd.disp_unit_Hdr");
		p.Cnd_purc_flg = p.beansFactory.createCheckBox("Cnd.purc_flg");
		p.Cnd_ret_flg = p.beansFactory.createCheckBox("Cnd.ret_flg");
		p.Cnd_dscnt_flg = p.beansFactory.createCheckBox("Cnd.dscnt_flg");
		p.Cnd_iv_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_trgt_flg");
		p.Cnd_iv_not_trgt_flg = p.beansFactory.createCheckBox("Cnd.iv_not_trgt_flg");
		p.Cnd_upri_flg = p.beansFactory.createCheckBox("Cnd.upri_flg");
		p.Cnd_interim_flg = p.beansFactory.createCheckBox("Cnd.interim_flg");
		p.Cnd_subcon_flg = p.beansFactory.createCheckBox("Cnd.subcon_flg");
		p.Cnd_not_subcon_flg = p.beansFactory.createCheckBox("Cnd.not_subcon_flg");
		p.Cnd_purc_dt_from_Label = p.beansFactory.createLabel("Cnd.purc_dt_from_Label");
		p.Cnd_purc_dt_from = p.beansFactory.createDateField("Cnd.purc_dt_from");
		p.Cnd_purc_dt_from.setLabel(p.Cnd_purc_dt_from_Label);
		p.Cnd_purc_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_dt_to_Label");
		p.Cnd_purc_dt_to = p.beansFactory.createDateField("Cnd.purc_dt_to");
		p.Cnd_purc_dt_to.setLabel(p.Cnd_purc_dt_to_Label);
		p.Cnd_ac_ym_from_Label = p.beansFactory.createLabel("Cnd.ac_ym_from_Label");
		p.Cnd_ac_ym_from = p.beansFactory.createDateField("Cnd.ac_ym_from");
		p.Cnd_ac_ym_from.setLabel(p.Cnd_ac_ym_from_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_ac_dt_from_Label = p.beansFactory.createLabel("Cnd.ac_dt_from_Label");
		p.Cnd_ac_dt_from = p.beansFactory.createDateField("Cnd.ac_dt_from");
		p.Cnd_ac_dt_from.setLabel(p.Cnd_ac_dt_from_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
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
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
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
		p.Cnd_asppl_cd_Label = p.beansFactory.createLabel("Cnd.asppl_cd_Label");
		p.Cnd_asppl_cd = p.beansFactory.createTextField("Cnd.asppl_cd");
		p.Cnd_asppl_cd.setLabel(p.Cnd_asppl_cd_Label);
		p.Cnd_asppl_nm = p.beansFactory.createTextField("Cnd.asppl_nm");
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
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
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_sppl_itm_cd_Label = p.beansFactory.createLabel("Cnd.sppl_itm_cd_Label");
		p.Cnd_sppl_itm_cd = p.beansFactory.createTextField("Cnd.sppl_itm_cd");
		p.Cnd_sppl_itm_cd.setLabel(p.Cnd_sppl_itm_cd_Label);
		p.Cnd_sppl_itm_nm = p.beansFactory.createTextField("Cnd.sppl_itm_nm");
		p.Cnd_cst_itm_cd_Label = p.beansFactory.createLabel("Cnd.cst_itm_cd_Label");
		p.Cnd_cst_itm_cd = p.beansFactory.createTextField("Cnd.cst_itm_cd");
		p.Cnd_cst_itm_cd.setLabel(p.Cnd_cst_itm_cd_Label);
		p.Cnd_cst_itm_nm = p.beansFactory.createTextField("Cnd.cst_itm_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_d_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_d_no_Label");
		p.Cnd_rcpt_iv_d_no = p.beansFactory.createTextField("Cnd.rcpt_iv_d_no");
		p.Cnd_rcpt_iv_d_no.setLabel(p.Cnd_rcpt_iv_d_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_po_d_no_Label = p.beansFactory.createLabel("Cnd.po_d_no_Label");
		p.Cnd_po_d_no = p.beansFactory.createTextField("Cnd.po_d_no");
		p.Cnd_po_d_no.setLabel(p.Cnd_po_d_no_Label);
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_purc_act_d_no_Label = p.beansFactory.createLabel("Cnd.purc_act_d_no_Label");
		p.Cnd_purc_act_d_no = p.beansFactory.createTextField("Cnd.purc_act_d_no");
		p.Cnd_purc_act_d_no.setLabel(p.Cnd_purc_act_d_no_Label);
		p.Cnd_purc_src_typ_Label = p.beansFactory.createLabel("Cnd.purc_src_typ_Label");
		p.Cnd_purc_src_typ = p.beansFactory.createTextComboBox("Cnd.purc_src_typ");
		p.Cnd_purc_src_typ.setLabel(p.Cnd_purc_src_typ_Label);
		p.Cnd_purc_src_typ_nm = p.beansFactory.createTextField("Cnd.purc_src_typ_nm");
		p.Cnd_purc_src_no_Label = p.beansFactory.createLabel("Cnd.purc_src_no_Label");
		p.Cnd_purc_src_no = p.beansFactory.createTextField("Cnd.purc_src_no");
		p.Cnd_purc_src_no.setLabel(p.Cnd_purc_src_no_Label);
		p.Cnd_arr_act_no_Label = p.beansFactory.createLabel("Cnd.arr_act_no_Label");
		p.Cnd_arr_act_no = p.beansFactory.createTextField("Cnd.arr_act_no");
		p.Cnd_arr_act_no.setLabel(p.Cnd_arr_act_no_Label);
		p.Cnd_purc_ret_act_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_act_no_Label");
		p.Cnd_purc_ret_act_no = p.beansFactory.createTextField("Cnd.purc_ret_act_no");
		p.Cnd_purc_ret_act_no.setLabel(p.Cnd_purc_ret_act_no_Label);
		p.Cnd_purc_ret_act_d_no_Label = p.beansFactory.createLabel("Cnd.purc_ret_act_d_no_Label");
		p.Cnd_purc_ret_act_d_no = p.beansFactory.createTextField("Cnd.purc_ret_act_d_no");
		p.Cnd_purc_ret_act_d_no.setLabel(p.Cnd_purc_ret_act_d_no_Label);
		p.Cnd_edi_bp_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.edi_bp_dlv_slip_no_Label");
		p.Cnd_edi_bp_dlv_slip_no = p.beansFactory.createTextField("Cnd.edi_bp_dlv_slip_no");
		p.Cnd_edi_bp_dlv_slip_no.setLabel(p.Cnd_edi_bp_dlv_slip_no_Label);
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_foreign_flg = p.beansFactory.createCheckBox("Cnd.foreign_flg");
		p.Cnd_tax_cd_Label = p.beansFactory.createLabel("Cnd.tax_cd_Label");
		p.Cnd_tax_cd = p.beansFactory.createTextComboBox("Cnd.tax_cd");
		p.Cnd_tax_cd.setLabel(p.Cnd_tax_cd_Label);
		p.Cnd_tax_nm = p.beansFactory.createTextField("Cnd.tax_nm");
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_dtl_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_trd_d_rmrks_Label");
		p.Cnd_dtl_trd_d_rmrks = p.beansFactory.createTextField("Cnd.dtl_trd_d_rmrks");
		p.Cnd_dtl_trd_d_rmrks.setLabel(p.Cnd_dtl_trd_d_rmrks_Label);
		p.Cnd_dtl_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.dtl_intr_rmrks_Label");
		p.Cnd_dtl_intr_rmrks = p.beansFactory.createTextField("Cnd.dtl_intr_rmrks");
		p.Cnd_dtl_intr_rmrks.setLabel(p.Cnd_dtl_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_dtl_sub_char1_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char1_Label");
		p.Cnd_dtl_sub_char1 = p.beansFactory.createTextField("Cnd.dtl_sub_char1");
		p.Cnd_dtl_sub_char1.setLabel(p.Cnd_dtl_sub_char1_Label);
		p.Cnd_dtl_sub_char2_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char2_Label");
		p.Cnd_dtl_sub_char2 = p.beansFactory.createTextField("Cnd.dtl_sub_char2");
		p.Cnd_dtl_sub_char2.setLabel(p.Cnd_dtl_sub_char2_Label);
		p.Cnd_dtl_sub_char3_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char3_Label");
		p.Cnd_dtl_sub_char3 = p.beansFactory.createTextField("Cnd.dtl_sub_char3");
		p.Cnd_dtl_sub_char3.setLabel(p.Cnd_dtl_sub_char3_Label);
		p.Cnd_dis_can_disp_flg = p.beansFactory.createCheckBox("Cnd.dis_can_disp_flg");
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
		p.Cnd_incl_temp_ap_flg = p.beansFactory.createCheckBox("Cnd.incl_temp_ap_flg");
		p.Cnd_sign_rev_flg = p.beansFactory.createCheckBox("Cnd.sign_rev_flg");
	}

	/**
	 * [IvTrgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitIvTrgt(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.IvTrgtPanel = p.beansFactory.createPanel("IvTrgt");
		p.IvTrgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [UpriSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriSts(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.UpriStsPanel = p.beansFactory.createPanel("UpriSts");
		p.UpriStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SubconSts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSubconSts(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SubconStsPanel = p.beansFactory.createPanel("SubconSts");
		p.SubconStsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold2(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.Fold2Panel = p.beansFactory.createPanel("Fold2");
		p.Fold2Tab = p.beansFactory.createTabbedPane("Fold2.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [MidTab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMidTab1(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.MidTab1Panel = p.beansFactory.createPanel("MidTab1");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriReq]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitUpriReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.UpriReqPanel = p.beansFactory.createPanel("UpriReq");
		p.UpriReqTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.UpriReq_upri_dt_Label = p.beansFactory.createLabel("UpriReq.upri_dt_Label");
		p.UpriReq_upri_dt = p.beansFactory.createDateField("UpriReq.upri_dt");
		p.UpriReq_upri_dt.setLabel(p.UpriReq_upri_dt_Label);
		p.UpriReq_uprireq = p.beansFactory.createButton("UpriReq.uprireq");
		p.UpriReq_label_interim_flg = p.beansFactory.createLabel("UpriReq.label_interim_flg");
		p.UpriReq_tag_flg = p.beansFactory.createButton("UpriReq.tag_flg", "no_border");
		p.UpriReq_not_tag_flg = p.beansFactory.createButton("UpriReq.not_tag_flg", "no_border");
	}

	/**
	 * [XrateReq]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitXrateReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.XrateReqPanel = p.beansFactory.createPanel("XrateReq");
		p.XrateReqTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.XrateReq_xrate_dt_Label = p.beansFactory.createLabel("XrateReq.xrate_dt_Label");
		p.XrateReq_xrate_dt = p.beansFactory.createDateField("XrateReq.xrate_dt");
		p.XrateReq_xrate_dt.setLabel(p.XrateReq_xrate_dt_Label);
		p.XrateReq_xratereq = p.beansFactory.createButton("XrateReq.xratereq");
	}

	/**
	 * [MidTab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMidTab2(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.MidTab2Panel = p.beansFactory.createPanel("MidTab2");
		// ブロックの項目の初期化
	}

	/**
	 * [TaxReq]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTaxReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.TaxReqPanel = p.beansFactory.createPanel("TaxReq");
		p.TaxReqTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.TaxReq_tax_dt_Label = p.beansFactory.createLabel("TaxReq.tax_dt_Label");
		p.TaxReq_tax_dt = p.beansFactory.createDateField("TaxReq.tax_dt");
		p.TaxReq_tax_dt.setLabel(p.TaxReq_tax_dt_Label);
		p.TaxReq_taxreq = p.beansFactory.createButton("TaxReq.taxreq");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_purc_dt = p.beansFactory.createTableColumn("Dtl.purc_dt", MCColumnType.DATE);
		p.columnDtl_ac_ym = p.beansFactory.createTableColumn("Dtl.ac_ym", MCColumnType.DATE);
		p.columnDtl_ac_dt = p.beansFactory.createTableColumn("Dtl.ac_dt", MCColumnType.DATE);
		p.columnDtl_purc_cl_ym = p.beansFactory.createTableColumn("Dtl.purc_cl_ym", MCColumnType.DATE);
		p.columnDtl_pay_basis_dt = p.beansFactory.createTableColumn("Dtl.pay_basis_dt", MCColumnType.DATE);
		p.columnDtl_pay_schd_dt = p.beansFactory.createTableColumn("Dtl.pay_schd_dt", MCColumnType.DATE);
		p.columnDtl_arr_dt = p.beansFactory.createTableColumn("Dtl.arr_dt", MCColumnType.DATE);
		p.columnDtl_arr_hm = p.beansFactory.createTableColumn("Dtl.arr_hm", MCColumnType.DATE);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_flg = p.beansFactory.createTableColumn("Dtl.ap_dpt_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dpt_wg_cd = p.beansFactory.createTableColumn("Dtl.purc_dpt_wg_cd", MCColumnType.TEXT);
		p.columnDtl_purc_dpt_wg_nm = p.beansFactory.createTableColumn("Dtl.purc_dpt_wg_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.trd_cur_cd", MCColumnType.TEXT);
		p.columnDtl_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_wtax_amt = p.beansFactory.createTableColumn("Dtl.wtax_amt", MCColumnType.NUMBER);
		p.columnDtl_wtax_rnd_typ = p.beansFactory.createTableColumn("Dtl.wtax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ", MCColumnType.TEXT);
		p.columnDtl_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_dt = p.beansFactory.createTableColumn("Dtl.po_dt", MCColumnType.DATE);
		p.columnDtl_dlv_rqst_dt = p.beansFactory.createTableColumn("Dtl.dlv_rqst_dt", MCColumnType.DATE);
		p.columnDtl_dlv_rqst_hm = p.beansFactory.createTableColumn("Dtl.dlv_rqst_hm", MCColumnType.DATE);
		p.columnDtl_purc_schd_dt = p.beansFactory.createTableColumn("Dtl.purc_schd_dt", MCColumnType.DATE);
		p.columnDtl_base_cur_cd = p.beansFactory.createTableColumn("Dtl.base_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_base_cur_nm = p.beansFactory.createTableColumn("Dtl.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl.ptax_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_ptax_dt = p.beansFactory.createTableColumn("Dtl.ptax_dt", MCColumnType.DATE);
		p.columnDtl_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_purc_typ = p.beansFactory.createTableColumn("Dtl.purc_typ", MCColumnType.TEXT);
		p.columnDtl_purc_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl.in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd = p.beansFactory.createTableColumn("Dtl.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_nm = p.beansFactory.createTableColumn("Dtl.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Dtl.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnDtl_outsrc_sppl_cd = p.beansFactory.createTableColumn("Dtl.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_xrate_cd = p.beansFactory.createTableColumn("Dtl.xrate_cd", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_ret_sppl_nm = p.beansFactory.createTableColumn("Dtl.ret_sppl_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cal_cd = p.beansFactory.createTableColumn("Dtl.sppl_cal_cd", MCColumnType.TEXT);
		p.columnDtl_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_purc_tax_calc_typ = p.beansFactory.createTableColumn("Dtl.purc_tax_calc_typ", MCColumnType.TEXT);
		p.columnDtl_pay_spot_flg = p.beansFactory.createTableColumn("Dtl.pay_spot_flg", MCColumnType.CHECK);
		p.columnDtl_sppl_iv_flg = p.beansFactory.createTableColumn("Dtl.sppl_iv_flg", MCColumnType.CHECK);
		p.columnDtl_base_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.base_trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.base_trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_trd_cur_cd = p.beansFactory.createTableColumn("Dtl.base_trd_cur_cd", MCColumnType.TEXT);
		p.columnDtl_base_trd_cur_nm = p.beansFactory.createTableColumn("Dtl.base_trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl_base_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.base_in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_base_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl.base_in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_base_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl.base_in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl_base_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl.base_in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl_sbst_dt = p.beansFactory.createTableColumn("Dtl.sbst_dt", MCColumnType.DATE);
		p.columnDtl_base_dt = p.beansFactory.createTableColumn("Dtl.base_dt", MCColumnType.DATE);
		p.columnDtl_base_tax_cd = p.beansFactory.createTableColumn("Dtl.base_tax_cd", MCColumnType.TEXT);
		p.columnDtl_base_tax_nm = p.beansFactory.createTableColumn("Dtl.base_tax_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_outsrc_itm_ord_no = p.beansFactory.createTableColumn("Dtl.outsrc_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl_rqst_avl_rqst_dt = p.beansFactory.createTableColumn("Dtl.rqst_avl_rqst_dt", MCColumnType.DATE);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_asppl_cd = p.beansFactory.createTableColumn("Dtl.asppl_cd", MCColumnType.TEXT);
		p.columnDtl_asppl_nm = p.beansFactory.createTableColumn("Dtl.asppl_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_mst_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.mst_ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bsppl_cd = p.beansFactory.createTableColumn("Dtl.bsppl_cd", MCColumnType.TEXT);
		p.columnDtl_bsppl_nm = p.beansFactory.createTableColumn("Dtl.bsppl_nm", MCColumnType.TEXT);
		p.columnDtl_bp_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_no = p.beansFactory.createTableColumn("Dtl.purc_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_seq = p.beansFactory.createTableColumn("Dtl.purc_act_seq", MCColumnType.NUMBER);
		p.columnDtl_purc_act_rev = p.beansFactory.createTableColumn("Dtl.purc_act_rev", MCColumnType.NUMBER);
		p.columnDtl_purc_act_d_no = p.beansFactory.createTableColumn("Dtl.purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_seq = p.beansFactory.createTableColumn("Dtl.purc_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl_purc_act_io_no = p.beansFactory.createTableColumn("Dtl.purc_act_io_no", MCColumnType.TEXT);
		p.columnDtl_base_purc_ac_dt = p.beansFactory.createTableColumn("Dtl.base_purc_ac_dt", MCColumnType.DATE);
		p.columnDtl_purc_src_typ = p.beansFactory.createTableColumn("Dtl.purc_src_typ", MCColumnType.TEXT);
		p.columnDtl_purc_src_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_src_no = p.beansFactory.createTableColumn("Dtl.purc_src_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_po_d_no = p.beansFactory.createTableColumn("Dtl.po_d_no", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_rcpt_iv_no = p.beansFactory.createTableColumn("Dtl.rcpt_iv_no", MCColumnType.TEXT);
		p.columnDtl_rcpt_iv_d_no = p.beansFactory.createTableColumn("Dtl.rcpt_iv_d_no", MCColumnType.TEXT);
		p.columnDtl_ref_rcpt_iv_no = p.beansFactory.createTableColumn("Dtl.ref_rcpt_iv_no", MCColumnType.TEXT);
		p.columnDtl_purc_schd_no = p.beansFactory.createTableColumn("Dtl.purc_schd_no", MCColumnType.TEXT);
		p.columnDtl_arr_act_no = p.beansFactory.createTableColumn("Dtl.arr_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_ret_act_no = p.beansFactory.createTableColumn("Dtl.purc_ret_act_no", MCColumnType.TEXT);
		p.columnDtl_purc_ret_act_rev = p.beansFactory.createTableColumn("Dtl.purc_ret_act_rev", MCColumnType.NUMBER);
		p.columnDtl_purc_ret_act_d_no = p.beansFactory.createTableColumn("Dtl.purc_ret_act_d_no", MCColumnType.TEXT);
		p.columnDtl_purc_ret_act_io_no = p.beansFactory.createTableColumn("Dtl.purc_ret_act_io_no", MCColumnType.TEXT);
		p.columnDtl_bp_lot_no = p.beansFactory.createTableColumn("Dtl.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl_ncv_flg = p.beansFactory.createTableColumn("Dtl.ncv_flg", MCColumnType.CHECK);
		p.columnDtl_edi_flg = p.beansFactory.createTableColumn("Dtl.edi_flg", MCColumnType.CHECK);
		p.columnDtl_sync_flg = p.beansFactory.createTableColumn("Dtl.sync_flg", MCColumnType.CHECK);
		p.columnDtl_temp_ap_flg = p.beansFactory.createTableColumn("Dtl.temp_ap_flg", MCColumnType.CHECK);
		p.columnDtl_accpt_dfct_flg = p.beansFactory.createTableColumn("Dtl.accpt_dfct_flg", MCColumnType.CHECK);
		p.columnDtl_re_arr_flg = p.beansFactory.createTableColumn("Dtl.re_arr_flg", MCColumnType.CHECK);
		p.columnDtl_tterm_cd1 = p.beansFactory.createTableColumn("Dtl.tterm_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_tterm_nm1 = p.beansFactory.createTableColumn("Dtl.tterm_nm1", MCColumnType.TEXT);
		p.columnDtl_tterm_rmrks1 = p.beansFactory.createTableColumn("Dtl.tterm_rmrks1", MCColumnType.TEXT);
		p.columnDtl_tterm_cd2 = p.beansFactory.createTableColumn("Dtl.tterm_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_tterm_nm2 = p.beansFactory.createTableColumn("Dtl.tterm_nm2", MCColumnType.TEXT);
		p.columnDtl_tterm_rmrks2 = p.beansFactory.createTableColumn("Dtl.tterm_rmrks2", MCColumnType.TEXT);
		p.columnDtl_tterm_cd3 = p.beansFactory.createTableColumn("Dtl.tterm_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_tterm_nm3 = p.beansFactory.createTableColumn("Dtl.tterm_nm3", MCColumnType.TEXT);
		p.columnDtl_tterm_rmrks3 = p.beansFactory.createTableColumn("Dtl.tterm_rmrks3", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no = p.beansFactory.createTableColumn("Dtl.lot_no", MCColumnType.TEXT);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT);
		p.columnDtl_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_not_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl.not_xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dscnt_loc_mng_typ = p.beansFactory.createTableColumn("Dtl.purc_dscnt_loc_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_purc_act_sub_char1 = p.beansFactory.createTableColumn("Dtl.purc_act_sub_char1", MCColumnType.TEXT);
		p.columnDtl_purc_act_sub_char2 = p.beansFactory.createTableColumn("Dtl.purc_act_sub_char2", MCColumnType.TEXT);
		p.columnDtl_purc_act_sub_char3 = p.beansFactory.createTableColumn("Dtl.purc_act_sub_char3", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_sub_char1 = p.beansFactory.createTableColumn("Dtl.purc_act_d_sub_char1", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_sub_char2 = p.beansFactory.createTableColumn("Dtl.purc_act_d_sub_char2", MCColumnType.TEXT);
		p.columnDtl_purc_act_d_sub_char3 = p.beansFactory.createTableColumn("Dtl.purc_act_d_sub_char3", MCColumnType.TEXT);
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
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_hdr_edit_flg = p.beansFactory.createTableColumn("Dtl.hdr_edit_flg", MCColumnType.CHECK);
		p.columnDtl_purc_upd_cntr = p.beansFactory.createTableColumn("Dtl.purc_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_purc_ret_upd_cntr = p.beansFactory.createTableColumn("Dtl.purc_ret_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_xrate_base_dt = p.beansFactory.createTableColumn("Dtl.xrate_base_dt", MCColumnType.DATE);
		p.columnDtl_tax_base_dt = p.beansFactory.createTableColumn("Dtl.tax_base_dt", MCColumnType.DATE);
		p.columnDtl_purc_ret_dt = p.beansFactory.createTableColumn("Dtl.purc_ret_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_dtl = p.beansFactory.createButton("Btn.open_dtl", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcDtlModReg p) {
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
	protected static void jbInitDispUnit(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.DispUnitPanel.setBorder(p.DispUnitTitledBorder);
		p.add(p.DispUnitPanel);
		p.DispUnitPanel.setNextBeans(p.SelectOpePanel);
		p.DispUnitPanel.setValueCheck(false);
		p.DispUnitPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.DispUnitPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SelectOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSelectOpe(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SelectOpePanel.setBorder(p.SelectOpeTitledBorder);
		p.add(p.SelectOpePanel);
		p.SelectOpePanel.setNextBeans(p.TOPPanel);
		p.SelectOpePanel.setValueCheck(false);
		p.SelectOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SelectOpePanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [TOP]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTOP(MSBDP_PurcDtlModReg p) {
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
	protected static void jbInitFold(MSBDP_PurcDtlModReg p) {
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
		p.SpplGrpPanel.setNextBeans(p.AspplGrpPanel);
		p.FoldTab.add(p.AspplGrpPanel, "Fold.tab3");
		p.AspplGrpPanel.setNextBeans(p.ItmGrpPanel);
		p.FoldTab.add(p.ItmGrpPanel, "Fold.tab4");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.SpplGrpPanel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.IvTrgtPanel, null);
		p.Tab1Panel.setLastBeans(p.IvTrgtPanel);
		p.IvTrgtPanel.setNextBeans(p.UpriStsPanel);
		p.Tab1Panel.add(p.UpriStsPanel, null);
		p.UpriStsPanel.setNextBeans(p.SubconStsPanel);
		p.Tab1Panel.add(p.SubconStsPanel, null);
		p.SubconStsPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [SpplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpplGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SpplGrpPanel.setNextBeans(p.AspplGrpPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [AspplGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAspplGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.AspplGrpPanel.setNextBeans(p.ItmGrpPanel);
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBDP_PurcDtlModReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ope_META);
		p.DispUnitPanel.setLastBeans(p.Cnd_disp_unit_Group);
		p.Cnd_disp_unit_Group.setFirstBeans(p.Cnd_disp_unit_Perti);
		p.Cnd_disp_unit_Perti.setActionCommand("0");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Perti);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Perti);
		p.Cnd_disp_unit_Perti.setNextBeans(p.Cnd_disp_unit_Dtl);
		p.Cnd_disp_unit_Dtl.setActionCommand("1");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Dtl);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Dtl);
		p.Cnd_disp_unit_Dtl.setNextBeans(p.Cnd_disp_unit_Hdr);
		p.Cnd_disp_unit_Hdr.setActionCommand("2");
		p.Cnd_disp_unit_Group.add(p.Cnd_disp_unit_Hdr);
		p.DispUnitPanel.add(p.Cnd_disp_unit_Hdr);
		p.Cnd_disp_unit_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.disp_unit_META);
		p.SelectOpePanel.add(p.Cnd_purc_flg);
		p.SelectOpePanel.setLastBeans(p.Cnd_purc_flg);
		p.Cnd_purc_flg.setNextBeans(p.Cnd_ret_flg);
		p.Cnd_purc_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_flg_META);
		p.SelectOpePanel.add(p.Cnd_ret_flg);
		p.Cnd_ret_flg.setNextBeans(p.Cnd_dscnt_flg);
		p.Cnd_ret_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ret_flg_META);
		p.SelectOpePanel.add(p.Cnd_dscnt_flg);
		p.Cnd_dscnt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dscnt_flg_META);
		p.IvTrgtPanel.add(p.Cnd_iv_trgt_flg);
		p.IvTrgtPanel.setLastBeans(p.Cnd_iv_trgt_flg);
		p.Cnd_iv_trgt_flg.setNextBeans(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.iv_trgt_flg_META);
		p.IvTrgtPanel.add(p.Cnd_iv_not_trgt_flg);
		p.Cnd_iv_not_trgt_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.iv_not_trgt_flg_META);
		p.UpriStsPanel.add(p.Cnd_upri_flg);
		p.UpriStsPanel.setLastBeans(p.Cnd_upri_flg);
		p.Cnd_upri_flg.setNextBeans(p.Cnd_interim_flg);
		p.Cnd_upri_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.upri_flg_META);
		p.UpriStsPanel.add(p.Cnd_interim_flg);
		p.Cnd_interim_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.interim_flg_META);
		p.SubconStsPanel.add(p.Cnd_subcon_flg);
		p.SubconStsPanel.setLastBeans(p.Cnd_subcon_flg);
		p.Cnd_subcon_flg.setNextBeans(p.Cnd_not_subcon_flg);
		p.Cnd_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.subcon_flg_META);
		p.SubconStsPanel.add(p.Cnd_not_subcon_flg);
		p.Cnd_not_subcon_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.not_subcon_flg_META);
		p.CndPanel.add(p.Cnd_purc_dt_from_Label);
		p.CndPanel.add(p.Cnd_purc_dt_from);
		p.CndPanel.setLastBeans(p.Cnd_purc_dt_from);
		p.Cnd_purc_dt_from.setNextBeans(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_from.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_dt_from_META);
		p.Cnd_purc_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_purc_dt_to_Label);
		p.CndPanel.add(p.Cnd_purc_dt_to);
		p.Cnd_purc_dt_to.setNextBeans(p.Cnd_ac_ym_from);
		p.Cnd_purc_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_dt_to_META);
		p.Cnd_purc_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_from_Label);
		p.CndPanel.add(p.Cnd_ac_ym_from);
		p.Cnd_ac_ym_from.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_from.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ac_ym_from_META);
		p.Cnd_ac_ym_from.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ac_dt_from);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_from_Label);
		p.CndPanel.add(p.Cnd_ac_dt_from);
		p.Cnd_ac_dt_from.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_from.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ac_dt_from_META);
		p.Cnd_ac_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_arr_dt_p_PPanel);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_arr_dt_p_PPanel);
		p.Cnd_arr_dt_p_PPanel.setNextBeans(p.Cnd_sppl_cd);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_in_to_loc_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_in_to_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_loc_wg_cd, true);
		p.Cnd_in_to_loc_wg_cd.setLinkBeans(p.Cnd_in_to_loc_wg_nm);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_cd);
		p.Cnd_in_to_loc_wg_cd.setNextBeans(p.Cnd_in_to_loc_wg_nm);
		p.Cnd_in_to_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.in_to_loc_wg_cd_META);
		p.CndPanel.add(p.Cnd_in_to_loc_wg_nm);
		p.Cnd_in_to_loc_wg_nm.setNextBeans(p.Cnd_in_to_loc_cd);
		p.Cnd_in_to_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.in_to_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_in_to_loc_wg_nm, true);
		p.CndPanel.add(p.Cnd_in_to_loc_cd_Label);
		p.CndPanel.add(p.Cnd_in_to_loc_cd);
		p.Cnd_in_to_loc_cd.setNextBeans(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.in_to_loc_cd_META);
		p.Cnd_in_to_loc_cd.addLinkBeans(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_in_to_loc_cd, true);
		p.CndPanel.add(p.Cnd_in_to_loc_nm);
		p.Cnd_in_to_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_in_to_loc_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.in_to_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_in_to_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_dlv_cd_Label);
		p.CndPanel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.CndPanel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_tdlv_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.CndPanel.add(p.Cnd_tdlv_cd_Label);
		p.CndPanel.add(p.Cnd_tdlv_cd);
		p.Cnd_tdlv_cd.setNextBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.tdlv_cd_META);
		p.Cnd_tdlv_cd.addLinkBeans(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tdlv_cd, true);
		p.CndPanel.add(p.Cnd_tdlv_nm);
		p.Cnd_tdlv_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_tdlv_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.tdlv_nm_META);
		p.setPluralValueEnable(p.Cnd_tdlv_nm, true);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_purc_usr_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_purc_usr_cd_Label);
		p.CndPanel.add(p.Cnd_purc_usr_cd);
		p.Cnd_purc_usr_cd.setNextBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_usr_cd_META);
		p.Cnd_purc_usr_cd.addLinkBeans(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_usr_cd, true);
		p.CndPanel.add(p.Cnd_purc_usr_nm);
		p.Cnd_purc_usr_nm.setNextBeans(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_usr_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_usr_nm, true);
		p.CndPanel.add(p.Cnd_purc_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_purc_dpt_cd);
		p.Cnd_purc_dpt_cd.setNextBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_dpt_cd_META);
		p.Cnd_purc_dpt_cd.addLinkBeans(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_dpt_cd, true);
		p.CndPanel.add(p.Cnd_purc_dpt_nm);
		p.Cnd_purc_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_maker_cd);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_sppl_itm_cd);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.CndPanel.add(p.Cnd_sppl_itm_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_itm_cd);
		p.Cnd_sppl_itm_cd.setNextBeans(p.Cnd_sppl_itm_nm);
		p.Cnd_sppl_itm_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sppl_itm_cd_META);
		p.CndPanel.add(p.Cnd_sppl_itm_nm);
		p.Cnd_sppl_itm_nm.setNextBeans(p.Cnd_cst_itm_cd);
		p.Cnd_sppl_itm_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sppl_itm_nm_META);
		p.CndPanel.add(p.Cnd_cst_itm_cd_Label);
		p.CndPanel.add(p.Cnd_cst_itm_cd);
		p.Cnd_cst_itm_cd.setNextBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.cst_itm_cd_META);
		p.Cnd_cst_itm_cd.addLinkBeans(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_itm_cd, true);
		p.CndPanel.add(p.Cnd_cst_itm_nm);
		p.Cnd_cst_itm_nm.setNextBeans(p.Cnd_lot_no);
		p.Cnd_cst_itm_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.cst_itm_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_itm_nm, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.lot_no_META);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_trd_cd);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.bp_lot_no_META);
		p.setPluralValueEnable(p.Cnd_bp_lot_no, true);
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_d_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_d_no);
		p.Cnd_rcpt_iv_d_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_rcpt_iv_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.rcpt_iv_d_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_d_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_po_d_no);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_po_d_no_Label);
		p.CndPanel.add(p.Cnd_po_d_no);
		p.Cnd_po_d_no.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_po_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.po_d_no_META);
		p.setPluralValueEnable(p.Cnd_po_d_no, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_purc_act_d_no);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_purc_act_d_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_d_no);
		p.Cnd_purc_act_d_no.setNextBeans(p.Cnd_purc_src_typ);
		p.Cnd_purc_act_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_d_no, true);
		p.Cnd_purc_src_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_src_typ, true);
		p.Cnd_purc_src_typ.setLinkBeans(p.Cnd_purc_src_typ_nm);
		p.CndPanel.add(p.Cnd_purc_src_typ_Label);
		p.CndPanel.add(p.Cnd_purc_src_typ);
		p.Cnd_purc_src_typ.setNextBeans(p.Cnd_purc_src_typ_nm);
		p.Cnd_purc_src_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_src_typ_META);
		p.CndPanel.add(p.Cnd_purc_src_typ_nm);
		p.Cnd_purc_src_typ_nm.setNextBeans(p.Cnd_purc_src_no);
		p.Cnd_purc_src_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_src_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_src_typ_nm, true);
		p.CndPanel.add(p.Cnd_purc_src_no_Label);
		p.CndPanel.add(p.Cnd_purc_src_no);
		p.Cnd_purc_src_no.setNextBeans(p.Cnd_arr_act_no);
		p.Cnd_purc_src_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_src_no_META);
		p.setPluralValueEnable(p.Cnd_purc_src_no, true);
		p.CndPanel.add(p.Cnd_arr_act_no_Label);
		p.CndPanel.add(p.Cnd_arr_act_no);
		p.Cnd_arr_act_no.setNextBeans(p.Cnd_purc_ret_act_no);
		p.Cnd_arr_act_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.arr_act_no_META);
		p.setPluralValueEnable(p.Cnd_arr_act_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_act_no);
		p.Cnd_purc_ret_act_no.setNextBeans(p.Cnd_purc_ret_act_d_no);
		p.Cnd_purc_ret_act_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_ret_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_act_no, true);
		p.CndPanel.add(p.Cnd_purc_ret_act_d_no_Label);
		p.CndPanel.add(p.Cnd_purc_ret_act_d_no);
		p.Cnd_purc_ret_act_d_no.setNextBeans(p.Cnd_edi_bp_dlv_slip_no);
		p.Cnd_purc_ret_act_d_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.purc_ret_act_d_no_META);
		p.setPluralValueEnable(p.Cnd_purc_ret_act_d_no, true);
		p.CndPanel.add(p.Cnd_edi_bp_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_edi_bp_dlv_slip_no);
		p.Cnd_edi_bp_dlv_slip_no.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_edi_bp_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.edi_bp_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_edi_bp_dlv_slip_no, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setNextBeans(p.Cnd_tax_cd);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.foreign_flg_META);
		p.Cnd_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tax_cd, true);
		p.Cnd_tax_cd.setLinkBeans(p.Cnd_tax_nm);
		p.CndPanel.add(p.Cnd_tax_cd_Label);
		p.CndPanel.add(p.Cnd_tax_cd);
		p.Cnd_tax_cd.setNextBeans(p.Cnd_tax_nm);
		p.Cnd_tax_cd.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.tax_cd_META);
		p.CndPanel.add(p.Cnd_tax_nm);
		p.Cnd_tax_nm.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_tax_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.tax_nm_META);
		p.setPluralValueEnable(p.Cnd_tax_nm, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_dtl_trd_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_trd_d_rmrks);
		p.Cnd_dtl_trd_d_rmrks.setNextBeans(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dtl_trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_dtl_intr_rmrks);
		p.Cnd_dtl_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_dtl_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dtl_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_dtl_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setNextBeans(p.Cnd_dis_can_disp_flg);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.CndPanel.add(p.Cnd_dis_can_disp_flg);
		p.Cnd_dis_can_disp_flg.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_dis_can_disp_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.dis_can_disp_flg_META);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setNextBeans(p.Cnd_incl_temp_ap_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.inc_past_flg_META);
		p.CndPanel.add(p.Cnd_incl_temp_ap_flg);
		p.Cnd_incl_temp_ap_flg.setNextBeans(p.Cnd_sign_rev_flg);
		p.Cnd_incl_temp_ap_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.incl_temp_ap_flg_META);
		p.CndPanel.add(p.Cnd_sign_rev_flg);
		p.Cnd_sign_rev_flg.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0190.CndR.sign_rev_flg_META);
		p.SpplGrpPanel.add(p.Cnd_bp_grp_p_PPanel);
		p.SpplGrpPanel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.AspplGrpPanel.add(p.Cnd_asppl_grp_p_PPanel);
		p.AspplGrpPanel.setLastBeans(p.Cnd_asppl_grp_p_PPanel);
		p.ItmGrpPanel.add(p.Cnd_itm_grp_p_PPanel);
		p.ItmGrpPanel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [IvTrgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitIvTrgt(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.IvTrgtPanel.setBorder(p.IvTrgtTitledBorder);
		p.IvTrgtPanel.setValueCheck(false);
		p.IvTrgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.IvTrgtPanel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
	}

	/**
	 * [UpriSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpriSts(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.UpriStsPanel.setBorder(p.UpriStsTitledBorder);
		p.UpriStsPanel.setValueCheck(false);
		p.UpriStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.UpriStsPanel.setLayoutPosition("NSWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SubconSts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSubconSts(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.SubconStsPanel.setBorder(p.SubconStsTitledBorder);
		p.SubconStsPanel.setValueCheck(false);
		p.SubconStsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SubconStsPanel.setLayoutPosition("NSWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBDP_PurcDtlModReg p) {
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
	protected static void jbInitRPnl(MSBDP_PurcDtlModReg p) {
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
	protected static void jbInitBulkSet(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BulkSetPanel.setLayoutPosition("CBN+");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.Fold2Panel, null);
		p.BulkSetPanel.setLastBeans(p.Fold2Panel);
	}

	/**
	 * [Fold2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold2(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.Fold2Panel.add(p.Fold2Tab);
		p.Fold2Panel.setLastBeans(p.Fold2Tab);
		p.Fold2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Fold2Tab.add(p.MidTab1Panel, "Fold2.midtab1");
		p.Fold2Tab.setLastBeans(p.MidTab1Panel);
		p.MidTab1Panel.setNextBeans(p.MidTab2Panel);
		p.Fold2Tab.add(p.MidTab2Panel, "Fold2.midtab2");
	}

	/**
	 * [MidTab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMidTab1(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.MidTab1Panel.setNextBeans(p.MidTab2Panel);
		p.MidTab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.MidTab1Panel.add(p.UpriReqPanel, null);
		p.MidTab1Panel.setLastBeans(p.UpriReqPanel);
		p.UpriReqPanel.setNextBeans(p.XrateReqPanel);
		p.MidTab1Panel.add(p.XrateReqPanel, null);
	}

	/**
	 * [UpriReq]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitUpriReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.UpriReqPanel.setBorder(p.UpriReqTitledBorder);
		p.UpriReqPanel.setValueCheck(false);
		p.UpriReqPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.UpriReqPanel.add(p.UpriReq_upri_dt_Label);
		p.UpriReqPanel.add(p.UpriReq_upri_dt);
		p.UpriReqPanel.setLastBeans(p.UpriReq_upri_dt);
		p.UpriReq_upri_dt.setNextBeans(p.UpriReq_uprireq);
		p.UpriReq_upri_dt.setRow(p.getUpriReqR(), mcframe.clientMSBD.MSBDP0190.UpriReqR.upri_dt_META);
		p.UpriReq_upri_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.UpriReq_uprireq.setFunctionKey(MCFunctionKey.F7);
		p.UpriReqPanel.add(p.UpriReq_uprireq);
		p.UpriReq_uprireq.setNextBeans(p.UpriReq_tag_flg);
		p.UpriReqPanel.add(p.UpriReq_label_interim_flg);
		p.UpriReq_tag_flg.setIcon("SELECT_ALL");
		p.UpriReqPanel.add(p.UpriReq_tag_flg);
		p.UpriReq_tag_flg.setNextBeans(p.UpriReq_not_tag_flg);
		p.UpriReq_not_tag_flg.setIcon("DESELECT_ALL");
		p.UpriReqPanel.add(p.UpriReq_not_tag_flg);
	}

	/**
	 * [XrateReq]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitXrateReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.XrateReqPanel.setBorder(p.XrateReqTitledBorder);
		p.XrateReqPanel.setValueCheck(false);
		p.XrateReqPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
		p.XrateReqPanel.add(p.XrateReq_xrate_dt_Label);
		p.XrateReqPanel.add(p.XrateReq_xrate_dt);
		p.XrateReqPanel.setLastBeans(p.XrateReq_xrate_dt);
		p.XrateReq_xrate_dt.setNextBeans(p.XrateReq_xratereq);
		p.XrateReq_xrate_dt.setRow(p.getXrateReqR(), mcframe.clientMSBD.MSBDP0190.XrateReqR.xrate_dt_META);
		p.XrateReq_xrate_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.XrateReq_xratereq.setFunctionKey(MCFunctionKey.F8);
		p.XrateReqPanel.add(p.XrateReq_xratereq);
	}

	/**
	 * [MidTab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMidTab2(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.MidTab2Panel.setValueCheck(false);
		p.MidTab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MidTab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.MidTab2Panel.add(p.TaxReqPanel, null);
		p.MidTab2Panel.setLastBeans(p.TaxReqPanel);
	}

	/**
	 * [TaxReq]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTaxReq(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.TaxReqPanel.setBorder(p.TaxReqTitledBorder);
		p.TaxReqPanel.setValueCheck(false);
		p.TaxReqPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.TaxReqPanel.add(p.TaxReq_tax_dt_Label);
		p.TaxReqPanel.add(p.TaxReq_tax_dt);
		p.TaxReqPanel.setLastBeans(p.TaxReq_tax_dt);
		p.TaxReq_tax_dt.setNextBeans(p.TaxReq_taxreq);
		p.TaxReq_tax_dt.setRow(p.getTaxReqR(), mcframe.clientMSBD.MSBDP0190.TaxReqR.tax_dt_META);
		p.TaxReq_tax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.TaxReqPanel.add(p.TaxReq_taxreq);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBDP_PurcDtlModReg p) {
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
	protected static void jbInitBtn(MSBDP_PurcDtlModReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_dtl.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_dtl);
		p.BtnPanel.setLastBeans(p.Btn_open_dtl);
		p.Btn_open_dtl.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBD.MSBDP0190.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PurcDtlModReg p) {
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
		MSBDP_PurcDtlModReg_MC.mcInitScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitDispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitSelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitTOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitFold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitSpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitAspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitCnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitIvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitUpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitSubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitCtrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitRPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitBulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitFold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitMidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitUpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitXrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitMidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitTaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitDtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitBtn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.mcInitEastBtn((MSBDP_PurcDtlModReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitUPD_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitUPD_EastBtn((MSBDP_PurcDtlModReg)this);

		// [SRCH_HDR]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__HDR_EastBtn((MSBDP_PurcDtlModReg)this);

		// [REF_HDR]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__HDR_EastBtn((MSBDP_PurcDtlModReg)this);

		// [SRCH_DTL]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__DTL_EastBtn((MSBDP_PurcDtlModReg)this);

		// [REF_DTL]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__DTL_EastBtn((MSBDP_PurcDtlModReg)this);

		// [SRCH_IO]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitSRCH__IO_EastBtn((MSBDP_PurcDtlModReg)this);

		// [REF_IO]ステータスのモードの設定
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_ScreenOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_DispUnit((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_SelectOpe((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_TOP((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Fold((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Tab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_SpplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_AspplGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_ItmGrp((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Cnd((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_IvTrgt((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_UpriSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_SubconSts((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Ctrl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_RPnl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_BulkSet((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Fold2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_MidTab1((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_UpriReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_XrateReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_MidTab2((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_TaxReq((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Dtl((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_Btn((MSBDP_PurcDtlModReg)this);
		MSBDP_PurcDtlModReg_MC.statusInitREF__IO_EastBtn((MSBDP_PurcDtlModReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [DispUnit]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDispUnit(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [SelectOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSelectOpe(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [TOP]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTOP(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcDtlModReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [SpplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpplGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [AspplGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAspplGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcDtlModReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_disp_unit_Group.addAllListener(p);
		p.Cnd_disp_unit_Perti.addAllListener(p);
		p.Cnd_disp_unit_Dtl.addAllListener(p);
		p.Cnd_disp_unit_Hdr.addAllListener(p);
		p.Cnd_purc_flg.addAllListener(p);
		p.Cnd_ret_flg.addAllListener(p);
		p.Cnd_dscnt_flg.addAllListener(p);
		p.Cnd_iv_trgt_flg.addAllListener(p);
		p.Cnd_iv_not_trgt_flg.addAllListener(p);
		p.Cnd_upri_flg.addAllListener(p);
		p.Cnd_interim_flg.addAllListener(p);
		p.Cnd_subcon_flg.addAllListener(p);
		p.Cnd_not_subcon_flg.addAllListener(p);
		p.Cnd_purc_dt_from.setListListener(p);
		p.Cnd_purc_dt_from.addAllListener(p);
		p.Cnd_purc_dt_to.setListListener(p);
		p.Cnd_purc_dt_to.addAllListener(p);
		p.Cnd_ac_ym_from.setListListener(p);
		p.Cnd_ac_ym_from.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ac_dt_from.setListListener(p);
		p.Cnd_ac_dt_from.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
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
		p.Cnd_asppl_cd.setListListener(p);
		p.Cnd_asppl_cd.addAllListener(p);
		p.Cnd_asppl_nm.setListListener(p);
		p.Cnd_asppl_nm.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
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
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_sppl_itm_cd.setListListener(p);
		p.Cnd_sppl_itm_cd.addAllListener(p);
		p.Cnd_sppl_itm_nm.setListListener(p);
		p.Cnd_sppl_itm_nm.addAllListener(p);
		p.Cnd_cst_itm_cd.setListListener(p);
		p.Cnd_cst_itm_cd.addAllListener(p);
		p.Cnd_cst_itm_nm.setListListener(p);
		p.Cnd_cst_itm_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_d_no.setListListener(p);
		p.Cnd_rcpt_iv_d_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_po_d_no.setListListener(p);
		p.Cnd_po_d_no.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_purc_act_d_no.setListListener(p);
		p.Cnd_purc_act_d_no.addAllListener(p);
		p.Cnd_purc_src_typ.setListListener(p);
		p.Cnd_purc_src_typ.addAllListener(p);
		p.Cnd_purc_src_typ_nm.setListListener(p);
		p.Cnd_purc_src_typ_nm.addAllListener(p);
		p.Cnd_purc_src_no.setListListener(p);
		p.Cnd_purc_src_no.addAllListener(p);
		p.Cnd_arr_act_no.setListListener(p);
		p.Cnd_arr_act_no.addAllListener(p);
		p.Cnd_purc_ret_act_no.setListListener(p);
		p.Cnd_purc_ret_act_no.addAllListener(p);
		p.Cnd_purc_ret_act_d_no.setListListener(p);
		p.Cnd_purc_ret_act_d_no.addAllListener(p);
		p.Cnd_edi_bp_dlv_slip_no.setListListener(p);
		p.Cnd_edi_bp_dlv_slip_no.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_foreign_flg.addAllListener(p);
		p.Cnd_tax_cd.setListListener(p);
		p.Cnd_tax_cd.addAllListener(p);
		p.Cnd_tax_nm.setListListener(p);
		p.Cnd_tax_nm.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_dtl_trd_d_rmrks.setListListener(p);
		p.Cnd_dtl_trd_d_rmrks.addAllListener(p);
		p.Cnd_dtl_intr_rmrks.setListListener(p);
		p.Cnd_dtl_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dtl_sub_char1.setListListener(p);
		p.Cnd_dtl_sub_char1.addAllListener(p);
		p.Cnd_dtl_sub_char2.setListListener(p);
		p.Cnd_dtl_sub_char2.addAllListener(p);
		p.Cnd_dtl_sub_char3.setListListener(p);
		p.Cnd_dtl_sub_char3.addAllListener(p);
		p.Cnd_dis_can_disp_flg.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
		p.Cnd_incl_temp_ap_flg.addAllListener(p);
		p.Cnd_sign_rev_flg.addAllListener(p);
	}

	/**
	 *  [IvTrgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitIvTrgt(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [UpriSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriSts(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [SubconSts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSubconSts(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBDP_PurcDtlModReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBDP_PurcDtlModReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [Fold2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold2(MSBDP_PurcDtlModReg p) {
		p.Fold2Tab.addAllListener(p);
	}

	/**
	 *  [MidTab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMidTab1(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [UpriReq]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitUpriReq(MSBDP_PurcDtlModReg p) {
		p.UpriReq_upri_dt.setListListener(p);
		p.UpriReq_upri_dt.addAllListener(p);
		p.UpriReq_uprireq.addAllListener(p);
		p.UpriReq_uprireq.setAPMethodName("doUpriReq_uprireq");
		p.UpriReq_tag_flg.addAllListener(p);
		p.UpriReq_tag_flg.setAPMethodName("doUpriReq_tag_flg");
		p.UpriReq_not_tag_flg.addAllListener(p);
		p.UpriReq_not_tag_flg.setAPMethodName("doUpriReq_not_tag_flg");
	}

	/**
	 *  [XrateReq]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitXrateReq(MSBDP_PurcDtlModReg p) {
		p.XrateReq_xrate_dt.setListListener(p);
		p.XrateReq_xrate_dt.addAllListener(p);
		p.XrateReq_xratereq.addAllListener(p);
		p.XrateReq_xratereq.setAPMethodName("doXrateReq_xratereq");
	}

	/**
	 *  [MidTab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMidTab2(MSBDP_PurcDtlModReg p) {
	}

	/**
	 *  [TaxReq]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTaxReq(MSBDP_PurcDtlModReg p) {
		p.TaxReq_tax_dt.setListListener(p);
		p.TaxReq_tax_dt.addAllListener(p);
		p.TaxReq_taxreq.addAllListener(p);
		p.TaxReq_taxreq.setAPMethodName("doTaxReq_taxreq");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBDP_PurcDtlModReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl_slip_sts_typ_nm.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_purc_dt.addAllListener(p);
		p.columnDtl_purc_dt.setListListener(p);
		p.columnDtl_ac_ym.addAllListener(p);
		p.columnDtl_ac_ym.setListListener(p);
		p.columnDtl_ac_dt.addAllListener(p);
		p.columnDtl_ac_dt.setListListener(p);
		p.columnDtl_purc_cl_ym.addAllListener(p);
		p.columnDtl_purc_cl_ym.setListListener(p);
		p.columnDtl_pay_basis_dt.addAllListener(p);
		p.columnDtl_pay_basis_dt.setListListener(p);
		p.columnDtl_pay_schd_dt.addAllListener(p);
		p.columnDtl_pay_schd_dt.setListListener(p);
		p.columnDtl_arr_dt.addAllListener(p);
		p.columnDtl_arr_dt.setListListener(p);
		p.columnDtl_arr_hm.addAllListener(p);
		p.columnDtl_arr_hm.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ap_dpt_flg.addAllListener(p);
		p.columnDtl_purc_dpt_wg_cd.addAllListener(p);
		p.columnDtl_purc_dpt_wg_cd.setListListener(p);
		p.columnDtl_purc_dpt_wg_nm.addAllListener(p);
		p.columnDtl_purc_dpt_wg_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
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
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_trd_cur_cd.addAllListener(p);
		p.columnDtl_trd_cur_cd.setListListener(p);
		p.columnDtl_trd_cur_nm.addAllListener(p);
		p.columnDtl_trd_cur_nm.setListListener(p);
		p.columnDtl_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_trd_cur_upri_dec_place.setListListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_repurc_obli_flg.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_wtax_amt.addAllListener(p);
		p.columnDtl_wtax_amt.setListListener(p);
		p.columnDtl_wtax_rnd_typ.addAllListener(p);
		p.columnDtl_wtax_rnd_typ.setListListener(p);
		p.columnDtl_purc_upri_req_typ.addAllListener(p);
		p.columnDtl_purc_upri_req_typ.setListListener(p);
		p.columnDtl_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl_purc_upri_req_typ_nm.setListListener(p);
		p.columnDtl_po_dt.addAllListener(p);
		p.columnDtl_po_dt.setListListener(p);
		p.columnDtl_dlv_rqst_dt.addAllListener(p);
		p.columnDtl_dlv_rqst_dt.setListListener(p);
		p.columnDtl_dlv_rqst_hm.addAllListener(p);
		p.columnDtl_dlv_rqst_hm.setListListener(p);
		p.columnDtl_purc_schd_dt.addAllListener(p);
		p.columnDtl_purc_schd_dt.setListListener(p);
		p.columnDtl_base_cur_cd.addAllListener(p);
		p.columnDtl_base_cur_cd.setListListener(p);
		p.columnDtl_base_cur_nm.addAllListener(p);
		p.columnDtl_base_cur_nm.setListListener(p);
		p.columnDtl_base_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_base_cur_amt_dec_place.setListListener(p);
		p.columnDtl_base_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_base_cur_upri_dec_place.setListListener(p);
		p.columnDtl_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_ptax_cur_cd.addAllListener(p);
		p.columnDtl_ptax_cur_cd.setListListener(p);
		p.columnDtl_ptax_cur_nm.addAllListener(p);
		p.columnDtl_ptax_cur_nm.setListListener(p);
		p.columnDtl_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl_ptax_dt.addAllListener(p);
		p.columnDtl_ptax_dt.setListListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_amt_dec_place.setListListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnDtl_ptax_cur_upri_dec_place.setListListener(p);
		p.columnDtl_purc_typ.addAllListener(p);
		p.columnDtl_purc_typ.setListListener(p);
		p.columnDtl_purc_typ_nm.addAllListener(p);
		p.columnDtl_purc_typ_nm.setListListener(p);
		p.columnDtl_in_to_loc_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cd.setListListener(p);
		p.columnDtl_in_to_loc_nm.addAllListener(p);
		p.columnDtl_in_to_loc_nm.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl_str_ln_cd.addAllListener(p);
		p.columnDtl_str_ln_cd.setListListener(p);
		p.columnDtl_str_ln_nm.addAllListener(p);
		p.columnDtl_str_ln_nm.setListListener(p);
		p.columnDtl_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl_in_to_loc_cal_cd.addAllListener(p);
		p.columnDtl_in_to_loc_cal_cd.setListListener(p);
		p.columnDtl_outsrc_sppl_cd.addAllListener(p);
		p.columnDtl_outsrc_sppl_cd.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_xrate_cd.addAllListener(p);
		p.columnDtl_xrate_cd.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_ret_sppl_nm.addAllListener(p);
		p.columnDtl_ret_sppl_nm.setListListener(p);
		p.columnDtl_sppl_cal_cd.addAllListener(p);
		p.columnDtl_sppl_cal_cd.setListListener(p);
		p.columnDtl_purc_amt_rnd_typ.addAllListener(p);
		p.columnDtl_purc_amt_rnd_typ.setListListener(p);
		p.columnDtl_purc_tax_rnd_typ.addAllListener(p);
		p.columnDtl_purc_tax_rnd_typ.setListListener(p);
		p.columnDtl_purc_tax_calc_typ.addAllListener(p);
		p.columnDtl_purc_tax_calc_typ.setListListener(p);
		p.columnDtl_pay_spot_flg.addAllListener(p);
		p.columnDtl_sppl_iv_flg.addAllListener(p);
		p.columnDtl_base_trd_unit_cd.addAllListener(p);
		p.columnDtl_base_trd_unit_cd.setListListener(p);
		p.columnDtl_base_trd_unit_nm.addAllListener(p);
		p.columnDtl_base_trd_unit_nm.setListListener(p);
		p.columnDtl_base_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_base_trd_unit_dec_place.setListListener(p);
		p.columnDtl_base_trd_cur_cd.addAllListener(p);
		p.columnDtl_base_trd_cur_cd.setListListener(p);
		p.columnDtl_base_trd_cur_nm.addAllListener(p);
		p.columnDtl_base_trd_cur_nm.setListListener(p);
		p.columnDtl_base_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl_base_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl_base_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl_base_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl_base_in_to_loc_cd.addAllListener(p);
		p.columnDtl_base_in_to_loc_cd.setListListener(p);
		p.columnDtl_base_in_to_loc_nm.addAllListener(p);
		p.columnDtl_base_in_to_loc_nm.setListListener(p);
		p.columnDtl_sbst_dt.addAllListener(p);
		p.columnDtl_sbst_dt.setListListener(p);
		p.columnDtl_base_dt.addAllListener(p);
		p.columnDtl_base_dt.setListListener(p);
		p.columnDtl_base_tax_cd.addAllListener(p);
		p.columnDtl_base_tax_cd.setListListener(p);
		p.columnDtl_base_tax_nm.addAllListener(p);
		p.columnDtl_base_tax_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_outsrc_itm_ord_no.addAllListener(p);
		p.columnDtl_outsrc_itm_ord_no.setListListener(p);
		p.columnDtl_rqst_avl_rqst_dt.addAllListener(p);
		p.columnDtl_rqst_avl_rqst_dt.setListListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_asppl_cd.addAllListener(p);
		p.columnDtl_asppl_cd.setListListener(p);
		p.columnDtl_asppl_nm.addAllListener(p);
		p.columnDtl_asppl_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
		p.columnDtl_mst_ap_dpt_cd.addAllListener(p);
		p.columnDtl_mst_ap_dpt_cd.setListListener(p);
		p.columnDtl_bsppl_cd.addAllListener(p);
		p.columnDtl_bsppl_cd.setListListener(p);
		p.columnDtl_bsppl_nm.addAllListener(p);
		p.columnDtl_bsppl_nm.setListListener(p);
		p.columnDtl_bp_dlv_slip_no.addAllListener(p);
		p.columnDtl_bp_dlv_slip_no.setListListener(p);
		p.columnDtl_bp_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_bp_dlv_slip_d_no.setListListener(p);
		p.columnDtl_purc_act_no.addAllListener(p);
		p.columnDtl_purc_act_no.setListListener(p);
		p.columnDtl_purc_act_seq.addAllListener(p);
		p.columnDtl_purc_act_seq.setListListener(p);
		p.columnDtl_purc_act_rev.addAllListener(p);
		p.columnDtl_purc_act_rev.setListListener(p);
		p.columnDtl_purc_act_d_no.addAllListener(p);
		p.columnDtl_purc_act_d_no.setListListener(p);
		p.columnDtl_purc_act_d_seq.addAllListener(p);
		p.columnDtl_purc_act_d_seq.setListListener(p);
		p.columnDtl_purc_act_io_no.addAllListener(p);
		p.columnDtl_purc_act_io_no.setListListener(p);
		p.columnDtl_base_purc_ac_dt.addAllListener(p);
		p.columnDtl_base_purc_ac_dt.setListListener(p);
		p.columnDtl_purc_src_typ.addAllListener(p);
		p.columnDtl_purc_src_typ.setListListener(p);
		p.columnDtl_purc_src_typ_nm.addAllListener(p);
		p.columnDtl_purc_src_typ_nm.setListListener(p);
		p.columnDtl_purc_src_no.addAllListener(p);
		p.columnDtl_purc_src_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_po_d_no.addAllListener(p);
		p.columnDtl_po_d_no.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_rcpt_iv_no.addAllListener(p);
		p.columnDtl_rcpt_iv_no.setListListener(p);
		p.columnDtl_rcpt_iv_d_no.addAllListener(p);
		p.columnDtl_rcpt_iv_d_no.setListListener(p);
		p.columnDtl_ref_rcpt_iv_no.addAllListener(p);
		p.columnDtl_ref_rcpt_iv_no.setListListener(p);
		p.columnDtl_purc_schd_no.addAllListener(p);
		p.columnDtl_purc_schd_no.setListListener(p);
		p.columnDtl_arr_act_no.addAllListener(p);
		p.columnDtl_arr_act_no.setListListener(p);
		p.columnDtl_purc_ret_act_no.addAllListener(p);
		p.columnDtl_purc_ret_act_no.setListListener(p);
		p.columnDtl_purc_ret_act_rev.addAllListener(p);
		p.columnDtl_purc_ret_act_rev.setListListener(p);
		p.columnDtl_purc_ret_act_d_no.addAllListener(p);
		p.columnDtl_purc_ret_act_d_no.setListListener(p);
		p.columnDtl_purc_ret_act_io_no.addAllListener(p);
		p.columnDtl_purc_ret_act_io_no.setListListener(p);
		p.columnDtl_bp_lot_no.addAllListener(p);
		p.columnDtl_bp_lot_no.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_mfg_loc_cd.addAllListener(p);
		p.columnDtl_mfg_loc_cd.setListListener(p);
		p.columnDtl_mfg_loc_nm.addAllListener(p);
		p.columnDtl_mfg_loc_nm.setListListener(p);
		p.columnDtl_ncv_flg.addAllListener(p);
		p.columnDtl_edi_flg.addAllListener(p);
		p.columnDtl_sync_flg.addAllListener(p);
		p.columnDtl_temp_ap_flg.addAllListener(p);
		p.columnDtl_accpt_dfct_flg.addAllListener(p);
		p.columnDtl_re_arr_flg.addAllListener(p);
		p.columnDtl_tterm_cd1.addAllListener(p);
		p.columnDtl_tterm_cd1.setListListener(p);
		p.columnDtl_tterm_nm1.addAllListener(p);
		p.columnDtl_tterm_nm1.setListListener(p);
		p.columnDtl_tterm_rmrks1.addAllListener(p);
		p.columnDtl_tterm_rmrks1.setListListener(p);
		p.columnDtl_tterm_cd2.addAllListener(p);
		p.columnDtl_tterm_cd2.setListListener(p);
		p.columnDtl_tterm_nm2.addAllListener(p);
		p.columnDtl_tterm_nm2.setListListener(p);
		p.columnDtl_tterm_rmrks2.addAllListener(p);
		p.columnDtl_tterm_rmrks2.setListListener(p);
		p.columnDtl_tterm_cd3.addAllListener(p);
		p.columnDtl_tterm_cd3.setListListener(p);
		p.columnDtl_tterm_nm3.addAllListener(p);
		p.columnDtl_tterm_nm3.setListListener(p);
		p.columnDtl_tterm_rmrks3.addAllListener(p);
		p.columnDtl_tterm_rmrks3.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_sppl_itm_cd.addAllListener(p);
		p.columnDtl_sppl_itm_cd.setListListener(p);
		p.columnDtl_sppl_itm_nm.addAllListener(p);
		p.columnDtl_sppl_itm_nm.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_lot_no.addAllListener(p);
		p.columnDtl_lot_no.setListListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_pay_crryovr_times.addAllListener(p);
		p.columnDtl_pay_crryovr_times.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_purc_rsn_nm.addAllListener(p);
		p.columnDtl_purc_rsn_nm.setListListener(p);
		p.columnDtl_xpns_purc_flg.addAllListener(p);
		p.columnDtl_not_xpns_purc_flg.addAllListener(p);
		p.columnDtl_purc_dscnt_loc_mng_typ.addAllListener(p);
		p.columnDtl_purc_dscnt_loc_mng_typ.setListListener(p);
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
		p.columnDtl_purc_act_sub_char1.addAllListener(p);
		p.columnDtl_purc_act_sub_char1.setListListener(p);
		p.columnDtl_purc_act_sub_char2.addAllListener(p);
		p.columnDtl_purc_act_sub_char2.setListListener(p);
		p.columnDtl_purc_act_sub_char3.addAllListener(p);
		p.columnDtl_purc_act_sub_char3.setListListener(p);
		p.columnDtl_purc_act_d_sub_char1.addAllListener(p);
		p.columnDtl_purc_act_d_sub_char1.setListListener(p);
		p.columnDtl_purc_act_d_sub_char2.addAllListener(p);
		p.columnDtl_purc_act_d_sub_char2.setListListener(p);
		p.columnDtl_purc_act_d_sub_char3.addAllListener(p);
		p.columnDtl_purc_act_d_sub_char3.setListListener(p);
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
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_hdr_edit_flg.addAllListener(p);
		p.columnDtl_purc_upd_cntr.addAllListener(p);
		p.columnDtl_purc_upd_cntr.setListListener(p);
		p.columnDtl_purc_ret_upd_cntr.addAllListener(p);
		p.columnDtl_purc_ret_upd_cntr.setListListener(p);
		p.columnDtl_xrate_base_dt.addAllListener(p);
		p.columnDtl_xrate_base_dt.setListListener(p);
		p.columnDtl_tax_base_dt.addAllListener(p);
		p.columnDtl_tax_base_dt.setListListener(p);
		p.columnDtl_purc_ret_dt.addAllListener(p);
		p.columnDtl_purc_ret_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PurcDtlModReg p) {
		p.Btn_open_dtl.addAllListener(p);
		p.Btn_open_dtl.setAPMethodName("doBtn_open_dtl");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PurcDtlModReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dt_from.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
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
		p.Cnd_asppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_src_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_inc_past_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_incl_temp_ap_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sign_rev_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitUPD_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, UPD, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, UPD, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, UPD, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, UPD, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [UPD]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, UPD, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slip_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_cl_ym.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_pay_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_arr_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_arr_hm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wtax_amt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wtax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_hm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sbst_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_dlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_io_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bp_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ncv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_temp_ap_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_accpt_dfct_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_re_arr_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
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
		p.columnDtl_purc_act_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Dtl_sppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
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
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_hdr_edit_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_HDR, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_interim_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_subcon_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dt_from.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_asppl_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_bp_lot_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_act_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_typ.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_tax_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_incl_temp_ap_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_HDR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_HDR]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, SRCH_HDR, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, SRCH_HDR, MCMode.ENABLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_hm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_hm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_dt.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_purc_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_site_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_maker_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ret_sppl_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_trd_cur_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_cur_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sbst_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_tax_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_io_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bp_lot_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_ncv_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_edi_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_re_arr_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_tterm_cd1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_crryovr_times.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_rsn_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.INVISIBLE);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_HDR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_hdr_edit_flg.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, SRCH_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__HDR_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_HDR, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_interim_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_subcon_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_not_subcon_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_dt_from.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_site_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_in_to_loc_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dlv_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_tdlv_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_asppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_ap_dpt_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_gd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sno_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.READ_ONLY);
		p.Cnd_maker_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_maker_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sppl_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_cst_itm_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_lot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_bp_lot_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_po_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_typ.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_arr_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_tax_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_incl_temp_ap_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_HDR, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, REF_HDR, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, REF_HDR, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, REF_HDR, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, REF_HDR, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_HDR]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, REF_HDR, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, REF_HDR, MCMode.ENABLE);

	}

	/**
	 * [REF_HDR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_hm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_iv_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.INVISIBLE);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.columnDtl_wtax_rate.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_amt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_dlv_rqst_hm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_schd_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_dt.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.INVISIBLE);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnDtl_purc_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_site_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_site_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_maker_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ret_sppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_trd_cur_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_trd_cur_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sbst_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_tax_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ap_dpt_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_src_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_po_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_slo_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_rcpt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_arr_act_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_io_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bp_lot_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_inst_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_mfg_loc_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_ncv_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_edi_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_temp_ap_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_re_arr_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_tterm_cd1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sppl_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_cst_itm_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_gd_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_lot_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_pay_crryovr_times.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_rsn_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_rsn_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(REF_HDR, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.INVISIBLE);
		p.columnDtl_bd_lot_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_HDR, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_HDR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_hdr_edit_flg.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, REF_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [REF_HDR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF_HDR, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF_HDR, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_HDR, MCMode.READ_ONLY);

	}

	/**
	 * [REF_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__HDR_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_DTL, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_from.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_maker_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sppl_itm_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sppl_itm_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_src_typ.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_src_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Cnd_incl_temp_ap_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DTL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_DTL]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, SRCH_DTL, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, SRCH_DTL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_arr_hm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_wtax_amt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_hm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ret_sppl_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_trd_cur_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_cur_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sbst_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_tax_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_io_no.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bp_lot_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ncv_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_temp_ap_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_re_arr_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH_DTL, MCMode.READ_ONLY);
		p.columnDtl_hdr_edit_flg.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, SRCH_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DTL_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_DTL, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_from.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_sppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_maker_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sppl_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_src_typ.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_src_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_purc_ret_act_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Cnd_incl_temp_ap_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_DTL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, REF_DTL, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, REF_DTL, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, REF_DTL, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, REF_DTL, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_DTL]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, REF_DTL, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, REF_DTL, MCMode.ENABLE);

	}

	/**
	 * [REF_DTL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_arr_hm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.INVISIBLE);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.INVISIBLE);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_wtax_amt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_hm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ret_sppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_trd_cur_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_trd_cur_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_in_to_loc_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sbst_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_base_tax_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_base_purc_ac_dt.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_src_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_act_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_io_no.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bp_lot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ncv_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_temp_ap_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_re_arr_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(REF_DTL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_DTL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_DTL, MCMode.READ_ONLY);
		p.columnDtl_hdr_edit_flg.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, REF_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_DTL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF_DTL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF_DTL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_DTL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DTL_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, SRCH_IO, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_dt_from.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH_IO, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_maker_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sppl_itm_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sppl_itm_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_src_typ.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_src_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Cnd_incl_temp_ap_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_IO, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, SRCH_IO, MCMode.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, SRCH_IO, MCMode.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, SRCH_IO, MCMode.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [SRCH_IO]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, SRCH_IO, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, SRCH_IO, MCMode.ENABLE);

	}

	/**
	 * [SRCH_IO]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_hm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_wtax_amt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_wtax_rnd_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_po_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_hm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ret_sppl_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_trd_cur_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_cur_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_sbst_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_base_tax_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_base_purc_ac_dt.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_io_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ncv_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_temp_ap_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_re_arr_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd1.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_IO, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(SRCH_IO, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(SRCH_IO, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH_IO, MCMode.READ_ONLY);
		p.columnDtl_hdr_edit_flg.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, SRCH_IO, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_IO, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_IO, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__IO_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_ScreenOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[DispUnit]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_DispUnit(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[SelectOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_SelectOpe(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[TOP]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_TOP(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Fold(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Tab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[SpplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_SpplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[AspplGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_AspplGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_ItmGrp(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Cnd(MSBDP_PurcDtlModReg p){
		p.Cnd_ope_Group.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_disp_unit_Group.putMode(p, REF_IO, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ret_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dscnt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_iv_trgt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_iv_not_trgt_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_upri_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_interim_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_subcon_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_not_subcon_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_dt_from.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_dt_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_from.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_from.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_arr_dt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_wg_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_in_to_loc_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tdlv_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tdlv_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_usr_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_usr_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_dpt_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_dpt_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_gd_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_maker_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sppl_itm_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sppl_itm_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_itm_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_cst_itm_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_rcpt_iv_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_po_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_act_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_src_typ.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_src_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Cnd_purc_src_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_arr_act_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_ret_act_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_purc_ret_act_d_no.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_edi_bp_dlv_slip_no.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tax_cd.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_tax_nm.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_trd_d_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_intr_rmrks.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_dis_can_disp_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Cnd_incl_temp_ap_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_sign_rev_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[IvTrgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_IvTrgt(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[UpriSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_UpriSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[SubconSts]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_SubconSts(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Ctrl(MSBDP_PurcDtlModReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF_IO, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_RPnl(MSBDP_PurcDtlModReg p){
		p.RPnl_dwnld.putMode(p, REF_IO, MCMode.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_BulkSet(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[Fold2]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Fold2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[MidTab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_MidTab1(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[UpriReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_UpriReq(MSBDP_PurcDtlModReg p){
		p.UpriReq_upri_dt.putMode(p, REF_IO, MCMode.ENABLE);
		p.UpriReq_uprireq.putMode(p, REF_IO, MCMode.ENABLE);
		p.UpriReq_label_interim_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.UpriReq_tag_flg.putMode(p, REF_IO, MCMode.ENABLE);
		p.UpriReq_not_tag_flg.putMode(p, REF_IO, MCMode.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[XrateReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_XrateReq(MSBDP_PurcDtlModReg p){
		p.XrateReq_xrate_dt.putMode(p, REF_IO, MCMode.ENABLE);
		p.XrateReq_xratereq.putMode(p, REF_IO, MCMode.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[MidTab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_MidTab2(MSBDP_PurcDtlModReg p){

	}

	/**
	 * [REF_IO]ステータスの[TaxReq]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_TaxReq(MSBDP_PurcDtlModReg p){
		p.TaxReq_tax_dt.putMode(p, REF_IO, MCMode.ENABLE);
		p.TaxReq_taxreq.putMode(p, REF_IO, MCMode.ENABLE);

	}

	/**
	 * [REF_IO]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Dtl(MSBDP_PurcDtlModReg p){
		p.columnDtl_check.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slip_sts_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_ym.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_cl_ym.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_pay_basis_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_pay_schd_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_hm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_ap_dpt_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dpt_wg_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_dpt_wg_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_purc_cont_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl_purc_cont_fctr_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_trd_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.columnDtl_repurc_obli_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_trd_cur_proc_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_proc_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_old_trd_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_proc_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_wtax_amt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_wtax_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_req_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_req_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_po_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_dlv_rqst_hm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_xrate_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_xrate_inpt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_base_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_inc_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_dscnt_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_proc_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_proc_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_base_cur_onr_prov_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_ptax_cur_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_ptax_xrate_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl_ptax_xrate_inpt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ptax_cur_amt_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_ptax_cur_upri_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_ptax_cur_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_tax_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_proc_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_in_to_loc_wg_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_in_to_loc_cal_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_outsrc_sppl_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_lg_grp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_maker_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ret_sppl_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_cal_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_amt_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_rnd_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_tax_calc_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_pay_spot_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sppl_iv_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_unit_dec_place.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_base_trd_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_base_base_unit_qty_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_base_trd_cur_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_trd_cur_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_wg_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_in_to_loc_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sbst_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_tax_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_base_tax_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_outsrc_itm_ord_no.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_rqst_avl_rqst_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_trd_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_dlv_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_dlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_dlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5150.MAUBP_Dlv_D.READ_ONLY);
		p.Dtl_tdlv_p_PPanel.columnDlv_pri_prnt_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_tdlv_p_PPanel.columnDlv_lg_grp_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_asppl_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_asppl_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_mst_ap_dpt_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bsppl_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bsppl_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_dlv_slip_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_seq.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_rev.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_seq.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_io_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_base_purc_ac_dt.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_src_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_po_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_rcpt_iv_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ref_rcpt_iv_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_schd_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_arr_act_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_rev.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_d_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_ret_act_io_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_bp_lot_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ncv_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_edi_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_temp_ap_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_accpt_dfct_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_re_arr_flg.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_cd3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_nm3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_tterm_rmrks3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sppl_itm_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_rsn_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_not_xpns_purc_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_dscnt_loc_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.putStatus(REF_IO, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl_bd_lot_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_lot_no_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sublot_no_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno1_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno2_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno3_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_bd_sno4_mng_typ.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_act_sub_char1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_sub_char3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char1.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char2.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_purc_act_d_sub_char3.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Dtl_sppl_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_asppl_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Dtl_itm_grp_p_PPanel.putStatus(REF_IO, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_IO, MCMode.READ_ONLY);
		p.columnDtl_hdr_edit_flg.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_upd_cntr.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_upd_cntr.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_xrate_base_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_tax_base_dt.putMode(p, REF_IO, MCMode.INVISIBLE);
		p.columnDtl_purc_ret_dt.putMode(p, REF_IO, MCMode.INVISIBLE);

	}

	/**
	 * [REF_IO]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_Btn(MSBDP_PurcDtlModReg p){
		p.Btn_open_dtl.putMode(p, REF_IO, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF_IO, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF_IO, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF_IO, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_IO, MCMode.READ_ONLY);

	}

	/**
	 * [REF_IO]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__IO_EastBtn(MSBDP_PurcDtlModReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_DTL;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_PurcDtlModReg_MC.setTableConfigDtl((MSBDP_PurcDtlModReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBDP_PurcDtlModReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_slip_sts_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.slip_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_sts_typ_nm);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_purc_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_dt_META);
		p.columnDtl_purc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dt);
		p.columnDtl_ac_ym.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ac_ym_META);
		p.columnDtl_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_ym);
		p.columnDtl_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ac_dt_META);
		p.columnDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dt);
		p.columnDtl_purc_cl_ym.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_cl_ym_META);
		p.columnDtl_purc_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_cl_ym);
		p.columnDtl_pay_basis_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.pay_basis_dt_META);
		p.columnDtl_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_basis_dt);
		p.columnDtl_pay_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.pay_schd_dt_META);
		p.columnDtl_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_schd_dt);
		p.columnDtl_arr_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.arr_dt_META);
		p.columnDtl_arr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_dt);
		p.columnDtl_arr_hm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.arr_hm_META);
		p.columnDtl_arr_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_hm);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_purc_dpt_nm, p.columnDtl_purc_dpt_wg_cd, p.columnDtl_purc_dpt_wg_nm, p.columnDtl_ap_dpt_flg);
		p.columnDtl_ap_dpt_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ap_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_flg);
		p.columnDtl_purc_dpt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_dpt_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_wg_cd);
		p.columnDtl_purc_dpt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_dpt_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dpt_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.DtlTable.addTable(p.Dtl_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.DtlTable.addTable(p.Dtl_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlTable.addTable(p.Dtl_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_cd);
		p.columnDtl_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_nm);
		p.columnDtl_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_amt_dec_place);
		p.columnDtl_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cur_upri_dec_place);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.DtlTable.addTable(p.Dtl_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl_tax_nm, p.columnDtl_tax_typ, p.columnDtl_tax_rate, p.columnDtl_inc_tax_flg);
		p.Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl_dscnt_rsn_nm);
		p.columnDtl_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.repurc_obli_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_repurc_obli_flg);
		p.columnDtl_outsrc_upri_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.outsrc_upri_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_old_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.columnDtl_wtax_amt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.wtax_amt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_amt);
		p.columnDtl_wtax_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.wtax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rnd_typ);
		p.columnDtl_purc_upri_req_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_upri_req_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ);
		p.columnDtl_purc_upri_req_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_upri_req_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_req_typ_nm);
		p.columnDtl_po_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.po_dt_META);
		p.columnDtl_po_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_po_dt);
		p.columnDtl_dlv_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.dlv_rqst_dt_META);
		p.columnDtl_dlv_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_rqst_dt);
		p.columnDtl_dlv_rqst_hm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.dlv_rqst_hm_META);
		p.columnDtl_dlv_rqst_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_rqst_hm);
		p.columnDtl_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_schd_dt_META);
		p.columnDtl_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_dt);
		p.columnDtl_base_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_cd);
		p.columnDtl_base_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_nm);
		p.columnDtl_base_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_amt_dec_place);
		p.columnDtl_base_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_cur_upri_dec_place);
		p.DtlTable.addTable(p.Dtl_xrate_p_PPanel.XrateTable);
		p.columnDtl_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_inpt_flg);
		p.DtlTable.addTable(p.Dtl_base_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_ptax_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_cd);
		p.columnDtl_ptax_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_nm);
		p.DtlTable.addTable(p.Dtl_ptax_xrate_p_PPanel.XrateTable);
		p.columnDtl_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_xrate_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_xrate_inpt_flg);
		p.columnDtl_ptax_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_dt_META);
		p.columnDtl_ptax_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_dt);
		p.columnDtl_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_cur_amt_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_amt_dec_place);
		p.columnDtl_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ptax_cur_upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ptax_cur_upri_dec_place);
		p.DtlTable.addTable(p.Dtl_ptax_cur_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl_purc_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ);
		p.columnDtl_purc_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ_nm);
		p.columnDtl_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.in_to_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cd);
		p.columnDtl_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.in_to_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_nm);
		p.columnDtl_site_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_cd);
		p.columnDtl_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.in_to_loc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_wg_nm);
		p.columnDtl_str_ln_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd);
		p.columnDtl_str_ln_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.str_ln_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_nm);
		p.columnDtl_str_ln_cd_none_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.str_ln_cd_none_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd_none_flg);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.in_to_loc_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_to_loc_cal_cd);
		p.columnDtl_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.outsrc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_sppl_cd);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_tgt_flg);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_xrate_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.xrate_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_cd);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.maker_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_ret_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ret_sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_sppl_nm);
		p.columnDtl_sppl_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_cal_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cal_cd);
		p.columnDtl_purc_amt_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_amt_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_amt_rnd_typ);
		p.columnDtl_purc_tax_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_tax_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_rnd_typ);
		p.columnDtl_purc_tax_calc_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_tax_calc_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_calc_typ);
		p.columnDtl_pay_spot_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.pay_spot_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_spot_flg);
		p.columnDtl_sppl_iv_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_iv_flg);
		p.columnDtl_base_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_trd_unit_cd);
		p.columnDtl_base_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_trd_unit_nm);
		p.columnDtl_base_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_trd_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_base_trd_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_trd_cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_trd_cur_cd);
		p.columnDtl_base_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_trd_cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_trd_cur_nm);
		p.columnDtl_base_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_in_to_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_in_to_loc_wg_cd);
		p.columnDtl_base_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_in_to_loc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_in_to_loc_wg_nm);
		p.columnDtl_base_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_in_to_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_in_to_loc_cd);
		p.columnDtl_base_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_in_to_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_in_to_loc_nm);
		p.columnDtl_sbst_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sbst_dt_META);
		p.columnDtl_sbst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_sbst_dt);
		p.columnDtl_base_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_dt_META);
		p.columnDtl_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dt);
		p.columnDtl_base_tax_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_tax_cd);
		p.columnDtl_base_tax_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_tax_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_outsrc_itm_ord_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.outsrc_itm_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_itm_ord_no);
		p.columnDtl_rqst_avl_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.rqst_avl_rqst_dt_META);
		p.columnDtl_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_avl_rqst_dt);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.DtlTable.addTable(p.Dtl_dlv_p_PPanel.DlvTable);
		p.DtlTable.addTable(p.Dtl_tdlv_p_PPanel.DlvTable);
		p.columnDtl_asppl_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.asppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_cd);
		p.columnDtl_asppl_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.asppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_nm);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ap_dpt_cd_META);
		p.columnDtl_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl_ap_dpt_cd.addLinkBeans(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.columnDtl_mst_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.mst_ap_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_ap_dpt_cd);
		p.columnDtl_bsppl_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bsppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_cd);
		p.columnDtl_bsppl_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bsppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_nm);
		p.columnDtl_bp_dlv_slip_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bp_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_dlv_slip_no);
		p.columnDtl_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bp_dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_dlv_slip_d_no);
		p.columnDtl_purc_act_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_no);
		p.columnDtl_purc_act_seq.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_seq);
		p.columnDtl_purc_act_rev.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_rev);
		p.columnDtl_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_no);
		p.columnDtl_purc_act_d_seq.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_d_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_seq);
		p.columnDtl_purc_act_io_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_io_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_io_no);
		p.columnDtl_base_purc_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.base_purc_ac_dt_META);
		p.columnDtl_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_purc_ac_dt);
		p.columnDtl_purc_src_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_src_typ);
		p.columnDtl_purc_src_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_src_typ_nm);
		p.columnDtl_purc_src_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_src_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_src_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_po_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_d_no);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_rcpt_iv_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.rcpt_iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_no);
		p.columnDtl_rcpt_iv_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.rcpt_iv_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcpt_iv_d_no);
		p.columnDtl_ref_rcpt_iv_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ref_rcpt_iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_rcpt_iv_no);
		p.columnDtl_purc_schd_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_schd_no);
		p.columnDtl_arr_act_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.arr_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_act_no);
		p.columnDtl_purc_ret_act_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_act_no);
		p.columnDtl_purc_ret_act_rev.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_act_rev_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_act_rev);
		p.columnDtl_purc_ret_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_act_d_no);
		p.columnDtl_purc_ret_act_io_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_act_io_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_act_io_no);
		p.columnDtl_bp_lot_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bp_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_lot_no);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_mfg_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.mfg_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_cd);
		p.columnDtl_mfg_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.mfg_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_nm);
		p.columnDtl_ncv_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ncv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ncv_flg);
		p.columnDtl_edi_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.edi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_edi_flg);
		p.columnDtl_sync_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sync_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sync_flg);
		p.columnDtl_temp_ap_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.temp_ap_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_temp_ap_flg);
		p.columnDtl_accpt_dfct_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.accpt_dfct_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_accpt_dfct_flg);
		p.columnDtl_re_arr_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.re_arr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_re_arr_flg);
		p.columnDtl_tterm_cd1.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_cd1_META);
		p.columnDtl_tterm_cd1.addLinkBeans(p.columnDtl_tterm_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_cd1);
		p.columnDtl_tterm_nm1.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_nm1);
		p.columnDtl_tterm_rmrks1.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_rmrks1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_rmrks1);
		p.columnDtl_tterm_cd2.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_cd2_META);
		p.columnDtl_tterm_cd2.addLinkBeans(p.columnDtl_tterm_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_cd2);
		p.columnDtl_tterm_nm2.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_nm2);
		p.columnDtl_tterm_rmrks2.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_rmrks2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_rmrks2);
		p.columnDtl_tterm_cd3.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_cd3_META);
		p.columnDtl_tterm_cd3.addLinkBeans(p.columnDtl_tterm_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_cd3);
		p.columnDtl_tterm_nm3.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_nm3);
		p.columnDtl_tterm_rmrks3.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tterm_rmrks3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tterm_rmrks3);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_cd);
		p.columnDtl_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sppl_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_itm_nm);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_lot_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.columnDtl_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_crryovr_times);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.rsn_cd_META);
		p.columnDtl_rsn_cd.addLinkBeans(p.columnDtl_purc_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_purc_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_rsn_nm);
		p.columnDtl_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_flg);
		p.columnDtl_not_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.not_xpns_purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_xpns_purc_flg);
		p.columnDtl_purc_dscnt_loc_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_dscnt_loc_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dscnt_loc_mng_typ);
		p.DtlTable.addTable(p.Dtl_bditm_p_PPanel.BdItemTable);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl_bd_dpt_nm);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl_bd_itm_sub1, p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl_bd_itm_sub2, p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl_bd_itm_sub3, p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.Dtl_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl_bd_itm_nm, p.columnDtl_bd_lot_mng_typ, p.columnDtl_bd_lot_no_typ, p.columnDtl_bd_sublot_mng_typ, p.columnDtl_bd_sublot_no_typ, p.columnDtl_bd_sno1_mng_typ, p.columnDtl_bd_sno2_mng_typ, p.columnDtl_bd_sno3_mng_typ, p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_mng_typ);
		p.columnDtl_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_mng_typ);
		p.columnDtl_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_lot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_lot_no_typ);
		p.columnDtl_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sublot_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sublot_no_typ);
		p.columnDtl_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno1_mng_typ);
		p.columnDtl_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno2_mng_typ);
		p.columnDtl_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno3_mng_typ);
		p.columnDtl_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.bd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_sno4_mng_typ);
		p.columnDtl_purc_act_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_sub_char1);
		p.columnDtl_purc_act_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_sub_char2);
		p.columnDtl_purc_act_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_sub_char3);
		p.columnDtl_purc_act_d_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_d_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_sub_char1);
		p.columnDtl_purc_act_d_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_d_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_sub_char2);
		p.columnDtl_purc_act_d_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_act_d_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_act_d_sub_char3);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		p.DtlTable.addTable(p.Dtl_sppl_grp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_asppl_grp_p_PPanel.BpGrpTable);
		p.DtlTable.addTable(p.Dtl_itm_grp_p_PPanel.ItmGrpTable);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_hdr_edit_flg.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.hdr_edit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_hdr_edit_flg);
		p.columnDtl_purc_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upd_cntr);
		p.columnDtl_purc_ret_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_upd_cntr);
		p.columnDtl_xrate_base_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.xrate_base_dt_META);
		p.columnDtl_xrate_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_xrate_base_dt);
		p.columnDtl_tax_base_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.tax_base_dt_META);
		p.columnDtl_tax_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_tax_base_dt);
		p.columnDtl_purc_ret_dt.setMeta(mcframe.clientMSBD.MSBDP0190.DtlR.purc_ret_dt_META);
		p.columnDtl_purc_ret_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ret_dt);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_in_to_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_in_to_loc_wg_cd.getListConfig().setPutter(getCnd_in_to_loc_wg_cd_ListPutter());
		Cnd_in_to_loc_cd.getListConfig().setPutter(getCnd_in_to_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_tdlv_cd.getListConfig().setPutter(getCnd_tdlv_cd_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_purc_usr_cd.getListConfig().setPutter(getCnd_purc_usr_cd_ListPutter());
		Cnd_purc_dpt_cd.getListConfig().setPutter(getCnd_purc_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_cst_itm_cd.getListConfig().setPutter(getCnd_cst_itm_cd_ListPutter());
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_purc_src_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_src_typ.getListConfig().setPutter(getCnd_purc_src_typ_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tax_cd.getListConfig().setPutter(getCnd_tax_cd_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_base_cur_cd.getListConfig().setPutter(getDtl_base_cur_cd_ListPutter());
		columnDtl_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ptax_cur_cd.getListConfig().setPutter(getDtl_ptax_cur_cd_ListPutter());
		columnDtl_ap_dpt_cd.getListConfig().setPutter(getDtl_ap_dpt_cd_ListPutter());
		columnDtl_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_tterm_cd1.getListConfig().setPutter(getDtl_tterm_cd1_ListPutter());
		columnDtl_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_tterm_cd2.getListConfig().setPutter(getDtl_tterm_cd2_ListPutter());
		columnDtl_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_tterm_cd3.getListConfig().setPutter(getDtl_tterm_cd3_ListPutter());
		columnDtl_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsn_cd.getListConfig().setPutter(getDtl_rsn_cd_ListPutter());
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
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_HDRStatus() {
		status = SRCH_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_HDRStatus() {
		status = REF_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DTLStatus() {
		status = SRCH_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DTLStatus() {
		status = REF_DTL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_IOStatus() {
		status = SRCH_IO;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_IO]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_IOStatus() {
		status = REF_IO;
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
		else if (SRCH_HDR.equals(status)) {
			setSRCH_HDRStatus();
		}
		else if (REF_HDR.equals(status)) {
			setREF_HDRStatus();
		}
		else if (SRCH_DTL.equals(status)) {
			setSRCH_DTLStatus();
		}
		else if (REF_DTL.equals(status)) {
			setREF_DTLStatus();
		}
		else if (SRCH_IO.equals(status)) {
			setSRCH_IOStatus();
		}
		else if (REF_IO.equals(status)) {
			setREF_IOStatus();
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
	 * [Cnd_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
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
	 * [Cnd_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
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
	 * [Cnd_purc_src_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_src_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PurcSrcTyp");
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
	 * [Cnd_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
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
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_tterm_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_tterm_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Dtl_tterm_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_tterm_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Dtl_tterm_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_tterm_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Dtl_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_in_to_loc_wg_cd) return getCnd_in_to_loc_wg_cd(row, info);
		if(combo == Cnd_in_to_loc_cd) return getCnd_in_to_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_tdlv_cd) return getCnd_tdlv_cd(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_purc_usr_cd) return getCnd_purc_usr_cd(row, info);
		if(combo == Cnd_purc_dpt_cd) return getCnd_purc_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_cst_itm_cd) return getCnd_cst_itm_cd(row, info);
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_purc_src_typ) return getCnd_purc_src_typ(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_tax_cd) return getCnd_tax_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_usr_cd(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl_base_cur_cd) return getDtl_base_cur_cd(row, info);
		if(combo == columnDtl_ptax_cur_cd) return getDtl_ptax_cur_cd(row, info);
		if(combo == columnDtl_ap_dpt_cd) return getDtl_ap_dpt_cd(row, info);
		if(combo == columnDtl_tterm_cd1) return getDtl_tterm_cd1(row, info);
		if(combo == columnDtl_tterm_cd2) return getDtl_tterm_cd2(row, info);
		if(combo == columnDtl_tterm_cd3) return getDtl_tterm_cd3(row, info);
		if(combo == columnDtl_rsn_cd) return getDtl_rsn_cd(row, info);
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
		else if (ap == UpriReq_uprireq) doUpriReq_uprireq(info);
		else if (ap == UpriReq_tag_flg) doUpriReq_tag_flg(info);
		else if (ap == UpriReq_not_tag_flg) doUpriReq_not_tag_flg(info);
		else if (ap == XrateReq_xratereq) doXrateReq_xratereq(info);
		else if (ap == TaxReq_taxreq) doTaxReq_taxreq(info);
		else if (ap == Btn_open_dtl) doBtn_open_dtl(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
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
	 * [UpriReq]パネルの[uprireq]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriReq_uprireq(MCEventInfo info);

	/**
	 * [UpriReq]パネルの[tag_flg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriReq_tag_flg(MCEventInfo info);

	/**
	 * [UpriReq]パネルの[not_tag_flg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doUpriReq_not_tag_flg(MCEventInfo info);

	/**
	 * [XrateReq]パネルの[xratereq]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doXrateReq_xratereq(MCEventInfo info);

	/**
	 * [TaxReq]パネルの[taxreq]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doTaxReq_taxreq(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == Fold2Tab) return doFold2_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_disp_unit_Group) return doCnd_disp_unit_VC(info);
		if (vc == Cnd_purc_flg) return doCnd_purc_flg_VC(info);
		if (vc == Cnd_ret_flg) return doCnd_ret_flg_VC(info);
		if (vc == Cnd_dscnt_flg) return doCnd_dscnt_flg_VC(info);
		if (vc == Cnd_iv_trgt_flg) return doCnd_iv_trgt_flg_VC(info);
		if (vc == Cnd_iv_not_trgt_flg) return doCnd_iv_not_trgt_flg_VC(info);
		if (vc == Cnd_upri_flg) return doCnd_upri_flg_VC(info);
		if (vc == Cnd_interim_flg) return doCnd_interim_flg_VC(info);
		if (vc == Cnd_subcon_flg) return doCnd_subcon_flg_VC(info);
		if (vc == Cnd_not_subcon_flg) return doCnd_not_subcon_flg_VC(info);
		if (vc == Cnd_purc_dt_from) return doCnd_purc_dt_from_VC(info);
		if (vc == Cnd_purc_dt_to) return doCnd_purc_dt_to_VC(info);
		if (vc == Cnd_ac_ym_from) return doCnd_ac_ym_from_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ac_dt_from) return doCnd_ac_dt_from_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
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
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_purc_usr_cd) return doCnd_purc_usr_cd_VC(info);
		if (vc == Cnd_purc_usr_nm) return doCnd_purc_usr_nm_VC(info);
		if (vc == Cnd_purc_dpt_cd) return doCnd_purc_dpt_cd_VC(info);
		if (vc == Cnd_purc_dpt_nm) return doCnd_purc_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_sppl_itm_cd) return doCnd_sppl_itm_cd_VC(info);
		if (vc == Cnd_sppl_itm_nm) return doCnd_sppl_itm_nm_VC(info);
		if (vc == Cnd_cst_itm_cd) return doCnd_cst_itm_cd_VC(info);
		if (vc == Cnd_cst_itm_nm) return doCnd_cst_itm_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_d_no) return doCnd_rcpt_iv_d_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_po_d_no) return doCnd_po_d_no_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_purc_act_d_no) return doCnd_purc_act_d_no_VC(info);
		if (vc == Cnd_purc_src_typ) return doCnd_purc_src_typ_VC(info);
		if (vc == Cnd_purc_src_typ_nm) return doCnd_purc_src_typ_nm_VC(info);
		if (vc == Cnd_purc_src_no) return doCnd_purc_src_no_VC(info);
		if (vc == Cnd_arr_act_no) return doCnd_arr_act_no_VC(info);
		if (vc == Cnd_purc_ret_act_no) return doCnd_purc_ret_act_no_VC(info);
		if (vc == Cnd_purc_ret_act_d_no) return doCnd_purc_ret_act_d_no_VC(info);
		if (vc == Cnd_edi_bp_dlv_slip_no) return doCnd_edi_bp_dlv_slip_no_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_foreign_flg) return doCnd_foreign_flg_VC(info);
		if (vc == Cnd_tax_cd) return doCnd_tax_cd_VC(info);
		if (vc == Cnd_tax_nm) return doCnd_tax_nm_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_dtl_trd_d_rmrks) return doCnd_dtl_trd_d_rmrks_VC(info);
		if (vc == Cnd_dtl_intr_rmrks) return doCnd_dtl_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == Cnd_dis_can_disp_flg) return doCnd_dis_can_disp_flg_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == Cnd_incl_temp_ap_flg) return doCnd_incl_temp_ap_flg_VC(info);
		if (vc == Cnd_sign_rev_flg) return doCnd_sign_rev_flg_VC(info);
		if (vc == UpriReq_upri_dt) return doUpriReq_upri_dt_VC(info);
		if (vc == XrateReq_xrate_dt) return doXrateReq_xrate_dt_VC(info);
		if (vc == TaxReq_tax_dt) return doTaxReq_tax_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_slip_sts_typ_nm) return doDtl_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_purc_dt) return doDtl_purc_dt_VC(info);
		if (vc == columnDtl_ac_ym) return doDtl_ac_ym_VC(info);
		if (vc == columnDtl_ac_dt) return doDtl_ac_dt_VC(info);
		if (vc == columnDtl_purc_cl_ym) return doDtl_purc_cl_ym_VC(info);
		if (vc == columnDtl_pay_basis_dt) return doDtl_pay_basis_dt_VC(info);
		if (vc == columnDtl_pay_schd_dt) return doDtl_pay_schd_dt_VC(info);
		if (vc == columnDtl_arr_dt) return doDtl_arr_dt_VC(info);
		if (vc == columnDtl_arr_hm) return doDtl_arr_hm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_ap_dpt_flg) return doDtl_ap_dpt_flg_VC(info);
		if (vc == columnDtl_purc_dpt_wg_cd) return doDtl_purc_dpt_wg_cd_VC(info);
		if (vc == columnDtl_purc_dpt_wg_nm) return doDtl_purc_dpt_wg_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_trd_cur_cd) return doDtl_trd_cur_cd_VC(info);
		if (vc == columnDtl_trd_cur_nm) return doDtl_trd_cur_nm_VC(info);
		if (vc == columnDtl_trd_cur_amt_dec_place) return doDtl_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_trd_cur_upri_dec_place) return doDtl_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_repurc_obli_flg) return doDtl_repurc_obli_flg_VC(info);
		if (vc == columnDtl_outsrc_upri_typ) return doDtl_outsrc_upri_typ_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_wtax_amt) return doDtl_wtax_amt_VC(info);
		if (vc == columnDtl_wtax_rnd_typ) return doDtl_wtax_rnd_typ_VC(info);
		if (vc == columnDtl_purc_upri_req_typ) return doDtl_purc_upri_req_typ_VC(info);
		if (vc == columnDtl_purc_upri_req_typ_nm) return doDtl_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl_po_dt) return doDtl_po_dt_VC(info);
		if (vc == columnDtl_dlv_rqst_dt) return doDtl_dlv_rqst_dt_VC(info);
		if (vc == columnDtl_dlv_rqst_hm) return doDtl_dlv_rqst_hm_VC(info);
		if (vc == columnDtl_purc_schd_dt) return doDtl_purc_schd_dt_VC(info);
		if (vc == columnDtl_base_cur_cd) return doDtl_base_cur_cd_VC(info);
		if (vc == columnDtl_base_cur_nm) return doDtl_base_cur_nm_VC(info);
		if (vc == columnDtl_base_cur_amt_dec_place) return doDtl_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_base_cur_upri_dec_place) return doDtl_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_xrate_inpt_flg) return doDtl_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_ptax_cur_cd) return doDtl_ptax_cur_cd_VC(info);
		if (vc == columnDtl_ptax_cur_nm) return doDtl_ptax_cur_nm_VC(info);
		if (vc == columnDtl_ptax_xrate_inpt_flg) return doDtl_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl_ptax_dt) return doDtl_ptax_dt_VC(info);
		if (vc == columnDtl_ptax_cur_amt_dec_place) return doDtl_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl_ptax_cur_upri_dec_place) return doDtl_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl_purc_typ) return doDtl_purc_typ_VC(info);
		if (vc == columnDtl_purc_typ_nm) return doDtl_purc_typ_nm_VC(info);
		if (vc == columnDtl_in_to_loc_cd) return doDtl_in_to_loc_cd_VC(info);
		if (vc == columnDtl_in_to_loc_nm) return doDtl_in_to_loc_nm_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_in_to_loc_wg_cd) return doDtl_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_in_to_loc_wg_nm) return doDtl_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl_str_ln_cd) return doDtl_str_ln_cd_VC(info);
		if (vc == columnDtl_str_ln_nm) return doDtl_str_ln_nm_VC(info);
		if (vc == columnDtl_str_ln_cd_none_flg) return doDtl_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl_in_to_loc_cal_cd) return doDtl_in_to_loc_cal_cd_VC(info);
		if (vc == columnDtl_outsrc_sppl_cd) return doDtl_outsrc_sppl_cd_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_str_ln_tgt_flg) return doDtl_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_xrate_cd) return doDtl_xrate_cd_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_ret_sppl_nm) return doDtl_ret_sppl_nm_VC(info);
		if (vc == columnDtl_sppl_cal_cd) return doDtl_sppl_cal_cd_VC(info);
		if (vc == columnDtl_purc_amt_rnd_typ) return doDtl_purc_amt_rnd_typ_VC(info);
		if (vc == columnDtl_purc_tax_rnd_typ) return doDtl_purc_tax_rnd_typ_VC(info);
		if (vc == columnDtl_purc_tax_calc_typ) return doDtl_purc_tax_calc_typ_VC(info);
		if (vc == columnDtl_pay_spot_flg) return doDtl_pay_spot_flg_VC(info);
		if (vc == columnDtl_sppl_iv_flg) return doDtl_sppl_iv_flg_VC(info);
		if (vc == columnDtl_base_trd_unit_cd) return doDtl_base_trd_unit_cd_VC(info);
		if (vc == columnDtl_base_trd_unit_nm) return doDtl_base_trd_unit_nm_VC(info);
		if (vc == columnDtl_base_trd_unit_dec_place) return doDtl_base_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_base_trd_cur_cd) return doDtl_base_trd_cur_cd_VC(info);
		if (vc == columnDtl_base_trd_cur_nm) return doDtl_base_trd_cur_nm_VC(info);
		if (vc == columnDtl_base_in_to_loc_wg_cd) return doDtl_base_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl_base_in_to_loc_wg_nm) return doDtl_base_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl_base_in_to_loc_cd) return doDtl_base_in_to_loc_cd_VC(info);
		if (vc == columnDtl_base_in_to_loc_nm) return doDtl_base_in_to_loc_nm_VC(info);
		if (vc == columnDtl_sbst_dt) return doDtl_sbst_dt_VC(info);
		if (vc == columnDtl_base_dt) return doDtl_base_dt_VC(info);
		if (vc == columnDtl_base_tax_cd) return doDtl_base_tax_cd_VC(info);
		if (vc == columnDtl_base_tax_nm) return doDtl_base_tax_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_outsrc_itm_ord_no) return doDtl_outsrc_itm_ord_no_VC(info);
		if (vc == columnDtl_rqst_avl_rqst_dt) return doDtl_rqst_avl_rqst_dt_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_asppl_cd) return doDtl_asppl_cd_VC(info);
		if (vc == columnDtl_asppl_nm) return doDtl_asppl_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
		if (vc == columnDtl_mst_ap_dpt_cd) return doDtl_mst_ap_dpt_cd_VC(info);
		if (vc == columnDtl_bsppl_cd) return doDtl_bsppl_cd_VC(info);
		if (vc == columnDtl_bsppl_nm) return doDtl_bsppl_nm_VC(info);
		if (vc == columnDtl_bp_dlv_slip_no) return doDtl_bp_dlv_slip_no_VC(info);
		if (vc == columnDtl_bp_dlv_slip_d_no) return doDtl_bp_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_purc_act_no) return doDtl_purc_act_no_VC(info);
		if (vc == columnDtl_purc_act_seq) return doDtl_purc_act_seq_VC(info);
		if (vc == columnDtl_purc_act_rev) return doDtl_purc_act_rev_VC(info);
		if (vc == columnDtl_purc_act_d_no) return doDtl_purc_act_d_no_VC(info);
		if (vc == columnDtl_purc_act_d_seq) return doDtl_purc_act_d_seq_VC(info);
		if (vc == columnDtl_purc_act_io_no) return doDtl_purc_act_io_no_VC(info);
		if (vc == columnDtl_base_purc_ac_dt) return doDtl_base_purc_ac_dt_VC(info);
		if (vc == columnDtl_purc_src_typ) return doDtl_purc_src_typ_VC(info);
		if (vc == columnDtl_purc_src_typ_nm) return doDtl_purc_src_typ_nm_VC(info);
		if (vc == columnDtl_purc_src_no) return doDtl_purc_src_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_po_d_no) return doDtl_po_d_no_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_rcpt_iv_no) return doDtl_rcpt_iv_no_VC(info);
		if (vc == columnDtl_rcpt_iv_d_no) return doDtl_rcpt_iv_d_no_VC(info);
		if (vc == columnDtl_ref_rcpt_iv_no) return doDtl_ref_rcpt_iv_no_VC(info);
		if (vc == columnDtl_purc_schd_no) return doDtl_purc_schd_no_VC(info);
		if (vc == columnDtl_arr_act_no) return doDtl_arr_act_no_VC(info);
		if (vc == columnDtl_purc_ret_act_no) return doDtl_purc_ret_act_no_VC(info);
		if (vc == columnDtl_purc_ret_act_rev) return doDtl_purc_ret_act_rev_VC(info);
		if (vc == columnDtl_purc_ret_act_d_no) return doDtl_purc_ret_act_d_no_VC(info);
		if (vc == columnDtl_purc_ret_act_io_no) return doDtl_purc_ret_act_io_no_VC(info);
		if (vc == columnDtl_bp_lot_no) return doDtl_bp_lot_no_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_mfg_loc_cd) return doDtl_mfg_loc_cd_VC(info);
		if (vc == columnDtl_mfg_loc_nm) return doDtl_mfg_loc_nm_VC(info);
		if (vc == columnDtl_ncv_flg) return doDtl_ncv_flg_VC(info);
		if (vc == columnDtl_edi_flg) return doDtl_edi_flg_VC(info);
		if (vc == columnDtl_sync_flg) return doDtl_sync_flg_VC(info);
		if (vc == columnDtl_temp_ap_flg) return doDtl_temp_ap_flg_VC(info);
		if (vc == columnDtl_accpt_dfct_flg) return doDtl_accpt_dfct_flg_VC(info);
		if (vc == columnDtl_re_arr_flg) return doDtl_re_arr_flg_VC(info);
		if (vc == columnDtl_tterm_cd1) return doDtl_tterm_cd1_VC(info);
		if (vc == columnDtl_tterm_nm1) return doDtl_tterm_nm1_VC(info);
		if (vc == columnDtl_tterm_rmrks1) return doDtl_tterm_rmrks1_VC(info);
		if (vc == columnDtl_tterm_cd2) return doDtl_tterm_cd2_VC(info);
		if (vc == columnDtl_tterm_nm2) return doDtl_tterm_nm2_VC(info);
		if (vc == columnDtl_tterm_rmrks2) return doDtl_tterm_rmrks2_VC(info);
		if (vc == columnDtl_tterm_cd3) return doDtl_tterm_cd3_VC(info);
		if (vc == columnDtl_tterm_nm3) return doDtl_tterm_nm3_VC(info);
		if (vc == columnDtl_tterm_rmrks3) return doDtl_tterm_rmrks3_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_sppl_itm_cd) return doDtl_sppl_itm_cd_VC(info);
		if (vc == columnDtl_sppl_itm_nm) return doDtl_sppl_itm_nm_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_lot_no) return doDtl_lot_no_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_pay_crryovr_times) return doDtl_pay_crryovr_times_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_purc_rsn_nm) return doDtl_purc_rsn_nm_VC(info);
		if (vc == columnDtl_xpns_purc_flg) return doDtl_xpns_purc_flg_VC(info);
		if (vc == columnDtl_not_xpns_purc_flg) return doDtl_not_xpns_purc_flg_VC(info);
		if (vc == columnDtl_purc_dscnt_loc_mng_typ) return doDtl_purc_dscnt_loc_mng_typ_VC(info);
		if (vc == columnDtl_bd_lot_mng_typ) return doDtl_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl_bd_sublot_mng_typ) return doDtl_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl_bd_lot_no_typ) return doDtl_bd_lot_no_typ_VC(info);
		if (vc == columnDtl_bd_sublot_no_typ) return doDtl_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl_bd_sno1_mng_typ) return doDtl_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno2_mng_typ) return doDtl_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno3_mng_typ) return doDtl_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_bd_sno4_mng_typ) return doDtl_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_purc_act_sub_char1) return doDtl_purc_act_sub_char1_VC(info);
		if (vc == columnDtl_purc_act_sub_char2) return doDtl_purc_act_sub_char2_VC(info);
		if (vc == columnDtl_purc_act_sub_char3) return doDtl_purc_act_sub_char3_VC(info);
		if (vc == columnDtl_purc_act_d_sub_char1) return doDtl_purc_act_d_sub_char1_VC(info);
		if (vc == columnDtl_purc_act_d_sub_char2) return doDtl_purc_act_d_sub_char2_VC(info);
		if (vc == columnDtl_purc_act_d_sub_char3) return doDtl_purc_act_d_sub_char3_VC(info);
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
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_hdr_edit_flg) return doDtl_hdr_edit_flg_VC(info);
		if (vc == columnDtl_purc_upd_cntr) return doDtl_purc_upd_cntr_VC(info);
		if (vc == columnDtl_purc_ret_upd_cntr) return doDtl_purc_ret_upd_cntr_VC(info);
		if (vc == columnDtl_xrate_base_dt) return doDtl_xrate_base_dt_VC(info);
		if (vc == columnDtl_tax_base_dt) return doDtl_tax_base_dt_VC(info);
		if (vc == columnDtl_purc_ret_dt) return doDtl_purc_ret_dt_VC(info);
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
	 * [Fold2]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold2_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ret_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ret_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dscnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dscnt_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upri_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dt_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_from_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_from_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_itm_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_d_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_src_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[edi_bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_edi_bp_dlv_slip_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_intr_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dis_can_disp_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_temp_ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_temp_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sign_rev_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [UpriReq]パネルの[upri_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doUpriReq_upri_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [XrateReq]パネルの[xrate_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doXrateReq_xrate_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TaxReq]パネルの[tax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTaxReq_tax_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_hm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rnd_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_rqst_hm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_inpt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ptax_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_none_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_sppl_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_tgt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ret_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_sppl_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_tax_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_spot_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sbst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sbst_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_tax_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_itm_ord_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_src_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcpt_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_lot_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ncv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ncv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[temp_ap_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_temp_ap_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[accpt_dfct_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_accpt_dfct_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[re_arr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_re_arr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dscnt_loc_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dscnt_loc_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_act_d_sub_char3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[hdr_edit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_hdr_edit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xrate_base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xrate_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tax_base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tax_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ret_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ret_dt_VC(MCEventInfo info){
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
		else if (nc == Fold2Tab) doFold2_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_disp_unit_Group) doCnd_disp_unit_NC(info);
		else if (nc == Cnd_purc_flg) doCnd_purc_flg_NC(info);
		else if (nc == Cnd_ret_flg) doCnd_ret_flg_NC(info);
		else if (nc == Cnd_dscnt_flg) doCnd_dscnt_flg_NC(info);
		else if (nc == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NC(info);
		else if (nc == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NC(info);
		else if (nc == Cnd_upri_flg) doCnd_upri_flg_NC(info);
		else if (nc == Cnd_interim_flg) doCnd_interim_flg_NC(info);
		else if (nc == Cnd_subcon_flg) doCnd_subcon_flg_NC(info);
		else if (nc == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NC(info);
		else if (nc == Cnd_purc_dt_from) doCnd_purc_dt_from_NC(info);
		else if (nc == Cnd_purc_dt_to) doCnd_purc_dt_to_NC(info);
		else if (nc == Cnd_ac_ym_from) doCnd_ac_ym_from_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ac_dt_from) doCnd_ac_dt_from_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
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
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NC(info);
		else if (nc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NC(info);
		else if (nc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NC(info);
		else if (nc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_sppl_itm_cd) doCnd_sppl_itm_cd_NC(info);
		else if (nc == Cnd_sppl_itm_nm) doCnd_sppl_itm_nm_NC(info);
		else if (nc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NC(info);
		else if (nc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_po_d_no) doCnd_po_d_no_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NC(info);
		else if (nc == Cnd_purc_src_typ) doCnd_purc_src_typ_NC(info);
		else if (nc == Cnd_purc_src_typ_nm) doCnd_purc_src_typ_nm_NC(info);
		else if (nc == Cnd_purc_src_no) doCnd_purc_src_no_NC(info);
		else if (nc == Cnd_arr_act_no) doCnd_arr_act_no_NC(info);
		else if (nc == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NC(info);
		else if (nc == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NC(info);
		else if (nc == Cnd_edi_bp_dlv_slip_no) doCnd_edi_bp_dlv_slip_no_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_foreign_flg) doCnd_foreign_flg_NC(info);
		else if (nc == Cnd_tax_cd) doCnd_tax_cd_NC(info);
		else if (nc == Cnd_tax_nm) doCnd_tax_nm_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_dtl_trd_d_rmrks) doCnd_dtl_trd_d_rmrks_NC(info);
		else if (nc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == Cnd_incl_temp_ap_flg) doCnd_incl_temp_ap_flg_NC(info);
		else if (nc == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NC(info);
		else if (nc == UpriReq_upri_dt) doUpriReq_upri_dt_NC(info);
		else if (nc == XrateReq_xrate_dt) doXrateReq_xrate_dt_NC(info);
		else if (nc == TaxReq_tax_dt) doTaxReq_tax_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_purc_dt) doDtl_purc_dt_NC(info);
		else if (nc == columnDtl_ac_ym) doDtl_ac_ym_NC(info);
		else if (nc == columnDtl_ac_dt) doDtl_ac_dt_NC(info);
		else if (nc == columnDtl_purc_cl_ym) doDtl_purc_cl_ym_NC(info);
		else if (nc == columnDtl_pay_basis_dt) doDtl_pay_basis_dt_NC(info);
		else if (nc == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NC(info);
		else if (nc == columnDtl_arr_dt) doDtl_arr_dt_NC(info);
		else if (nc == columnDtl_arr_hm) doDtl_arr_hm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NC(info);
		else if (nc == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NC(info);
		else if (nc == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NC(info);
		else if (nc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NC(info);
		else if (nc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_wtax_amt) doDtl_wtax_amt_NC(info);
		else if (nc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl_po_dt) doDtl_po_dt_NC(info);
		else if (nc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NC(info);
		else if (nc == columnDtl_dlv_rqst_hm) doDtl_dlv_rqst_hm_NC(info);
		else if (nc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NC(info);
		else if (nc == columnDtl_base_cur_cd) doDtl_base_cur_cd_NC(info);
		else if (nc == columnDtl_base_cur_nm) doDtl_base_cur_nm_NC(info);
		else if (nc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NC(info);
		else if (nc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NC(info);
		else if (nc == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl_ptax_dt) doDtl_ptax_dt_NC(info);
		else if (nc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl_purc_typ) doDtl_purc_typ_NC(info);
		else if (nc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NC(info);
		else if (nc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd) doDtl_str_ln_cd_NC(info);
		else if (nc == columnDtl_str_ln_nm) doDtl_str_ln_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NC(info);
		else if (nc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_xrate_cd) doDtl_xrate_cd_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_ret_sppl_nm) doDtl_ret_sppl_nm_NC(info);
		else if (nc == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NC(info);
		else if (nc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NC(info);
		else if (nc == columnDtl_purc_tax_calc_typ) doDtl_purc_tax_calc_typ_NC(info);
		else if (nc == columnDtl_pay_spot_flg) doDtl_pay_spot_flg_NC(info);
		else if (nc == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NC(info);
		else if (nc == columnDtl_base_trd_unit_cd) doDtl_base_trd_unit_cd_NC(info);
		else if (nc == columnDtl_base_trd_unit_nm) doDtl_base_trd_unit_nm_NC(info);
		else if (nc == columnDtl_base_trd_unit_dec_place) doDtl_base_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_trd_cur_cd) doDtl_base_trd_cur_cd_NC(info);
		else if (nc == columnDtl_base_trd_cur_nm) doDtl_base_trd_cur_nm_NC(info);
		else if (nc == columnDtl_base_in_to_loc_wg_cd) doDtl_base_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl_base_in_to_loc_wg_nm) doDtl_base_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl_base_in_to_loc_cd) doDtl_base_in_to_loc_cd_NC(info);
		else if (nc == columnDtl_base_in_to_loc_nm) doDtl_base_in_to_loc_nm_NC(info);
		else if (nc == columnDtl_sbst_dt) doDtl_sbst_dt_NC(info);
		else if (nc == columnDtl_base_dt) doDtl_base_dt_NC(info);
		else if (nc == columnDtl_base_tax_cd) doDtl_base_tax_cd_NC(info);
		else if (nc == columnDtl_base_tax_nm) doDtl_base_tax_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NC(info);
		else if (nc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_asppl_cd) doDtl_asppl_cd_NC(info);
		else if (nc == columnDtl_asppl_nm) doDtl_asppl_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_mst_ap_dpt_cd) doDtl_mst_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_bsppl_cd) doDtl_bsppl_cd_NC(info);
		else if (nc == columnDtl_bsppl_nm) doDtl_bsppl_nm_NC(info);
		else if (nc == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NC(info);
		else if (nc == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_purc_act_no) doDtl_purc_act_no_NC(info);
		else if (nc == columnDtl_purc_act_seq) doDtl_purc_act_seq_NC(info);
		else if (nc == columnDtl_purc_act_rev) doDtl_purc_act_rev_NC(info);
		else if (nc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NC(info);
		else if (nc == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NC(info);
		else if (nc == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NC(info);
		else if (nc == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NC(info);
		else if (nc == columnDtl_purc_src_typ) doDtl_purc_src_typ_NC(info);
		else if (nc == columnDtl_purc_src_typ_nm) doDtl_purc_src_typ_nm_NC(info);
		else if (nc == columnDtl_purc_src_no) doDtl_purc_src_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_po_d_no) doDtl_po_d_no_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NC(info);
		else if (nc == columnDtl_rcpt_iv_d_no) doDtl_rcpt_iv_d_no_NC(info);
		else if (nc == columnDtl_ref_rcpt_iv_no) doDtl_ref_rcpt_iv_no_NC(info);
		else if (nc == columnDtl_purc_schd_no) doDtl_purc_schd_no_NC(info);
		else if (nc == columnDtl_arr_act_no) doDtl_arr_act_no_NC(info);
		else if (nc == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NC(info);
		else if (nc == columnDtl_purc_ret_act_rev) doDtl_purc_ret_act_rev_NC(info);
		else if (nc == columnDtl_purc_ret_act_d_no) doDtl_purc_ret_act_d_no_NC(info);
		else if (nc == columnDtl_purc_ret_act_io_no) doDtl_purc_ret_act_io_no_NC(info);
		else if (nc == columnDtl_bp_lot_no) doDtl_bp_lot_no_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NC(info);
		else if (nc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NC(info);
		else if (nc == columnDtl_ncv_flg) doDtl_ncv_flg_NC(info);
		else if (nc == columnDtl_edi_flg) doDtl_edi_flg_NC(info);
		else if (nc == columnDtl_sync_flg) doDtl_sync_flg_NC(info);
		else if (nc == columnDtl_temp_ap_flg) doDtl_temp_ap_flg_NC(info);
		else if (nc == columnDtl_accpt_dfct_flg) doDtl_accpt_dfct_flg_NC(info);
		else if (nc == columnDtl_re_arr_flg) doDtl_re_arr_flg_NC(info);
		else if (nc == columnDtl_tterm_cd1) doDtl_tterm_cd1_NC(info);
		else if (nc == columnDtl_tterm_nm1) doDtl_tterm_nm1_NC(info);
		else if (nc == columnDtl_tterm_rmrks1) doDtl_tterm_rmrks1_NC(info);
		else if (nc == columnDtl_tterm_cd2) doDtl_tterm_cd2_NC(info);
		else if (nc == columnDtl_tterm_nm2) doDtl_tterm_nm2_NC(info);
		else if (nc == columnDtl_tterm_rmrks2) doDtl_tterm_rmrks2_NC(info);
		else if (nc == columnDtl_tterm_cd3) doDtl_tterm_cd3_NC(info);
		else if (nc == columnDtl_tterm_nm3) doDtl_tterm_nm3_NC(info);
		else if (nc == columnDtl_tterm_rmrks3) doDtl_tterm_rmrks3_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NC(info);
		else if (nc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NC(info);
		else if (nc == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NC(info);
		else if (nc == columnDtl_purc_dscnt_loc_mng_typ) doDtl_purc_dscnt_loc_mng_typ_NC(info);
		else if (nc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_purc_act_sub_char1) doDtl_purc_act_sub_char1_NC(info);
		else if (nc == columnDtl_purc_act_sub_char2) doDtl_purc_act_sub_char2_NC(info);
		else if (nc == columnDtl_purc_act_sub_char3) doDtl_purc_act_sub_char3_NC(info);
		else if (nc == columnDtl_purc_act_d_sub_char1) doDtl_purc_act_d_sub_char1_NC(info);
		else if (nc == columnDtl_purc_act_d_sub_char2) doDtl_purc_act_d_sub_char2_NC(info);
		else if (nc == columnDtl_purc_act_d_sub_char3) doDtl_purc_act_d_sub_char3_NC(info);
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
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_hdr_edit_flg) doDtl_hdr_edit_flg_NC(info);
		else if (nc == columnDtl_purc_upd_cntr) doDtl_purc_upd_cntr_NC(info);
		else if (nc == columnDtl_purc_ret_upd_cntr) doDtl_purc_ret_upd_cntr_NC(info);
		else if (nc == columnDtl_xrate_base_dt) doDtl_xrate_base_dt_NC(info);
		else if (nc == columnDtl_tax_base_dt) doDtl_tax_base_dt_NC(info);
		else if (nc == columnDtl_purc_ret_dt) doDtl_purc_ret_dt_NC(info);
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
	 * [Fold2]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold2_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dscnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dscnt_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[edi_bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_bp_dlv_slip_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_temp_ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_temp_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NC(MCEventInfo info){
	}

	/**
	 * [UpriReq]パネルの[upri_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriReq_upri_dt_NC(MCEventInfo info){
	}

	/**
	 * [XrateReq]パネルの[xrate_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateReq_xrate_dt_NC(MCEventInfo info){
	}

	/**
	 * [TaxReq]パネルの[tax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxReq_tax_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_hm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_hm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ret_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_sppl_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_tax_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sbst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sbst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ncv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ncv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_dfct_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dfct_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[re_arr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_re_arr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dscnt_loc_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dscnt_loc_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_edit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_edit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_dt_NC(MCEventInfo info){
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
		else if (ne == Fold2Tab) doFold2_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_disp_unit_Group) doCnd_disp_unit_NE(info);
		else if (ne == Cnd_purc_flg) doCnd_purc_flg_NE(info);
		else if (ne == Cnd_ret_flg) doCnd_ret_flg_NE(info);
		else if (ne == Cnd_dscnt_flg) doCnd_dscnt_flg_NE(info);
		else if (ne == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NE(info);
		else if (ne == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NE(info);
		else if (ne == Cnd_upri_flg) doCnd_upri_flg_NE(info);
		else if (ne == Cnd_interim_flg) doCnd_interim_flg_NE(info);
		else if (ne == Cnd_subcon_flg) doCnd_subcon_flg_NE(info);
		else if (ne == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NE(info);
		else if (ne == Cnd_purc_dt_from) doCnd_purc_dt_from_NE(info);
		else if (ne == Cnd_purc_dt_to) doCnd_purc_dt_to_NE(info);
		else if (ne == Cnd_ac_ym_from) doCnd_ac_ym_from_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ac_dt_from) doCnd_ac_dt_from_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
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
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NE(info);
		else if (ne == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NE(info);
		else if (ne == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NE(info);
		else if (ne == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_sppl_itm_cd) doCnd_sppl_itm_cd_NE(info);
		else if (ne == Cnd_sppl_itm_nm) doCnd_sppl_itm_nm_NE(info);
		else if (ne == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NE(info);
		else if (ne == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_po_d_no) doCnd_po_d_no_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NE(info);
		else if (ne == Cnd_purc_src_typ) doCnd_purc_src_typ_NE(info);
		else if (ne == Cnd_purc_src_typ_nm) doCnd_purc_src_typ_nm_NE(info);
		else if (ne == Cnd_purc_src_no) doCnd_purc_src_no_NE(info);
		else if (ne == Cnd_arr_act_no) doCnd_arr_act_no_NE(info);
		else if (ne == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NE(info);
		else if (ne == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NE(info);
		else if (ne == Cnd_edi_bp_dlv_slip_no) doCnd_edi_bp_dlv_slip_no_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_foreign_flg) doCnd_foreign_flg_NE(info);
		else if (ne == Cnd_tax_cd) doCnd_tax_cd_NE(info);
		else if (ne == Cnd_tax_nm) doCnd_tax_nm_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_dtl_trd_d_rmrks) doCnd_dtl_trd_d_rmrks_NE(info);
		else if (ne == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == Cnd_incl_temp_ap_flg) doCnd_incl_temp_ap_flg_NE(info);
		else if (ne == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NE(info);
		else if (ne == UpriReq_upri_dt) doUpriReq_upri_dt_NE(info);
		else if (ne == XrateReq_xrate_dt) doXrateReq_xrate_dt_NE(info);
		else if (ne == TaxReq_tax_dt) doTaxReq_tax_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_purc_dt) doDtl_purc_dt_NE(info);
		else if (ne == columnDtl_ac_ym) doDtl_ac_ym_NE(info);
		else if (ne == columnDtl_ac_dt) doDtl_ac_dt_NE(info);
		else if (ne == columnDtl_purc_cl_ym) doDtl_purc_cl_ym_NE(info);
		else if (ne == columnDtl_pay_basis_dt) doDtl_pay_basis_dt_NE(info);
		else if (ne == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NE(info);
		else if (ne == columnDtl_arr_dt) doDtl_arr_dt_NE(info);
		else if (ne == columnDtl_arr_hm) doDtl_arr_hm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NE(info);
		else if (ne == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NE(info);
		else if (ne == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NE(info);
		else if (ne == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NE(info);
		else if (ne == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_wtax_amt) doDtl_wtax_amt_NE(info);
		else if (ne == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl_po_dt) doDtl_po_dt_NE(info);
		else if (ne == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NE(info);
		else if (ne == columnDtl_dlv_rqst_hm) doDtl_dlv_rqst_hm_NE(info);
		else if (ne == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NE(info);
		else if (ne == columnDtl_base_cur_cd) doDtl_base_cur_cd_NE(info);
		else if (ne == columnDtl_base_cur_nm) doDtl_base_cur_nm_NE(info);
		else if (ne == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NE(info);
		else if (ne == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NE(info);
		else if (ne == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl_ptax_dt) doDtl_ptax_dt_NE(info);
		else if (ne == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl_purc_typ) doDtl_purc_typ_NE(info);
		else if (ne == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NE(info);
		else if (ne == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd) doDtl_str_ln_cd_NE(info);
		else if (ne == columnDtl_str_ln_nm) doDtl_str_ln_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NE(info);
		else if (ne == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_xrate_cd) doDtl_xrate_cd_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_ret_sppl_nm) doDtl_ret_sppl_nm_NE(info);
		else if (ne == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NE(info);
		else if (ne == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NE(info);
		else if (ne == columnDtl_purc_tax_calc_typ) doDtl_purc_tax_calc_typ_NE(info);
		else if (ne == columnDtl_pay_spot_flg) doDtl_pay_spot_flg_NE(info);
		else if (ne == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NE(info);
		else if (ne == columnDtl_base_trd_unit_cd) doDtl_base_trd_unit_cd_NE(info);
		else if (ne == columnDtl_base_trd_unit_nm) doDtl_base_trd_unit_nm_NE(info);
		else if (ne == columnDtl_base_trd_unit_dec_place) doDtl_base_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_trd_cur_cd) doDtl_base_trd_cur_cd_NE(info);
		else if (ne == columnDtl_base_trd_cur_nm) doDtl_base_trd_cur_nm_NE(info);
		else if (ne == columnDtl_base_in_to_loc_wg_cd) doDtl_base_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl_base_in_to_loc_wg_nm) doDtl_base_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl_base_in_to_loc_cd) doDtl_base_in_to_loc_cd_NE(info);
		else if (ne == columnDtl_base_in_to_loc_nm) doDtl_base_in_to_loc_nm_NE(info);
		else if (ne == columnDtl_sbst_dt) doDtl_sbst_dt_NE(info);
		else if (ne == columnDtl_base_dt) doDtl_base_dt_NE(info);
		else if (ne == columnDtl_base_tax_cd) doDtl_base_tax_cd_NE(info);
		else if (ne == columnDtl_base_tax_nm) doDtl_base_tax_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NE(info);
		else if (ne == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_asppl_cd) doDtl_asppl_cd_NE(info);
		else if (ne == columnDtl_asppl_nm) doDtl_asppl_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_mst_ap_dpt_cd) doDtl_mst_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_bsppl_cd) doDtl_bsppl_cd_NE(info);
		else if (ne == columnDtl_bsppl_nm) doDtl_bsppl_nm_NE(info);
		else if (ne == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NE(info);
		else if (ne == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_purc_act_no) doDtl_purc_act_no_NE(info);
		else if (ne == columnDtl_purc_act_seq) doDtl_purc_act_seq_NE(info);
		else if (ne == columnDtl_purc_act_rev) doDtl_purc_act_rev_NE(info);
		else if (ne == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NE(info);
		else if (ne == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NE(info);
		else if (ne == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NE(info);
		else if (ne == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NE(info);
		else if (ne == columnDtl_purc_src_typ) doDtl_purc_src_typ_NE(info);
		else if (ne == columnDtl_purc_src_typ_nm) doDtl_purc_src_typ_nm_NE(info);
		else if (ne == columnDtl_purc_src_no) doDtl_purc_src_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_po_d_no) doDtl_po_d_no_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NE(info);
		else if (ne == columnDtl_rcpt_iv_d_no) doDtl_rcpt_iv_d_no_NE(info);
		else if (ne == columnDtl_ref_rcpt_iv_no) doDtl_ref_rcpt_iv_no_NE(info);
		else if (ne == columnDtl_purc_schd_no) doDtl_purc_schd_no_NE(info);
		else if (ne == columnDtl_arr_act_no) doDtl_arr_act_no_NE(info);
		else if (ne == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NE(info);
		else if (ne == columnDtl_purc_ret_act_rev) doDtl_purc_ret_act_rev_NE(info);
		else if (ne == columnDtl_purc_ret_act_d_no) doDtl_purc_ret_act_d_no_NE(info);
		else if (ne == columnDtl_purc_ret_act_io_no) doDtl_purc_ret_act_io_no_NE(info);
		else if (ne == columnDtl_bp_lot_no) doDtl_bp_lot_no_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NE(info);
		else if (ne == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NE(info);
		else if (ne == columnDtl_ncv_flg) doDtl_ncv_flg_NE(info);
		else if (ne == columnDtl_edi_flg) doDtl_edi_flg_NE(info);
		else if (ne == columnDtl_sync_flg) doDtl_sync_flg_NE(info);
		else if (ne == columnDtl_temp_ap_flg) doDtl_temp_ap_flg_NE(info);
		else if (ne == columnDtl_accpt_dfct_flg) doDtl_accpt_dfct_flg_NE(info);
		else if (ne == columnDtl_re_arr_flg) doDtl_re_arr_flg_NE(info);
		else if (ne == columnDtl_tterm_cd1) doDtl_tterm_cd1_NE(info);
		else if (ne == columnDtl_tterm_nm1) doDtl_tterm_nm1_NE(info);
		else if (ne == columnDtl_tterm_rmrks1) doDtl_tterm_rmrks1_NE(info);
		else if (ne == columnDtl_tterm_cd2) doDtl_tterm_cd2_NE(info);
		else if (ne == columnDtl_tterm_nm2) doDtl_tterm_nm2_NE(info);
		else if (ne == columnDtl_tterm_rmrks2) doDtl_tterm_rmrks2_NE(info);
		else if (ne == columnDtl_tterm_cd3) doDtl_tterm_cd3_NE(info);
		else if (ne == columnDtl_tterm_nm3) doDtl_tterm_nm3_NE(info);
		else if (ne == columnDtl_tterm_rmrks3) doDtl_tterm_rmrks3_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NE(info);
		else if (ne == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_lot_no) doDtl_lot_no_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NE(info);
		else if (ne == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NE(info);
		else if (ne == columnDtl_purc_dscnt_loc_mng_typ) doDtl_purc_dscnt_loc_mng_typ_NE(info);
		else if (ne == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_purc_act_sub_char1) doDtl_purc_act_sub_char1_NE(info);
		else if (ne == columnDtl_purc_act_sub_char2) doDtl_purc_act_sub_char2_NE(info);
		else if (ne == columnDtl_purc_act_sub_char3) doDtl_purc_act_sub_char3_NE(info);
		else if (ne == columnDtl_purc_act_d_sub_char1) doDtl_purc_act_d_sub_char1_NE(info);
		else if (ne == columnDtl_purc_act_d_sub_char2) doDtl_purc_act_d_sub_char2_NE(info);
		else if (ne == columnDtl_purc_act_d_sub_char3) doDtl_purc_act_d_sub_char3_NE(info);
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
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_hdr_edit_flg) doDtl_hdr_edit_flg_NE(info);
		else if (ne == columnDtl_purc_upd_cntr) doDtl_purc_upd_cntr_NE(info);
		else if (ne == columnDtl_purc_ret_upd_cntr) doDtl_purc_ret_upd_cntr_NE(info);
		else if (ne == columnDtl_xrate_base_dt) doDtl_xrate_base_dt_NE(info);
		else if (ne == columnDtl_tax_base_dt) doDtl_tax_base_dt_NE(info);
		else if (ne == columnDtl_purc_ret_dt) doDtl_purc_ret_dt_NE(info);
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
	 * [Fold2]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold2_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dscnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dscnt_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[edi_bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_bp_dlv_slip_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_temp_ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_temp_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NE(MCEventInfo info){
	}

	/**
	 * [UpriReq]パネルの[upri_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriReq_upri_dt_NE(MCEventInfo info){
	}

	/**
	 * [XrateReq]パネルの[xrate_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateReq_xrate_dt_NE(MCEventInfo info){
	}

	/**
	 * [TaxReq]パネルの[tax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxReq_tax_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_hm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[po_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_hm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ret_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_sppl_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_tax_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sbst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sbst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ncv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ncv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_dfct_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dfct_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[re_arr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_re_arr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dscnt_loc_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dscnt_loc_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_edit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_edit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_dt_NE(MCEventInfo info){
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
		else if (nx == Fold2Tab) doFold2_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_disp_unit_Group) doCnd_disp_unit_NX(info);
		else if (nx == Cnd_purc_flg) doCnd_purc_flg_NX(info);
		else if (nx == Cnd_ret_flg) doCnd_ret_flg_NX(info);
		else if (nx == Cnd_dscnt_flg) doCnd_dscnt_flg_NX(info);
		else if (nx == Cnd_iv_trgt_flg) doCnd_iv_trgt_flg_NX(info);
		else if (nx == Cnd_iv_not_trgt_flg) doCnd_iv_not_trgt_flg_NX(info);
		else if (nx == Cnd_upri_flg) doCnd_upri_flg_NX(info);
		else if (nx == Cnd_interim_flg) doCnd_interim_flg_NX(info);
		else if (nx == Cnd_subcon_flg) doCnd_subcon_flg_NX(info);
		else if (nx == Cnd_not_subcon_flg) doCnd_not_subcon_flg_NX(info);
		else if (nx == Cnd_purc_dt_from) doCnd_purc_dt_from_NX(info);
		else if (nx == Cnd_purc_dt_to) doCnd_purc_dt_to_NX(info);
		else if (nx == Cnd_ac_ym_from) doCnd_ac_ym_from_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ac_dt_from) doCnd_ac_dt_from_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
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
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_purc_usr_cd) doCnd_purc_usr_cd_NX(info);
		else if (nx == Cnd_purc_usr_nm) doCnd_purc_usr_nm_NX(info);
		else if (nx == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_NX(info);
		else if (nx == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_sppl_itm_cd) doCnd_sppl_itm_cd_NX(info);
		else if (nx == Cnd_sppl_itm_nm) doCnd_sppl_itm_nm_NX(info);
		else if (nx == Cnd_cst_itm_cd) doCnd_cst_itm_cd_NX(info);
		else if (nx == Cnd_cst_itm_nm) doCnd_cst_itm_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_po_d_no) doCnd_po_d_no_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_purc_act_d_no) doCnd_purc_act_d_no_NX(info);
		else if (nx == Cnd_purc_src_typ) doCnd_purc_src_typ_NX(info);
		else if (nx == Cnd_purc_src_typ_nm) doCnd_purc_src_typ_nm_NX(info);
		else if (nx == Cnd_purc_src_no) doCnd_purc_src_no_NX(info);
		else if (nx == Cnd_arr_act_no) doCnd_arr_act_no_NX(info);
		else if (nx == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_NX(info);
		else if (nx == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_NX(info);
		else if (nx == Cnd_edi_bp_dlv_slip_no) doCnd_edi_bp_dlv_slip_no_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_foreign_flg) doCnd_foreign_flg_NX(info);
		else if (nx == Cnd_tax_cd) doCnd_tax_cd_NX(info);
		else if (nx == Cnd_tax_nm) doCnd_tax_nm_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_dtl_trd_d_rmrks) doCnd_dtl_trd_d_rmrks_NX(info);
		else if (nx == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == Cnd_dis_can_disp_flg) doCnd_dis_can_disp_flg_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == Cnd_incl_temp_ap_flg) doCnd_incl_temp_ap_flg_NX(info);
		else if (nx == Cnd_sign_rev_flg) doCnd_sign_rev_flg_NX(info);
		else if (nx == UpriReq_upri_dt) doUpriReq_upri_dt_NX(info);
		else if (nx == XrateReq_xrate_dt) doXrateReq_xrate_dt_NX(info);
		else if (nx == TaxReq_tax_dt) doTaxReq_tax_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_purc_dt) doDtl_purc_dt_NX(info);
		else if (nx == columnDtl_ac_ym) doDtl_ac_ym_NX(info);
		else if (nx == columnDtl_ac_dt) doDtl_ac_dt_NX(info);
		else if (nx == columnDtl_purc_cl_ym) doDtl_purc_cl_ym_NX(info);
		else if (nx == columnDtl_pay_basis_dt) doDtl_pay_basis_dt_NX(info);
		else if (nx == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_NX(info);
		else if (nx == columnDtl_arr_dt) doDtl_arr_dt_NX(info);
		else if (nx == columnDtl_arr_hm) doDtl_arr_hm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_flg) doDtl_ap_dpt_flg_NX(info);
		else if (nx == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_NX(info);
		else if (nx == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_NX(info);
		else if (nx == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_NX(info);
		else if (nx == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_wtax_amt) doDtl_wtax_amt_NX(info);
		else if (nx == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl_po_dt) doDtl_po_dt_NX(info);
		else if (nx == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_NX(info);
		else if (nx == columnDtl_dlv_rqst_hm) doDtl_dlv_rqst_hm_NX(info);
		else if (nx == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_NX(info);
		else if (nx == columnDtl_base_cur_cd) doDtl_base_cur_cd_NX(info);
		else if (nx == columnDtl_base_cur_nm) doDtl_base_cur_nm_NX(info);
		else if (nx == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_xrate_inpt_flg) doDtl_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_NX(info);
		else if (nx == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_NX(info);
		else if (nx == columnDtl_ptax_xrate_inpt_flg) doDtl_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl_ptax_dt) doDtl_ptax_dt_NX(info);
		else if (nx == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl_purc_typ) doDtl_purc_typ_NX(info);
		else if (nx == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NX(info);
		else if (nx == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd) doDtl_str_ln_cd_NX(info);
		else if (nx == columnDtl_str_ln_nm) doDtl_str_ln_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_NX(info);
		else if (nx == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_xrate_cd) doDtl_xrate_cd_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_ret_sppl_nm) doDtl_ret_sppl_nm_NX(info);
		else if (nx == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_NX(info);
		else if (nx == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_NX(info);
		else if (nx == columnDtl_purc_tax_calc_typ) doDtl_purc_tax_calc_typ_NX(info);
		else if (nx == columnDtl_pay_spot_flg) doDtl_pay_spot_flg_NX(info);
		else if (nx == columnDtl_sppl_iv_flg) doDtl_sppl_iv_flg_NX(info);
		else if (nx == columnDtl_base_trd_unit_cd) doDtl_base_trd_unit_cd_NX(info);
		else if (nx == columnDtl_base_trd_unit_nm) doDtl_base_trd_unit_nm_NX(info);
		else if (nx == columnDtl_base_trd_unit_dec_place) doDtl_base_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_trd_cur_cd) doDtl_base_trd_cur_cd_NX(info);
		else if (nx == columnDtl_base_trd_cur_nm) doDtl_base_trd_cur_nm_NX(info);
		else if (nx == columnDtl_base_in_to_loc_wg_cd) doDtl_base_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl_base_in_to_loc_wg_nm) doDtl_base_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl_base_in_to_loc_cd) doDtl_base_in_to_loc_cd_NX(info);
		else if (nx == columnDtl_base_in_to_loc_nm) doDtl_base_in_to_loc_nm_NX(info);
		else if (nx == columnDtl_sbst_dt) doDtl_sbst_dt_NX(info);
		else if (nx == columnDtl_base_dt) doDtl_base_dt_NX(info);
		else if (nx == columnDtl_base_tax_cd) doDtl_base_tax_cd_NX(info);
		else if (nx == columnDtl_base_tax_nm) doDtl_base_tax_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_NX(info);
		else if (nx == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_asppl_cd) doDtl_asppl_cd_NX(info);
		else if (nx == columnDtl_asppl_nm) doDtl_asppl_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_mst_ap_dpt_cd) doDtl_mst_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_bsppl_cd) doDtl_bsppl_cd_NX(info);
		else if (nx == columnDtl_bsppl_nm) doDtl_bsppl_nm_NX(info);
		else if (nx == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_NX(info);
		else if (nx == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_purc_act_no) doDtl_purc_act_no_NX(info);
		else if (nx == columnDtl_purc_act_seq) doDtl_purc_act_seq_NX(info);
		else if (nx == columnDtl_purc_act_rev) doDtl_purc_act_rev_NX(info);
		else if (nx == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_NX(info);
		else if (nx == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_NX(info);
		else if (nx == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_NX(info);
		else if (nx == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_NX(info);
		else if (nx == columnDtl_purc_src_typ) doDtl_purc_src_typ_NX(info);
		else if (nx == columnDtl_purc_src_typ_nm) doDtl_purc_src_typ_nm_NX(info);
		else if (nx == columnDtl_purc_src_no) doDtl_purc_src_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_po_d_no) doDtl_po_d_no_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_NX(info);
		else if (nx == columnDtl_rcpt_iv_d_no) doDtl_rcpt_iv_d_no_NX(info);
		else if (nx == columnDtl_ref_rcpt_iv_no) doDtl_ref_rcpt_iv_no_NX(info);
		else if (nx == columnDtl_purc_schd_no) doDtl_purc_schd_no_NX(info);
		else if (nx == columnDtl_arr_act_no) doDtl_arr_act_no_NX(info);
		else if (nx == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_NX(info);
		else if (nx == columnDtl_purc_ret_act_rev) doDtl_purc_ret_act_rev_NX(info);
		else if (nx == columnDtl_purc_ret_act_d_no) doDtl_purc_ret_act_d_no_NX(info);
		else if (nx == columnDtl_purc_ret_act_io_no) doDtl_purc_ret_act_io_no_NX(info);
		else if (nx == columnDtl_bp_lot_no) doDtl_bp_lot_no_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NX(info);
		else if (nx == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NX(info);
		else if (nx == columnDtl_ncv_flg) doDtl_ncv_flg_NX(info);
		else if (nx == columnDtl_edi_flg) doDtl_edi_flg_NX(info);
		else if (nx == columnDtl_sync_flg) doDtl_sync_flg_NX(info);
		else if (nx == columnDtl_temp_ap_flg) doDtl_temp_ap_flg_NX(info);
		else if (nx == columnDtl_accpt_dfct_flg) doDtl_accpt_dfct_flg_NX(info);
		else if (nx == columnDtl_re_arr_flg) doDtl_re_arr_flg_NX(info);
		else if (nx == columnDtl_tterm_cd1) doDtl_tterm_cd1_NX(info);
		else if (nx == columnDtl_tterm_nm1) doDtl_tterm_nm1_NX(info);
		else if (nx == columnDtl_tterm_rmrks1) doDtl_tterm_rmrks1_NX(info);
		else if (nx == columnDtl_tterm_cd2) doDtl_tterm_cd2_NX(info);
		else if (nx == columnDtl_tterm_nm2) doDtl_tterm_nm2_NX(info);
		else if (nx == columnDtl_tterm_rmrks2) doDtl_tterm_rmrks2_NX(info);
		else if (nx == columnDtl_tterm_cd3) doDtl_tterm_cd3_NX(info);
		else if (nx == columnDtl_tterm_nm3) doDtl_tterm_nm3_NX(info);
		else if (nx == columnDtl_tterm_rmrks3) doDtl_tterm_rmrks3_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_NX(info);
		else if (nx == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_lot_no) doDtl_lot_no_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_NX(info);
		else if (nx == columnDtl_xpns_purc_flg) doDtl_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_not_xpns_purc_flg) doDtl_not_xpns_purc_flg_NX(info);
		else if (nx == columnDtl_purc_dscnt_loc_mng_typ) doDtl_purc_dscnt_loc_mng_typ_NX(info);
		else if (nx == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_purc_act_sub_char1) doDtl_purc_act_sub_char1_NX(info);
		else if (nx == columnDtl_purc_act_sub_char2) doDtl_purc_act_sub_char2_NX(info);
		else if (nx == columnDtl_purc_act_sub_char3) doDtl_purc_act_sub_char3_NX(info);
		else if (nx == columnDtl_purc_act_d_sub_char1) doDtl_purc_act_d_sub_char1_NX(info);
		else if (nx == columnDtl_purc_act_d_sub_char2) doDtl_purc_act_d_sub_char2_NX(info);
		else if (nx == columnDtl_purc_act_d_sub_char3) doDtl_purc_act_d_sub_char3_NX(info);
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
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_hdr_edit_flg) doDtl_hdr_edit_flg_NX(info);
		else if (nx == columnDtl_purc_upd_cntr) doDtl_purc_upd_cntr_NX(info);
		else if (nx == columnDtl_purc_ret_upd_cntr) doDtl_purc_ret_upd_cntr_NX(info);
		else if (nx == columnDtl_xrate_base_dt) doDtl_xrate_base_dt_NX(info);
		else if (nx == columnDtl_tax_base_dt) doDtl_tax_base_dt_NX(info);
		else if (nx == columnDtl_purc_ret_dt) doDtl_purc_ret_dt_NX(info);
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
	 * [Fold2]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold2_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_unit_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ret_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ret_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dscnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dscnt_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[edi_bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_bp_dlv_slip_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dis_can_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dis_can_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_temp_ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_temp_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rev_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rev_flg_NX(MCEventInfo info){
	}

	/**
	 * [UpriReq]パネルの[upri_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriReq_upri_dt_NX(MCEventInfo info){
	}

	/**
	 * [XrateReq]パネルの[xrate_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateReq_xrate_dt_NX(MCEventInfo info){
	}

	/**
	 * [TaxReq]パネルの[tax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxReq_tax_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_hm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[po_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_hm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_inpt_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ptax_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ret_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_sppl_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_tax_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sbst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sbst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ncv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ncv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[temp_ap_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_temp_ap_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_dfct_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_dfct_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[re_arr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_re_arr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dscnt_loc_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dscnt_loc_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdr_edit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdr_edit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_dt_NX(MCEventInfo info){
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
		if (lc == Cnd_purc_dt_from) doCnd_purc_dt_from_LC(info);
		else if (lc == Cnd_purc_dt_to) doCnd_purc_dt_to_LC(info);
		else if (lc == Cnd_ac_ym_from) doCnd_ac_ym_from_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ac_dt_from) doCnd_ac_dt_from_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
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
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_purc_usr_cd) doCnd_purc_usr_cd_LC(info);
		else if (lc == Cnd_purc_usr_nm) doCnd_purc_usr_nm_LC(info);
		else if (lc == Cnd_purc_dpt_cd) doCnd_purc_dpt_cd_LC(info);
		else if (lc == Cnd_purc_dpt_nm) doCnd_purc_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_sppl_itm_cd) doCnd_sppl_itm_cd_LC(info);
		else if (lc == Cnd_sppl_itm_nm) doCnd_sppl_itm_nm_LC(info);
		else if (lc == Cnd_cst_itm_cd) doCnd_cst_itm_cd_LC(info);
		else if (lc == Cnd_cst_itm_nm) doCnd_cst_itm_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_d_no) doCnd_rcpt_iv_d_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_po_d_no) doCnd_po_d_no_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_purc_act_d_no) doCnd_purc_act_d_no_LC(info);
		else if (lc == Cnd_purc_src_typ) doCnd_purc_src_typ_LC(info);
		else if (lc == Cnd_purc_src_typ_nm) doCnd_purc_src_typ_nm_LC(info);
		else if (lc == Cnd_purc_src_no) doCnd_purc_src_no_LC(info);
		else if (lc == Cnd_arr_act_no) doCnd_arr_act_no_LC(info);
		else if (lc == Cnd_purc_ret_act_no) doCnd_purc_ret_act_no_LC(info);
		else if (lc == Cnd_purc_ret_act_d_no) doCnd_purc_ret_act_d_no_LC(info);
		else if (lc == Cnd_edi_bp_dlv_slip_no) doCnd_edi_bp_dlv_slip_no_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_tax_cd) doCnd_tax_cd_LC(info);
		else if (lc == Cnd_tax_nm) doCnd_tax_nm_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_dtl_trd_d_rmrks) doCnd_dtl_trd_d_rmrks_LC(info);
		else if (lc == Cnd_dtl_intr_rmrks) doCnd_dtl_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == UpriReq_upri_dt) doUpriReq_upri_dt_LC(info);
		else if (lc == XrateReq_xrate_dt) doXrateReq_xrate_dt_LC(info);
		else if (lc == TaxReq_tax_dt) doTaxReq_tax_dt_LC(info);
		else if (lc == columnDtl_slip_sts_typ_nm) doDtl_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_purc_dt) doDtl_purc_dt_LC(info);
		else if (lc == columnDtl_ac_ym) doDtl_ac_ym_LC(info);
		else if (lc == columnDtl_ac_dt) doDtl_ac_dt_LC(info);
		else if (lc == columnDtl_purc_cl_ym) doDtl_purc_cl_ym_LC(info);
		else if (lc == columnDtl_pay_basis_dt) doDtl_pay_basis_dt_LC(info);
		else if (lc == columnDtl_pay_schd_dt) doDtl_pay_schd_dt_LC(info);
		else if (lc == columnDtl_arr_dt) doDtl_arr_dt_LC(info);
		else if (lc == columnDtl_arr_hm) doDtl_arr_hm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_purc_dpt_wg_cd) doDtl_purc_dpt_wg_cd_LC(info);
		else if (lc == columnDtl_purc_dpt_wg_nm) doDtl_purc_dpt_wg_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_trd_cur_cd) doDtl_trd_cur_cd_LC(info);
		else if (lc == columnDtl_trd_cur_nm) doDtl_trd_cur_nm_LC(info);
		else if (lc == columnDtl_trd_cur_amt_dec_place) doDtl_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_trd_cur_upri_dec_place) doDtl_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_wtax_amt) doDtl_wtax_amt_LC(info);
		else if (lc == columnDtl_wtax_rnd_typ) doDtl_wtax_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ) doDtl_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl_purc_upri_req_typ_nm) doDtl_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl_po_dt) doDtl_po_dt_LC(info);
		else if (lc == columnDtl_dlv_rqst_dt) doDtl_dlv_rqst_dt_LC(info);
		else if (lc == columnDtl_dlv_rqst_hm) doDtl_dlv_rqst_hm_LC(info);
		else if (lc == columnDtl_purc_schd_dt) doDtl_purc_schd_dt_LC(info);
		else if (lc == columnDtl_base_cur_cd) doDtl_base_cur_cd_LC(info);
		else if (lc == columnDtl_base_cur_nm) doDtl_base_cur_nm_LC(info);
		else if (lc == columnDtl_base_cur_amt_dec_place) doDtl_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_base_cur_upri_dec_place) doDtl_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_cd) doDtl_ptax_cur_cd_LC(info);
		else if (lc == columnDtl_ptax_cur_nm) doDtl_ptax_cur_nm_LC(info);
		else if (lc == columnDtl_ptax_dt) doDtl_ptax_dt_LC(info);
		else if (lc == columnDtl_ptax_cur_amt_dec_place) doDtl_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl_ptax_cur_upri_dec_place) doDtl_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl_purc_typ) doDtl_purc_typ_LC(info);
		else if (lc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_LC(info);
		else if (lc == columnDtl_in_to_loc_cd) doDtl_in_to_loc_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_nm) doDtl_in_to_loc_nm_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_cd) doDtl_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_in_to_loc_wg_nm) doDtl_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		else if (lc == columnDtl_str_ln_nm) doDtl_str_ln_nm_LC(info);
		else if (lc == columnDtl_in_to_loc_cal_cd) doDtl_in_to_loc_cal_cd_LC(info);
		else if (lc == columnDtl_outsrc_sppl_cd) doDtl_outsrc_sppl_cd_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_xrate_cd) doDtl_xrate_cd_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_ret_sppl_nm) doDtl_ret_sppl_nm_LC(info);
		else if (lc == columnDtl_sppl_cal_cd) doDtl_sppl_cal_cd_LC(info);
		else if (lc == columnDtl_purc_amt_rnd_typ) doDtl_purc_amt_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_tax_rnd_typ) doDtl_purc_tax_rnd_typ_LC(info);
		else if (lc == columnDtl_purc_tax_calc_typ) doDtl_purc_tax_calc_typ_LC(info);
		else if (lc == columnDtl_base_trd_unit_cd) doDtl_base_trd_unit_cd_LC(info);
		else if (lc == columnDtl_base_trd_unit_nm) doDtl_base_trd_unit_nm_LC(info);
		else if (lc == columnDtl_base_trd_unit_dec_place) doDtl_base_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_trd_cur_cd) doDtl_base_trd_cur_cd_LC(info);
		else if (lc == columnDtl_base_trd_cur_nm) doDtl_base_trd_cur_nm_LC(info);
		else if (lc == columnDtl_base_in_to_loc_wg_cd) doDtl_base_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl_base_in_to_loc_wg_nm) doDtl_base_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl_base_in_to_loc_cd) doDtl_base_in_to_loc_cd_LC(info);
		else if (lc == columnDtl_base_in_to_loc_nm) doDtl_base_in_to_loc_nm_LC(info);
		else if (lc == columnDtl_sbst_dt) doDtl_sbst_dt_LC(info);
		else if (lc == columnDtl_base_dt) doDtl_base_dt_LC(info);
		else if (lc == columnDtl_base_tax_cd) doDtl_base_tax_cd_LC(info);
		else if (lc == columnDtl_base_tax_nm) doDtl_base_tax_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_outsrc_itm_ord_no) doDtl_outsrc_itm_ord_no_LC(info);
		else if (lc == columnDtl_rqst_avl_rqst_dt) doDtl_rqst_avl_rqst_dt_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_asppl_cd) doDtl_asppl_cd_LC(info);
		else if (lc == columnDtl_asppl_nm) doDtl_asppl_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_mst_ap_dpt_cd) doDtl_mst_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_bsppl_cd) doDtl_bsppl_cd_LC(info);
		else if (lc == columnDtl_bsppl_nm) doDtl_bsppl_nm_LC(info);
		else if (lc == columnDtl_bp_dlv_slip_no) doDtl_bp_dlv_slip_no_LC(info);
		else if (lc == columnDtl_bp_dlv_slip_d_no) doDtl_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_purc_act_no) doDtl_purc_act_no_LC(info);
		else if (lc == columnDtl_purc_act_seq) doDtl_purc_act_seq_LC(info);
		else if (lc == columnDtl_purc_act_rev) doDtl_purc_act_rev_LC(info);
		else if (lc == columnDtl_purc_act_d_no) doDtl_purc_act_d_no_LC(info);
		else if (lc == columnDtl_purc_act_d_seq) doDtl_purc_act_d_seq_LC(info);
		else if (lc == columnDtl_purc_act_io_no) doDtl_purc_act_io_no_LC(info);
		else if (lc == columnDtl_base_purc_ac_dt) doDtl_base_purc_ac_dt_LC(info);
		else if (lc == columnDtl_purc_src_typ) doDtl_purc_src_typ_LC(info);
		else if (lc == columnDtl_purc_src_typ_nm) doDtl_purc_src_typ_nm_LC(info);
		else if (lc == columnDtl_purc_src_no) doDtl_purc_src_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_po_d_no) doDtl_po_d_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_rcpt_iv_no) doDtl_rcpt_iv_no_LC(info);
		else if (lc == columnDtl_rcpt_iv_d_no) doDtl_rcpt_iv_d_no_LC(info);
		else if (lc == columnDtl_ref_rcpt_iv_no) doDtl_ref_rcpt_iv_no_LC(info);
		else if (lc == columnDtl_purc_schd_no) doDtl_purc_schd_no_LC(info);
		else if (lc == columnDtl_arr_act_no) doDtl_arr_act_no_LC(info);
		else if (lc == columnDtl_purc_ret_act_no) doDtl_purc_ret_act_no_LC(info);
		else if (lc == columnDtl_purc_ret_act_rev) doDtl_purc_ret_act_rev_LC(info);
		else if (lc == columnDtl_purc_ret_act_d_no) doDtl_purc_ret_act_d_no_LC(info);
		else if (lc == columnDtl_purc_ret_act_io_no) doDtl_purc_ret_act_io_no_LC(info);
		else if (lc == columnDtl_bp_lot_no) doDtl_bp_lot_no_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_LC(info);
		else if (lc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_LC(info);
		else if (lc == columnDtl_tterm_cd1) doDtl_tterm_cd1_LC(info);
		else if (lc == columnDtl_tterm_nm1) doDtl_tterm_nm1_LC(info);
		else if (lc == columnDtl_tterm_rmrks1) doDtl_tterm_rmrks1_LC(info);
		else if (lc == columnDtl_tterm_cd2) doDtl_tterm_cd2_LC(info);
		else if (lc == columnDtl_tterm_nm2) doDtl_tterm_nm2_LC(info);
		else if (lc == columnDtl_tterm_rmrks2) doDtl_tterm_rmrks2_LC(info);
		else if (lc == columnDtl_tterm_cd3) doDtl_tterm_cd3_LC(info);
		else if (lc == columnDtl_tterm_nm3) doDtl_tterm_nm3_LC(info);
		else if (lc == columnDtl_tterm_rmrks3) doDtl_tterm_rmrks3_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_sppl_itm_cd) doDtl_sppl_itm_cd_LC(info);
		else if (lc == columnDtl_sppl_itm_nm) doDtl_sppl_itm_nm_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_purc_rsn_nm) doDtl_purc_rsn_nm_LC(info);
		else if (lc == columnDtl_purc_dscnt_loc_mng_typ) doDtl_purc_dscnt_loc_mng_typ_LC(info);
		else if (lc == columnDtl_bd_lot_mng_typ) doDtl_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_mng_typ) doDtl_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_bd_lot_no_typ) doDtl_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sublot_no_typ) doDtl_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl_bd_sno1_mng_typ) doDtl_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno2_mng_typ) doDtl_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno3_mng_typ) doDtl_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_bd_sno4_mng_typ) doDtl_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_purc_act_sub_char1) doDtl_purc_act_sub_char1_LC(info);
		else if (lc == columnDtl_purc_act_sub_char2) doDtl_purc_act_sub_char2_LC(info);
		else if (lc == columnDtl_purc_act_sub_char3) doDtl_purc_act_sub_char3_LC(info);
		else if (lc == columnDtl_purc_act_d_sub_char1) doDtl_purc_act_d_sub_char1_LC(info);
		else if (lc == columnDtl_purc_act_d_sub_char2) doDtl_purc_act_d_sub_char2_LC(info);
		else if (lc == columnDtl_purc_act_d_sub_char3) doDtl_purc_act_d_sub_char3_LC(info);
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
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_purc_upd_cntr) doDtl_purc_upd_cntr_LC(info);
		else if (lc == columnDtl_purc_ret_upd_cntr) doDtl_purc_ret_upd_cntr_LC(info);
		else if (lc == columnDtl_xrate_base_dt) doDtl_xrate_base_dt_LC(info);
		else if (lc == columnDtl_tax_base_dt) doDtl_tax_base_dt_LC(info);
		else if (lc == columnDtl_purc_ret_dt) doDtl_purc_ret_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[purc_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_itm_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_d_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_arr_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[edi_bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_edi_bp_dlv_slip_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_intr_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [UpriReq]パネルの[upri_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doUpriReq_upri_dt_LC(MCEventInfo info){
	}

	/**
	 * [XrateReq]パネルの[xrate_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doXrateReq_xrate_dt_LC(MCEventInfo info){
	}

	/**
	 * [TaxReq]パネルの[tax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTaxReq_tax_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_hm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rnd_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[po_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_rqst_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_rqst_hm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ptax_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ptax_dt_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_to_loc_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_cd_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ret_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_sppl_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_tax_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sbst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sbst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_src_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcpt_iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcpt_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dscnt_loc_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dscnt_loc_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[purc_act_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_act_d_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_act_d_sub_char3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xrate_base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xrate_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tax_base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tax_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ret_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ret_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_asppl_cd]の作成メソッド
	 */
	public MCList getCnd_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
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
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_itm_cd]の作成メソッド
	 */
	public MCList getCnd_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_src_typ]の作成メソッド
	 */
	public MCList getCnd_purc_src_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcSrcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tax_cd]の作成メソッド
	 */
	public MCList getCnd_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
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
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cur_upri_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_base_cur_cd]の作成メソッド
	 */
	public MCList getDtl_base_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ptax_cur_cd]の作成メソッド
	 */
	public MCList getDtl_ptax_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_tterm_cd1]の作成メソッド
	 */
	public MCList getDtl_tterm_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_tterm_cd2]の作成メソッド
	 */
	public MCList getDtl_tterm_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_tterm_cd3]の作成メソッド
	 */
	public MCList getDtl_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info){
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
		if (id.equals("MS.MSBDL0190.Srch01")) {
			return new MS_MSBDL0190_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0190.Upd01")) {
			return new MS_MSBDL0190_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0190.Sprt01")) {
			return new MS_MSBDL0190_Sprt01Bridge();
		}
		if (id.equals("MS.MSBDL0190.Sprt02")) {
			return new MS_MSBDL0190_Sprt02Bridge();
		}
		if (id.equals("MS.MSBDL0190.Sprt03")) {
			return new MS_MSBDL0190_Sprt03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0190_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0190_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0190_Srch01Bridge() {
			p_MS_MSBDL0190_Srch01 = new MCParam(PDef.MS_MSBDL0190_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0190_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0190.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));

			p_MS_MSBDL0190_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0190_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0190_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0190_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0190_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0190.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0190.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0190_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0190_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)p_MS_MSBDL0190_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0190_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0190_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0190_Upd01Bridge() {
			p_MS_MSBDL0190_Upd01 = new MCParam(PDef.MS_MSBDL0190_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0190_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
			param.addUpBlock(mcframe.clientMSBD.MSBDP0190.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));

			p_MS_MSBDL0190_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0190_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0190_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBDL0190_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0190_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0190_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)up(0);
		}
		protected mcframe.clientMSBD.MSBDP0190.BtnR up1() {
			return (mcframe.clientMSBD.MSBDP0190.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0190_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0190_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)p_MS_MSBDL0190_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0190_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0190_Sprt01;

		/** コンストラクタ */
		protected MS_MSBDL0190_Sprt01Bridge() {
			p_MS_MSBDL0190_Sprt01 = new MCParam(PDef.MS_MSBDL0190_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0190_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));

			p_MS_MSBDL0190_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0190_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0190_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0190_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0190_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0190_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0190_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)p_MS_MSBDL0190_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0190_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0190_Sprt02;

		/** コンストラクタ */
		protected MS_MSBDL0190_Sprt02Bridge() {
			p_MS_MSBDL0190_Sprt02 = new MCParam(PDef.MS_MSBDL0190_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0190_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));

			p_MS_MSBDL0190_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0190_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0190_Sprt02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0190_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0190_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0190_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0190_Sprt02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)p_MS_MSBDL0190_Sprt02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBDL0190_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0190_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0190_Sprt03;

		/** コンストラクタ */
		protected MS_MSBDL0190_Sprt03Bridge() {
			p_MS_MSBDL0190_Sprt03 = new MCParam(PDef.MS_MSBDL0190_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0190_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));

			p_MS_MSBDL0190_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0190_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0190_Sprt03.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0190_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0190_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0190.DtlR> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0190_Sprt03.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0190.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0190_Sprt03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBD.MSBDP0190.DtlR>)p_MS_MSBDL0190_Sprt03.getContainerParam().getDownBlock(0));
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